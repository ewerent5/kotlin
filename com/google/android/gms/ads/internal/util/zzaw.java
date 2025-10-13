package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzaw {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    /* synthetic */ zzaw(zzav zzavVar, zzat zzatVar) {
        int size = zzavVar.zzb.size();
        this.zza = (String[]) zzavVar.zza.toArray(new String[size]);
        this.zzb = zzc(zzavVar.zzb);
        this.zzc = zzc(zzavVar.zzc);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = list.get(i2).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d2) {
        this.zze++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i2 >= dArr.length) {
                return;
            }
            double d3 = dArr[i2];
            if (d3 <= d2 && d2 < this.zzb[i2]) {
                int[] iArr = this.zzd;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d2 < d3) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final List<zzau> zzb() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i2 = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double d2 = this.zzc[i2];
            double d3 = this.zzb[i2];
            int i3 = this.zzd[i2];
            arrayList.add(new zzau(str, d2, d3, i3 / this.zze, i3));
            i2++;
        }
    }
}