package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nz2 implements pz2 {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7853b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f7854c;

    /* renamed from: d, reason: collision with root package name */
    private int f7855d;

    /* renamed from: e, reason: collision with root package name */
    private int f7856e;

    public nz2(byte[] bArr) {
        f03.a(bArr.length > 0);
        this.f7853b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final long a(rz2 rz2Var) throws IOException {
        this.f7854c = rz2Var.a;
        long j2 = rz2Var.f8805c;
        int i2 = (int) j2;
        this.f7855d = i2;
        long j3 = rz2Var.f8806d;
        int length = (int) (j3 == -1 ? this.f7853b.length - j2 : j3);
        this.f7856e = length;
        if (length > 0 && i2 + length <= this.f7853b.length) {
            return length;
        }
        byte[] bArr = this.f7853b;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(bArr.length);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f7856e;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        System.arraycopy(this.f7853b, this.f7855d, bArr, i2, iMin);
        this.f7855d += iMin;
        this.f7856e -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final Uri zzc() {
        return this.f7854c;
    }

    @Override // com.google.android.gms.internal.ads.pz2
    public final void zzd() {
        this.f7854c = null;
    }
}