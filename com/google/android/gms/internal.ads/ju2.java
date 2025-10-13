package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public final class ju2 extends vw2 implements j03 {
    private final ut2 Q;
    private final eu2 R;
    private boolean S;
    private int T;
    private int U;
    private long V;
    private boolean W;

    public ju2(xw2 xw2Var, xu2 xu2Var, boolean z, Handler handler, vt2 vt2Var) {
        super(1, xw2Var, null, true);
        this.R = new eu2(null, new nt2[0], new iu2(this, null));
        this.Q = new ut2(handler, vt2Var);
    }

    static /* synthetic */ boolean O(ju2 ju2Var, boolean z) {
        ju2Var.W = true;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void A(xs2 xs2Var) {
        super.A(xs2Var);
        this.Q.c(xs2Var);
        this.T = "audio/raw".equals(xs2Var.f10250j) ? xs2Var.x : 2;
        this.U = xs2Var.v;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void B(MediaCodec mediaCodec, MediaFormat mediaFormat) throws IllegalStateException, js2 {
        int i2;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.S && integer == 6) {
            int i3 = this.U;
            if (i3 < 6) {
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < this.U; i4++) {
                    iArr2[i4] = i4;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i2 = 6;
        } else {
            i2 = integer;
            iArr = null;
        }
        try {
            this.R.b("audio/raw", i2, integer2, this.T, 0, iArr);
        } catch (zt2 e2) {
            throw js2.a(e2, v());
        }
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final boolean E(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws js2 {
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            this.P.f8744e++;
            this.R.d();
            return true;
        }
        try {
            if (!this.R.e(byteBuffer, j4)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i2, false);
            this.P.f8743d++;
            return true;
        } catch (au2 | du2 e2) {
            throw js2.a(e2, v());
        }
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void F() throws js2 {
        try {
            this.R.f();
        } catch (du2 e2) {
            throw js2.a(e2, v());
        }
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final bt2 e() {
        return this.R.j();
    }

    @Override // com.google.android.gms.internal.ads.ls2
    public final void f(int i2, Object obj) {
        if (i2 != 2) {
            return;
        }
        this.R.k(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final bt2 i(bt2 bt2Var) {
        return this.R.i(bt2Var);
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.hs2
    protected final void n(boolean z) {
        super.n(z);
        this.Q.a(this.P);
        int i2 = u().f5944b;
    }

    @Override // com.google.android.gms.internal.ads.j03
    public final long p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long jA = this.R.a(zzF());
        if (jA != Long.MIN_VALUE) {
            if (!this.W) {
                jA = Math.max(this.V, jA);
            }
            this.V = jA;
            this.W = false;
        }
        return this.V;
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.hs2
    protected final void q(long j2, boolean z) throws IllegalStateException {
        super.q(j2, z);
        this.R.m();
        this.V = j2;
        this.W = true;
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected final void r() throws IllegalStateException {
        this.R.c();
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected final void s() {
        this.R.l();
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.hs2
    protected final void t() {
        try {
            this.R.n();
            try {
                super.t();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.t();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final int w(xw2 xw2Var, xs2 xs2Var) {
        int i2;
        int i3;
        String str = xs2Var.f10250j;
        if (!k03.a(str)) {
            return 0;
        }
        int i4 = v03.a;
        int i5 = i4 >= 21 ? 16 : 0;
        tw2 tw2VarA = ex2.a(str, false);
        if (tw2VarA == null) {
            return 1;
        }
        int i6 = 2;
        if (i4 < 21 || (((i2 = xs2Var.w) == -1 || tw2VarA.g(i2)) && ((i3 = xs2Var.v) == -1 || tw2VarA.h(i3)))) {
            i6 = 3;
        }
        return i5 | 4 | i6;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final tw2 x(xw2 xw2Var, xs2 xs2Var, boolean z) {
        return super.x(xw2Var, xs2Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0037  */
    @Override // com.google.android.gms.internal.ads.vw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void y(com.google.android.gms.internal.ads.tw2 r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.xs2 r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.a
            int r7 = com.google.android.gms.internal.ads.v03.a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.v03.f9614c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.v03.f9613b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            r3.S = r0
            android.media.MediaFormat r4 = r6.B()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ju2.y(com.google.android.gms.internal.ads.tw2, android.media.MediaCodec, com.google.android.gms.internal.ads.xs2, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void z(String str, long j2, long j3) {
        this.Q.b(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.ct2
    public final boolean zzE() {
        return this.R.h() || super.zzE();
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.ct2
    public final boolean zzF() {
        return super.zzF() && this.R.g();
    }

    @Override // com.google.android.gms.internal.ads.hs2, com.google.android.gms.internal.ads.ct2
    public final j03 zzd() {
        return this;
    }
}