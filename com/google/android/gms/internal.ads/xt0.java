package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xt0 implements mo2<wt0> {
    private final wo2<w43> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Map<lt1, vt0>> f10255b;

    public xt0(wo2<w43> wo2Var, wo2<Map<lt1, vt0>> wo2Var2) {
        this.a = wo2Var;
        this.f10255b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wt0 zzb() {
        return new wt0(this.a.zzb(), ((qo2) this.f10255b).zzb());
    }
}