package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.ec;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class x9 implements Callable<String> {
    private final /* synthetic */ ka a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t9 f11341b;

    x9(t9 t9Var, ka kaVar) {
        this.f11341b = t9Var;
        this.a = kaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        if (ec.a() && this.f11341b.G().o(t.L0) && (!this.f11341b.b(this.a.f10989e).q() || !d.b(this.a.A).q())) {
            this.f11341b.zzq().I().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        f4 f4VarQ = this.f11341b.Q(this.a);
        if (f4VarQ != null) {
            return f4VarQ.x();
        }
        this.f11341b.zzq().D().a("App info was null when attempting to get app instance id");
        return null;
    }
}