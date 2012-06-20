package com.the9.samxu.phone02;

import org.apache.cordova.*;
import android.app.Activity;
import android.os.Bundle;

public class Phonegap02Activity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/dice2.html");
    }
}