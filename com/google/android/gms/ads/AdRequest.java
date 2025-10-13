package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.t1;
import com.google.android.gms.internal.ads.u1;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class AdRequest {

    @RecentlyNonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final u1 zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static class Builder {
        protected final t1 zza;

        public Builder() {
            t1 t1Var = new t1();
            this.zza = t1Var;
            t1Var.o("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        public Builder addCustomEventExtrasBundle(@RecentlyNonNull Class<? extends CustomEvent> cls, @RecentlyNonNull Bundle bundle) {
            this.zza.n(cls, bundle);
            return this;
        }

        @RecentlyNonNull
        public Builder addKeyword(@RecentlyNonNull String str) {
            this.zza.k(str);
            return this;
        }

        @RecentlyNonNull
        public Builder addNetworkExtras(@RecentlyNonNull NetworkExtras networkExtras) {
            this.zza.l(networkExtras);
            return this;
        }

        @RecentlyNonNull
        public Builder addNetworkExtrasBundle(@RecentlyNonNull Class<? extends MediationExtrasReceiver> cls, @RecentlyNonNull Bundle bundle) {
            this.zza.m(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.p("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        @RecentlyNonNull
        public AdRequest build() {
            return new AdRequest(this);
        }

        @RecentlyNonNull
        public Builder setAdInfo(@RecentlyNonNull AdInfo adInfo) {
            this.zza.B(adInfo);
            return this;
        }

        @RecentlyNonNull
        public Builder setContentUrl(@RecentlyNonNull String str) {
            p.k(str, "Content URL must be non-null.");
            p.g(str, "Content URL must be non-empty.");
            p.c(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.zza.r(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setHttpTimeoutMillis(int i2) {
            this.zza.C(i2);
            return this;
        }

        @RecentlyNonNull
        public Builder setLocation(@RecentlyNonNull Location location) {
            this.zza.u(location);
            return this;
        }

        @RecentlyNonNull
        public Builder setNeighboringContentUrls(@RecentlyNonNull List<String> list) {
            if (list == null) {
                er.zzi("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.s(list);
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestAgent(@RecentlyNonNull String str) {
            this.zza.w(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zza(@RecentlyNonNull String str) {
            this.zza.o(str);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zzb(@RecentlyNonNull Date date) {
            this.zza.q(date);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zzc(int i2) {
            this.zza.t(i2);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.x(z);
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.A(z);
            return this;
        }
    }

    protected AdRequest(@RecentlyNonNull Builder builder) {
        this.zza = new u1(builder.zza, null);
    }

    @RecentlyNonNull
    public String getContentUrl() {
        return this.zza.b();
    }

    @RecentlyNullable
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@RecentlyNonNull Class<T> cls) {
        return this.zza.i(cls);
    }

    @RecentlyNonNull
    public Bundle getCustomTargeting() {
        return this.zza.q();
    }

    @RecentlyNonNull
    public Set<String> getKeywords() {
        return this.zza.e();
    }

    @RecentlyNonNull
    public Location getLocation() {
        return this.zza.f();
    }

    @RecentlyNonNull
    public List<String> getNeighboringContentUrls() {
        return this.zza.c();
    }

    @RecentlyNullable
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@RecentlyNonNull Class<T> cls) {
        return this.zza.h(cls);
    }

    public boolean isTestDevice(@RecentlyNonNull Context context) {
        return this.zza.m(context);
    }

    public u1 zza() {
        return this.zza;
    }
}