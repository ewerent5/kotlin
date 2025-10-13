package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yu2 implements iv2 {
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10488b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f10489c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f10490d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10491e;

    public yu2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = iArr;
        this.f10488b = jArr;
        this.f10489c = jArr2;
        this.f10490d = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f10491e = 0L;
        } else {
            int i2 = length - 1;
            this.f10491e = jArr2[i2] + jArr3[i2];
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    public final long a(long j2) {
        return this.f10488b[v03.h(this.f10490d, j2, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.iv2
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.iv2
    public final long zzb() {
        return this.f10491e;
    }
}