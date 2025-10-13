package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class i5 implements Callable<List<ea>> {
    private final /* synthetic */ ka a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f10934b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f10935c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ e5 f10936d;

    i5(e5 e5Var, ka kaVar, String str, String str2) {
        this.f10936d = e5Var;
        this.a = kaVar;
        this.f10934b = str;
        this.f10935c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<ea> call() {
        this.f10936d.f10830e.f0();
        return this.f10936d.f10830e.V().I(this.a.f10989e, this.f10934b, this.f10935c);
    }
}