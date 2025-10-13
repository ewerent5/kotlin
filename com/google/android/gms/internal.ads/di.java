package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class di implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    final /* synthetic */ qh a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zf f5474b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ei f5475c;

    di(ei eiVar, qh qhVar, zf zfVar) {
        this.f5475c = eiVar;
        this.a = qhVar;
        this.f5474b = zfVar;
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
    public final /* bridge */ /* synthetic */ MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        MediationRewardedAd mediationRewardedAd2 = mediationRewardedAd;
        if (mediationRewardedAd2 != null) {
            try {
                this.f5475c.f5640g = mediationRewardedAd2;
                this.a.zze();
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
            return new fi(this.f5474b);
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