package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class q6 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f11142e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11143f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f11144g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Bundle f11145h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ boolean f11146i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ boolean f11147j;

    /* renamed from: k, reason: collision with root package name */
    private final /* synthetic */ boolean f11148k;

    /* renamed from: l, reason: collision with root package name */
    private final /* synthetic */ String f11149l;

    /* renamed from: m, reason: collision with root package name */
    private final /* synthetic */ i6 f11150m;

    q6(i6 i6Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f11150m = i6Var;
        this.f11142e = str;
        this.f11143f = str2;
        this.f11144g = j2;
        this.f11145h = bundle;
        this.f11146i = z;
        this.f11147j = z2;
        this.f11148k = z3;
        this.f11149l = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f11150m.P(this.f11142e, this.f11143f, this.f11144g, this.f11145h, this.f11146i, this.f11147j, this.f11148k, this.f11149l);
    }
}