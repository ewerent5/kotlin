package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class n5 implements Callable<List<wa>> {
    private final /* synthetic */ String a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f11055b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f11056c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ e5 f11057d;

    n5(e5 e5Var, String str, String str2, String str3) {
        this.f11057d = e5Var;
        this.a = str;
        this.f11055b = str2;
        this.f11056c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<wa> call() {
        this.f11057d.f10830e.f0();
        return this.f11057d.f10830e.V().i0(this.a, this.f11055b, this.f11056c);
    }
}