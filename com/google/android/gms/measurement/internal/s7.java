package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class s7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f11207e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ q7 f11208f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ q7 f11209g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ long f11210h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ p7 f11211i;

    s7(p7 p7Var, Bundle bundle, q7 q7Var, q7 q7Var2, long j2) {
        this.f11211i = p7Var;
        this.f11207e = bundle;
        this.f11208f = q7Var;
        this.f11209g = q7Var2;
        this.f11210h = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f11211i.F(this.f11207e, this.f11208f, this.f11209g, this.f11210h);
    }
}