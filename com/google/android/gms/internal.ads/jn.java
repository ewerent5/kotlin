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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jn extends RewardedAd {
    private final String a;

    /* renamed from: b */
    private final an f6777b;

    /* renamed from: c */
    private final Context f6778c;

    /* renamed from: d */
    private final tn f6779d = new tn();

    /* renamed from: e */
    private OnAdMetadataChangedListener f6780e;

    /* renamed from: f */
    private OnPaidEventListener f6781f;

    /* renamed from: g */
    private FullScreenContentCallback f6782g;

    public jn(Context context, String str) {
        this.f6778c = context.getApplicationContext();
        this.a = str;
        this.f6777b = ta3.b().f(context, str, new pf());
    }

    public final void a(u1 u1Var, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            an anVar = this.f6777b;
            if (anVar != null) {
                anVar.w2(q93.a.a(this.f6778c, u1Var), new nn(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            an anVar = this.f6777b;
            if (anVar != null) {
                return anVar.zzg();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f6782g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f6780e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f6781f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        k1 k1VarZzm = null;
        try {
            an anVar = this.f6777b;
            if (anVar != null) {
                k1VarZzm = anVar.zzm();
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
        return ResponseInfo.zzc(k1VarZzm);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            an anVar = this.f6777b;
            xm xmVarZzl = anVar != null ? anVar.zzl() : null;
            return xmVarZzl == null ? RewardItem.DEFAULT_REWARD : new kn(xmVarZzl);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f6782g = fullScreenContentCallback;
        this.f6779d.I4(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            an anVar = this.f6777b;
            if (anVar != null) {
                anVar.V(z);
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f6780e = onAdMetadataChangedListener;
            an anVar = this.f6777b;
            if (anVar != null) {
                anVar.y3(new v2(onAdMetadataChangedListener));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f6781f = onPaidEventListener;
            an anVar = this.f6777b;
            if (anVar != null) {
                anVar.c1(new w2(onPaidEventListener));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                an anVar = this.f6777b;
                if (anVar != null) {
                    anVar.d0(new on(serverSideVerificationOptions));
                }
            } catch (RemoteException e2) {
                er.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f6779d.J4(onUserEarnedRewardListener);
        if (activity == null) {
            er.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            an anVar = this.f6777b;
            if (anVar != null) {
                anVar.e3(this.f6779d);
                this.f6777b.k(e.c.b.b.b.d.m4(activity));
            }
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}