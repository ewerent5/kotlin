package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbe;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fo0 implements mo2<eo0> {
    private final wo2<zzbe> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f5909b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f5910c;

    public fo0(wo2<zzbe> wo2Var, wo2<com.google.android.gms.common.util.f> wo2Var2, wo2<Executor> wo2Var3) {
        this.a = wo2Var;
        this.f5909b = wo2Var2;
        this.f5910c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbe zzbeVarZzb = this.a.zzb();
        com.google.android.gms.common.util.f fVarZzb = this.f5909b.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new eo0(zzbeVarZzb, fVarZzb, h52Var);
    }
}