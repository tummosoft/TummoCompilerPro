
package com.tummosoft.builder;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class testfirstlib implements IRemote{
	public static testfirstlib mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public testfirstlib() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new testfirstlib();
		remoteMe = RemoteObject.declareNull("com.tummosoft.builder.testfirstlib");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("testfirstlib"), "com.tummosoft.builder.testfirstlib");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, testfirstlib.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, testfirstlib.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static com.tummosoft.builder.main _main = null;
public static com.tummosoft.builder.manifestrender _manifestrender = null;
public static com.tummosoft.builder.b4amanifest _b4amanifest = null;
public static com.tummosoft.builder.buildb4a _buildb4a = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4AManifest",Debug.moduleToString(com.tummosoft.builder.b4amanifest.class),"BuildB4A",Debug.moduleToString(com.tummosoft.builder.buildb4a.class),"fx",testfirstlib._fx,"Main",Debug.moduleToString(com.tummosoft.builder.main.class),"ManifestRender",Debug.moduleToString(com.tummosoft.builder.manifestrender.class)};
}
}