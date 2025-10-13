package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(16)
/* loaded from: classes.dex */
public final class e13 extends vw2 {
    private static final int[] Q = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private final Context R;
    private final g13 S;
    private final p13 T;
    private final boolean U;
    private final long[] V;
    private xs2[] W;
    private d13 X;
    private Surface Y;
    private Surface Z;
    private boolean a0;
    private long b0;
    private long c0;
    private int d0;
    private int e0;
    private int f0;
    private float g0;
    private int h0;
    private int i0;
    private int j0;
    private float k0;
    private int l0;
    private int m0;
    private int n0;
    private float o0;
    private long p0;
    private int q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e13(Context context, xw2 xw2Var, long j2, Handler handler, q13 q13Var, int i2) {
        super(2, xw2Var, null, false);
        boolean z = false;
        this.R = context.getApplicationContext();
        this.S = new g13(context);
        this.T = new p13(handler, q13Var);
        if (v03.a <= 22 && "foster".equals(v03.f9613b) && "NVIDIA".equals(v03.f9614c)) {
            z = true;
        }
        this.U = z;
        this.V = new long[10];
        this.p0 = -9223372036854775807L;
        this.b0 = -9223372036854775807L;
        this.h0 = -1;
        this.i0 = -1;
        this.k0 = -1.0f;
        this.g0 = -1.0f;
        S();
    }

    private final boolean R(boolean z) {
        return v03.a >= 23 && (!z || b13.a(this.R));
    }

    private final void S() {
        this.l0 = -1;
        this.m0 = -1;
        this.o0 = -1.0f;
        this.n0 = -1;
    }

    private final void T() {
        int i2 = this.l0;
        int i3 = this.h0;
        if (i2 == i3 && this.m0 == this.i0 && this.n0 == this.j0 && this.o0 == this.k0) {
            return;
        }
        this.T.e(i3, this.i0, this.j0, this.k0);
        this.l0 = this.h0;
        this.m0 = this.i0;
        this.n0 = this.j0;
        this.o0 = this.k0;
    }

    private final void U() {
        if (this.l0 == -1 && this.m0 == -1) {
            return;
        }
        this.T.e(this.h0, this.i0, this.j0, this.k0);
    }

    private final void V() {
        if (this.d0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.T.d(this.d0, jElapsedRealtime - this.c0);
            this.d0 = 0;
            this.c0 = jElapsedRealtime;
        }
    }

    private static boolean W(long j2) {
        return j2 < -30000;
    }

    private static int X(xs2 xs2Var) {
        int i2 = xs2Var.f10251k;
        return i2 != -1 ? i2 : Y(xs2Var.f10250j, xs2Var.n, xs2Var.o);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int Y(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L83
            if (r9 != r0) goto L7
            goto L83
        L7:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L46;
                case -1662541442: goto L3c;
                case 1187890754: goto L32;
                case 1331836730: goto L28;
                case 1599127256: goto L1e;
                case 1599127257: goto L14;
                default: goto L13;
            }
        L13:
            goto L50
        L14:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 5
            goto L51
        L1e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 3
            goto L51
        L28:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 2
            goto L51
        L32:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 1
            goto L51
        L3c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 4
            goto L51
        L46:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 0
            goto L51
        L50:
            r7 = -1
        L51:
            if (r7 == 0) goto L7b
            if (r7 == r3) goto L7b
            if (r7 == r6) goto L61
            if (r7 == r5) goto L7b
            if (r7 == r4) goto L5e
            if (r7 == r2) goto L5e
            return r0
        L5e:
            int r8 = r8 * r9
            goto L7e
        L61:
            java.lang.String r7 = com.google.android.gms.internal.ads.v03.f9615d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L6c
            return r0
        L6c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.v03.e(r8, r7)
            int r7 = com.google.android.gms.internal.ads.v03.e(r9, r7)
            int r8 = r8 * r7
            int r8 = r8 * 256
            goto L7d
        L7b:
            int r8 = r8 * r9
        L7d:
            r4 = 2
        L7e:
            int r8 = r8 * 3
            int r4 = r4 + r4
            int r8 = r8 / r4
            return r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e13.Y(java.lang.String, int, int):int");
    }

    private static boolean Z(boolean z, xs2 xs2Var, xs2 xs2Var2) {
        if (xs2Var.f10250j.equals(xs2Var2.f10250j) && a0(xs2Var) == a0(xs2Var2)) {
            if (z) {
                return true;
            }
            if (xs2Var.n == xs2Var2.n && xs2Var.o == xs2Var2.o) {
                return true;
            }
        }
        return false;
    }

    private static int a0(xs2 xs2Var) {
        int i2 = xs2Var.q;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void A(xs2 xs2Var) {
        super.A(xs2Var);
        this.T.c(xs2Var);
        float f2 = xs2Var.r;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.g0 = f2;
        this.f0 = a0(xs2Var);
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void B(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.h0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.i0 = integer;
        float f2 = this.g0;
        this.k0 = f2;
        if (v03.a >= 21) {
            int i2 = this.f0;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.h0;
                this.h0 = integer;
                this.i0 = i3;
                this.k0 = 1.0f / f2;
            }
        } else {
            this.j0 = this.f0;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final boolean E(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws InterruptedException {
        while (true) {
            int i4 = this.q0;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.V;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.p0 = j5;
            int i5 = i4 - 1;
            this.q0 = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.p0;
        if (z) {
            N(mediaCodec, i2, j6);
            return true;
        }
        long j7 = j4 - j2;
        if (this.Y == this.Z) {
            if (!W(j7)) {
                return false;
            }
            N(mediaCodec, i2, j6);
            return true;
        }
        if (!this.a0) {
            if (v03.a >= 21) {
                P(mediaCodec, i2, j6, System.nanoTime());
            } else {
                O(mediaCodec, i2, j6);
            }
            return true;
        }
        if (zze() != 2) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jNanoTime = System.nanoTime();
        long jC = this.S.c(j4, ((j7 - ((jElapsedRealtime * 1000) - j3)) * 1000) + jNanoTime);
        long j8 = (jC - jNanoTime) / 1000;
        if (!W(j8)) {
            if (v03.a >= 21) {
                if (j8 < 50000) {
                    P(mediaCodec, i2, j6, jC);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                O(mediaCodec, i2, j6);
                return true;
            }
            return false;
        }
        t03.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        t03.b();
        ru2 ru2Var = this.P;
        ru2Var.f8745f++;
        this.d0++;
        int i6 = this.e0 + 1;
        this.e0 = i6;
        ru2Var.f8746g = Math.max(i6, ru2Var.f8746g);
        if (this.d0 == -1) {
            V();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final boolean H(tw2 tw2Var) {
        return this.Y != null || R(tw2Var.f9285d);
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void K() {
        try {
            super.K();
        } finally {
            Surface surface = this.Z;
            if (surface != null) {
                if (this.Y == surface) {
                    this.Y = null;
                }
                surface.release();
                this.Z = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void L(su2 su2Var) {
        int i2 = v03.a;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final boolean M(MediaCodec mediaCodec, boolean z, xs2 xs2Var, xs2 xs2Var2) {
        if (!Z(z, xs2Var, xs2Var2)) {
            return false;
        }
        int i2 = xs2Var2.n;
        d13 d13Var = this.X;
        return i2 <= d13Var.a && xs2Var2.o <= d13Var.f5413b && xs2Var2.f10251k <= d13Var.f5414c;
    }

    protected final void N(MediaCodec mediaCodec, int i2, long j2) {
        t03.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        t03.b();
        this.P.f8744e++;
    }

    protected final void O(MediaCodec mediaCodec, int i2, long j2) {
        T();
        t03.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, true);
        t03.b();
        this.P.f8743d++;
        this.e0 = 0;
        Q();
    }

    @TargetApi(21)
    protected final void P(MediaCodec mediaCodec, int i2, long j2, long j3) {
        T();
        t03.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, j3);
        t03.b();
        this.P.f8743d++;
        this.e0 = 0;
        Q();
    }

    final void Q() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        this.T.f(this.Y);
    }

    @Override // com.google.android.gms.internal.ads.ls2
    public final void f(int i2, Object obj) throws js2 {
        if (i2 == 1) {
            Surface surfaceB = (Surface) obj;
            if (surfaceB == null) {
                Surface surface = this.Z;
                if (surface != null) {
                    surfaceB = surface;
                } else {
                    tw2 tw2VarJ = J();
                    if (tw2VarJ != null && R(tw2VarJ.f9285d)) {
                        surfaceB = b13.b(this.R, tw2VarJ.f9285d);
                        this.Z = surfaceB;
                    }
                }
            }
            if (this.Y == surfaceB) {
                if (surfaceB == null || surfaceB == this.Z) {
                    return;
                }
                U();
                if (this.a0) {
                    this.T.f(this.Y);
                    return;
                }
                return;
            }
            this.Y = surfaceB;
            int iZze = zze();
            if (iZze == 1 || iZze == 2) {
                MediaCodec mediaCodecI = I();
                if (v03.a < 23 || mediaCodecI == null || surfaceB == null) {
                    K();
                    G();
                } else {
                    mediaCodecI.setOutputSurface(surfaceB);
                }
            }
            if (surfaceB == null || surfaceB == this.Z) {
                S();
                this.a0 = false;
                int i3 = v03.a;
            } else {
                U();
                this.a0 = false;
                int i4 = v03.a;
                if (iZze == 2) {
                    this.b0 = -9223372036854775807L;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.hs2
    protected final void n(boolean z) {
        super.n(z);
        int i2 = u().f5944b;
        this.T.a(this.P);
        this.S.a();
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected final void o(xs2[] xs2VarArr, long j2) {
        this.W = xs2VarArr;
        if (this.p0 == -9223372036854775807L) {
            this.p0 = j2;
            return;
        }
        int i2 = this.q0;
        if (i2 == 10) {
            long j3 = this.V[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.q0 = i2 + 1;
        }
        this.V[this.q0 - 1] = j2;
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.hs2
    protected final void q(long j2, boolean z) {
        super.q(j2, z);
        this.a0 = false;
        int i2 = v03.a;
        this.e0 = 0;
        int i3 = this.q0;
        if (i3 != 0) {
            this.p0 = this.V[i3 - 1];
            this.q0 = 0;
        }
        this.b0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected final void r() {
        this.d0 = 0;
        this.c0 = SystemClock.elapsedRealtime();
        this.b0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected final void s() {
        V();
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.hs2
    protected final void t() {
        this.h0 = -1;
        this.i0 = -1;
        this.k0 = -1.0f;
        this.g0 = -1.0f;
        this.p0 = -9223372036854775807L;
        this.q0 = 0;
        S();
        this.a0 = false;
        int i2 = v03.a;
        this.S.b();
        try {
            super.t();
        } finally {
            this.P.a();
            this.T.g(this.P);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    @Override // com.google.android.gms.internal.ads.vw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int w(com.google.android.gms.internal.ads.xw2 r8, com.google.android.gms.internal.ads.xs2 r9) {
        /*
            r7 = this;
            java.lang.String r8 = r9.f10250j
            boolean r0 = com.google.android.gms.internal.ads.k03.b(r8)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.gms.internal.ads.wu2 r0 = r9.f10253m
            r2 = 1
            if (r0 == 0) goto L24
            r3 = 0
            r4 = 0
        L11:
            int r5 = r0.f10045g
            if (r3 >= r5) goto L1f
            com.google.android.gms.internal.ads.vu2 r5 = r0.a(r3)
            boolean r5 = r5.f9788i
            r4 = r4 | r5
            int r3 = r3 + 1
            goto L11
        L1f:
            if (r2 == r4) goto L22
            goto L24
        L22:
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.tw2 r8 = com.google.android.gms.internal.ads.ex2.a(r8, r0)
            if (r8 != 0) goto L2c
            return r2
        L2c:
            java.lang.String r0 = r9.f10247g
            boolean r0 = r8.d(r0)
            if (r0 == 0) goto L92
            int r3 = r9.n
            if (r3 <= 0) goto L92
            int r4 = r9.o
            if (r4 <= 0) goto L92
            int r0 = com.google.android.gms.internal.ads.v03.a
            r5 = 21
            if (r0 < r5) goto L4a
            float r9 = r9.p
            double r5 = (double) r9
            boolean r0 = r8.e(r3, r4, r5)
            goto L92
        L4a:
            int r3 = r3 * r4
            int r0 = com.google.android.gms.internal.ads.ex2.c()
            if (r3 > r0) goto L54
            r0 = 1
            goto L55
        L54:
            r0 = 0
        L55:
            if (r0 != 0) goto L92
            int r3 = r9.n
            int r9 = r9.o
            java.lang.String r4 = com.google.android.gms.internal.ads.v03.f9616e
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 56
            r6.<init>(r5)
            java.lang.String r5 = "FalseCheck [legacyFrameSize, "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = "x"
            r6.append(r3)
            r6.append(r9)
            java.lang.String r9 = "] ["
            r6.append(r9)
            r6.append(r4)
            java.lang.String r9 = "]"
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            java.lang.String r3 = "MediaCodecVideoRenderer"
            android.util.Log.d(r3, r9)
        L92:
            boolean r9 = r8.f9283b
            if (r2 == r9) goto L98
            r9 = 4
            goto L9a
        L98:
            r9 = 8
        L9a:
            boolean r8 = r8.f9284c
            if (r2 == r8) goto L9f
            goto La1
        L9f:
            r1 = 16
        La1:
            if (r2 == r0) goto La5
            r8 = 2
            goto La6
        La5:
            r8 = 3
        La6:
            r9 = r9 | r1
            r8 = r8 | r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e13.w(com.google.android.gms.internal.ads.xw2, com.google.android.gms.internal.ads.xs2):int");
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void y(tw2 tw2Var, MediaCodec mediaCodec, xs2 xs2Var, MediaCrypto mediaCrypto) {
        d13 d13Var;
        Point point;
        xs2[] xs2VarArr = this.W;
        int iMax = xs2Var.n;
        int iMax2 = xs2Var.o;
        int iX = X(xs2Var);
        if (xs2VarArr.length == 1) {
            d13Var = new d13(iMax, iMax2, iX);
        } else {
            boolean z = false;
            for (xs2 xs2Var2 : xs2VarArr) {
                if (Z(tw2Var.f9283b, xs2Var, xs2Var2)) {
                    int i2 = xs2Var2.n;
                    z |= i2 == -1 || xs2Var2.o == -1;
                    iMax = Math.max(iMax, i2);
                    iMax2 = Math.max(iMax2, xs2Var2.o);
                    iX = Math.max(iX, X(xs2Var2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i3 = xs2Var.o;
                int i4 = xs2Var.n;
                int i5 = i3 > i4 ? i3 : i4;
                int i6 = i3 <= i4 ? i3 : i4;
                float f2 = i6 / i5;
                int[] iArr = Q;
                int length = iArr.length;
                int i7 = 0;
                while (i7 < 9) {
                    int i8 = iArr[i7];
                    int[] iArr2 = iArr;
                    int i9 = (int) (i8 * f2);
                    if (i8 <= i5 || i9 <= i6) {
                        break;
                    }
                    int i10 = i5;
                    int i11 = i6;
                    if (v03.a >= 21) {
                        int i12 = i3 <= i4 ? i8 : i9;
                        if (i3 <= i4) {
                            i8 = i9;
                        }
                        Point pointF = tw2Var.f(i12, i8);
                        if (tw2Var.e(pointF.x, pointF.y, xs2Var.p)) {
                            point = pointF;
                            break;
                        }
                        i7++;
                        iArr = iArr2;
                        i5 = i10;
                        i6 = i11;
                    } else {
                        int iE = v03.e(i8, 16) * 16;
                        int iE2 = v03.e(i9, 16) * 16;
                        if (iE * iE2 <= ex2.c()) {
                            int i13 = i3 <= i4 ? iE : iE2;
                            if (i3 <= i4) {
                                iE = iE2;
                            }
                            point = new Point(i13, iE);
                        } else {
                            i7++;
                            iArr = iArr2;
                            i5 = i10;
                            i6 = i11;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iX = Math.max(iX, Y(xs2Var.f10250j, iMax, iMax2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax);
                    sb2.append("x");
                    sb2.append(iMax2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            d13Var = new d13(iMax, iMax2, iX);
        }
        this.X = d13Var;
        boolean z2 = this.U;
        MediaFormat mediaFormatB = xs2Var.B();
        mediaFormatB.setInteger("max-width", d13Var.a);
        mediaFormatB.setInteger("max-height", d13Var.f5413b);
        int i14 = d13Var.f5414c;
        if (i14 != -1) {
            mediaFormatB.setInteger("max-input-size", i14);
        }
        if (z2) {
            mediaFormatB.setInteger("auto-frc", 0);
        }
        if (this.Y == null) {
            f03.d(R(tw2Var.f9285d));
            if (this.Z == null) {
                this.Z = b13.b(this.R, tw2Var.f9285d);
            }
            this.Y = this.Z;
        }
        mediaCodec.configure(mediaFormatB, this.Y, (MediaCrypto) null, 0);
        int i15 = v03.a;
    }

    @Override // com.google.android.gms.internal.ads.vw2
    protected final void z(String str, long j2, long j3) {
        this.T.b(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.vw2, com.google.android.gms.internal.ads.ct2
    public final boolean zzE() {
        Surface surface;
        if (super.zzE() && (this.a0 || (((surface = this.Z) != null && this.Y == surface) || I() == null))) {
            this.b0 = -9223372036854775807L;
            return true;
        }
        if (this.b0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.b0) {
            return true;
        }
        this.b0 = -9223372036854775807L;
        return false;
    }
}