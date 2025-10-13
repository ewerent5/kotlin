package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class tm extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<tm> CREATOR = new um();

    /* renamed from: e, reason: collision with root package name */
    public final String f9199e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9200f;

    public tm(String str, int i2) {
        this.f9199e = str;
        this.f9200f = i2;
    }

    public static tm c(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new tm(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof tm)) {
            tm tmVar = (tm) obj;
            if (com.google.android.gms.common.internal.o.a(this.f9199e, tmVar.f9199e) && com.google.android.gms.common.internal.o.a(Integer.valueOf(this.f9200f), Integer.valueOf(tmVar.f9200f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.b(this.f9199e, Integer.valueOf(this.f9200f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f9199e, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f9200f);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}