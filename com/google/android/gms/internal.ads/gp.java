package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class gp implements Callable {
    private final kp a;

    /* renamed from: b */
    private final Context f6153b;

    gp(kp kpVar, Context context) {
        this.a = kpVar;
        this.f6153b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.y(this.f6153b);
    }
}