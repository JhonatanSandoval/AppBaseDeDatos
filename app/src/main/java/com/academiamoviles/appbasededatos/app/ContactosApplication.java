package com.academiamoviles.appbasededatos.app;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class ContactosApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }

}
