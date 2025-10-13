package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z30 extends s60 {

    /* renamed from: i, reason: collision with root package name */
    private final View f10540i;

    /* renamed from: j, reason: collision with root package name */
    private final ew f10541j;

    /* renamed from: k, reason: collision with root package name */
    private final yo1 f10542k;

    /* renamed from: l, reason: collision with root package name */
    private final int f10543l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f10544m;
    private final boolean n;
    private final r30 o;
    private u33 p;

    z30(r60 r60Var, View view, ew ewVar, yo1 yo1Var, int i2, boolean z, boolean z2, r30 r30Var) {
        super(r60Var);
        this.f10540i = view;
        this.f10541j = ewVar;
        this.f10542k = yo1Var;
        this.f10543l = i2;
        this.f10544m = z;
        this.n = z2;
        this.o = r30Var;
    }

    public final yo1 g() {
        return up1.a(this.f8822b.q, this.f10542k);
    }

    public final View h() {
        return this.f10540i;
    }

    public final int i() {
        return this.f10543l;
    }

    public final boolean j() {
        return this.f10544m;
    }

    public final boolean k() {
        return this.n;
    }

    public final boolean l() {
        return this.f10541j.E0() != null && this.f10541j.E0().zzc();
    }

    public final boolean m() {
        return this.f10541j.m0();
    }

    public final void n(j33 j33Var) {
        this.f10541j.o0(j33Var);
    }

    public final void o(long j2, int i2) {
        this.o.a(j2, i2);
    }

    public final void p(u33 u33Var) {
        this.p = u33Var;
    }

    public final u33 q() {
        return this.p;
    }
}