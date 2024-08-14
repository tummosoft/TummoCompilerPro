B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private MainForm As Form
	Private xui As XUI
	Private txtJavaPath As TextField
	Private txtProjectPath As TextField
	Private txtPreview As TextArea
	Private btJavaFolder As Button
	Private btJavaProject As Button
	Dim mapConfig As Map
	Private btComplier As Button
	Dim code As StringBuilder
	Private cboProducts As ComboBox
	Private txtClassName As TextField
	Private btnJava8 As Button
	Private btnBuildDoc As Button
	Private btnDownload As Button
	Private txtPOM As TextArea
	Private txtJDK As TextField
	Private tabCode As TabPane
	Private webCode As WebView
	Private menuTop As MenuBar
	Private Button1 As Button
End Sub

Sub AppStart (Form1 As Form, Args() As String)
	
	MainForm = Form1
			
	MainForm.Stylesheets.Add(File.GetUri(File.DirAssets, "dracula.css"))
	MainForm.RootPane.LoadLayout("frmProjects")
	MainForm.WindowWidth = 880
	MainForm.WindowHeight = 760
	MainForm.Show
		
	MainForm.Icon = fx.LoadImage(File.DirAssets, "icons8-build-64.png")
	
	Dim html As String = File.Combine(File.DirApp & "\ace-builds", "editor.html")
	
	tabCode.LoadLayout("layout_code", "MyClass.java")
		
		
	webCode.LoadUrl("file:///" & html)
	'LoadForm
End Sub

Sub LoadForm()
	Dim txtcode As B4XView = txtPreview
	txtcode.TextColor = xui.Color_RGB(55,227,75)
	Dim txtcode2 As B4XView = txtPOM
	txtcode2.TextColor = xui.Color_RGB(93,34,202)
	
	If File.Exists(File.DirApp, "config.ini") Then
		Dim mapConfig As Map = File.ReadMap(File.DirApp, "config.ini")
		txtJavaPath.Text = mapConfig.Get("javac")
		txtProjectPath.Text = mapConfig.Get("project")
		txtClassName.Text = mapConfig.Get("libname")
		txtJDK.Text = mapConfig.Get("java8")
	Else
		mapConfig.Initialize
	End If
		
	code.Initialize
	cboProducts.Items.Add("B4A")
	cboProducts.Items.Add("B4J")
	cboProducts.Items.Add("B4i (coming soon)")
	cboProducts.Items.Add("B4R (coming soon)")
	
	cboProducts.Value = cboProducts.Items.Get(0)
	
	B4AManifest.Init
End Sub

Private Sub btJavaFolder_Click
	Dim jct As DirectoryChooser
	jct.Initialize
	jct.InitialDirectory = File.DirApp
	
	txtJavaPath.Text = jct.Show(MainForm)
	
	AddMap("javac", txtJavaPath.Text)
		
End Sub

Private Sub btJavaProject_Click
	Dim jct As DirectoryChooser
	jct.Initialize
	jct.InitialDirectory = File.DirApp
	
	txtProjectPath.Text = jct.Show(MainForm)
	
	AddMap("project", txtProjectPath.Text)
	
End Sub

Sub AddMap(key As String, value As String)
	If mapConfig.ContainsKey(key) = False Then
		mapConfig.Put(key, value)
	Else
		mapConfig.Remove(key)
		mapConfig.Put(key, value)
	End If
	File.WriteMap(File.DirApp, "config.ini", mapConfig)
End Sub

Sub BuildJar()

	Dim pc As String = File.Combine(File.DirApp & "\ant\bin", "ant.bat")
	Private shl As Shell
	Private params As List
	params.Initialize
	params.Add("-f")
	params.Add(txtProjectPath.Text & "\build.xml")
	shl.Initialize("shl",pc,params)
	'shl.WorkingDirectory =  "C:\Windows\system32"
	
	shl.Run(-1)
  
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		code.Append(StdOut).Append(CRLF)
		txtPreview.Text = code.ToString

	Else
		code.Append(StdErr).Append(CRLF)
		txtPreview.Text = code.ToString
	End If
  
End Sub

Sub CreateDoclet(libname As String)
	code.Append("Creating doclet...").Append(CRLF)
	
	Private shl As Shell
	B4AManifest.DOCletXML(txtProjectPath.Text, txtClassName.Text, File.DirApp, txtJDK.Text)
	B4AManifest.CreateBat(txtJDK.Text, txtProjectPath.Text)
	
	Dim pc As String = File.Combine(File.DirApp & "\ant\bin", "antjava8.bat")
	Private shl As Shell
	Private params As List
	params.Initialize
	params.Add("-f")
	params.Add(txtProjectPath.Text & "\doc.xml")
		
	shl.Initialize("shl",pc,params)
		
	shl.Run(-1)
  
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		code.Append(StdOut).Append(CRLF)
		txtPreview.Text = code.ToString

	Else
		code.Append(StdErr).Append(CRLF)
		txtPreview.Text = code.ToString
	End If
End Sub


Private Sub btComplier_Click
	B4AManifest.Init
	B4AManifest.BuildJAR(txtClassName.Text, txtProjectPath.Text, txtJDK.Text)
	Sleep(100)
	BuildJar
	Sleep(100)
	
End Sub

Sub shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		code.Append(StdOut).Append(CRLF)
		txtPreview.Text = StdOut
		
	Else
		code.Append(StdErr).Append(CRLF)
		txtPreview.Text = StdErr
	End If
	
	
End Sub

Private Sub txtClassName_TextChanged (Old As String, New As String)
	AddMap("libname", New)
End Sub

Private Sub btnJava8_Click
	Dim jct As DirectoryChooser
	jct.Initialize
	jct.InitialDirectory = File.DirApp
	
	txtJDK.Text = jct.Show(MainForm)
	
	AddMap("java8", txtJDK.Text)
End Sub

Private Sub btnBuildDoc_Click
	ManifestRender.Init
	
	Sleep(100)
	CreateDoclet(txtClassName.Text)
End Sub

Private Sub btnDownload_Click
	Dim arr() As String = Regex.Split("\n", txtPOM.Text)
	
	ManifestRender.DownloadLibs(txtProjectPath.Text, File.DirApp & "/ant", arr)
	
	Dim pc As String = File.Combine(File.DirApp & "\ant\bin", "ant.bat")
	Private shl As Shell
	Private params As List
	params.Initialize
	params.Add("-f")
	params.Add(txtProjectPath.Text & "\download.xml")
	shl.Initialize("shl",pc,params)
	'shl.WorkingDirectory =  "C:\Windows\system32"
	
	shl.Run(-1)
  
	Wait For shl_ProcessCompleted (Success As Boolean, ExitCode As Int, StdOut As String, StdErr As String)
	If Success And ExitCode = 0 Then
		code.Append(StdOut).Append(CRLF)
		txtPreview.Text = code.ToString

	Else
		code.Append(StdErr).Append(CRLF)
		txtPreview.Text = code.ToString
	End If
	
	
End Sub

Private Sub menuTop_Action
	
End Sub

Private Sub Button1_Click
	Dim b4j As BuildB4J
	b4j.Initialize
	b4j.AppStart()
End Sub