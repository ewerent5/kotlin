package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hz2 {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private final zy2[] f6450b;

    public hz2(zy2[] zy2VarArr, byte... bArr) {
        this.f6450b = zy2VarArr;
    }

    public final zy2 a(int i2) {
        return this.f6450b[i2];
    }

    public final zy2[] b() {
        return (zy2[]) this.f6450b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6450b, ((hz2) obj).f6450b);
    }

    public final int hashCode() {
        int i2 = this.a;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f6450b) + 527;
        this.a = iHashCode;
        return iHashCode;
    }
}