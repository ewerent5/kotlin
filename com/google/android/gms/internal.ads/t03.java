package com.google.android.gms.internal.ads;

import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t03 {
    public static void a(String str) {
        if (v03.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (v03.a >= 18) {
            Trace.endSection();
        }
    }
}