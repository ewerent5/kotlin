package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ue1 implements ah1<ve1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final gx0 f9427b;

    ue1(h52 h52Var, gx0 gx0Var) {
        this.a = h52Var;
        this.f9427b = gx0Var;
    }

    final /* synthetic */ ve1 a() {
        return new ve1(this.f9427b.d());
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<ve1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.te1
            private final ue1 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}