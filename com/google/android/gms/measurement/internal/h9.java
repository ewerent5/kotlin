package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* loaded from: classes.dex */
final class h9 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ uf f10918e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f10919f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f10920g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10921h;

    h9(AppMeasurementDynamiteService appMeasurementDynamiteService, uf ufVar, String str, String str2) {
        this.f10921h = appMeasurementDynamiteService;
        this.f10918e = ufVar;
        this.f10919f = str;
        this.f10920g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10921h.f10736e.K().C(this.f10918e, this.f10919f, this.f10920g);
    }
}