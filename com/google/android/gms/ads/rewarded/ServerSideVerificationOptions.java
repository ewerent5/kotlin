package com.google.android.gms.ads.rewarded;

import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        @RecentlyNonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        @RecentlyNonNull
        public Builder setCustomData(@RecentlyNonNull String str) {
            this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setUserId(@RecentlyNonNull String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    @RecentlyNonNull
    public String getCustomData() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getUserId() {
        return this.zza;
    }
}