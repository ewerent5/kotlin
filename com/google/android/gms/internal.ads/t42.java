package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class t42<V> extends r42<V> implements g52<V> {
    protected t42() {
    }

    protected abstract g52<? extends V> d();

    @Override // com.google.android.gms.internal.ads.g52
    public final void zze(Runnable runnable, Executor executor) {
        d().zze(runnable, executor);
    }
}