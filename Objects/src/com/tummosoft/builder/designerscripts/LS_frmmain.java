package com.tummosoft.builder.designerscripts;
import anywheresoftware.b4a.BA;


public class LS_frmmain{

public static void LS_general(anywheresoftware.b4a.BA ba, javafx.scene.Node parent, anywheresoftware.b4j.objects.LayoutValues lv,
anywheresoftware.b4j.objects.LayoutBuilder.LayoutData views, int width, int height, float scale)  throws Exception  {
;
views.get("treeproject").setPrefHeight((int)((100d / 100 * height)-(views.get("topmenu").getPrefHeight())));
views.get("treeproject").setTop((int)((views.get("topmenu").getPrefHeight())+(10d * scale)));

}
}