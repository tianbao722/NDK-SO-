//
// Created by 文龙 on 2020/9/24.
//
#include "com_imageo_CUtile.h"

//C 的方法定义  方法名： Java_+报名+类名+方法名
JNIEXPORT jstring JNICALL Java_com_imageo_CUtile_name(JNIEnv *env,jclass class){
    return (*env )->NewStringUTF(env,"这是一个jni的方法");
}

JNIEXPORT void JNICALL Java_com_imageo_MyConn_callJni(JNIEnv *env,jobject obj){
     //找到需要回调的java类
     jclass classs = (*env)->FindClass(env,"com/imageo/MyConn");
     //判断是否存在
     if(classs == 0){
        //LOGI("Not Found CUtile class!");
        return;
     }
     jmethodID methodID = (*env)->GetMethodID(env,classs,"callJavaFromJni","()V");
     if(methodID == 0){
        //LOGI("Not Found methodID by class!");
        return;
     }
     //调用方法
     (*env)->CallVoidMethod(env,obj,methodID);
}