package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ix1 implements Callable {
    private final Context a;

    ix1(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new vz1(this.a, "GLAS", null);
    }
}