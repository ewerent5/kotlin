package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rc1 {
    private final AtomicBoolean a = new AtomicBoolean(false);

    public final void a(boolean z) {
        this.a.set(true);
    }

    public final boolean b() {
        return this.a.get();
    }
}