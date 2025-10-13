package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.uf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class y7 extends f5 {

    /* renamed from: c, reason: collision with root package name */
    private final s8 f11351c;

    /* renamed from: d, reason: collision with root package name */
    private n3 f11352d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f11353e;

    /* renamed from: f, reason: collision with root package name */
    private final j f11354f;

    /* renamed from: g, reason: collision with root package name */
    private final m9 f11355g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Runnable> f11356h;

    /* renamed from: i, reason: collision with root package name */
    private final j f11357i;

    protected y7(z4 z4Var) {
        super(z4Var);
        this.f11356h = new ArrayList();
        this.f11355g = new m9(z4Var.zzl());
        this.f11351c = new s8(this);
        this.f11354f = new x7(this, z4Var);
        this.f11357i = new h8(this, z4Var);
    }

    private final void L(Runnable runnable) {
        d();
        if (Q()) {
            runnable.run();
        } else {
            if (this.f11356h.size() >= 1000) {
                zzq().A().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f11356h.add(runnable);
            this.f11357i.c(ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD);
            U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        d();
        this.f11355g.a();
        this.f11354f.c(t.K.a(null).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a0() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y7.a0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        d();
        if (Q()) {
            zzq().I().a("Inactivity, disconnecting from the service");
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        d();
        zzq().I().b("Processing queued up service tasks", Integer.valueOf(this.f11356h.size()));
        Iterator<Runnable> it = this.f11356h.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e2) {
                zzq().A().b("Task exception while flushing queue", e2);
            }
        }
        this.f11356h.clear();
        this.f11357i.e();
    }

    private final ka d0(boolean z) {
        return l().w(z ? zzq().J() : null);
    }

    static /* synthetic */ n3 w(y7 y7Var, n3 n3Var) {
        y7Var.f11352d = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ComponentName componentName) {
        d();
        if (this.f11352d != null) {
            this.f11352d = null;
            zzq().I().b("Disconnected from device MeasurementService", componentName);
            d();
            U();
        }
    }

    public final void A(uf ufVar) {
        d();
        r();
        L(new c8(this, d0(false), ufVar));
    }

    public final void B(uf ufVar, r rVar, String str) {
        d();
        r();
        if (g().p(12451000) == 0) {
            L(new k8(this, rVar, str, ufVar));
        } else {
            zzq().D().a("Not bundling data. Service unavailable or out of date");
            g().P(ufVar, new byte[0]);
        }
    }

    protected final void C(uf ufVar, String str, String str2) {
        d();
        r();
        L(new q8(this, str, str2, d0(false), ufVar));
    }

    protected final void D(uf ufVar, String str, String str2, boolean z) {
        d();
        r();
        L(new a8(this, str, str2, z, d0(false), ufVar));
    }

    protected final void E(r rVar, String str) {
        com.google.android.gms.common.internal.p.j(rVar);
        d();
        r();
        L(new l8(this, true, o().z(rVar), rVar, d0(true), str));
    }

    protected final void F(n3 n3Var) {
        d();
        com.google.android.gms.common.internal.p.j(n3Var);
        this.f11352d = n3Var;
        Z();
        c0();
    }

    final void G(n3 n3Var, com.google.android.gms.common.internal.w.a aVar, ka kaVar) throws Throwable {
        int size;
        d();
        r();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<com.google.android.gms.common.internal.w.a> listX = o().x(100);
            if (listX != null) {
                arrayList.addAll(listX);
                size = listX.size();
            } else {
                size = 0;
            }
            if (aVar != null && size < 100) {
                arrayList.add(aVar);
            }
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj = arrayList.get(i4);
                i4++;
                com.google.android.gms.common.internal.w.a aVar2 = (com.google.android.gms.common.internal.w.a) obj;
                if (aVar2 instanceof r) {
                    try {
                        n3Var.L3((r) aVar2, kaVar);
                    } catch (RemoteException e2) {
                        zzq().A().b("Failed to send event to the service", e2);
                    }
                } else if (aVar2 instanceof ca) {
                    try {
                        n3Var.i4((ca) aVar2, kaVar);
                    } catch (RemoteException e3) {
                        zzq().A().b("Failed to send user property to the service", e3);
                    }
                } else if (aVar2 instanceof wa) {
                    try {
                        n3Var.q4((wa) aVar2, kaVar);
                    } catch (RemoteException e4) {
                        zzq().A().b("Failed to send conditional user property to the service", e4);
                    }
                } else {
                    zzq().A().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = size;
        }
    }

    protected final void H(q7 q7Var) {
        d();
        r();
        L(new e8(this, q7Var));
    }

    protected final void J(ca caVar) {
        d();
        r();
        L(new z7(this, o().A(caVar), caVar, d0(true)));
    }

    protected final void K(wa waVar) {
        com.google.android.gms.common.internal.p.j(waVar);
        d();
        r();
        L(new o8(this, true, o().B(waVar), new wa(waVar), d0(true), waVar));
    }

    public final void M(AtomicReference<String> atomicReference) {
        d();
        r();
        L(new d8(this, atomicReference, d0(false)));
    }

    protected final void N(AtomicReference<List<wa>> atomicReference, String str, String str2, String str3) {
        d();
        r();
        L(new n8(this, atomicReference, str, str2, str3, d0(false)));
    }

    protected final void O(AtomicReference<List<ca>> atomicReference, String str, String str2, String str3, boolean z) {
        d();
        r();
        L(new p8(this, atomicReference, str, str2, str3, z, d0(false)));
    }

    protected final void P(boolean z) {
        if (ec.a() && i().o(t.J0)) {
            d();
            r();
            if (z) {
                o().C();
            }
            if (Y()) {
                L(new m8(this, d0(false)));
            }
        }
    }

    public final boolean Q() {
        d();
        r();
        return this.f11352d != null;
    }

    protected final void R() {
        d();
        r();
        L(new j8(this, d0(true)));
    }

    protected final void S() {
        d();
        r();
        ka kaVarD0 = d0(false);
        o().C();
        L(new b8(this, kaVarD0));
    }

    protected final void T() {
        d();
        r();
        ka kaVarD0 = d0(true);
        o().D();
        L(new f8(this, kaVarD0));
    }

    final void U() {
        d();
        r();
        if (Q()) {
            return;
        }
        if (a0()) {
            this.f11351c.d();
            return;
        }
        if (i().O()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = zzm().getPackageManager().queryIntentServices(new Intent().setClassName(zzm(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (!(listQueryIntentServices != null && listQueryIntentServices.size() > 0)) {
            zzq().A().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(zzm(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f11351c.b(intent);
    }

    final Boolean V() {
        return this.f11353e;
    }

    public final void W() {
        d();
        r();
        this.f11351c.a();
        try {
            com.google.android.gms.common.o.a.b().c(zzm(), this.f11351c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11352d = null;
    }

    final boolean X() {
        d();
        r();
        return !a0() || g().F0() >= 200900;
    }

    final boolean Y() {
        d();
        r();
        if (i().o(t.L0)) {
            return !a0() || g().F0() >= t.M0.a(null).intValue();
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ i6 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ y7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p7 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ r3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean u() {
        return false;
    }

    public final void z(Bundle bundle) {
        d();
        r();
        L(new i8(this, bundle, d0(false)));
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}