package com.imageo;

import android.content.Context;
import android.util.Log;

public class CUtile {
    public Context context;

    //只要见到代码里有native 绝对有SO库的使用
    public static native String name();
}
