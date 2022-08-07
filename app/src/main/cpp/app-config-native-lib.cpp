#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
JAVA_com_inc_clean_architecturemvvm_config_ConfigurationResolver_getSecureApiKey(
        JNIEnv *env,
        jobject /* this */) {
    std::string data = "GtbLhSNJWqJmQLO7fqXly8qKKPpxxHQr";
    return env->NewStringUTF(data.c_str());
}





