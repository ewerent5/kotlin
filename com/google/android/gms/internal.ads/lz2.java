package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lz2 {
    public final vy2 a;

    /* renamed from: b, reason: collision with root package name */
    public final hz2 f7376b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7377c;

    /* renamed from: d, reason: collision with root package name */
    public final ft2[] f7378d;

    public lz2(vy2 vy2Var, hz2 hz2Var, Object obj, ft2[] ft2VarArr) {
        this.a = vy2Var;
        this.f7376b = hz2Var;
        this.f7377c = obj;
        this.f7378d = ft2VarArr;
    }

    public final boolean a(lz2 lz2Var, int i2) {
        return lz2Var != null && v03.a(this.f7376b.a(i2), lz2Var.f7376b.a(i2)) && v03.a(this.f7378d[i2], lz2Var.f7378d[i2]);
    }
}