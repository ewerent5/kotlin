package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* loaded from: classes.dex */
final class g6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ uf f10893e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10894f;

    g6(AppMeasurementDynamiteService appMeasurementDynamiteService, uf ufVar) {
        this.f10894f = appMeasurementDynamiteService;
        this.f10893e = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10894f.f10736e.K().A(this.f10893e);
    }
}