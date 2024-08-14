package com.tummosoft.builder;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4amanifest_subs_0 {


public static RemoteObject  _buildjar(RemoteObject _libname,RemoteObject _source,RemoteObject _sdk) throws Exception{
try {
		Debug.PushSubsStack("BuildJAR (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,20);
if (RapidSub.canDelegate("buildjar")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","buildjar", _libname, _source, _sdk);}
RemoteObject _bld = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _classs = RemoteObject.createImmutable("");
Debug.locals.put("libname", _libname);
Debug.locals.put("source", _source);
Debug.locals.put("sdk", _sdk);
 BA.debugLineNum = 20;BA.debugLine="Public Sub BuildJAR(libname As String, source As S";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Dim bld As StringBuilder";
Debug.ShouldStop(1048576);
_bld = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("bld", _bld);
 BA.debugLineNum = 22;BA.debugLine="mysource = source";
Debug.ShouldStop(2097152);
b4amanifest._mysource = _source;
 BA.debugLineNum = 23;BA.debugLine="lbname = libname";
Debug.ShouldStop(4194304);
b4amanifest._lbname = _libname;
 BA.debugLineNum = 25;BA.debugLine="pth = source";
Debug.ShouldStop(16777216);
b4amanifest._pth = _source;
 BA.debugLineNum = 26;BA.debugLine="bld.Initialize";
Debug.ShouldStop(33554432);
_bld.runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="FindJavaFile(source)";
Debug.ShouldStop(134217728);
_findjavafile(_source);
 BA.debugLineNum = 29;BA.debugLine="Dim classs As String = ReadJava";
Debug.ShouldStop(268435456);
_classs = _readjava();Debug.locals.put("classs", _classs);Debug.locals.put("classs", _classs);
 BA.debugLineNum = 31;BA.debugLine="bld.Append($\"<?xml version=\"1.0\" encoding=\"UTF-8\"";
Debug.ShouldStop(1073741824);
_bld.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"),RemoteObject.createImmutable("	<project default=\"main\">	\n"),RemoteObject.createImmutable("	 <target name=\"info\">\n"),RemoteObject.createImmutable("      <echo>Tummo Complier Pro</echo>\n"),RemoteObject.createImmutable("	  <echo>Building library...</echo>\n"),RemoteObject.createImmutable("	  <tstamp/>\n"),RemoteObject.createImmutable("	  <echo>*************</echo>\n"),RemoteObject.createImmutable("   </target>\n"),RemoteObject.createImmutable("   \n"),RemoteObject.createImmutable("    <!-- Deletes the existing build, docs And dist directory-->\n"),RemoteObject.createImmutable("    <target name=\"clean\">\n"),RemoteObject.createImmutable("		<echo>Delete old folder...</echo>\n"),RemoteObject.createImmutable("		<echo>*************</echo>\n"),RemoteObject.createImmutable("        <delete dir=\"build/class\" />\n"),RemoteObject.createImmutable("        <delete dir=\"build/dist\" />        \n"),RemoteObject.createImmutable("    </target>\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("    <!-- Creates the  build, docs And dist directory-->\n"),RemoteObject.createImmutable("    <target name=\"makedir\">\n"),RemoteObject.createImmutable("		<echo>make new folder...</echo>\n"),RemoteObject.createImmutable("		<echo>*************</echo>\n"),RemoteObject.createImmutable("        <mkdir dir=\"build/class\" />\n"),RemoteObject.createImmutable("        <mkdir dir=\"build/dist\" />        \n"),RemoteObject.createImmutable("    </target>\n"),RemoteObject.createImmutable("   		\n"),RemoteObject.createImmutable("  	 <!-- Compiles the java code (including the usage of library For JUnit -->\n"),RemoteObject.createImmutable("    <target name=\"compile\" depends=\"clean, makedir\">  \n"),RemoteObject.createImmutable("		<path id=\"classpath.base\">                                                                                                                           \n"),RemoteObject.createImmutable("     <fileset dir=\"libs\">                                                                                                                          \n"),RemoteObject.createImmutable("         <include name=\"**/*.jar\" />                                                                                                          \n"),RemoteObject.createImmutable("     </fileset> \n"),RemoteObject.createImmutable("	 <fileset dir=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdk))),RemoteObject.createImmutable("\">                                                                                                                          \n"),RemoteObject.createImmutable("         <include name=\"**/*.jar\" />                                                                                                          \n"),RemoteObject.createImmutable("     </fileset> \n"),RemoteObject.createImmutable("	                                                                                                                                   \n"),RemoteObject.createImmutable("  </path>  \n"),RemoteObject.createImmutable("		<jar jarfile=\"build/dist/"),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4amanifest._lbname))),RemoteObject.createImmutable(".jar\" includes=\"**/*.java\" basedir=\"src\">\n"),RemoteObject.createImmutable("            <manifest>                \n"),RemoteObject.createImmutable("				"),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_classs))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("            </manifest>   \n"),RemoteObject.createImmutable("    	</jar>  		 \n"),RemoteObject.createImmutable("    </target>   \n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("    <target name=\"main\" depends=\"compile\">\n"),RemoteObject.createImmutable("        <description>Main target</description>\n"),RemoteObject.createImmutable("    </target>\n"),RemoteObject.createImmutable("		</project>\n"),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 79;BA.debugLine="File.WriteString(pth, \"build.xml\", bld.ToString)";
Debug.ShouldStop(16384);
b4amanifest.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(b4amanifest._pth),(Object)(BA.ObjectToString("build.xml")),(Object)(_bld.runMethod(true,"ToString")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbat(RemoteObject _java8,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("CreateBat (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,279);
if (RapidSub.canDelegate("createbat")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","createbat", _java8, _source);}
RemoteObject _cmd = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("java8", _java8);
Debug.locals.put("source", _source);
 BA.debugLineNum = 279;BA.debugLine="Public Sub CreateBat(java8 As String, source As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="Dim cmd As StringBuilder";
Debug.ShouldStop(8388608);
_cmd = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 281;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(16777216);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 282;BA.debugLine="cmd.Append($\"@ echo off set ANT_HOME=${File.DirAp";
Debug.ShouldStop(33554432);
_cmd.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("@ echo off\n"),RemoteObject.createImmutable("set ANT_HOME="),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4amanifest.__c.getField(false,"File").runMethod(true,"getDirApp")))),RemoteObject.createImmutable("\\ant\n"),RemoteObject.createImmutable("set JAVA_HOME="),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_java8))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("set PATH=%JAVA_HOME%\\bin;%ANT_HOME%\\bin;%PATH%\n"),RemoteObject.createImmutable(": DEFAULT\n"),RemoteObject.createImmutable("call ant -f %1\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 290;BA.debugLine="File.WriteString(source, \"builddoclet.bat\", cmd.T";
Debug.ShouldStop(2);
b4amanifest.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_source),(Object)(BA.ObjectToString("builddoclet.bat")),(Object)(_cmd.runMethod(true,"ToString")));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _docletxml(RemoteObject _source,RemoteObject _libname,RemoteObject _myappdir,RemoteObject _java8) throws Exception{
try {
		Debug.PushSubsStack("DOCletXML (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,82);
if (RapidSub.canDelegate("docletxml")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","docletxml", _source, _libname, _myappdir, _java8);}
RemoteObject _output = RemoteObject.createImmutable("");
RemoteObject _bld = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("source", _source);
Debug.locals.put("libname", _libname);
Debug.locals.put("myappDir", _myappdir);
Debug.locals.put("java8", _java8);
 BA.debugLineNum = 82;BA.debugLine="Public Sub DOCletXML(source As String, libname As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 86;BA.debugLine="Dim output As String = source & \"\\build\\dist\\\" &";
Debug.ShouldStop(2097152);
_output = RemoteObject.concat(_source,RemoteObject.createImmutable("\\build\\dist\\"),_libname,RemoteObject.createImmutable(".xml"));Debug.locals.put("output", _output);Debug.locals.put("output", _output);
 BA.debugLineNum = 87;BA.debugLine="Dim bld As StringBuilder";
Debug.ShouldStop(4194304);
_bld = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("bld", _bld);
 BA.debugLineNum = 88;BA.debugLine="bld.Initialize";
Debug.ShouldStop(8388608);
_bld.runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="Dim cls As String = \" classpath=\" & QUOTE & \"${cl";
Debug.ShouldStop(16777216);
b4amanifest._cls = RemoteObject.concat(RemoteObject.createImmutable(" classpath="),b4amanifest.__c.getField(true,"QUOTE"),RemoteObject.createImmutable("${clspath}"),b4amanifest.__c.getField(true,"QUOTE"));
 BA.debugLineNum = 91;BA.debugLine="bld.Append($\"<?xml version=\"1.0\" encoding=\"UTF-8\"";
Debug.ShouldStop(67108864);
_bld.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"),RemoteObject.createImmutable("	<project default=\"main\">		\n"),RemoteObject.createImmutable("	 <target name=\"info\">\n"),RemoteObject.createImmutable("      <echo>Tummo Complier Pro</echo>\n"),RemoteObject.createImmutable("	  <echo>Building library...</echo>\n"),RemoteObject.createImmutable("	  <tstamp/>\n"),RemoteObject.createImmutable("	  <echo>*************</echo>\n"),RemoteObject.createImmutable("   </target>   \n"),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("	 <target name=\"javadoc\">	\n"),RemoteObject.createImmutable("	 <path id=\"classpath.base\">                                                                                                                           \n"),RemoteObject.createImmutable("     <fileset dir=\"libs\">                                                                                                                          \n"),RemoteObject.createImmutable("         <include name=\"**/*.jar\" />                                                                                                          \n"),RemoteObject.createImmutable("     </fileset>   \n"),RemoteObject.createImmutable("	  <fileset dir=\"build/dist\">                                                                                                                          \n"),RemoteObject.createImmutable("         <include name=\"**/*.jar\" />                                                                                                          \n"),RemoteObject.createImmutable("     </fileset>  \n"),RemoteObject.createImmutable("  </path>   	\n"),RemoteObject.createImmutable("   <path id=\"sourcepath.base\">                                                                                                                           \n"),RemoteObject.createImmutable("     <fileset dir=\"src\">                                                                                                                          \n"),RemoteObject.createImmutable("         <include name=\"**/*.java\" />                                                                                                          \n"),RemoteObject.createImmutable("     </fileset>  \n"),RemoteObject.createImmutable("	  <fileset dir=\"C:/Users/Admin/AppData/Local/Android/Sdk/sources/android-29/android/view\">                                                                                                                          \n"),RemoteObject.createImmutable("         <include name=\"**/*.java\" />                                                                                                          \n"),RemoteObject.createImmutable("     </fileset>   	                                                                                                                                 \n"),RemoteObject.createImmutable("  </path>  \n"),RemoteObject.createImmutable("  <property name=\"clspath\" refid=\"classpath.base\"/>\n"),RemoteObject.createImmutable("  <property name=\"source\" refid=\"sourcepath.base\"/>\n"),RemoteObject.createImmutable("        <javadoc access=\"public\" additionalparam=\"-b4atarget "),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_output))),RemoteObject.createImmutable("\" "),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4amanifest._cls))),RemoteObject.createImmutable(" sourcepath=\"src\" packagenames=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4amanifest._lstpackage.runMethod(true,"ToString")))),RemoteObject.createImmutable("\">			              \n"),RemoteObject.createImmutable("            <doclet name=\"BADoclet\" path=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_myappdir))),RemoteObject.createImmutable("\"/>\n"),RemoteObject.createImmutable("        </javadoc>\n"),RemoteObject.createImmutable("    </target>\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("    <target name=\"main\" depends=\"javadoc\">\n"),RemoteObject.createImmutable("        <description>Main target</description>\n"),RemoteObject.createImmutable("    </target>\n"),RemoteObject.createImmutable("		</project>\n"),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 129;BA.debugLine="File.WriteString(source, \"doc.xml\", bld.ToString)";
Debug.ShouldStop(1);
b4amanifest.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_source),(Object)(BA.ObjectToString("doc.xml")),(Object)(_bld.runMethod(true,"ToString")));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadlibs(RemoteObject _source,RemoteObject _antpath,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("DownloadLibs (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,148);
if (RapidSub.canDelegate("downloadlibs")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","downloadlibs", _source, _antpath, _url);}
RemoteObject _repo = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _pom = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("source", _source);
Debug.locals.put("antpath", _antpath);
Debug.locals.put("url", _url);
 BA.debugLineNum = 148;BA.debugLine="Public Sub DownloadLibs(source As String, antpath";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="Dim repo As StringBuilder";
Debug.ShouldStop(2097152);
_repo = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("repo", _repo);
 BA.debugLineNum = 151;BA.debugLine="repo.Initialize";
Debug.ShouldStop(4194304);
_repo.runVoidMethod ("Initialize");
 BA.debugLineNum = 152;BA.debugLine="If url.Length > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",_url.getField(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 153;BA.debugLine="For i=0 To url.Length - 1";
Debug.ShouldStop(16777216);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_url.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 154;BA.debugLine="repo.Append($\"<tstamp/> 	  		<echo>Downloading.";
Debug.ShouldStop(33554432);
_repo.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<tstamp/>\n"),RemoteObject.createImmutable("	  		<echo>Downloading... "),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_url.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable("</echo>\n"),RemoteObject.createImmutable("			<get src=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_url.getArrayElement(true,BA.numberCast(int.class, _i))))),RemoteObject.createImmutable("\"\n"),RemoteObject.createImmutable("             dest=\"libs\" usetimestamp=\"true\" />"))))).runVoidMethod ("Append",(Object)(b4amanifest.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 161;BA.debugLine="Dim pom As StringBuilder";
Debug.ShouldStop(1);
_pom = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("pom", _pom);
 BA.debugLineNum = 162;BA.debugLine="pom.Initialize";
Debug.ShouldStop(2);
_pom.runVoidMethod ("Initialize");
 BA.debugLineNum = 163;BA.debugLine="pom.Append($\" 	<project xmlns:ivy=\"antlib:org.apa";
Debug.ShouldStop(4);
_pom.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	<project xmlns:ivy=\"antlib:org.apache.ivy.ant\" default=\"download\">\n"),RemoteObject.createImmutable("    <property name=\"lib.dir\" value=\"libs\" />\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("    <!-- output directories and files -->\n"),RemoteObject.createImmutable("    <property name=\"build.dir\" value=\"build\" />\n"),RemoteObject.createImmutable("    <property name=\"app.classes.dir\" value=\"build/classes\" />\n"),RemoteObject.createImmutable("    \n"),RemoteObject.createImmutable("    <!-- Ivy-related settings -->\n"),RemoteObject.createImmutable("    <property name=\"ivy.install.version\" value=\"2.4.0\" />\n"),RemoteObject.createImmutable("    <condition property=\"ivy.home\" value=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_antpath))),RemoteObject.createImmutable("/lib\">\n"),RemoteObject.createImmutable("        <isset property=\"env.IVY_HOME\" />\n"),RemoteObject.createImmutable("    </condition>\n"),RemoteObject.createImmutable("    <property name=\"ivy.home\" value=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_antpath))),RemoteObject.createImmutable("/.ant\" />\n"),RemoteObject.createImmutable("    <property name=\"ivy.jar.dir\" value=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_antpath))),RemoteObject.createImmutable("/lib\" />\n"),RemoteObject.createImmutable("    <property name=\"ivy.jar.file\" value=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_antpath))),RemoteObject.createImmutable("/ivy-2.5.2.jar.jar\" />\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("    <presetdef name=\"project.javac\">\n"),RemoteObject.createImmutable("        <javac debug=\"on\" includeantruntime=\"false\" />\n"),RemoteObject.createImmutable("    </presetdef>\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("    <target name=\"download\" unless=\"offline\">        \n"),RemoteObject.createImmutable("       "),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repo.runMethod(true,"ToString")))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("    </target>\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("</project>\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 191;BA.debugLine="File.WriteString(source, \"download.xml\", pom.ToSt";
Debug.ShouldStop(1073741824);
b4amanifest.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_source),(Object)(BA.ObjectToString("download.xml")),(Object)(_pom.runMethod(true,"ToString")));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findjavafile(RemoteObject _sourcepath) throws Exception{
try {
		Debug.PushSubsStack("FindJavaFile (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,195);
if (RapidSub.canDelegate("findjavafile")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","findjavafile", _sourcepath);}
RemoteObject _lstfile = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _dname = RemoteObject.createImmutable("");
RemoteObject _fd = RemoteObject.createImmutable("");
Debug.locals.put("sourcepath", _sourcepath);
 BA.debugLineNum = 195;BA.debugLine="Public Sub FindJavaFile(sourcepath As String) As S";
Debug.ShouldStop(4);
 BA.debugLineNum = 197;BA.debugLine="Dim lstFile As List = File.ListFiles(sourcepath)";
Debug.ShouldStop(16);
_lstfile = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstfile = b4amanifest.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_sourcepath));Debug.locals.put("lstFile", _lstfile);Debug.locals.put("lstFile", _lstfile);
 BA.debugLineNum = 199;BA.debugLine="For i=0 To lstFile.Size - 1";
Debug.ShouldStop(64);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_lstfile.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 200;BA.debugLine="Dim dname As String = lstFile.Get(i)";
Debug.ShouldStop(128);
_dname = BA.ObjectToString(_lstfile.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("dname", _dname);Debug.locals.put("dname", _dname);
 BA.debugLineNum = 201;BA.debugLine="Dim fd As String = File.Combine(sourcepath, dnam";
Debug.ShouldStop(256);
_fd = b4amanifest.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_sourcepath),(Object)(_dname));Debug.locals.put("fd", _fd);Debug.locals.put("fd", _fd);
 BA.debugLineNum = 202;BA.debugLine="If File.IsDirectory(fd,\"\") = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",b4amanifest.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_fd),(Object)(RemoteObject.createImmutable(""))),b4amanifest.__c.getField(true,"False"))) { 
 BA.debugLineNum = 203;BA.debugLine="If fd.EndsWith(\".java\") Then";
Debug.ShouldStop(1024);
if (_fd.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".java"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 204;BA.debugLine="dicjava.Add(fd)";
Debug.ShouldStop(2048);
b4amanifest._dicjava.runVoidMethod ("Add",(Object)((_fd)));
 };
 }else {
 BA.debugLineNum = 207;BA.debugLine="FindJavaFile(fd)";
Debug.ShouldStop(16384);
_findjavafile(_fd);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init() throws Exception{
try {
		Debug.PushSubsStack("Init (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,14);
if (RapidSub.canDelegate("init")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","init");}
 BA.debugLineNum = 14;BA.debugLine="Public Sub Init()";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="dicjava.Initialize";
Debug.ShouldStop(16384);
b4amanifest._dicjava.runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="lstPackage.Initialize";
Debug.ShouldStop(65536);
b4amanifest._lstpackage.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
 //BA.debugLineNum = 4;BA.debugLine="Private mysource As String";
b4amanifest._mysource = RemoteObject.createImmutable("");
 //BA.debugLineNum = 5;BA.debugLine="Dim lbname As String";
b4amanifest._lbname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 6;BA.debugLine="Dim pth As String";
b4amanifest._pth = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="Public dicjava As List";
b4amanifest._dicjava = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 8;BA.debugLine="Dim cls As String";
b4amanifest._cls = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim lstPackage As StringBuilder";
b4amanifest._lstpackage = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Dim mainclass As String";
b4amanifest._mainclass = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Private btnDownload As Button";
b4amanifest._btndownload = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readalllistfile(RemoteObject _source,RemoteObject _newfolder) throws Exception{
try {
		Debug.PushSubsStack("ReadAllListFile (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,132);
if (RapidSub.canDelegate("readalllistfile")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","readalllistfile", _source, _newfolder);}
RemoteObject _etx = RemoteObject.createImmutable("");
RemoteObject _lstjar = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _f = RemoteObject.createImmutable("");
Debug.locals.put("source", _source);
Debug.locals.put("newfolder", _newfolder);
 BA.debugLineNum = 132;BA.debugLine="Private Sub ReadAllListFile(source As String, newf";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim etx As String = newfolder.Replace(\"/\",\"\\\")";
Debug.ShouldStop(16);
_etx = _newfolder.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("\\")));Debug.locals.put("etx", _etx);Debug.locals.put("etx", _etx);
 BA.debugLineNum = 134;BA.debugLine="Dim lstjar As List = File.ListFiles(File.Combine(";
Debug.ShouldStop(32);
_lstjar = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstjar = b4amanifest.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(b4amanifest.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_source),(Object)(_etx))));Debug.locals.put("lstjar", _lstjar);Debug.locals.put("lstjar", _lstjar);
 BA.debugLineNum = 135;BA.debugLine="lstPackage.Initialize";
Debug.ShouldStop(64);
b4amanifest._lstpackage.runVoidMethod ("Initialize");
 BA.debugLineNum = 136;BA.debugLine="Dim result As StringBuilder";
Debug.ShouldStop(128);
_result = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("result", _result);
 BA.debugLineNum = 137;BA.debugLine="result.Initialize";
Debug.ShouldStop(256);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="For i=0 To lstjar.Size - 1";
Debug.ShouldStop(512);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_lstjar.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 139;BA.debugLine="Dim f As String =  lstjar.Get(i)";
Debug.ShouldStop(1024);
_f = BA.ObjectToString(_lstjar.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 140;BA.debugLine="If f.EndsWith(\".jar\") Then";
Debug.ShouldStop(2048);
if (_f.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jar"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 141;BA.debugLine="result.Append(newfolder & lstjar.Get(i)).Append";
Debug.ShouldStop(4096);
_result.runMethod(false,"Append",(Object)(RemoteObject.concat(_newfolder,_lstjar.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(";")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 145;BA.debugLine="Return result.ToString";
Debug.ShouldStop(65536);
if (true) return _result.runMethod(true,"ToString");
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readjava() throws Exception{
try {
		Debug.PushSubsStack("ReadJava (b4amanifest) ","b4amanifest",4,b4amanifest.ba,b4amanifest.mostCurrent,212);
if (RapidSub.canDelegate("readjava")) { return com.tummosoft.builder.b4amanifest.remoteMe.runUserSub(false, "b4amanifest","readjava");}
RemoteObject _lstclass = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _checkdup = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _crrpackage = RemoteObject.createImmutable("");
RemoteObject _shortn = RemoteObject.createImmutable(false);
RemoteObject _pattern = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _lines = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _pck = RemoteObject.createImmutable("");
RemoteObject _arr = null;
RemoteObject _fcls = RemoteObject.createImmutable("");
RemoteObject _md = RemoteObject.createImmutable("");
 BA.debugLineNum = 212;BA.debugLine="Public Sub ReadJava() As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Dim lstClass As StringBuilder  '<attribute name=\"";
Debug.ShouldStop(1048576);
_lstclass = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("lstClass", _lstclass);
 BA.debugLineNum = 214;BA.debugLine="lstClass.Initialize";
Debug.ShouldStop(2097152);
_lstclass.runVoidMethod ("Initialize");
 BA.debugLineNum = 215;BA.debugLine="Dim checkdup As Map";
Debug.ShouldStop(4194304);
_checkdup = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("checkdup", _checkdup);
 BA.debugLineNum = 216;BA.debugLine="checkdup.Initialize";
Debug.ShouldStop(8388608);
_checkdup.runVoidMethod ("Initialize");
 BA.debugLineNum = 217;BA.debugLine="Dim crrPackage As String";
Debug.ShouldStop(16777216);
_crrpackage = RemoteObject.createImmutable("");Debug.locals.put("crrPackage", _crrpackage);
 BA.debugLineNum = 218;BA.debugLine="Dim shortn As Boolean = False";
Debug.ShouldStop(33554432);
_shortn = b4amanifest.__c.getField(true,"False");Debug.locals.put("shortn", _shortn);Debug.locals.put("shortn", _shortn);
 BA.debugLineNum = 219;BA.debugLine="Dim pattern As String = \"(class|public|extends|im";
Debug.ShouldStop(67108864);
_pattern = BA.ObjectToString("(class|public|extends|implements|final|private|try|if|\\u007b|throws|valueset)");Debug.locals.put("pattern", _pattern);Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 220;BA.debugLine="If dicjava.Size > 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",b4amanifest._dicjava.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 221;BA.debugLine="For i=0 To dicjava.Size - 1";
Debug.ShouldStop(268435456);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {b4amanifest._dicjava.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 222;BA.debugLine="Dim lines As List = File.ReadList(dicjava.Get(i";
Debug.ShouldStop(536870912);
_lines = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lines = b4amanifest.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(BA.ObjectToString(b4amanifest._dicjava.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("lines", _lines);Debug.locals.put("lines", _lines);
 BA.debugLineNum = 223;BA.debugLine="For Each line As String In lines";
Debug.ShouldStop(1073741824);
{
final RemoteObject group11 = _lines;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_line = BA.ObjectToString(group11.runMethod(false,"Get",index11));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 224;BA.debugLine="line = line.ToLowerCase";
Debug.ShouldStop(-2147483648);
_line = _line.runMethod(true,"toLowerCase");Debug.locals.put("line", _line);
 BA.debugLineNum = 225;BA.debugLine="If line.Contains(\"package\") Then";
Debug.ShouldStop(1);
if (_line.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("package"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="line = line.Replace(\"package\", \"\")";
Debug.ShouldStop(2);
_line = _line.runMethod(true,"replace",(Object)(BA.ObjectToString("package")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("line", _line);
 BA.debugLineNum = 227;BA.debugLine="Dim pck As String = line.Replace(\";\",\"\").Trim";
Debug.ShouldStop(4);
_pck = _line.runMethod(true,"replace",(Object)(BA.ObjectToString(";")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"trim");Debug.locals.put("pck", _pck);Debug.locals.put("pck", _pck);
 BA.debugLineNum = 229;BA.debugLine="If checkdup.ContainsKey(pck) = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_checkdup.runMethod(true,"ContainsKey",(Object)((_pck))),b4amanifest.__c.getField(true,"False"))) { 
 BA.debugLineNum = 230;BA.debugLine="checkdup.Put(pck, \"\")";
Debug.ShouldStop(32);
_checkdup.runVoidMethod ("Put",(Object)((_pck)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 231;BA.debugLine="lstPackage.Append(pck)";
Debug.ShouldStop(64);
b4amanifest._lstpackage.runVoidMethod ("Append",(Object)(_pck));
 };
 BA.debugLineNum = 233;BA.debugLine="line = line.Replace(\";\", \".\")";
Debug.ShouldStop(256);
_line = _line.runMethod(true,"replace",(Object)(BA.ObjectToString(";")),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("line", _line);
 BA.debugLineNum = 234;BA.debugLine="crrPackage = line.Trim";
Debug.ShouldStop(512);
_crrpackage = _line.runMethod(true,"trim");Debug.locals.put("crrPackage", _crrpackage);
 }else 
{ BA.debugLineNum = 237;BA.debugLine="else if line.Contains(\"class\") Then";
Debug.ShouldStop(4096);
if (_line.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("class"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 238;BA.debugLine="line = Regex.Replace(\"[{}<>\\/\\!\\=]\", line,\"\")";
Debug.ShouldStop(8192);
_line = b4amanifest.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("[{}<>\\/\\!\\=]")),(Object)(_line),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("line", _line);
 BA.debugLineNum = 239;BA.debugLine="Dim arr() As String = Regex.Split(\" \", line)";
Debug.ShouldStop(16384);
_arr = b4amanifest.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_line));Debug.locals.put("arr", _arr);Debug.locals.put("arr", _arr);
 BA.debugLineNum = 240;BA.debugLine="For Each fcls As String In arr";
Debug.ShouldStop(32768);
{
final RemoteObject group25 = _arr;
final int groupLen25 = group25.getField(true,"length").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_fcls = group25.getArrayElement(true,RemoteObject.createImmutable(index25));Debug.locals.put("fcls", _fcls);
Debug.locals.put("fcls", _fcls);
 BA.debugLineNum = 242;BA.debugLine="If (fcls.Contains(\"ioexception\") = False) An";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("ioexception"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("valueset"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("throws"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("try"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("static"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("class"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("public"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("extends"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("implements"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("final"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("private"))),b4amanifest.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_fcls.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("if"))),b4amanifest.__c.getField(true,"False")))))) { 
 BA.debugLineNum = 244;BA.debugLine="Dim md As String = crrPackage & fcls";
Debug.ShouldStop(524288);
_md = RemoteObject.concat(_crrpackage,_fcls);Debug.locals.put("md", _md);Debug.locals.put("md", _md);
 BA.debugLineNum = 246;BA.debugLine="If md.EndsWith(\".\") Then";
Debug.ShouldStop(2097152);
if (_md.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 247;BA.debugLine="md = md.SubString2(0, md.Length-1)";
Debug.ShouldStop(4194304);
_md = _md.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_md.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("md", _md);
 };
 BA.debugLineNum = 250;BA.debugLine="If checkdup.ContainsKey(md) = False And md";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_checkdup.runMethod(true,"ContainsKey",(Object)((_md))),b4amanifest.__c.getField(true,"False")) && RemoteObject.solveBoolean("!",_md,BA.ObjectToString(""))) { 
 BA.debugLineNum = 251;BA.debugLine="checkdup.Put(md, \"\")";
Debug.ShouldStop(67108864);
_checkdup.runVoidMethod ("Put",(Object)((_md)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 252;BA.debugLine="If shortn = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_shortn,b4amanifest.__c.getField(true,"True"))) { 
 BA.debugLineNum = 253;BA.debugLine="lstClass.Append($\"<attribute name=\"Main-C";
Debug.ShouldStop(268435456);
_lstclass.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<attribute name=\"Main-Class\" value=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_md))),RemoteObject.createImmutable("\"/>"))))).runVoidMethod ("Append",(Object)(b4amanifest.__c.getField(true,"CRLF")));
 BA.debugLineNum = 254;BA.debugLine="mainclass = md";
Debug.ShouldStop(536870912);
b4amanifest._mainclass = _md;
 BA.debugLineNum = 255;BA.debugLine="shortn = False";
Debug.ShouldStop(1073741824);
_shortn = b4amanifest.__c.getField(true,"False");Debug.locals.put("shortn", _shortn);
 BA.debugLineNum = 256;BA.debugLine="Exit";
Debug.ShouldStop(-2147483648);
if (true) break;
 }else {
 BA.debugLineNum = 258;BA.debugLine="lstClass.Append($\"<attribute name=\"Class-";
Debug.ShouldStop(2);
_lstclass.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("<attribute name=\"Class-Path\" value=\""),b4amanifest.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_md))),RemoteObject.createImmutable("\"/>"))))).runVoidMethod ("Append",(Object)(b4amanifest.__c.getField(true,"CRLF")));
 BA.debugLineNum = 259;BA.debugLine="shortn = False";
Debug.ShouldStop(4);
_shortn = b4amanifest.__c.getField(true,"False");Debug.locals.put("shortn", _shortn);
 BA.debugLineNum = 260;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 };
 BA.debugLineNum = 266;BA.debugLine="crrPackage = \"\"";
Debug.ShouldStop(512);
_crrpackage = BA.ObjectToString("");Debug.locals.put("crrPackage", _crrpackage);
 };
 }
}Debug.locals.put("fcls", _fcls);
;
 }else 
{ BA.debugLineNum = 269;BA.debugLine="else if line.Contains(\"@version\") Then";
Debug.ShouldStop(4096);
if (_line.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("@version"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 270;BA.debugLine="shortn = True";
Debug.ShouldStop(8192);
_shortn = b4amanifest.__c.getField(true,"True");Debug.locals.put("shortn", _shortn);
 }}}
;
 }
}Debug.locals.put("line", _line);
;
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 276;BA.debugLine="Return lstClass.ToString";
Debug.ShouldStop(524288);
if (true) return _lstclass.runMethod(true,"ToString");
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}