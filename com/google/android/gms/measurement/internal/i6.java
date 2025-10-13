package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import e.c.b.b.c.e.dd;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.gb;
import e.c.b.b.c.e.qd;
import e.c.b.b.c.e.rc;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class i6 extends f5 {

    /* renamed from: c */
    protected e7 f10937c;

    /* renamed from: d */
    private c6 f10938d;

    /* renamed from: e */
    private final Set<f6> f10939e;

    /* renamed from: f */
    private boolean f10940f;

    /* renamed from: g */
    private final AtomicReference<String> f10941g;

    /* renamed from: h */
    private final Object f10942h;

    /* renamed from: i */
    private d f10943i;

    /* renamed from: j */
    private int f10944j;

    /* renamed from: k */
    private final AtomicLong f10945k;

    /* renamed from: l */
    private long f10946l;

    /* renamed from: m */
    private int f10947m;
    final la n;
    private boolean o;
    private final ga p;

    protected i6(z4 z4Var) {
        super(z4Var);
        this.f10939e = new CopyOnWriteArraySet();
        this.f10942h = new Object();
        this.o = true;
        this.p = new w6(this);
        this.f10941g = new AtomicReference<>();
        this.f10943i = new d(null, null);
        this.f10944j = 100;
        this.f10946l = -1L;
        this.f10947m = 100;
        this.f10945k = new AtomicLong(0L);
        this.n = new la(z4Var);
    }

    public final void E(d dVar, int i2, long j2, boolean z, boolean z2) {
        d();
        r();
        if (j2 <= this.f10946l && d.g(this.f10947m, i2)) {
            zzq().G().b("Dropped out-of-date consent setting, proposed settings", dVar);
            return;
        }
        if (!h().u(dVar, i2)) {
            zzq().G().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        this.f10946l = j2;
        this.f10947m = i2;
        m().P(z);
        if (z2) {
            m().M(new AtomicReference<>());
        }
    }

    public final void M(Boolean bool, boolean z) {
        d();
        r();
        zzq().H().b("Setting app measurement enabled (FE)", bool);
        h().q(bool);
        if (ec.a() && i().o(t.J0) && z) {
            h().v(bool);
        }
        if (ec.a() && i().o(t.J0) && !this.a.m() && bool.booleanValue()) {
            return;
        }
        i0();
    }

    private final void Q(String str, String str2, long j2, Object obj) {
        zzp().u(new p6(this, str, str2, obj, j2));
    }

    public final void i0() {
        d();
        String strA = h().t.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                U("app", "_npa", null, zzl().a());
            } else {
                U("app", "_npa", Long.valueOf("true".equals(strA) ? 1L : 0L), zzl().a());
            }
        }
        if (!this.a.k() || !this.o) {
            zzq().H().a("Updating Scion state (FE)");
            m().R();
            return;
        }
        zzq().H().a("Recording app launch after enabling measurement for the first time (FE)");
        e0();
        if (dd.a() && i().o(t.r0)) {
            p().f10845d.a();
        }
        if (rc.a() && i().o(t.u0)) {
            if (!(this.a.y().a.s().f10932l.a() > 0)) {
                r4 r4VarY = this.a.y();
                r4VarY.b(r4VarY.a.zzm().getPackageName());
            }
        }
        if (i().o(t.F0)) {
            zzp().u(new l6(this));
        }
    }

    private final void m0(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzp().u(new q6(this, str, str2, j2, da.n0(bundle), z, z2, z3, str3));
    }

    public final void o0(Bundle bundle) {
        d();
        r();
        com.google.android.gms.common.internal.p.j(bundle);
        com.google.android.gms.common.internal.p.f(bundle.getString(Action.NAME_ATTRIBUTE));
        com.google.android.gms.common.internal.p.f(bundle.getString("origin"));
        com.google.android.gms.common.internal.p.j(bundle.get("value"));
        if (!this.a.k()) {
            zzq().I().a("Conditional property not set since app measurement is disabled");
            return;
        }
        try {
            m().K(new wa(bundle.getString("app_id"), bundle.getString("origin"), new ca(bundle.getString(Action.NAME_ATTRIBUTE), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin")), bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), g().A(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L, true, false, gb.a() && i().o(t.N0)), bundle.getLong("trigger_timeout"), g().A(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L, true, false, gb.a() && i().o(t.N0)), bundle.getLong("time_to_live"), g().A(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L, true, false, gb.a() && i().o(t.N0))));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void q0(Bundle bundle) {
        d();
        r();
        com.google.android.gms.common.internal.p.j(bundle);
        com.google.android.gms.common.internal.p.f(bundle.getString(Action.NAME_ATTRIBUTE));
        if (!this.a.k()) {
            zzq().I().a("Conditional property not cleared since app measurement is disabled");
        } else {
            try {
                m().K(new wa(bundle.getString("app_id"), bundle.getString("origin"), new ca(bundle.getString(Action.NAME_ATTRIBUTE), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), g().A(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false, gb.a() && i().o(t.N0))));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void A(Bundle bundle, int i2, long j2) {
        if (ec.a() && i().o(t.J0)) {
            r();
            String strF = d.f(bundle);
            if (strF != null) {
                zzq().F().b("Ignoring invalid consent setting", strF);
                zzq().F().a("Valid consent values are 'granted', 'denied'");
            }
            D(d.j(bundle), i2, j2);
        }
    }

    public final void B(Bundle bundle, long j2) {
        com.google.android.gms.common.internal.p.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzq().D().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.p.j(bundle2);
        y5.a(bundle2, "app_id", String.class, null);
        y5.a(bundle2, "origin", String.class, null);
        y5.a(bundle2, Action.NAME_ATTRIBUTE, String.class, null);
        y5.a(bundle2, "value", Object.class, null);
        y5.a(bundle2, "trigger_event_name", String.class, null);
        y5.a(bundle2, "trigger_timeout", Long.class, 0L);
        y5.a(bundle2, "timed_out_event_name", String.class, null);
        y5.a(bundle2, "timed_out_event_params", Bundle.class, null);
        y5.a(bundle2, "triggered_event_name", String.class, null);
        y5.a(bundle2, "triggered_event_params", Bundle.class, null);
        y5.a(bundle2, "time_to_live", Long.class, 0L);
        y5.a(bundle2, "expired_event_name", String.class, null);
        y5.a(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.p.f(bundle2.getString(Action.NAME_ATTRIBUTE));
        com.google.android.gms.common.internal.p.f(bundle2.getString("origin"));
        com.google.android.gms.common.internal.p.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString(Action.NAME_ATTRIBUTE);
        Object obj = bundle2.get("value");
        if (g().l0(string) != 0) {
            zzq().A().b("Invalid conditional user property name", f().v(string));
            return;
        }
        if (g().m0(string, obj) != 0) {
            zzq().A().c("Invalid conditional user property value", f().v(string), obj);
            return;
        }
        Object objT0 = g().t0(string, obj);
        if (objT0 == null) {
            zzq().A().c("Unable to normalize conditional user property value", f().v(string), obj);
            return;
        }
        y5.b(bundle2, objT0);
        long j3 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j3 > 15552000000L || j3 < 1)) {
            zzq().A().c("Invalid conditional user property timeout", f().v(string), Long.valueOf(j3));
            return;
        }
        long j4 = bundle2.getLong("time_to_live");
        if (j4 > 15552000000L || j4 < 1) {
            zzq().A().c("Invalid conditional user property time to live", f().v(string), Long.valueOf(j4));
        } else {
            zzp().u(new t6(this, bundle2));
        }
    }

    final void C(d dVar) {
        d();
        boolean z = (dVar.q() && dVar.o()) || m().Y();
        if (z != this.a.m()) {
            this.a.v(z);
            Boolean boolF = h().F();
            if (!z || boolF == null || boolF.booleanValue()) {
                M(Boolean.valueOf(z), false);
            }
        }
    }

    public final void D(d dVar, int i2, long j2) {
        boolean z;
        d dVar2;
        boolean z2;
        boolean zH;
        if (ec.a() && i().o(t.J0)) {
            r();
            if (!(i().o(t.K0) && i2 == 20) && dVar.l() == null && dVar.p() == null) {
                zzq().F().a("Discarding empty consent settings");
                return;
            }
            synchronized (this.f10942h) {
                z = false;
                if (d.g(i2, this.f10944j)) {
                    zH = dVar.h(this.f10943i);
                    if (dVar.q() && !this.f10943i.q()) {
                        z = true;
                    }
                    d dVarN = dVar.n(this.f10943i);
                    this.f10943i = dVarN;
                    this.f10944j = i2;
                    dVar2 = dVarN;
                    z2 = z;
                    z = true;
                } else {
                    dVar2 = dVar;
                    z2 = false;
                    zH = false;
                }
            }
            if (!z) {
                zzq().G().b("Ignoring lower-priority consent settings, proposed settings", dVar2);
                return;
            }
            long andIncrement = this.f10945k.getAndIncrement();
            if (zH) {
                N(null);
                zzp().x(new d7(this, dVar2, j2, i2, andIncrement, z2));
            } else if (i().o(t.K0) && (i2 == 40 || i2 == 20)) {
                zzp().x(new c7(this, dVar2, i2, andIncrement, z2));
            } else {
                zzp().u(new f7(this, dVar2, i2, andIncrement, z2));
            }
        }
    }

    public final void F(c6 c6Var) {
        c6 c6Var2;
        d();
        r();
        if (c6Var != null && c6Var != (c6Var2 = this.f10938d)) {
            com.google.android.gms.common.internal.p.n(c6Var2 == null, "EventInterceptor already set.");
        }
        this.f10938d = c6Var;
    }

    public final void G(f6 f6Var) {
        r();
        com.google.android.gms.common.internal.p.j(f6Var);
        if (this.f10939e.add(f6Var)) {
            return;
        }
        zzq().D().a("OnEventListener already registered");
    }

    public final void L(Boolean bool) {
        r();
        zzp().u(new a7(this, bool));
    }

    final void N(String str) {
        this.f10941g.set(str);
    }

    final void O(String str, String str2, long j2, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d();
        P(str, str2, j2, bundle, true, this.f10938d == null || da.x0(str2), false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:258:0x0146, code lost:
    
        r6 = 13;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void P(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.P(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void R(String str, String str2, Bundle bundle) {
        T(str, str2, bundle, true, true, zzl().a());
    }

    public final void S(String str, String str2, Bundle bundle, String str3) {
        b();
        m0(str, str2, zzl().a(), bundle, false, true, false, str3);
    }

    public final void T(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (i().o(t.w0) && da.w0(str2, "screen_view")) {
            n().E(bundle2, j2);
            return;
        }
        m0(str3, str2, j2, bundle2, z2, !z2 || this.f10938d == null || da.x0(str2), !z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void U(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.p.f(r9)
            com.google.android.gms.common.internal.p.f(r10)
            r8.d()
            r8.r()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.i4 r0 = r8.h()
            com.google.android.gms.measurement.internal.o4 r0 = r0.t
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
            goto L5e
        L50:
            if (r11 != 0) goto L60
            com.google.android.gms.measurement.internal.i4 r10 = r8.h()
            com.google.android.gms.measurement.internal.o4 r10 = r10.t
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L5e:
            r3 = r1
            goto L62
        L60:
            r3 = r10
            r6 = r11
        L62:
            com.google.android.gms.measurement.internal.z4 r10 = r8.a
            boolean r10 = r10.k()
            if (r10 != 0) goto L78
            com.google.android.gms.measurement.internal.v3 r9 = r8.zzq()
            com.google.android.gms.measurement.internal.x3 r9 = r9.I()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            com.google.android.gms.measurement.internal.z4 r10 = r8.a
            boolean r10 = r10.p()
            if (r10 != 0) goto L81
            return
        L81:
            com.google.android.gms.measurement.internal.ca r10 = new com.google.android.gms.measurement.internal.ca
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.y7 r9 = r8.m()
            r9.J(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.U(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void V(String str, String str2, Object obj, boolean z) {
        W(str, str2, obj, true, zzl().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W(java.lang.String r10, java.lang.String r11, java.lang.Object r12, boolean r13, long r14) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            java.lang.String r10 = "app"
        L4:
            r1 = r10
            r10 = 6
            r0 = 0
            r2 = 24
            if (r13 == 0) goto L15
            com.google.android.gms.measurement.internal.da r10 = r9.g()
            int r10 = r10.l0(r11)
            r5 = r10
            goto L38
        L15:
            com.google.android.gms.measurement.internal.da r13 = r9.g()
            java.lang.String r3 = "user property"
            boolean r4 = r13.c0(r3, r11)
            if (r4 != 0) goto L23
        L21:
            r5 = 6
            goto L38
        L23:
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.d6.a
            boolean r4 = r13.h0(r3, r4, r11)
            if (r4 != 0) goto L30
            r10 = 15
            r5 = 15
            goto L38
        L30:
            boolean r13 = r13.b0(r3, r2, r11)
            if (r13 != 0) goto L37
            goto L21
        L37:
            r5 = 0
        L38:
            r10 = 1
            if (r5 == 0) goto L59
            r9.g()
            java.lang.String r7 = com.google.android.gms.measurement.internal.da.D(r11, r2, r10)
            if (r11 == 0) goto L4a
            int r0 = r11.length()
            r8 = r0
            goto L4b
        L4a:
            r8 = 0
        L4b:
            com.google.android.gms.measurement.internal.z4 r10 = r9.a
            com.google.android.gms.measurement.internal.da r3 = r10.B()
            com.google.android.gms.measurement.internal.ga r4 = r9.p
            java.lang.String r6 = "_ev"
            r3.R(r4, r5, r6, r7, r8)
            return
        L59:
            if (r12 == 0) goto L9f
            com.google.android.gms.measurement.internal.da r13 = r9.g()
            int r5 = r13.m0(r11, r12)
            if (r5 == 0) goto L8e
            r9.g()
            java.lang.String r7 = com.google.android.gms.measurement.internal.da.D(r11, r2, r10)
            boolean r10 = r12 instanceof java.lang.String
            if (r10 != 0) goto L77
            boolean r10 = r12 instanceof java.lang.CharSequence
            if (r10 == 0) goto L75
            goto L77
        L75:
            r8 = 0
            goto L80
        L77:
            java.lang.String r10 = java.lang.String.valueOf(r12)
            int r0 = r10.length()
            r8 = r0
        L80:
            com.google.android.gms.measurement.internal.z4 r10 = r9.a
            com.google.android.gms.measurement.internal.da r3 = r10.B()
            com.google.android.gms.measurement.internal.ga r4 = r9.p
            java.lang.String r6 = "_ev"
            r3.R(r4, r5, r6, r7, r8)
            return
        L8e:
            com.google.android.gms.measurement.internal.da r10 = r9.g()
            java.lang.Object r5 = r10.t0(r11, r12)
            if (r5 == 0) goto L9e
            r0 = r9
            r2 = r11
            r3 = r14
            r0.Q(r1, r2, r3, r5)
        L9e:
            return
        L9f:
            r5 = 0
            r0 = r9
            r2 = r11
            r3 = r14
            r0.Q(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.W(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void X() {
        if (zzm().getApplicationContext() instanceof Application) {
            ((Application) zzm().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10937c);
        }
    }

    public final Boolean Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzp().q(atomicReference, 15000L, "boolean test flag value", new j6(this, atomicReference));
    }

    public final String Z() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzp().q(atomicReference, 15000L, "String test flag value", new s6(this, atomicReference));
    }

    public final Long a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzp().q(atomicReference, 15000L, "long test flag value", new z6(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final Integer b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzp().q(atomicReference, 15000L, "int test flag value", new y6(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final Double c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzp().q(atomicReference, 15000L, "double test flag value", new b7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public final String d0() {
        return this.f10941g.get();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    public final void e0() {
        d();
        r();
        if (this.a.p()) {
            if (i().o(t.e0)) {
                Boolean boolZ = i().z("google_analytics_deferred_deep_link_enabled");
                if (boolZ != null && boolZ.booleanValue()) {
                    zzq().H().a("Deferred Deep Link feature enabled.");
                    zzp().u(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.k6

                        /* renamed from: e, reason: collision with root package name */
                        private final i6 f10982e;

                        {
                            this.f10982e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            i6 i6Var = this.f10982e;
                            i6Var.d();
                            if (i6Var.h().y.b()) {
                                i6Var.zzq().H().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = i6Var.h().z.a();
                            i6Var.h().z.b(1 + jA);
                            if (jA < 5) {
                                i6Var.a.q();
                            } else {
                                i6Var.zzq().D().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                i6Var.h().y.a(true);
                            }
                        }
                    });
                }
            }
            m().T();
            this.o = false;
            String strI = h().I();
            if (TextUtils.isEmpty(strI)) {
                return;
            }
            e().l();
            if (strI.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strI);
            R("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    public final String f0() {
        q7 q7VarN = this.a.J().N();
        if (q7VarN != null) {
            return q7VarN.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    public final String g0() {
        q7 q7VarN = this.a.J().N();
        if (q7VarN != null) {
            return q7VarN.f11151b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    public final String h0() {
        if (this.a.F() != null) {
            return this.a.F();
        }
        try {
            return n7.b(zzm(), "google_app_id");
        } catch (IllegalStateException e2) {
            this.a.zzq().A().b("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a j() {
        return super.j();
    }

    final /* synthetic */ void j0(Bundle bundle) {
        if (qd.a() && i().o(t.B0)) {
            if (bundle == null) {
                h().D.b(new Bundle());
                return;
            }
            Bundle bundleA = h().D.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    g();
                    if (da.Y(obj)) {
                        g().R(this.p, 27, null, null, 0);
                    }
                    zzq().F().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (da.x0(str)) {
                    zzq().F().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleA.remove(str);
                } else if (g().d0("param", str, 100, obj)) {
                    g().I(bundleA, str, obj);
                }
            }
            g();
            if (da.W(bundleA, i().t())) {
                g().R(this.p, 26, null, null, 0);
                zzq().F().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            h().D.b(bundleA);
            m().z(bundleA);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ i6 k() {
        return super.k();
    }

    public final void k0(f6 f6Var) {
        r();
        com.google.android.gms.common.internal.p.j(f6Var);
        if (this.f10939e.remove(f6Var)) {
            return;
        }
        zzq().D().a("OnEventListener had not been registered");
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

    final void n0(String str, String str2, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d();
        O(str, str2, zzl().a(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ r3 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 p() {
        return super.p();
    }

    public final void p0(String str, String str2, Bundle bundle) {
        long jA = zzl().a();
        com.google.android.gms.common.internal.p.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Action.NAME_ATTRIBUTE, str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzp().u(new v6(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean u() {
        return false;
    }

    public final ArrayList<Bundle> w(String str, String str2) {
        if (zzp().D()) {
            zzq().A().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (ta.a()) {
            zzq().A().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.zzp().q(atomicReference, 5000L, "get conditional user properties", new u6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return da.o0(list);
        }
        zzq().A().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> x(String str, String str2, boolean z) {
        if (zzp().D()) {
            zzq().A().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (ta.a()) {
            zzq().A().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.zzp().q(atomicReference, 5000L, "get user properties", new x6(this, atomicReference, null, str, str2, z));
        List<ca> list = (List) atomicReference.get();
        if (list == null) {
            zzq().A().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        c.e.a aVar = new c.e.a(list.size());
        for (ca caVar : list) {
            aVar.put(caVar.f10792f, caVar.c());
        }
        return aVar;
    }

    final void y(long j2, boolean z) {
        d();
        r();
        zzq().H().a("Resetting analytics data (FE)");
        e9 e9VarP = p();
        e9VarP.d();
        e9VarP.f10846e.a();
        boolean zK = this.a.k();
        i4 i4VarH = h();
        i4VarH.f10931k.b(j2);
        if (!TextUtils.isEmpty(i4VarH.h().A.a())) {
            i4VarH.A.b(null);
        }
        if (dd.a() && i4VarH.i().o(t.r0)) {
            i4VarH.v.b(0L);
        }
        if (!i4VarH.i().A()) {
            i4VarH.x(!zK);
        }
        i4VarH.B.b(null);
        i4VarH.C.b(0L);
        i4VarH.D.b(null);
        if (z) {
            m().S();
        }
        if (dd.a() && i().o(t.r0)) {
            p().f10845d.a();
        }
        this.o = !zK;
    }

    public final void z(Bundle bundle) {
        B(bundle, zzl().a());
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