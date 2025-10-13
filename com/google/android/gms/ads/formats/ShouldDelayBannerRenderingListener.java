package com.google.android.gms.ads.formats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface ShouldDelayBannerRenderingListener {
    @KeepName
    boolean shouldDelayBannerRendering(@RecentlyNonNull Runnable runnable);
}