package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.er;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, c>, MediationInterstitialAdapter<CustomEventExtras, c> {
    private View a;

    /* renamed from: b, reason: collision with root package name */
    CustomEventBanner f4260b;

    /* renamed from: c, reason: collision with root package name */
    CustomEventInterstitial f4261c;

    private static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            er.zzi(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    public void destroy() {
        CustomEventBanner customEventBanner = this.f4260b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f4261c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    @RecentlyNonNull
    public Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.a;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    @RecentlyNonNull
    public Class<c> getServerParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.f4261c.showInterstitial();
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull com.google.ads.mediation.c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull c cVar2, @RecentlyNonNull e.c.a.c cVar3, @RecentlyNonNull com.google.ads.mediation.a aVar, @RecentlyNonNull CustomEventExtras customEventExtras) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(cVar2.f4262b);
        this.f4260b = customEventBanner;
        if (customEventBanner == null) {
            cVar.a(this, e.c.a.a.INTERNAL_ERROR);
        } else {
            this.f4260b.requestBannerAd(new d(this, cVar), activity, cVar2.a, cVar2.f4263c, cVar3, aVar, customEventExtras == null ? null : customEventExtras.getExtra(cVar2.a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull com.google.ads.mediation.d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull c cVar, @RecentlyNonNull com.google.ads.mediation.a aVar, @RecentlyNonNull CustomEventExtras customEventExtras) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(cVar.f4262b);
        this.f4261c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.b(this, e.c.a.a.INTERNAL_ERROR);
        } else {
            this.f4261c.requestInterstitialAd(new e(this, this, dVar), activity, cVar.a, cVar.f4263c, aVar, customEventExtras == null ? null : customEventExtras.getExtra(cVar.a));
        }
    }
}