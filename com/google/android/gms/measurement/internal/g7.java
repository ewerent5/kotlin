package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* loaded from: classes.dex */
final class g7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ uf f10895e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f10896f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ String f10897g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f10898h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10899i;

    g7(AppMeasurementDynamiteService appMeasurementDynamiteService, uf ufVar, String str, String str2, boolean z) {
        this.f10899i = appMeasurementDynamiteService;
        this.f10895e = ufVar;
        this.f10896f = str;
        this.f10897g = str2;
        this.f10898h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10899i.f10736e.K().D(this.f10895e, this.f10896f, this.f10897g, this.f10898h);
    }
}