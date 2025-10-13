package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.h2;
import com.google.android.gms.internal.ads.ta3;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.x6;
import e.c.b.b.b.b;
import e.c.b.b.b.d;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    @NotOnlyInitialized
    private final FrameLayout zza;

    @NotOnlyInitialized
    private final x6 zzb;

    public NativeAdView(@RecentlyNonNull Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(String str, View view) {
        x6 x6Var = this.zzb;
        if (x6Var != null) {
            try {
                x6Var.r1(str, d.m4(view));
            } catch (RemoteException e2) {
                er.zzg("Unable to call setAssetView on delegate", e2);
            }
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @RequiresNonNull({"overlayFrame"})
    private final x6 zzf() {
        if (isInEditMode()) {
            return null;
        }
        return ta3.b().d(this.zza.getContext(), this, this.zza);
    }

    @Override // android.view.ViewGroup
    public final void addView(@RecentlyNonNull View view, int i2, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@RecentlyNonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        x6 x6Var = this.zzb;
        if (x6Var != null) {
            try {
                x6Var.zze();
            } catch (RemoteException e2) {
                er.zzg("Unable to destroy native ad view", e2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        x6 x6Var;
        if (((Boolean) c.c().b(w3.Q1)).booleanValue() && (x6Var = this.zzb) != null) {
            try {
                x6Var.P2(d.m4(motionEvent));
            } catch (RemoteException e2) {
                er.zzg("Unable to call handleTouchEvent on delegate", e2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RecentlyNullable
    public AdChoicesView getAdChoicesView() {
        View viewZza = zza("3011");
        if (viewZza instanceof AdChoicesView) {
            return (AdChoicesView) viewZza;
        }
        return null;
    }

    @RecentlyNullable
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @RecentlyNullable
    public final View getBodyView() {
        return zza("3004");
    }

    @RecentlyNullable
    public final View getCallToActionView() {
        return zza("3002");
    }

    @RecentlyNullable
    public final View getHeadlineView() {
        return zza("3001");
    }

    @RecentlyNullable
    public final View getIconView() {
        return zza("3003");
    }

    @RecentlyNullable
    public final View getImageView() {
        return zza("3008");
    }

    @RecentlyNullable
    public final MediaView getMediaView() {
        View viewZza = zza("3010");
        if (viewZza instanceof MediaView) {
            return (MediaView) viewZza;
        }
        if (viewZza == null) {
            return null;
        }
        er.zzd("View is not an instance of MediaView");
        return null;
    }

    @RecentlyNullable
    public final View getPriceView() {
        return zza("3007");
    }

    @RecentlyNullable
    public final View getStarRatingView() {
        return zza("3009");
    }

    @RecentlyNullable
    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@RecentlyNonNull View view, int i2) {
        super.onVisibilityChanged(view, i2);
        x6 x6Var = this.zzb;
        if (x6Var != null) {
            try {
                x6Var.M(d.m4(view), i2);
            } catch (RemoteException e2) {
                er.zzg("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@RecentlyNonNull View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        zzd("3005", view);
    }

    public final void setBodyView(View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        x6 x6Var = this.zzb;
        if (x6Var != null) {
            try {
                x6Var.zzg(d.m4(view));
            } catch (RemoteException e2) {
                er.zzg("Unable to call setClickConfirmingView on delegate", e2);
            }
        }
    }

    public final void setHeadlineView(View view) {
        zzd("3001", view);
    }

    public final void setIconView(View view) {
        zzd("3003", view);
    }

    public final void setImageView(View view) {
        zzd("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new d6(this) { // from class: com.google.android.gms.ads.nativead.zzb
            private final NativeAdView zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.d6
            public final void zza(MediaContent mediaContent) {
                this.zza.zzc(mediaContent);
            }
        });
        mediaView.zzb(new f6(this) { // from class: com.google.android.gms.ads.nativead.zzc
            private final NativeAdView zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.f6
            public final void zza(ImageView.ScaleType scaleType) {
                this.zza.zzb(scaleType);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [e.c.b.b.b.b, java.lang.Object] */
    public void setNativeAd(@RecentlyNonNull NativeAd nativeAd) {
        x6 x6Var = this.zzb;
        if (x6Var != 0) {
            try {
                x6Var.v(nativeAd.zza());
            } catch (RemoteException e2) {
                er.zzg("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public final void setPriceView(View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(View view) {
        zzd("3009", view);
    }

    public final void setStoreView(View view) {
        zzd("3006", view);
    }

    @RecentlyNullable
    protected final View zza(@RecentlyNonNull String str) {
        x6 x6Var = this.zzb;
        if (x6Var != null) {
            try {
                b bVarD = x6Var.d(str);
                if (bVarD != null) {
                    return (View) d.Y(bVarD);
                }
            } catch (RemoteException e2) {
                er.zzg("Unable to call getAssetView on delegate", e2);
            }
        }
        return null;
    }

    final /* synthetic */ void zzb(ImageView.ScaleType scaleType) {
        x6 x6Var = this.zzb;
        if (x6Var == null || scaleType == null) {
            return;
        }
        try {
            x6Var.H4(d.m4(scaleType));
        } catch (RemoteException e2) {
            er.zzg("Unable to call setMediaViewImageScaleType on delegate", e2);
        }
    }

    final /* synthetic */ void zzc(MediaContent mediaContent) {
        x6 x6Var = this.zzb;
        if (x6Var == null) {
            return;
        }
        try {
            if (mediaContent instanceof h2) {
                x6Var.K0(((h2) mediaContent).a());
            } else if (mediaContent == null) {
                x6Var.K0(null);
            } else {
                er.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e2) {
            er.zzg("Unable to call setMediaContent on delegate", e2);
        }
    }

    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    @TargetApi(21)
    public NativeAdView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}