package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.internal.ads.u1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static final class Builder extends AdRequest.Builder {
        @RecentlyNonNull
        public Builder addCategoryExclusion(@RecentlyNonNull String str) {
            this.zza.z(str);
            return this;
        }

        @RecentlyNonNull
        public Builder addCustomTargeting(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.zza.y(str, str2);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @RecentlyNonNull
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdInfo(@RecentlyNonNull AdInfo adInfo) {
            setAdInfo(adInfo);
            return this;
        }

        @RecentlyNonNull
        public Builder setPublisherProvidedId(@RecentlyNonNull String str) {
            this.zza.v(str);
            return this;
        }

        @RecentlyNonNull
        public Builder addCustomTargeting(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
            if (list != null) {
                this.zza.y(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @RecentlyNonNull
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @RecentlyNonNull
        public Builder setAdInfo(@RecentlyNonNull AdInfo adInfo) {
            this.zza.B(adInfo);
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    @RecentlyNonNull
    public Bundle getCustomTargeting() {
        return this.zza.q();
    }

    @RecentlyNonNull
    public String getPublisherProvidedId() {
        return this.zza.j();
    }

    @Override // com.google.android.gms.ads.AdRequest
    public final u1 zza() {
        return this.zza;
    }
}