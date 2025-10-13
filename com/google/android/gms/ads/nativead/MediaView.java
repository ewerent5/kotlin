package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.f6;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private d6 zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private f6 zzf;

    public MediaView(@RecentlyNonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        f6 f6Var = this.zzf;
        if (f6Var != null) {
            f6Var.zza(scaleType);
        }
    }

    public void setMediaContent(@RecentlyNonNull MediaContent mediaContent) {
        this.zzb = true;
        this.zza = mediaContent;
        d6 d6Var = this.zzc;
        if (d6Var != null) {
            d6Var.zza(mediaContent);
        }
    }

    protected final synchronized void zza(d6 d6Var) {
        this.zzc = d6Var;
        if (this.zzb) {
            d6Var.zza(this.zza);
        }
    }

    protected final synchronized void zzb(f6 f6Var) {
        this.zzf = f6Var;
        if (this.zze) {
            f6Var.zza(this.zzd);
        }
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @TargetApi(21)
    public MediaView(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}