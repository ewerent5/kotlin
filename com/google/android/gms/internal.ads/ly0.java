package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ly0 implements mo2<PackageInfo> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ApplicationInfo> f7356b;

    public ly0(wo2<Context> wo2Var, wo2<ApplicationInfo> wo2Var2) {
        this.a = wo2Var;
        this.f7356b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return com.google.android.gms.common.p.c.a(this.a.zzb()).f(((fy0) this.f7356b).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}