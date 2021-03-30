package com.example.sabigps;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static MyApplication singleton;

    private List<Location> myLocations;

    public List<Location> getMyLocations() {
        return myLocations;
    }

    public MyApplication getInstance() {
        return singleton;
    }

    public void onCreate() {
        super.onCreate();
        singleton = this;
        myLocations = new ArrayList<>();
    }
}