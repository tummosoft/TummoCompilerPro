package com.tummosoft.builder;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class buildb4j_subs_0 {


public static RemoteObject  _addmap(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddMap (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("addmap")) { return __ref.runUserSub(false, "buildb4j","addmap", __ref, _key, _value);}
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
 BA.debugLineNum = 101;BA.debugLine="Sub AddMap(key As String, value As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="If mapConfig.ContainsKey(key) = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))),buildb4j.__c.getField(true,"False"))) { 
 BA.debugLineNum = 103;BA.debugLine="mapConfig.Put(key, value)";
Debug.ShouldStop(64);
__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 }else {
 BA.debugLineNum = 105;BA.debugLine="mapConfig.Remove(key)";
Debug.ShouldStop(256);
__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_key)));
 BA.debugLineNum = 106;BA.debugLine="mapConfig.Put(key, value)";
Debug.ShouldStop(512);
__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_value)));
 };
 BA.debugLineNum = 108;BA.debugLine="File.WriteMap(File.DirApp, \"config.ini\", mapConfi";
Debug.ShouldStop(2048);
buildb4j.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(buildb4j.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("config.ini")),(Object)(__ref.getField(false,"_mapconfig" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppStart (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("appstart")) { return __ref.runUserSub(false, "buildb4j","appstart", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub AppStart ()";
Debug.ShouldStop(4);
 BA.debugLineNum = 40;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
Debug.ShouldStop(128);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runMethod(false,"getStylesheets").runVoidMethod ("Add",(Object)((buildb4j.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(buildb4j.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("dracula.css"))))));
 BA.debugLineNum = 41;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
Debug.ShouldStop(256);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Layout1")));
 BA.debugLineNum = 42;BA.debugLine="MainForm.WindowWidth = 880";
Debug.ShouldStop(512);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runMethod(true,"setWindowWidth",BA.numberCast(double.class, 880));
 BA.debugLineNum = 43;BA.debugLine="MainForm.WindowHeight = 760";
Debug.ShouldStop(1024);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runMethod(true,"setWindowHeight",BA.numberCast(double.class, 760));
 BA.debugLineNum = 44;BA.debugLine="MainForm.Show";
Debug.ShouldStop(2048);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 46;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
Debug.ShouldStop(8192);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runMethod(false,"setIcon",(__ref.getField(false,"_fx" /*RemoteObject*/ ).runMethod(false,"LoadImage",(Object)(buildb4j.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icons8-build-64.png"))).getObject()));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btcomplier_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btComplier_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("btcomplier_click")) { __ref.runUserSub(false, "buildb4j","btcomplier_click", __ref); return;}
ResumableSub_btComplier_Click rsub = new ResumableSub_btComplier_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btComplier_Click extends BA.ResumableSub {
public ResumableSub_btComplier_Click(com.tummosoft.builder.buildb4j parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.tummosoft.builder.buildb4j parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btComplier_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,166);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 167;BA.debugLine="ManifestRender.Init";
Debug.ShouldStop(64);
parent._manifestrender.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 168;BA.debugLine="ManifestRender.BuildJAR(txtClassName.Text, txtPro";
Debug.ShouldStop(128);
parent._manifestrender.runVoidMethod ("_buildjar" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtclassname" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 169;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4j", "btcomplier_click"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 170;BA.debugLine="BuildJar";
Debug.ShouldStop(512);
__ref.runClassMethod (com.tummosoft.builder.buildb4j.class, "_buildjar" /*void*/ );
 BA.debugLineNum = 171;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4j", "btcomplier_click"),BA.numberCast(int.class, 100));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _btjavafolder_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btJavaFolder_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("btjavafolder_click")) { return __ref.runUserSub(false, "buildb4j","btjavafolder_click", __ref);}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 79;BA.debugLine="Private Sub btJavaFolder_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(32768);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 81;BA.debugLine="jct.Initialize";
Debug.ShouldStop(65536);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(131072);
_jct.runMethod(true,"setInitialDirectory",buildb4j.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 84;BA.debugLine="txtJavaPath.Text = jct.Show(MainForm)";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtjavapath" /*RemoteObject*/ ).runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(__ref.getField(false,"_mainform" /*RemoteObject*/ ))));
 BA.debugLineNum = 86;BA.debugLine="AddMap(\"javac\", txtJavaPath.Text)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (com.tummosoft.builder.buildb4j.class, "_addmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString("javac")),(Object)(__ref.getField(false,"_txtjavapath" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btjavaproject_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btJavaProject_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("btjavaproject_click")) { return __ref.runUserSub(false, "buildb4j","btjavaproject_click", __ref);}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 90;BA.debugLine="Private Sub btJavaProject_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(67108864);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 92;BA.debugLine="jct.Initialize";
Debug.ShouldStop(134217728);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(268435456);
_jct.runMethod(true,"setInitialDirectory",buildb4j.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 95;BA.debugLine="txtProjectPath.Text = jct.Show(MainForm)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(__ref.getField(false,"_mainform" /*RemoteObject*/ ))));
 BA.debugLineNum = 97;BA.debugLine="AddMap(\"project\", txtProjectPath.Text)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.tummosoft.builder.buildb4j.class, "_addmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString("project")),(Object)(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbuilddoc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBuildDoc_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("btnbuilddoc_click")) { __ref.runUserSub(false, "buildb4j","btnbuilddoc_click", __ref); return;}
ResumableSub_btnBuildDoc_Click rsub = new ResumableSub_btnBuildDoc_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuildDoc_Click extends BA.ResumableSub {
public ResumableSub_btnBuildDoc_Click(com.tummosoft.builder.buildb4j parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.tummosoft.builder.buildb4j parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuildDoc_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,203);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 204;BA.debugLine="ManifestRender.Init";
Debug.ShouldStop(2048);
parent._manifestrender.runVoidMethod ("_init" /*RemoteObject*/ );
 BA.debugLineNum = 206;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4j", "btnbuilddoc_click"),BA.numberCast(int.class, 100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 207;BA.debugLine="CreateDoclet(txtClassName.Text)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.tummosoft.builder.buildb4j.class, "_createdoclet" /*void*/ ,(Object)(__ref.getField(false,"_txtclassname" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static void  _btndownload_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDownload_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("btndownload_click")) { __ref.runUserSub(false, "buildb4j","btndownload_click", __ref); return;}
ResumableSub_btnDownload_Click rsub = new ResumableSub_btnDownload_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDownload_Click extends BA.ResumableSub {
public ResumableSub_btnDownload_Click(com.tummosoft.builder.buildb4j parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.tummosoft.builder.buildb4j parent;
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
		Debug.PushSubsStack("btnDownload_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,210);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 211;BA.debugLine="Dim arr() As String = Regex.Split(\"\\n\", txtPOM.Te";
Debug.ShouldStop(262144);
_arr = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\n")),(Object)(__ref.getField(false,"_txtpom" /*RemoteObject*/ ).runMethod(true,"getText")));Debug.locals.put("arr", _arr);Debug.locals.put("arr", _arr);
 BA.debugLineNum = 213;BA.debugLine="ManifestRender.DownloadLibs(txtProjectPath.Text,";
Debug.ShouldStop(1048576);
parent._manifestrender.runVoidMethod ("_downloadlibs" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("/ant"))),(Object)(_arr));
 BA.debugLineNum = 215;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(4194304);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("ant.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 216;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(8388608);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 217;BA.debugLine="Private params As List";
Debug.ShouldStop(16777216);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 218;BA.debugLine="params.Initialize";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 219;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 220;BA.debugLine="params.Add(txtProjectPath.Text & \"\\download.xml\")";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("\\download.xml")))));
 BA.debugLineNum = 221;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(268435456);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 224;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(-2147483648);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 226;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4j", "btndownload_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 227;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 228;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(8);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 229;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(16);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 232;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(128);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 233;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(256);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _btnjava8_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnJava8_Click (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("btnjava8_click")) { return __ref.runUserSub(false, "buildb4j","btnjava8_click", __ref);}
RemoteObject _jct = RemoteObject.declareNull("anywheresoftware.b4j.objects.DirectoryChooserWrapper");
 BA.debugLineNum = 193;BA.debugLine="Private Sub btnJava8_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="Dim jct As DirectoryChooser";
Debug.ShouldStop(2);
_jct = RemoteObject.createNew ("anywheresoftware.b4j.objects.DirectoryChooserWrapper");Debug.locals.put("jct", _jct);
 BA.debugLineNum = 195;BA.debugLine="jct.Initialize";
Debug.ShouldStop(4);
_jct.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="jct.InitialDirectory = File.DirApp";
Debug.ShouldStop(8);
_jct.runMethod(true,"setInitialDirectory",buildb4j.__c.getField(false,"File").runMethod(true,"getDirApp"));
 BA.debugLineNum = 198;BA.debugLine="txtJava8.Text = jct.Show(MainForm)";
Debug.ShouldStop(32);
__ref.getField(false,"_txtjava8" /*RemoteObject*/ ).runMethod(true,"setText",_jct.runMethodAndSync(true,"Show",(Object)(__ref.getField(false,"_mainform" /*RemoteObject*/ ))));
 BA.debugLineNum = 200;BA.debugLine="AddMap(\"java8\", txtJava8.Text)";
Debug.ShouldStop(128);
__ref.runClassMethod (com.tummosoft.builder.buildb4j.class, "_addmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString("java8")),(Object)(__ref.getField(false,"_txtjava8" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buildjar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildJar (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("buildjar")) { __ref.runUserSub(false, "buildb4j","buildjar", __ref); return;}
ResumableSub_BuildJar rsub = new ResumableSub_BuildJar(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_BuildJar extends BA.ResumableSub {
public ResumableSub_BuildJar(com.tummosoft.builder.buildb4j parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.tummosoft.builder.buildb4j parent;
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
		Debug.PushSubsStack("BuildJar (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 113;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(65536);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("ant.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 114;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(131072);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 115;BA.debugLine="Private params As List";
Debug.ShouldStop(262144);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 116;BA.debugLine="params.Initialize";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 118;BA.debugLine="params.Add(txtProjectPath.Text & \"\\build.xml\")";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("\\build.xml")))));
 BA.debugLineNum = 119;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(4194304);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 122;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(33554432);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 124;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4j", "buildjar"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 125;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 126;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 127;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 130;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(2);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 131;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(4);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
buildb4j._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",buildb4j._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private MainForm As Form";
buildb4j._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_mainform",buildb4j._mainform);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
buildb4j._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",buildb4j._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private Button1 As B4XView";
buildb4j._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_button1",buildb4j._button1);
 //BA.debugLineNum = 6;BA.debugLine="Private txtJavaPath As TextField";
buildb4j._txtjavapath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtjavapath",buildb4j._txtjavapath);
 //BA.debugLineNum = 7;BA.debugLine="Private txtProjectPath As TextField";
buildb4j._txtprojectpath = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtprojectpath",buildb4j._txtprojectpath);
 //BA.debugLineNum = 8;BA.debugLine="Private txtPreview As TextArea";
buildb4j._txtpreview = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtpreview",buildb4j._txtpreview);
 //BA.debugLineNum = 9;BA.debugLine="Private btJavaFolder As Button";
buildb4j._btjavafolder = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btjavafolder",buildb4j._btjavafolder);
 //BA.debugLineNum = 10;BA.debugLine="Private btJavaProject As Button";
buildb4j._btjavaproject = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btjavaproject",buildb4j._btjavaproject);
 //BA.debugLineNum = 11;BA.debugLine="Dim mapConfig As Map";
buildb4j._mapconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapconfig",buildb4j._mapconfig);
 //BA.debugLineNum = 12;BA.debugLine="Private btComplier As Button";
buildb4j._btcomplier = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btcomplier",buildb4j._btcomplier);
 //BA.debugLineNum = 13;BA.debugLine="Dim code As StringBuilder";
buildb4j._code = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_code",buildb4j._code);
 //BA.debugLineNum = 14;BA.debugLine="Private cboProducts As ComboBox";
buildb4j._cboproducts = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cboproducts",buildb4j._cboproducts);
 //BA.debugLineNum = 15;BA.debugLine="Private txtClassName As TextField";
buildb4j._txtclassname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtclassname",buildb4j._txtclassname);
 //BA.debugLineNum = 16;BA.debugLine="Private btpomxml As Button";
buildb4j._btpomxml = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btpomxml",buildb4j._btpomxml);
 //BA.debugLineNum = 17;BA.debugLine="Private btnJava8 As Button";
buildb4j._btnjava8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnjava8",buildb4j._btnjava8);
 //BA.debugLineNum = 18;BA.debugLine="Private txtJava8 As TextField";
buildb4j._txtjava8 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtjava8",buildb4j._txtjava8);
 //BA.debugLineNum = 19;BA.debugLine="Private btnBuildDoc As Button";
buildb4j._btnbuilddoc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnbuilddoc",buildb4j._btnbuilddoc);
 //BA.debugLineNum = 20;BA.debugLine="Private btnDownload As Button";
buildb4j._btndownload = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btndownload",buildb4j._btndownload);
 //BA.debugLineNum = 21;BA.debugLine="Private txtPOM As TextArea";
buildb4j._txtpom = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtpom",buildb4j._txtpom);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _createdoclet(RemoteObject __ref,RemoteObject _libname) throws Exception{
try {
		Debug.PushSubsStack("CreateDoclet (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("createdoclet")) { __ref.runUserSub(false, "buildb4j","createdoclet", __ref, _libname); return;}
ResumableSub_CreateDoclet rsub = new ResumableSub_CreateDoclet(null,__ref,_libname);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateDoclet extends BA.ResumableSub {
public ResumableSub_CreateDoclet(com.tummosoft.builder.buildb4j parent,RemoteObject __ref,RemoteObject _libname) {
this.parent = parent;
this.__ref = __ref;
this._libname = _libname;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.tummosoft.builder.buildb4j parent;
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
		Debug.PushSubsStack("CreateDoclet (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,136);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("libname", _libname);
 BA.debugLineNum = 137;BA.debugLine="code.Append(\"Creating doclet...\").Append(CRLF)";
Debug.ShouldStop(256);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Creating doclet..."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 139;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(1024);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 140;BA.debugLine="ManifestRender.DOCletXML(txtProjectPath.Text, txt";
Debug.ShouldStop(2048);
parent._manifestrender.runVoidMethod ("_docletxml" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtclassname" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(__ref.getField(false,"_txtjava8" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 141;BA.debugLine="ManifestRender.CreateBat(txtJava8.Text, txtProjec";
Debug.ShouldStop(4096);
parent._manifestrender.runVoidMethod ("_createbat" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtjava8" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 143;BA.debugLine="Dim pc As String = File.Combine(File.DirApp & \"\\a";
Debug.ShouldStop(16384);
_pc = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(RemoteObject.concat(parent.__c.getField(false,"File").runMethod(true,"getDirApp"),RemoteObject.createImmutable("\\ant\\bin"))),(Object)(RemoteObject.createImmutable("antjava8.bat")));Debug.locals.put("pc", _pc);Debug.locals.put("pc", _pc);
 BA.debugLineNum = 144;BA.debugLine="Private shl As Shell";
Debug.ShouldStop(32768);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 145;BA.debugLine="Private params As List";
Debug.ShouldStop(65536);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("params", _params);
 BA.debugLineNum = 146;BA.debugLine="params.Initialize";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 147;BA.debugLine="params.Add(\"-f\")";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("-f"))));
 BA.debugLineNum = 148;BA.debugLine="params.Add(txtProjectPath.Text & \"\\doc.xml\")";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Add",(Object)((RemoteObject.concat(__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("\\doc.xml")))));
 BA.debugLineNum = 150;BA.debugLine="shl.Initialize(\"shl\",pc,params)";
Debug.ShouldStop(2097152);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(_pc),(Object)(_params));
 BA.debugLineNum = 152;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(8388608);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 154;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "buildb4j", "createdoclet"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_exitcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ExitCode", _exitcode);
_stdout = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("StdOut", _stdout);
_stderr = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(4));Debug.locals.put("StdErr", _stderr);
;
 BA.debugLineNum = 155;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 156;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 157;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(true,"ToString"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 160;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 161;BA.debugLine="txtPreview.Text = code.ToString";
Debug.ShouldStop(1);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(true,"ToString"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "buildb4j","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="MainForm.Initialize(\"\", 880,760)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mainform" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(double.class, 880)),(Object)(BA.numberCast(double.class, 760)));
 BA.debugLineNum = 31;BA.debugLine="mapConfig.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="code.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_code" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadForm (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("loadform")) { return __ref.runUserSub(false, "buildb4j","loadform", __ref);}
RemoteObject _txtcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _txtcode2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 52;BA.debugLine="Sub LoadForm()";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim txtcode As B4XView = txtPreview";
Debug.ShouldStop(1048576);
_txtcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtpreview" /*RemoteObject*/ ).getObject());Debug.locals.put("txtcode", _txtcode);Debug.locals.put("txtcode", _txtcode);
 BA.debugLineNum = 54;BA.debugLine="txtcode.TextColor = xui.Color_RGB(55,227,75)";
Debug.ShouldStop(2097152);
_txtcode.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 55)),(Object)(BA.numberCast(int.class, 227)),(Object)(BA.numberCast(int.class, 75))));
 BA.debugLineNum = 55;BA.debugLine="Dim txtcode2 As B4XView = txtPOM";
Debug.ShouldStop(4194304);
_txtcode2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_txtcode2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_txtpom" /*RemoteObject*/ ).getObject());Debug.locals.put("txtcode2", _txtcode2);Debug.locals.put("txtcode2", _txtcode2);
 BA.debugLineNum = 56;BA.debugLine="txtcode2.TextColor = xui.Color_RGB(93,34,202)";
Debug.ShouldStop(8388608);
_txtcode2.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 93)),(Object)(BA.numberCast(int.class, 34)),(Object)(BA.numberCast(int.class, 202))));
 BA.debugLineNum = 58;BA.debugLine="If File.Exists(File.DirApp, \"config.ini\") Then";
Debug.ShouldStop(33554432);
if (buildb4j.__c.getField(false,"File").runMethod(true,"Exists",(Object)(buildb4j.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.ini"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="Dim mapConfig As Map = File.ReadMap(File.DirApp,";
Debug.ShouldStop(67108864);
buildb4j._mapconfig = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
buildb4j._mapconfig = buildb4j.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(buildb4j.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("config.ini")));__ref.setField("_mapconfig",buildb4j._mapconfig);
 BA.debugLineNum = 60;BA.debugLine="txtJavaPath.Text = mapConfig.Get(\"javac\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtjavapath" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("javac"))))));
 BA.debugLineNum = 61;BA.debugLine="txtProjectPath.Text = mapConfig.Get(\"project\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtprojectpath" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project"))))));
 BA.debugLineNum = 62;BA.debugLine="txtClassName.Text = mapConfig.Get(\"libname\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtclassname" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("libname"))))));
 BA.debugLineNum = 63;BA.debugLine="txtJava8.Text = mapConfig.Get(\"java8\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtjava8" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("java8"))))));
 }else {
 BA.debugLineNum = 65;BA.debugLine="mapConfig.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_mapconfig" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 68;BA.debugLine="code.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_code" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="cboProducts.Items.Add(\"B4J\")";
Debug.ShouldStop(16);
__ref.getField(false,"_cboproducts" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4J"))));
 BA.debugLineNum = 70;BA.debugLine="cboProducts.Items.Add(\"B4A (coming soon)\")";
Debug.ShouldStop(32);
__ref.getField(false,"_cboproducts" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4A (coming soon)"))));
 BA.debugLineNum = 71;BA.debugLine="cboProducts.Items.Add(\"B4i (coming soon)\")";
Debug.ShouldStop(64);
__ref.getField(false,"_cboproducts" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4i (coming soon)"))));
 BA.debugLineNum = 72;BA.debugLine="cboProducts.Items.Add(\"B4R (coming soon)\")";
Debug.ShouldStop(128);
__ref.getField(false,"_cboproducts" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4R (coming soon)"))));
 BA.debugLineNum = 74;BA.debugLine="cboProducts.Value = cboProducts.Items.Get(0)";
Debug.ShouldStop(512);
__ref.getField(false,"_cboproducts" /*RemoteObject*/ ).runMethod(false,"setValue",__ref.getField(false,"_cboproducts" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Process_Globals (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("process_globals")) { return __ref.runUserSub(false, "buildb4j","process_globals", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Sub Process_Globals";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shl_processcompleted(RemoteObject __ref,RemoteObject _success,RemoteObject _exitcode,RemoteObject _stdout,RemoteObject _stderr) throws Exception{
try {
		Debug.PushSubsStack("shl_ProcessCompleted (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("shl_processcompleted")) { return __ref.runUserSub(false, "buildb4j","shl_processcompleted", __ref, _success, _exitcode, _stdout, _stderr);}
Debug.locals.put("Success", _success);
Debug.locals.put("ExitCode", _exitcode);
Debug.locals.put("StdOut", _stdout);
Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 176;BA.debugLine="Sub shl_ProcessCompleted (Success As Boolean, Exit";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="If Success And ExitCode = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(".",_success) && RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 178;BA.debugLine="code.Append(StdOut).Append(CRLF)";
Debug.ShouldStop(131072);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stdout)).runVoidMethod ("Append",(Object)(buildb4j.__c.getField(true,"CRLF")));
 BA.debugLineNum = 179;BA.debugLine="txtPreview.Text = StdOut";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",_stdout);
 }else {
 BA.debugLineNum = 182;BA.debugLine="code.Append(StdErr).Append(CRLF)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_code" /*RemoteObject*/ ).runMethod(false,"Append",(Object)(_stderr)).runVoidMethod ("Append",(Object)(buildb4j.__c.getField(true,"CRLF")));
 BA.debugLineNum = 183;BA.debugLine="txtPreview.Text = StdErr";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtpreview" /*RemoteObject*/ ).runMethod(true,"setText",_stderr);
 };
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
public static RemoteObject  _txtclassname_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("txtClassName_TextChanged (buildb4j) ","buildb4j",3,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("txtclassname_textchanged")) { return __ref.runUserSub(false, "buildb4j","txtclassname_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 189;BA.debugLine="Private Sub txtClassName_TextChanged (Old As Strin";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="AddMap(\"libname\", New)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (com.tummosoft.builder.buildb4j.class, "_addmap" /*RemoteObject*/ ,(Object)(BA.ObjectToString("libname")),(Object)(_new));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}