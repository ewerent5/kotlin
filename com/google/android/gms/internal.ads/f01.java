package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class f01 implements Callable {
    private final g52 a;

    /* renamed from: b */
    private final g52 f5763b;

    f01(g52 g52Var, g52 g52Var2) {
        this.a = g52Var;
        this.f5763b = g52Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new b11((JSONObject) this.a.get(), (tl) this.f5763b.get());
    }
}