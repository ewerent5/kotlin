package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import e.c.b.b.c.e.a1;
import e.c.b.b.c.e.gb;
import e.c.b.b.c.e.z0;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class u4 extends q9 implements e {

    /* renamed from: d, reason: collision with root package name */
    private static int f11262d = 65535;

    /* renamed from: e, reason: collision with root package name */
    private static int f11263e = 2;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Map<String, String>> f11264f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f11265g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f11266h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, e.c.b.b.c.e.a1> f11267i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f11268j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, String> f11269k;

    u4(t9 t9Var) {
        super(t9Var);
        this.f11264f = new c.e.a();
        this.f11265g = new c.e.a();
        this.f11266h = new c.e.a();
        this.f11267i = new c.e.a();
        this.f11269k = new c.e.a();
        this.f11268j = new c.e.a();
    }

    private final void H(String str) throws Throwable {
        p();
        d();
        com.google.android.gms.common.internal.p.f(str);
        if (this.f11267i.get(str) == null) {
            byte[] bArrO0 = m().o0(str);
            if (bArrO0 != null) {
                a1.a aVarU = t(str, bArrO0).u();
                v(str, aVarU);
                this.f11264f.put(str, u((e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) aVarU.zzy())));
                this.f11267i.put(str, (e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) aVarU.zzy()));
                this.f11269k.put(str, null);
                return;
            }
            this.f11264f.put(str, null);
            this.f11265g.put(str, null);
            this.f11266h.put(str, null);
            this.f11267i.put(str, null);
            this.f11269k.put(str, null);
            this.f11268j.put(str, null);
        }
    }

    private final e.c.b.b.c.e.a1 t(String str, byte[] bArr) {
        if (bArr == null) {
            return e.c.b.b.c.e.a1.L();
        }
        try {
            e.c.b.b.c.e.a1 a1Var = (e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) ((a1.a) z9.x(e.c.b.b.c.e.a1.K(), bArr)).zzy());
            zzq().I().c("Parsed config. version, gmp_app_id", a1Var.C() ? Long.valueOf(a1Var.D()) : null, a1Var.E() ? a1Var.F() : null);
            return a1Var;
        } catch (e.c.b.b.c.e.a8 e2) {
            zzq().D().c("Unable to merge remote config. appId", v3.s(str), e2);
            return e.c.b.b.c.e.a1.L();
        } catch (RuntimeException e3) {
            zzq().D().c("Unable to merge remote config. appId", v3.s(str), e3);
            return e.c.b.b.c.e.a1.L();
        }
    }

    private static Map<String, String> u(e.c.b.b.c.e.a1 a1Var) {
        c.e.a aVar = new c.e.a();
        if (a1Var != null) {
            for (e.c.b.b.c.e.b1 b1Var : a1Var.G()) {
                aVar.put(b1Var.y(), b1Var.z());
            }
        }
        return aVar;
    }

    private final void v(String str, a1.a aVar) {
        c.e.a aVar2 = new c.e.a();
        c.e.a aVar3 = new c.e.a();
        c.e.a aVar4 = new c.e.a();
        if (aVar != null) {
            for (int i2 = 0; i2 < aVar.q(); i2++) {
                z0.a aVarU = aVar.r(i2).u();
                if (TextUtils.isEmpty(aVarU.r())) {
                    zzq().D().a("EventConfig contained null event name");
                } else {
                    String strR = aVarU.r();
                    String strB = b6.b(aVarU.r());
                    if (!TextUtils.isEmpty(strB)) {
                        aVarU = aVarU.q(strB);
                        aVar.s(i2, aVarU);
                    }
                    if (gb.a() && i().o(t.P0)) {
                        aVar2.put(strR, Boolean.valueOf(aVarU.s()));
                    } else {
                        aVar2.put(aVarU.r(), Boolean.valueOf(aVarU.s()));
                    }
                    aVar3.put(aVarU.r(), Boolean.valueOf(aVarU.t()));
                    if (aVarU.u()) {
                        if (aVarU.v() < f11263e || aVarU.v() > f11262d) {
                            zzq().D().c("Invalid sampling rate. Event name, sample rate", aVarU.r(), Integer.valueOf(aVarU.v()));
                        } else {
                            aVar4.put(aVarU.r(), Integer.valueOf(aVarU.v()));
                        }
                    }
                }
            }
        }
        this.f11265g.put(str, aVar2);
        this.f11266h.put(str, aVar3);
        this.f11268j.put(str, aVar4);
    }

    final boolean A(String str, String str2) throws Throwable {
        Boolean bool;
        d();
        H(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f11266h.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final int B(String str, String str2) throws Throwable {
        Integer num;
        d();
        H(str);
        Map<String, Integer> map = this.f11268j.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final void C(String str) {
        d();
        this.f11267i.remove(str);
    }

    final boolean D(String str) {
        d();
        e.c.b.b.c.e.a1 a1VarS = s(str);
        if (a1VarS == null) {
            return false;
        }
        return a1VarS.J();
    }

    final long E(String str) throws Throwable {
        String strA = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException e2) {
            zzq().D().c("Unable to parse timezone offset. appId", v3.s(str), e2);
            return 0L;
        }
    }

    final boolean F(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    final boolean G(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.e
    public final String a(String str, String str2) throws Throwable {
        d();
        H(str);
        Map<String, String> map = this.f11264f.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
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

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ z9 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ oa l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ g m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ u4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        return false;
    }

    protected final e.c.b.b.c.e.a1 s(String str) {
        p();
        d();
        com.google.android.gms.common.internal.p.f(str);
        H(str);
        return this.f11267i.get(str);
    }

    protected final boolean w(String str, byte[] bArr, String str2) {
        p();
        d();
        com.google.android.gms.common.internal.p.f(str);
        a1.a aVarU = t(str, bArr).u();
        if (aVarU == null) {
            return false;
        }
        v(str, aVarU);
        this.f11267i.put(str, (e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) aVarU.zzy()));
        this.f11269k.put(str, str2);
        this.f11264f.put(str, u((e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) aVarU.zzy())));
        m().N(str, new ArrayList(aVarU.t()));
        try {
            aVarU.u();
            bArr = ((e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) aVarU.zzy())).i();
        } catch (RuntimeException e2) {
            zzq().D().c("Unable to serialize reduced-size config. Storing full config instead. appId", v3.s(str), e2);
        }
        g gVarM = m();
        com.google.android.gms.common.internal.p.f(str);
        gVarM.d();
        gVarM.p();
        new ContentValues().put("remote_config", bArr);
        try {
            if (gVarM.t().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                gVarM.zzq().A().b("Failed to update remote config (got 0). appId", v3.s(str));
            }
        } catch (SQLiteException e3) {
            gVarM.zzq().A().c("Error storing remote config. appId", v3.s(str), e3);
        }
        this.f11267i.put(str, (e.c.b.b.c.e.a1) ((e.c.b.b.c.e.o7) aVarU.zzy()));
        return true;
    }

    protected final String x(String str) {
        d();
        return this.f11269k.get(str);
    }

    final boolean y(String str, String str2) throws Throwable {
        Boolean bool;
        d();
        H(str);
        if (F(str) && da.x0(str2)) {
            return true;
        }
        if (G(str) && da.Z(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f11265g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final void z(String str) {
        d();
        this.f11269k.put(str, null);
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