package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tz1 {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f9312b;

    /* renamed from: c, reason: collision with root package name */
    private int f9313c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ vz1 f9314d;

    /* synthetic */ tz1(vz1 vz1Var, byte[] bArr, sz1 sz1Var) {
        this.f9314d = vz1Var;
        this.a = bArr;
    }

    public final synchronized void a() {
        try {
            vz1 vz1Var = this.f9314d;
            if (vz1Var.a) {
                vz1Var.f9821b.U(this.a);
                this.f9314d.f9821b.Z(this.f9312b);
                this.f9314d.f9821b.G2(this.f9313c);
                this.f9314d.f9821b.R(null);
                this.f9314d.f9821b.zze();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }

    public final tz1 b(int i2) {
        this.f9312b = i2;
        return this;
    }

    public final tz1 c(int i2) {
        this.f9313c = i2;
        return this;
    }
}