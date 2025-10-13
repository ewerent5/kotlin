package com.google.android.gms.ads.internal.util;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.o;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzau {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzau(String str, double d2, double d3, double d4, int i2) {
        this.zza = str;
        this.zzc = d2;
        this.zzb = d3;
        this.zzd = d4;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzau)) {
            return false;
        }
        zzau zzauVar = (zzau) obj;
        return o.a(this.zza, zzauVar.zza) && this.zzb == zzauVar.zzb && this.zzc == zzauVar.zzc && this.zze == zzauVar.zze && Double.compare(this.zzd, zzauVar.zzd) == 0;
    }

    public final int hashCode() {
        return o.b(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return o.c(this).a(Action.NAME_ATTRIBUTE, this.zza).a("minBound", Double.valueOf(this.zzc)).a("maxBound", Double.valueOf(this.zzb)).a("percent", Double.valueOf(this.zzd)).a("count", Integer.valueOf(this.zze)).toString();
    }
}