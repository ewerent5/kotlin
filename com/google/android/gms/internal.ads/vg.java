package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class vg implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    private final zf a;

    /* renamed from: b, reason: collision with root package name */
    private UnifiedNativeAdMapper f9701b;

    /* renamed from: c, reason: collision with root package name */
    private NativeCustomTemplateAd f9702c;

    public vg(zf zfVar) {
        this.a = zfVar;
    }

    public final UnifiedNativeAdMapper a() {
        return this.f9701b;
    }

    public final NativeCustomTemplateAd b() {
        return this.f9702c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i2) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i2);
        er.zzd(sb.toString());
        try {
            this.a.W(i2);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f9701b;
        if (this.f9702c == null) {
            if (unifiedNativeAdMapper == null) {
                er.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                er.zzd("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        er.zzd("Adapter called onAdImpression.");
        try {
            this.a.zzk();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLeftApplication.");
        try {
            this.a.zzh();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLoaded.");
        try {
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdOpened.");
        try {
            this.a.zzi();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onVideoEnd.");
        try {
            this.a.zzn();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAppEvent.");
        try {
            this.a.S3(str, str2);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzb(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        String strValueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        er.zzd(strValueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(strValueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f9702c = nativeCustomTemplateAd;
        try {
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzc(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (!(nativeCustomTemplateAd instanceof l7)) {
            er.zzi("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.a.H3(((l7) nativeCustomTemplateAd).a(), str);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        er.zzd(sb.toString());
        try {
            this.a.v0(adError.zza());
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLeftApplication.");
        try {
            this.a.zzh();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLoaded.");
        try {
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdOpened.");
        try {
            this.a.zzi();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f9701b;
        if (this.f9702c == null) {
            if (unifiedNativeAdMapper == null) {
                er.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                er.zzd("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        er.zzd("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLeftApplication.");
        try {
            this.a.zzh();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLoaded.");
        this.f9701b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new jg());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
        }
        try {
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdOpened.");
        try {
            this.a.zzi();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i2) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        er.zzd(sb.toString());
        try {
            this.a.W(i2);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        er.zzd(sb.toString());
        try {
            this.a.v0(adError.zza());
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i2) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i2);
        sb.append(".");
        er.zzd(sb.toString());
        try {
            this.a.W(i2);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 97 + String.valueOf(domain).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(code);
        sb.append(". ErrorMessage: ");
        sb.append(message);
        sb.append(". ErrorDomain: ");
        sb.append(domain);
        er.zzd(sb.toString());
        try {
            this.a.v0(adError.zza());
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}