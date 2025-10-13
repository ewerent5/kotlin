package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* loaded from: classes.dex */
final class g8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ uf f10900e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ r f10901f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f10902g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10903h;

    g8(AppMeasurementDynamiteService appMeasurementDynamiteService, uf ufVar, r rVar, String str) {
        this.f10903h = appMeasurementDynamiteService;
        this.f10900e = ufVar;
        this.f10901f = rVar;
        this.f10902g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10903h.f10736e.K().B(this.f10900e, this.f10901f, this.f10902g);
    }
}