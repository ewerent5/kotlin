package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vo2<T> implements wo2<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile wo2<T> f9749b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f9750c = a;

    private vo2(wo2<T> wo2Var) {
        this.f9749b = wo2Var;
    }

    public static <P extends wo2<T>, T> wo2<T> a(P p) {
        if ((p instanceof vo2) || (p instanceof lo2)) {
            return p;
        }
        Objects.requireNonNull(p);
        return new vo2(p);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final T zzb() {
        T t = (T) this.f9750c;
        if (t != a) {
            return t;
        }
        wo2<T> wo2Var = this.f9749b;
        if (wo2Var == null) {
            return (T) this.f9750c;
        }
        T tZzb = wo2Var.zzb();
        this.f9750c = tZzb;
        this.f9749b = null;
        return tZzb;
    }
}