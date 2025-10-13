package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class lw0 implements Runnable {

    /* renamed from: e */
    private final qw0 f7344e;

    /* renamed from: f */
    private final hq1 f7345f;

    /* renamed from: g */
    private final bc f7346g;

    /* renamed from: h */
    private final List f7347h;

    /* renamed from: i */
    private final String f7348i;

    lw0(qw0 qw0Var, hq1 hq1Var, bc bcVar, List list, String str) {
        this.f7344e = qw0Var;
        this.f7345f = hq1Var;
        this.f7346g = bcVar;
        this.f7347h = list;
        this.f7348i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7344e.f(this.f7345f, this.f7346g, this.f7347h, this.f7348i);
    }
}