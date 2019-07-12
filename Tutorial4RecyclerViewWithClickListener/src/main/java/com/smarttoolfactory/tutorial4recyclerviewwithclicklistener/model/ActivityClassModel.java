package com.smarttoolfactory.tutorial4recyclerviewwithclicklistener.model;

import android.support.annotation.NonNull;

public class ActivityClassModel {

    private Class clazz;

    public ActivityClassModel(@NonNull Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
