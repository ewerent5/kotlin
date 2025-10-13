package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class u8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ComponentName f11281e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ s8 f11282f;

    u8(s8 s8Var, ComponentName componentName) {
        this.f11282f = s8Var;
        this.f11281e = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11282f.f11213c.y(this.f11281e);
    }
}