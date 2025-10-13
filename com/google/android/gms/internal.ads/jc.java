package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jc extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<jc> CREATOR = new kc();

    /* renamed from: e, reason: collision with root package name */
    public final int f6727e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6728f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6729g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6730h;

    public jc(int i2, int i3, String str, int i4) {
        this.f6727e = i2;
        this.f6728f = i3;
        this.f6729g = str;
        this.f6730h = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f6728f);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f6729g, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f6730h);
        com.google.android.gms.common.internal.w.c.m(parcel, CoreConstants.MILLIS_IN_ONE_SECOND, this.f6727e);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}