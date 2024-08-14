
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

public class b4amanifest implements IRemote{
	public static b4amanifest mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public b4amanifest() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new b4amanifest();
		remoteMe = RemoteObject.declareNull("com.tummosoft.builder.b4amanifest");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("b4amanifest"), "com.tummosoft.builder.b4amanifest");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4amanifest.class);
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
		pcBA = new PCBA(this, b4amanifest.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mysource = RemoteObject.createImmutable("");
public static RemoteObject _lbname = RemoteObject.createImmutable("");
public static RemoteObject _pth = RemoteObject.createImmutable("");
public static RemoteObject _dicjava = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cls = RemoteObject.createImmutable("");
public static RemoteObject _lstpackage = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _mainclass = RemoteObject.createImmutable("");
public static RemoteObject _btndownload = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static com.tummosoft.builder.main _main = null;
public static com.tummosoft.builder.manifestrender _manifestrender = null;
public static com.tummosoft.builder.testfirstlib _testfirstlib = null;
public static com.tummosoft.builder.buildb4a _buildb4a = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnDownload",b4amanifest._btndownload,"BuildB4A",Debug.moduleToString(com.tummosoft.builder.buildb4a.class),"cls",b4amanifest._cls,"dicjava",b4amanifest._dicjava,"lbname",b4amanifest._lbname,"lstPackage",b4amanifest._lstpackage,"Main",Debug.moduleToString(com.tummosoft.builder.main.class),"mainclass",b4amanifest._mainclass,"ManifestRender",Debug.moduleToString(com.tummosoft.builder.manifestrender.class),"mysource",b4amanifest._mysource,"pth",b4amanifest._pth,"TestFirstLib",Debug.moduleToString(com.tummosoft.builder.testfirstlib.class)};
}
}