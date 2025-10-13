package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mw1 {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void c(lv1 lv1Var, iv1 iv1Var, kv1 kv1Var) {
        if (lv1Var == lv1.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (iv1Var == iv1.DEFINED_BY_JAVASCRIPT && lv1Var == lv1.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (kv1Var == kv1.DEFINED_BY_JAVASCRIPT && lv1Var == lv1.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }
}