package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class bi implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {
    final /* synthetic */ nh a;

    /* renamed from: b */
    final /* synthetic */ zf f5114b;

    bi(ei eiVar, nh nhVar, zf zfVar) {
        this.a = nhVar;
        this.f5114b = zfVar;
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
    public final /* bridge */ /* synthetic */ MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = unifiedNativeAdMapper;
        if (unifiedNativeAdMapper2 != null) {
            try {
                this.a.a4(new dh(unifiedNativeAdMapper2));
            } catch (RemoteException e2) {
                er.zzg("", e2);
            }
            return new fi(this.f5114b);
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