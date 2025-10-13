package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class nu0 {
    private final su0 a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7799b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f7800c;

    public nu0(su0 su0Var, Executor executor) {
        this.a = su0Var;
        this.f7800c = su0Var.c();
        this.f7799b = executor;
    }

    public final mu0 a() {
        mu0 mu0Var = new mu0(this);
        mu0.g(mu0Var);
        return mu0Var;
    }
}