package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.f1;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class h0 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: e, reason: collision with root package name */
    private final String f4653e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final x f4654f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f4655g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4656h;

    h0(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f4653e = str;
        y yVar = null;
        if (iBinder != null) {
            try {
                e.c.b.b.b.b bVarZzd = f1.U(iBinder).zzd();
                byte[] bArr = bVarZzd == null ? null : (byte[]) e.c.b.b.b.d.Y(bVarZzd);
                if (bArr != null) {
                    yVar = new y(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f4654f = yVar;
        this.f4655g = z;
        this.f4656h = z2;
    }

    h0(String str, @Nullable x xVar, boolean z, boolean z2) {
        this.f4653e = str;
        this.f4654f = xVar;
        this.f4655g = z;
        this.f4656h = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 1, this.f4653e, false);
        x xVar = this.f4654f;
        if (xVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            xVar = null;
        }
        com.google.android.gms.common.internal.w.c.l(parcel, 2, xVar, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 3, this.f4655g);
        com.google.android.gms.common.internal.w.c.c(parcel, 4, this.f4656h);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}