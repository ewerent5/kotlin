package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qs2 implements ns2 {
    private final ct2[] a;

    /* renamed from: b, reason: collision with root package name */
    private final jz2 f8455b;

    /* renamed from: c, reason: collision with root package name */
    private final hz2 f8456c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f8457d;

    /* renamed from: e, reason: collision with root package name */
    private final vs2 f8458e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet<ks2> f8459f;

    /* renamed from: g, reason: collision with root package name */
    private final it2 f8460g;

    /* renamed from: h, reason: collision with root package name */
    private final ht2 f8461h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8462i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8463j;

    /* renamed from: k, reason: collision with root package name */
    private int f8464k;

    /* renamed from: l, reason: collision with root package name */
    private int f8465l;

    /* renamed from: m, reason: collision with root package name */
    private int f8466m;
    private boolean n;
    private jt2 o;
    private Object p;
    private vy2 q;
    private hz2 r;
    private bt2 s;
    private ss2 t;
    private long u;

    @SuppressLint({"HandlerLeak"})
    public qs2(ct2[] ct2VarArr, jz2 jz2Var, iu iuVar, byte[] bArr) {
        String str = v03.f9616e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.a = ct2VarArr;
        Objects.requireNonNull(jz2Var);
        this.f8455b = jz2Var;
        this.f8463j = false;
        this.f8464k = 1;
        this.f8459f = new CopyOnWriteArraySet<>();
        hz2 hz2Var = new hz2(new zy2[2], null);
        this.f8456c = hz2Var;
        this.o = jt2.a;
        this.f8460g = new it2();
        this.f8461h = new ht2();
        this.q = vy2.a;
        this.r = hz2Var;
        this.s = bt2.a;
        ps2 ps2Var = new ps2(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f8457d = ps2Var;
        ss2 ss2Var = new ss2(0, 0L);
        this.t = ss2Var;
        this.f8458e = new vs2(ct2VarArr, jz2Var, iuVar, this.f8463j, 0, ps2Var, ss2Var, this, null);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void a() {
        this.f8458e.q();
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void b(boolean z) {
        if (this.f8463j != z) {
            this.f8463j = z;
            this.f8458e.s(z);
            Iterator<ks2> it = this.f8459f.iterator();
            while (it.hasNext()) {
                it.next().j(z, this.f8464k);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void c(fy2 fy2Var) {
        if (!this.o.f() || this.p != null) {
            this.o = jt2.a;
            this.p = null;
            Iterator<ks2> it = this.f8459f.iterator();
            while (it.hasNext()) {
                it.next().h(this.o, this.p);
            }
        }
        if (this.f8462i) {
            this.f8462i = false;
            this.q = vy2.a;
            this.r = this.f8456c;
            this.f8455b.b(null);
            Iterator<ks2> it2 = this.f8459f.iterator();
            while (it2.hasNext()) {
                it2.next().f(this.q, this.r);
            }
        }
        this.f8466m++;
        this.f8458e.r(fy2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void d(ms2... ms2VarArr) {
        this.f8458e.w(ms2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void e(ms2... ms2VarArr) {
        this.f8458e.v(ms2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void f(int i2) {
        this.f8458e.z(i2);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void g(ks2 ks2Var) {
        this.f8459f.add(ks2Var);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void h(long j2) {
        k();
        if (!this.o.f() && this.o.a() <= 0) {
            throw new zs2(this.o, 0, j2);
        }
        this.f8465l++;
        if (!this.o.f()) {
            this.o.g(0, this.f8460g, false);
            long jB = is2.b(j2);
            long j3 = this.o.d(0, this.f8461h, false).f6382c;
            if (j3 != -9223372036854775807L) {
                int i2 = (jB > j3 ? 1 : (jB == j3 ? 0 : -1));
            }
        }
        this.u = j2;
        this.f8458e.t(this.o, 0, is2.b(j2));
        Iterator<ks2> it = this.f8459f.iterator();
        while (it.hasNext()) {
            it.next().zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void i(ks2 ks2Var) {
        this.f8459f.remove(ks2Var);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void j(int i2) {
        this.f8458e.y(i2);
    }

    public final int k() {
        if (!this.o.f() && this.f8465l <= 0) {
            this.o.d(this.t.a, this.f8461h, false);
        }
        return 0;
    }

    final void l(Message message) {
        switch (message.what) {
            case 0:
                this.f8466m--;
                return;
            case 1:
                this.f8464k = message.arg1;
                Iterator<ks2> it = this.f8459f.iterator();
                while (it.hasNext()) {
                    it.next().j(this.f8463j, this.f8464k);
                }
                return;
            case 2:
                this.n = message.arg1 != 0;
                Iterator<ks2> it2 = this.f8459f.iterator();
                while (it2.hasNext()) {
                    it2.next().zzc(this.n);
                }
                return;
            case 3:
                if (this.f8466m == 0) {
                    lz2 lz2Var = (lz2) message.obj;
                    this.f8462i = true;
                    this.q = lz2Var.a;
                    this.r = lz2Var.f7376b;
                    this.f8455b.b(lz2Var.f7377c);
                    Iterator<ks2> it3 = this.f8459f.iterator();
                    while (it3.hasNext()) {
                        it3.next().f(this.q, this.r);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.f8465l - 1;
                this.f8465l = i2;
                if (i2 == 0) {
                    this.t = (ss2) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<ks2> it4 = this.f8459f.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzf();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.f8465l == 0) {
                    this.t = (ss2) message.obj;
                    Iterator<ks2> it5 = this.f8459f.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzf();
                    }
                    return;
                }
                return;
            case 6:
                us2 us2Var = (us2) message.obj;
                this.f8465l -= us2Var.f9552d;
                if (this.f8466m == 0) {
                    this.o = us2Var.a;
                    this.p = us2Var.f9550b;
                    this.t = us2Var.f9551c;
                    Iterator<ks2> it6 = this.f8459f.iterator();
                    while (it6.hasNext()) {
                        it6.next().h(this.o, this.p);
                    }
                    return;
                }
                return;
            case 7:
                bt2 bt2Var = (bt2) message.obj;
                if (this.s.equals(bt2Var)) {
                    return;
                }
                this.s = bt2Var;
                Iterator<ks2> it7 = this.f8459f.iterator();
                while (it7.hasNext()) {
                    it7.next().e(bt2Var);
                }
                return;
            case 8:
                js2 js2Var = (js2) message.obj;
                Iterator<ks2> it8 = this.f8459f.iterator();
                while (it8.hasNext()) {
                    it8.next().b(js2Var);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final int zzc() {
        return this.f8464k;
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final boolean zzf() {
        return this.f8463j;
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void zzh() {
        this.f8458e.u();
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final void zzi() {
        this.f8458e.x();
        this.f8457d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final long zzl() {
        if (this.o.f()) {
            return -9223372036854775807L;
        }
        jt2 jt2Var = this.o;
        k();
        return is2.a(jt2Var.g(0, this.f8460g, false).a);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final long zzm() {
        if (this.o.f() || this.f8465l > 0) {
            return this.u;
        }
        this.o.d(this.t.a, this.f8461h, false);
        return is2.a(0L) + is2.a(this.t.f8981c);
    }

    @Override // com.google.android.gms.internal.ads.ns2
    public final long zzn() {
        if (this.o.f() || this.f8465l > 0) {
            return this.u;
        }
        this.o.d(this.t.a, this.f8461h, false);
        return is2.a(0L) + is2.a(this.t.f8982d);
    }
}