B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10
@EndOfDesignText@
'Static code module
Sub Process_Globals
	
	Private mysource As String
	Dim lbname As String
	Dim pth As String
	Public dicjava As List
	Dim cls As String
	Dim lstPackage As StringBuilder
	Dim mainclass As String
	Private btnDownload As Button
End Sub

Public Sub Init()
	dicjava.Initialize
	
	lstPackage.Initialize
End Sub

Public Sub BuildJAR(libname As String, source As String, sdk As String)
	Dim bld As StringBuilder
	mysource = source
	lbname = libname
	
	pth = source
	bld.Initialize
	
	FindJavaFile(source)
	Dim classs As String = ReadJava
	
	bld.Append($"<?xml version="1.0" encoding="UTF-8"?>
	<project default="main">	
	 <target name="info">
      <echo>Tummo Complier Pro</echo>
	  <echo>Building library...</echo>
	  <tstamp/>
	  <echo>*************</echo>
   </target>
   
    <!-- Deletes the existing build, docs And dist directory-->
    <target name="clean">
		<echo>Delete old folder...</echo>
		<echo>*************</echo>
        <delete dir="build/class" />
        <delete dir="build/dist" />        
    </target>

    <!-- Creates the  build, docs And dist directory-->
    <target name="makedir">
		<echo>make new folder...</echo>
		<echo>*************</echo>
        <mkdir dir="build/class" />
        <mkdir dir="build/dist" />        
    </target>
   		
  	 <!-- Compiles the java code (including the usage of library For JUnit -->
    <target name="compile" depends="clean, makedir">  
		<path id="classpath.base">                                                                                                                           
     <fileset dir="libs">                                                                                                                          
         <include name="**/*.jar" />                                                                                                          
     </fileset> 
	 <fileset dir="${sdk}">                                                                                                                          
         <include name="**/*.jar" />                                                                                                          
     </fileset> 
	                                                                                                                                   
  </path>  
		<jar jarfile="build/dist/${lbname}.jar" includes="**/*.java" basedir="src">
            <manifest>                
				${classs}
            </manifest>   
    	</jar>  		 
    </target>   
	
    <target name="main" depends="compile">
        <description>Main target</description>
    </target>
		</project>
"$)
	File.WriteString(pth, "build.xml", bld.ToString)
End Sub

Public Sub DOCletXML(source As String, libname As String, myappDir As String, java8 As String)
	
		

	Dim output As String = source & "\build\dist\" & libname & ".xml"
				Dim bld As StringBuilder
	bld.Initialize
	Dim cls As String = " classpath=" & QUOTE & "${clspath}" & QUOTE
	
	bld.Append($"<?xml version="1.0" encoding="UTF-8"?>
	<project default="main">		
	 <target name="info">
      <echo>Tummo Complier Pro</echo>
	  <echo>Building library...</echo>
	  <tstamp/>
	  <echo>*************</echo>
   </target>   
 
	 <target name="javadoc">	
	 <path id="classpath.base">                                                                                                                           
     <fileset dir="libs">                                                                                                                          
         <include name="**/*.jar" />                                                                                                          
     </fileset>   
	  <fileset dir="build/dist">                                                                                                                          
         <include name="**/*.jar" />                                                                                                          
     </fileset>  
  </path>   	
   <path id="sourcepath.base">                                                                                                                           
     <fileset dir="src">                                                                                                                          
         <include name="**/*.java" />                                                                                                          
     </fileset>  
	  <fileset dir="C:/Users/Admin/AppData/Local/Android/Sdk/sources/android-29/android/view">                                                                                                                          
         <include name="**/*.java" />                                                                                                          
     </fileset>   	                                                                                                                                 
  </path>  
  <property name="clspath" refid="classpath.base"/>
  <property name="source" refid="sourcepath.base"/>
        <javadoc access="public" additionalparam="-b4atarget ${output}" ${cls} sourcepath="src" packagenames="${lstPackage.ToString}">			              
            <doclet name="BADoclet" path="${myappDir}"/>
        </javadoc>
    </target>
	
    <target name="main" depends="javadoc">
        <description>Main target</description>
    </target>
		</project>
"$)
	File.WriteString(source, "doc.xml", bld.ToString)
End Sub

Private Sub ReadAllListFile(source As String, newfolder As String) As String
	Dim etx As String = newfolder.Replace("/","\")
	Dim lstjar As List = File.ListFiles(File.Combine(source, etx))
	lstPackage.Initialize
	Dim result As StringBuilder
	result.Initialize
	For i=0 To lstjar.Size - 1
		Dim f As String =  lstjar.Get(i)
		If f.EndsWith(".jar") Then
			result.Append(newfolder & lstjar.Get(i)).Append(";")
		End If
	Next
	
	Return result.ToString
End Sub

Public Sub DownloadLibs(source As String, antpath As String, url() As String)
	 
	Dim repo As StringBuilder
	repo.Initialize
	If url.Length > 0 Then
		For i=0 To url.Length - 1
			repo.Append($"<tstamp/>
	  		<echo>Downloading... ${url(i)}</echo>
			<get src="${url(i)}"
             dest="libs" usetimestamp="true" />"$).Append(CRLF)
		Next
	End If
	 
	Dim pom As StringBuilder
	pom.Initialize
	pom.Append($"
	<project xmlns:ivy="antlib:org.apache.ivy.ant" default="download">
    <property name="lib.dir" value="libs" />

    <!-- output directories and files -->
    <property name="build.dir" value="build" />
    <property name="app.classes.dir" value="build/classes" />
    
    <!-- Ivy-related settings -->
    <property name="ivy.install.version" value="2.4.0" />
    <condition property="ivy.home" value="${antpath}/lib">
        <isset property="env.IVY_HOME" />
    </condition>
    <property name="ivy.home" value="${antpath}/.ant" />
    <property name="ivy.jar.dir" value="${antpath}/lib" />
    <property name="ivy.jar.file" value="${antpath}/ivy-2.5.2.jar.jar" />

    <presetdef name="project.javac">
        <javac debug="on" includeantruntime="false" />
    </presetdef>
	
    <target name="download" unless="offline">        
       ${repo.ToString}
    </target>

</project>
	"$)
	
	File.WriteString(source, "download.xml", pom.ToString)
End Sub


Public Sub FindJavaFile(sourcepath As String) As String
		
	Dim lstFile As List = File.ListFiles(sourcepath)
	
	For i=0 To lstFile.Size - 1
		Dim dname As String = lstFile.Get(i)
		Dim fd As String = File.Combine(sourcepath, dname)
		If File.IsDirectory(fd,"") = False Then
			If fd.EndsWith(".java") Then
				dicjava.Add(fd)
			End If
		Else
			FindJavaFile(fd)
		End If
	Next
End Sub

Public Sub ReadJava() As String
	Dim lstClass As StringBuilder  '<attribute name="Main-Class" value="b4x.example.FirstLib"/>
	lstClass.Initialize
	Dim checkdup As Map
	checkdup.Initialize
	Dim crrPackage As String
	Dim shortn As Boolean = False
	Dim pattern As String = "(class|public|extends|implements|final|private|try|if|\u007b|throws|valueset)"
	If dicjava.Size > 0 Then
		For i=0 To dicjava.Size - 1
			Dim lines As List = File.ReadList(dicjava.Get(i), "")
			For Each line As String In lines
				line = line.ToLowerCase
				If line.Contains("package") Then
					line = line.Replace("package", "")
					Dim pck As String = line.Replace(";","").Trim
					
					If checkdup.ContainsKey(pck) = False Then
						checkdup.Put(pck, "")
						lstPackage.Append(pck)
					End If
					line = line.Replace(";", ".")
					crrPackage = line.Trim
					
					'lstClass
				else if line.Contains("class") Then
					line = Regex.Replace("[{}<>\/\!\=]", line,"")
					Dim arr() As String = Regex.Split(" ", line)
					For Each fcls As String In arr
						
						If (fcls.Contains("ioexception") = False) And (fcls.Contains("valueset") = False) And (fcls.Contains("throws") = False) And (fcls.Contains("try") = False) And (fcls.Contains("static") = False) And (fcls.Contains("class") = False) And (fcls.Contains("public") = False) And (fcls.Contains("extends") = False) And (fcls.Contains("implements") = False) And (fcls.Contains("final") = False) And (fcls.Contains("private") = False) And (fcls.Contains("if") = False) Then
							
							Dim md As String = crrPackage & fcls
							
							If md.EndsWith(".") Then
								md = md.SubString2(0, md.Length-1)
							End If
							
							If checkdup.ContainsKey(md) = False And md <> ""  Then
								checkdup.Put(md, "")
								If shortn = True Then
									lstClass.Append($"<attribute name="Main-Class" value="${md}"/>"$).Append(CRLF)
									mainclass = md
									shortn = False
									Exit
								Else
									lstClass.Append($"<attribute name="Class-Path" value="${md}"/>"$).Append(CRLF)
									shortn = False
									Exit
								End If
								
							End If
							
							
							crrPackage = ""
						End If
					Next
				else if line.Contains("@version") Then
					shortn = True
				End If
			Next
		Next
	End If
	
	Return lstClass.ToString
End Sub

Public Sub CreateBat(java8 As String, source As String)
	Dim cmd As StringBuilder
	cmd.Initialize
	cmd.Append($"@ echo off
set ANT_HOME=${File.DirApp}\ant
set JAVA_HOME=${java8}
set PATH=%JAVA_HOME%\bin;%ANT_HOME%\bin;%PATH%
: DEFAULT
call ant -f %1
	"$)
	
	File.WriteString(source, "builddoclet.bat", cmd.ToString)
End Sub
