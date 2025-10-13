package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class a8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f10752e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f10753f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f10754g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ ka f10755h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ uf f10756i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ y7 f10757j;

    a8(y7 y7Var, String str, String str2, boolean z, ka kaVar, uf ufVar) {
        this.f10757j = y7Var;
        this.f10752e = str;
        this.f10753f = str2;
        this.f10754g = z;
        this.f10755h = kaVar;
        this.f10756i = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            n3 n3Var = this.f10757j.f11352d;
            if (n3Var == null) {
                this.f10757j.zzq().A().c("Failed to get user properties; not connected to service", this.f10752e, this.f10753f);
                return;
            }
            Bundle bundleZ = da.z(n3Var.n2(this.f10752e, this.f10753f, this.f10754g, this.f10755h));
            this.f10757j.Z();
            this.f10757j.g().L(this.f10756i, bundleZ);
        } catch (RemoteException e2) {
            this.f10757j.zzq().A().c("Failed to get user properties; remote exception", this.f10752e, e2);
        } finally {
            this.f10757j.g().L(this.f10756i, bundle);
        }
    }
}