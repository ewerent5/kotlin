package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class u6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f11275e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11276f = null;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f11277g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f11278h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ i6 f11279i;

    u6(i6 i6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f11279i = i6Var;
        this.f11275e = atomicReference;
        this.f11277g = str2;
        this.f11278h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11279i.a.K().N(this.f11275e, null, this.f11277g, this.f11278h);
    }
}