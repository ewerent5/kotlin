package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.er;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public class RequestConfiguration {

    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final int zzb;
    private final int zzc;

    @Nullable
    private final String zzd;
    private final List<String> zze;

    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @RecentlyNonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @RecentlyNonNull
    public static final List<String> zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;

        @Nullable
        private String zzc = null;
        private final List<String> zzd = new ArrayList();

        @RecentlyNonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        @RecentlyNonNull
        public Builder setMaxAdContentRating(@Nullable String str) {
            if (str == null || "".equals(str)) {
                this.zzc = null;
            } else if (RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.zzc = str;
            } else {
                er.zzi(str.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(str) : new String("Invalid value passed to setMaxAdContentRating: "));
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForChildDirectedTreatment(int i2) {
            if (i2 == -1 || i2 == 0 || i2 == 1) {
                this.zza = i2;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(i2);
                er.zzi(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(int i2) {
            if (i2 == -1 || i2 == 0 || i2 == 1) {
                this.zzb = i2;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(i2);
                er.zzi(sb.toString());
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTestDeviceIds(@Nullable List<String> list) {
            this.zzd.clear();
            if (list != null) {
                this.zzd.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForUnderAgeOfConsent {
    }

    /* synthetic */ RequestConfiguration(int i2, int i3, String str, List list, zzc zzcVar) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str;
        this.zze = list;
    }

    @RecentlyNonNull
    public String getMaxAdContentRating() {
        String str = this.zzd;
        return str == null ? "" : str;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    @RecentlyNonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    @RecentlyNonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.zzb);
        builder.setTagForUnderAgeOfConsent(this.zzc);
        builder.setMaxAdContentRating(this.zzd);
        builder.setTestDeviceIds(this.zze);
        return builder;
    }
}