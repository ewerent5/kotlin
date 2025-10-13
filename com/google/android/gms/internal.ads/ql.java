package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ql extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<ql> CREATOR = new rl();

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8401e;

    /* renamed from: f, reason: collision with root package name */
    public final kr f8402f;

    /* renamed from: g, reason: collision with root package name */
    public final ApplicationInfo f8403g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8404h;

    /* renamed from: i, reason: collision with root package name */
    public final List<String> f8405i;

    /* renamed from: j, reason: collision with root package name */
    public final PackageInfo f8406j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8407k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8408l;

    /* renamed from: m, reason: collision with root package name */
    public jr1 f8409m;
    public String n;

    public ql(Bundle bundle, kr krVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, jr1 jr1Var, String str4) {
        this.f8401e = bundle;
        this.f8402f = krVar;
        this.f8404h = str;
        this.f8403g = applicationInfo;
        this.f8405i = list;
        this.f8406j = packageInfo;
        this.f8407k = str2;
        this.f8408l = str3;
        this.f8409m = jr1Var;
        this.n = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.e(parcel, 1, this.f8401e, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, this.f8402f, i2, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, this.f8403g, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 4, this.f8404h, false);
        com.google.android.gms.common.internal.w.c.u(parcel, 5, this.f8405i, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 6, this.f8406j, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 7, this.f8407k, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 9, this.f8408l, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 10, this.f8409m, i2, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 11, this.n, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}