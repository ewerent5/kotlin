package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class uc<AdT> extends AdManagerInterstitialAd {
    private final Context a;

    /* renamed from: b */
    private final q93 f9414b;

    /* renamed from: c */
    private final w f9415c;

    /* renamed from: d */
    private final String f9416d;

    /* renamed from: e */
    private final pf f9417e;

    /* renamed from: f */
    private AppEventListener f9418f;

    /* renamed from: g */
    private FullScreenContentCallback f9419g;

    /* renamed from: h */
    private OnPaidEventListener f9420h;

    public uc(Context context, String str) {
        pf pfVar = new pf();
        this.f9417e = pfVar;
        this.a = context;
        this.f9416d = str;
        this.f9414b = q93.a;
        this.f9415c = ta3.b().b(context, new r93(), str, pfVar);
    }

    public final void a(u1 u1Var, AdLoadCallback<AdT> adLoadCallback) {
        try {
            if (this.f9415c != null) {
                this.f9417e.J4(u1Var.n());
                this.f9415c.zzP(this.f9414b.a(this.a, u1Var), new j93(adLoadCallback, this));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.f9416d;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f9418f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f9419g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f9420h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        k1 k1VarZzt = null;
        try {
            w wVar = this.f9415c;
            if (wVar != null) {
                k1VarZzt = wVar.zzt();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzc(k1VarZzt);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f9418f = appEventListener;
            w wVar = this.f9415c;
            if (wVar != null) {
                wVar.zzi(appEventListener != null ? new j23(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f9419g = fullScreenContentCallback;
            w wVar = this.f9415c;
            if (wVar != null) {
                wVar.zzR(new d(fullScreenContentCallback));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            w wVar = this.f9415c;
            if (wVar != null) {
                wVar.zzJ(z);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f9420h = onPaidEventListener;
            w wVar = this.f9415c;
            if (wVar != null) {
                wVar.zzO(new w2(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            er.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            w wVar = this.f9415c;
            if (wVar != null) {
                wVar.zzQ(e.c.b.b.b.d.m4(activity));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}