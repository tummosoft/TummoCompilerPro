B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10
@EndOfDesignText@
Sub Class_Globals	
	Private fx As JFX
	Private MainForm As Form
	Private xui As XUI
	Private Button1 As B4XView
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
	Private btpomxml As Button
	Private btnJava8 As Button
	Private txtJava8 As TextField
	Private btnBuildDoc As Button
	Private btnDownload As Button
	Private txtPOM As TextArea
End Sub

'Initializes the object. You can add parameters to this method if needed.
Sub Process_Globals
		
End Sub

Public Sub Initialize
	MainForm.Initialize("", 880,760)
	mapConfig.Initialize
	code.Initialize
End Sub

Public Sub AppStart ()
	
	
	'MainForm.SetFormStyle("UNDECORATED")
		
	MainForm.Stylesheets.Add(File.GetUri(File.DirAssets, "dracula.css"))
	MainForm.RootPane.LoadLayout("Layout1")
	MainForm.WindowWidth = 880
	MainForm.WindowHeight = 760
	MainForm.Show
		
	MainForm.Icon = fx.LoadImage(File.DirAssets, "icons8-build-64.png")
	
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
		txtJava8.Text = mapConfig.Get("java8")
	Else
		mapConfig.Initialize
	End If
		
	code.Initialize
	cboProducts.Items.Add("B4J")
	cboProducts.Items.Add("B4A (coming soon)")
	cboProducts.Items.Add("B4i (coming soon)")
	cboProducts.Items.Add("B4R (coming soon)")
	
	cboProducts.Value = cboProducts.Items.Get(0)
	
	
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
	ManifestRender.DOCletXML(txtProjectPath.Text, txtClassName.Text, File.DirApp, txtJava8.Text)
	ManifestRender.CreateBat(txtJava8.Text, txtProjectPath.Text)
	
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
	ManifestRender.Init
	ManifestRender.BuildJAR(txtClassName.Text, txtProjectPath.Text)
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
	
	txtJava8.Text = jct.Show(MainForm)
	
	AddMap("java8", txtJava8.Text)
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