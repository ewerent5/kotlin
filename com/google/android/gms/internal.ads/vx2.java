package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vx2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ IOException f9813e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zx2 f9814f;

    vx2(zx2 zx2Var, IOException iOException) {
        this.f9814f = zx2Var;
        this.f9813e = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9814f.f10657i.a(this.f9813e);
    }
}