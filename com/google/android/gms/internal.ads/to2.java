package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class to2<T> {
    private final List<wo2<T>> a;

    /* renamed from: b, reason: collision with root package name */
    private final List<wo2<Collection<T>>> f9231b;

    /* synthetic */ to2(int i2, int i3, so2 so2Var) {
        this.a = jo2.a(i2);
        this.f9231b = jo2.a(i3);
    }

    public final to2<T> a(wo2<? extends T> wo2Var) {
        this.a.add(wo2Var);
        return this;
    }

    public final to2<T> b(wo2<? extends Collection<? extends T>> wo2Var) {
        this.f9231b.add(wo2Var);
        return this;
    }

    public final uo2<T> c() {
        return new uo2<>(this.a, this.f9231b, null);
    }
}