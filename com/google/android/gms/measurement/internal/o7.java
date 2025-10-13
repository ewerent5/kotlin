package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import e.c.b.b.c.e.ec;
import e.c.b.b.c.e.g1;
import e.c.b.b.c.e.i1;
import e.c.b.b.c.e.j1;
import e.c.b.b.c.e.k1;
import e.c.b.b.c.e.o1;
import e.c.b.b.c.e.pd;
import e.c.b.b.c.e.qd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class o7 extends q9 {
    public o7(t9 t9Var) {
        super(t9Var);
    }

    private static String a(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        return false;
    }

    public final byte[] s(r rVar, String str) {
        ea next;
        Bundle bundleK;
        k1.a aVar;
        f4 f4Var;
        j1.a aVar2;
        Bundle bundle;
        byte[] bArr;
        long j2;
        n nVarA;
        d();
        this.a.n();
        com.google.android.gms.common.internal.p.j(rVar);
        com.google.android.gms.common.internal.p.f(str);
        if (!i().y(str, t.X)) {
            zzq().H().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(rVar.f11169e) && !"_iapx".equals(rVar.f11169e)) {
            zzq().H().c("Generating a payload for this event is not available. package_name, event_name", str, rVar.f11169e);
            return null;
        }
        j1.a aVarC = e.c.b.b.c.e.j1.C();
        m().r0();
        try {
            f4 f4VarH0 = m().h0(str);
            if (f4VarH0 == null) {
                zzq().H().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!f4VarH0.e0()) {
                zzq().H().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            k1.a aVarZ = e.c.b.b.c.e.k1.Q0().q(1).z("android");
            if (!TextUtils.isEmpty(f4VarH0.t())) {
                aVarZ.c0(f4VarH0.t());
            }
            if (!TextUtils.isEmpty(f4VarH0.X())) {
                aVarZ.X(f4VarH0.X());
            }
            if (!TextUtils.isEmpty(f4VarH0.T())) {
                aVarZ.g0(f4VarH0.T());
            }
            if (f4VarH0.V() != -2147483648L) {
                aVarZ.i0((int) f4VarH0.V());
            }
            aVarZ.a0(f4VarH0.Z()).t0(f4VarH0.d0());
            if (pd.a() && i().y(f4VarH0.t(), t.k0)) {
                if (!TextUtils.isEmpty(f4VarH0.A())) {
                    aVarZ.u0(f4VarH0.A());
                } else if (!TextUtils.isEmpty(f4VarH0.G())) {
                    aVarZ.F0(f4VarH0.G());
                } else if (!TextUtils.isEmpty(f4VarH0.D())) {
                    aVarZ.C0(f4VarH0.D());
                }
            } else if (!TextUtils.isEmpty(f4VarH0.A())) {
                aVarZ.u0(f4VarH0.A());
            } else if (!TextUtils.isEmpty(f4VarH0.D())) {
                aVarZ.C0(f4VarH0.D());
            }
            d dVarB = this.f11187b.b(str);
            aVarZ.j0(f4VarH0.b0());
            if (this.a.k() && i().E(aVarZ.r0())) {
                if (!ec.a() || !i().o(t.L0)) {
                    aVarZ.r0();
                    if (!TextUtils.isEmpty(null)) {
                        aVarZ.B0(null);
                    }
                } else if (dVarB.o() && !TextUtils.isEmpty(null)) {
                    aVarZ.B0(null);
                }
            }
            if (ec.a() && i().o(t.L0)) {
                aVarZ.J0(dVarB.e());
            }
            if (!ec.a() || !i().o(t.L0) || dVarB.o()) {
                Pair<String, Boolean> pairS = k().s(f4VarH0.t(), dVarB);
                if (f4VarH0.l() && pairS != null && !TextUtils.isEmpty((CharSequence) pairS.first)) {
                    aVarZ.k0(a((String) pairS.first, Long.toString(rVar.f11172h)));
                    Object obj = pairS.second;
                    if (obj != null) {
                        aVarZ.A(((Boolean) obj).booleanValue());
                    }
                }
            }
            e().l();
            k1.a aVarN = aVarZ.N(Build.MODEL);
            e().l();
            aVarN.G(Build.VERSION.RELEASE).Z((int) e().q()).Q(e().r());
            if (!ec.a() || !i().o(t.L0) || dVarB.q()) {
                aVarZ.o0(a(f4VarH0.x(), Long.toString(rVar.f11172h)));
            }
            if (!TextUtils.isEmpty(f4VarH0.M())) {
                aVarZ.x0(f4VarH0.M());
            }
            String strT = f4VarH0.t();
            List<ea> listG = m().G(strT);
            Iterator<ea> it = listG.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ("_lte".equals(next.f10849c)) {
                    break;
                }
            }
            if (next == null || next.f10851e == null) {
                ea eaVar = new ea(strT, "auto", "_lte", zzl().a(), 0L);
                listG.add(eaVar);
                m().R(eaVar);
            }
            z9 z9VarJ = j();
            z9VarJ.zzq().I().a("Checking account type status for ad personalization signals");
            if (z9VarJ.e().u()) {
                String strT2 = f4VarH0.t();
                if (f4VarH0.l() && z9VarJ.n().D(strT2)) {
                    z9VarJ.zzq().H().a("Turning off ad personalization due to account type");
                    Iterator<ea> it2 = listG.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if ("_npa".equals(it2.next().f10849c)) {
                            it2.remove();
                            break;
                        }
                    }
                    listG.add(new ea(strT2, "auto", "_npa", z9VarJ.zzl().a(), 1L));
                }
            }
            e.c.b.b.c.e.o1[] o1VarArr = new e.c.b.b.c.e.o1[listG.size()];
            for (int i2 = 0; i2 < listG.size(); i2++) {
                o1.a aVarS = e.c.b.b.c.e.o1.V().t(listG.get(i2).f10849c).s(listG.get(i2).f10850d);
                j().H(aVarS, listG.get(i2).f10851e);
                o1VarArr[i2] = (e.c.b.b.c.e.o1) ((e.c.b.b.c.e.o7) aVarS.zzy());
            }
            aVarZ.F(Arrays.asList(o1VarArr));
            if (qd.a() && i().o(t.C0) && i().o(t.D0)) {
                z3 z3VarB = z3.b(rVar);
                g().H(z3VarB.f11366d, m().z0(str));
                g().Q(z3VarB, i().j(str));
                bundleK = z3VarB.f11366d;
            } else {
                bundleK = rVar.f11170f.K();
            }
            Bundle bundle2 = bundleK;
            bundle2.putLong("_c", 1L);
            zzq().H().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", rVar.f11171g);
            if (g().y0(aVarZ.r0())) {
                g().I(bundle2, "_dbg", 1L);
                g().I(bundle2, "_r", 1L);
            }
            n nVarB = m().B(str, rVar.f11169e);
            if (nVarB == null) {
                f4Var = f4VarH0;
                aVar = aVarZ;
                aVar2 = aVarC;
                bundle = bundle2;
                bArr = null;
                nVarA = new n(str, rVar.f11169e, 0L, 0L, rVar.f11172h, 0L, null, null, null, null);
                j2 = 0;
            } else {
                aVar = aVarZ;
                f4Var = f4VarH0;
                aVar2 = aVarC;
                bundle = bundle2;
                bArr = null;
                j2 = nVarB.f11045f;
                nVarA = nVarB.a(rVar.f11172h);
            }
            m().L(nVarA);
            o oVar = new o(this.a, rVar.f11171g, str, rVar.f11169e, rVar.f11172h, j2, bundle);
            g1.a aVarB = e.c.b.b.c.e.g1.Y().s(oVar.f11069d).w(oVar.f11067b).B(oVar.f11070e);
            Iterator<String> it3 = oVar.f11071f.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                i1.a aVarV = e.c.b.b.c.e.i1.c0().v(next2);
                j().G(aVarV, oVar.f11071f.J(next2));
                aVarB.t(aVarV);
            }
            k1.a aVar3 = aVar;
            aVar3.u(aVarB).v(e.c.b.b.c.e.l1.y().q(e.c.b.b.c.e.h1.y().q(nVarA.f11042c).r(rVar.f11169e)));
            aVar3.M(l().t(f4Var.t(), Collections.emptyList(), aVar3.T(), Long.valueOf(aVarB.F()), Long.valueOf(aVarB.F())));
            if (aVarB.E()) {
                aVar3.E(aVarB.F()).L(aVarB.F());
            }
            long jR = f4Var.R();
            if (jR != 0) {
                aVar3.W(jR);
            }
            long jP = f4Var.P();
            if (jP != 0) {
                aVar3.O(jP);
            } else if (jR != 0) {
                aVar3.O(jR);
            }
            f4Var.i0();
            aVar3.e0((int) f4Var.f0()).f0(33025L).t(zzl().a()).H(true);
            j1.a aVar4 = aVar2;
            aVar4.q(aVar3);
            f4 f4Var2 = f4Var;
            f4Var2.a(aVar3.Y());
            f4Var2.q(aVar3.d0());
            m().M(f4Var2);
            m().s();
            try {
                return j().U(((e.c.b.b.c.e.j1) ((e.c.b.b.c.e.o7) aVar4.zzy())).i());
            } catch (IOException e2) {
                zzq().A().c("Data loss. Failed to bundle and serialize. appId", v3.s(str), e2);
                return bArr;
            }
        } catch (SecurityException e3) {
            zzq().H().b("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } catch (SecurityException e4) {
            zzq().H().b("app instance id encryption failed", e4.getMessage());
            return new byte[0];
        } finally {
            m().w0();
        }
    }
}