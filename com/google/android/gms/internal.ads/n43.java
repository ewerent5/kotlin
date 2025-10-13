package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class n43 implements Runnable {

    /* renamed from: e */
    private final wr f7653e;

    /* renamed from: f */
    private final Future f7654f;

    n43(wr wrVar, Future future) {
        this.f7653e = wrVar;
        this.f7654f = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wr wrVar = this.f7653e;
        Future future = this.f7654f;
        if (wrVar.isCancelled()) {
            future.cancel(true);
        }
    }
}