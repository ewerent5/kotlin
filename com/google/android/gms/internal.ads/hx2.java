package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hx2 implements Parcelable {
    public static final Parcelable.Creator<hx2> CREATOR = new fx2();

    /* renamed from: e, reason: collision with root package name */
    private final gx2[] f6431e;

    hx2(Parcel parcel) {
        this.f6431e = new gx2[parcel.readInt()];
        int i2 = 0;
        while (true) {
            gx2[] gx2VarArr = this.f6431e;
            if (i2 >= gx2VarArr.length) {
                return;
            }
            gx2VarArr[i2] = (gx2) parcel.readParcelable(gx2.class.getClassLoader());
            i2++;
        }
    }

    public final int a() {
        return this.f6431e.length;
    }

    public final gx2 b(int i2) {
        return this.f6431e[i2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6431e, ((hx2) obj).f6431e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6431e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6431e.length);
        for (gx2 gx2Var : this.f6431e) {
            parcel.writeParcelable(gx2Var, 0);
        }
    }

    public hx2(List<? extends gx2> list) {
        gx2[] gx2VarArr = new gx2[list.size()];
        this.f6431e = gx2VarArr;
        list.toArray(gx2VarArr);
    }
}