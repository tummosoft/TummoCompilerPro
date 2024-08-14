package com.tummosoft.builder;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class testfirstlib_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
testfirstlib._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _test() throws Exception{
try {
		Debug.PushSubsStack("Test (testfirstlib) ","testfirstlib",2,testfirstlib.ba,testfirstlib.mostCurrent,6);
if (RapidSub.canDelegate("test")) { return com.tummosoft.builder.testfirstlib.remoteMe.runUserSub(false, "testfirstlib","test");}
 BA.debugLineNum = 6;BA.debugLine="Sub Test";
Debug.ShouldStop(32);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}