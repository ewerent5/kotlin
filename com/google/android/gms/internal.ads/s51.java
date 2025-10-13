package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s51 implements rj0 {
    private final xo1 a;

    /* renamed from: b */
    private final th f8819b;

    /* renamed from: c */
    private final boolean f8820c;

    /* renamed from: d */
    private gb0 f8821d = null;

    s51(xo1 xo1Var, th thVar, boolean z) {
        this.a = xo1Var;
        this.f8819b = thVar;
        this.f8820c = z;
    }

    @Override // com.google.android.gms.internal.ads.rj0
    public final void a(boolean z, Context context) throws qj0 {
        try {
            if (!(this.f8820c ? this.f8819b.Q3(e.c.b.b.b.d.m4(context)) : this.f8819b.Q(e.c.b.b.b.d.m4(context)))) {
                throw new qj0("Adapter failed to show.");
            }
            if (this.f8821d == null) {
                return;
            }
            if (((Boolean) c.c().b(w3.a1)).booleanValue() || this.a.S != 2) {
                return;
            }
            this.f8821d.zza();
        } catch (Throwable th) {
            throw new qj0(th);
        }
    }

    public final void b(gb0 gb0Var) {
        this.f8821d = gb0Var;
    }
}