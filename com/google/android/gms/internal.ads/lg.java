package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class lg implements MediationAdRequest {
    private final Date a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7242b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f7243c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7244d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f7245e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7246f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7247g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7248h;

    public lg(Date date, int i2, Set<String> set, Location location, boolean z, int i3, boolean z2, int i4, String str) {
        this.a = date;
        this.f7242b = i2;
        this.f7243c = set;
        this.f7245e = location;
        this.f7244d = z;
        this.f7246f = i3;
        this.f7247g = z2;
        this.f7248h = str;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f7242b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f7243c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f7245e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f7247g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f7244d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f7246f;
    }
}