package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zb0;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r81<AdT, AdapterT, ListenerT extends zb0> implements mo2<q81<AdT, AdapterT, ListenerT>> {
    private final wo2<st1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h52> f8611b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<l31<AdapterT, ListenerT>> f8612c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<s31<AdT, AdapterT, ListenerT>> f8613d;

    public r81(wo2<st1> wo2Var, wo2<h52> wo2Var2, wo2<l31<AdapterT, ListenerT>> wo2Var3, wo2<s31<AdT, AdapterT, ListenerT>> wo2Var4) {
        this.a = wo2Var;
        this.f8611b = wo2Var2;
        this.f8612c = wo2Var3;
        this.f8613d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final q81<AdT, AdapterT, ListenerT> zzb() {
        return new q81<>(this.a.zzb(), this.f8611b.zzb(), this.f8612c.zzb(), this.f8613d.zzb());
    }
}