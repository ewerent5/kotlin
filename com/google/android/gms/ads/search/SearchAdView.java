package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.w1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class SearchAdView extends ViewGroup {

    @NotOnlyInitialized
    private final w1 zza;

    public SearchAdView(@RecentlyNonNull Context context) {
        super(context);
        this.zza = new w1(this);
    }

    public void destroy() {
        this.zza.d();
    }

    @RecentlyNonNull
    public AdListener getAdListener() {
        return this.zza.e();
    }

    @RecentlyNullable
    public AdSize getAdSize() {
        return this.zza.f();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.zza.h();
    }

    public void loadAd(@RecentlyNonNull DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (!AdSize.SEARCH.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.zza.j(dynamicHeightSearchAdRequest.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i6 = ((i4 - i2) - measuredWidth) / 2;
        int i7 = ((i5 - i3) - measuredHeight) / 2;
        childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e2) {
                er.zzg("Unable to retrieve ad size.", e2);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i2, i3);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i3));
    }

    public void pause() {
        this.zza.k();
    }

    public void resume() {
        this.zza.m();
    }

    public void setAdListener(@RecentlyNonNull AdListener adListener) {
        this.zza.n(adListener);
    }

    public void setAdSize(@RecentlyNonNull AdSize adSize) {
        this.zza.p(adSize);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.zza.r(str);
    }

    public SearchAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new w1(this, attributeSet, false);
    }

    public SearchAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zza = new w1(this, attributeSet, false);
    }

    public void loadAd(@RecentlyNonNull SearchAdRequest searchAdRequest) {
        this.zza.j(searchAdRequest.zza());
    }
}