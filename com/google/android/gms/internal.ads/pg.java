package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class pg implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    final /* synthetic */ zf a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ tg f8153b;

    pg(tg tgVar, zf zfVar) {
        this.f8153b = tgVar;
        this.a = zfVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f8153b.f9129e.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 87 + String.valueOf(message).length() + String.valueOf(domain).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ErrorCode = ");
            sb.append(code);
            sb.append(". ErrorMessage = ");
            sb.append(message);
            sb.append(". ErrorDomain = ");
            sb.append(domain);
            er.zzd(sb.toString());
            this.a.v0(adError.zza());
            this.a.D4(adError.getCode(), adError.getMessage());
            this.a.W(adError.getCode());
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        try {
            this.f8153b.f9134j = mediationInterstitialAd;
            this.a.zzj();
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
        return new kg(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}