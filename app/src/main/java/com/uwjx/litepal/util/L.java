package com.uwjx.litepal.util;

import android.util.Log;

public class L {

    private final static boolean isDebug = true;

    public static final String TAG = "uwjx";

    public static void d(String message){
        if(isDebug){
            Log.w(TAG , message);
        }
    }
}
