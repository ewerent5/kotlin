package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nw2 implements av2, iv2 {
    public static final cv2 a = new lw2();

    /* renamed from: b, reason: collision with root package name */
    private static final int f7821b = v03.l("qt  ");

    /* renamed from: g, reason: collision with root package name */
    private int f7826g;

    /* renamed from: h, reason: collision with root package name */
    private int f7827h;

    /* renamed from: i, reason: collision with root package name */
    private long f7828i;

    /* renamed from: j, reason: collision with root package name */
    private int f7829j;

    /* renamed from: k, reason: collision with root package name */
    private o03 f7830k;

    /* renamed from: l, reason: collision with root package name */
    private int f7831l;

    /* renamed from: m, reason: collision with root package name */
    private int f7832m;
    private bv2 n;
    private mw2[] o;
    private long p;
    private boolean q;

    /* renamed from: e, reason: collision with root package name */
    private final o03 f7824e = new o03(16);

    /* renamed from: f, reason: collision with root package name */
    private final Stack<uv2> f7825f = new Stack<>();

    /* renamed from: c, reason: collision with root package name */
    private final o03 f7822c = new o03(m03.a);

    /* renamed from: d, reason: collision with root package name */
    private final o03 f7823d = new o03(4);

    private final void e() {
        this.f7826g = 0;
        this.f7829j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(long r20) throws com.google.android.gms.internal.ads.at2, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nw2.g(long):void");
    }

    @Override // com.google.android.gms.internal.ads.iv2
    public final long a(long j2) {
        long j3 = Long.MAX_VALUE;
        for (mw2 mw2Var : this.o) {
            sw2 sw2Var = mw2Var.f7573b;
            int iA = sw2Var.a(j2);
            if (iA == -1) {
                iA = sw2Var.b(j2);
            }
            long j4 = sw2Var.f9007b[iA];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final int b(zu2 zu2Var, fv2 fv2Var) throws at2, InterruptedException, NumberFormatException, EOFException {
        mw2[] mw2VarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i2 = this.f7826g;
            if (i2 == 0) {
                if (this.f7829j == 0) {
                    if (!zu2Var.b(this.f7824e.a, 0, 8, true)) {
                        return -1;
                    }
                    this.f7829j = 8;
                    this.f7824e.i(0);
                    this.f7828i = this.f7824e.p();
                    this.f7827h = this.f7824e.r();
                }
                if (this.f7828i == 1) {
                    zu2Var.b(this.f7824e.a, 8, 8, false);
                    this.f7829j += 8;
                    this.f7828i = this.f7824e.v();
                }
                int i3 = this.f7827h;
                if (i3 == wv2.B || i3 == wv2.D || i3 == wv2.E || i3 == wv2.F || i3 == wv2.G || i3 == wv2.P) {
                    long jH = (zu2Var.h() + this.f7828i) - this.f7829j;
                    this.f7825f.add(new uv2(this.f7827h, jH));
                    if (this.f7828i == this.f7829j) {
                        g(jH);
                    } else {
                        e();
                    }
                } else {
                    if (i3 == wv2.R || i3 == wv2.C || i3 == wv2.S || i3 == wv2.T || i3 == wv2.l0 || i3 == wv2.m0 || i3 == wv2.n0 || i3 == wv2.Q || i3 == wv2.o0 || i3 == wv2.p0 || i3 == wv2.q0 || i3 == wv2.r0 || i3 == wv2.s0 || i3 == wv2.O || i3 == wv2.a || i3 == wv2.z0) {
                        f03.d(this.f7829j == 8);
                        f03.d(this.f7828i <= 2147483647L);
                        o03 o03Var = new o03((int) this.f7828i);
                        this.f7830k = o03Var;
                        System.arraycopy(this.f7824e.a, 0, o03Var.a, 0, 8);
                    } else {
                        this.f7830k = null;
                    }
                    this.f7826g = 1;
                }
            } else {
                if (i2 != 1) {
                    long j2 = Long.MAX_VALUE;
                    int i4 = 0;
                    int i5 = -1;
                    while (true) {
                        mw2VarArr = this.o;
                        if (i4 >= mw2VarArr.length) {
                            break;
                        }
                        mw2 mw2Var = mw2VarArr[i4];
                        int i6 = mw2Var.f7575d;
                        sw2 sw2Var = mw2Var.f7573b;
                        if (i6 != sw2Var.a) {
                            long j3 = sw2Var.f9007b[i6];
                            if (j3 < j2) {
                                i5 = i4;
                                j2 = j3;
                            }
                        }
                        i4++;
                    }
                    if (i5 == -1) {
                        return -1;
                    }
                    mw2 mw2Var2 = mw2VarArr[i5];
                    kv2 kv2Var = mw2Var2.f7574c;
                    int i7 = mw2Var2.f7575d;
                    sw2 sw2Var2 = mw2Var2.f7573b;
                    long j4 = sw2Var2.f9007b[i7];
                    int i8 = sw2Var2.f9008c[i7];
                    if (mw2Var2.a.f8289g == 1) {
                        j4 += 8;
                        i8 -= 8;
                    }
                    long jH2 = (j4 - zu2Var.h()) + this.f7831l;
                    if (jH2 < 0 || jH2 >= 262144) {
                        fv2Var.a = j4;
                        return 1;
                    }
                    int i9 = (int) jH2;
                    boolean z3 = false;
                    zu2Var.d(i9, false);
                    int i10 = mw2Var2.a.f8293k;
                    if (i10 == 0) {
                        while (true) {
                            int i11 = this.f7831l;
                            if (i11 >= i8) {
                                break;
                            }
                            int iD = kv2Var.d(zu2Var, i8 - i11, false);
                            this.f7831l += iD;
                            this.f7832m -= iD;
                        }
                    } else {
                        byte[] bArr = this.f7823d.a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i12 = 4 - i10;
                        while (this.f7831l < i8) {
                            int i13 = this.f7832m;
                            if (i13 == 0) {
                                zu2Var.b(this.f7823d.a, i12, i10, z3);
                                this.f7823d.i(z3 ? 1 : 0);
                                this.f7832m = this.f7823d.u();
                                this.f7822c.i(z3 ? 1 : 0);
                                kv2Var.c(this.f7822c, 4);
                                this.f7831l += 4;
                                i8 += i12;
                            } else {
                                int iD2 = kv2Var.d(zu2Var, i13, z3);
                                this.f7831l += iD2;
                                this.f7832m -= iD2;
                                z3 = false;
                            }
                        }
                    }
                    int i14 = i8;
                    sw2 sw2Var3 = mw2Var2.f7573b;
                    kv2Var.b(sw2Var3.f9010e[i7], sw2Var3.f9011f[i7], i14, 0, null);
                    mw2Var2.f7575d++;
                    this.f7831l = 0;
                    this.f7832m = 0;
                    return 0;
                }
                long j5 = this.f7828i - this.f7829j;
                long jH3 = zu2Var.h() + j5;
                o03 o03Var2 = this.f7830k;
                if (o03Var2 != null) {
                    zu2Var.b(o03Var2.a, this.f7829j, (int) j5, false);
                    if (this.f7827h == wv2.a) {
                        o03 o03Var3 = this.f7830k;
                        o03Var3.i(8);
                        if (o03Var3.r() == f7821b) {
                            z2 = true;
                            this.q = z2;
                        } else {
                            o03Var3.j(4);
                            while (o03Var3.d() > 0) {
                                if (o03Var3.r() == f7821b) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            this.q = z2;
                        }
                    } else if (!this.f7825f.isEmpty()) {
                        this.f7825f.peek().d(new vv2(this.f7827h, this.f7830k));
                    }
                } else if (j5 < 262144) {
                    zu2Var.d((int) j5, false);
                } else {
                    fv2Var.a = zu2Var.h() + j5;
                    z = true;
                    g(jH3);
                    if (z && this.f7826g != 2) {
                        return 1;
                    }
                }
                z = false;
                g(jH3);
                if (z) {
                    continue;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final boolean c(zu2 zu2Var) {
        return ow2.b(zu2Var);
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final void d(bv2 bv2Var) {
        this.n = bv2Var;
    }

    @Override // com.google.android.gms.internal.ads.av2
    public final void f(long j2, long j3) {
        this.f7825f.clear();
        this.f7829j = 0;
        this.f7831l = 0;
        this.f7832m = 0;
        if (j2 == 0) {
            e();
            return;
        }
        mw2[] mw2VarArr = this.o;
        if (mw2VarArr != null) {
            for (mw2 mw2Var : mw2VarArr) {
                sw2 sw2Var = mw2Var.f7573b;
                int iA = sw2Var.a(j3);
                if (iA == -1) {
                    iA = sw2Var.b(j3);
                }
                mw2Var.f7575d = iA;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.iv2
    public final long zzb() {
        return this.p;
    }
}