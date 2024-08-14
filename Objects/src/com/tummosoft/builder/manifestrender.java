package com.tummosoft.builder;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class manifestrender extends Object{
public static manifestrender mostCurrent = new manifestrender();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("com.tummosoft.builder", "com.tummosoft.builder.manifestrender", null);
		ba.loadHtSubs(manifestrender.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "com.tummosoft.builder.manifestrender", ba);
		}
	}
    public static Class<?> getObject() {
		return manifestrender.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _mysource = "";
public static String _lbname = "";
public static String _pth = "";
public static anywheresoftware.b4a.objects.collections.List _dicjava = null;
public static String _cls = "";
public static anywheresoftware.b4a.keywords.StringBuilderWrapper _lstpackage = null;
public static String _mainclass = "";
public static anywheresoftware.b4j.objects.ButtonWrapper _btndownload = null;
public static com.tummosoft.builder.main _main = null;
public static com.tummosoft.builder.testfirstlib _testfirstlib = null;
public static com.tummosoft.builder.b4amanifest _b4amanifest = null;
public static com.tummosoft.builder.buildb4a _buildb4a = null;
public static String  _init() throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "init", false))
	 {return ((String) Debug.delegate(ba, "init", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Init()";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="dicjava.Initialize";
_dicjava.Initialize();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="lstPackage.Initialize";
_lstpackage.Initialize();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return "";
}
public static String  _buildjar(String _libname,String _source) throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "buildjar", false))
	 {return ((String) Debug.delegate(ba, "buildjar", new Object[] {_libname,_source}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _bld = null;
String _classs = "";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub BuildJAR(libname As String, source As S";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim bld As StringBuilder";
_bld = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="mysource = source";
_mysource = _source;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="lbname = libname";
_lbname = _libname;
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="pth = source";
_pth = _source;
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="bld.Initialize";
_bld.Initialize();
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="FindJavaFile(source)";
_findjavafile(_source);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim classs As String = ReadJava";
_classs = _readjava();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="bld.Append($\"<?xml version=\"1.0\" encoding=\"UTF-8\"";
_bld.Append(("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+"	<project default=\"main\">	\n"+"	 <target name=\"info\">\n"+"      <echo>Tummo Complier Pro</echo>\n"+"	  <echo>Building library...</echo>\n"+"	  <tstamp/>\n"+"	  <echo>*************</echo>\n"+"   </target>\n"+"   \n"+"    <!-- Deletes the existing build, docs And dist directory-->\n"+"    <target name=\"clean\">\n"+"		<echo>Delete old folder...</echo>\n"+"		<echo>*************</echo>\n"+"        <delete dir=\"build/class\" />\n"+"        <delete dir=\"build/dist\" />        \n"+"    </target>\n"+"\n"+"    <!-- Creates the  build, docs And dist directory-->\n"+"    <target name=\"makedir\">\n"+"		<echo>make new folder...</echo>\n"+"		<echo>*************</echo>\n"+"        <mkdir dir=\"build/class\" />\n"+"        <mkdir dir=\"build/dist\" />        \n"+"    </target>\n"+"   		\n"+"  	 <!-- Compiles the java code (including the usage of library For JUnit -->\n"+"    <target name=\"compile\" depends=\"clean, makedir\">  \n"+"		<path id=\"classpath.base\">                                                                                                                           \n"+"     <fileset dir=\"libs\">                                                                                                                          \n"+"         <include name=\"**/*.jar\" />                                                                                                          \n"+"     </fileset>                                                                                                                                   \n"+"  </path>  \n"+"		<jar jarfile=\"build/dist/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbname))+".jar\" includes=\"**/*.java\" basedir=\"src\">\n"+"            <manifest>                \n"+"				"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_classs))+"\n"+"            </manifest>   \n"+"    	</jar>  		 \n"+"    </target>   \n"+"	\n"+"    <target name=\"main\" depends=\"compile\">\n"+"        <description>Main target</description>\n"+"    </target>\n"+"		</project>\n"+""));
RDebugUtils.currentLine=1048631;
 //BA.debugLineNum = 1048631;BA.debugLine="File.WriteString(pth, \"build.xml\", bld.ToString)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_pth,"build.xml",_bld.ToString());
RDebugUtils.currentLine=1048632;
 //BA.debugLineNum = 1048632;BA.debugLine="End Sub";
return "";
}
public static String  _downloadlibs(String _source,String _antpath,String[] _url) throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "downloadlibs", false))
	 {return ((String) Debug.delegate(ba, "downloadlibs", new Object[] {_source,_antpath,_url}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _repo = null;
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _pom = null;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub DownloadLibs(source As String, antpath";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim repo As StringBuilder";
_repo = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="repo.Initialize";
_repo.Initialize();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="If url.Length > 0 Then";
if (_url.length>0) { 
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="For i=0 To url.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_url.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="repo.Append($\"<tstamp/> 	  		<echo>Downloading.";
_repo.Append(("<tstamp/>\n"+"	  		<echo>Downloading... "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_url[_i]))+"</echo>\n"+"			<get src=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_url[_i]))+"\"\n"+"             dest=\"libs\" usetimestamp=\"true\" />")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }
};
 };
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="Dim pom As StringBuilder";
_pom = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="pom.Initialize";
_pom.Initialize();
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="pom.Append($\" 	<project xmlns:ivy=\"antlib:org.apa";
_pom.Append(("\n"+"	<project xmlns:ivy=\"antlib:org.apache.ivy.ant\" default=\"download\">\n"+"    <property name=\"lib.dir\" value=\"libs\" />\n"+"\n"+"    <!-- output directories and files -->\n"+"    <property name=\"build.dir\" value=\"build\" />\n"+"    <property name=\"app.classes.dir\" value=\"build/classes\" />\n"+"    \n"+"    <!-- Ivy-related settings -->\n"+"    <property name=\"ivy.install.version\" value=\"2.4.0\" />\n"+"    <condition property=\"ivy.home\" value=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_antpath))+"/lib\">\n"+"        <isset property=\"env.IVY_HOME\" />\n"+"    </condition>\n"+"    <property name=\"ivy.home\" value=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_antpath))+"/.ant\" />\n"+"    <property name=\"ivy.jar.dir\" value=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_antpath))+"/lib\" />\n"+"    <property name=\"ivy.jar.file\" value=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_antpath))+"/ivy-2.5.2.jar.jar\" />\n"+"\n"+"    <presetdef name=\"project.javac\">\n"+"        <javac debug=\"on\" includeantruntime=\"false\" />\n"+"    </presetdef>\n"+"	\n"+"    <target name=\"download\" unless=\"offline\">        \n"+"       "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repo.ToString()))+"\n"+"    </target>\n"+"\n"+"</project>\n"+"	"));
RDebugUtils.currentLine=1245227;
 //BA.debugLineNum = 1245227;BA.debugLine="File.WriteString(source, \"download.xml\", pom.ToSt";
anywheresoftware.b4a.keywords.Common.File.WriteString(_source,"download.xml",_pom.ToString());
RDebugUtils.currentLine=1245228;
 //BA.debugLineNum = 1245228;BA.debugLine="End Sub";
return "";
}
public static String  _docletxml(String _source,String _libname,String _myappdir,String _java8) throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "docletxml", false))
	 {return ((String) Debug.delegate(ba, "docletxml", new Object[] {_source,_libname,_myappdir,_java8}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _bld = null;
String _output = "";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub DOCletXML(source As String, libname As";
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim bld As StringBuilder";
_bld = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="bld.Initialize";
_bld.Initialize();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim output As String = source & \"\\build\\dist\\\" &";
_output = _source+"\\build\\dist\\"+_libname+".xml";
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Dim cls As String = \" classpath=\" & QUOTE & \"${cl";
_cls = " classpath="+anywheresoftware.b4a.keywords.Common.QUOTE+"${clspath}"+anywheresoftware.b4a.keywords.Common.QUOTE;
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="bld.Append($\"<?xml version=\"1.0\" encoding=\"UTF-8\"";
_bld.Append(("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+"	<project default=\"main\">		\n"+"	 <target name=\"info\">\n"+"      <echo>Tummo Complier Pro</echo>\n"+"	  <echo>Building library...</echo>\n"+"	  <tstamp/>\n"+"	  <echo>*************</echo>\n"+"   </target>   \n"+" \n"+"	 <target name=\"javadoc\">	\n"+"	 <path id=\"classpath.base\">                                                                                                                           \n"+"     <fileset dir=\"libs\">                                                                                                                          \n"+"         <include name=\"**/*.jar\" />                                                                                                          \n"+"     </fileset>   \n"+"	  <fileset dir=\"build/dist\">                                                                                                                          \n"+"         <include name=\"**/*.jar\" />                                                                                                          \n"+"     </fileset>  	 	 \n"+"  </path>   	\n"+"   <path id=\"sourcepath.base\">                                                                                                                           \n"+"     <fileset dir=\"src\">                                                                                                                          \n"+"         <include name=\"**/*.java\" />                                                                                                          \n"+"     </fileset>                                                                                                                                   \n"+"  </path>  \n"+"  <property name=\"clspath\" refid=\"classpath.base\"/>\n"+"  <property name=\"source\" refid=\"sourcepath.base\"/>\n"+"        <javadoc access=\"public\" additionalparam=\"-b4atarget "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_output))+"\" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cls))+" sourcepath=\"src\" packagenames=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lstpackage.ToString()))+"\">			              \n"+"            <doclet name=\"BADoclet\" path=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_myappdir))+"\"/>\n"+"        </javadoc>\n"+"    </target>\n"+"	\n"+"    <target name=\"main\" depends=\"javadoc\">\n"+"        <description>Main target</description>\n"+"    </target>\n"+"		</project>\n"+""));
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="File.WriteString(source, \"doc.xml\", bld.ToString)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_source,"doc.xml",_bld.ToString());
RDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="End Sub";
return "";
}
public static String  _createbat(String _java8,String _source) throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "createbat", false))
	 {return ((String) Debug.delegate(ba, "createbat", new Object[] {_java8,_source}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _cmd = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub CreateBat(java8 As String, source As St";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim cmd As StringBuilder";
_cmd = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="cmd.Append($\"@ echo off set ANT_HOME=${File.DirAp";
_cmd.Append(("@ echo off\n"+"set ANT_HOME="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.getDirApp()))+"\\ant\n"+"set JAVA_HOME="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_java8))+"\n"+"set PATH=%JAVA_HOME%\\bin;%ANT_HOME%\\bin;%PATH%\n"+": DEFAULT\n"+"call ant -f %1\n"+"	"));
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="File.WriteString(source, \"builddoclet.bat\", cmd.T";
anywheresoftware.b4a.keywords.Common.File.WriteString(_source,"builddoclet.bat",_cmd.ToString());
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="End Sub";
return "";
}
public static String  _findjavafile(String _sourcepath) throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "findjavafile", false))
	 {return ((String) Debug.delegate(ba, "findjavafile", new Object[] {_sourcepath}));}
anywheresoftware.b4a.objects.collections.List _lstfile = null;
int _i = 0;
String _dname = "";
String _fd = "";
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub FindJavaFile(sourcepath As String) As S";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim lstFile As List = File.ListFiles(sourcepath)";
_lstfile = new anywheresoftware.b4a.objects.collections.List();
_lstfile = anywheresoftware.b4a.keywords.Common.File.ListFiles(_sourcepath);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="For i=0 To lstFile.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_lstfile.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim dname As String = lstFile.Get(i)";
_dname = BA.ObjectToString(_lstfile.Get(_i));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Dim fd As String = File.Combine(sourcepath, dnam";
_fd = anywheresoftware.b4a.keywords.Common.File.Combine(_sourcepath,_dname);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="If File.IsDirectory(fd,\"\") = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_fd,"")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="If fd.EndsWith(\".java\") Then";
if (_fd.endsWith(".java")) { 
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="dicjava.Add(fd)";
_dicjava.Add((Object)(_fd));
 };
 }else {
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="FindJavaFile(fd)";
_findjavafile(_fd);
 };
 }
};
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="End Sub";
return "";
}
public static String  _readjava() throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "readjava", false))
	 {return ((String) Debug.delegate(ba, "readjava", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _lstclass = null;
anywheresoftware.b4a.objects.collections.Map _checkdup = null;
String _crrpackage = "";
boolean _shortn = false;
String _pattern = "";
int _i = 0;
anywheresoftware.b4a.objects.collections.List _lines = null;
String _line = "";
String _pck = "";
String[] _arr = null;
String _fcls = "";
String _md = "";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub ReadJava() As String";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim lstClass As StringBuilder  '<attribute name=\"";
_lstclass = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="lstClass.Initialize";
_lstclass.Initialize();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim checkdup As Map";
_checkdup = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="checkdup.Initialize";
_checkdup.Initialize();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim crrPackage As String";
_crrpackage = "";
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Dim shortn As Boolean = False";
_shortn = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Dim pattern As String = \"[a-z]|[A-Z]|[\\.]\"";
_pattern = "[a-z]|[A-Z]|[\\.]";
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="If dicjava.Size > 0 Then";
if (_dicjava.getSize()>0) { 
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="For i=0 To dicjava.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_dicjava.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Dim lines As List = File.ReadList(dicjava.Get(i";
_lines = new anywheresoftware.b4a.objects.collections.List();
_lines = anywheresoftware.b4a.keywords.Common.File.ReadList(BA.ObjectToString(_dicjava.Get(_i)),"");
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="For Each line As String In lines";
{
final anywheresoftware.b4a.BA.IterableList group11 = _lines;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_line = BA.ObjectToString(group11.Get(index11));
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="line = line.ToLowerCase";
_line = _line.toLowerCase();
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="If line.Contains(\"package\") Then";
if (_line.contains("package")) { 
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="line = line.Replace(\"package\", \"\")";
_line = _line.replace("package","");
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="Dim pck As String = line.Replace(\";\",\"\").Trim";
_pck = _line.replace(";","").trim();
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="If checkdup.ContainsKey(pck) = False Then";
if (_checkdup.ContainsKey((Object)(_pck))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="checkdup.Put(pck, \"\")";
_checkdup.Put((Object)(_pck),(Object)(""));
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="lstPackage.Append(pck)";
_lstpackage.Append(_pck);
 };
RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="line = line.Replace(\";\", \".\")";
_line = _line.replace(";",".");
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="crrPackage = line.Trim";
_crrpackage = _line.trim();
 }else 
{RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="else if line.Contains(\"class\") Then";
if (_line.contains("class")) { 
RDebugUtils.currentLine=1376282;
 //BA.debugLineNum = 1376282;BA.debugLine="line = Regex.Replace(\"[{}<>\\/\\!\\=]\", line,\"\")";
_line = anywheresoftware.b4a.keywords.Common.Regex.Replace("[{}<>\\/\\!\\=]",_line,"");
RDebugUtils.currentLine=1376283;
 //BA.debugLineNum = 1376283;BA.debugLine="Dim arr() As String = Regex.Split(\" \", line)";
_arr = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_line);
RDebugUtils.currentLine=1376284;
 //BA.debugLineNum = 1376284;BA.debugLine="For Each fcls As String In arr";
{
final String[] group25 = _arr;
final int groupLen25 = group25.length
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_fcls = group25[index25];
RDebugUtils.currentLine=1376286;
 //BA.debugLineNum = 1376286;BA.debugLine="If (fcls.Contains(\"ioexception\") = False) An";
if ((_fcls.contains("ioexception")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("valueset")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("throws")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("try")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("static")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("class")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("public")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("extends")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("implements")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("final")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("private")==anywheresoftware.b4a.keywords.Common.False) && (_fcls.contains("if")==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=1376288;
 //BA.debugLineNum = 1376288;BA.debugLine="Dim md As String = crrPackage & fcls";
_md = _crrpackage+_fcls;
RDebugUtils.currentLine=1376290;
 //BA.debugLineNum = 1376290;BA.debugLine="If checkdup.ContainsKey(md) = False And md";
if (_checkdup.ContainsKey((Object)(_md))==anywheresoftware.b4a.keywords.Common.False && (_md).equals("") == false && _md.contains(".")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1376291;
 //BA.debugLineNum = 1376291;BA.debugLine="checkdup.Put(md, \"\")";
_checkdup.Put((Object)(_md),(Object)(""));
RDebugUtils.currentLine=1376292;
 //BA.debugLineNum = 1376292;BA.debugLine="If shortn = True Then";
if (_shortn==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1376293;
 //BA.debugLineNum = 1376293;BA.debugLine="lstClass.Append($\"<attribute name=\"Main-C";
_lstclass.Append(("<attribute name=\"Main-Class\" value=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_md))+"\"/>")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376294;
 //BA.debugLineNum = 1376294;BA.debugLine="mainclass = md";
_mainclass = _md;
RDebugUtils.currentLine=1376295;
 //BA.debugLineNum = 1376295;BA.debugLine="shortn = False";
_shortn = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1376296;
 //BA.debugLineNum = 1376296;BA.debugLine="Exit";
if (true) break;
 }else {
RDebugUtils.currentLine=1376298;
 //BA.debugLineNum = 1376298;BA.debugLine="lstClass.Append($\"<attribute name=\"Class-";
_lstclass.Append(("<attribute name=\"Class-Path\" value=\""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_md))+"\"/>")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376299;
 //BA.debugLineNum = 1376299;BA.debugLine="shortn = False";
_shortn = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1376300;
 //BA.debugLineNum = 1376300;BA.debugLine="Exit";
if (true) break;
 };
 };
RDebugUtils.currentLine=1376306;
 //BA.debugLineNum = 1376306;BA.debugLine="crrPackage = \"\"";
_crrpackage = "";
 };
 }
};
 }else 
{RDebugUtils.currentLine=1376309;
 //BA.debugLineNum = 1376309;BA.debugLine="else if line.Contains(\"@version\") Then";
if (_line.contains("@version")) { 
RDebugUtils.currentLine=1376310;
 //BA.debugLineNum = 1376310;BA.debugLine="shortn = True";
_shortn = anywheresoftware.b4a.keywords.Common.True;
 }}}
;
 }
};
 }
};
 };
RDebugUtils.currentLine=1376316;
 //BA.debugLineNum = 1376316;BA.debugLine="Return lstClass.ToString";
if (true) return _lstclass.ToString();
RDebugUtils.currentLine=1376317;
 //BA.debugLineNum = 1376317;BA.debugLine="End Sub";
return "";
}
public static String  _readalllistfile(String _source,String _newfolder) throws Exception{
RDebugUtils.currentModule="manifestrender";
if (Debug.shouldDelegate(ba, "readalllistfile", false))
	 {return ((String) Debug.delegate(ba, "readalllistfile", new Object[] {_source,_newfolder}));}
String _etx = "";
anywheresoftware.b4a.objects.collections.List _lstjar = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _i = 0;
String _f = "";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub ReadAllListFile(source As String, newf";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim etx As String = newfolder.Replace(\"/\",\"\\\")";
_etx = _newfolder.replace("/","\\");
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim lstjar As List = File.ListFiles(File.Combine(";
_lstjar = new anywheresoftware.b4a.objects.collections.List();
_lstjar = anywheresoftware.b4a.keywords.Common.File.ListFiles(anywheresoftware.b4a.keywords.Common.File.Combine(_source,_etx));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="For i=0 To lstjar.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_lstjar.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="Dim f As String =  lstjar.Get(i)";
_f = BA.ObjectToString(_lstjar.Get(_i));
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="If f.EndsWith(\".jar\") Then";
if (_f.endsWith(".jar")) { 
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="result.Append(newfolder & lstjar.Get(i)).Append";
_result.Append(_newfolder+BA.ObjectToString(_lstjar.Get(_i))).Append(";");
 };
 }
};
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="Return result.ToString";
if (true) return _result.ToString();
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="End Sub";
return "";
}
}