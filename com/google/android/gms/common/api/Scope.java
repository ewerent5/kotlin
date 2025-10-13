package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.w.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new m();

    /* renamed from: e */
    final int f4525e;

    /* renamed from: f */
    private final String f4526f;

    Scope(int i2, String str) {
        p.g(str, "scopeUri must not be null or empty");
        this.f4525e = i2;
        this.f4526f = str;
    }

    @RecentlyNonNull
    public String c() {
        return this.f4526f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f4526f.equals(((Scope) obj).f4526f);
        }
        return false;
    }

    public int hashCode() {
        return this.f4526f.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f4526f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f4525e);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, c(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public Scope(@RecentlyNonNull String str) {
        this(1, str);
    }
}