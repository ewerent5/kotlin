package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class r7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ q7 f11180e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ q7 f11181f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ long f11182g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ boolean f11183h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ p7 f11184i;

    r7(p7 p7Var, q7 q7Var, q7 q7Var2, long j2, boolean z) {
        this.f11184i = p7Var;
        this.f11180e = q7Var;
        this.f11181f = q7Var2;
        this.f11182g = j2;
        this.f11183h = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f11184i.K(this.f11180e, this.f11181f, this.f11182g, this.f11183h, null);
    }
}