package com.example.ndk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.imageo.CUtile;
import com.imageo.MyConn;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    //静态代码块,整个程序最先执行，只执行一次
    static {
        System.loadLibrary("CUtile");
    }
    private void initView() {
        String name = CUtile.name();
        Log.i("111", "name :"+name);
        //调用C的方法
        MyConn myConn = new MyConn();
        myConn.callJni();
    }
}