package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.g8;
import com.google.android.gms.internal.ads.h8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class PublisherAdViewOptions extends a {

    @RecentlyNonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    private final boolean zza;
    private final e0 zzb;
    private final IBinder zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Deprecated
    public static final class Builder {
        private ShouldDelayBannerRenderingListener zza;

        @RecentlyNonNull
        public Builder setShouldDelayBannerRenderingListener(@RecentlyNonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zza = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? d0.I4(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.c(parcel, 1, this.zza);
        e0 e0Var = this.zzb;
        c.l(parcel, 2, e0Var == null ? null : e0Var.asBinder(), false);
        c.l(parcel, 3, this.zzc, false);
        c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final e0 zzb() {
        return this.zzb;
    }

    public final h8 zzc() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return g8.I4(iBinder);
    }
}