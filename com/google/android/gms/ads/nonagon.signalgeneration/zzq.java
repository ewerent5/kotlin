package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.cy;
import com.google.android.gms.internal.ads.h52;
import com.google.android.gms.internal.ads.hy;
import com.google.android.gms.internal.ads.ip2;
import com.google.android.gms.internal.ads.iq1;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.mo2;
import com.google.android.gms.internal.ads.pq0;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.qy;
import com.google.android.gms.internal.ads.ro2;
import com.google.android.gms.internal.ads.wo2;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzq implements mo2<zzp> {
    private final wo2<cy> zza;
    private final wo2<Context> zzb;
    private final wo2<ip2> zzc;
    private final wo2<kr> zzd;
    private final wo2<iq1<pq0>> zze;
    private final wo2<h52> zzf;
    private final wo2<ScheduledExecutorService> zzg;

    public zzq(wo2<cy> wo2Var, wo2<Context> wo2Var2, wo2<ip2> wo2Var3, wo2<kr> wo2Var4, wo2<iq1<pq0>> wo2Var5, wo2<h52> wo2Var6, wo2<ScheduledExecutorService> wo2Var7) {
        this.zza = wo2Var;
        this.zzb = wo2Var2;
        this.zzc = wo2Var3;
        this.zzd = wo2Var4;
        this.zze = wo2Var5;
        this.zzf = wo2Var6;
        this.zzg = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        cy cyVarZzb = this.zza.zzb();
        Context contextA = ((hy) this.zzb).a();
        ip2 ip2VarZzb = this.zzc.zzb();
        kr krVarA = ((qy) this.zzd).a();
        iq1<pq0> iq1VarZzb = this.zze.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new zzp(cyVarZzb, contextA, ip2VarZzb, krVarA, iq1VarZzb, h52Var, this.zzg.zzb());
    }
}