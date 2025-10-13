package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class g01 implements Callable {
    private final g52 a;

    /* renamed from: b */
    private final g52 f5997b;

    /* renamed from: c */
    private final g52 f5998c;

    g01(g52 g52Var, g52 g52Var2, g52 g52Var3) {
        this.a = g52Var;
        this.f5997b = g52Var2;
        this.f5998c = g52Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new u01((y01) this.a.get(), (JSONObject) this.f5997b.get(), (tl) this.f5998c.get());
    }
}