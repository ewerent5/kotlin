package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c22<K, V> {
    Object[] a = new Object[14];

    /* renamed from: b, reason: collision with root package name */
    int f5246b = 0;

    c22(int i2) {
    }

    public final c22<K, V> a(K k2, V v) {
        int i2 = this.f5246b + 1;
        int i3 = i2 + i2;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i3 > length) {
            this.a = Arrays.copyOf(objArr, x12.b(length, i3));
        }
        s12.a(k2, v);
        Object[] objArr2 = this.a;
        int i4 = this.f5246b;
        int i5 = i4 + i4;
        objArr2[i5] = k2;
        objArr2[i5 + 1] = v;
        this.f5246b = i4 + 1;
        return this;
    }

    public final d22<K, V> b() {
        return q22.h(this.f5246b, this.a);
    }
}