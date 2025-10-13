package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vh2 extends zh2 {

    /* renamed from: j, reason: collision with root package name */
    private final int f9705j;

    /* renamed from: k, reason: collision with root package name */
    private final int f9706k;

    vh2(byte[] bArr, int i2, int i3) {
        super(bArr);
        ci2.f(i2, i2 + i3, bArr.length);
        this.f9705j = i2;
        this.f9706k = i3;
    }

    @Override // com.google.android.gms.internal.ads.zh2
    protected final int R() {
        return this.f9705j;
    }

    @Override // com.google.android.gms.internal.ads.zh2, com.google.android.gms.internal.ads.ci2
    public final byte h(int i2) {
        ci2.e(i2, this.f9706k);
        return this.f10598i[this.f9705j + i2];
    }

    @Override // com.google.android.gms.internal.ads.zh2, com.google.android.gms.internal.ads.ci2
    final byte k(int i2) {
        return this.f10598i[this.f9705j + i2];
    }

    @Override // com.google.android.gms.internal.ads.zh2, com.google.android.gms.internal.ads.ci2
    public final int l() {
        return this.f9706k;
    }

    @Override // com.google.android.gms.internal.ads.zh2, com.google.android.gms.internal.ads.ci2
    protected final void n(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f10598i, this.f9705j + i2, bArr, i3, i4);
    }
}