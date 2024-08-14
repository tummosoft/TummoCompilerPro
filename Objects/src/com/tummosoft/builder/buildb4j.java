package com.tummosoft.builder;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class buildb4j extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("com.tummosoft.builder", "com.tummosoft.builder.buildb4j", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", com.tummosoft.builder.buildb4j.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _mainform = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _button1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtjavapath = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtprojectpath = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtpreview = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btjavafolder = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btjavaproject = null;
public anywheresoftware.b4a.objects.collections.Map _mapconfig = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btcomplier = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _code = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cboproducts = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtclassname = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btpomxml = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnjava8 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtjava8 = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnbuilddoc = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btndownload = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _txtpom = null;
public com.tummosoft.builder.main _main = null;
public com.tummosoft.builder.manifestrender _manifestrender = null;
public com.tummosoft.builder.testfirstlib _testfirstlib = null;
public com.tummosoft.builder.b4amanifest _b4amanifest = null;
public com.tummosoft.builder.buildb4a _buildb4a = null;
public String  _addmap(com.tummosoft.builder.buildb4j __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "addmap", false))
	 {return ((String) Debug.delegate(ba, "addmap", new Object[] {_key,_value}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub AddMap(key As String, value As String)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If mapConfig.ContainsKey(key) = False Then";
if (__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="mapConfig.Put(key, value)";
__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_value));
 }else {
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="mapConfig.Remove(key)";
__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_key));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="mapConfig.Put(key, value)";
__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_value));
 };
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="File.WriteMap(File.DirApp, \"config.ini\", mapConfi";
__c.File.WriteMap(__c.File.getDirApp(),"config.ini",__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="End Sub";
return "";
}
public String  _appstart(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub AppStart ()";
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .getStylesheets().Add((Object)(__c.File.GetUri(__c.File.getDirAssets(),"dracula.css")));
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"Layout1");
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="MainForm.WindowWidth = 880";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .setWindowWidth(880);
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="MainForm.WindowHeight = 760";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(760);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="MainForm.Show";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(__c.File.getDirAssets(),"icons8-build-64.png").getObject()));
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="End Sub";
return "";
}
public void  _btcomplier_click(com.tummosoft.builder.buildb4j __ref) throws Exception{
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "btcomplier_click", false))
	 {Debug.delegate(ba, "btcomplier_click", null); return;}
ResumableSub_btComplier_Click rsub = new ResumableSub_btComplier_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btComplier_Click extends BA.ResumableSub {
public ResumableSub_btComplier_Click(com.tummosoft.builder.buildb4j parent,com.tummosoft.builder.buildb4j __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.tummosoft.builder.buildb4j __ref;
com.tummosoft.builder.buildb4j parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4j";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="ManifestRender.Init";
parent._manifestrender._init /*String*/ ();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="ManifestRender.BuildJAR(txtClassName.Text, txtPro";
parent._manifestrender._buildjar /*String*/ (__ref._txtclassname /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4j", "btcomplier_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="BuildJar";
__ref._buildjar /*void*/ (null);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4j", "btcomplier_click"),(int) (100));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _buildjar(com.tummosoft.builder.buildb4j __ref) throws Exception{
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "buildjar", false))
	 {Debug.delegate(ba, "buildjar", null); return;}
ResumableSub_BuildJar rsub = new ResumableSub_BuildJar(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_BuildJar extends BA.ResumableSub {
public ResumableSub_BuildJar(com.tummosoft.builder.buildb4j parent,com.tummosoft.builder.buildb4j __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.tummosoft.builder.buildb4j __ref;
com.tummosoft.builder.buildb4j parent;
String _pc = "";
anywheresoftware.b4j.objects.Shell _shl = null;
anywheresoftware.b4a.objects.collections.List _params = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4j";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = parent.__c.File.Combine(parent.__c.File.getDirApp()+"\\ant\\bin","ant.bat");
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="params.Add(txtProjectPath.Text & \"\\build.xml\")";
_params.Add((Object)(__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+"\\build.xml"));
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4j", "buildjar"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="If Success And ExitCode = 0 Then";
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
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="code.Append(StdOut).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stdout).Append(parent.__c.CRLF);
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="txtPreview.Text = code.ToString";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="code.Append(StdErr).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stderr).Append(parent.__c.CRLF);
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="txtPreview.Text = code.ToString";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btjavafolder_click(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "btjavafolder_click", false))
	 {return ((String) Debug.delegate(ba, "btjavafolder_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub btJavaFolder_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(__c.File.getDirApp());
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="txtJavaPath.Text = jct.Show(MainForm)";
__ref._txtjavapath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_jct.Show(__ref._mainform /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="AddMap(\"javac\", txtJavaPath.Text)";
__ref._addmap /*String*/ (null,"javac",__ref._txtjavapath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="End Sub";
return "";
}
public String  _btjavaproject_click(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "btjavaproject_click", false))
	 {return ((String) Debug.delegate(ba, "btjavaproject_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub btJavaProject_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(__c.File.getDirApp());
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="txtProjectPath.Text = jct.Show(MainForm)";
__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_jct.Show(__ref._mainform /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="AddMap(\"project\", txtProjectPath.Text)";
__ref._addmap /*String*/ (null,"project",__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="End Sub";
return "";
}
public void  _btnbuilddoc_click(com.tummosoft.builder.buildb4j __ref) throws Exception{
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "btnbuilddoc_click", false))
	 {Debug.delegate(ba, "btnbuilddoc_click", null); return;}
ResumableSub_btnBuildDoc_Click rsub = new ResumableSub_btnBuildDoc_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuildDoc_Click extends BA.ResumableSub {
public ResumableSub_btnBuildDoc_Click(com.tummosoft.builder.buildb4j parent,com.tummosoft.builder.buildb4j __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.tummosoft.builder.buildb4j __ref;
com.tummosoft.builder.buildb4j parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="buildb4j";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="ManifestRender.Init";
parent._manifestrender._init /*String*/ ();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4j", "btnbuilddoc_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="CreateDoclet(txtClassName.Text)";
__ref._createdoclet /*void*/ (null,__ref._txtclassname /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createdoclet(com.tummosoft.builder.buildb4j __ref,String _libname) throws Exception{
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "createdoclet", false))
	 {Debug.delegate(ba, "createdoclet", new Object[] {_libname}); return;}
ResumableSub_CreateDoclet rsub = new ResumableSub_CreateDoclet(this,__ref,_libname);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateDoclet extends BA.ResumableSub {
public ResumableSub_CreateDoclet(com.tummosoft.builder.buildb4j parent,com.tummosoft.builder.buildb4j __ref,String _libname) {
this.parent = parent;
this.__ref = __ref;
this._libname = _libname;
this.__ref = parent;
}
com.tummosoft.builder.buildb4j __ref;
com.tummosoft.builder.buildb4j parent;
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
RDebugUtils.currentModule="buildb4j";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="code.Append(\"Creating doclet...\").Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append("Creating doclet...").Append(parent.__c.CRLF);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="ManifestRender.DOCletXML(txtProjectPath.Text, txt";
parent._manifestrender._docletxml /*String*/ (__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtclassname /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),parent.__c.File.getDirApp(),__ref._txtjava8 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="ManifestRender.CreateBat(txtJava8.Text, txtProjec";
parent._manifestrender._createbat /*String*/ (__ref._txtjava8 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = parent.__c.File.Combine(parent.__c.File.getDirApp()+"\\ant\\bin","antjava8.bat");
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="params.Add(txtProjectPath.Text & \"\\doc.xml\")";
_params.Add((Object)(__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+"\\doc.xml"));
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4j", "createdoclet"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=2228243;
 //BA.debugLineNum = 2228243;BA.debugLine="If Success And ExitCode = 0 Then";
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
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="code.Append(StdOut).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stdout).Append(parent.__c.CRLF);
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="txtPreview.Text = code.ToString";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2228248;
 //BA.debugLineNum = 2228248;BA.debugLine="code.Append(StdErr).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stderr).Append(parent.__c.CRLF);
RDebugUtils.currentLine=2228249;
 //BA.debugLineNum = 2228249;BA.debugLine="txtPreview.Text = code.ToString";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2228251;
 //BA.debugLineNum = 2228251;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btndownload_click(com.tummosoft.builder.buildb4j __ref) throws Exception{
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "btndownload_click", false))
	 {Debug.delegate(ba, "btndownload_click", null); return;}
ResumableSub_btnDownload_Click rsub = new ResumableSub_btnDownload_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDownload_Click extends BA.ResumableSub {
public ResumableSub_btnDownload_Click(com.tummosoft.builder.buildb4j parent,com.tummosoft.builder.buildb4j __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.tummosoft.builder.buildb4j __ref;
com.tummosoft.builder.buildb4j parent;
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
RDebugUtils.currentModule="buildb4j";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim arr() As String = Regex.Split(\"\\n\", txtPOM.Te";
_arr = parent.__c.Regex.Split("\\n",__ref._txtpom /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .getText());
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="ManifestRender.DownloadLibs(txtProjectPath.Text,";
parent._manifestrender._downloadlibs /*String*/ (__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),parent.__c.File.getDirApp()+"/ant",_arr);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
_pc = parent.__c.File.Combine(parent.__c.File.getDirApp()+"\\ant\\bin","ant.bat");
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Private shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Private params As List";
_params = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="params.Add(\"-f\")";
_params.Add((Object)("-f"));
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="params.Add(txtProjectPath.Text & \"\\download.xml\")";
_params.Add((Object)(__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+"\\download.xml"));
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
_shl.Initialize("shl",_pc,_params);
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "buildb4j", "btndownload_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="If Success And ExitCode = 0 Then";
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
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="code.Append(StdOut).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stdout).Append(parent.__c.CRLF);
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="txtPreview.Text = code.ToString";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="code.Append(StdErr).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stderr).Append(parent.__c.CRLF);
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="txtPreview.Text = code.ToString";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString());
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnjava8_click(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "btnjava8_click", false))
	 {return ((String) Debug.delegate(ba, "btnjava8_click", null));}
anywheresoftware.b4j.objects.DirectoryChooserWrapper _jct = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub btnJava8_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim jct As DirectoryChooser";
_jct = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="jct.Initialize";
_jct.Initialize();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="jct.InitialDirectory = File.DirApp";
_jct.setInitialDirectory(__c.File.getDirApp());
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="txtJava8.Text = jct.Show(MainForm)";
__ref._txtjava8 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_jct.Show(__ref._mainform /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="AddMap(\"java8\", txtJava8.Text)";
__ref._addmap /*String*/ (null,"java8",__ref._txtjava8 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Private Button1 As B4XView";
_button1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Private txtJavaPath As TextField";
_txtjavapath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Private txtProjectPath As TextField";
_txtprojectpath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Private txtPreview As TextArea";
_txtpreview = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Private btJavaFolder As Button";
_btjavafolder = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Private btJavaProject As Button";
_btjavaproject = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Dim mapConfig As Map";
_mapconfig = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Private btComplier As Button";
_btcomplier = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="Dim code As StringBuilder";
_code = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="Private cboProducts As ComboBox";
_cboproducts = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="Private txtClassName As TextField";
_txtclassname = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="Private btpomxml As Button";
_btpomxml = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="Private btnJava8 As Button";
_btnjava8 = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="Private txtJava8 As TextField";
_txtjava8 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Private btnBuildDoc As Button";
_btnbuilddoc = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="Private btnDownload As Button";
_btndownload = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="Private txtPOM As TextArea";
_txtpom = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.tummosoft.builder.buildb4j __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="MainForm.Initialize(\"\", 880,760)";
__ref._mainform /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"",880,760);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="mapConfig.Initialize";
__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="code.Initialize";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="End Sub";
return "";
}
public String  _loadform(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "loadform", false))
	 {return ((String) Debug.delegate(ba, "loadform", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _txtcode = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtcode2 = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub LoadForm()";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim txtcode As B4XView = txtPreview";
_txtcode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtcode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .getObject()));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="txtcode.TextColor = xui.Color_RGB(55,227,75)";
_txtcode.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (55),(int) (227),(int) (75)));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim txtcode2 As B4XView = txtPOM";
_txtcode2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtcode2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtpom /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .getObject()));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="txtcode2.TextColor = xui.Color_RGB(93,34,202)";
_txtcode2.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (93),(int) (34),(int) (202)));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="If File.Exists(File.DirApp, \"config.ini\") Then";
if (__c.File.Exists(__c.File.getDirApp(),"config.ini")) { 
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim mapConfig As Map = File.ReadMap(File.DirApp,";
_mapconfig = new anywheresoftware.b4a.objects.collections.Map();
_mapconfig = __c.File.ReadMap(__c.File.getDirApp(),"config.ini");
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="txtJavaPath.Text = mapConfig.Get(\"javac\")";
__ref._txtjavapath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("javac"))));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="txtProjectPath.Text = mapConfig.Get(\"project\")";
__ref._txtprojectpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("project"))));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="txtClassName.Text = mapConfig.Get(\"libname\")";
__ref._txtclassname /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("libname"))));
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="txtJava8.Text = mapConfig.Get(\"java8\")";
__ref._txtjava8 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("java8"))));
 }else {
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="mapConfig.Initialize";
__ref._mapconfig /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="code.Initialize";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="cboProducts.Items.Add(\"B4J\")";
__ref._cboproducts /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)("B4J"));
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="cboProducts.Items.Add(\"B4A (coming soon)\")";
__ref._cboproducts /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)("B4A (coming soon)"));
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="cboProducts.Items.Add(\"B4i (coming soon)\")";
__ref._cboproducts /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)("B4i (coming soon)"));
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="cboProducts.Items.Add(\"B4R (coming soon)\")";
__ref._cboproducts /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)("B4R (coming soon)"));
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="cboProducts.Value = cboProducts.Items.Get(0)";
__ref._cboproducts /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(__ref._cboproducts /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Get((int) (0)));
RDebugUtils.currentLine=1900569;
 //BA.debugLineNum = 1900569;BA.debugLine="End Sub";
return "";
}
public String  _process_globals(com.tummosoft.builder.buildb4j __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "process_globals", false))
	 {return ((String) Debug.delegate(ba, "process_globals", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Process_Globals";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _shl_processcompleted(com.tummosoft.builder.buildb4j __ref,boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "shl_processcompleted", false))
	 {return ((String) Debug.delegate(ba, "shl_processcompleted", new Object[] {_success,_exitcode,_stdout,_stderr}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="code.Append(StdOut).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stdout).Append(__c.CRLF);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="txtPreview.Text = StdOut";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(_stdout);
 }else {
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="code.Append(StdErr).Append(CRLF)";
__ref._code /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_stderr).Append(__c.CRLF);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="txtPreview.Text = StdErr";
__ref._txtpreview /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(_stderr);
 };
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="End Sub";
return "";
}
public String  _txtclassname_textchanged(com.tummosoft.builder.buildb4j __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="buildb4j";
if (Debug.shouldDelegate(ba, "txtclassname_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtclassname_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub txtClassName_TextChanged (Old As Strin";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="AddMap(\"libname\", New)";
__ref._addmap /*String*/ (null,"libname",_new);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
}