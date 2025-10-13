package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kz0 implements mo2<iz0> {
    private final wo2<Context> a;

    public kz0(wo2<Context> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iz0 zzb() {
        return new iz0(((hy) this.a).a());
    }
}