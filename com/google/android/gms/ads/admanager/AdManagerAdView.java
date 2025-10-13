package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.w;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@RecentlyNonNull Context context) {
        super(context, 0);
        p.k(context, "Context cannot be null");
    }

    @RecentlyNullable
    public AdSize[] getAdSizes() {
        return this.zza.g();
    }

    @RecentlyNullable
    public AppEventListener getAppEventListener() {
        return this.zza.i();
    }

    @RecentlyNonNull
    public VideoController getVideoController() {
        return this.zza.y();
    }

    @RecentlyNullable
    public VideoOptions getVideoOptions() {
        return this.zza.B();
    }

    public void loadAd(@RecentlyNonNull AdManagerAdRequest adManagerAdRequest) {
        this.zza.j(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.l();
    }

    public void setAdSizes(@RecentlyNonNull AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.q(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.s(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.t(z);
    }

    public void setVideoOptions(@RecentlyNonNull VideoOptions videoOptions) {
        this.zza.A(videoOptions);
    }

    public final boolean zza(w wVar) {
        return this.zza.C(wVar);
    }

    public AdManagerAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        p.k(context, "Context cannot be null");
    }

    public AdManagerAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0, true);
        p.k(context, "Context cannot be null");
    }
}