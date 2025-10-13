package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mx2 extends ox2 {
    public static final Parcelable.Creator<mx2> CREATOR = new lx2();

    /* renamed from: f, reason: collision with root package name */
    public final String f7582f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7583g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7584h;

    mx2(Parcel parcel) {
        super("COMM");
        this.f7582f = parcel.readString();
        this.f7583g = parcel.readString();
        this.f7584h = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mx2.class == obj.getClass()) {
            mx2 mx2Var = (mx2) obj;
            if (v03.a(this.f7583g, mx2Var.f7583g) && v03.a(this.f7582f, mx2Var.f7582f) && v03.a(this.f7584h, mx2Var.f7584h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7582f;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7583g;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7584h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f8027e);
        parcel.writeString(this.f7582f);
        parcel.writeString(this.f7584h);
    }

    public mx2(String str, String str2, String str3) {
        super("COMM");
        this.f7582f = "und";
        this.f7583g = str2;
        this.f7584h = str3;
    }
}