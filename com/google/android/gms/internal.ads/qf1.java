package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qf1 implements mo2<of1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f8369b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Set<String>> f8370c;

    public qf1(wo2<h52> wo2Var, wo2<Context> wo2Var2, wo2<Set<String>> wo2Var3) {
        this.a = wo2Var;
        this.f8369b = wo2Var2;
        this.f8370c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new of1(this.a.zzb(), ((vq1) this.f8369b).a(), this.f8370c.zzb());
    }
}