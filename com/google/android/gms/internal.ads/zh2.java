package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
class zh2 extends yh2 {

    /* renamed from: i, reason: collision with root package name */
    protected final byte[] f10598i;

    zh2(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f10598i = bArr;
    }

    @Override // com.google.android.gms.internal.ads.yh2
    final boolean Q(ci2 ci2Var, int i2, int i3) {
        if (i3 > ci2Var.l()) {
            int iL = l();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(iL);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i2 + i3;
        if (i4 > ci2Var.l()) {
            int iL2 = ci2Var.l();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(iL2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(ci2Var instanceof zh2)) {
            return ci2Var.r(i2, i4).equals(r(0, i3));
        }
        zh2 zh2Var = (zh2) ci2Var;
        byte[] bArr = this.f10598i;
        byte[] bArr2 = zh2Var.f10598i;
        int iR = R() + i3;
        int iR2 = R();
        int iR3 = zh2Var.R() + i2;
        while (iR2 < iR) {
            if (bArr[iR2] != bArr2[iR3]) {
                return false;
            }
            iR2++;
            iR3++;
        }
        return true;
    }

    protected int R() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ci2) || l() != ((ci2) obj).l()) {
            return false;
        }
        if (l() == 0) {
            return true;
        }
        if (!(obj instanceof zh2)) {
            return obj.equals(this);
        }
        zh2 zh2Var = (zh2) obj;
        int iC = c();
        int iC2 = zh2Var.c();
        if (iC == 0 || iC2 == 0 || iC == iC2) {
            return Q(zh2Var, 0, l());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public byte h(int i2) {
        return this.f10598i[i2];
    }

    @Override // com.google.android.gms.internal.ads.ci2
    byte k(int i2) {
        return this.f10598i[i2];
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public int l() {
        return this.f10598i.length;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected void n(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f10598i, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final ci2 r(int i2, int i3) {
        int iF = ci2.f(i2, i3, l());
        return iF == 0 ? ci2.f5319e : new vh2(this.f10598i, R() + i2, iF);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    final void t(rh2 rh2Var) {
        ((ji2) rh2Var).E(this.f10598i, R(), l());
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final String u(Charset charset) {
        return new String(this.f10598i, R(), l(), charset);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final boolean w() {
        int iR = R();
        return hm2.b(this.f10598i, iR, l() + iR);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final int x(int i2, int i3, int i4) {
        int iR = R() + i3;
        return hm2.c(i2, this.f10598i, iR, i4 + iR);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final int y(int i2, int i3, int i4) {
        return oj2.h(i2, this.f10598i, R() + i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final gi2 z() {
        return gi2.d(this.f10598i, R(), l(), true);
    }
}