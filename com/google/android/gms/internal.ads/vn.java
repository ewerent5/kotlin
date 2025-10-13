package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class vn extends RewardedInterstitialAd {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final an f9740b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f9741c;

    /* renamed from: d, reason: collision with root package name */
    private final tn f9742d = new tn();

    /* renamed from: e, reason: collision with root package name */
    private FullScreenContentCallback f9743e;

    /* renamed from: f, reason: collision with root package name */
    private OnAdMetadataChangedListener f9744f;

    /* renamed from: g, reason: collision with root package name */
    private OnPaidEventListener f9745g;

    public vn(Context context, String str) {
        this.a = str;
        this.f9741c = context.getApplicationContext();
        this.f9740b = ta3.b().f(context, str, new pf());
    }

    public final void a(u1 u1Var, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                anVar.V2(q93.a.a(this.f9741c, u1Var), new un(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                return anVar.zzg();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f9743e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f9744f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f9745g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        k1 k1VarZzm = null;
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                k1VarZzm = anVar.zzm();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzc(k1VarZzm);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            an anVar = this.f9740b;
            xm xmVarZzl = anVar != null ? anVar.zzl() : null;
            if (xmVarZzl != null) {
                return new kn(xmVarZzl);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f9743e = fullScreenContentCallback;
        this.f9742d.I4(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                anVar.V(z);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f9744f = onAdMetadataChangedListener;
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                anVar.y3(new v2(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f9745g = onPaidEventListener;
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                anVar.c1(new w2(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                anVar.d0(new on(serverSideVerificationOptions));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f9742d.J4(onUserEarnedRewardListener);
        try {
            an anVar = this.f9740b;
            if (anVar != null) {
                anVar.e3(this.f9742d);
                this.f9740b.k(e.c.b.b.b.d.m4(activity));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}