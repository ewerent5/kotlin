package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yb1 implements mo2<vb1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f10400b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f10401c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<ViewGroup> f10402d;

    public yb1(wo2<h52> wo2Var, wo2<Context> wo2Var2, wo2<qp1> wo2Var3, wo2<ViewGroup> wo2Var4) {
        this.a = wo2Var;
        this.f10400b = wo2Var2;
        this.f10401c = wo2Var3;
        this.f10402d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new vb1(this.a.zzb(), ((vq1) this.f10400b).a(), ((ga0) this.f10401c).a(), ((p40) this.f10402d).a());
    }
}