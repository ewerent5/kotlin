package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vd1 implements ah1<wd1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final os0 f9684b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9685c;

    /* renamed from: d, reason: collision with root package name */
    private final qp1 f9686d;

    public vd1(h52 h52Var, os0 os0Var, qp1 qp1Var, String str) {
        this.a = h52Var;
        this.f9684b = os0Var;
        this.f9686d = qp1Var;
        this.f9685c = str;
    }

    final /* synthetic */ wd1 a() {
        return new wd1(this.f9684b.b(this.f9686d.f8429f, this.f9685c), this.f9684b.c());
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<wd1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.ud1
            private final vd1 a;

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