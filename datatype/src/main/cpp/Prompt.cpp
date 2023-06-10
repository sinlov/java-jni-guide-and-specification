#include "Prompt.h"
#include <stdio.h>

JNIEXPORT jstring JNICALL Java_com_sinlov_java_jni_1guide_102_datatype_Prompt_getLine
  (JNIEnv *env, jobject obj, jstring prompt)
{
    char buf[128];
    const jbyte *str;

    str = (*env)->GetStringUTFChars(env, prompt, NULL);
    if(str == NULL)
        return NULL;
    printf("%s", str);
    (*env)->ReleaseStringUTFChars(env, prompt, str);

    /* We assume here that the user does not type more than
     * 127 characters */
     scanf("%s", buf);
     return (*env)->NewStringUTF(env, buf);
}