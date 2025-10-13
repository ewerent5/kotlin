package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wc1 implements ah1<yc1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final qp1 f9947b;

    /* renamed from: c, reason: collision with root package name */
    private final kr f9948c;

    /* renamed from: d, reason: collision with root package name */
    private final sq f9949d;

    public wc1(h52 h52Var, qp1 qp1Var, kr krVar, sq sqVar) {
        this.a = h52Var;
        this.f9947b = qp1Var;
        this.f9948c = krVar;
        this.f9949d = sqVar;
    }

    final /* synthetic */ yc1 a() {
        return new yc1(this.f9947b.f8433j, this.f9948c, this.f9949d.h());
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<yc1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.vc1
            private final wc1 a;

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