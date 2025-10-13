package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q80 implements mo2<zzb> {
    private final p80 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f8342b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ho> f8343c;

    public q80(p80 p80Var, wo2<Context> wo2Var, wo2<ho> wo2Var2) {
        this.a = p80Var;
        this.f8342b = wo2Var;
        this.f8343c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzb(this.f8342b.zzb(), this.f8343c.zzb(), null);
    }
}