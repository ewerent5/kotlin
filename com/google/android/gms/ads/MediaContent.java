package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    @RecentlyNullable
    Drawable getMainImage();

    @RecentlyNonNull
    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);
}