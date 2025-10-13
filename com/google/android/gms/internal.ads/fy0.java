package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fy0 implements mo2<ApplicationInfo> {
    private final wo2<Context> a;

    public fy0(wo2<Context> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = this.a.zzb().getApplicationInfo();
        ro2.b(applicationInfo);
        return applicationInfo;
    }
}