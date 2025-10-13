package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class f4 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;
    private final z4 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10856b;

    /* renamed from: c, reason: collision with root package name */
    private String f10857c;

    /* renamed from: d, reason: collision with root package name */
    private String f10858d;

    /* renamed from: e, reason: collision with root package name */
    private String f10859e;

    /* renamed from: f, reason: collision with root package name */
    private String f10860f;

    /* renamed from: g, reason: collision with root package name */
    private long f10861g;

    /* renamed from: h, reason: collision with root package name */
    private long f10862h;

    /* renamed from: i, reason: collision with root package name */
    private long f10863i;

    /* renamed from: j, reason: collision with root package name */
    private String f10864j;

    /* renamed from: k, reason: collision with root package name */
    private long f10865k;

    /* renamed from: l, reason: collision with root package name */
    private String f10866l;

    /* renamed from: m, reason: collision with root package name */
    private long f10867m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    f4(z4 z4Var, String str) {
        com.google.android.gms.common.internal.p.j(z4Var);
        com.google.android.gms.common.internal.p.f(str);
        this.a = z4Var;
        this.f10856b = str;
        z4Var.zzp().d();
    }

    public final String A() {
        this.a.zzp().d();
        return this.f10858d;
    }

    public final void B(long j2) {
        this.a.zzp().d();
        this.E |= this.n != j2;
        this.n = j2;
    }

    public final void C(String str) {
        this.a.zzp().d();
        this.E |= !da.w0(this.f10859e, str);
        this.f10859e = str;
    }

    public final String D() {
        this.a.zzp().d();
        return this.s;
    }

    public final void E(long j2) {
        this.a.zzp().d();
        this.E |= this.u != j2;
        this.u = j2;
    }

    public final void F(String str) {
        this.a.zzp().d();
        this.E |= !da.w0(this.f10860f, str);
        this.f10860f = str;
    }

    public final String G() {
        this.a.zzp().d();
        return this.w;
    }

    public final void H(long j2) {
        com.google.android.gms.common.internal.p.a(j2 >= 0);
        this.a.zzp().d();
        this.E = (this.f10861g != j2) | this.E;
        this.f10861g = j2;
    }

    public final void I(String str) {
        this.a.zzp().d();
        this.E |= !da.w0(this.f10864j, str);
        this.f10864j = str;
    }

    public final String J() {
        this.a.zzp().d();
        return this.f10859e;
    }

    public final void K(long j2) {
        this.a.zzp().d();
        this.E |= this.F != j2;
        this.F = j2;
    }

    public final void L(String str) {
        this.a.zzp().d();
        this.E |= !da.w0(this.f10866l, str);
        this.f10866l = str;
    }

    public final String M() {
        this.a.zzp().d();
        return this.f10860f;
    }

    public final void N(long j2) {
        this.a.zzp().d();
        this.E |= this.G != j2;
        this.G = j2;
    }

    public final void O(String str) {
        this.a.zzp().d();
        this.E |= !da.w0(this.D, str);
        this.D = str;
    }

    public final long P() {
        this.a.zzp().d();
        return this.f10862h;
    }

    public final void Q(long j2) {
        this.a.zzp().d();
        this.E |= this.x != j2;
        this.x = j2;
    }

    public final long R() {
        this.a.zzp().d();
        return this.f10863i;
    }

    public final void S(long j2) {
        this.a.zzp().d();
        this.E |= this.y != j2;
        this.y = j2;
    }

    public final String T() {
        this.a.zzp().d();
        return this.f10864j;
    }

    public final void U(long j2) {
        this.a.zzp().d();
        this.E |= this.z != j2;
        this.z = j2;
    }

    public final long V() {
        this.a.zzp().d();
        return this.f10865k;
    }

    public final void W(long j2) {
        this.a.zzp().d();
        this.E |= this.A != j2;
        this.A = j2;
    }

    public final String X() {
        this.a.zzp().d();
        return this.f10866l;
    }

    public final void Y(long j2) {
        this.a.zzp().d();
        this.E |= this.C != j2;
        this.C = j2;
    }

    public final long Z() {
        this.a.zzp().d();
        return this.f10867m;
    }

    public final void a(long j2) {
        this.a.zzp().d();
        this.E |= this.f10862h != j2;
        this.f10862h = j2;
    }

    public final void a0(long j2) {
        this.a.zzp().d();
        this.E |= this.B != j2;
        this.B = j2;
    }

    public final void b(Boolean bool) {
        this.a.zzp().d();
        this.E |= !da.X(this.t, bool);
        this.t = bool;
    }

    public final long b0() {
        this.a.zzp().d();
        return this.n;
    }

    public final void c(String str) {
        this.a.zzp().d();
        this.E |= !da.w0(this.f10857c, str);
        this.f10857c = str;
    }

    public final void c0(long j2) {
        this.a.zzp().d();
        this.E |= this.p != j2;
        this.p = j2;
    }

    public final void d(List<String> list) {
        this.a.zzp().d();
        if (da.j0(this.v, list)) {
            return;
        }
        this.E = true;
        this.v = list != null ? new ArrayList(list) : null;
    }

    public final long d0() {
        this.a.zzp().d();
        return this.u;
    }

    public final void e(boolean z) {
        this.a.zzp().d();
        this.E |= this.o != z;
        this.o = z;
    }

    public final boolean e0() {
        this.a.zzp().d();
        return this.o;
    }

    public final boolean f() {
        this.a.zzp().d();
        return this.E;
    }

    public final long f0() {
        this.a.zzp().d();
        return this.f10861g;
    }

    public final long g() {
        this.a.zzp().d();
        return this.C;
    }

    public final long g0() {
        this.a.zzp().d();
        return this.F;
    }

    public final long h() {
        this.a.zzp().d();
        return this.B;
    }

    public final long h0() {
        this.a.zzp().d();
        return this.G;
    }

    public final String i() {
        this.a.zzp().d();
        return this.D;
    }

    public final void i0() {
        this.a.zzp().d();
        long j2 = this.f10861g + 1;
        if (j2 > 2147483647L) {
            this.a.zzq().D().b("Bundle index overflow. appId", v3.s(this.f10856b));
            j2 = 0;
        }
        this.E = true;
        this.f10861g = j2;
    }

    public final String j() {
        this.a.zzp().d();
        String str = this.D;
        O(null);
        return str;
    }

    public final long j0() {
        this.a.zzp().d();
        return this.x;
    }

    public final long k() {
        this.a.zzp().d();
        return this.p;
    }

    public final long k0() {
        this.a.zzp().d();
        return this.y;
    }

    public final boolean l() {
        this.a.zzp().d();
        return this.q;
    }

    public final long l0() {
        this.a.zzp().d();
        return this.z;
    }

    public final boolean m() {
        this.a.zzp().d();
        return this.r;
    }

    public final long m0() {
        this.a.zzp().d();
        return this.A;
    }

    public final Boolean n() {
        this.a.zzp().d();
        return this.t;
    }

    public final List<String> o() {
        this.a.zzp().d();
        return this.v;
    }

    public final void p() {
        this.a.zzp().d();
        this.E = false;
    }

    public final void q(long j2) {
        this.a.zzp().d();
        this.E |= this.f10863i != j2;
        this.f10863i = j2;
    }

    public final void r(String str) {
        this.a.zzp().d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !da.w0(this.f10858d, str);
        this.f10858d = str;
    }

    public final void s(boolean z) {
        this.a.zzp().d();
        this.E |= this.q != z;
        this.q = z;
    }

    public final String t() {
        this.a.zzp().d();
        return this.f10856b;
    }

    public final void u(long j2) {
        this.a.zzp().d();
        this.E |= this.f10865k != j2;
        this.f10865k = j2;
    }

    public final void v(String str) {
        this.a.zzp().d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !da.w0(this.s, str);
        this.s = str;
    }

    public final void w(boolean z) {
        this.a.zzp().d();
        this.E |= this.r != z;
        this.r = z;
    }

    public final String x() {
        this.a.zzp().d();
        return this.f10857c;
    }

    public final void y(long j2) {
        this.a.zzp().d();
        this.E |= this.f10867m != j2;
        this.f10867m = j2;
    }

    public final void z(String str) {
        this.a.zzp().d();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !da.w0(this.w, str);
        this.w = str;
    }
}