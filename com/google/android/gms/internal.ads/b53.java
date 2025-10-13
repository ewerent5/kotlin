package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class b53 {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f5077b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c53 f5078c;

    /* synthetic */ b53(c53 c53Var, byte[] bArr, a53 a53Var) {
        this.f5078c = c53Var;
        this.a = bArr;
    }

    public final synchronized void a() {
        try {
            c53 c53Var = this.f5078c;
            if (c53Var.f5265b) {
                c53Var.a.a3(this.a);
                this.f5078c.a.G2(0);
                this.f5078c.a.o3(this.f5077b);
                this.f5078c.a.y2(null);
                this.f5078c.a.zzf();
            }
        } catch (RemoteException e2) {
            er.zze("Clearcut log failed", e2);
        }
    }

    public final b53 b(int i2) {
        this.f5077b = i2;
        return this;
    }
}