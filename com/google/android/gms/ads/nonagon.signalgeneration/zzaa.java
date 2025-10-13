package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.h52;
import com.google.android.gms.internal.ads.mo2;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.ro2;
import com.google.android.gms.internal.ads.sy0;
import com.google.android.gms.internal.ads.ty0;
import com.google.android.gms.internal.ads.wo2;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzaa implements mo2<zzz> {
    private final wo2<Executor> zza;
    private final wo2<sy0> zzb;

    public zzaa(wo2<Executor> wo2Var, wo2<sy0> wo2Var2) {
        this.zza = wo2Var;
        this.zzb = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzz zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new zzz(h52Var, ((ty0) this.zzb).zzb());
    }
}