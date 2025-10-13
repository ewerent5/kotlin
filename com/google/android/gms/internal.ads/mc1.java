package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mc1 implements mo2<lc1> {
    private final wo2<Set<String>> a;

    public mc1(wo2<Set<String>> wo2Var) {
        this.a = wo2Var;
    }

    public static lc1 a(Set<String> set) {
        return new lc1(set);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new lc1(this.a.zzb());
    }
}