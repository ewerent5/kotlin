package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class ua3 extends AdListener {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private AdListener f9410b;

    public final void a(AdListener adListener) {
        synchronized (this.a) {
            this.f9410b = adListener;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.a) {
            AdListener adListener = this.f9410b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.a) {
            AdListener adListener = this.f9410b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.a) {
            AdListener adListener = this.f9410b;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.a) {
            AdListener adListener = this.f9410b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.a) {
            AdListener adListener = this.f9410b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }
}