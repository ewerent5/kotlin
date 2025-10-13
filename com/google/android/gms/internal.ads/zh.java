package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class zh implements MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> {
    final /* synthetic */ gh a;

    /* renamed from: b */
    final /* synthetic */ zf f10595b;

    zh(ei eiVar, gh ghVar, zf zfVar) {
        this.a = ghVar;
        this.f10595b = zfVar;
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
    public final /* bridge */ /* synthetic */ MediationBannerAdCallback onSuccess(MediationInterscrollerAd mediationInterscrollerAd) {
        MediationInterscrollerAd mediationInterscrollerAd2 = mediationInterscrollerAd;
        if (mediationInterscrollerAd2 != null) {
            try {
                this.a.k1(new ug(mediationInterscrollerAd2));
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
            return new fi(this.f10595b);
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