package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.o;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class d extends com.google.android.gms.common.internal.w.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new r();

    /* renamed from: e, reason: collision with root package name */
    private final String f4640e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    private final int f4641f;

    /* renamed from: g, reason: collision with root package name */
    private final long f4642g;

    public d(@RecentlyNonNull String str, int i2, long j2) {
        this.f4640e = str;
        this.f4641f = i2;
        this.f4642g = j2;
    }

    public d(@RecentlyNonNull String str, long j2) {
        this.f4640e = str;
        this.f4642g = j2;
        this.f4641f = -1;
    }

    public long I() {
        long j2 = this.f4642g;
        return j2 == -1 ? this.f4641f : j2;
    }

    @RecentlyNonNull
    public String c() {
        return this.f4640e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((c() != null && c().equals(dVar.c())) || (c() == null && dVar.c() == null)) && I() == dVar.I()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o.b(c(), Long.valueOf(I()));
    }

    @RecentlyNonNull
    public final String toString() {
        o.a aVarC = o.c(this);
        aVarC.a(Action.NAME_ATTRIBUTE, c());
        aVarC.a("version", Long.valueOf(I()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, c(), false);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f4641f);
        com.google.android.gms.common.internal.w.c.p(parcel, 3, I());
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}