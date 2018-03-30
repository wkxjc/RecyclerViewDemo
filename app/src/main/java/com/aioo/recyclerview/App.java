package com.aioo.recyclerview;

import android.graphics.drawable.Drawable;

public class App {
    private String name;//app名称
    private Drawable icon;//app图标

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }
}
