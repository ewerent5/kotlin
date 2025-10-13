package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class gi extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<gi> CREATOR = new hi();

    /* renamed from: e, reason: collision with root package name */
    public final int f6125e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6126f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6127g;

    gi(int i2, int i3, int i4) {
        this.f6125e = i2;
        this.f6126f = i3;
        this.f6127g = i4;
    }

    public static gi c(VersionInfo versionInfo) {
        return new gi(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof gi)) {
            gi giVar = (gi) obj;
            if (giVar.f6127g == this.f6127g && giVar.f6126f == this.f6126f && giVar.f6125e == this.f6125e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f6125e, this.f6126f, this.f6127g});
    }

    public final String toString() {
        int i2 = this.f6125e;
        int i3 = this.f6126f;
        int i4 = this.f6127g;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        sb.append(".");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f6125e);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f6126f);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f6127g);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}