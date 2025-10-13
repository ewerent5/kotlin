package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class e6 {
    final Context a;

    /* renamed from: b, reason: collision with root package name */
    String f10833b;

    /* renamed from: c, reason: collision with root package name */
    String f10834c;

    /* renamed from: d, reason: collision with root package name */
    String f10835d;

    /* renamed from: e, reason: collision with root package name */
    Boolean f10836e;

    /* renamed from: f, reason: collision with root package name */
    long f10837f;

    /* renamed from: g, reason: collision with root package name */
    e.c.b.b.c.e.f f10838g;

    /* renamed from: h, reason: collision with root package name */
    boolean f10839h;

    /* renamed from: i, reason: collision with root package name */
    Long f10840i;

    public e6(Context context, e.c.b.b.c.e.f fVar, Long l2) {
        this.f10839h = true;
        com.google.android.gms.common.internal.p.j(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.p.j(applicationContext);
        this.a = applicationContext;
        this.f10840i = l2;
        if (fVar != null) {
            this.f10838g = fVar;
            this.f10833b = fVar.f14502j;
            this.f10834c = fVar.f14501i;
            this.f10835d = fVar.f14500h;
            this.f10839h = fVar.f14499g;
            this.f10837f = fVar.f14498f;
            Bundle bundle = fVar.f14503k;
            if (bundle != null) {
                this.f10836e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}