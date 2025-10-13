package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import e.c.b.b.c.e.uf;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class q8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f11156e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f11157f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ ka f11158g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ uf f11159h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ y7 f11160i;

    q8(y7 y7Var, String str, String str2, ka kaVar, uf ufVar) {
        this.f11160i = y7Var;
        this.f11156e = str;
        this.f11157f = str2;
        this.f11158g = kaVar;
        this.f11159h = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            n3 n3Var = this.f11160i.f11352d;
            if (n3Var == null) {
                this.f11160i.zzq().A().c("Failed to get conditional properties; not connected to service", this.f11156e, this.f11157f);
                return;
            }
            ArrayList<Bundle> arrayListO0 = da.o0(n3Var.T1(this.f11156e, this.f11157f, this.f11158g));
            this.f11160i.Z();
            this.f11160i.g().N(this.f11159h, arrayListO0);
        } catch (RemoteException e2) {
            this.f11160i.zzq().A().d("Failed to get conditional properties; remote exception", this.f11156e, this.f11157f, e2);
        } finally {
            this.f11160i.g().N(this.f11159h, arrayList);
        }
    }
}