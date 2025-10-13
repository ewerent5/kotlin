package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.d3;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g6;
import com.google.android.gms.internal.ads.gj;
import com.google.android.gms.internal.ads.i93;
import com.google.android.gms.internal.ads.m2;
import com.google.android.gms.internal.ads.p;
import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.q93;
import com.google.android.gms.internal.ads.r93;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.u1;
import com.google.android.gms.internal.ads.v8;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.y8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class AdLoader {
    private final q93 zza;
    private final Context zzb;
    private final p zzc;

    AdLoader(Context context, p pVar, q93 q93Var) {
        this.zzb = context;
        this.zzc = pVar;
        this.zza = q93Var;
    }

    private final void zza(u1 u1Var) {
        try {
            this.zzc.zze(this.zza.a(this.zzb, u1Var));
        } catch (RemoteException e2) {
            er.zzg("Failed to load ad.", e2);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzg();
        } catch (RemoteException e2) {
            er.zzj("Failed to check if ad is loading.", e2);
            return false;
        }
    }

    public void loadAd(@RecentlyNonNull AdRequest adRequest) {
        zza(adRequest.zza());
    }

    public void loadAds(@RecentlyNonNull AdRequest adRequest, int i2) {
        try {
            this.zzc.Q2(this.zza.a(this.zzb, adRequest.zza()), i2);
        } catch (RemoteException e2) {
            er.zzg("Failed to load ads.", e2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static class Builder {
        private final Context zza;
        private final s zzb;

        public Builder(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
            Context context2 = (Context) com.google.android.gms.common.internal.p.k(context, "context cannot be null");
            s sVarC = ta3.b().c(context, str, new pf());
            this.zza = context2;
            this.zzb = sVarC;
        }

        @RecentlyNonNull
        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), q93.a);
            } catch (RemoteException e2) {
                er.zzg("Failed to build AdLoader.", e2);
                return new AdLoader(this.zza, new m2().I4(), q93.a);
            }
        }

        @RecentlyNonNull
        public Builder forAdManagerAdView(@RecentlyNonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @RecentlyNonNull AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.p1(new x8(onAdManagerAdViewLoadedListener), new r93(this.zza, adSizeArr));
            } catch (RemoteException e2) {
                er.zzj("Failed to add Google Ad Manager banner ad listener", e2);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder forCustomFormatAd(@RecentlyNonNull String str, @RecentlyNonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @RecentlyNonNull NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            ej ejVar = new ej(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.G4(str, ejVar.a(), ejVar.b());
            } catch (RemoteException e2) {
                er.zzj("Failed to add custom format ad listener", e2);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder forCustomTemplateAd(@RecentlyNonNull String str, @RecentlyNonNull NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @RecentlyNonNull NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            v8 v8Var = new v8(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.G4(str, v8Var.a(), v8Var.b());
            } catch (RemoteException e2) {
                er.zzj("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder forNativeAd(@RecentlyNonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.B3(new gj(onNativeAdLoadedListener));
            } catch (RemoteException e2) {
                er.zzj("Failed to add google native ad listener", e2);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder forUnifiedNativeAd(@RecentlyNonNull UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.B3(new y8(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e2) {
                er.zzj("Failed to add google native ad listener", e2);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder withAdListener(@RecentlyNonNull AdListener adListener) {
            try {
                this.zzb.b0(new i93(adListener));
            } catch (RemoteException e2) {
                er.zzj("Failed to set AdListener.", e2);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder withAdManagerAdViewOptions(@RecentlyNonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.x1(adManagerAdViewOptions);
            } catch (RemoteException e2) {
                er.zzj("Failed to specify Ad Manager banner ad options", e2);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder withNativeAdOptions(@RecentlyNonNull NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.V3(new g6(nativeAdOptions));
            } catch (RemoteException e2) {
                er.zzj("Failed to specify native ad options", e2);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder withNativeAdOptions(@RecentlyNonNull com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.V3(new g6(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new d3(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e2) {
                er.zzj("Failed to specify native ad options", e2);
            }
            return this;
        }
    }

    public void loadAd(@RecentlyNonNull AdManagerAdRequest adManagerAdRequest) {
        zza(adManagerAdRequest.zza);
    }
}