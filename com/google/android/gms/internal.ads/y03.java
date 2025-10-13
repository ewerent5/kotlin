package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y03 implements Parcelable {
    public static final Parcelable.Creator<y03> CREATOR = new x03();

    /* renamed from: e, reason: collision with root package name */
    public final int f10330e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10331f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10332g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f10333h;

    /* renamed from: i, reason: collision with root package name */
    private int f10334i;

    public y03(int i2, int i3, int i4, byte[] bArr) {
        this.f10330e = i2;
        this.f10331f = i3;
        this.f10332g = i4;
        this.f10333h = bArr;
    }

    y03(Parcel parcel) {
        this.f10330e = parcel.readInt();
        this.f10331f = parcel.readInt();
        this.f10332g = parcel.readInt();
        this.f10333h = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y03.class == obj.getClass()) {
            y03 y03Var = (y03) obj;
            if (this.f10330e == y03Var.f10330e && this.f10331f == y03Var.f10331f && this.f10332g == y03Var.f10332g && Arrays.equals(this.f10333h, y03Var.f10333h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f10334i;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((this.f10330e + 527) * 31) + this.f10331f) * 31) + this.f10332g) * 31) + Arrays.hashCode(this.f10333h);
        this.f10334i = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i2 = this.f10330e;
        int i3 = this.f10331f;
        int i4 = this.f10332g;
        boolean z = this.f10333h != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f10330e);
        parcel.writeInt(this.f10331f);
        parcel.writeInt(this.f10332g);
        parcel.writeInt(this.f10333h != null ? 1 : 0);
        byte[] bArr = this.f10333h;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}