package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k22 {
    static Object[] a(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            b(objArr[i3], i3);
        }
        return objArr;
    }

    static Object b(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}