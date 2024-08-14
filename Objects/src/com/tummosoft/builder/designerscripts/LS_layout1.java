package com.tummosoft.builder.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_layout1{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
views.get("lbljavapath").setTop((int)((10d * scale)));
views.get("lbljavapath").setPrefWidth((int)((70d * scale)));
views.get("txtjavapath").setTop((int)((views.get("lbljavapath").getTop())));
views.get("btjavafolder").setTop((int)((views.get("lbljavapath").getTop())));
views.get("txtjavapath").setLeft((int)((views.get("lbljavapath").getLeft())+(views.get("lbljavapath").getPrefWidth())+(10d * scale)));
views.get("txtjavapath").setPrefWidth((int)((50d / 100 * width)-((views.get("lbljavapath").getPrefWidth())+(40d * scale)+(views.get("btjavafolder").getPrefWidth()))));
views.get("btjavafolder").setLeft((int)((views.get("txtjavapath").getLeft())+(views.get("txtjavapath").getPrefWidth())+(10d * scale)));
views.get("lblproject").setTop((int)((10d * scale)));
views.get("lblproject").setPrefWidth((int)((views.get("lbljavapath").getPrefWidth())));
views.get("txtprojectpath").setTop((int)((views.get("lbljavapath").getTop())));
views.get("btjavaproject").setTop((int)((views.get("lbljavapath").getTop())));
views.get("lblproject").setLeft((int)((50d / 100 * width)+(10d * scale)));
views.get("txtprojectpath").setLeft((int)((views.get("lblproject").getLeft())+(views.get("lblproject").getPrefWidth())+(10d * scale)));
views.get("txtprojectpath").setPrefWidth((int)((50d / 100 * width)-((views.get("lblproject").getPrefWidth())+(40d * scale)+(views.get("btjavaproject").getPrefWidth()))));
views.get("btjavaproject").setLeft((int)((views.get("txtprojectpath").getLeft())+(views.get("txtprojectpath").getPrefWidth())+(10d * scale)));
views.get("lbljava8").setLeft((int)((views.get("lbljavapath").getLeft())));
views.get("lbljava8").setTop((int)((views.get("lbljavapath").getTop())+(views.get("lbljavapath").getPrefHeight())+(10d * scale)));
views.get("lbljava8").setPrefWidth((int)((views.get("lbljavapath").getPrefWidth())));
views.get("txtjava8").setTop((int)((views.get("lbljava8").getTop())));
views.get("txtjava8").setLeft((int)((views.get("txtjavapath").getLeft())));
views.get("txtjava8").setPrefWidth((int)((views.get("txtjavapath").getPrefWidth())));
views.get("btnjava8").setTop((int)((views.get("lbljava8").getTop())));
views.get("btnjava8").setLeft((int)((views.get("btjavafolder").getLeft())));
views.get("lblpackage").setLeft((int)((views.get("lbljavapath").getLeft())));
views.get("txtpackage").setLeft((int)((views.get("txtjavapath").getLeft())));
views.get("txtpackage").setPrefWidth((int)((views.get("txtjavapath").getPrefWidth())));
views.get("lblproducts").setTop((int)((views.get("lbljavapath").getTop())+(views.get("lbljavapath").getPrefHeight())+(10d * scale)));
views.get("cboproducts").setTop((int)((views.get("lbljava8").getTop())));
views.get("lblproducts").setLeft((int)((views.get("lblproject").getLeft())));
views.get("lblproducts").setPrefWidth((int)((views.get("lblproject").getPrefWidth())));
views.get("cboproducts").setLeft((int)((views.get("txtprojectpath").getLeft())));
views.get("cboproducts").setPrefWidth((int)((views.get("txtprojectpath").getPrefWidth())));
views.get("lblclassname").setTop((int)((views.get("lbljava8").getTop())+(views.get("lbljava8").getPrefHeight())+(10d * scale)));
views.get("lblclassname").setLeft((int)((views.get("lbljava8").getLeft())));
views.get("lblclassname").setPrefWidth((int)((views.get("lbljava8").getPrefWidth())));
views.get("txtclassname").setLeft((int)((views.get("txtjava8").getLeft())));
views.get("txtclassname").setTop((int)((views.get("lblclassname").getTop())));
views.get("txtclassname").setPrefWidth((int)((views.get("txtjava8").getPrefWidth())));
views.get("lblpackage").setLeft((int)((views.get("lblproducts").getLeft())));
views.get("txtpackage").setLeft((int)((views.get("cboproducts").getLeft())));
views.get("txtpackage").setPrefWidth((int)((views.get("txtprojectpath").getPrefWidth())));
views.get("btcomplier").setLeft((int)((views.get("txtclassname").getLeft())));
views.get("txtpom").setLeft((int)((views.get("lblclassname").getLeft())+(10d * scale)));
views.get("txtpom").setPrefWidth((int)((50d / 100 * width)-(20d * scale)));
views.get("txtpreview").setLeft((int)((50d / 100 * width)+(10d * scale)));
views.get("txtpreview").setPrefWidth((int)((50d / 100 * width)-(20d * scale)));
views.get("btnbuilddoc").setLeft((int)((views.get("btcomplier").getLeft())+(views.get("btcomplier").getPrefWidth())+(20d * scale)));
//BA.debugLineNum = 64;BA.debugLine="btnDownload.Left = btnBuildDoc.Left + btnBuildDoc.Width + 20dip"[Layout1/General script]
views.get("btndownload").setLeft((int)((views.get("btnbuilddoc").getLeft())+(views.get("btnbuilddoc").getPrefWidth())+(20d * scale)));

}
}