package com.tummosoft.builder.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_frmb4a{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
//BA.debugLineNum = 2;BA.debugLine="lblJavaPath.Top = 10dip"[frmB4A/General script]
views.get("lbljavapath").setTop((int)((10d * scale)));
//BA.debugLineNum = 3;BA.debugLine="lblJavaPath.Width = 80dip"[frmB4A/General script]
views.get("lbljavapath").setPrefWidth((int)((80d * scale)));
//BA.debugLineNum = 4;BA.debugLine="txtJavaPath.Top = lblJavaPath.Top"[frmB4A/General script]
views.get("txtjavapath").setTop((int)((views.get("lbljavapath").getTop())));
//BA.debugLineNum = 5;BA.debugLine="btJavaFolder.Top = lblJavaPath.Top"[frmB4A/General script]
views.get("btjavafolder").setTop((int)((views.get("lbljavapath").getTop())));
//BA.debugLineNum = 7;BA.debugLine="txtJavaPath.Left = lblJavaPath.Left + lblJavaPath.Width + 10dip"[frmB4A/General script]
views.get("txtjavapath").setLeft((int)((views.get("lbljavapath").getLeft())+(views.get("lbljavapath").getPrefWidth())+(10d * scale)));
//BA.debugLineNum = 8;BA.debugLine="txtJavaPath.Width = 50%x - (lblJavaPath.Width + 40dip + btJavaFolder.Width)"[frmB4A/General script]
views.get("txtjavapath").setPrefWidth((int)((50d / 100 * width)-((views.get("lbljavapath").getPrefWidth())+(40d * scale)+(views.get("btjavafolder").getPrefWidth()))));
//BA.debugLineNum = 9;BA.debugLine="btJavaFolder.Left = txtJavaPath.Left + txtJavaPath.Width + 10dip"[frmB4A/General script]
views.get("btjavafolder").setLeft((int)((views.get("txtjavapath").getLeft())+(views.get("txtjavapath").getPrefWidth())+(10d * scale)));
//BA.debugLineNum = 11;BA.debugLine="lblproject.Top = 10dip"[frmB4A/General script]
views.get("lblproject").setTop((int)((10d * scale)));
//BA.debugLineNum = 12;BA.debugLine="lblproject.Width = lblJavaPath.Width"[frmB4A/General script]
views.get("lblproject").setPrefWidth((int)((views.get("lbljavapath").getPrefWidth())));
//BA.debugLineNum = 13;BA.debugLine="txtProjectPath.Top = lblJavaPath.Top"[frmB4A/General script]
views.get("txtprojectpath").setTop((int)((views.get("lbljavapath").getTop())));
//BA.debugLineNum = 14;BA.debugLine="btJavaProject.Top = lblJavaPath.Top"[frmB4A/General script]
views.get("btjavaproject").setTop((int)((views.get("lbljavapath").getTop())));
//BA.debugLineNum = 16;BA.debugLine="lblproject.Left = 50%x + 10dip"[frmB4A/General script]
views.get("lblproject").setLeft((int)((50d / 100 * width)+(10d * scale)));
//BA.debugLineNum = 17;BA.debugLine="txtProjectPath.Left = lblproject.Left + lblproject.Width + 10dip"[frmB4A/General script]
views.get("txtprojectpath").setLeft((int)((views.get("lblproject").getLeft())+(views.get("lblproject").getPrefWidth())+(10d * scale)));
//BA.debugLineNum = 18;BA.debugLine="txtProjectPath.Width = 50%x - (lblproject.Width + 40dip + btJavaProject.Width)"[frmB4A/General script]
views.get("txtprojectpath").setPrefWidth((int)((50d / 100 * width)-((views.get("lblproject").getPrefWidth())+(40d * scale)+(views.get("btjavaproject").getPrefWidth()))));
//BA.debugLineNum = 19;BA.debugLine="btJavaProject.Left = txtProjectPath.Left + txtProjectPath.Width + 10dip"[frmB4A/General script]
views.get("btjavaproject").setLeft((int)((views.get("txtprojectpath").getLeft())+(views.get("txtprojectpath").getPrefWidth())+(10d * scale)));
//BA.debugLineNum = 21;BA.debugLine="lblJava8.Left = lblJavaPath.Left"[frmB4A/General script]
views.get("lbljava8").setLeft((int)((views.get("lbljavapath").getLeft())));
//BA.debugLineNum = 22;BA.debugLine="lblJava8.Top = lblJavaPath.Top + lblJavaPath.Height + 10dip"[frmB4A/General script]
views.get("lbljava8").setTop((int)((views.get("lbljavapath").getTop())+(views.get("lbljavapath").getPrefHeight())+(10d * scale)));
//BA.debugLineNum = 23;BA.debugLine="lblJava8.Width = lblJavaPath.Width"[frmB4A/General script]
views.get("lbljava8").setPrefWidth((int)((views.get("lbljavapath").getPrefWidth())));
//BA.debugLineNum = 24;BA.debugLine="txtJDK.Top = lblJava8.Top"[frmB4A/General script]
views.get("txtjdk").setTop((int)((views.get("lbljava8").getTop())));
//BA.debugLineNum = 25;BA.debugLine="txtJDK.Left = txtJavaPath.Left"[frmB4A/General script]
views.get("txtjdk").setLeft((int)((views.get("txtjavapath").getLeft())));
//BA.debugLineNum = 26;BA.debugLine="txtJDK.Width = txtJavaPath.Width"[frmB4A/General script]
views.get("txtjdk").setPrefWidth((int)((views.get("txtjavapath").getPrefWidth())));
//BA.debugLineNum = 27;BA.debugLine="btnJava8.Top = lblJava8.Top"[frmB4A/General script]
views.get("btnjava8").setTop((int)((views.get("lbljava8").getTop())));
//BA.debugLineNum = 28;BA.debugLine="btnJava8.Left = btJavaFolder.Left"[frmB4A/General script]
views.get("btnjava8").setLeft((int)((views.get("btjavafolder").getLeft())));
//BA.debugLineNum = 30;BA.debugLine="lblpackage.Left = lblJavaPath.Left"[frmB4A/General script]
views.get("lblpackage").setLeft((int)((views.get("lbljavapath").getLeft())));
//BA.debugLineNum = 31;BA.debugLine="txtPackage.Left = txtJavaPath.Left"[frmB4A/General script]
views.get("txtpackage").setLeft((int)((views.get("txtjavapath").getLeft())));
//BA.debugLineNum = 32;BA.debugLine="txtPackage.Width = txtJavaPath.Width"[frmB4A/General script]
views.get("txtpackage").setPrefWidth((int)((views.get("txtjavapath").getPrefWidth())));
//BA.debugLineNum = 34;BA.debugLine="lblproducts.Top = lblJavaPath.Top + lblJavaPath.Height + 10dip"[frmB4A/General script]
views.get("lblproducts").setTop((int)((views.get("lbljavapath").getTop())+(views.get("lbljavapath").getPrefHeight())+(10d * scale)));
//BA.debugLineNum = 35;BA.debugLine="cboProducts.Top = lblJava8.Top"[frmB4A/General script]
views.get("cboproducts").setTop((int)((views.get("lbljava8").getTop())));
//BA.debugLineNum = 37;BA.debugLine="lblproducts.Left = lblproject.Left"[frmB4A/General script]
views.get("lblproducts").setLeft((int)((views.get("lblproject").getLeft())));
//BA.debugLineNum = 38;BA.debugLine="lblproducts.Width = lblproject.Width"[frmB4A/General script]
views.get("lblproducts").setPrefWidth((int)((views.get("lblproject").getPrefWidth())));
//BA.debugLineNum = 40;BA.debugLine="cboProducts.Left = txtProjectPath.Left"[frmB4A/General script]
views.get("cboproducts").setLeft((int)((views.get("txtprojectpath").getLeft())));
//BA.debugLineNum = 41;BA.debugLine="cboProducts.Width = txtProjectPath.Width"[frmB4A/General script]
views.get("cboproducts").setPrefWidth((int)((views.get("txtprojectpath").getPrefWidth())));
//BA.debugLineNum = 43;BA.debugLine="lblClassName.Top = lblJava8.Top + lblJava8.Height + 10dip"[frmB4A/General script]
views.get("lblclassname").setTop((int)((views.get("lbljava8").getTop())+(views.get("lbljava8").getPrefHeight())+(10d * scale)));
//BA.debugLineNum = 44;BA.debugLine="lblClassName.Left = lblJava8.Left"[frmB4A/General script]
views.get("lblclassname").setLeft((int)((views.get("lbljava8").getLeft())));
//BA.debugLineNum = 45;BA.debugLine="lblClassName.Width = lblJava8.Width"[frmB4A/General script]
views.get("lblclassname").setPrefWidth((int)((views.get("lbljava8").getPrefWidth())));
//BA.debugLineNum = 47;BA.debugLine="txtClassName.Left = txtJDK.Left"[frmB4A/General script]
views.get("txtclassname").setLeft((int)((views.get("txtjdk").getLeft())));
//BA.debugLineNum = 48;BA.debugLine="txtClassName.Top = lblClassName.Top"[frmB4A/General script]
views.get("txtclassname").setTop((int)((views.get("lblclassname").getTop())));
//BA.debugLineNum = 49;BA.debugLine="txtClassName.Width = txtJDK.Width"[frmB4A/General script]
views.get("txtclassname").setPrefWidth((int)((views.get("txtjdk").getPrefWidth())));
//BA.debugLineNum = 51;BA.debugLine="lblpackage.Left = lblproducts.Left"[frmB4A/General script]
views.get("lblpackage").setLeft((int)((views.get("lblproducts").getLeft())));
//BA.debugLineNum = 52;BA.debugLine="txtPackage.Left = cboProducts.Left"[frmB4A/General script]
views.get("txtpackage").setLeft((int)((views.get("cboproducts").getLeft())));
//BA.debugLineNum = 53;BA.debugLine="txtPackage.Width = txtProjectPath.Width"[frmB4A/General script]
views.get("txtpackage").setPrefWidth((int)((views.get("txtprojectpath").getPrefWidth())));
//BA.debugLineNum = 55;BA.debugLine="btComplier.Left = txtClassName.Left"[frmB4A/General script]
views.get("btcomplier").setLeft((int)((views.get("txtclassname").getLeft())));
//BA.debugLineNum = 56;BA.debugLine="txtPOM.Left = lblClassName.Left + 10dip"[frmB4A/General script]
views.get("txtpom").setLeft((int)((views.get("lblclassname").getLeft())+(10d * scale)));
//BA.debugLineNum = 57;BA.debugLine="txtPOM.Width = 50%x - 20dip"[frmB4A/General script]
views.get("txtpom").setPrefWidth((int)((50d / 100 * width)-(20d * scale)));
//BA.debugLineNum = 59;BA.debugLine="txtPreview.Left = 50%x + 10dip"[frmB4A/General script]
views.get("txtpreview").setLeft((int)((50d / 100 * width)+(10d * scale)));
//BA.debugLineNum = 60;BA.debugLine="txtPreview.Width = 50%x - 20dip"[frmB4A/General script]
views.get("txtpreview").setPrefWidth((int)((50d / 100 * width)-(20d * scale)));
//BA.debugLineNum = 62;BA.debugLine="btnBuildDoc.Left = btComplier.Left + btComplier.Width + 20dip"[frmB4A/General script]
views.get("btnbuilddoc").setLeft((int)((views.get("btcomplier").getLeft())+(views.get("btcomplier").getPrefWidth())+(20d * scale)));
//BA.debugLineNum = 64;BA.debugLine="btnDownload.Left = btnBuildDoc.Left + btnBuildDoc.Width + 20dip"[frmB4A/General script]
views.get("btndownload").setLeft((int)((views.get("btnbuilddoc").getLeft())+(views.get("btnbuilddoc").getPrefWidth())+(20d * scale)));

}
}