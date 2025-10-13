package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* loaded from: classes.dex */
final class ia implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f10957e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10958f;

    ia(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f10958f = appMeasurementDynamiteService;
        this.f10957e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10958f.f10736e.A().F(this.f10957e);
    }
}