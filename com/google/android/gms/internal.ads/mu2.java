package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mu2 implements nt2 {

    /* renamed from: d, reason: collision with root package name */
    private lu2 f7556d;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f7559g;

    /* renamed from: h, reason: collision with root package name */
    private ShortBuffer f7560h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f7561i;

    /* renamed from: j, reason: collision with root package name */
    private long f7562j;

    /* renamed from: k, reason: collision with root package name */
    private long f7563k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7564l;

    /* renamed from: e, reason: collision with root package name */
    private float f7557e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f7558f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private int f7554b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7555c = -1;

    public mu2() {
        ByteBuffer byteBuffer = nt2.a;
        this.f7559g = byteBuffer;
        this.f7560h = byteBuffer.asShortBuffer();
        this.f7561i = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7562j += iRemaining;
            this.f7556d.c(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iF = this.f7556d.f() * this.f7554b;
        int i2 = iF + iF;
        if (i2 > 0) {
            if (this.f7559g.capacity() < i2) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.f7559g = byteBufferOrder;
                this.f7560h = byteBufferOrder.asShortBuffer();
            } else {
                this.f7559g.clear();
                this.f7560h.clear();
            }
            this.f7556d.d(this.f7560h);
            this.f7563k += i2;
            this.f7559g.limit(i2);
            this.f7561i = this.f7559g;
        }
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean b(int i2, int i3, int i4) throws mt2 {
        if (i4 != 2) {
            throw new mt2(i2, i3, i4);
        }
        if (this.f7555c == i2 && this.f7554b == i3) {
            return false;
        }
        this.f7555c = i2;
        this.f7554b = i3;
        return true;
    }

    public final float c(float f2) {
        float fG = v03.g(f2, 0.1f, 8.0f);
        this.f7557e = fG;
        return fG;
    }

    public final float d(float f2) {
        this.f7558f = v03.g(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final long e() {
        return this.f7562j;
    }

    public final long f() {
        return this.f7563k;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean zzb() {
        return Math.abs(this.f7557e + (-1.0f)) >= 0.01f || Math.abs(this.f7558f + (-1.0f)) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final int zzc() {
        return this.f7554b;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final int zzd() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzf() {
        this.f7556d.e();
        this.f7564l = true;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final ByteBuffer zzg() {
        ByteBuffer byteBuffer = this.f7561i;
        this.f7561i = nt2.a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final boolean zzh() {
        lu2 lu2Var;
        return this.f7564l && ((lu2Var = this.f7556d) == null || lu2Var.f() == 0);
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzi() {
        lu2 lu2Var = new lu2(this.f7555c, this.f7554b);
        this.f7556d = lu2Var;
        lu2Var.a(this.f7557e);
        this.f7556d.b(this.f7558f);
        this.f7561i = nt2.a;
        this.f7562j = 0L;
        this.f7563k = 0L;
        this.f7564l = false;
    }

    @Override // com.google.android.gms.internal.ads.nt2
    public final void zzj() {
        this.f7556d = null;
        ByteBuffer byteBuffer = nt2.a;
        this.f7559g = byteBuffer;
        this.f7560h = byteBuffer.asShortBuffer();
        this.f7561i = byteBuffer;
        this.f7554b = -1;
        this.f7555c = -1;
        this.f7562j = 0L;
        this.f7563k = 0L;
        this.f7564l = false;
    }
}