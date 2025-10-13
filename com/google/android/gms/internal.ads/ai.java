package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ai implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    final /* synthetic */ jh a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zf f4907b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ei f4908c;

    ai(ei eiVar, jh jhVar, zf zfVar) {
        this.f4908c = eiVar;
        this.a = jhVar;
        this.f4907b = zfVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.a.e(adError.zza());
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        MediationInterstitialAd mediationInterstitialAd2 = mediationInterstitialAd;
        if (mediationInterstitialAd2 != null) {
            try {
                this.f4908c.f5639f = mediationInterstitialAd2;
                this.a.zze();
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
            return new fi(this.f4907b);
        }
        er.zzi("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.a.b("Adapter returned null.");
            return null;
        } catch (RemoteException e3) {
            er.zzg("", e3);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }
}