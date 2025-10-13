package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.xq;
import com.google.android.gms.internal.ads.zzbic;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zzbic, zzb {

    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";

    @RecentlyNonNull
    protected AdView zza;

    @RecentlyNonNull
    protected InterstitialAd zzb;
    private AdLoader zzc;

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        zza zzaVar = new zza();
        zzaVar.zza(1);
        return zzaVar.zzb();
    }

    @Override // com.google.android.gms.ads.mediation.zzb
    public n1 getVideoController() {
        AdView adView = this.zza;
        if (adView != null) {
            return adView.zza().zzb();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.zza;
        if (adView != null) {
            adView.destroy();
            this.zza = null;
        }
        if (this.zzb != null) {
            this.zzb = null;
        }
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzb;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.zza;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.zza;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull MediationBannerListener mediationBannerListener, @RecentlyNonNull Bundle bundle, @RecentlyNonNull AdSize adSize, @RecentlyNonNull MediationAdRequest mediationAdRequest, @RecentlyNonNull Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zza = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zza.setAdUnitId(getAdUnitId(bundle));
        this.zza.setAdListener(new h(this, mediationBannerListener));
        this.zza.loadAd(zzb(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull MediationInterstitialListener mediationInterstitialListener, @RecentlyNonNull Bundle bundle, @RecentlyNonNull MediationAdRequest mediationAdRequest, @RecentlyNonNull Bundle bundle2) {
        InterstitialAd.load(context, getAdUnitId(bundle), zzb(context, mediationAdRequest, bundle2, bundle), new i(this, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull MediationNativeListener mediationNativeListener, @RecentlyNonNull Bundle bundle, @RecentlyNonNull NativeMediationAdRequest nativeMediationAdRequest, @RecentlyNonNull Bundle bundle2) {
        k kVar = new k(this, mediationNativeListener);
        AdLoader.Builder builder = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        builder.withAdListener(kVar);
        builder.withNativeAdOptions(nativeMediationAdRequest.getNativeAdOptions());
        builder.withNativeAdOptions(nativeMediationAdRequest.getNativeAdRequestOptions());
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            builder.forUnifiedNativeAd(kVar);
        }
        if (nativeMediationAdRequest.zza()) {
            for (String str : nativeMediationAdRequest.zzb().keySet()) {
                builder.forCustomTemplateAd(str, kVar, true != nativeMediationAdRequest.zzb().get(str).booleanValue() ? null : kVar);
            }
        }
        AdLoader adLoaderBuild = builder.build();
        this.zzc = adLoaderBuild;
        adLoaderBuild.loadAd(zzb(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd = this.zzb;
        if (interstitialAd != null) {
            interstitialAd.show(null);
        }
    }

    @RecentlyNonNull
    protected abstract Bundle zza(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    final AdRequest zzb(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.zzb(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.zzc(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            Iterator<String> it = keywords.iterator();
            while (it.hasNext()) {
                builder.addKeyword(it.next());
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            ta3.a();
            builder.zza(xq.t(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.zzd(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.zze(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }
}