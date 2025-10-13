package com.parizene.netmonitor.m0;

import android.os.Build;
import com.parizene.netmonitor.m0.c0.c;
import com.parizene.netmonitor.m0.d0.f.a0;
import com.parizene.netmonitor.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: CellStateCreator.java */
/* loaded from: classes.dex */
public class i {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a<com.google.firebase.crashlytics.c> f13494b;

    /* renamed from: d, reason: collision with root package name */
    private final b f13496d;

    /* renamed from: e, reason: collision with root package name */
    private final d f13497e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13499g;

    /* renamed from: c, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.c0.c f13495c = new com.parizene.netmonitor.m0.c0.c();

    /* renamed from: f, reason: collision with root package name */
    private final Comparator<com.parizene.netmonitor.m0.b0.y> f13498f = com.parizene.netmonitor.m0.b.f13259e;

    /* compiled from: CellStateCreator.java */
    private class b implements c {
        private b() {
        }

        @Override // com.parizene.netmonitor.m0.i.c
        public boolean a(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.c0.d dVar) {
            com.parizene.netmonitor.m0.c0.f fVarA = dVar.a();
            return fVarA != null && fVarA.b() == yVar.e() && fVarA.c() == yVar.g() && fVarA.a() == i.h(yVar.i());
        }
    }

    /* compiled from: CellStateCreator.java */
    interface c {
        boolean a(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.c0.d dVar);
    }

    /* compiled from: CellStateCreator.java */
    private class d implements c {
        private d() {
        }

        @Override // com.parizene.netmonitor.m0.i.c
        public boolean a(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.c0.d dVar) {
            return true;
        }
    }

    public i(g gVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        this.a = gVar;
        this.f13494b = aVar;
        this.f13496d = new b();
        this.f13497e = new d();
    }

    private void b(c.e.h<com.parizene.netmonitor.m0.b0.b> hVar, List<com.parizene.netmonitor.m0.b0.y> list, List<com.parizene.netmonitor.m0.c0.d> list2, c cVar, com.parizene.netmonitor.m0.d dVar) {
        Iterator<com.parizene.netmonitor.m0.b0.y> it = list.iterator();
        while (it.hasNext()) {
            com.parizene.netmonitor.m0.b0.y next = it.next();
            if (list2.isEmpty()) {
                hVar.k(next.l(), new com.parizene.netmonitor.m0.b0.b(next, null, new ArrayList()));
            } else {
                Iterator<com.parizene.netmonitor.m0.c0.d> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        com.parizene.netmonitor.m0.c0.d next2 = it2.next();
                        if (cVar.a(next, next2)) {
                            hVar.k(next.l(), d(next, next2.b(), dVar));
                            it.remove();
                            it2.remove();
                            break;
                        }
                    }
                }
            }
        }
    }

    private void f(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.b0.k kVar) {
        if (yVar.n() && yVar.o()) {
            return;
        }
        if (kVar instanceof com.parizene.netmonitor.m0.b0.m) {
            yVar.q(kVar.f13303b.a);
            yVar.r(((com.parizene.netmonitor.m0.b0.m) kVar).a().f13277b);
        } else if (kVar instanceof com.parizene.netmonitor.m0.b0.q) {
            yVar.q(kVar.f13303b.a);
            yVar.r(((com.parizene.netmonitor.m0.b0.q) kVar).a().f13298b);
        } else if (kVar instanceof com.parizene.netmonitor.m0.b0.n) {
            yVar.q(kVar.f13303b.a);
            yVar.r(((com.parizene.netmonitor.m0.b0.n) kVar).a().f13282b);
        }
    }

    private void g(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.b0.k kVar) {
        if (w.f(yVar.i())) {
            if (kVar instanceof com.parizene.netmonitor.m0.b0.l) {
                yVar.s(4);
                return;
            }
            if (kVar instanceof com.parizene.netmonitor.m0.b0.m) {
                yVar.s(16);
            } else if (kVar instanceof com.parizene.netmonitor.m0.b0.q) {
                yVar.s(3);
            } else if (kVar instanceof com.parizene.netmonitor.m0.b0.n) {
                yVar.s(13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.parizene.netmonitor.m0.c0.a h(int i2) {
        if (w.a(i2)) {
            return com.parizene.netmonitor.m0.c0.a.CDMA;
        }
        if (w.b(i2)) {
            return com.parizene.netmonitor.m0.c0.a.GSM;
        }
        if (w.g(i2)) {
            return com.parizene.netmonitor.m0.c0.a.WCDMA;
        }
        if (w.c(i2)) {
            return com.parizene.netmonitor.m0.c0.a.LTE;
        }
        if (w.e(i2)) {
            return com.parizene.netmonitor.m0.c0.a.TDSCDMA;
        }
        if (w.d(i2)) {
            return com.parizene.netmonitor.m0.c0.a.NR;
        }
        return null;
    }

    static /* synthetic */ int i(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.b0.y yVar2) {
        return yVar.j() - yVar2.j();
    }

    private void j(int i2, c.d dVar) {
        List<com.parizene.netmonitor.m0.c0.d> listA = dVar.a();
        StringBuilder sb = new StringBuilder();
        sb.append("isRegisteredCount=");
        sb.append(dVar.d());
        sb.append(", timestampMillis{");
        sb.append(dVar.c().size());
        sb.append("}=");
        sb.append(dVar.c());
        sb.append(", mccMnc{");
        sb.append(dVar.b().size());
        sb.append("}=");
        sb.append(dVar.b());
        sb.append(", groupsCount=");
        sb.append(listA.size());
        sb.append(", phoneCount=");
        sb.append(i2);
        sb.append(", DEVICE=");
        sb.append(Build.DEVICE);
        sb.append(", [");
        int size = listA.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != 0) {
                sb.append(", ");
            }
            List<com.parizene.netmonitor.m0.c0.f> listC = listA.get(i3).c();
            sb.append(i3);
            sb.append(": size=");
            sb.append(listC.size());
            sb.append(" ");
            sb.append(listC);
        }
        sb.append("]");
        this.f13494b.get().c(new IllegalStateException(sb.toString()));
    }

    public c.e.h<com.parizene.netmonitor.m0.b0.b> c(List<com.parizene.netmonitor.m0.b0.y> list, List<com.parizene.netmonitor.m0.d0.f.o> list2, com.parizene.netmonitor.m0.d dVar, int i2) {
        Collections.sort(list, this.f13498f);
        c.e.h<com.parizene.netmonitor.m0.b0.b> hVar = new c.e.h<>(list.size());
        c.d dVarD = this.f13495c.d(list2, (p.b.d() || p.b.e()) ? com.parizene.netmonitor.m0.c0.c.a.a() : com.parizene.netmonitor.m0.c0.c.a.b());
        if (!this.f13499g && list2 != null && list2.size() >= i2 && (dVarD.d() > i2 || dVarD.a().size() > i2)) {
            this.f13499g = true;
            j(i2, dVarD);
        }
        b(hVar, list, dVarD.a(), this.f13496d, dVar);
        b(hVar, list, dVarD.a(), this.f13497e, dVar);
        return hVar;
    }

    public com.parizene.netmonitor.m0.b0.b d(com.parizene.netmonitor.m0.b0.y yVar, List<com.parizene.netmonitor.m0.d0.f.o> list, com.parizene.netmonitor.m0.d dVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.parizene.netmonitor.m0.b0.k kVar = null;
        if (list != null && !list.isEmpty()) {
            Iterator<com.parizene.netmonitor.m0.d0.f.o> it = list.iterator();
            while (it.hasNext()) {
                com.parizene.netmonitor.m0.b0.k kVarC = this.a.c(yVar, it.next(), dVar);
                if (kVarC != null && !arrayList.contains(kVarC.f13303b)) {
                    arrayList.add(kVarC.f13303b);
                    if (kVarC.a && kVar == null) {
                        g(yVar, kVarC);
                        f(yVar, kVarC);
                        kVar = kVarC;
                    } else {
                        arrayList2.add(kVarC);
                    }
                }
            }
        }
        return new com.parizene.netmonitor.m0.b0.b(yVar, kVar, arrayList2);
    }

    public com.parizene.netmonitor.m0.b0.b e(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.p pVar, a0 a0Var, List<com.parizene.netmonitor.m0.d0.f.y> list, com.parizene.netmonitor.m0.d dVar) {
        com.parizene.netmonitor.m0.b0.k kVarD = this.a.d(yVar, pVar, a0Var, dVar);
        if (kVarD != null) {
            g(yVar, kVarD);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator<com.parizene.netmonitor.m0.d0.f.y> it = list.iterator();
            while (it.hasNext()) {
                com.parizene.netmonitor.m0.b0.k kVarE = this.a.e(yVar, it.next(), dVar);
                if (kVarE != null) {
                    arrayList.add(kVarE);
                }
            }
        }
        return new com.parizene.netmonitor.m0.b0.b(yVar, kVarD, arrayList);
    }
}