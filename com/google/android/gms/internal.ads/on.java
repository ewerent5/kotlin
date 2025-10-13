package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class on extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<on> CREATOR = new qn();

    /* renamed from: e, reason: collision with root package name */
    public final String f7975e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7976f;

    public on(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f7975e, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f7976f, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public on(String str, String str2) {
        this.f7975e = str;
        this.f7976f = str2;
    }
}