package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kx2 extends ox2 {
    public static final Parcelable.Creator<kx2> CREATOR = new jx2();

    /* renamed from: f, reason: collision with root package name */
    public final String f7121f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7122g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7123h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f7124i;

    kx2(Parcel parcel) {
        super("APIC");
        this.f7121f = parcel.readString();
        this.f7122g = parcel.readString();
        this.f7123h = parcel.readInt();
        this.f7124i = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kx2.class == obj.getClass()) {
            kx2 kx2Var = (kx2) obj;
            if (this.f7123h == kx2Var.f7123h && v03.a(this.f7121f, kx2Var.f7121f) && v03.a(this.f7122g, kx2Var.f7122g) && Arrays.equals(this.f7124i, kx2Var.f7124i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f7123h + 527) * 31;
        String str = this.f7121f;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7122g;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7124i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7121f);
        parcel.writeString(this.f7122g);
        parcel.writeInt(this.f7123h);
        parcel.writeByteArray(this.f7124i);
    }

    public kx2(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f7121f = str;
        this.f7122g = null;
        this.f7123h = 3;
        this.f7124i = bArr;
    }
}