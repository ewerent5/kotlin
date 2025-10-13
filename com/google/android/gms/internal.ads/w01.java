package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w01 implements mo2<v01> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f9825b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<cm> f9826c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<q10> f9827d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<bm> f9828e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<HashMap<String, s01>> f9829f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<a11> f9830g;

    public w01(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<cm> wo2Var3, wo2<q10> wo2Var4, wo2<bm> wo2Var5, wo2<HashMap<String, s01>> wo2Var6, wo2<a11> wo2Var7) {
        this.a = wo2Var;
        this.f9825b = wo2Var2;
        this.f9826c = wo2Var3;
        this.f9827d = wo2Var4;
        this.f9828e = wo2Var5;
        this.f9829f = wo2Var6;
        this.f9830g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new v01(((hy) this.a).a(), this.f9825b.zzb(), new cm(), ((ny) this.f9827d).zzb(), ((yy) this.f9828e).zzb(), this.f9829f.zzb(), new a11(), null);
    }
}