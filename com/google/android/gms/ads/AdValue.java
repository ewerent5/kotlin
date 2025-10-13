package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdValue {
    private final int zza;
    private final String zzb;
    private final long zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i2, String str, long j2) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = j2;
    }

    @RecentlyNonNull
    public static AdValue zza(int i2, @RecentlyNonNull String str, long j2) {
        return new AdValue(i2, str, j2);
    }

    @RecentlyNonNull
    public String getCurrencyCode() {
        return this.zzb;
    }

    public int getPrecisionType() {
        return this.zza;
    }

    public long getValueMicros() {
        return this.zzc;
    }
}