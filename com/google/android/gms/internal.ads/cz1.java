package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cz1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<cz1> CREATOR = new dz1();

    /* renamed from: e, reason: collision with root package name */
    public final int f5392e;

    /* renamed from: f, reason: collision with root package name */
    private u91 f5393f = null;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f5394g;

    cz1(int i2, byte[] bArr) {
        this.f5392e = i2;
        this.f5394g = bArr;
        zzb();
    }

    private final void zzb() {
        u91 u91Var = this.f5393f;
        if (u91Var != null || this.f5394g == null) {
            if (u91Var == null || this.f5394g != null) {
                if (u91Var != null && this.f5394g != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (u91Var != null || this.f5394g != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final u91 c() {
        if (this.f5393f == null) {
            try {
                this.f5393f = u91.y0(this.f5394g, qi2.a());
                this.f5394g = null;
            } catch (qj2 | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.f5393f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f5392e);
        byte[] bArrI = this.f5394g;
        if (bArrI == null) {
            bArrI = this.f5393f.i();
        }
        com.google.android.gms.common.internal.w.c.g(parcel, 2, bArrI, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}