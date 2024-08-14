
package com.tummosoft.builder;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class buildb4j {
    public static RemoteObject myClass;
	public buildb4j() {
	}
    public static PCBA staticBA = new PCBA(null, buildb4j.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
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
public static RemoteObject _btpomxml = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnjava8 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _txtjava8 = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnbuilddoc = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btndownload = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _txtpom = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static com.tummosoft.builder.main _main = null;
public static com.tummosoft.builder.manifestrender _manifestrender = null;
public static com.tummosoft.builder.testfirstlib _testfirstlib = null;
public static com.tummosoft.builder.b4amanifest _b4amanifest = null;
public static com.tummosoft.builder.buildb4a _buildb4a = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btComplier",_ref.getField(false, "_btcomplier"),"btJavaFolder",_ref.getField(false, "_btjavafolder"),"btJavaProject",_ref.getField(false, "_btjavaproject"),"btnBuildDoc",_ref.getField(false, "_btnbuilddoc"),"btnDownload",_ref.getField(false, "_btndownload"),"btnJava8",_ref.getField(false, "_btnjava8"),"btpomxml",_ref.getField(false, "_btpomxml"),"Button1",_ref.getField(false, "_button1"),"cboProducts",_ref.getField(false, "_cboproducts"),"code",_ref.getField(false, "_code"),"fx",_ref.getField(false, "_fx"),"MainForm",_ref.getField(false, "_mainform"),"mapConfig",_ref.getField(false, "_mapconfig"),"txtClassName",_ref.getField(false, "_txtclassname"),"txtJava8",_ref.getField(false, "_txtjava8"),"txtJavaPath",_ref.getField(false, "_txtjavapath"),"txtPOM",_ref.getField(false, "_txtpom"),"txtPreview",_ref.getField(false, "_txtpreview"),"txtProjectPath",_ref.getField(false, "_txtprojectpath"),"xui",_ref.getField(false, "_xui")};
}
}