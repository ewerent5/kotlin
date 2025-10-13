package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vu2 implements Parcelable {
    public static final Parcelable.Creator<vu2> CREATOR = new uu2();

    /* renamed from: e, reason: collision with root package name */
    private int f9784e;

    /* renamed from: f, reason: collision with root package name */
    private final UUID f9785f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9786g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f9787h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f9788i;

    vu2(Parcel parcel) {
        this.f9785f = new UUID(parcel.readLong(), parcel.readLong());
        this.f9786g = parcel.readString();
        this.f9787h = parcel.createByteArray();
        this.f9788i = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vu2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        vu2 vu2Var = (vu2) obj;
        return this.f9786g.equals(vu2Var.f9786g) && v03.a(this.f9785f, vu2Var.f9785f) && Arrays.equals(this.f9787h, vu2Var.f9787h);
    }

    public final int hashCode() {
        int i2 = this.f9784e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = (((this.f9785f.hashCode() * 31) + this.f9786g.hashCode()) * 31) + Arrays.hashCode(this.f9787h);
        this.f9784e = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f9785f.getMostSignificantBits());
        parcel.writeLong(this.f9785f.getLeastSignificantBits());
        parcel.writeString(this.f9786g);
        parcel.writeByteArray(this.f9787h);
        parcel.writeByte(this.f9788i ? (byte) 1 : (byte) 0);
    }

    public vu2(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f9785f = uuid;
        this.f9786g = str;
        Objects.requireNonNull(bArr);
        this.f9787h = bArr;
        this.f9788i = false;
    }
}