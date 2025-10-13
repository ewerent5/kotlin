package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gc0 implements mo2<fc0> {
    private final wo2<Set<nh0<hc0>>> a;

    public gc0(wo2<Set<nh0<hc0>>> wo2Var) {
        this.a = wo2Var;
    }

    public static fc0 b(Set<nh0<hc0>> set) {
        return new fc0(set);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fc0 zzb() {
        return new fc0(((uo2) this.a).zzb());
    }
}