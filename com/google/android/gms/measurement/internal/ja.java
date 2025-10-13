package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* loaded from: classes.dex */
final class ja implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ uf f10973e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10974f;

    ja(AppMeasurementDynamiteService appMeasurementDynamiteService, uf ufVar) {
        this.f10974f = appMeasurementDynamiteService;
        this.f10973e = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10974f.f10736e.B().O(this.f10973e, this.f10974f.f10736e.O());
    }
}