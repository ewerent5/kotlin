package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zg1;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class td1<S extends zg1> implements ah1<S> {
    private final AtomicReference<sd1<S>> a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f9115b;

    /* renamed from: c, reason: collision with root package name */
    private final ah1<S> f9116c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9117d;

    public td1(ah1<S> ah1Var, long j2, com.google.android.gms.common.util.f fVar) {
        this.f9115b = fVar;
        this.f9116c = ah1Var;
        this.f9117d = j2;
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<S> zza() {
        sd1<S> sd1Var = this.a.get();
        if (sd1Var == null || sd1Var.a()) {
            sd1Var = new sd1<>(this.f9116c.zza(), this.f9117d, this.f9115b);
            this.a.set(sd1Var);
        }
        return sd1Var.a;
    }
}