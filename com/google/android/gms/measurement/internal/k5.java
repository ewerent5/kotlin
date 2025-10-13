package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class k5 implements Callable<List<wa>> {
    private final /* synthetic */ ka a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10979b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10980c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ e5 f10981d;

    k5(e5 e5Var, ka kaVar, String str, String str2) {
        this.f10981d = e5Var;
        this.a = kaVar;
        this.f10979b = str;
        this.f10980c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<wa> call() {
        this.f10981d.f10830e.f0();
        return this.f10981d.f10830e.V().i0(this.a.f10989e, this.f10979b, this.f10980c);
    }
}