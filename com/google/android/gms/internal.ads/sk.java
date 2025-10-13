package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import e.c.b.b.b.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class sk extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<sk> CREATOR = new tk();

    /* renamed from: e, reason: collision with root package name */
    public final View f8890e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, WeakReference<View>> f8891f;

    public sk(IBinder iBinder, IBinder iBinder2) {
        this.f8890e = (View) e.c.b.b.b.d.Y(b.a.U(iBinder));
        this.f8891f = (Map) e.c.b.b.b.d.Y(b.a.U(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.l(parcel, 1, e.c.b.b.b.d.m4(this.f8890e).asBinder(), false);
        com.google.android.gms.common.internal.w.c.l(parcel, 2, e.c.b.b.b.d.m4(this.f8891f).asBinder(), false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}