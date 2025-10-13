package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class su0 extends uu0 {

    /* renamed from: g, reason: collision with root package name */
    private final ku1 f8986g;

    public su0(Executor executor, jr jrVar, ku1 ku1Var, mu1 mu1Var) {
        super(executor, jrVar, mu1Var);
        this.f8986g = ku1Var;
        ku1Var.a(this.f9562b);
    }

    public final Map<String, String> c() {
        return new HashMap(this.f9562b);
    }
}