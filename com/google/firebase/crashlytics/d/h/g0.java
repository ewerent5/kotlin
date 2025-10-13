package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import com.google.firebase.crashlytics.d.j.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes.dex */
class g0 {
    private final o a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.l.g f12353b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.o.c f12354c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.i.b f12355d;

    /* renamed from: e, reason: collision with root package name */
    private final i0 f12356e;

    g0(o oVar, com.google.firebase.crashlytics.d.l.g gVar, com.google.firebase.crashlytics.d.o.c cVar, com.google.firebase.crashlytics.d.i.b bVar, i0 i0Var) {
        this.a = oVar;
        this.f12353b = gVar;
        this.f12354c = cVar;
        this.f12355d = bVar;
        this.f12356e = i0Var;
    }

    public static g0 b(Context context, x xVar, com.google.firebase.crashlytics.d.l.h hVar, b bVar, com.google.firebase.crashlytics.d.i.b bVar2, i0 i0Var, com.google.firebase.crashlytics.d.q.d dVar, com.google.firebase.crashlytics.d.p.e eVar) {
        return new g0(new o(context, xVar, bVar, dVar), new com.google.firebase.crashlytics.d.l.g(new File(hVar.a()), eVar), com.google.firebase.crashlytics.d.o.c.a(context), bVar2, i0Var);
    }

    private static List<v.b> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(v.b.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, f0.a());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(e.c.b.b.e.h<p> hVar) {
        if (!hVar.n()) {
            com.google.firebase.crashlytics.d.b.f().c("Crashlytics report could not be enqueued to DataTransport", hVar.j());
            return false;
        }
        p pVarK = hVar.k();
        com.google.firebase.crashlytics.d.b.f().b("Crashlytics report successfully enqueued to DataTransport: " + pVarK.c());
        this.f12353b.h(pVarK.c());
        return true;
    }

    private void i(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        boolean zEquals = str2.equals("crash");
        v.d.AbstractC0137d abstractC0137dB = this.a.b(th, thread, str2, j2, 4, 8, z);
        v.d.AbstractC0137d.b bVarG = abstractC0137dB.g();
        String strD = this.f12355d.d();
        if (strD != null) {
            bVarG.d(v.d.AbstractC0137d.AbstractC0148d.a().b(strD).a());
        } else {
            com.google.firebase.crashlytics.d.b.f().b("No log data to include with this event.");
        }
        List<v.b> listE = e(this.f12356e.a());
        if (!listE.isEmpty()) {
            bVarG.b(abstractC0137dB.b().f().c(com.google.firebase.crashlytics.d.j.w.a(listE)).a());
        }
        this.f12353b.A(bVarG.a(), str, zEquals);
    }

    public void c(String str, List<b0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<b0> it = list.iterator();
        while (it.hasNext()) {
            v.c.b bVarC = it.next().c();
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        this.f12353b.j(str, v.c.a().b(com.google.firebase.crashlytics.d.j.w.a(arrayList)).a());
    }

    public void d(long j2, String str) {
        this.f12353b.i(str, j2);
    }

    public void g(String str, long j2) {
        this.f12353b.B(this.a.c(str, j2));
    }

    public void j(Throwable th, Thread thread, String str, long j2) {
        com.google.firebase.crashlytics.d.b.f().b("Persisting fatal event for session " + str);
        i(th, thread, str, "crash", j2, true);
    }

    public void k(Throwable th, Thread thread, String str, long j2) {
        com.google.firebase.crashlytics.d.b.f().b("Persisting non-fatal event for session " + str);
        i(th, thread, str, "error", j2, false);
    }

    public void l() {
        this.f12353b.g();
    }

    e.c.b.b.e.h<Void> m(Executor executor, t tVar) {
        if (tVar == t.NONE) {
            com.google.firebase.crashlytics.d.b.f().b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.f12353b.g();
            return e.c.b.b.e.k.d(null);
        }
        List<p> listX = this.f12353b.x();
        ArrayList arrayList = new ArrayList();
        for (p pVar : listX) {
            if (pVar.b().k() != v.e.NATIVE || tVar == t.ALL) {
                arrayList.add(this.f12354c.e(pVar).g(executor, e0.b(this)));
            } else {
                com.google.firebase.crashlytics.d.b.f().b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.f12353b.h(pVar.c());
            }
        }
        return e.c.b.b.e.k.e(arrayList);
    }
}