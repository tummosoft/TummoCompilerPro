package com.tummosoft.builder;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _addmap(RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddMap (main) ","main",0,main.ba,main.mostCurrent,97);
if (RapidSub.canDelegate("addmap")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","addmap", _key, _value);}
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
 BA.debugLineNum = 97;BA.debugLine="Sub AddMap(key As String, value As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="If mapConfig.ContainsKey(key) = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main._mapconfig.runMethod(true,"ContainsKey",(Object)((_key))),main.__c.getField(true,"False"))) { 
 BA.debugLineNum = 99;BA.debugLine="mapConfig.Put(key, value)";
Debug.ShouldStop(4);
main._mapconfig.runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 }else {
 BA.debugLineNum = 101;BA.debugLine="mapConfig.Remove(key)";
Debug.ShouldStop(16);
main._mapconfig.runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 102;BA.debugLine="mapConfig.Put(key, value)";
Debug.ShouldStop(32);
main._mapconfig.runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 };
 BA.debugLineNum = 104;BA.debugLine="File.WriteMap(File.DirApp, \"config.ini\", mapConfi";
Debug.ShouldStop(128);
main.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("config.ini")),(Object)(main._mapconfig));
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,34);
if (RapidSub.canDelegate("appstart")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 34;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(4);
main._mainform = _form1;
 BA.debugLineNum = 36;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
Debug.ShouldStop(8);
main._mainform.runMethod(false,"getStylesheets").runVoidMethod ("Add",(Object)((main.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cupertino-dark.css"))))));
 BA.debugLineNum = 37;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
Debug.ShouldStop(16);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Layout1")));
 BA.debugLineNum = 38;BA.debugLine="MainForm.WindowWidth = 880";
Debug.ShouldStop(32);
main._mainform.runMethod(true,"setWindowWidth",BA.numberCast(double.class, 880));
 BA.debugLineNum = 39;BA.debugLine="MainForm.WindowHeight = 760";
Debug.ShouldStop(64);
main._mainform.runMethod(true,"setWindowHeight",BA.numberCast(double.class, 760));
 BA.debugLineNum = 40;BA.debugLine="MainForm.Show";
Debug.ShouldStop(128);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 42;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
Debug.ShouldStop(512);
main._mainform.runMethod(false,"setIcon",(main._fx.runMethod(false,"LoadImage",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icons8-build-64.png"))).getObject()));
 BA.debugLineNum = 44;BA.debugLine="LoadForm";
Debug.ShouldStop(2048);
_loadform();
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
		Debug.PushSubsStack("btComplier_Click (main) ","main",0,main.ba,main.mostCurrent,162);
if (RapidSub.canDelegate("btcomplier_click")) { com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","btcomplier_click"); return;}
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
public ResumableSub_btComplier_Click(com.tummosoft.builder.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btComplier_Click (main) ","main",0,main.ba,main.mostCurrent,162);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 163;BA.debugLine="ManifestRender.Init";
Debug.ShouldStop(4);
parent._manifestrender.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="ManifestRender.BuildJAR(txtClassName.Text, txtPro";
Debug.ShouldStop(8);
parent._manifestrender.runVoidMethod ("_buildjar" /*RemoteObject*/ ,(Object)(parent._txtclassname.runMethod(true,"getText")),(Object)(parent._txtprojectpath.runMethod(true,"getText")));
 BA.debugLineNum = 165;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btcomplier_click"),BA.numberCast(int.class, 100));
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
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btcomplier_click"),BA.numberCast(int.class, 100));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btJavaFolder_Click (main) ","main",0,main.ba,main.mostCurrent,75);
if (RapidSub.canDelegate("btjavafolder_click")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","btjavafolder_click");}
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
_jct.runMethod(true,"setInitialDirectory",main.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 80;BA.debugLine="txtJavaPath.Text = jct.Show(MainForm)";
Debug.ShouldStop(32768);
main._txtjavapath.runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(main._mainform)));
 BA.debugLineNum = 82;BA.debugLine="AddMap(\"javac\", txtJavaPath.Text)";
Debug.ShouldStop(131072);
_addmap(BA.ObjectToString("javac"),main._txtjavapath.runMethod(true,"getText"));
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
		Debug.PushSubsStack("btJavaProject_Click (main) ","main",0,main.ba,main.mostCurrent,86);
if (RapidSub.canDelegate("btjavaproject_click")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","btjavaproject_click");}
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
_jct.runMethod(true,"setInitialDirectory",main.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 91;BA.debugLine="txtProjectPath.Text = jct.Show(MainForm)";
Debug.ShouldStop(67108864);
main._txtprojectpath.runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(main._mainform)));
 BA.debugLineNum = 93;BA.debugLine="AddMap(\"project\", txtProjectPath.Text)";
Debug.ShouldStop(268435456);
_addmap(BA.ObjectToString("project"),main._txtprojectpath.runMethod(true,"getText"));
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
		Debug.PushSubsStack("btnBuildDoc_Click (main) ","main",0,main.ba,main.mostCurrent,199);
if (RapidSub.canDelegate("btnbuilddoc_click")) { com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","btnbuilddoc_click"); return;}
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
public ResumableSub_btnBuildDoc_Click(com.tummosoft.builder.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.main parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuildDoc_Click (main) ","main",0,main.ba,main.mostCurrent,199);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 200;BA.debugLine="ManifestRender.Init";
Debug.ShouldStop(128);
parent._manifestrender.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 202;BA.debugLine="Sleep(100)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btnbuilddoc_click"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 203;BA.debugLine="CreateDoclet(txtClassName.Text)";
Debug.ShouldStop(1024);
_createdoclet(parent._txtclassname.runMethod(true,"getText"));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("btnDownload_Click (main) ","main",0,main.ba,main.mostCurrent,206);
if (RapidSub.canDelegate("btndownload_click")) { com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","btndownload_click"); return;}
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
public ResumableSub_btnDownload_Click(com.tummosoft.builder.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.main parent;
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
		Debug.PushSubsStack("btnDownload_Click (main) ","main",0,main.ba,main.mostCurrent,206);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 207;BA.debugLine="Dim arr() As String = Regex.Split(\"\\n\", txtPOM.Te";
Debug.ShouldStop(16384);
_arr = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\n")),(Object)(parent._txtpom.runMethod(true,"getText")));Debug.locals.put("arr", _arr);Debug.locals.put("arr", _arr);
 BA.debugLineNum = 209;BA.debugLine="ManifestRender.DownloadLibs(txtProjectPath.Text,";
Debug.ShouldStop(65536);
parent._manifestrender.runVoidMethod ("_downloadlibs" /*RemoteObject*/ ,(Object)(parent._txtprojectpath.runMethod(true,"getText")),(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/ant"))),(Object)(_arr));
 BA.debugLineNum = 211;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(262144);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("ant.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 212;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(524288);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 213;BA.debugLine="Private params As List";
Debug.ShouldStop(1048576);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 214;BA.debugLine="params.Initialize";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 215;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 216;BA.debugLine="params.Add(txtProjectPath.Text & \"\\download.xml\")";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(parent._txtprojectpath.runMethod(true,"getText"),RemoteObject.createImmutable("\\download.xml")))));
 BA.debugLineNum = 217;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(16777216);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 220;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(134217728);
_shl.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 222;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "btndownload_click"), null);
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
 BA.debugLineNum = 223;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 224;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(-2147483648);
parent._code.runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 225;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(1);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 228;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(8);
parent._code.runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 229;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(16);
parent._txtpreview.runMethod(true,"setText",parent._code.runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 233;BA.debugLine="End Sub";
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
public static RemoteObject  _btnjava8_click() throws Exception{
try {
		Debug.PushSubsStack("btnJava8_Click (main) ","main",0,main.ba,main.mostCurrent,189);
if (RapidSub.canDelegate("btnjava8_click")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","btnjava8_click");}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 189;BA.debugLine="Private Sub btnJava8_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(536870912);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 191;BA.debugLine="jct.Initialize";
Debug.ShouldStop(1073741824);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(-2147483648);
_jct.runMethod(true,"setInitialDirectory",main.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 194;BA.debugLine="txtJava8.Text = jct.Show(MainForm)";
Debug.ShouldStop(2);
main._txtjava8.runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(main._mainform)));
 BA.debugLineNum = 196;BA.debugLine="AddMap(\"java8\", txtJava8.Text)";
Debug.ShouldStop(8);
_addmap(BA.ObjectToString("java8"),main._txtjava8.runMethod(true,"getText"));
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("BuildJar (main) ","main",0,main.ba,main.mostCurrent,107);
if (RapidSub.canDelegate("buildjar")) { com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","buildjar"); return;}
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
public ResumableSub_BuildJar(com.tummosoft.builder.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.main parent;
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
		Debug.PushSubsStack("BuildJar (main) ","main",0,main.ba,main.mostCurrent,107);
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
_shl.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 120;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "buildjar"), null);
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
public static void  _createdoclet(RemoteObject _libname) throws Exception{
try {
		Debug.PushSubsStack("CreateDoclet (main) ","main",0,main.ba,main.mostCurrent,132);
if (RapidSub.canDelegate("createdoclet")) { com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","createdoclet", _libname); return;}
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
public ResumableSub_CreateDoclet(com.tummosoft.builder.main parent,RemoteObject _libname) {
this.parent = parent;
this._libname = _libname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.tummosoft.builder.main parent;
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
		Debug.PushSubsStack("CreateDoclet (main) ","main",0,main.ba,main.mostCurrent,132);
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
 BA.debugLineNum = 136;BA.debugLine="ManifestRender.DOCletXML(txtProjectPath.Text, txt";
Debug.ShouldStop(128);
parent._manifestrender.runVoidMethod ("_docletxml" /*RemoteObject*/ ,(Object)(parent._txtprojectpath.runMethod(true,"getText")),(Object)(parent._txtclassname.runMethod(true,"getText")),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(parent._txtjava8.runMethod(true,"getText")));
 BA.debugLineNum = 137;BA.debugLine="ManifestRender.CreateBat(txtJava8.Text, txtProjec";
Debug.ShouldStop(256);
parent._manifestrender.runVoidMethod ("_createbat" /*RemoteObject*/ ,(Object)(parent._txtjava8.runMethod(true,"getText")),(Object)(parent._txtprojectpath.runMethod(true,"getText")));
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
_shl.runVoidMethod ("Run",main.ba,(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 150;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "createdoclet"), null);
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
		Debug.PushSubsStack("LoadForm (main) ","main",0,main.ba,main.mostCurrent,48);
if (RapidSub.canDelegate("loadform")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","loadform");}
RemoteObject _txtcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtcode2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 48;BA.debugLine="Sub LoadForm()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim txtcode As B4XView = txtPreview";
Debug.ShouldStop(65536);
_txtcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._txtpreview.getObject());Debug.locals.put("txtcode", _txtcode);Debug.locals.put("txtcode", _txtcode);
 BA.debugLineNum = 50;BA.debugLine="txtcode.TextColor = xui.Color_RGB(55,227,75)";
Debug.ShouldStop(131072);
_txtcode.runMethod(true,"setTextColor",main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 55)),(Object)(BA.numberCast(int.class, 227)),(Object)(BA.numberCast(int.class, 75))));
 BA.debugLineNum = 51;BA.debugLine="Dim txtcode2 As B4XView = txtPOM";
Debug.ShouldStop(262144);
_txtcode2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtcode2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._txtpom.getObject());Debug.locals.put("txtcode2", _txtcode2);Debug.locals.put("txtcode2", _txtcode2);
 BA.debugLineNum = 52;BA.debugLine="txtcode2.TextColor = xui.Color_RGB(93,34,202)";
Debug.ShouldStop(524288);
_txtcode2.runMethod(true,"setTextColor",main._xui.runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 93)),(Object)(BA.numberCast(int.class, 34)),(Object)(BA.numberCast(int.class, 202))));
 BA.debugLineNum = 54;BA.debugLine="If File.Exists(File.DirApp, \"config.ini\") Then";
Debug.ShouldStop(2097152);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="Dim mapConfig As Map = File.ReadMap(File.DirApp,";
Debug.ShouldStop(4194304);
main._mapconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
main._mapconfig = main.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.ini")));
 BA.debugLineNum = 56;BA.debugLine="txtJavaPath.Text = mapConfig.Get(\"javac\")";
Debug.ShouldStop(8388608);
main._txtjavapath.runMethod(true,"setText",BA.ObjectToString(main._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("javac"))))));
 BA.debugLineNum = 57;BA.debugLine="txtProjectPath.Text = mapConfig.Get(\"project\")";
Debug.ShouldStop(16777216);
main._txtprojectpath.runMethod(true,"setText",BA.ObjectToString(main._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))));
 BA.debugLineNum = 58;BA.debugLine="txtClassName.Text = mapConfig.Get(\"libname\")";
Debug.ShouldStop(33554432);
main._txtclassname.runMethod(true,"setText",BA.ObjectToString(main._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("libname"))))));
 BA.debugLineNum = 59;BA.debugLine="txtJava8.Text = mapConfig.Get(\"java8\")";
Debug.ShouldStop(67108864);
main._txtjava8.runMethod(true,"setText",BA.ObjectToString(main._mapconfig.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("java8"))))));
 }else {
 BA.debugLineNum = 61;BA.debugLine="mapConfig.Initialize";
Debug.ShouldStop(268435456);
main._mapconfig.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 64;BA.debugLine="code.Initialize";
Debug.ShouldStop(-2147483648);
main._code.runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="cboProducts.Items.Add(\"B4J\")";
Debug.ShouldStop(1);
main._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4J"))));
 BA.debugLineNum = 66;BA.debugLine="cboProducts.Items.Add(\"B4A (coming soon)\")";
Debug.ShouldStop(2);
main._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4A (coming soon)"))));
 BA.debugLineNum = 67;BA.debugLine="cboProducts.Items.Add(\"B4i (coming soon)\")";
Debug.ShouldStop(4);
main._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4i (coming soon)"))));
 BA.debugLineNum = 68;BA.debugLine="cboProducts.Items.Add(\"B4R (coming soon)\")";
Debug.ShouldStop(8);
main._cboproducts.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4R (coming soon)"))));
 BA.debugLineNum = 70;BA.debugLine="cboProducts.Value = cboProducts.Items.Get(0)";
Debug.ShouldStop(32);
main._cboproducts.runMethod(false,"setValue",main._cboproducts.runMethod(false,"getItems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
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

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
manifestrender_subs_0._process_globals();
testfirstlib_subs_0._process_globals();
b4amanifest_subs_0._process_globals();
buildb4a_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.tummosoft.builder.main");
manifestrender.myClass = BA.getDeviceClass ("com.tummosoft.builder.manifestrender");
testfirstlib.myClass = BA.getDeviceClass ("com.tummosoft.builder.testfirstlib");
buildb4j.myClass = BA.getDeviceClass ("com.tummosoft.builder.buildb4j");
b4amanifest.myClass = BA.getDeviceClass ("com.tummosoft.builder.b4amanifest");
buildb4a.myClass = BA.getDeviceClass ("com.tummosoft.builder.buildb4a");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 13;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 15;BA.debugLine="Private Button1 As B4XView";
main._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private txtJavaPath As TextField";
main._txtjavapath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtProjectPath As TextField";
main._txtprojectpath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtPreview As TextArea";
main._txtpreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btJavaFolder As Button";
main._btjavafolder = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btJavaProject As Button";
main._btjavaproject = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim mapConfig As Map";
main._mapconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 22;BA.debugLine="Private btComplier As Button";
main._btcomplier = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim code As StringBuilder";
main._code = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private cboProducts As ComboBox";
main._cboproducts = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private txtClassName As TextField";
main._txtclassname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btpomxml As Button";
main._btpomxml = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnJava8 As Button";
main._btnjava8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtJava8 As TextField";
main._txtjava8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnBuildDoc As Button";
main._btnbuilddoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnDownload As Button";
main._btndownload = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private txtPOM As TextArea";
main._txtpom = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _shl_processcompleted(RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("shl_ProcessCompleted (main) ","main",0,main.ba,main.mostCurrent,172);
if (RapidSub.canDelegate("shl_processcompleted")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","shl_processcompleted", _success, _exitcode, _stdout, _stderr);}
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 172;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 174;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(8192);
main._code.runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 175;BA.debugLine="txtPreview.Text = StdOut";
Debug.ShouldStop(16384);
main._txtpreview.runMethod(true,"setText",_stdout);
 }else {
 BA.debugLineNum = 178;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(131072);
main._code.runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(main.__c.getField(true,"CRLF")));
 BA.debugLineNum = 179;BA.debugLine="txtPreview.Text = StdErr";
Debug.ShouldStop(262144);
main._txtpreview.runMethod(true,"setText",_stderr);
 };
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("txtClassName_TextChanged (main) ","main",0,main.ba,main.mostCurrent,185);
if (RapidSub.canDelegate("txtclassname_textchanged")) { return com.tummosoft.builder.main.remoteMe.runUserSub(false, "main","txtclassname_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 185;BA.debugLine="Private Sub txtClassName_TextChanged (Old As Strin";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="AddMap(\"libname\", New)";
Debug.ShouldStop(33554432);
_addmap(BA.ObjectToString("libname"),_new);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}