package com.tummosoft.builder.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_frmprojects{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
views.get("menutop").setLeft((int)(0d));
views.get("menutop").setTop((int)(0d));
views.get("treeproject").setLeft((int)(0d));
views.get("treeproject").setTop((int)((views.get("menutop").getPrefHeight())));
views.get("treeproject").setPrefHeight((int)((100d / 100 * height)));
views.get("tabcode").setLeft((int)((views.get("treeproject").getLeft())+(views.get("treeproject").getPrefWidth())));
views.get("tabcode").setTop((int)((views.get("menutop").getPrefHeight())));
views.get("tabcode").setPrefWidth((int)((100d / 100 * width)-(views.get("tabcode").getLeft())));
views.get("tabcode").setPrefHeight((int)((100d / 100 * height)));

}
}