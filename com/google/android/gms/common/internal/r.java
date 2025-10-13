package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public class r extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<r> CREATOR = new b0();

    /* renamed from: e */
    private final int f4720e;

    /* renamed from: f */
    private IBinder f4721f;

    /* renamed from: g */
    private com.google.android.gms.common.b f4722g;

    /* renamed from: h */
    private boolean f4723h;

    /* renamed from: i */
    private boolean f4724i;

    r(int i2, IBinder iBinder, com.google.android.gms.common.b bVar, boolean z, boolean z2) {
        this.f4720e = i2;
        this.f4721f = iBinder;
        this.f4722g = bVar;
        this.f4723h = z;
        this.f4724i = z2;
    }

    public com.google.android.gms.common.b I() {
        return this.f4722g;
    }

    public boolean J() {
        return this.f4723h;
    }

    public boolean K() {
        return this.f4724i;
    }

    public k c() {
        return k.a.U(this.f4721f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f4722g.equals(rVar.f4722g) && c().equals(rVar.c());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f4720e);
        com.google.android.gms.common.internal.w.c.l(parcel, 2, this.f4721f, false);
        com.google.android.gms.common.internal.w.c.r(parcel, 3, I(), i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 4, J());
        com.google.android.gms.common.internal.w.c.c(parcel, 5, K());
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}