package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class q5 implements Callable<byte[]> {
    private final /* synthetic */ r a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f11140b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ e5 f11141c;

    q5(e5 e5Var, r rVar, String str) {
        this.f11141c = e5Var;
        this.a = rVar;
        this.f11140b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        this.f11141c.f10830e.f0();
        return this.f11141c.f10830e.Y().s(this.a, this.f11140b);
    }
}