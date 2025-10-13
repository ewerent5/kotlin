package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class jz2 {
    private iz2 a;

    public abstract lz2 a(dt2[] dt2VarArr, vy2 vy2Var);

    public abstract void b(Object obj);

    public final void c(iz2 iz2Var) {
        this.a = iz2Var;
    }

    protected final void d() {
        iz2 iz2Var = this.a;
        if (iz2Var != null) {
            iz2Var.zzk();
        }
    }
}