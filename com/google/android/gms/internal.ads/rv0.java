package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rv0 {
    private final xa a;

    rv0(xa xaVar) {
        this.a = xaVar;
    }

    private final void q(qv0 qv0Var) throws JSONException {
        String strA = qv0.a(qv0Var);
        String strValueOf = String.valueOf(strA);
        zze.zza(strValueOf.length() != 0 ? "Dispatching AFMA event on publisher webview: ".concat(strValueOf) : new String("Dispatching AFMA event on publisher webview: "));
        this.a.c(strA);
    }

    public final void a() {
        q(new qv0("initialize", null));
    }

    public final void b(long j2) {
        qv0 qv0Var = new qv0("creation", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "nativeObjectCreated";
        q(qv0Var);
    }

    public final void c(long j2) {
        qv0 qv0Var = new qv0("creation", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "nativeObjectNotCreated";
        q(qv0Var);
    }

    public final void d(long j2) {
        qv0 qv0Var = new qv0("interstitial", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onNativeAdObjectNotAvailable";
        q(qv0Var);
    }

    public final void e(long j2) throws JSONException {
        qv0 qv0Var = new qv0("interstitial", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onAdLoaded";
        q(qv0Var);
    }

    public final void f(long j2, int i2) throws JSONException {
        qv0 qv0Var = new qv0("interstitial", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onAdFailedToLoad";
        qv0Var.f8485d = Integer.valueOf(i2);
        q(qv0Var);
    }

    public final void g(long j2) throws JSONException {
        qv0 qv0Var = new qv0("interstitial", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onAdOpened";
        q(qv0Var);
    }

    public final void h(long j2) {
        qv0 qv0Var = new qv0("interstitial", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onAdClicked";
        this.a.c(qv0.a(qv0Var));
    }

    public final void i(long j2) throws JSONException {
        qv0 qv0Var = new qv0("interstitial", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onAdClosed";
        q(qv0Var);
    }

    public final void j(long j2) {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onNativeAdObjectNotAvailable";
        q(qv0Var);
    }

    public final void k(long j2) throws JSONException {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onRewardedAdLoaded";
        q(qv0Var);
    }

    public final void l(long j2, int i2) throws JSONException {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onRewardedAdFailedToLoad";
        qv0Var.f8485d = Integer.valueOf(i2);
        q(qv0Var);
    }

    public final void m(long j2) throws JSONException {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onRewardedAdOpened";
        q(qv0Var);
    }

    public final void n(long j2, int i2) throws JSONException {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onRewardedAdFailedToShow";
        qv0Var.f8485d = Integer.valueOf(i2);
        q(qv0Var);
    }

    public final void o(long j2) throws JSONException {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onRewardedAdClosed";
        q(qv0Var);
    }

    public final void p(long j2, xm xmVar) throws JSONException {
        qv0 qv0Var = new qv0("rewarded", null);
        qv0Var.a = Long.valueOf(j2);
        qv0Var.f8484c = "onUserEarnedReward";
        qv0Var.f8486e = xmVar.zze();
        qv0Var.f8487f = Integer.valueOf(xmVar.zzf());
        q(qv0Var);
    }
}