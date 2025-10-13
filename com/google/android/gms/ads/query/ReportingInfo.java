package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.qk;
import com.google.android.gms.internal.ads.rk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final rk zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class Builder {
        private final qk zza;

        public Builder(@RecentlyNonNull View view) {
            qk qkVar = new qk();
            this.zza = qkVar;
            qkVar.a(view);
        }

        @RecentlyNonNull
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @RecentlyNonNull
        public Builder setAssetViews(@RecentlyNonNull Map<String, View> map) {
            this.zza.b(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zza zzaVar) {
        this.zza = new rk(builder.zza);
    }

    public void reportTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        this.zza.c(motionEvent);
    }

    public void updateClickUrl(@RecentlyNonNull Uri uri, @RecentlyNonNull UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.b(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(@RecentlyNonNull List<Uri> list, @RecentlyNonNull UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.a(list, updateImpressionUrlsCallback);
    }
}