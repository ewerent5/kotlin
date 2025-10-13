package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jv2 {
    public final int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6861b;

    public jv2(int i2, byte[] bArr) {
        this.f6861b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jv2.class == obj.getClass() && Arrays.equals(this.f6861b, ((jv2) obj).f6861b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6861b) + 31;
    }
}