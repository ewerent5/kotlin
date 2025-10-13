package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import e.c.b.b.c.e.ce;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.zb;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class c extends x5 {

    /* renamed from: b */
    private Boolean f10774b;

    /* renamed from: c */
    private e f10775c;

    /* renamed from: d */
    private Boolean f10776d;

    c(z4 z4Var) {
        super(z4Var);
        this.f10775c = b.a;
    }

    public static long K() {
        return t.E.a(null).longValue();
    }

    public static long L() {
        return t.f11221e.a(null).longValue();
    }

    private final Bundle P() {
        try {
            if (zzm().getPackageManager() == null) {
                zzq().A().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = com.google.android.gms.common.p.c.a(zzm()).c(zzm().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            zzq().A().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            zzq().A().b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    private final String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e2) {
            zzq().A().b("Could not find SystemProperties class", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            zzq().A().b("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (NoSuchMethodException e4) {
            zzq().A().b("Could not find SystemProperties.get() method", e4);
            return str2;
        } catch (InvocationTargetException e5) {
            zzq().A().b("SystemProperties.get() threw an exception", e5);
            return str2;
        }
    }

    private final int k(String str, o3<Integer> o3Var, int i2, int i3) {
        return Math.max(Math.min(q(str, o3Var), i3), i2);
    }

    public final boolean A() {
        Boolean boolZ = z("firebase_analytics_collection_deactivated");
        return boolZ != null && boolZ.booleanValue();
    }

    public final Boolean B() {
        Boolean boolZ = z("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(boolZ == null || boolZ.booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<java.lang.String> C(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            com.google.android.gms.common.internal.p.f(r4)
            android.os.Bundle r0 = r3.P()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.v3 r4 = r3.zzq()
            com.google.android.gms.measurement.internal.x3 r4 = r4.A()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zzm()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.v3 r0 = r3.zzq()
            com.google.android.gms.measurement.internal.x3 r0 = r0.A()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.C(java.lang.String):java.util.List");
    }

    public final Boolean D() {
        if (!ce.a() || !o(t.v0)) {
            return Boolean.TRUE;
        }
        Boolean boolZ = z("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(boolZ == null || boolZ.booleanValue());
    }

    public final boolean E(String str) {
        return "1".equals(this.f10775c.a(str, "gaia_collection_enabled"));
    }

    public final Boolean F() {
        if (ec.a() && o(t.K0)) {
            return z("google_analytics_default_allow_ad_storage");
        }
        return null;
    }

    public final boolean G(String str) {
        return "1".equals(this.f10775c.a(str, "measurement.event_sampling_enabled"));
    }

    public final Boolean H() {
        if (ec.a() && o(t.K0)) {
            return z("google_analytics_default_allow_analytics_storage");
        }
        return null;
    }

    final boolean I(String str) {
        return v(str, t.L);
    }

    final String J(String str) {
        o3<String> o3Var = t.M;
        return str == null ? o3Var.a(null) : o3Var.a(this.f10775c.a(str, o3Var.b()));
    }

    public final String M() {
        return a("debug.firebase.analytics.app", "");
    }

    public final String N() {
        return a("debug.deferred.deeplink", "");
    }

    final boolean O() {
        if (this.f10774b == null) {
            Boolean boolZ = z("app_measurement_lite");
            this.f10774b = boolZ;
            if (boolZ == null) {
                this.f10774b = Boolean.FALSE;
            }
        }
        return this.f10774b.booleanValue() || !this.a.I();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.x5
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

    public final int j(String str) {
        return k(str, t.J, 25, 100);
    }

    public final long l(String str, o3<Long> o3Var) {
        if (str == null) {
            return o3Var.a(null).longValue();
        }
        String strA = this.f10775c.a(str, o3Var.b());
        if (TextUtils.isEmpty(strA)) {
            return o3Var.a(null).longValue();
        }
        try {
            return o3Var.a(Long.valueOf(Long.parseLong(strA))).longValue();
        } catch (NumberFormatException unused) {
            return o3Var.a(null).longValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m(com.google.android.gms.measurement.internal.f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = e.c.b.b.c.e.pd.a()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.c r1 = r5.i()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.o3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.t.k0
            boolean r1 = r1.v(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.D()
        L33:
            com.google.android.gms.measurement.internal.o3<java.lang.String> r2 = com.google.android.gms.measurement.internal.t.f11222f
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.o3<java.lang.String> r4 = com.google.android.gms.measurement.internal.t.f11223g
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L5d
            java.lang.String r1 = r3.concat(r1)
            goto L62
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L62:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            java.lang.String r1 = "gmp_version"
            java.lang.String r2 = "33025"
            r6.appendQueryParameter(r1, r2)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c.m(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    final void n(e eVar) {
        this.f10775c = eVar;
    }

    public final boolean o(o3<Boolean> o3Var) {
        return v(null, o3Var);
    }

    final int p(String str) {
        if (zb.a() && v(null, t.y0)) {
            return k(str, t.I, 500, 2000);
        }
        return 500;
    }

    public final int q(String str, o3<Integer> o3Var) {
        if (str == null) {
            return o3Var.a(null).intValue();
        }
        String strA = this.f10775c.a(str, o3Var.b());
        if (TextUtils.isEmpty(strA)) {
            return o3Var.a(null).intValue();
        }
        try {
            return o3Var.a(Integer.valueOf(Integer.parseInt(strA))).intValue();
        } catch (NumberFormatException unused) {
            return o3Var.a(null).intValue();
        }
    }

    public final double r(String str, o3<Double> o3Var) {
        if (str == null) {
            return o3Var.a(null).doubleValue();
        }
        String strA = this.f10775c.a(str, o3Var.b());
        if (TextUtils.isEmpty(strA)) {
            return o3Var.a(null).doubleValue();
        }
        try {
            return o3Var.a(Double.valueOf(Double.parseDouble(strA))).doubleValue();
        } catch (NumberFormatException unused) {
            return o3Var.a(null).doubleValue();
        }
    }

    public final int s(String str) {
        return q(str, t.p);
    }

    public final int t() {
        if (zb.a() && i().v(null, t.z0)) {
            da daVarG = g();
            Boolean boolV = daVarG.a.K().V();
            if (daVarG.F0() >= 201500 || !(boolV == null || boolV.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    final int u(String str) {
        if (zb.a() && v(null, t.y0)) {
            return k(str, t.H, 25, 100);
        }
        return 25;
    }

    public final boolean v(String str, o3<Boolean> o3Var) {
        if (str == null) {
            return o3Var.a(null).booleanValue();
        }
        String strA = this.f10775c.a(str, o3Var.b());
        return TextUtils.isEmpty(strA) ? o3Var.a(null).booleanValue() : o3Var.a(Boolean.valueOf(Boolean.parseBoolean(strA))).booleanValue();
    }

    final long w(String str) {
        return l(str, t.f11219c);
    }

    public final boolean x() {
        if (this.f10776d == null) {
            synchronized (this) {
                if (this.f10776d == null) {
                    ApplicationInfo applicationInfo = zzm().getApplicationInfo();
                    String strA = com.google.android.gms.common.util.p.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f10776d = Boolean.valueOf(str != null && str.equals(strA));
                    }
                    if (this.f10776d == null) {
                        this.f10776d = Boolean.TRUE;
                        zzq().A().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f10776d.booleanValue();
    }

    public final boolean y(String str, o3<Boolean> o3Var) {
        return v(str, o3Var);
    }

    final Boolean z(String str) {
        com.google.android.gms.common.internal.p.f(str);
        Bundle bundleP = P();
        if (bundleP == null) {
            zzq().A().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleP.containsKey(str)) {
            return Boolean.valueOf(bundleP.getBoolean(str));
        }
        return null;
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