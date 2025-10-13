package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class kg implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback {
    private final zf a;

    public kg(zf zfVar) {
        this.a = zfVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdFailedToShow.");
        int code = adError.getCode();
        String message = adError.getMessage();
        String domain = adError.getDomain();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 87 + String.valueOf(domain).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(code);
        sb.append(". Error Message = ");
        sb.append(message);
        sb.append(" Error Domain = ");
        sb.append(domain);
        er.zzi(sb.toString());
        try {
            this.a.Y1(adError.zza());
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdLeftApplication.");
        try {
            this.a.zzh();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdOpened.");
        try {
            this.a.zzi();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onVideoComplete.");
        try {
            this.a.zzt();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onVideoPause.");
        try {
            this.a.zzq();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onVideoPlay.");
        try {
            this.a.zzu();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called reportAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called reportAdImpression.");
        try {
            this.a.zzk();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onAdFailedToShow.");
        String strValueOf = String.valueOf(str);
        er.zzi(strValueOf.length() != 0 ? "Mediation ad failed to show: ".concat(strValueOf) : new String("Mediation ad failed to show: "));
        try {
            this.a.o1(str);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}