package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.d3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        @RecentlyNonNull
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @RecentlyNonNull
        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(d3 d3Var) {
        this.zza = d3Var.f5419e;
        this.zzb = d3Var.f5420f;
        this.zzc = d3Var.f5421g;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}