package com.imageo;

import android.util.Log;

public class MyConn {
    public native void callJni();

    //定义一个给jni调用的方法
    private void callJavaFromJni(){
        Log.i("111","calljavafromjni");
    }
}
