package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ji1 implements Callable {
    private final ki1 a;

    ji1(ki1 ki1Var) {
        this.a = ki1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new li1(new JSONObject());
    }
}