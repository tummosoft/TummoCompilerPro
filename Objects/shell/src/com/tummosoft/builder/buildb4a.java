
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

public class buildb4a implements IRemote{
	public static buildb4a mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public buildb4a() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new buildb4a();
		remoteMe = RemoteObject.declareNull("com.tummosoft.builder.buildb4a");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("buildb4a"), "com.tummosoft.builder.buildb4a");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, buildb4a.class);
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
		pcBA = new PCBA(this, buildb4a.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _txtjavapath = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtprojectpath = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtpreview = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _btjavafolder = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btjavaproject = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _mapconfig = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _btcomplier = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _code = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _cboproducts = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _txtclassname = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnjava8 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnbuilddoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btndownload = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _txtpom = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _txtjdk = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _tabcode = RemoteObject.declareNull("anywheresoftware.b4j.objects.TabPaneWrapper");
public static RemoteObject _webcode = RemoteObject.declareNull("anywheresoftware.b4j.objects.WebViewWrapper");
public static RemoteObject _menutop = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static com.tummosoft.builder.main _main = null;
public static com.tummosoft.builder.manifestrender _manifestrender = null;
public static com.tummosoft.builder.testfirstlib _testfirstlib = null;
public static com.tummosoft.builder.b4amanifest _b4amanifest = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4AManifest",Debug.moduleToString(com.tummosoft.builder.b4amanifest.class),"btComplier",buildb4a._btcomplier,"btJavaFolder",buildb4a._btjavafolder,"btJavaProject",buildb4a._btjavaproject,"btnBuildDoc",buildb4a._btnbuilddoc,"btnDownload",buildb4a._btndownload,"btnJava8",buildb4a._btnjava8,"Button1",buildb4a._button1,"cboProducts",buildb4a._cboproducts,"code",buildb4a._code,"fx",buildb4a._fx,"Main",Debug.moduleToString(com.tummosoft.builder.main.class),"MainForm",buildb4a._mainform,"ManifestRender",Debug.moduleToString(com.tummosoft.builder.manifestrender.class),"mapConfig",buildb4a._mapconfig,"menuTop",buildb4a._menutop,"tabCode",buildb4a._tabcode,"TestFirstLib",Debug.moduleToString(com.tummosoft.builder.testfirstlib.class),"txtClassName",buildb4a._txtclassname,"txtJavaPath",buildb4a._txtjavapath,"txtJDK",buildb4a._txtjdk,"txtPOM",buildb4a._txtpom,"txtPreview",buildb4a._txtpreview,"txtProjectPath",buildb4a._txtprojectpath,"webCode",buildb4a._webcode,"xui",buildb4a._xui};
}
}