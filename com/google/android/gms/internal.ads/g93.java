package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class g93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<g93> CREATOR = new h93();

    /* renamed from: e, reason: collision with root package name */
    public final int f6091e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6092f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6093g;

    /* renamed from: h, reason: collision with root package name */
    public g93 f6094h;

    /* renamed from: i, reason: collision with root package name */
    public IBinder f6095i;

    public g93(int i2, String str, String str2, g93 g93Var, IBinder iBinder) {
        this.f6091e = i2;
        this.f6092f = str;
        this.f6093g = str2;
        this.f6094h = g93Var;
        this.f6095i = iBinder;
    }

    public final LoadAdError I() {
        g93 g93Var = this.f6094h;
        k1 i1Var = null;
        AdError adError = g93Var == null ? null : new AdError(g93Var.f6091e, g93Var.f6092f, g93Var.f6093g);
        int i2 = this.f6091e;
        String str = this.f6092f;
        String str2 = this.f6093g;
        IBinder iBinder = this.f6095i;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            i1Var = iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(iBinder);
        }
        return new LoadAdError(i2, str, str2, adError, ResponseInfo.zzb(i1Var));
    }

    public final AdError c() {
        g93 g93Var = this.f6094h;
        return new AdError(this.f6091e, this.f6092f, this.f6093g, g93Var == null ? null : new AdError(g93Var.f6091e, g93Var.f6092f, g93Var.f6093g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f6091e);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f6092f, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f6093g, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 4, this.f6094h, i2, false);
        com.google.android.gms.common.internal.w.c.l(parcel, 5, this.f6095i, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}