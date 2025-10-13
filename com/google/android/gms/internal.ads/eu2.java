package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class eu2 {
    private Method A;
    private int B;
    private long C;
    private long D;
    private int E;
    private long F;
    private long G;
    private int H;
    private int I;
    private long J;
    private long K;
    private long L;
    private float M;
    private nt2[] N;
    private ByteBuffer[] O;
    private ByteBuffer P;
    private ByteBuffer Q;
    private byte[] R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private int W;
    private boolean X;
    private long Y;
    private final gu2 a;

    /* renamed from: b */
    private final mu2 f5707b;

    /* renamed from: c */
    private final nt2[] f5708c;

    /* renamed from: d */
    private final bu2 f5709d;

    /* renamed from: e */
    private final ConditionVariable f5710e = new ConditionVariable(true);

    /* renamed from: f */
    private final long[] f5711f;

    /* renamed from: g */
    private final xt2 f5712g;

    /* renamed from: h */
    private final LinkedList<cu2> f5713h;

    /* renamed from: i */
    private AudioTrack f5714i;

    /* renamed from: j */
    private int f5715j;

    /* renamed from: k */
    private int f5716k;

    /* renamed from: l */
    private int f5717l;

    /* renamed from: m */
    private int f5718m;
    private boolean n;
    private int o;
    private long p;
    private bt2 q;
    private bt2 r;
    private long s;
    private long t;
    private int u;
    private int v;
    private long w;
    private long x;
    private boolean y;
    private long z;

    public eu2(lt2 lt2Var, nt2[] nt2VarArr, bu2 bu2Var) {
        this.f5709d = bu2Var;
        if (v03.a >= 18) {
            try {
                this.A = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (v03.a >= 19) {
            this.f5712g = new yt2();
        } else {
            this.f5712g = new xt2(null);
        }
        gu2 gu2Var = new gu2();
        this.a = gu2Var;
        mu2 mu2Var = new mu2();
        this.f5707b = mu2Var;
        nt2[] nt2VarArr2 = {new ku2(), gu2Var, mu2Var};
        this.f5708c = nt2VarArr2;
        System.arraycopy(nt2VarArr, 0, nt2VarArr2, 2, 0);
        this.f5711f = new long[10];
        this.M = 1.0f;
        this.I = 0;
        this.W = 0;
        this.r = bt2.a;
        this.T = -1;
        this.N = new nt2[0];
        this.O = new ByteBuffer[0];
        this.f5713h = new LinkedList<>();
    }

    private final void p() {
        ArrayList arrayList = new ArrayList();
        nt2[] nt2VarArr = this.f5708c;
        for (int i2 = 0; i2 < 3; i2++) {
            nt2 nt2Var = nt2VarArr[i2];
            if (nt2Var.zzb()) {
                arrayList.add(nt2Var);
            } else {
                nt2Var.zzi();
            }
        }
        int size = arrayList.size();
        this.N = (nt2[]) arrayList.toArray(new nt2[size]);
        this.O = new ByteBuffer[size];
        for (int i3 = 0; i3 < size; i3++) {
            nt2 nt2Var2 = this.N[i3];
            nt2Var2.zzi();
            this.O[i3] = nt2Var2.zzg();
        }
    }

    private final void q(long j2) throws du2 {
        ByteBuffer byteBuffer;
        int length = this.N.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.O[i2 - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = nt2.a;
                }
            }
            if (i2 == length) {
                r(byteBuffer, j2);
            } else {
                nt2 nt2Var = this.N[i2];
                nt2Var.a(byteBuffer);
                ByteBuffer byteBufferZzg = nt2Var.zzg();
                this.O[i2] = byteBufferZzg;
                if (byteBufferZzg.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private final boolean r(ByteBuffer byteBuffer, long j2) throws du2 {
        int iWrite;
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        ByteBuffer byteBuffer2 = this.Q;
        if (byteBuffer2 != null) {
            f03.a(byteBuffer2 == byteBuffer);
        } else {
            this.Q = byteBuffer;
            if (v03.a < 21) {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = this.R;
                if (bArr == null || bArr.length < iRemaining) {
                    this.R = new byte[iRemaining];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.R, 0, iRemaining);
                byteBuffer.position(iPosition);
                this.S = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        if (v03.a < 21) {
            int iD = this.o - ((int) (this.F - (this.f5712g.d() * this.E)));
            if (iD > 0) {
                iWrite = this.f5714i.write(this.R, this.S, Math.min(iRemaining2, iD));
                if (iWrite > 0) {
                    this.S += iWrite;
                    byteBuffer.position(byteBuffer.position() + iWrite);
                }
            } else {
                iWrite = 0;
            }
        } else {
            iWrite = this.f5714i.write(byteBuffer, iRemaining2, 1);
        }
        this.Y = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            throw new du2(iWrite);
        }
        boolean z = this.n;
        if (!z) {
            this.F += iWrite;
        }
        if (iWrite != iRemaining2) {
            return false;
        }
        if (z) {
            this.G += this.H;
        }
        this.Q = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0032 -> B:36:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean s() throws com.google.android.gms.internal.ads.du2 {
        /*
            r9 = this;
            int r0 = r9.T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.n
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.nt2[] r0 = r9.N
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.T = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.T
            com.google.android.gms.internal.ads.nt2[] r5 = r9.N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzf()
        L28:
            r9.q(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.T
            int r0 = r0 + r2
            r9.T = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L44
            r9.r(r0, r7)
            java.nio.ByteBuffer r0 = r9.Q
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu2.s():boolean");
    }

    private final void t() {
        if (u()) {
            if (v03.a >= 21) {
                this.f5714i.setVolume(this.M);
                return;
            }
            AudioTrack audioTrack = this.f5714i;
            float f2 = this.M;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private final boolean u() {
        return this.f5714i != null;
    }

    private final long v(long j2) {
        return (j2 * 1000000) / this.f5715j;
    }

    private final long w(long j2) {
        return (j2 * this.f5715j) / 1000000;
    }

    private final long x() {
        return this.n ? this.G : this.F / this.E;
    }

    private final void y() {
        this.w = 0L;
        this.v = 0;
        this.u = 0;
        this.x = 0L;
        this.y = false;
        this.z = 0L;
    }

    private final boolean z() {
        int i2;
        return v03.a < 23 && ((i2 = this.f5718m) == 5 || i2 == 6);
    }

    public final long a(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        long jE;
        long j2;
        long j3;
        long j4;
        if (!u() || this.I == 0) {
            return Long.MIN_VALUE;
        }
        if (this.f5714i.getPlayState() == 3) {
            long jE2 = this.f5712g.e();
            if (jE2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.x >= 30000) {
                    long[] jArr = this.f5711f;
                    int i2 = this.u;
                    jArr[i2] = jE2 - jNanoTime;
                    this.u = (i2 + 1) % 10;
                    int i3 = this.v;
                    if (i3 < 10) {
                        this.v = i3 + 1;
                    }
                    this.x = jNanoTime;
                    this.w = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.v;
                        if (i4 >= i5) {
                            break;
                        }
                        this.w += this.f5711f[i4] / i5;
                        i4++;
                    }
                }
                if (!z() && jNanoTime - this.z >= 500000) {
                    boolean zF = this.f5712g.f();
                    this.y = zF;
                    if (zF) {
                        long jG = this.f5712g.g() / 1000;
                        long jH = this.f5712g.h();
                        if (jG < this.K) {
                            this.y = false;
                        } else if (Math.abs(jG - jNanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(SyslogConstants.LOG_LOCAL1);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jH);
                            sb.append(", ");
                            sb.append(jG);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jE2);
                            Log.w("AudioTrack", sb.toString());
                            this.y = false;
                        } else if (Math.abs(v(jH) - jE2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jH);
                            sb2.append(", ");
                            sb2.append(jG);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jE2);
                            Log.w("AudioTrack", sb2.toString());
                            this.y = false;
                        }
                    }
                    if (this.A != null && !this.n) {
                        try {
                            long jIntValue = (((Integer) r1.invoke(this.f5714i, null)).intValue() * 1000) - this.p;
                            this.L = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.L = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(jMax);
                                Log.w("AudioTrack", sb3.toString());
                                this.L = 0L;
                            }
                        } catch (Exception unused) {
                            this.A = null;
                        }
                    }
                    this.z = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.y) {
            jE = v(this.f5712g.h() + w(jNanoTime2 - (this.f5712g.g() / 1000)));
        } else {
            jE = this.v == 0 ? this.f5712g.e() : jNanoTime2 + this.w;
            if (!z) {
                jE -= this.L;
            }
        }
        long j5 = this.J;
        while (!this.f5713h.isEmpty() && jE >= this.f5713h.getFirst().f5374c) {
            cu2 cu2VarRemove = this.f5713h.remove();
            this.r = cu2VarRemove.a;
            this.t = cu2VarRemove.f5374c;
            this.s = cu2VarRemove.f5373b - this.J;
        }
        if (this.r.f5187b == 1.0f) {
            j4 = (jE + this.s) - this.t;
        } else {
            if (!this.f5713h.isEmpty() || this.f5707b.f() < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                j2 = this.s;
                j3 = (long) (this.r.f5187b * (jE - this.t));
            } else {
                j2 = this.s;
                j3 = v03.j(jE - this.t, this.f5707b.e(), this.f5707b.f());
            }
            j4 = j3 + j2;
        }
        return j5 + j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws java.lang.IllegalStateException, com.google.android.gms.internal.ads.zt2 {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eu2.b(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void c() throws IllegalStateException {
        this.V = true;
        if (u()) {
            this.K = System.nanoTime() / 1000;
            this.f5714i.play();
        }
    }

    public final void d() {
        if (this.I == 1) {
            this.I = 2;
        }
    }

    public final boolean e(ByteBuffer byteBuffer, long j2) throws IllegalStateException, du2, au2 {
        int iC;
        ByteBuffer byteBuffer2 = this.P;
        f03.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!u()) {
            this.f5710e.block();
            int i2 = this.W;
            if (i2 == 0) {
                this.f5714i = new AudioTrack(3, this.f5715j, this.f5716k, this.f5718m, this.o, 1);
            } else {
                this.f5714i = new AudioTrack(3, this.f5715j, this.f5716k, this.f5718m, this.o, 1, i2);
            }
            int state = this.f5714i.getState();
            if (state != 1) {
                try {
                    this.f5714i.release();
                } catch (Exception unused) {
                } finally {
                    this.f5714i = null;
                }
                throw new au2(state, this.f5715j, this.f5716k, this.o);
            }
            int audioSessionId = this.f5714i.getAudioSessionId();
            if (this.W != audioSessionId) {
                this.W = audioSessionId;
                ((iu2) this.f5709d).a.Q.f(audioSessionId);
            }
            this.f5712g.a(this.f5714i, z());
            t();
            this.X = false;
            if (this.V) {
                c();
            }
        }
        if (z()) {
            if (this.f5714i.getPlayState() == 2) {
                this.X = false;
                return false;
            }
            if (this.f5714i.getPlayState() == 1 && this.f5712g.d() != 0) {
                return false;
            }
        }
        boolean z = this.X;
        boolean zH = h();
        this.X = zH;
        if (z && !zH && this.f5714i.getPlayState() != 1) {
            ((iu2) this.f5709d).a.Q.d(this.o, is2.a(this.p), SystemClock.elapsedRealtime() - this.Y);
        }
        if (this.P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.n && this.H == 0) {
                int i3 = this.f5718m;
                if (i3 == 7 || i3 == 8) {
                    int iPosition = byteBuffer.position();
                    iC = ((((byteBuffer.get(iPosition + 5) & 252) >> 2) | ((byteBuffer.get(iPosition + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    int i4 = kt2.f7077d;
                    iC = 1536;
                } else {
                    if (i3 != 6) {
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i3);
                        throw new IllegalStateException(sb.toString());
                    }
                    iC = kt2.c(byteBuffer);
                }
                this.H = iC;
            }
            if (this.q != null) {
                if (!s()) {
                    return false;
                }
                this.f5713h.add(new cu2(this.q, Math.max(0L, j2), v(x()), null));
                this.q = null;
                p();
            }
            if (this.I == 0) {
                this.J = Math.max(0L, j2);
                this.I = 1;
            } else {
                long jV = this.J + v(this.n ? this.D : this.C / this.B);
                if (this.I == 1 && Math.abs(jV - j2) > 200000) {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(jV);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    this.I = 2;
                }
                if (this.I == 2) {
                    this.J += j2 - jV;
                    this.I = 1;
                    ju2.O(((iu2) this.f5709d).a, true);
                }
            }
            if (this.n) {
                this.D += this.H;
            } else {
                this.C += byteBuffer.remaining();
            }
            this.P = byteBuffer;
        }
        if (this.n) {
            r(this.P, j2);
        } else {
            q(j2);
        }
        if (this.P.hasRemaining()) {
            return false;
        }
        this.P = null;
        return true;
    }

    public final void f() throws du2 {
        if (!this.U && u() && s()) {
            this.f5712g.b(x());
            this.U = true;
        }
    }

    public final boolean g() {
        return !u() || (this.U && !h());
    }

    public final boolean h() {
        if (u()) {
            if (x() > this.f5712g.d()) {
                return true;
            }
            if (z() && this.f5714i.getPlayState() == 2 && this.f5714i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final bt2 i(bt2 bt2Var) {
        if (this.n) {
            bt2 bt2Var2 = bt2.a;
            this.r = bt2Var2;
            return bt2Var2;
        }
        float fC = this.f5707b.c(bt2Var.f5187b);
        this.f5707b.d(1.0f);
        bt2 bt2Var3 = new bt2(fC, 1.0f);
        bt2 bt2Var4 = this.q;
        if (bt2Var4 == null) {
            bt2Var4 = !this.f5713h.isEmpty() ? this.f5713h.getLast().a : this.r;
        }
        if (!bt2Var3.equals(bt2Var4)) {
            if (u()) {
                this.q = bt2Var3;
            } else {
                this.r = bt2Var3;
            }
        }
        return this.r;
    }

    public final bt2 j() {
        return this.r;
    }

    public final void k(float f2) {
        if (this.M != f2) {
            this.M = f2;
            t();
        }
    }

    public final void l() {
        this.V = false;
        if (u()) {
            y();
            this.f5712g.c();
        }
    }

    public final void m() throws IllegalStateException {
        if (u()) {
            this.C = 0L;
            this.D = 0L;
            this.F = 0L;
            this.G = 0L;
            this.H = 0;
            bt2 bt2Var = this.q;
            if (bt2Var != null) {
                this.r = bt2Var;
                this.q = null;
            } else if (!this.f5713h.isEmpty()) {
                this.r = this.f5713h.getLast().a;
            }
            this.f5713h.clear();
            this.s = 0L;
            this.t = 0L;
            this.P = null;
            this.Q = null;
            int i2 = 0;
            while (true) {
                nt2[] nt2VarArr = this.N;
                if (i2 >= nt2VarArr.length) {
                    break;
                }
                nt2 nt2Var = nt2VarArr[i2];
                nt2Var.zzi();
                this.O[i2] = nt2Var.zzg();
                i2++;
            }
            this.U = false;
            this.T = -1;
            this.I = 0;
            this.L = 0L;
            y();
            if (this.f5714i.getPlayState() == 3) {
                this.f5714i.pause();
            }
            AudioTrack audioTrack = this.f5714i;
            this.f5714i = null;
            this.f5712g.a(null, false);
            this.f5710e.close();
            new wt2(this, audioTrack).start();
        }
    }

    public final void n() throws IllegalStateException {
        m();
        nt2[] nt2VarArr = this.f5708c;
        for (int i2 = 0; i2 < 3; i2++) {
            nt2VarArr[i2].zzj();
        }
        this.W = 0;
        this.V = false;
    }
}