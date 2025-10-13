package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.c93;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.w1;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    @NotOnlyInitialized
    protected final w1 zza;

    protected BaseAdView(@RecentlyNonNull Context context, int i2) {
        super(context);
        this.zza = new w1(this, i2);
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

    @RecentlyNullable
    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.x();
    }

    @RecentlyNullable
    public ResponseInfo getResponseInfo() {
        return this.zza.v();
    }

    public boolean isLoading() {
        return this.zza.u();
    }

    public void loadAd(@RecentlyNonNull AdRequest adRequest) {
        this.zza.j(adRequest.zza());
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(@RecentlyNonNull AdListener adListener) {
        this.zza.n(adListener);
        if (adListener == 0) {
            this.zza.o(null);
            return;
        }
        if (adListener instanceof c93) {
            this.zza.o((c93) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zza.s((AppEventListener) adListener);
        }
    }

    public void setAdSize(@RecentlyNonNull AdSize adSize) {
        this.zza.p(adSize);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        this.zza.r(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.w(onPaidEventListener);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.zza = new w1(this, attributeSet, false, i2);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.zza = new w1(this, attributeSet, false, i3);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3, boolean z) {
        super(context, attributeSet, i2);
        this.zza = new w1(this, attributeSet, z, i3);
    }

    protected BaseAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new w1(this, attributeSet, z);
    }
}