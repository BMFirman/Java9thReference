/* This file contains the C version of the test() method */

#include <jni.h>
#include <NativeDemo.h>
#include <stdio.h>

JNIEXPORT void JNICALL Java_NativeDemo_test(JNIEnv *env, jobject obj) {
    jclass cls;
    jfieldID fid;
    jint;

    printf("Starting the native method.\n");
    cls = (*env)->GetObjectClass(env, obj);
    fid = (*env)->GetFieldID(env, cls, "i", "I");

    if(fid == 0) {
        printf("Could not get field id");
        return;
    }
    i = (*env)->GetIntField(env, obj, fid);
    printf("i = %d\n", i);
    (*env)->SetIntField(env, ob, fid, 2*1);
    printf("Ending the native method.");
}