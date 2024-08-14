package com.tummosoft.builder;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class buildb4a extends Object{
public static buildb4a mostCurrent = new buildb4a();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("com.tummosoft.builder", "com.tummosoft.builder.buildb4a", null);
		ba.loadHtSubs(buildb4a.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "com.tummosoft.builder.buildb4a", ba);
		}
	}
    public static Class<?> getObject() {
		return buildb4a.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtjavapath = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtprojectpath = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtpreview = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btjavafolder = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btjavaproject = null;
public static anywheresoftware.b4a.objects.collections.Map _mapconfig = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btcomplier = null;
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _code = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cboproducts = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtclassname = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnjava8 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnbuilddoc = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btndownload = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtpom = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtjdk = null;
public static anywheresoftware.b4j.objects.TabPaneWrapper _tabcode = null;
public static anywheresoftware.b4j.objects.WebViewWrapper _webcode = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menutop = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static com.tummosoft.builder.main _main = null;
public static com.tummosoft.builder.manifestrender _manifestrender = null;
public static com.tummosoft.builder.testfirstlib _testfirstlib = null;
public static com.tummosoft.builder.b4amanifest _b4amanifest = null;
public static String  _addmap(String _key,String _value) throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "addmap", false))
	 {return ((String) Debug.delegate(ba, "addmap", new Object[] {_key,_value}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub AddMap(key As String, value As String)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="If mapConfig.ContainsKey(key) = False Then";
if (_mapconfig.ContainsKey((Object)(_key))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="mapConfig.Put(key, value)";
_mapconfig.Put((Object)(_key),(Object)(_value));
 }else {
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="mapConfig.Remove(key)";
_mapconfig.Remove((Object)(_key));
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="mapConfig.Put(key, value)";
_mapconfig.Put((Object)(_key),(Object)(_value));
 };
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="File.WriteMap(File.DirApp, \"config.ini\", mapConfi";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.ini",_mapconfig);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
String _html = "";
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
_mainform.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"dracula.css")));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="MainForm.RootPane.LoadLayout(\"frmProjects\")";
_mainform.getRootPane().LoadLayout(ba,"frmProjects");
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="MainForm.WindowWidth = 880";
_mainform.setWindowWidth(880);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="MainForm.WindowHeight = 760";
_mainform.setWindowHeight(760);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icons8-build-64.png").getObject()));
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Dim html As String = File.Combine(File.DirApp & \"";
_html = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ace-builds","editor.html");
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="tabCode.LoadLayout(\"layout_code\", \"MyClass.java\")";
_tabcode.LoadLayout(ba,"layout_code","MyClass.java");
RDebugUtils.currentLine=3342353;
 //BA.debugLineNum = 3342353;BA.debugLine="webCode.LoadUrl(\"file:///\" & html)";
_webcode.LoadUrl("file:///"+_html);
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="End Sub";
return "";
}
public static void  _btcomplier_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "btcomplier_click", false))
	 {Debug.delegate(ba, "btcomplier_click", null); return;}
ResumableSub_btComplier_Click rsub = new ResumableSub_btComplier_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btComplier_Click extends BA.ResumableSub {
public ResumableSub_btComplier_Click(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
com.tummosoft.builder.buildb4a parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4a";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="B4AManifest.Init";
parent._b4amanifest._init /*String*/ ();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="B4AManifest.BuildJAR(txtClassName.Text, txtProjec";
parent._b4amanifest._buildjar /*String*/ (parent._txtclassname.getText(),parent._txtprojectpath.getText(),parent._txtjdk.getText());
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4a", "btcomplier_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="BuildJar";
_buildjar();
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4a", "btcomplier_click"),(int) (100));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _buildjar() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "buildjar", false))
	 {Debug.delegate(ba, "buildjar", null); return;}
ResumableSub_BuildJar rsub = new ResumableSub_BuildJar(null);
rsub.resume(ba, null);
}
public static class ResumableSub_BuildJar extends BA.ResumableSub {
public ResumableSub_BuildJar(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
com.tummosoft.builder.buildb4a parent;
String _pc = "";
anywheresoftware.b4j.objects.Shell _shl = null;
anywheresoftware.b4a.objects.collections.List _params = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4a";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ant\\bin","ant.bat");
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="params.Add(txtProjectPath.Text & \"\\build.xml\")";
_params.Add((Object)(parent._txtprojectpath.getText()+"\\build.xml"));
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4a", "buildjar"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="If Success And ExitCode = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success && _exitcode==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="code.Append(StdOut).Append(CRLF)";
parent._code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="code.Append(StdErr).Append(CRLF)";
parent._code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btjavafolder_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "btjavafolder_click", false))
	 {return ((String) Debug.delegate(ba, "btjavafolder_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub btJavaFolder_Click";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="txtJavaPath.Text = jct.Show(MainForm)";
_txtjavapath.setText(_jct.Show(_mainform));
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="AddMap(\"javac\", txtJavaPath.Text)";
_addmap("javac",_txtjavapath.getText());
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="End Sub";
return "";
}
public static String  _btjavaproject_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "btjavaproject_click", false))
	 {return ((String) Debug.delegate(ba, "btjavaproject_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub btJavaProject_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="txtProjectPath.Text = jct.Show(MainForm)";
_txtprojectpath.setText(_jct.Show(_mainform));
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="AddMap(\"project\", txtProjectPath.Text)";
_addmap("project",_txtprojectpath.getText());
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="End Sub";
return "";
}
public static void  _btnbuilddoc_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "btnbuilddoc_click", false))
	 {Debug.delegate(ba, "btnbuilddoc_click", null); return;}
ResumableSub_btnBuildDoc_Click rsub = new ResumableSub_btnBuildDoc_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuildDoc_Click extends BA.ResumableSub {
public ResumableSub_btnBuildDoc_Click(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
com.tummosoft.builder.buildb4a parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4a";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="ManifestRender.Init";
parent._manifestrender._init /*String*/ ();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4a", "btnbuilddoc_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="CreateDoclet(txtClassName.Text)";
_createdoclet(parent._txtclassname.getText());
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _createdoclet(String _libname) throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "createdoclet", false))
	 {Debug.delegate(ba, "createdoclet", new Object[] {_libname}); return;}
ResumableSub_CreateDoclet rsub = new ResumableSub_CreateDoclet(null,_libname);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateDoclet extends BA.ResumableSub {
public ResumableSub_CreateDoclet(com.tummosoft.builder.buildb4a parent,String _libname) {
this.parent = parent;
this._libname = _libname;
}
com.tummosoft.builder.buildb4a parent;
String _libname;
anywheresoftware.b4j.objects.Shell _shl = null;
String _pc = "";
anywheresoftware.b4a.objects.collections.List _params = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4a";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="code.Append(\"Creating doclet...\").Append(CRLF)";
parent._code.Append("Creating doclet...").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="B4AManifest.DOCletXML(txtProjectPath.Text, txtCla";
parent._b4amanifest._docletxml /*String*/ (parent._txtprojectpath.getText(),parent._txtclassname.getText(),anywheresoftware.b4a.keywords.Common.File.getDirApp(),parent._txtjdk.getText());
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="B4AManifest.CreateBat(txtJDK.Text, txtProjectPath";
parent._b4amanifest._createbat /*String*/ (parent._txtjdk.getText(),parent._txtprojectpath.getText());
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ant\\bin","antjava8.bat");
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="params.Add(txtProjectPath.Text & \"\\doc.xml\")";
_params.Add((Object)(parent._txtprojectpath.getText()+"\\doc.xml"));
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4a", "createdoclet"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
RDebugUtils.currentLine=3735571;
 //BA.debugLineNum = 3735571;BA.debugLine="If Success And ExitCode = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success && _exitcode==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=3735572;
 //BA.debugLineNum = 3735572;BA.debugLine="code.Append(StdOut).Append(CRLF)";
parent._code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3735573;
 //BA.debugLineNum = 3735573;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3735576;
 //BA.debugLineNum = 3735576;BA.debugLine="code.Append(StdErr).Append(CRLF)";
parent._code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3735577;
 //BA.debugLineNum = 3735577;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3735579;
 //BA.debugLineNum = 3735579;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btndownload_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "btndownload_click", false))
	 {Debug.delegate(ba, "btndownload_click", null); return;}
ResumableSub_btnDownload_Click rsub = new ResumableSub_btnDownload_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDownload_Click extends BA.ResumableSub {
public ResumableSub_btnDownload_Click(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
com.tummosoft.builder.buildb4a parent;
String[] _arr = null;
String _pc = "";
anywheresoftware.b4j.objects.Shell _shl = null;
anywheresoftware.b4a.objects.collections.List _params = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4a";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim arr() As String = Regex.Split(\"\\n\", txtPOM.Te";
_arr = anywheresoftware.b4a.keywords.Common.Regex.Split("\\n",parent._txtpom.getText());
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="ManifestRender.DownloadLibs(txtProjectPath.Text,";
parent._manifestrender._downloadlibs /*String*/ (parent._txtprojectpath.getText(),anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/ant",_arr);
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ant\\bin","ant.bat");
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="params.Add(txtProjectPath.Text & \"\\download.xml\")";
_params.Add((Object)(parent._txtprojectpath.getText()+"\\download.xml"));
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4a", "btndownload_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="If Success And ExitCode = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success && _exitcode==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="code.Append(StdOut).Append(CRLF)";
parent._code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4128790;
 //BA.debugLineNum = 4128790;BA.debugLine="code.Append(StdErr).Append(CRLF)";
parent._code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=4128795;
 //BA.debugLineNum = 4128795;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnjava8_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "btnjava8_click", false))
	 {return ((String) Debug.delegate(ba, "btnjava8_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Private Sub btnJava8_Click";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="txtJDK.Text = jct.Show(MainForm)";
_txtjdk.setText(_jct.Show(_mainform));
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="AddMap(\"java8\", txtJDK.Text)";
_addmap("java8",_txtjdk.getText());
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
com.tummosoft.builder.buildb4j _b4j = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim b4j As BuildB4J";
_b4j = new com.tummosoft.builder.buildb4j();
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="b4j.Initialize";
_b4j._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="b4j.AppStart()";
_b4j._appstart /*String*/ (null);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return "";
}
public static String  _loadform() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "loadform", false))
	 {return ((String) Debug.delegate(ba, "loadform", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _txtcode = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtcode2 = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub LoadForm()";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim txtcode As B4XView = txtPreview";
_txtcode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtcode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtpreview.getObject()));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="txtcode.TextColor = xui.Color_RGB(55,227,75)";
_txtcode.setTextColor(_xui.Color_RGB((int) (55),(int) (227),(int) (75)));
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Dim txtcode2 As B4XView = txtPOM";
_txtcode2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtcode2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtpom.getObject()));
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="txtcode2.TextColor = xui.Color_RGB(93,34,202)";
_txtcode2.setTextColor(_xui.Color_RGB((int) (93),(int) (34),(int) (202)));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="If File.Exists(File.DirApp, \"config.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.ini")) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Dim mapConfig As Map = File.ReadMap(File.DirApp,";
_mapconfig = new anywheresoftware.b4a.objects.collections.Map();
_mapconfig = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.ini");
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="txtJavaPath.Text = mapConfig.Get(\"javac\")";
_txtjavapath.setText(BA.ObjectToString(_mapconfig.Get((Object)("javac"))));
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="txtProjectPath.Text = mapConfig.Get(\"project\")";
_txtprojectpath.setText(BA.ObjectToString(_mapconfig.Get((Object)("project"))));
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="txtClassName.Text = mapConfig.Get(\"libname\")";
_txtclassname.setText(BA.ObjectToString(_mapconfig.Get((Object)("libname"))));
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="txtJDK.Text = mapConfig.Get(\"java8\")";
_txtjdk.setText(BA.ObjectToString(_mapconfig.Get((Object)("java8"))));
 }else {
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="mapConfig.Initialize";
_mapconfig.Initialize();
 };
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="code.Initialize";
_code.Initialize();
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="cboProducts.Items.Add(\"B4A\")";
_cboproducts.getItems().Add((Object)("B4A"));
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="cboProducts.Items.Add(\"B4J\")";
_cboproducts.getItems().Add((Object)("B4J"));
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="cboProducts.Items.Add(\"B4i (coming soon)\")";
_cboproducts.getItems().Add((Object)("B4i (coming soon)"));
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="cboProducts.Items.Add(\"B4R (coming soon)\")";
_cboproducts.getItems().Add((Object)("B4R (coming soon)"));
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="cboProducts.Value = cboProducts.Items.Get(0)";
_cboproducts.setValue(_cboproducts.getItems().Get((int) (0)));
RDebugUtils.currentLine=3407896;
 //BA.debugLineNum = 3407896;BA.debugLine="B4AManifest.Init";
_b4amanifest._init /*String*/ ();
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="End Sub";
return "";
}
public static String  _menutop_action() throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "menutop_action", false))
	 {return ((String) Debug.delegate(ba, "menutop_action", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Private Sub menuTop_Action";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public static String  _shl_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "shl_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "shl_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="code.Append(StdOut).Append(CRLF)";
_code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="txtPreview.Text = StdOut";
_txtpreview.setText(_stdout);
 }else {
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="code.Append(StdErr).Append(CRLF)";
_code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="txtPreview.Text = StdErr";
_txtpreview.setText(_stderr);
 };
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="End Sub";
return "";
}
public static String  _txtclassname_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="buildb4a";
if (Debug.shouldDelegate(ba, "txtclassname_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtclassname_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Private Sub txtClassName_TextChanged (Old As Strin";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="AddMap(\"libname\", New)";
_addmap("libname",_new);
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return "";
}
}