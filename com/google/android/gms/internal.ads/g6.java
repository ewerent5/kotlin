package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class g6 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<g6> CREATOR = new h6();

    /* renamed from: e, reason: collision with root package name */
    public final int f6057e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6058f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6059g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6060h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6061i;

    /* renamed from: j, reason: collision with root package name */
    public final d3 f6062j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6063k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6064l;

    public g6(int i2, boolean z, int i3, boolean z2, int i4, d3 d3Var, boolean z3, int i5) {
        this.f6057e = i2;
        this.f6058f = z;
        this.f6059g = i3;
        this.f6060h = z2;
        this.f6061i = i4;
        this.f6062j = d3Var;
        this.f6063k = z3;
        this.f6064l = i5;
    }

    public static NativeAdOptions c(g6 g6Var) {
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
        builder.setRequestMultipleImages(g6Var.f6060h);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f6057e);
        com.google.android.gms.common.internal.w.c.c(parcel, 2, this.f6058f);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f6059g);
        com.google.android.gms.common.internal.w.c.c(parcel, 4, this.f6060h);
        com.google.android.gms.common.internal.w.c.m(parcel, 5, this.f6061i);
        com.google.android.gms.common.internal.w.c.r(parcel, 6, this.f6062j, i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 7, this.f6063k);
        com.google.android.gms.common.internal.w.c.m(parcel, 8, this.f6064l);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public g6(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new d3(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio());
    }
}