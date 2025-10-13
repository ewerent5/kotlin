package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class o8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f11088e = true;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f11089f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ wa f11090g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ ka f11091h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ wa f11092i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ y7 f11093j;

    o8(y7 y7Var, boolean z, boolean z2, wa waVar, ka kaVar, wa waVar2) {
        this.f11093j = y7Var;
        this.f11089f = z2;
        this.f11090g = waVar;
        this.f11091h = kaVar;
        this.f11092i = waVar2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        n3 n3Var = this.f11093j.f11352d;
        if (n3Var == null) {
            this.f11093j.zzq().A().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f11088e) {
            this.f11093j.G(n3Var, this.f11089f ? null : this.f11090g, this.f11091h);
        } else {
            try {
                if (TextUtils.isEmpty(this.f11092i.f11318e)) {
                    n3Var.q4(this.f11090g, this.f11091h);
                } else {
                    n3Var.e2(this.f11090g);
                }
            } catch (RemoteException e2) {
                this.f11093j.zzq().A().b("Failed to send conditional user property to the service", e2);
            }
        }
        this.f11093j.Z();
    }
}