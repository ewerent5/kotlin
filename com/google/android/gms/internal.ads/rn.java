package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class rn implements MediationRewardedAdCallback {
    private final zf a;

    public rn(zf zfVar) {
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onUserEarnedReward.");
        try {
            this.a.A4(new sn(rewardItem));
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onVideoComplete.");
        try {
            this.a.zzt();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        com.google.android.gms.common.internal.p.e("#008 Must be called on the main UI thread.");
        er.zzd("Adapter called onVideoStart.");
        try {
            this.a.a();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
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