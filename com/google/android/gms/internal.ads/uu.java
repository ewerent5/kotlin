package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class uu implements pz2 {

    /* renamed from: b, reason: collision with root package name */
    private final pz2 f9557b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9558c;

    /* renamed from: d, reason: collision with root package name */
    private final pz2 f9559d;

    /* renamed from: e, reason: collision with root package name */
    private long f9560e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f9561f;

    uu(pz2 pz2Var, int i2, pz2 pz2Var2) {
        this.f9557b = pz2Var;
        this.f9558c = i2;
        this.f9559d = pz2Var2;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final long a(rz2 rz2Var) {
        rz2 rz2Var2;
        this.f9561f = rz2Var.a;
        long j2 = rz2Var.f8805c;
        long j3 = this.f9558c;
        rz2 rz2Var3 = null;
        if (j2 >= j3) {
            rz2Var2 = null;
        } else {
            long j4 = rz2Var.f8806d;
            rz2Var2 = new rz2(rz2Var.a, null, j2, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null, 0);
        }
        long j5 = rz2Var.f8806d;
        if (j5 == -1 || rz2Var.f8805c + j5 > this.f9558c) {
            long jMax = Math.max(this.f9558c, rz2Var.f8805c);
            long j6 = rz2Var.f8806d;
            rz2Var3 = new rz2(rz2Var.a, null, jMax, jMax, j6 != -1 ? Math.min(j6, (rz2Var.f8805c + j6) - this.f9558c) : -1L, null, 0);
        }
        long jA = rz2Var2 != null ? this.f9557b.a(rz2Var2) : 0L;
        long jA2 = rz2Var3 != null ? this.f9559d.a(rz2Var3) : 0L;
        this.f9560e = rz2Var.f8805c;
        if (jA2 == -1) {
            return -1L;
        }
        return jA + jA2;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final int b(byte[] bArr, int i2, int i3) {
        int i4;
        long j2 = this.f9560e;
        long j3 = this.f9558c;
        if (j2 < j3) {
            int iB = this.f9557b.b(bArr, i2, (int) Math.min(i3, j3 - j2));
            long j4 = this.f9560e + iB;
            this.f9560e = j4;
            i4 = iB;
            j2 = j4;
        } else {
            i4 = 0;
        }
        if (j2 < this.f9558c) {
            return i4;
        }
        int iB2 = this.f9559d.b(bArr, i2 + i4, i3 - i4);
        this.f9560e += iB2;
        return i4 + iB2;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final Uri zzc() {
        return this.f9561f;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final void zzd() {
        this.f9557b.zzd();
        this.f9559d.zzd();
    }
}