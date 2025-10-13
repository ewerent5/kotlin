package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class t93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<t93> CREATOR = new v93();

    /* renamed from: e, reason: collision with root package name */
    public final int f9099e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9100f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9101g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9102h;

    public t93(int i2, int i3, String str, long j2) {
        this.f9099e = i2;
        this.f9100f = i3;
        this.f9101g = str;
        this.f9102h = j2;
    }

    public static t93 c(JSONObject jSONObject) {
        return new t93(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f9099e);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f9100f);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f9101g, false);
        com.google.android.gms.common.internal.w.c.p(parcel, 4, this.f9102h);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}