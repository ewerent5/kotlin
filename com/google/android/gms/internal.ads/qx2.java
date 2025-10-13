package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qx2 extends ox2 {
    public static final Parcelable.Creator<qx2> CREATOR = new px2();

    /* renamed from: f, reason: collision with root package name */
    public final String f8529f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8530g;

    qx2(Parcel parcel) {
        super(parcel.readString());
        this.f8529f = parcel.readString();
        this.f8530g = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qx2.class == obj.getClass()) {
            qx2 qx2Var = (qx2) obj;
            if (this.f8027e.equals(qx2Var.f8027e) && v03.a(this.f8529f, qx2Var.f8529f) && v03.a(this.f8530g, qx2Var.f8530g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8027e.hashCode() + 527) * 31;
        String str = this.f8529f;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8530g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f8027e);
        parcel.writeString(this.f8529f);
        parcel.writeString(this.f8530g);
    }

    public qx2(String str, String str2, String str3) {
        super(str);
        this.f8529f = null;
        this.f8530g = str3;
    }
}