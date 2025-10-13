package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class se1 implements mo2<qe1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ViewGroup> f8857b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f8858c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Set<String>> f8859d;

    public se1(wo2<h52> wo2Var, wo2<ViewGroup> wo2Var2, wo2<Context> wo2Var3, wo2<Set<String>> wo2Var4) {
        this.a = wo2Var;
        this.f8857b = wo2Var2;
        this.f8858c = wo2Var3;
        this.f8859d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new qe1(this.a.zzb(), ((p40) this.f8857b).a(), this.f8858c.zzb(), ((uo2) this.f8859d).zzb());
    }
}