package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import j$.util.Spliterator;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class cl2 extends ci2 {

    /* renamed from: i, reason: collision with root package name */
    static final int[] f5327i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, SyslogConstants.LOG_LOCAL2, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: j, reason: collision with root package name */
    private final int f5328j;

    /* renamed from: k, reason: collision with root package name */
    private final ci2 f5329k;

    /* renamed from: l, reason: collision with root package name */
    private final ci2 f5330l;

    /* renamed from: m, reason: collision with root package name */
    private final int f5331m;
    private final int n;

    private cl2(ci2 ci2Var, ci2 ci2Var2) {
        this.f5329k = ci2Var;
        this.f5330l = ci2Var2;
        int iL = ci2Var.l();
        this.f5331m = iL;
        this.f5328j = iL + ci2Var2.l();
        this.n = Math.max(ci2Var.o(), ci2Var2.o()) + 1;
    }

    private static ci2 S(ci2 ci2Var, ci2 ci2Var2) {
        int iL = ci2Var.l();
        int iL2 = ci2Var2.l();
        byte[] bArr = new byte[iL + iL2];
        ci2Var.M(bArr, 0, 0, iL);
        ci2Var2.M(bArr, 0, iL, iL2);
        return new zh2(bArr);
    }

    static ci2 U(ci2 ci2Var, ci2 ci2Var2) {
        if (ci2Var2.l() == 0) {
            return ci2Var;
        }
        if (ci2Var.l() == 0) {
            return ci2Var2;
        }
        int iL = ci2Var.l() + ci2Var2.l();
        if (iL < 128) {
            return S(ci2Var, ci2Var2);
        }
        if (ci2Var instanceof cl2) {
            cl2 cl2Var = (cl2) ci2Var;
            if (cl2Var.f5330l.l() + ci2Var2.l() < 128) {
                return new cl2(cl2Var.f5329k, S(cl2Var.f5330l, ci2Var2));
            }
            if (cl2Var.f5329k.o() > cl2Var.f5330l.o() && cl2Var.n > ci2Var2.o()) {
                return new cl2(cl2Var.f5329k, new cl2(cl2Var.f5330l, ci2Var2));
            }
        }
        return iL >= V(Math.max(ci2Var.o(), ci2Var2.o()) + 1) ? new cl2(ci2Var, ci2Var2) : zk2.a(new zk2(null), ci2Var, ci2Var2);
    }

    static int V(int i2) {
        int[] iArr = f5327i;
        int length = iArr.length;
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.ci2
    /* renamed from: E */
    public final xh2 iterator() {
        return new yk2(this);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ci2)) {
            return false;
        }
        ci2 ci2Var = (ci2) obj;
        if (this.f5328j != ci2Var.l()) {
            return false;
        }
        if (this.f5328j == 0) {
            return true;
        }
        int iC = c();
        int iC2 = ci2Var.c();
        if (iC != 0 && iC2 != 0 && iC != iC2) {
            return false;
        }
        yk2 yk2Var = null;
        al2 al2Var = new al2(this, yk2Var);
        yh2 yh2VarA = al2Var.next();
        al2 al2Var2 = new al2(ci2Var, yk2Var);
        yh2 yh2VarA2 = al2Var2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int iL = yh2VarA.l() - i2;
            int iL2 = yh2VarA2.l() - i3;
            int iMin = Math.min(iL, iL2);
            if (!(i2 == 0 ? yh2VarA.Q(yh2VarA2, i3, iMin) : yh2VarA2.Q(yh2VarA, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.f5328j;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iL) {
                yh2VarA = al2Var.next();
                i2 = 0;
            } else {
                i2 += iMin;
                yh2VarA = yh2VarA;
            }
            if (iMin == iL2) {
                yh2VarA2 = al2Var2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final byte h(int i2) {
        ci2.e(i2, this.f5328j);
        return k(i2);
    }

    @Override // com.google.android.gms.internal.ads.ci2, java.lang.Iterable, j$.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new yk2(this);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    final byte k(int i2) {
        int i3 = this.f5331m;
        return i2 < i3 ? this.f5329k.k(i2) : this.f5330l.k(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final int l() {
        return this.f5328j;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final void n(byte[] bArr, int i2, int i3, int i4) {
        int i5 = this.f5331m;
        if (i2 + i4 <= i5) {
            this.f5329k.n(bArr, i2, i3, i4);
        } else {
            if (i2 >= i5) {
                this.f5330l.n(bArr, i2 - i5, i3, i4);
                return;
            }
            int i6 = i5 - i2;
            this.f5329k.n(bArr, i2, i3, i6);
            this.f5330l.n(bArr, 0, i3 + i6, i4 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final int o() {
        return this.n;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final boolean p() {
        return this.f5328j >= V(this.n);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final ci2 r(int i2, int i3) {
        int iF = ci2.f(i2, i3, this.f5328j);
        if (iF == 0) {
            return ci2.f5319e;
        }
        if (iF == this.f5328j) {
            return this;
        }
        int i4 = this.f5331m;
        if (i3 <= i4) {
            return this.f5329k.r(i2, i3);
        }
        if (i2 >= i4) {
            return this.f5330l.r(i2 - i4, i3 - i4);
        }
        ci2 ci2Var = this.f5329k;
        return new cl2(ci2Var.r(i2, ci2Var.l()), this.f5330l.r(0, i3 - this.f5331m));
    }

    @Override // com.google.android.gms.internal.ads.ci2
    final void t(rh2 rh2Var) {
        this.f5329k.t(rh2Var);
        this.f5330l.t(rh2Var);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final String u(Charset charset) {
        return new String(O(), charset);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final boolean w() {
        int iX = this.f5329k.x(0, 0, this.f5331m);
        ci2 ci2Var = this.f5330l;
        return ci2Var.x(iX, 0, ci2Var.l()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final int x(int i2, int i3, int i4) {
        int i5 = this.f5331m;
        if (i3 + i4 <= i5) {
            return this.f5329k.x(i2, i3, i4);
        }
        if (i3 >= i5) {
            return this.f5330l.x(i2, i3 - i5, i4);
        }
        int i6 = i5 - i3;
        return this.f5330l.x(this.f5329k.x(i2, i3, i6), 0, i4 - i6);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    protected final int y(int i2, int i3, int i4) {
        int i5 = this.f5331m;
        if (i3 + i4 <= i5) {
            return this.f5329k.y(i2, i3, i4);
        }
        if (i3 >= i5) {
            return this.f5330l.y(i2, i3 - i5, i4);
        }
        int i6 = i5 - i3;
        return this.f5330l.y(this.f5329k.y(i2, i3, i6), 0, i4 - i6);
    }

    @Override // com.google.android.gms.internal.ads.ci2
    public final gi2 z() {
        return new fi2(new bl2(this), Spliterator.CONCURRENT, null);
    }

    /* synthetic */ cl2(ci2 ci2Var, ci2 ci2Var2, yk2 yk2Var) {
        this(ci2Var, ci2Var2);
    }
}