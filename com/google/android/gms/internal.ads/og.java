package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class og implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {
    final /* synthetic */ zf a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ tg f7943b;

    og(tg tgVar, zf zfVar) {
        this.f7943b = tgVar;
        this.a = zfVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.f7943b.f9129e.getClass().getCanonicalName();
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
    public final /* bridge */ /* synthetic */ MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        MediationBannerAd mediationBannerAd2 = mediationBannerAd;
        try {
            this.f7943b.f9133i = mediationBannerAd2.getView();
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