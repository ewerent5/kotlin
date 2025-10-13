package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.lt1;
import com.google.android.gms.internal.ads.mo2;
import com.google.android.gms.internal.ads.st1;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.w90;
import com.google.android.gms.internal.ads.wo2;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzx implements mo2<g52<zzab>> {
    private final wo2<st1> zza;
    private final wo2<zzz> zzb;
    private final wo2<v90> zzc;

    public zzx(wo2<st1> wo2Var, wo2<zzz> wo2Var2, wo2<v90> wo2Var3) {
        this.zza = wo2Var;
        this.zzb = wo2Var2;
        this.zzc = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzb().a(lt1.GENERATE_SIGNALS, ((w90) this.zzc).zzb().b()).c(((zzaa) this.zzb).zzb()).h(((Integer) c.c().b(w3.H3)).intValue(), TimeUnit.SECONDS).i();
    }
}