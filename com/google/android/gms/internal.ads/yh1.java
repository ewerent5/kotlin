package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class yh1 implements Callable {
    private final zh1 a;

    yh1(zh1 zh1Var) {
        this.a = zh1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ai1(new JSONObject());
    }
}