package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z91 implements mo2<y91> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<j> f10573b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f10574c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<r40> f10575d;

    public z91(wo2<Context> wo2Var, wo2<j> wo2Var2, wo2<qp1> wo2Var3, wo2<r40> wo2Var4) {
        this.a = wo2Var;
        this.f10573b = wo2Var2;
        this.f10574c = wo2Var3;
        this.f10575d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new y91(this.a.zzb(), ((ck0) this.f10573b).a(), ((ga0) this.f10574c).a(), ((d50) this.f10575d).a());
    }
}