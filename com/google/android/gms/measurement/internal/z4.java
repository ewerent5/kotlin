package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.lc;
import e.c.b.b.c.e.qd;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public class z4 implements z5 {
    private static volatile z4 a;
    private long A;
    private volatile Boolean B;
    private Boolean C;
    private Boolean D;
    private volatile boolean E;
    private int F;
    final long H;

    /* renamed from: b, reason: collision with root package name */
    private final Context f11367b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11368c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11369d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11370e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11371f;

    /* renamed from: g, reason: collision with root package name */
    private final ta f11372g;

    /* renamed from: h, reason: collision with root package name */
    private final c f11373h;

    /* renamed from: i, reason: collision with root package name */
    private final i4 f11374i;

    /* renamed from: j, reason: collision with root package name */
    private final v3 f11375j;

    /* renamed from: k, reason: collision with root package name */
    private final w4 f11376k;

    /* renamed from: l, reason: collision with root package name */
    private final e9 f11377l;

    /* renamed from: m, reason: collision with root package name */
    private final da f11378m;
    private final t3 n;
    private final com.google.android.gms.common.util.f o;
    private final p7 p;
    private final i6 q;
    private final a r;
    private final k7 s;
    private r3 t;
    private y7 u;
    private l v;
    private s3 w;
    private r4 x;
    private Boolean z;
    private boolean y = false;
    private AtomicInteger G = new AtomicInteger(0);

    private z4(e6 e6Var) {
        Bundle bundle;
        boolean z = false;
        com.google.android.gms.common.internal.p.j(e6Var);
        ta taVar = new ta(e6Var.a);
        this.f11372g = taVar;
        l3.a = taVar;
        Context context = e6Var.a;
        this.f11367b = context;
        this.f11368c = e6Var.f10833b;
        this.f11369d = e6Var.f10834c;
        this.f11370e = e6Var.f10835d;
        this.f11371f = e6Var.f10839h;
        this.B = e6Var.f10836e;
        this.E = true;
        e.c.b.b.c.e.f fVar = e6Var.f10838g;
        if (fVar != null && (bundle = fVar.f14503k) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.C = (Boolean) obj;
            }
            Object obj2 = fVar.f14503k.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.D = (Boolean) obj2;
            }
        }
        e.c.b.b.c.e.w2.h(context);
        com.google.android.gms.common.util.f fVarD = com.google.android.gms.common.util.i.d();
        this.o = fVarD;
        Long l2 = e6Var.f10840i;
        this.H = l2 != null ? l2.longValue() : fVarD.a();
        this.f11373h = new c(this);
        i4 i4Var = new i4(this);
        i4Var.m();
        this.f11374i = i4Var;
        v3 v3Var = new v3(this);
        v3Var.m();
        this.f11375j = v3Var;
        da daVar = new da(this);
        daVar.m();
        this.f11378m = daVar;
        t3 t3Var = new t3(this);
        t3Var.m();
        this.n = t3Var;
        this.r = new a(this);
        p7 p7Var = new p7(this);
        p7Var.s();
        this.p = p7Var;
        i6 i6Var = new i6(this);
        i6Var.s();
        this.q = i6Var;
        e9 e9Var = new e9(this);
        e9Var.s();
        this.f11377l = e9Var;
        k7 k7Var = new k7(this);
        k7Var.m();
        this.s = k7Var;
        w4 w4Var = new w4(this);
        w4Var.m();
        this.f11376k = w4Var;
        e.c.b.b.c.e.f fVar2 = e6Var.f10838g;
        if (fVar2 != null && fVar2.f14498f != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            i6 i6VarA = A();
            if (i6VarA.zzm().getApplicationContext() instanceof Application) {
                Application application = (Application) i6VarA.zzm().getApplicationContext();
                if (i6VarA.f10937c == null) {
                    i6VarA.f10937c = new e7(i6VarA, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(i6VarA.f10937c);
                    application.registerActivityLifecycleCallbacks(i6VarA.f10937c);
                    i6VarA.zzq().I().a("Registered activity lifecycle callback");
                }
            }
        } else {
            zzq().D().a("Application context is not an Application");
        }
        w4Var.u(new b5(this, e6Var));
    }

    public static z4 b(Context context, e.c.b.b.c.e.f fVar, Long l2) {
        Bundle bundle;
        if (fVar != null && (fVar.f14501i == null || fVar.f14502j == null)) {
            fVar = new e.c.b.b.c.e.f(fVar.f14497e, fVar.f14498f, fVar.f14499g, fVar.f14500h, null, null, fVar.f14503k);
        }
        com.google.android.gms.common.internal.p.j(context);
        com.google.android.gms.common.internal.p.j(context.getApplicationContext());
        if (a == null) {
            synchronized (z4.class) {
                if (a == null) {
                    a = new z4(new e6(context, fVar, l2));
                }
            }
        } else if (fVar != null && (bundle = fVar.f14503k) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            a.j(fVar.f14503k.getBoolean("dataCollectionDefaultEnabled"));
        }
        return a;
    }

    private static void g(x5 x5Var) {
        if (x5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(e6 e6Var) {
        String strConcat;
        x3 x3VarG;
        zzp().d();
        l lVar = new l(this);
        lVar.m();
        this.v = lVar;
        s3 s3Var = new s3(this, e6Var.f10837f);
        s3Var.s();
        this.w = s3Var;
        r3 r3Var = new r3(this);
        r3Var.s();
        this.t = r3Var;
        y7 y7Var = new y7(this);
        y7Var.s();
        this.u = y7Var;
        this.f11378m.n();
        this.f11374i.n();
        this.x = new r4(this);
        this.w.t();
        zzq().G().b("App measurement initialized, version", 33025L);
        zzq().G().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strX = s3Var.x();
        if (TextUtils.isEmpty(this.f11368c)) {
            if (B().y0(strX)) {
                x3VarG = zzq().G();
                strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                x3 x3VarG2 = zzq().G();
                String strValueOf = String.valueOf(strX);
                strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                x3VarG = x3VarG2;
            }
            x3VarG.a(strConcat);
        }
        zzq().H().a("Debug-level message logging enabled");
        if (this.F != this.G.get()) {
            zzq().A().c("Not all components initialized", Integer.valueOf(this.F), Integer.valueOf(this.G.get()));
        }
        this.y = true;
    }

    private final k7 r() {
        u(this.s);
        return this.s;
    }

    private static void t(f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (f5Var.q()) {
            return;
        }
        String strValueOf = String.valueOf(f5Var.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void u(w5 w5Var) {
        if (w5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (w5Var.k()) {
            return;
        }
        String strValueOf = String.valueOf(w5Var.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final i6 A() {
        t(this.q);
        return this.q;
    }

    public final da B() {
        g(this.f11378m);
        return this.f11378m;
    }

    public final t3 C() {
        g(this.n);
        return this.n;
    }

    public final r3 D() {
        t(this.t);
        return this.t;
    }

    public final boolean E() {
        return TextUtils.isEmpty(this.f11368c);
    }

    public final String F() {
        return this.f11368c;
    }

    public final String G() {
        return this.f11369d;
    }

    public final String H() {
        return this.f11370e;
    }

    public final boolean I() {
        return this.f11371f;
    }

    public final p7 J() {
        t(this.p);
        return this.p;
    }

    public final y7 K() {
        t(this.u);
        return this.u;
    }

    public final l L() {
        u(this.v);
        return this.v;
    }

    public final s3 M() {
        t(this.w);
        return this.w;
    }

    public final a N() {
        a aVar = this.r;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean O() {
        return this.B != null && this.B.booleanValue();
    }

    public final c a() {
        return this.f11373h;
    }

    protected final void c(e.c.b.b.c.e.f fVar) {
        d dVarJ;
        zzp().d();
        if (ec.a() && this.f11373h.o(t.J0)) {
            d dVarH = s().H();
            int iG = s().G();
            int i2 = 40;
            if (this.f11373h.o(t.K0)) {
                Boolean boolF = this.f11373h.F();
                Boolean boolH = this.f11373h.H();
                if (!(boolF == null && boolH == null) && s().s(20)) {
                    dVarJ = new d(boolF, boolH);
                    i2 = 20;
                } else {
                    if (!TextUtils.isEmpty(M().y()) && (iG == 30 || iG == 40)) {
                        A().D(d.a, 20, this.H);
                    } else if (fVar != null && fVar.f14503k != null && s().s(40)) {
                        dVarJ = d.j(fVar.f14503k);
                        if (dVarJ.equals(d.a)) {
                        }
                    }
                    dVarJ = null;
                    i2 = 0;
                }
                if (dVarJ != null) {
                    A().D(dVarJ, i2, this.H);
                    dVarH = dVarJ;
                }
                A().C(dVarH);
            } else {
                if (fVar != null && fVar.f14503k != null && s().s(40)) {
                    dVarJ = d.j(fVar.f14503k);
                    if (!dVarJ.equals(d.a)) {
                        A().D(dVarJ, 40, this.H);
                        dVarH = dVarJ;
                    }
                }
                A().C(dVarH);
            }
        }
        if (s().f10926f.a() == 0) {
            s().f10926f.b(this.o.a());
        }
        if (Long.valueOf(s().f10931k.a()).longValue() == 0) {
            zzq().I().b("Persisting first open", Long.valueOf(this.H));
            s().f10931k.b(this.H);
        }
        if (this.f11373h.o(t.F0)) {
            A().n.c();
        }
        if (p()) {
            if (!TextUtils.isEmpty(M().y()) || !TextUtils.isEmpty(M().z())) {
                B();
                if (da.f0(M().y(), s().A(), M().z(), s().B())) {
                    zzq().G().a("Rechecking which service to use due to a GMP App Id change");
                    s().D();
                    D().C();
                    this.u.W();
                    this.u.U();
                    s().f10931k.b(this.H);
                    s().f10933m.b(null);
                }
                s().w(M().y());
                s().y(M().z());
            }
            if (ec.a() && this.f11373h.o(t.J0) && !s().H().q()) {
                s().f10933m.b(null);
            }
            A().N(s().f10933m.a());
            if (lc.a() && this.f11373h.o(t.q0) && !B().I0() && !TextUtils.isEmpty(s().A.a())) {
                zzq().D().a("Remote config removed with active feature rollouts");
                s().A.b(null);
            }
            if (!TextUtils.isEmpty(M().y()) || !TextUtils.isEmpty(M().z())) {
                boolean zK = k();
                if (!s().J() && !this.f11373h.A()) {
                    s().x(!zK);
                }
                if (zK) {
                    A().e0();
                }
                x().f10845d.a();
                K().M(new AtomicReference<>());
                if (qd.a() && this.f11373h.o(t.B0)) {
                    K().z(s().D.a());
                }
            }
        } else if (k()) {
            if (!B().v0("android.permission.INTERNET")) {
                zzq().A().a("App is missing INTERNET permission");
            }
            if (!B().v0("android.permission.ACCESS_NETWORK_STATE")) {
                zzq().A().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!com.google.android.gms.common.p.c.a(this.f11367b).g() && !this.f11373h.O()) {
                if (!s4.b(this.f11367b)) {
                    zzq().A().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!da.U(this.f11367b, false)) {
                    zzq().A().a("AppMeasurementService not registered/enabled");
                }
            }
            zzq().A().a("Uploading is not possible. App measurement disabled");
        }
        s().u.a(this.f11373h.o(t.Z));
    }

    final void e(f5 f5Var) {
        this.F++;
    }

    final void f(w5 w5Var) {
        this.F++;
    }

    final /* synthetic */ void i(String str, int i2, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        boolean z = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            zzq().D().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        s().y.a(true);
        if (bArr.length == 0) {
            zzq().H().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(strOptString)) {
                zzq().H().a("Deferred Deep Link is empty.");
                return;
            }
            da daVarB = B();
            if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = daVarB.zzm().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                zzq().D().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.q.R("auto", "_cmp", bundle);
            da daVarB2 = B();
            if (TextUtils.isEmpty(strOptString) || !daVarB2.a0(strOptString, dOptDouble)) {
                return;
            }
            daVarB2.zzm().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e2) {
            zzq().A().b("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    final void j(boolean z) {
        this.B = Boolean.valueOf(z);
    }

    public final boolean k() {
        return l() == 0;
    }

    public final int l() {
        zzp().d();
        if (this.f11373h.A()) {
            return 1;
        }
        Boolean bool = this.D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (ec.a() && this.f11373h.o(t.J0) && !m()) {
            return 8;
        }
        Boolean boolE = s().E();
        if (boolE != null) {
            return boolE.booleanValue() ? 0 : 3;
        }
        Boolean boolZ = this.f11373h.z("firebase_analytics_collection_enabled");
        if (boolZ != null) {
            return boolZ.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.C;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (com.google.android.gms.common.api.internal.c.d()) {
            return 6;
        }
        return (!this.f11373h.o(t.T) || this.B == null || this.B.booleanValue()) ? 0 : 7;
    }

    public final boolean m() {
        zzp().d();
        return this.E;
    }

    final void n() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void o() {
        this.G.incrementAndGet();
    }

    protected final boolean p() {
        if (!this.y) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzp().d();
        Boolean bool = this.z;
        if (bool == null || this.A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.o.c() - this.A) > 1000)) {
            this.A = this.o.c();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(B().v0("android.permission.INTERNET") && B().v0("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.p.c.a(this.f11367b).g() || this.f11373h.O() || (s4.b(this.f11367b) && da.U(this.f11367b, false))));
            this.z = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!B().e0(M().y(), M().z(), M().A()) && TextUtils.isEmpty(M().z())) {
                    z = false;
                }
                this.z = Boolean.valueOf(z);
            }
        }
        return this.z.booleanValue();
    }

    public final void q() {
        zzp().d();
        u(r());
        String strX = M().x();
        Pair<String, Boolean> pairP = s().p(strX);
        if (!this.f11373h.B().booleanValue() || ((Boolean) pairP.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairP.first)) {
            zzq().H().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!r().s()) {
            zzq().D().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        da daVarB = B();
        M();
        URL urlE = daVarB.E(33025L, strX, (String) pairP.first, s().z.a() - 1);
        k7 k7VarR = r();
        j7 j7Var = new j7(this) { // from class: com.google.android.gms.measurement.internal.c5
            private final z4 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.measurement.internal.j7
            public final void a(String str, int i2, Throwable th, byte[] bArr, Map map) {
                this.a.i(str, i2, th, bArr, map);
            }
        };
        k7VarR.d();
        k7VarR.l();
        com.google.android.gms.common.internal.p.j(urlE);
        com.google.android.gms.common.internal.p.j(j7Var);
        k7VarR.zzp().A(new m7(k7VarR, strX, urlE, null, null, j7Var));
    }

    public final i4 s() {
        g(this.f11374i);
        return this.f11374i;
    }

    public final void v(boolean z) {
        zzp().d();
        this.E = z;
    }

    public final v3 w() {
        v3 v3Var = this.f11375j;
        if (v3Var == null || !v3Var.k()) {
            return null;
        }
        return this.f11375j;
    }

    public final e9 x() {
        t(this.f11377l);
        return this.f11377l;
    }

    public final r4 y() {
        return this.x;
    }

    final w4 z() {
        return this.f11376k;
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final com.google.android.gms.common.util.f zzl() {
        return this.o;
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final Context zzm() {
        return this.f11367b;
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final w4 zzp() {
        u(this.f11376k);
        return this.f11376k;
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final v3 zzq() {
        u(this.f11375j);
        return this.f11375j;
    }

    @Override // com.google.android.gms.measurement.internal.z5
    public final ta zzt() {
        return this.f11372g;
    }
}