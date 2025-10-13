package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lw1 {
    public static void a(String str, Exception exc) {
        if (av1.a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }
}