package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class y50 implements Runnable {

    /* renamed from: e */
    private final AtomicReference f10379e;

    y50(AtomicReference atomicReference) {
        this.f10379e = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) this.f10379e.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }
}