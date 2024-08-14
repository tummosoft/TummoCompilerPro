package com.tummosoft.builder;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("com.tummosoft.builder", "com.tummosoft.builder.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("com.tummosoft.builder", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "com.tummosoft.builder.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _button1 = null;
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
public static anywheresoftware.b4j.objects.ButtonWrapper _btpomxml = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnjava8 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtjava8 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnbuilddoc = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btndownload = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtpom = null;
public static com.tummosoft.builder.manifestrender _manifestrender = null;
public static com.tummosoft.builder.testfirstlib _testfirstlib = null;
public static com.tummosoft.builder.b4amanifest _b4amanifest = null;
public static com.tummosoft.builder.buildb4a _buildb4a = null;
public static String  _addmap(String _key,String _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "addmap", false))
	 {return ((String) Debug.delegate(ba, "addmap", new Object[] {_key,_value}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub AddMap(key As String, value As String)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If mapConfig.ContainsKey(key) = False Then";
if (_mapconfig.ContainsKey((Object)(_key))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="mapConfig.Put(key, value)";
_mapconfig.Put((Object)(_key),(Object)(_value));
 }else {
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="mapConfig.Remove(key)";
_mapconfig.Remove((Object)(_key));
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="mapConfig.Put(key, value)";
_mapconfig.Put((Object)(_key),(Object)(_value));
 };
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="File.WriteMap(File.DirApp, \"config.ini\", mapConfi";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.ini",_mapconfig);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
_mainform.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cupertino-dark.css")));
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.WindowWidth = 880";
_mainform.setWindowWidth(880);
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="MainForm.WindowHeight = 760";
_mainform.setWindowHeight(760);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icons8-build-64.png").getObject()));
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="LoadForm";
_loadform();
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="End Sub";
return "";
}
public static String  _loadform() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "loadform", false))
	 {return ((String) Debug.delegate(ba, "loadform", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _txtcode = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtcode2 = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub LoadForm()";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim txtcode As B4XView = txtPreview";
_txtcode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtcode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtpreview.getObject()));
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="txtcode.TextColor = xui.Color_RGB(55,227,75)";
_txtcode.setTextColor(_xui.Color_RGB((int) (55),(int) (227),(int) (75)));
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Dim txtcode2 As B4XView = txtPOM";
_txtcode2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtcode2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_txtpom.getObject()));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="txtcode2.TextColor = xui.Color_RGB(93,34,202)";
_txtcode2.setTextColor(_xui.Color_RGB((int) (93),(int) (34),(int) (202)));
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="If File.Exists(File.DirApp, \"config.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.ini")) { 
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Dim mapConfig As Map = File.ReadMap(File.DirApp,";
_mapconfig = new anywheresoftware.b4a.objects.collections.Map();
_mapconfig = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"config.ini");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="txtJavaPath.Text = mapConfig.Get(\"javac\")";
_txtjavapath.setText(BA.ObjectToString(_mapconfig.Get((Object)("javac"))));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="txtProjectPath.Text = mapConfig.Get(\"project\")";
_txtprojectpath.setText(BA.ObjectToString(_mapconfig.Get((Object)("project"))));
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="txtClassName.Text = mapConfig.Get(\"libname\")";
_txtclassname.setText(BA.ObjectToString(_mapconfig.Get((Object)("libname"))));
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="txtJava8.Text = mapConfig.Get(\"java8\")";
_txtjava8.setText(BA.ObjectToString(_mapconfig.Get((Object)("java8"))));
 }else {
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="mapConfig.Initialize";
_mapconfig.Initialize();
 };
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="code.Initialize";
_code.Initialize();
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="cboProducts.Items.Add(\"B4J\")";
_cboproducts.getItems().Add((Object)("B4J"));
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="cboProducts.Items.Add(\"B4A (coming soon)\")";
_cboproducts.getItems().Add((Object)("B4A (coming soon)"));
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="cboProducts.Items.Add(\"B4i (coming soon)\")";
_cboproducts.getItems().Add((Object)("B4i (coming soon)"));
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="cboProducts.Items.Add(\"B4R (coming soon)\")";
_cboproducts.getItems().Add((Object)("B4R (coming soon)"));
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="cboProducts.Value = cboProducts.Items.Get(0)";
_cboproducts.setValue(_cboproducts.getItems().Get((int) (0)));
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="End Sub";
return "";
}
public static void  _btcomplier_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btcomplier_click", false))
	 {Debug.delegate(ba, "btcomplier_click", null); return;}
ResumableSub_btComplier_Click rsub = new ResumableSub_btComplier_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btComplier_Click extends BA.ResumableSub {
public ResumableSub_btComplier_Click(com.tummosoft.builder.main parent) {
this.parent = parent;
}
com.tummosoft.builder.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="ManifestRender.Init";
parent._manifestrender._init /*String*/ ();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="ManifestRender.BuildJAR(txtClassName.Text, txtPro";
parent._manifestrender._buildjar /*String*/ (parent._txtclassname.getText(),parent._txtprojectpath.getText());
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btcomplier_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="BuildJar";
_buildjar();
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btcomplier_click"),(int) (100));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _buildjar() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "buildjar", false))
	 {Debug.delegate(ba, "buildjar", null); return;}
ResumableSub_BuildJar rsub = new ResumableSub_BuildJar(null);
rsub.resume(ba, null);
}
public static class ResumableSub_BuildJar extends BA.ResumableSub {
public ResumableSub_BuildJar(com.tummosoft.builder.main parent) {
this.parent = parent;
}
com.tummosoft.builder.main parent;
String _pc = "";
anywheresoftware.b4j.objects.Shell _shl = null;
anywheresoftware.b4a.objects.collections.List _params = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ant\\bin","ant.bat");
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="params.Add(txtProjectPath.Text & \"\\build.xml\")";
_params.Add((Object)(parent._txtprojectpath.getText()+"\\build.xml"));
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "buildjar"), null);
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
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="If Success And ExitCode = 0 Then";
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
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="code.Append(StdOut).Append(CRLF)";
parent._code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="code.Append(StdErr).Append(CRLF)";
parent._code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btjavafolder_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btjavafolder_click", false))
	 {return ((String) Debug.delegate(ba, "btjavafolder_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub btJavaFolder_Click";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="txtJavaPath.Text = jct.Show(MainForm)";
_txtjavapath.setText(_jct.Show(_mainform));
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="AddMap(\"javac\", txtJavaPath.Text)";
_addmap("javac",_txtjavapath.getText());
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="End Sub";
return "";
}
public static String  _btjavaproject_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btjavaproject_click", false))
	 {return ((String) Debug.delegate(ba, "btjavaproject_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub btJavaProject_Click";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="txtProjectPath.Text = jct.Show(MainForm)";
_txtprojectpath.setText(_jct.Show(_mainform));
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="AddMap(\"project\", txtProjectPath.Text)";
_addmap("project",_txtprojectpath.getText());
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="End Sub";
return "";
}
public static void  _btnbuilddoc_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnbuilddoc_click", false))
	 {Debug.delegate(ba, "btnbuilddoc_click", null); return;}
ResumableSub_btnBuildDoc_Click rsub = new ResumableSub_btnBuildDoc_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuildDoc_Click extends BA.ResumableSub {
public ResumableSub_btnBuildDoc_Click(com.tummosoft.builder.main parent) {
this.parent = parent;
}
com.tummosoft.builder.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="ManifestRender.Init";
parent._manifestrender._init /*String*/ ();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btnbuilddoc_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="CreateDoclet(txtClassName.Text)";
_createdoclet(parent._txtclassname.getText());
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _createdoclet(String _libname) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "createdoclet", false))
	 {Debug.delegate(ba, "createdoclet", new Object[] {_libname}); return;}
ResumableSub_CreateDoclet rsub = new ResumableSub_CreateDoclet(null,_libname);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateDoclet extends BA.ResumableSub {
public ResumableSub_CreateDoclet(com.tummosoft.builder.main parent,String _libname) {
this.parent = parent;
this._libname = _libname;
}
com.tummosoft.builder.main parent;
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
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="code.Append(\"Creating doclet...\").Append(CRLF)";
parent._code.Append("Creating doclet...").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="ManifestRender.DOCletXML(txtProjectPath.Text, txt";
parent._manifestrender._docletxml /*String*/ (parent._txtprojectpath.getText(),parent._txtclassname.getText(),anywheresoftware.b4a.keywords.Common.File.getDirApp(),parent._txtjava8.getText());
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="ManifestRender.CreateBat(txtJava8.Text, txtProjec";
parent._manifestrender._createbat /*String*/ (parent._txtjava8.getText(),parent._txtprojectpath.getText());
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ant\\bin","antjava8.bat");
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="params.Add(txtProjectPath.Text & \"\\doc.xml\")";
_params.Add((Object)(parent._txtprojectpath.getText()+"\\doc.xml"));
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "createdoclet"), null);
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
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="If Success And ExitCode = 0 Then";
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
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="code.Append(StdOut).Append(CRLF)";
parent._code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="code.Append(StdErr).Append(CRLF)";
parent._code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btndownload_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btndownload_click", false))
	 {Debug.delegate(ba, "btndownload_click", null); return;}
ResumableSub_btnDownload_Click rsub = new ResumableSub_btnDownload_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDownload_Click extends BA.ResumableSub {
public ResumableSub_btnDownload_Click(com.tummosoft.builder.main parent) {
this.parent = parent;
}
com.tummosoft.builder.main parent;
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
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim arr() As String = Regex.Split(\"\\n\", txtPOM.Te";
_arr = anywheresoftware.b4a.keywords.Common.Regex.Split("\\n",parent._txtpom.getText());
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="ManifestRender.DownloadLibs(txtProjectPath.Text,";
parent._manifestrender._downloadlibs /*String*/ (parent._txtprojectpath.getText(),anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/ant",_arr);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"\\ant\\bin","ant.bat");
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="params.Add(txtProjectPath.Text & \"\\download.xml\")";
_params.Add((Object)(parent._txtprojectpath.getText()+"\\download.xml"));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "btndownload_click"), null);
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
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="If Success And ExitCode = 0 Then";
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
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="code.Append(StdOut).Append(CRLF)";
parent._code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="code.Append(StdErr).Append(CRLF)";
parent._code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="txtPreview.Text = code.ToString";
parent._txtpreview.setText(parent._code.ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnjava8_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnjava8_click", false))
	 {return ((String) Debug.delegate(ba, "btnjava8_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub btnJava8_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(anywheresoftware.b4a.keywords.Common.File.getDirApp());
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="txtJava8.Text = jct.Show(MainForm)";
_txtjava8.setText(_jct.Show(_mainform));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="AddMap(\"java8\", txtJava8.Text)";
_addmap("java8",_txtjava8.getText());
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
return "";
}
public static String  _shl_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "shl_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "shl_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="code.Append(StdOut).Append(CRLF)";
_code.Append(_stdout).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="txtPreview.Text = StdOut";
_txtpreview.setText(_stdout);
 }else {
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="code.Append(StdErr).Append(CRLF)";
_code.Append(_stderr).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="txtPreview.Text = StdErr";
_txtpreview.setText(_stderr);
 };
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="End Sub";
return "";
}
public static String  _txtclassname_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "txtclassname_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtclassname_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub txtClassName_TextChanged (Old As Strin";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="AddMap(\"libname\", New)";
_addmap("libname",_new);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}