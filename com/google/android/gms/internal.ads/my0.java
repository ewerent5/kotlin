package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class my0 implements mo2<String> {
    private final wo2<Context> a;

    public my0(wo2<Context> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((vq1) this.a).a().getPackageName();
        ro2.b(packageName);
        return packageName;
    }
}