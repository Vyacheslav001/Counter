package com.example.crow;

import android.app.Application;

public class Applicat extends Application {
    private Increment increment_crows;
    private Increment increment_cats;

    @Override
    public void onCreate() {
        super.onCreate();
        increment_crows = new Increment(0);
        increment_cats = new Increment(0);
    }

    public Increment getIncrement_crows() {
        return increment_crows;
    }

    public Increment getIncrement_cats() {
        return increment_cats;
    }
}