package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import e.c.b.b.c.e.uf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class k8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ r f10984e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ String f10985f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ uf f10986g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ y7 f10987h;

    k8(y7 y7Var, r rVar, String str, uf ufVar) {
        this.f10987h = y7Var;
        this.f10984e = rVar;
        this.f10985f = str;
        this.f10986g = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            n3 n3Var = this.f10987h.f11352d;
            if (n3Var == null) {
                this.f10987h.zzq().A().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] bArrM0 = n3Var.m0(this.f10984e, this.f10985f);
            this.f10987h.Z();
            this.f10987h.g().P(this.f10986g, bArrM0);
        } catch (RemoteException e2) {
            this.f10987h.zzq().A().b("Failed to send event to the service to bundle", e2);
        } finally {
            this.f10987h.g().P(this.f10986g, null);
        }
    }
}