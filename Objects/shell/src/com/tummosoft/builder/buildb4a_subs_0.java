package com.tummosoft.builder;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class buildb4a_subs_0 {


public static RemoteObject  _addmap(RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddMap (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,97);
if (RapidSub.canDelegate("addmap")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","addmap", _key, _value);}
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
 BA.debugLineNum = 97;BA.debugLine="Sub AddMap(key As String, value As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="If mapConfig.ContainsKey(key) = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",buildb4a._mapconfig.runMethod(true,"ContainsKey",(Object)((_key))),buildb4a.__c.getField(true,"False"))) { 
 BA.debugLineNum = 99;BA.debugLine="mapConfig.Put(key, value)";
Debug.ShouldStop(4);
buildb4a._mapconfig.runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 }else {
 BA.debugLineNum = 101;BA.debugLine="mapConfig.Remove(key)";
Debug.ShouldStop(16);
buildb4a._mapconfig.runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 102;BA.debugLine="mapConfig.Put(key, value)";
Debug.ShouldStop(32);
buildb4a._mapconfig.runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 };
 BA.debugLineNum = 104;BA.debugLine="File.WriteMap(File.DirApp, \"config.ini\", mapConfi";
Debug.ShouldStop(128);
buildb4a.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("config.ini")),(Object)(buildb4a._mapconfig));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,27);
if (RapidSub.canDelegate("appstart")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","appstart", _form1, _args);}
RemoteObject _html = RemoteObject.createImmutable("");
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 27;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(268435456);
buildb4a._mainform = _form1;
 BA.debugLineNum = 31;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
Debug.ShouldStop(1073741824);
buildb4a._mainform.runMethod(false,"getStylesheets").runVoidMethod ("Add",(Object)((buildb4a.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(buildb4a.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("dracula.css"))))));
 BA.debugLineNum = 32;BA.debugLine="MainForm.RootPane.LoadLayout(\"frmProjects\")";
Debug.ShouldStop(-2147483648);
buildb4a._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",buildb4a.ba,(Object)(RemoteObject.createImmutable("frmProjects")));
 BA.debugLineNum = 33;BA.debugLine="MainForm.WindowWidth = 880";
Debug.ShouldStop(1);
buildb4a._mainform.runMethod(true,"setWindowWidth",BA.numberCast(double.class, 880));
 BA.debugLineNum = 34;BA.debugLine="MainForm.WindowHeight = 760";
Debug.ShouldStop(2);
buildb4a._mainform.runMethod(true,"setWindowHeight",BA.numberCast(double.class, 760));
 BA.debugLineNum = 35;BA.debugLine="MainForm.Show";
Debug.ShouldStop(4);
buildb4a._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 37;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
Debug.ShouldStop(16);
buildb4a._mainform.runMethod(false,"setIcon",(buildb4a._fx.runMethod(false,"LoadImage",(Object)(buildb4a.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icons8-build-64.png"))).getObject()));
 BA.debugLineNum = 39;BA.debugLine="Dim html As String = File.Combine(File.DirApp & \"";
Debug.ShouldStop(64);
_html = buildb4a.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ace-builds"))),(Object)(RemoteObject.createImmutable("editor.html")));Debug.locals.put("html", _html);Debug.locals.put("html", _html);
 BA.debugLineNum = 41;BA.debugLine="tabCode.LoadLayout(\"layout_code\", \"MyClass.java\")";
Debug.ShouldStop(256);
buildb4a._tabcode.runMethodAndSync(false,"LoadLayout",buildb4a.ba,(Object)(BA.ObjectToString("layout_code")),(Object)(RemoteObject.createImmutable("MyClass.java")));
 BA.debugLineNum = 44;BA.debugLine="webCode.LoadUrl(\"file:///\" & html)";
Debug.ShouldStop(2048);
buildb4a._webcode.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable("file:///"),_html)));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btcomplier_click() throws Exception{
try {
		Debug.PushSubsStack("btComplier_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,162);
if (RapidSub.canDelegate("btcomplier_click")) { com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","btcomplier_click"); return;}
ResumableSub_btComplier_Click rsub = new ResumableSub_btComplier_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btComplier_Click extends BA.ResumableSub {
public ResumableSub_btComplier_Click(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.buildb4a parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btComplier_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,162);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 163;BA.debugLine="B4AManifest.Init";
Debug.ShouldStop(4);
parent._b4amanifest.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="B4AManifest.BuildJAR(txtClassName.Text, txtProjec";
Debug.ShouldStop(8);
parent._b4amanifest.runVoidMethod ("_buildjar" /*RemoteObject*/ ,(Object)(parent._txtclassname.runMethod(true,"getText")),(Object)(parent._txtprojectpath.runMethod(true,"getText")),(Object)(parent._txtjdk.runMethod(true,"getText")));
 BA.debugLineNum = 165;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",buildb4a.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4a", "btcomplier_click"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 166;BA.debugLine="BuildJar";
Debug.ShouldStop(32);
_buildjar();
 BA.debugLineNum = 167;BA.debugLine="Sleep(100)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("Sleep",buildb4a.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4a", "btcomplier_click"),BA.numberCast(int.class, 100));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btjavafolder_click() throws Exception{
try {
		Debug.PushSubsStack("btJavaFolder_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,75);
if (RapidSub.canDelegate("btjavafolder_click")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","btjavafolder_click");}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 75;BA.debugLine="Private Sub btJavaFolder_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(2048);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 77;BA.debugLine="jct.Initialize";
Debug.ShouldStop(4096);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 78;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(8192);
_jct.runMethod(true,"setInitialDirectory",buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 80;BA.debugLine="txtJavaPath.Text = jct.Show(MainForm)";
Debug.ShouldStop(32768);
buildb4a._txtjavapath.runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(buildb4a._mainform)));
 BA.debugLineNum = 82;BA.debugLine="AddMap(\"javac\", txtJavaPath.Text)";
Debug.ShouldStop(131072);
_addmap(BA.ObjectToString("javac"),buildb4a._txtjavapath.runMethod(true,"getText"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btjavaproject_click() throws Exception{
try {
		Debug.PushSubsStack("btJavaProject_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,86);
if (RapidSub.canDelegate("btjavaproject_click")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","btjavaproject_click");}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 86;BA.debugLine="Private Sub btJavaProject_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(4194304);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 88;BA.debugLine="jct.Initialize";
Debug.ShouldStop(8388608);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(16777216);
_jct.runMethod(true,"setInitialDirectory",buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 91;BA.debugLine="txtProjectPath.Text = jct.Show(MainForm)";
Debug.ShouldStop(67108864);
buildb4a._txtprojectpath.runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(buildb4a._mainform)));
 BA.debugLineNum = 93;BA.debugLine="AddMap(\"project\", txtProjectPath.Text)";
Debug.ShouldStop(268435456);
_addmap(BA.ObjectToString("project"),buildb4a._txtprojectpath.runMethod(true,"getText"));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbuilddoc_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuildDoc_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,198);
if (RapidSub.canDelegate("btnbuilddoc_click")) { com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","btnbuilddoc_click"); return;}
ResumableSub_btnBuildDoc_Click rsub = new ResumableSub_btnBuildDoc_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuildDoc_Click extends BA.ResumableSub {
public ResumableSub_btnBuildDoc_Click(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.buildb4a parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuildDoc_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,198);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 199;BA.debugLine="ManifestRender.Init";
Debug.ShouldStop(64);
parent._manifestrender.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 201;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",buildb4a.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4a", "btnbuilddoc_click"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 202;BA.debugLine="CreateDoclet(txtClassName.Text)";
Debug.ShouldStop(512);
_createdoclet(parent._txtclassname.runMethod(true,"getText"));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btndownload_click() throws Exception{
try {
		Debug.PushSubsStack("btnDownload_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,205);
if (RapidSub.canDelegate("btndownload_click")) { com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","btndownload_click"); return;}
ResumableSub_btnDownload_Click rsub = new ResumableSub_btnDownload_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDownload_Click extends BA.ResumableSub {
public ResumableSub_btnDownload_Click(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.buildb4a parent;
RemoteObject _arr = null;
RemoteObject _pc = RemoteObject.createImmutable("");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDownload_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,205);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 206;BA.debugLine="Dim arr() As String = Regex.Split(\"\\n\", txtPOM.Te";
Debug.ShouldStop(8192);
_arr = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\n")),(Object)(parent._txtpom.runMethod(true,"getText")));Debug.locals.put("arr", _arr);Debug.locals.put("arr", _arr);
 BA.debugLineNum = 208;BA.debugLine="ManifestRender.DownloadLibs(txtProjectPath.Text,";
Debug.ShouldStop(32768);
parent._manifestrender.runVoidMethod ("_downloadlibs" /*RemoteObject*/ ,(Object)(parent._txtprojectpath.runMethod(true,"getText")),(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/ant"))),(Object)(_arr));
 BA.debugLineNum = 210;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(131072);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("ant.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 211;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(262144);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 212;BA.debugLine="Private params As List";
Debug.ShouldStop(524288);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 213;BA.debugLine="params.Initialize";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 214;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 215;BA.debugLine="params.Add(txtProjectPath.Text & \"\\download.xml\")";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(parent._txtprojectpath.runMethod(true,"getText"),RemoteObject.createImmutable("\\download.xml")))));
 BA.debugLineNum = 216;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(8388608);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 219;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(67108864);
_shl.runVoidMethod ("Run",buildb4a.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 221;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", buildb4a.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4a", "btndownload_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 222;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 223;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(1073741824);
parent._code.runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 224;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(-2147483648);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 227;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(4);
parent._code.runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 228;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(8);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnjava8_click() throws Exception{
try {
		Debug.PushSubsStack("btnJava8_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,188);
if (RapidSub.canDelegate("btnjava8_click")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","btnjava8_click");}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 188;BA.debugLine="Private Sub btnJava8_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(268435456);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 190;BA.debugLine="jct.Initialize";
Debug.ShouldStop(536870912);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(1073741824);
_jct.runMethod(true,"setInitialDirectory",buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 193;BA.debugLine="txtJDK.Text = jct.Show(MainForm)";
Debug.ShouldStop(1);
buildb4a._txtjdk.runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(buildb4a._mainform)));
 BA.debugLineNum = 195;BA.debugLine="AddMap(\"java8\", txtJDK.Text)";
Debug.ShouldStop(4);
_addmap(BA.ObjectToString("java8"),buildb4a._txtjdk.runMethod(true,"getText"));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buildjar() throws Exception{
try {
		Debug.PushSubsStack("BuildJar (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,107);
if (RapidSub.canDelegate("buildjar")) { com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","buildjar"); return;}
ResumableSub_BuildJar rsub = new ResumableSub_BuildJar(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BuildJar extends BA.ResumableSub {
public ResumableSub_BuildJar(com.tummosoft.builder.buildb4a parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.buildb4a parent;
RemoteObject _pc = RemoteObject.createImmutable("");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BuildJar (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,107);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 109;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(4096);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("ant.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 110;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(8192);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 111;BA.debugLine="Private params As List";
Debug.ShouldStop(16384);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 112;BA.debugLine="params.Initialize";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 113;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 114;BA.debugLine="params.Add(txtProjectPath.Text & \"\\build.xml\")";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(parent._txtprojectpath.runMethod(true,"getText"),RemoteObject.createImmutable("\\build.xml")))));
 BA.debugLineNum = 115;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(262144);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 118;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(2097152);
_shl.runVoidMethod ("Run",buildb4a.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 120;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", buildb4a.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4a", "buildjar"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 121;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 122;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(33554432);
parent._code.runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 123;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(67108864);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 126;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(536870912);
parent._code.runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 127;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(1073741824);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,238);
if (RapidSub.canDelegate("button1_click")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","button1_click");}
RemoteObject _b4j = RemoteObject.declareNull("com.tummosoft.builder.buildb4j");
 BA.debugLineNum = 238;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="Dim b4j As BuildB4J";
Debug.ShouldStop(16384);
_b4j = RemoteObject.createNew ("com.tummosoft.builder.buildb4j");Debug.locals.put("b4j", _b4j);
 BA.debugLineNum = 240;BA.debugLine="b4j.Initialize";
Debug.ShouldStop(32768);
_b4j.runClassMethod (com.tummosoft.builder.buildb4j.class, "_initialize" /*RemoteObject*/ ,buildb4a.ba);
 BA.debugLineNum = 241;BA.debugLine="b4j.AppStart()";
Debug.ShouldStop(65536);
_b4j.runClassMethod (com.tummosoft.builder.buildb4j.class, "_appstart" /*RemoteObject*/ );
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createdoclet(RemoteObject _libname) throws Exception{
try {
		Debug.PushSubsStack("CreateDoclet (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,132);
if (RapidSub.canDelegate("createdoclet")) { com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","createdoclet", _libname); return;}
ResumableSub_CreateDoclet rsub = new ResumableSub_CreateDoclet(null,_libname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateDoclet extends BA.ResumableSub {
public ResumableSub_CreateDoclet(com.tummosoft.builder.buildb4a parent,RemoteObject _libname) {
this.parent = parent;
this._libname = _libname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.buildb4a parent;
RemoteObject _libname;
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _pc = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateDoclet (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,132);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("libname", _libname);
 BA.debugLineNum = 133;BA.debugLine="code.Append(\"Creating doclet...\").Append(CRLF)";
Debug.ShouldStop(16);
parent._code.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Creating doclet..."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 135;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(64);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 136;BA.debugLine="B4AManifest.DOCletXML(txtProjectPath.Text, txtCla";
Debug.ShouldStop(128);
parent._b4amanifest.runVoidMethod ("_docletxml" /*RemoteObject*/ ,(Object)(parent._txtprojectpath.runMethod(true,"getText")),(Object)(parent._txtclassname.runMethod(true,"getText")),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(parent._txtjdk.runMethod(true,"getText")));
 BA.debugLineNum = 137;BA.debugLine="B4AManifest.CreateBat(txtJDK.Text, txtProjectPath";
Debug.ShouldStop(256);
parent._b4amanifest.runVoidMethod ("_createbat" /*RemoteObject*/ ,(Object)(parent._txtjdk.runMethod(true,"getText")),(Object)(parent._txtprojectpath.runMethod(true,"getText")));
 BA.debugLineNum = 139;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(1024);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("antjava8.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 140;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(2048);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 141;BA.debugLine="Private params As List";
Debug.ShouldStop(4096);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 142;BA.debugLine="params.Initialize";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 143;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 144;BA.debugLine="params.Add(txtProjectPath.Text & \"\\doc.xml\")";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(parent._txtprojectpath.runMethod(true,"getText"),RemoteObject.createImmutable("\\doc.xml")))));
 BA.debugLineNum = 146;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(131072);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 148;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(524288);
_shl.runVoidMethod ("Run",buildb4a.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 150;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", buildb4a.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4a", "createdoclet"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 151;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 152;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(8388608);
parent._code.runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 153;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(16777216);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 156;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(134217728);
parent._code.runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 157;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(268435456);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _loadform() throws Exception{
try {
		Debug.PushSubsStack("LoadForm (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,48);
if (RapidSub.canDelegate("loadform")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","loadform");}
RemoteObject _txtcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtcode2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 48;BA.debugLine="Sub LoadForm()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim txtcode As B4XView = txtPreview";
Debug.ShouldStop(65536);
_txtcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), buildb4a._txtpreview.getObject());Debug.locals.put("txtcode", _txtcode);Debug.locals.put("txtcode", _txtcode);
 BA.debugLineNum = 50;BA.debugLine="txtcode.TextColor = xui.Color_RGB(55,227,75)";
Debug.ShouldStop(131072);
_txtcode.runMethod(true,"setTextColor",buildb4a._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 55)),(Object)(BA.numberCast(int.class, 227)),(Object)(BA.numberCast(int.class, 75))));
 BA.debugLineNum = 51;BA.debugLine="Dim txtcode2 As B4XView = txtPOM";
Debug.ShouldStop(262144);
_txtcode2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtcode2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), buildb4a._txtpom.getObject());Debug.locals.put("txtcode2", _txtcode2);Debug.locals.put("txtcode2", _txtcode2);
 BA.debugLineNum = 52;BA.debugLine="txtcode2.TextColor = xui.Color_RGB(93,34,202)";
Debug.ShouldStop(524288);
_txtcode2.runMethod(true,"setTextColor",buildb4a._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 93)),(Object)(BA.numberCast(int.class, 34)),(Object)(BA.numberCast(int.class, 202))));
 BA.debugLineNum = 54;BA.debugLine="If File.Exists(File.DirApp, \"config.ini\") Then";
Debug.ShouldStop(2097152);
if (buildb4a.__c.getField(false,"File").runMethod(true,"Exists",(Object)(buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="Dim mapConfig As Map = File.ReadMap(File.DirApp,";
Debug.ShouldStop(4194304);
buildb4a._mapconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
buildb4a._mapconfig = buildb4a.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(buildb4a.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.ini")));
 BA.debugLineNum = 56;BA.debugLine="txtJavaPath.Text = mapConfig.Get(\"javac\")";
Debug.ShouldStop(8388608);
buildb4a._txtjavapath.runMethod(true,"setText",BA.ObjectToString(buildb4a._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("javac"))))));
 BA.debugLineNum = 57;BA.debugLine="txtProjectPath.Text = mapConfig.Get(\"project\")";
Debug.ShouldStop(16777216);
buildb4a._txtprojectpath.runMethod(true,"setText",BA.ObjectToString(buildb4a._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))));
 BA.debugLineNum = 58;BA.debugLine="txtClassName.Text = mapConfig.Get(\"libname\")";
Debug.ShouldStop(33554432);
buildb4a._txtclassname.runMethod(true,"setText",BA.ObjectToString(buildb4a._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("libname"))))));
 BA.debugLineNum = 59;BA.debugLine="txtJDK.Text = mapConfig.Get(\"java8\")";
Debug.ShouldStop(67108864);
buildb4a._txtjdk.runMethod(true,"setText",BA.ObjectToString(buildb4a._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("java8"))))));
 }else {
 BA.debugLineNum = 61;BA.debugLine="mapConfig.Initialize";
Debug.ShouldStop(268435456);
buildb4a._mapconfig.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 64;BA.debugLine="code.Initialize";
Debug.ShouldStop(-2147483648);
buildb4a._code.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="cboProducts.Items.Add(\"B4A\")";
Debug.ShouldStop(1);
buildb4a._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4A"))));
 BA.debugLineNum = 66;BA.debugLine="cboProducts.Items.Add(\"B4J\")";
Debug.ShouldStop(2);
buildb4a._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4J"))));
 BA.debugLineNum = 67;BA.debugLine="cboProducts.Items.Add(\"B4i (coming soon)\")";
Debug.ShouldStop(4);
buildb4a._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4i (coming soon)"))));
 BA.debugLineNum = 68;BA.debugLine="cboProducts.Items.Add(\"B4R (coming soon)\")";
Debug.ShouldStop(8);
buildb4a._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4R (coming soon)"))));
 BA.debugLineNum = 70;BA.debugLine="cboProducts.Value = cboProducts.Items.Get(0)";
Debug.ShouldStop(32);
buildb4a._cboproducts.runMethod(false,"setValue",buildb4a._cboproducts.runMethod(false,"getItems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 72;BA.debugLine="B4AManifest.Init";
Debug.ShouldStop(128);
buildb4a._b4amanifest.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menutop_action() throws Exception{
try {
		Debug.PushSubsStack("menuTop_Action (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,234);
if (RapidSub.canDelegate("menutop_action")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","menutop_action");}
 BA.debugLineNum = 234;BA.debugLine="Private Sub menuTop_Action";
Debug.ShouldStop(512);
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
buildb4a._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="Private MainForm As Form";
buildb4a._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
buildb4a._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 6;BA.debugLine="Private txtJavaPath As TextField";
buildb4a._txtjavapath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 7;BA.debugLine="Private txtProjectPath As TextField";
buildb4a._txtprojectpath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private txtPreview As TextArea";
buildb4a._txtpreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private btJavaFolder As Button";
buildb4a._btjavafolder = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private btJavaProject As Button";
buildb4a._btjavaproject = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim mapConfig As Map";
buildb4a._mapconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="Private btComplier As Button";
buildb4a._btcomplier = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim code As StringBuilder";
buildb4a._code = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private cboProducts As ComboBox";
buildb4a._cboproducts = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private txtClassName As TextField";
buildb4a._txtclassname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private btnJava8 As Button";
buildb4a._btnjava8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnBuildDoc As Button";
buildb4a._btnbuilddoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnDownload As Button";
buildb4a._btndownload = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtPOM As TextArea";
buildb4a._txtpom = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtJDK As TextField";
buildb4a._txtjdk = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private tabCode As TabPane";
buildb4a._tabcode = RemoteObject.createNew ("anywheresoftware.b4j.objects.TabPaneWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private webCode As WebView";
buildb4a._webcode = RemoteObject.createNew ("anywheresoftware.b4j.objects.WebViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private menuTop As MenuBar";
buildb4a._menutop = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Button1 As Button";
buildb4a._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _shl_processcompleted(RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("shl_ProcessCompleted (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,171);
if (RapidSub.canDelegate("shl_processcompleted")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","shl_processcompleted", _success, _exitcode, _stdout, _stderr);}
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 171;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 173;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(4096);
buildb4a._code.runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(buildb4a.__c.getField(true,"CRLF")));
 BA.debugLineNum = 174;BA.debugLine="txtPreview.Text = StdOut";
Debug.ShouldStop(8192);
buildb4a._txtpreview.runMethod(true,"setText",_stdout);
 }else {
 BA.debugLineNum = 177;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(65536);
buildb4a._code.runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(buildb4a.__c.getField(true,"CRLF")));
 BA.debugLineNum = 178;BA.debugLine="txtPreview.Text = StdErr";
Debug.ShouldStop(131072);
buildb4a._txtpreview.runMethod(true,"setText",_stderr);
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtclassname_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtClassName_TextChanged (buildb4a) ","buildb4a",5,buildb4a.ba,buildb4a.mostCurrent,184);
if (RapidSub.canDelegate("txtclassname_textchanged")) { return com.tummosoft.builder.buildb4a.remoteMe.runUserSub(false, "buildb4a","txtclassname_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 184;BA.debugLine="Private Sub txtClassName_TextChanged (Old As Strin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="AddMap(\"libname\", New)";
Debug.ShouldStop(16777216);
_addmap(BA.ObjectToString("libname"),_new);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}