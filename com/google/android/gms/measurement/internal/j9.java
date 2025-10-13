package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class j9 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    long f10970e;

    /* renamed from: f, reason: collision with root package name */
    long f10971f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f9 f10972g;

    j9(f9 f9Var, long j2, long j3) {
        this.f10972g = f9Var;
        this.f10970e = j2;
        this.f10971f = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10972g.f10876b.zzp().u(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.i9

            /* renamed from: e, reason: collision with root package name */
            private final j9 f10956e;

            {
                this.f10956e = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                j9 j9Var = this.f10956e;
                f9 f9Var = j9Var.f10972g;
                long j2 = j9Var.f10970e;
                long j3 = j9Var.f10971f;
                f9Var.f10876b.d();
                f9Var.f10876b.zzq().H().a("Application going to the background");
                boolean z = true;
                if (f9Var.f10876b.i().o(t.w0)) {
                    f9Var.f10876b.h().x.a(true);
                }
                Bundle bundle = new Bundle();
                if (!f9Var.f10876b.i().D().booleanValue()) {
                    f9Var.f10876b.f10846e.f(j3);
                    if (f9Var.f10876b.i().o(t.n0)) {
                        bundle.putLong("_et", f9Var.f10876b.w(j3));
                        p7.J(f9Var.f10876b.n().y(true), bundle, true);
                    } else {
                        z = false;
                    }
                    f9Var.f10876b.z(false, z, j3);
                }
                f9Var.f10876b.k().O("auto", "_ab", j2, bundle);
            }
        });
    }
}