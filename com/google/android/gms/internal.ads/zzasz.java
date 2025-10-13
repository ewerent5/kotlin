package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import c.c.b.c;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzasz implements MediationInterstitialAdapter {
    private Activity a;

    /* renamed from: b, reason: collision with root package name */
    private MediationInterstitialListener f10669b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f10670c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        er.zzd("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        er.zzd("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        er.zzd("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f10669b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            er.zzi("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            er.zzi("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f10669b.onAdFailedToLoad(this, 0);
            return;
        }
        if (!com.google.android.gms.common.util.n.b() || !v4.a(context)) {
            er.zzi("Default browser does not support custom tabs. Bailing out.");
            this.f10669b.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            er.zzi("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f10669b.onAdFailedToLoad(this, 0);
        } else {
            this.a = (Activity) context;
            this.f10670c = Uri.parse(string);
            this.f10669b.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        c.c.b.c cVarA = new c.a().a();
        cVarA.a.setData(this.f10670c);
        zzr.zza.post(new ji(this, new AdOverlayInfoParcel(new zzc(cVarA.a, null), null, new ii(this), null, new kr(0, 0, false, false, false), null)));
        zzs.zzg().d();
    }
}