package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class d3 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<d3> CREATOR = new e3();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5419e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5420f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5421g;

    public d3(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.c(parcel, 2, this.f5419e);
        com.google.android.gms.common.internal.w.c.c(parcel, 3, this.f5420f);
        com.google.android.gms.common.internal.w.c.c(parcel, 4, this.f5421g);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public d3(boolean z, boolean z2, boolean z3) {
        this.f5419e = z;
        this.f5420f = z2;
        this.f5421g = z3;
    }
}