package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class i42 extends k42 {

    /* renamed from: j, reason: collision with root package name */
    private final Callable f6478j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ l42 f6479k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i42(l42 l42Var, Callable callable, Executor executor) {
        super(l42Var, executor);
        this.f6479k = l42Var;
        Objects.requireNonNull(callable);
        this.f6478j = callable;
    }

    @Override // com.google.android.gms.internal.ads.f52
    final Object a() {
        return this.f6478j.call();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final String b() {
        return this.f6478j.toString();
    }

    @Override // com.google.android.gms.internal.ads.k42
    final void f(Object obj) {
        this.f6479k.l(obj);
    }
}