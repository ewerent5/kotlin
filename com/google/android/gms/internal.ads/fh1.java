package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fh1<T> implements mo2<eh1<T>> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Set<ah1<? extends zg1<T>>>> f5872b;

    public fh1(wo2<Executor> wo2Var, wo2<Set<ah1<? extends zg1<T>>>> wo2Var2) {
        this.a = wo2Var;
        this.f5872b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eh1<T> zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new eh1<>(h52Var, ((uo2) this.f5872b).zzb());
    }
}