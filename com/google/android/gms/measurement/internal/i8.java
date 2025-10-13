package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class i8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f10953e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ka f10954f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ y7 f10955g;

    i8(y7 y7Var, Bundle bundle, ka kaVar) {
        this.f10955g = y7Var;
        this.f10953e = bundle;
        this.f10954f = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n3 n3Var = this.f10955g.f11352d;
        if (n3Var == null) {
            this.f10955g.zzq().A().a("Failed to send default event parameters to service");
            return;
        }
        try {
            n3Var.P3(this.f10953e, this.f10954f);
        } catch (RemoteException e2) {
            this.f10955g.zzq().A().b("Failed to send default event parameters to service", e2);
        }
    }
}