package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jo implements mo2<io> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<zzg> f6796b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<kp> f6797c;

    public jo(wo2<Context> wo2Var, wo2<zzg> wo2Var2, wo2<kp> wo2Var3) {
        this.a = wo2Var;
        this.f6796b = wo2Var2;
        this.f6797c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new io(this.a.zzb(), this.f6796b.zzb(), this.f6797c.zzb());
    }
}