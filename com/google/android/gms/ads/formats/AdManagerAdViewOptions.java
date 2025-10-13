package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.internal.ads.b3;
import com.google.android.gms.internal.ads.g8;
import com.google.android.gms.internal.ads.h8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdManagerAdViewOptions extends a {

    @RecentlyNonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    private final boolean zza;
    private final IBinder zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class Builder {
        private boolean zza = false;
        private ShouldDelayBannerRenderingListener zzb;

        @RecentlyNonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this, (zzb) null);
        }

        @RecentlyNonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.zza = z;
            return this;
        }

        @RecentlyNonNull
        public Builder setShouldDelayBannerRenderingListener(@RecentlyNonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzb = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    /* synthetic */ AdManagerAdViewOptions(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb != null ? new b3(builder.zzb) : null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.c(parcel, 1, getManualImpressionsEnabled());
        c.l(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public final h8 zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return g8.I4(iBinder);
    }

    AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }
}