package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzav {
    private final List<String> zza = new ArrayList();
    private final List<Double> zzb = new ArrayList();
    private final List<Double> zzc = new ArrayList();

    public final zzav zza(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.zza.size()) {
            double dDoubleValue = this.zzc.get(i2).doubleValue();
            double dDoubleValue2 = this.zzb.get(i2).doubleValue();
            if (d2 < dDoubleValue || (dDoubleValue == d2 && d3 < dDoubleValue2)) {
                break;
            }
            i2++;
        }
        this.zza.add(i2, str);
        this.zzc.add(i2, Double.valueOf(d2));
        this.zzb.add(i2, Double.valueOf(d3));
        return this;
    }

    public final zzaw zzb() {
        return new zzaw(this, null);
    }
}