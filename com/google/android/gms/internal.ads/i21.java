package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i21 implements mo2<h21> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<v90> f6459b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<a21> f6460c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<w11> f6461d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<zzg> f6462e;

    public i21(wo2<Context> wo2Var, wo2<v90> wo2Var2, wo2<a21> wo2Var3, wo2<w11> wo2Var4, wo2<zzg> wo2Var5) {
        this.a = wo2Var;
        this.f6459b = wo2Var2;
        this.f6460c = wo2Var3;
        this.f6461d = wo2Var4;
        this.f6462e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h21 zzb() {
        return new h21(((vq1) this.a).a(), ((w90) this.f6459b).zzb(), this.f6460c.zzb(), ((x11) this.f6461d).zzb(), ((uq1) this.f6462e).zzb());
    }
}