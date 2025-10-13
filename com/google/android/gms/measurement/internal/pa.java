package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class pa {
    private e.c.b.b.c.e.g1 a;

    /* renamed from: b, reason: collision with root package name */
    private Long f11135b;

    /* renamed from: c, reason: collision with root package name */
    private long f11136c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ oa f11137d;

    private pa(oa oaVar) {
        this.f11137d = oaVar;
    }

    final e.c.b.b.c.e.g1 a(String str, e.c.b.b.c.e.g1 g1Var) {
        Object obj;
        String strQ = g1Var.Q();
        List<e.c.b.b.c.e.i1> listZ = g1Var.z();
        this.f11137d.j();
        Long l2 = (Long) z9.S(g1Var, "_eid");
        boolean z = l2 != null;
        if (z && strQ.equals("_ep")) {
            this.f11137d.j();
            strQ = (String) z9.S(g1Var, "_en");
            if (TextUtils.isEmpty(strQ)) {
                this.f11137d.zzq().B().b("Extra parameter without an event name. eventId", l2);
                return null;
            }
            if (this.a == null || this.f11135b == null || l2.longValue() != this.f11135b.longValue()) {
                Pair<e.c.b.b.c.e.g1, Long> pairY = this.f11137d.m().y(str, l2);
                if (pairY == null || (obj = pairY.first) == null) {
                    this.f11137d.zzq().B().c("Extra parameter without existing main event. eventName, eventId", strQ, l2);
                    return null;
                }
                this.a = (e.c.b.b.c.e.g1) obj;
                this.f11136c = ((Long) pairY.second).longValue();
                this.f11137d.j();
                this.f11135b = (Long) z9.S(this.a, "_eid");
            }
            long j2 = this.f11136c - 1;
            this.f11136c = j2;
            if (j2 <= 0) {
                g gVarM = this.f11137d.m();
                gVarM.d();
                gVarM.zzq().I().b("Clearing complex main event info. appId", str);
                try {
                    gVarM.t().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e2) {
                    gVarM.zzq().A().b("Error clearing complex main event", e2);
                }
            } else {
                this.f11137d.m().W(str, l2, this.f11136c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (e.c.b.b.c.e.i1 i1Var : this.a.z()) {
                this.f11137d.j();
                if (z9.w(g1Var, i1Var.J()) == null) {
                    arrayList.add(i1Var);
                }
            }
            if (arrayList.isEmpty()) {
                this.f11137d.zzq().B().b("No unique parameters in main event. eventName", strQ);
            } else {
                arrayList.addAll(listZ);
                listZ = arrayList;
            }
        } else if (z) {
            this.f11135b = l2;
            this.a = g1Var;
            this.f11137d.j();
            Object objS = z9.S(g1Var, "_epc");
            long jLongValue = ((Long) (objS != null ? objS : 0L)).longValue();
            this.f11136c = jLongValue;
            if (jLongValue <= 0) {
                this.f11137d.zzq().B().b("Complex event with zero extra param count. eventName", strQ);
            } else {
                this.f11137d.m().W(str, l2, this.f11136c, g1Var);
            }
        }
        return (e.c.b.b.c.e.g1) ((e.c.b.b.c.e.o7) g1Var.u().w(strQ).C().v(listZ).zzy());
    }

    /* synthetic */ pa(oa oaVar, na naVar) {
        this(oaVar);
    }
}