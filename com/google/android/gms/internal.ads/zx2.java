package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zx2 implements dy2, bv2, zz2, oy2 {
    private long A;
    private boolean[] B;
    private boolean[] C;
    private boolean D;
    private long F;
    private int H;
    private boolean I;
    private boolean J;
    private final sz2 K;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f10653e;

    /* renamed from: f, reason: collision with root package name */
    private final pz2 f10654f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10655g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f10656h;

    /* renamed from: i, reason: collision with root package name */
    private final ay2 f10657i;

    /* renamed from: j, reason: collision with root package name */
    private final ey2 f10658j;

    /* renamed from: k, reason: collision with root package name */
    private final long f10659k;

    /* renamed from: m, reason: collision with root package name */
    private final xx2 f10661m;
    private cy2 s;
    private iv2 t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private vy2 z;

    /* renamed from: l, reason: collision with root package name */
    private final d03 f10660l = new d03("Loader:ExtractorMediaPeriod");
    private final h03 n = new h03();
    private final Runnable o = new sx2(this);
    private final Runnable p = new tx2(this);
    private final Handler q = new Handler();
    private long G = -9223372036854775807L;
    private final SparseArray<py2> r = new SparseArray<>();
    private long E = -1;

    public zx2(Uri uri, pz2 pz2Var, av2[] av2VarArr, int i2, Handler handler, ay2 ay2Var, ey2 ey2Var, sz2 sz2Var, String str, int i3, byte[] bArr) {
        this.f10653e = uri;
        this.f10654f = pz2Var;
        this.f10655g = i2;
        this.f10656h = handler;
        this.f10657i = ay2Var;
        this.f10658j = ey2Var;
        this.K = sz2Var;
        this.f10659k = i3;
        this.f10661m = new xx2(av2VarArr, this);
    }

    private final void n(wx2 wx2Var) {
        if (this.E == -1) {
            this.E = wx2Var.f10078i;
        }
    }

    private final void o() {
        iv2 iv2Var;
        wx2 wx2Var = new wx2(this, this.f10653e, this.f10654f, this.f10661m, this.n);
        if (this.v) {
            f03.d(r());
            long j2 = this.A;
            if (j2 != -9223372036854775807L && this.G >= j2) {
                this.I = true;
                this.G = -9223372036854775807L;
                return;
            } else {
                wx2Var.a(this.t.a(this.G), this.G);
                this.G = -9223372036854775807L;
            }
        }
        this.H = p();
        int i2 = this.f10655g;
        if (i2 == -1) {
            i2 = (this.v && this.E == -1 && ((iv2Var = this.t) == null || iv2Var.zzb() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f10660l.a(wx2Var, this, i2);
    }

    private final int p() {
        int size = this.r.size();
        int iF = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iF += this.r.valueAt(i2).f();
        }
        return iF;
    }

    private final long q() {
        int size = this.r.size();
        long jMax = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.r.valueAt(i2).j());
        }
        return jMax;
    }

    private final boolean r() {
        return this.G != -9223372036854775807L;
    }

    static /* synthetic */ void x(zx2 zx2Var) {
        if (zx2Var.J || zx2Var.v || zx2Var.t == null || !zx2Var.u) {
            return;
        }
        int size = zx2Var.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (zx2Var.r.valueAt(i2).i() == null) {
                return;
            }
        }
        zx2Var.n.b();
        uy2[] uy2VarArr = new uy2[size];
        zx2Var.C = new boolean[size];
        zx2Var.B = new boolean[size];
        zx2Var.A = zx2Var.t.zzb();
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                zx2Var.z = new vy2(uy2VarArr);
                zx2Var.v = true;
                zx2Var.f10658j.c(new ty2(zx2Var.A, zx2Var.t.zza()), null);
                zx2Var.s.g(zx2Var);
                return;
            }
            xs2 xs2VarI = zx2Var.r.valueAt(i3).i();
            uy2VarArr[i3] = new uy2(xs2VarI);
            String str = xs2VarI.f10250j;
            if (!k03.b(str) && !k03.a(str)) {
                z = false;
            }
            zx2Var.C[i3] = z;
            zx2Var.D = z | zx2Var.D;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.dy2, com.google.android.gms.internal.ads.sy2
    public final boolean a(long j2) {
        if (this.I) {
            return false;
        }
        if (this.v && this.y == 0) {
            return false;
        }
        boolean zA = this.n.a();
        if (this.f10660l.b()) {
            return zA;
        }
        o();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.bv2
    public final void b(iv2 iv2Var) {
        this.t = iv2Var;
        this.q.post(this.o);
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final /* bridge */ /* synthetic */ int c(b03 b03Var, long j2, long j3, IOException iOException) {
        iv2 iv2Var;
        wx2 wx2Var = (wx2) b03Var;
        n(wx2Var);
        Handler handler = this.f10656h;
        if (handler != null) {
            handler.post(new vx2(this, iOException));
        }
        if (iOException instanceof wy2) {
            return 3;
        }
        int iP = p();
        int i2 = this.H;
        if (this.E == -1 && ((iv2Var = this.t) == null || iv2Var.zzb() == -9223372036854775807L)) {
            this.F = 0L;
            this.x = this.v;
            int size = this.r.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.r.valueAt(i3).e(!this.v || this.B[i3]);
            }
            wx2Var.a(0L, 0L);
        }
        this.H = p();
        return iP <= i2 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long d(long j2) {
        if (true != this.t.zza()) {
            j2 = 0;
        }
        this.F = j2;
        int size = this.r.size();
        boolean zR = true ^ r();
        int i2 = 0;
        while (true) {
            if (!zR) {
                this.G = j2;
                this.I = false;
                if (this.f10660l.b()) {
                    this.f10660l.c();
                } else {
                    for (int i3 = 0; i3 < size; i3++) {
                        this.r.valueAt(i3).e(this.B[i3]);
                    }
                }
            } else {
                if (i2 >= size) {
                    break;
                }
                if (this.B[i2]) {
                    zR = this.r.valueAt(i2).l(j2, false);
                }
                i2++;
            }
        }
        this.x = false;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long e(zy2[] zy2VarArr, boolean[] zArr, qy2[] qy2VarArr, boolean[] zArr2, long j2) {
        zy2 zy2Var;
        f03.d(this.v);
        for (int i2 = 0; i2 < zy2VarArr.length; i2++) {
            qy2 qy2Var = qy2VarArr[i2];
            if (qy2Var != null && (zy2VarArr[i2] == null || !zArr[i2])) {
                int i3 = ((yx2) qy2Var).a;
                f03.d(this.B[i3]);
                this.y--;
                this.B[i3] = false;
                this.r.valueAt(i3).g();
                qy2VarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i4 = 0; i4 < zy2VarArr.length; i4++) {
            if (qy2VarArr[i4] == null && (zy2Var = zy2VarArr[i4]) != null) {
                f03.d(zy2Var.b() == 1);
                f03.d(zy2Var.d(0) == 0);
                int iB = this.z.b(zy2Var.a());
                f03.d(!this.B[iB]);
                this.y++;
                this.B[iB] = true;
                qy2VarArr[i4] = new yx2(this, iB);
                zArr2[i4] = true;
                z = true;
            }
        }
        if (!this.w) {
            int size = this.r.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!this.B[i5]) {
                    this.r.valueAt(i5).g();
                }
            }
        }
        if (this.y == 0) {
            this.x = false;
            if (this.f10660l.b()) {
                this.f10660l.c();
            }
        } else if (!this.w ? j2 != 0 : z) {
            j2 = d(j2);
            for (int i6 = 0; i6 < qy2VarArr.length; i6++) {
                if (qy2VarArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.w = true;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void f(cy2 cy2Var, long j2) {
        this.s = cy2Var;
        this.n.a();
        o();
    }

    @Override // com.google.android.gms.internal.ads.bv2
    public final void g() {
        this.u = true;
        this.q.post(this.o);
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final /* bridge */ /* synthetic */ void h(b03 b03Var, long j2, long j3, boolean z) {
        n((wx2) b03Var);
        if (z || this.y <= 0) {
            return;
        }
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r.valueAt(i2).e(this.B[i2]);
        }
        this.s.b(this);
    }

    @Override // com.google.android.gms.internal.ads.bv2
    public final kv2 i(int i2, int i3) {
        py2 py2Var = this.r.get(i2);
        if (py2Var != null) {
            return py2Var;
        }
        py2 py2Var2 = new py2(this.K, null);
        py2Var2.n(this);
        this.r.put(i2, py2Var2);
        return py2Var2;
    }

    @Override // com.google.android.gms.internal.ads.oy2
    public final void j(xs2 xs2Var) {
        this.q.post(this.o);
    }

    @Override // com.google.android.gms.internal.ads.zz2
    public final /* bridge */ /* synthetic */ void k(b03 b03Var, long j2, long j3) {
        n((wx2) b03Var);
        this.I = true;
        if (this.A == -9223372036854775807L) {
            long jQ = q();
            long j4 = jQ == Long.MIN_VALUE ? 0L : jQ + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.A = j4;
            this.f10658j.c(new ty2(j4, this.t.zza()), null);
        }
        this.s.b(this);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void l(long j2) {
    }

    public final void s() {
        this.f10660l.d(new ux2(this, this.f10661m));
        this.q.removeCallbacksAndMessages(null);
        this.J = true;
    }

    final boolean t(int i2) {
        return this.I || (!r() && this.r.valueAt(i2).h());
    }

    final void u() {
        this.f10660l.e(Level.ALL_INT);
    }

    final int v(int i2, ys2 ys2Var, su2 su2Var, boolean z) {
        if (this.x || r()) {
            return -3;
        }
        return this.r.valueAt(i2).m(ys2Var, su2Var, z, this.I, this.F);
    }

    final void w(int i2, long j2) {
        py2 py2VarValueAt = this.r.valueAt(i2);
        if (!this.I || j2 <= py2VarValueAt.j()) {
            py2VarValueAt.l(j2, true);
        } else {
            py2VarValueAt.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.dy2, com.google.android.gms.internal.ads.sy2
    public final long zza() {
        if (this.y == 0) {
            return Long.MIN_VALUE;
        }
        return zzj();
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final void zzf() throws IOException {
        this.f10660l.e(Level.ALL_INT);
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final vy2 zzg() {
        return this.z;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long zzi() {
        if (!this.x) {
            return -9223372036854775807L;
        }
        this.x = false;
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.dy2
    public final long zzj() {
        long jQ;
        if (this.I) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.G;
        }
        if (this.D) {
            int size = this.r.size();
            jQ = Long.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                if (this.C[i2]) {
                    jQ = Math.min(jQ, this.r.valueAt(i2).j());
                }
            }
        } else {
            jQ = q();
        }
        return jQ == Long.MIN_VALUE ? this.F : jQ;
    }
}