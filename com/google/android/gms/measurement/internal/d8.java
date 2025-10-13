package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import e.c.b.b.c.e.ec;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class d8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10817e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ka f10818f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ y7 f10819g;

    d8(y7 y7Var, AtomicReference atomicReference, ka kaVar) {
        this.f10819g = y7Var;
        this.f10817e = atomicReference;
        this.f10818f = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10817e) {
            try {
                try {
                } catch (RemoteException e2) {
                    this.f10819g.zzq().A().b("Failed to get app instance id", e2);
                }
                if (ec.a() && this.f10819g.i().o(t.J0) && !this.f10819g.h().H().q()) {
                    this.f10819g.zzq().F().a("Analytics storage consent denied; will not get app instance id");
                    this.f10819g.k().N(null);
                    this.f10819g.h().f10933m.b(null);
                    this.f10817e.set(null);
                    return;
                }
                n3 n3Var = this.f10819g.f11352d;
                if (n3Var == null) {
                    this.f10819g.zzq().A().a("Failed to get app instance id");
                    return;
                }
                this.f10817e.set(n3Var.h1(this.f10818f));
                String str = (String) this.f10817e.get();
                if (str != null) {
                    this.f10819g.k().N(str);
                    this.f10819g.h().f10933m.b(str);
                }
                this.f10819g.Z();
                this.f10817e.notify();
            } finally {
                this.f10817e.notify();
            }
        }
    }
}