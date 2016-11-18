#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_catbusiness_karim_cattherapy_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
