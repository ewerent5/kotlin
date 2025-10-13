package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class v52 extends f52 {

    /* renamed from: h, reason: collision with root package name */
    private final Callable f9658h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ w52 f9659i;

    v52(w52 w52Var, Callable callable) {
        this.f9659i = w52Var;
        Objects.requireNonNull(callable);
        this.f9658h = callable;
    }

    @Override // com.google.android.gms.internal.ads.f52
    final Object a() {
        return this.f9658h.call();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final String b() {
        return this.f9658h.toString();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final boolean c() {
        return this.f9659i.isDone();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final void d(Object obj, Throwable th) {
        if (th == null) {
            this.f9659i.l(obj);
        } else {
            this.f9659i.m(th);
        }
    }
}