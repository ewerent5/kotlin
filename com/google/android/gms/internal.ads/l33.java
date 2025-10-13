package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class l33 extends AppOpenAd {
    private final q33 a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7181b;

    /* renamed from: c, reason: collision with root package name */
    private final m33 f7182c = new m33();

    /* renamed from: d, reason: collision with root package name */
    FullScreenContentCallback f7183d;

    /* renamed from: e, reason: collision with root package name */
    private OnPaidEventListener f7184e;

    public l33(q33 q33Var, String str) {
        this.a = q33Var;
        this.f7181b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.f7181b;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f7183d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f7184e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        k1 k1VarZzg;
        try {
            k1VarZzg = this.a.zzg();
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
            k1VarZzg = null;
        }
        return ResponseInfo.zzc(k1VarZzg);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f7183d = fullScreenContentCallback;
        this.f7182c.I4(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.a.P(z);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f7184e = onPaidEventListener;
        try {
            this.a.j4(new w2(onPaidEventListener));
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.a.H2(e.c.b.b.b.d.m4(activity), this.f7182c);
        } catch (RemoteException e2) {
            er.zzl("#007 Could not call remote method.", e2);
        }
    }
}