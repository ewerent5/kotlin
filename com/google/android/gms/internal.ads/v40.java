package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class v40 implements mo2<u40> {
    private final wo2<r60> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f9642b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<yo1> f9643c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<View> f9644d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<ew> f9645e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<q60> f9646f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<fm0> f9647g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<th0> f9648h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<y91> f9649i;

    /* renamed from: j, reason: collision with root package name */
    private final wo2<Executor> f9650j;

    public v40(wo2<r60> wo2Var, wo2<Context> wo2Var2, wo2<yo1> wo2Var3, wo2<View> wo2Var4, wo2<ew> wo2Var5, wo2<q60> wo2Var6, wo2<fm0> wo2Var7, wo2<th0> wo2Var8, wo2<y91> wo2Var9, wo2<Executor> wo2Var10) {
        this.a = wo2Var;
        this.f9642b = wo2Var2;
        this.f9643c = wo2Var3;
        this.f9644d = wo2Var4;
        this.f9645e = wo2Var5;
        this.f9646f = wo2Var6;
        this.f9647g = wo2Var7;
        this.f9648h = wo2Var8;
        this.f9649i = wo2Var9;
        this.f9650j = wo2Var10;
    }

    public static u40 b(r60 r60Var, Context context, yo1 yo1Var, View view, ew ewVar, q60 q60Var, fm0 fm0Var, th0 th0Var, go2<y91> go2Var, Executor executor) {
        return new u40(r60Var, context, yo1Var, view, ewVar, q60Var, fm0Var, th0Var, go2Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u40 zzb() {
        return new u40(((o80) this.a).zzb(), this.f9642b.zzb(), ((b50) this.f9643c).a(), ((a50) this.f9644d).a(), ((n50) this.f9645e).a(), ((c50) this.f9646f).a(), ((ek0) this.f9647g).a(), this.f9648h.zzb(), lo2.b(this.f9649i), this.f9650j.zzb());
    }
}