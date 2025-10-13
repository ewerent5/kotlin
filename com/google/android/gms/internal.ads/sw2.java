package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sw2 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9007b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f9008c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9009d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f9010e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9011f;

    public sw2(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        f03.a(iArr.length == length);
        int length2 = jArr.length;
        f03.a(length2 == length);
        f03.a(iArr2.length == length);
        this.f9007b = jArr;
        this.f9008c = iArr;
        this.f9009d = i2;
        this.f9010e = jArr2;
        this.f9011f = iArr2;
        this.a = length2;
    }

    public final int a(long j2) {
        for (int iH = v03.h(this.f9010e, j2, true, false); iH >= 0; iH--) {
            if ((this.f9011f[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public final int b(long j2) {
        for (int i2 = v03.i(this.f9010e, j2, true, false); i2 < this.f9010e.length; i2++) {
            if ((this.f9011f[i2] & 1) != 0) {
                return i2;
            }
        }
        return -1;
    }
}