package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class gu2 implements nt2 {

    /* renamed from: b, reason: collision with root package name */
    private int f6181b;

    /* renamed from: c, reason: collision with root package name */
    private int f6182c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f6183d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6184e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f6185f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6186g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6187h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6188i;

    public gu2() {
        ByteBuffer byteBuffer = nt2.a;
        this.f6186g = byteBuffer;
        this.f6187h = byteBuffer;
        this.f6181b = -1;
        this.f6182c = -1;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = this.f6181b;
        int length = ((iLimit - iPosition) / (i2 + i2)) * this.f6185f.length;
        int i3 = length + length;
        if (this.f6186g.capacity() < i3) {
            this.f6186g = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.f6186g.clear();
        }
        while (iPosition < iLimit) {
            for (int i4 : this.f6185f) {
                this.f6186g.putShort(byteBuffer.getShort(i4 + i4 + iPosition));
            }
            int i5 = this.f6181b;
            iPosition += i5 + i5;
        }
        byteBuffer.position(iLimit);
        this.f6186g.flip();
        this.f6187h = this.f6186g;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean b(int i2, int i3, int i4) throws mt2 {
        boolean z = !Arrays.equals(this.f6183d, this.f6185f);
        int[] iArr = this.f6183d;
        this.f6185f = iArr;
        if (iArr == null) {
            this.f6184e = false;
            return z;
        }
        if (i4 != 2) {
            throw new mt2(i2, i3, i4);
        }
        if (!z && this.f6182c == i2 && this.f6181b == i3) {
            return false;
        }
        this.f6182c = i2;
        this.f6181b = i3;
        this.f6184e = i3 != iArr.length;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f6185f;
            if (i5 >= iArr2.length) {
                return true;
            }
            int i6 = iArr2[i5];
            if (i6 >= i3) {
                throw new mt2(i2, i3, 2);
            }
            this.f6184e = (i6 != i5) | this.f6184e;
            i5++;
        }
    }

    public final void c(int[] iArr) {
        this.f6183d = iArr;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean zzb() {
        return this.f6184e;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final int zzc() {
        int[] iArr = this.f6185f;
        return iArr == null ? this.f6181b : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final int zzd() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzf() {
        this.f6188i = true;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final ByteBuffer zzg() {
        ByteBuffer byteBuffer = this.f6187h;
        this.f6187h = nt2.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean zzh() {
        return this.f6188i && this.f6187h == nt2.a;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzi() {
        this.f6187h = nt2.a;
        this.f6188i = false;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzj() {
        zzi();
        this.f6186g = nt2.a;
        this.f6181b = -1;
        this.f6182c = -1;
        this.f6185f = null;
        this.f6184e = false;
    }
}