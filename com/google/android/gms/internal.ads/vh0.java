package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vh0 {
    private final List<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f9703b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9704c;

    public vh0(xo1 xo1Var, vu1 vu1Var) {
        this.a = xo1Var.o;
        this.f9703b = vu1Var;
    }

    public final void a() {
        if (this.f9704c) {
            return;
        }
        this.f9703b.a(this.a);
        this.f9704c = true;
    }
}