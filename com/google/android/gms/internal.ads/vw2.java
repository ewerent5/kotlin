package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(19)
/* loaded from: classes.dex */
public abstract class vw2 extends hs2 {

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f9799i = v03.m("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private ByteBuffer[] B;
    private ByteBuffer[] C;
    private long D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    protected ru2 P;

    /* renamed from: j, reason: collision with root package name */
    private final xw2 f9800j;

    /* renamed from: k, reason: collision with root package name */
    private final su2 f9801k;

    /* renamed from: l, reason: collision with root package name */
    private final su2 f9802l;

    /* renamed from: m, reason: collision with root package name */
    private final ys2 f9803m;
    private final List<Long> n;
    private final MediaCodec.BufferInfo o;
    private xs2 p;
    private MediaCodec q;
    private tw2 r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public vw2(int i2, xw2 xw2Var, xu2 xu2Var, boolean z) {
        super(i2);
        f03.d(v03.a >= 16);
        this.f9800j = xw2Var;
        this.f9801k = new su2(0);
        this.f9802l = new su2(0);
        this.f9803m = new ys2();
        this.n = new ArrayList();
        this.o = new MediaCodec.BufferInfo();
        this.I = 0;
        this.J = 0;
    }

    private final boolean C() throws MediaCodec.CryptoException, js2 {
        MediaCodec mediaCodec = this.q;
        if (mediaCodec == null || this.J == 2 || this.M) {
            return false;
        }
        if (this.E < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.E = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            su2 su2Var = this.f9801k;
            su2Var.f8995c = this.B[iDequeueInputBuffer];
            su2Var.a();
        }
        if (this.J == 1) {
            if (!this.v) {
                this.L = true;
                this.q.queueInputBuffer(this.E, 0, 0, 0L, 4);
                this.E = -1;
            }
            this.J = 2;
            return false;
        }
        if (this.z) {
            this.z = false;
            ByteBuffer byteBuffer = this.f9801k.f8995c;
            byte[] bArr = f9799i;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.q;
            int i2 = this.E;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i2, 0, 38, 0L, 0);
            this.E = -1;
            this.K = true;
            return true;
        }
        if (this.I == 1) {
            for (int i3 = 0; i3 < this.p.f10252l.size(); i3++) {
                this.f9801k.f8995c.put(this.p.f10252l.get(i3));
            }
            this.I = 2;
        }
        int iPosition = this.f9801k.f8995c.position();
        int iK = k(this.f9803m, this.f9801k, false);
        if (iK == -3) {
            return false;
        }
        if (iK == -5) {
            if (this.I == 2) {
                this.f9801k.a();
                this.I = 1;
            }
            A(this.f9803m.a);
            return true;
        }
        if (this.f9801k.c()) {
            if (this.I == 2) {
                this.f9801k.a();
                this.I = 1;
            }
            this.M = true;
            if (!this.K) {
                D();
                return false;
            }
            try {
                if (!this.v) {
                    this.L = true;
                    this.q.queueInputBuffer(this.E, 0, 0, 0L, 4);
                    this.E = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e2) {
                throw js2.a(e2, v());
            }
        }
        if (this.O && !this.f9801k.d()) {
            this.f9801k.a();
            if (this.I == 2) {
                this.I = 1;
            }
            return true;
        }
        this.O = false;
        boolean zI = this.f9801k.i();
        if (this.s && !zI) {
            ByteBuffer byteBuffer2 = this.f9801k.f8995c;
            byte[] bArr2 = m03.a;
            int iPosition2 = byteBuffer2.position();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 1;
                if (i6 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i7 = byteBuffer2.get(i4) & 255;
                if (i5 == 3) {
                    if (i7 == 1) {
                        if ((byteBuffer2.get(i6) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                            byteBufferDuplicate.position(i4 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer2.position(0);
                            byteBuffer2.put(byteBufferDuplicate);
                            break;
                        }
                        i7 = 1;
                    }
                } else if (i7 == 0) {
                    i5++;
                }
                if (i7 != 0) {
                    i5 = 0;
                }
                i4 = i6;
            }
            if (this.f9801k.f8995c.position() == 0) {
                return true;
            }
            this.s = false;
        }
        try {
            su2 su2Var2 = this.f9801k;
            long j2 = su2Var2.f8996d;
            if (su2Var2.b()) {
                this.n.add(Long.valueOf(j2));
            }
            this.f9801k.f8995c.flip();
            L(this.f9801k);
            if (zI) {
                MediaCodec.CryptoInfo cryptoInfoB = this.f9801k.f8994b.b();
                if (iPosition != 0) {
                    if (cryptoInfoB.numBytesOfClearData == null) {
                        cryptoInfoB.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfoB.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.q.queueSecureInputBuffer(this.E, 0, cryptoInfoB, j2, 0);
            } else {
                this.q.queueInputBuffer(this.E, 0, this.f9801k.f8995c.limit(), j2, 0);
            }
            this.E = -1;
            this.K = true;
            this.I = 0;
            this.P.f8742c++;
            return true;
        } catch (MediaCodec.CryptoException e3) {
            throw js2.a(e3, v());
        }
    }

    private final void D() throws js2 {
        if (this.J == 2) {
            K();
            G();
        } else {
            this.N = true;
            F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void A(com.google.android.gms.internal.ads.xs2 r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.xs2 r0 = r5.p
            r5.p = r6
            com.google.android.gms.internal.ads.wu2 r6 = r6.f10253m
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.gms.internal.ads.wu2 r1 = r0.f10253m
        Lc:
            boolean r6 = com.google.android.gms.internal.ads.v03.a(r6, r1)
            if (r6 != 0) goto L29
            com.google.android.gms.internal.ads.xs2 r6 = r5.p
            com.google.android.gms.internal.ads.wu2 r6 = r6.f10253m
            if (r6 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.v()
            com.google.android.gms.internal.ads.js2 r6 = com.google.android.gms.internal.ads.js2.a(r6, r0)
            throw r6
        L29:
            android.media.MediaCodec r6 = r5.q
            r1 = 1
            if (r6 == 0) goto L56
            com.google.android.gms.internal.ads.tw2 r2 = r5.r
            boolean r2 = r2.f9283b
            com.google.android.gms.internal.ads.xs2 r3 = r5.p
            boolean r6 = r5.M(r6, r2, r0, r3)
            if (r6 == 0) goto L56
            r5.H = r1
            r5.I = r1
            boolean r6 = r5.u
            r2 = 0
            if (r6 == 0) goto L52
            com.google.android.gms.internal.ads.xs2 r6 = r5.p
            int r3 = r6.n
            int r4 = r0.n
            if (r3 != r4) goto L52
            int r6 = r6.o
            int r0 = r0.o
            if (r6 != r0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            r5.z = r1
            return
        L56:
            boolean r6 = r5.K
            if (r6 == 0) goto L5d
            r5.J = r1
            return
        L5d:
            r5.K()
            r5.G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vw2.A(com.google.android.gms.internal.ads.xs2):void");
    }

    protected abstract void B(MediaCodec mediaCodec, MediaFormat mediaFormat);

    protected abstract boolean E(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z);

    protected void F() {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void G() throws com.google.android.gms.internal.ads.js2 {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vw2.G():void");
    }

    protected boolean H(tw2 tw2Var) {
        return true;
    }

    protected final MediaCodec I() {
        return this.q;
    }

    protected final tw2 J() {
        return this.r;
    }

    protected void K() {
        this.D = -9223372036854775807L;
        this.E = -1;
        this.F = -1;
        this.G = false;
        this.n.clear();
        this.B = null;
        this.C = null;
        this.r = null;
        this.H = false;
        this.K = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.L = false;
        this.I = 0;
        this.J = 0;
        this.f9801k.f8995c = null;
        MediaCodec mediaCodec = this.q;
        if (mediaCodec != null) {
            this.P.f8741b++;
            try {
                mediaCodec.stop();
                try {
                    this.q.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.q.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    protected void L(su2 su2Var) {
    }

    protected boolean M(MediaCodec mediaCodec, boolean z, xs2 xs2Var, xs2 xs2Var2) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dt2
    public final int b(xs2 xs2Var) throws js2 {
        try {
            return w(this.f9800j, xs2Var);
        } catch (ax2 e2) {
            throw js2.a(e2, v());
        }
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void j(long j2, long j3) throws js2 {
        boolean zE;
        int iDequeueOutputBuffer;
        boolean z;
        if (this.N) {
            F();
            return;
        }
        if (this.p == null) {
            this.f9802l.a();
            int iK = k(this.f9803m, this.f9802l, true);
            if (iK != -5) {
                if (iK == -4) {
                    f03.d(this.f9802l.c());
                    this.M = true;
                    D();
                    return;
                }
                return;
            }
            A(this.f9803m.a);
        }
        G();
        if (this.q != null) {
            t03.a("drainAndFeed");
            while (true) {
                if (this.F < 0) {
                    if (this.x && this.L) {
                        try {
                            iDequeueOutputBuffer = this.q.dequeueOutputBuffer(this.o, 0L);
                            this.F = iDequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            D();
                            if (this.N) {
                                K();
                            }
                        }
                    } else {
                        iDequeueOutputBuffer = this.q.dequeueOutputBuffer(this.o, 0L);
                        this.F = iDequeueOutputBuffer;
                    }
                    if (iDequeueOutputBuffer >= 0) {
                        if (this.A) {
                            this.A = false;
                            this.q.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            this.F = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.o;
                            if ((bufferInfo.flags & 4) != 0) {
                                D();
                                this.F = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.C[this.F];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.o;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j4 = this.o.presentationTimeUs;
                            int size = this.n.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z = false;
                                    break;
                                } else {
                                    if (this.n.get(i2).longValue() == j4) {
                                        this.n.remove(i2);
                                        z = true;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            this.G = z;
                        }
                    } else if (iDequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.q.getOutputFormat();
                        if (this.u && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.A = true;
                        } else {
                            if (this.y) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            B(this.q, outputFormat);
                        }
                    } else if (iDequeueOutputBuffer == -3) {
                        this.C = this.q.getOutputBuffers();
                    } else if (this.v && (this.M || this.J == 2)) {
                        D();
                    }
                }
                if (this.x && this.L) {
                    try {
                        MediaCodec mediaCodec = this.q;
                        ByteBuffer[] byteBufferArr = this.C;
                        int i3 = this.F;
                        ByteBuffer byteBuffer2 = byteBufferArr[i3];
                        MediaCodec.BufferInfo bufferInfo3 = this.o;
                        zE = E(j2, j3, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.G);
                    } catch (IllegalStateException unused2) {
                        D();
                        if (this.N) {
                            K();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.q;
                    ByteBuffer[] byteBufferArr2 = this.C;
                    int i4 = this.F;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                    MediaCodec.BufferInfo bufferInfo4 = this.o;
                    zE = E(j2, j3, mediaCodec2, byteBuffer3, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.G);
                }
                if (!zE) {
                    break;
                }
                long j5 = this.o.presentationTimeUs;
                this.F = -1;
            }
            while (C()) {
            }
            t03.b();
        } else {
            l(j2);
            this.f9802l.a();
            int iK2 = k(this.f9803m, this.f9802l, false);
            if (iK2 == -5) {
                A(this.f9803m.a);
            } else if (iK2 == -4) {
                f03.d(this.f9802l.c());
                this.M = true;
                D();
            }
        }
        this.P.a();
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected void n(boolean z) {
        this.P = new ru2();
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected void q(long j2, boolean z) {
        this.M = false;
        this.N = false;
        if (this.q != null) {
            this.D = -9223372036854775807L;
            this.E = -1;
            this.F = -1;
            this.O = true;
            this.G = false;
            this.n.clear();
            this.z = false;
            this.A = false;
            if (this.t || ((this.w && this.L) || this.J != 0)) {
                K();
                G();
            } else {
                this.q.flush();
                this.K = false;
            }
            if (!this.H || this.p == null) {
                return;
            }
            this.I = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.hs2
    protected void t() {
        this.p = null;
        K();
    }

    protected abstract int w(xw2 xw2Var, xs2 xs2Var);

    protected tw2 x(xw2 xw2Var, xs2 xs2Var, boolean z) {
        return ex2.a(xs2Var.f10250j, false);
    }

    protected abstract void y(tw2 tw2Var, MediaCodec mediaCodec, xs2 xs2Var, MediaCrypto mediaCrypto);

    protected abstract void z(String str, long j2, long j3);

    @Override // com.google.android.gms.internal.ads.ct2
    public boolean zzE() {
        if (this.p != null) {
            if (m() || this.F >= 0) {
                return true;
            }
            if (this.D != -9223372036854775807L && SystemClock.elapsedRealtime() < this.D) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public boolean zzF() {
        return this.N;
    }

    @Override // com.google.android.gms.internal.ads.dt2
    public final int zzq() {
        return 4;
    }
}