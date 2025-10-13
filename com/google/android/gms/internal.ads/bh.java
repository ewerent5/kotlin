package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class bh<NETWORK_EXTRAS extends com.google.ads.mediation.f, SERVER_PARAMETERS extends com.google.ads.mediation.e> implements com.google.ads.mediation.c, com.google.ads.mediation.d {
    private final zf a;

    public bh(zf zfVar) {
        this.a = zfVar;
    }

    @Override // com.google.ads.mediation.c
    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, e.c.a.a aVar) {
        String strValueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(strValueOf);
        er.zzd(sb.toString());
        ta3.a();
        if (!xq.p()) {
            er.zzl("#008 Must be called on the main UI thread.", null);
            xq.a.post(new zg(this, aVar));
        } else {
            try {
                this.a.W(ch.a(aVar));
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.ads.mediation.d
    public final void b(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, e.c.a.a aVar) {
        String strValueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(strValueOf);
        sb.append(".");
        er.zzd(sb.toString());
        ta3.a();
        if (!xq.p()) {
            er.zzl("#008 Must be called on the main UI thread.", null);
            xq.a.post(new ah(this, aVar));
        } else {
            try {
                this.a.W(ch.a(aVar));
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}