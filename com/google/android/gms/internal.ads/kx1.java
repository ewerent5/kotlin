package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class kx1 implements e.c.b.b.e.a {
    private final lb0 a;

    /* renamed from: b */
    private final int f7120b;

    kx1(lb0 lb0Var, int i2) {
        this.a = lb0Var;
        this.f7120b = i2;
    }

    @Override // e.c.b.b.e.a
    public final Object a(e.c.b.b.e.h hVar) {
        lb0 lb0Var = this.a;
        int i2 = this.f7120b;
        int i3 = lx1.f7350b;
        if (!hVar.n()) {
            return Boolean.FALSE;
        }
        tz1 tz1VarA = ((vz1) hVar.k()).a(lb0Var.n().i());
        tz1VarA.c(i2);
        tz1VarA.a();
        return Boolean.TRUE;
    }
}