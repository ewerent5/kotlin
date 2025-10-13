package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xg implements NativeMediationAdRequest {
    private final Date a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10159b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f10160c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f10161d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f10162e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10163f;

    /* renamed from: g, reason: collision with root package name */
    private final g6 f10164g;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f10166i;

    /* renamed from: k, reason: collision with root package name */
    private final String f10168k;

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f10165h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Boolean> f10167j = new HashMap();

    public xg(Date date, int i2, Set<String> set, Location location, boolean z, int i3, g6 g6Var, List<String> list, boolean z2, int i4, String str) {
        this.a = date;
        this.f10159b = i2;
        this.f10160c = set;
        this.f10162e = location;
        this.f10161d = z;
        this.f10163f = i3;
        this.f10164g = g6Var;
        this.f10166i = z2;
        this.f10168k = str;
        if (list != null) {
            for (String str2 : list) {
                if (str2.startsWith("custom:")) {
                    String[] strArrSplit = str2.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f10167j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f10167j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f10165h.add(str2);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return c2.a().d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f10159b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f10160c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f10162e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        g6 g6Var = this.f10164g;
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (g6Var == null) {
            return builder.build();
        }
        int i2 = g6Var.f6057e;
        if (i2 == 2) {
            builder.setAdChoicesPlacement(g6Var.f6061i);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    builder.setRequestCustomMuteThisAd(g6Var.f6063k);
                    builder.setMediaAspectRatio(g6Var.f6064l);
                }
            }
            d3 d3Var = g6Var.f6062j;
            if (d3Var != null) {
                builder.setVideoOptions(new VideoOptions(d3Var));
            }
            builder.setAdChoicesPlacement(g6Var.f6061i);
        }
        builder.setReturnUrlsForImageAssets(g6Var.f6058f);
        builder.setImageOrientation(g6Var.f6059g);
        builder.setRequestMultipleImages(g6Var.f6060h);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return g6.c(this.f10164g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return c2.a().f();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f10166i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f10161d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.f10165h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f10163f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zza() {
        return this.f10165h.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map<String, Boolean> zzb() {
        return this.f10167j;
    }
}