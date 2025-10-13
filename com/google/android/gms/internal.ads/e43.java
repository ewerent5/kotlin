package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class e43 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<e43> CREATOR = new f43();

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private ParcelFileDescriptor f5577e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private final boolean f5578f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    private final boolean f5579g;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    private final long f5580h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private final boolean f5581i;

    public e43() {
        this(null, false, false, 0L, false);
    }

    final synchronized ParcelFileDescriptor I() {
        return this.f5577e;
    }

    public final synchronized boolean J() {
        return this.f5578f;
    }

    public final synchronized boolean K() {
        return this.f5579g;
    }

    public final synchronized long L() {
        return this.f5580h;
    }

    public final synchronized boolean M() {
        return this.f5581i;
    }

    public final synchronized InputStream c() {
        ParcelFileDescriptor parcelFileDescriptor = this.f5577e;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f5577e = null;
        return autoCloseInputStream;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.r(parcel, 2, I(), i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 3, J());
        com.google.android.gms.common.internal.w.c.c(parcel, 4, K());
        com.google.android.gms.common.internal.w.c.p(parcel, 5, L());
        com.google.android.gms.common.internal.w.c.c(parcel, 6, M());
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public final synchronized boolean zza() {
        return this.f5577e != null;
    }

    public e43(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j2, boolean z3) {
        this.f5577e = parcelFileDescriptor;
        this.f5578f = z;
        this.f5579g = z2;
        this.f5580h = j2;
        this.f5581i = z3;
    }
}