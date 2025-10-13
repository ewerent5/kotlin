package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class oa3 extends sa3<x6> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f7929b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f7930c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f7931d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ra3 f7932e;

    oa3(ra3 ra3Var, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f7932e = ra3Var;
        this.f7929b = frameLayout;
        this.f7930c = frameLayout2;
        this.f7931d = context;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ x6 a() {
        ra3.l(this.f7931d, "native_ad_view_delegate");
        return new r2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ x6 b() {
        return this.f7932e.f8626d.c(this.f7931d, this.f7929b, this.f7930c);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ x6 c(h0 h0Var) {
        return h0Var.zze(e.c.b.b.b.d.m4(this.f7929b), e.c.b.b.b.d.m4(this.f7930c));
    }
}