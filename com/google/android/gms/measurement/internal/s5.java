package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class s5 implements Callable<List<ea>> {
    private final /* synthetic */ ka a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ e5 f11204b;

    s5(e5 e5Var, ka kaVar) {
        this.f11204b = e5Var;
        this.a = kaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ea> call() {
        this.f11204b.f10830e.f0();
        return this.f11204b.f10830e.V().G(this.a.f10989e);
    }
}