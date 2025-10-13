package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class df1 implements ah1<ef1> {
    private final h52 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo1 f5471b;

    public df1(h52 h52Var, wo1 wo1Var) {
        this.a = h52Var;
        this.f5471b = wo1Var;
    }

    final /* synthetic */ ef1 a() {
        return new ef1(this.f5471b);
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<ef1> zza() {
        return this.a.N(new Callable(this) { // from class: com.google.android.gms.internal.ads.cf1
            private final df1 a;

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