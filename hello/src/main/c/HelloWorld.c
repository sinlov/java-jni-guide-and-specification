#include <jni.h>
#include <stdio.h>
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     HelloWorld
 * Method:    print
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_sinlov_java_jniguide_hello_HelloWorld_print
  (JNIEnv * env, jobject obj) {
  printf("Hello World!\n");
}

#ifdef __cplusplus
}
#endif
