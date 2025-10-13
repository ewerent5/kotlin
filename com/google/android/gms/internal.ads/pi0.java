package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class pi0 {
    private final rj0 a;

    /* renamed from: b, reason: collision with root package name */
    private final ew f8170b;

    public pi0(rj0 rj0Var, ew ewVar) {
        this.a = rj0Var;
        this.f8170b = ewVar;
    }

    public static final nh0<fh0> h(xj0 xj0Var) {
        return new nh0<>(xj0Var, qr.f8451f);
    }

    public final rj0 a() {
        return this.a;
    }

    public final ew b() {
        return this.f8170b;
    }

    public final View c() {
        ew ewVar = this.f8170b;
        if (ewVar != null) {
            return ewVar.q();
        }
        return null;
    }

    public final View d() {
        ew ewVar = this.f8170b;
        if (ewVar == null) {
            return null;
        }
        return ewVar.q();
    }

    public Set<nh0<qa0>> e(p90 p90Var) {
        return Collections.singleton(new nh0(p90Var, qr.f8451f));
    }

    public Set<nh0<fh0>> f(p90 p90Var) {
        return Collections.singleton(new nh0(p90Var, qr.f8451f));
    }

    public final nh0<xe0> g(Executor executor) {
        final ew ewVar = this.f8170b;
        return new nh0<>(new xe0(ewVar) { // from class: com.google.android.gms.internal.ads.oi0

            /* renamed from: e, reason: collision with root package name */
            private final ew f7948e;

            {
                this.f7948e = ewVar;
            }

            @Override // com.google.android.gms.internal.ads.xe0
            public final void zza() {
                ew ewVar2 = this.f7948e;
                if (ewVar2.p() != null) {
                    ewVar2.p().zzb();
                }
            }
        }, executor);
    }
}