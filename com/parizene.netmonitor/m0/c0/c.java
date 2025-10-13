package com.parizene.netmonitor.m0.c0;

import ch.qos.logback.core.CoreConstants;
import com.parizene.netmonitor.m0.d0.f.i;
import com.parizene.netmonitor.m0.d0.f.j;
import com.parizene.netmonitor.m0.d0.f.k;
import com.parizene.netmonitor.m0.d0.f.n;
import com.parizene.netmonitor.m0.d0.f.o;
import i.t.g0;
import i.y.c.p;
import i.y.d.g;
import i.y.d.l;
import i.y.d.m;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CellInfosSplitter.kt */
/* loaded from: classes.dex */
public final class c {
    public static final C0160c a = new C0160c(null);

    /* renamed from: b, reason: collision with root package name */
    private static final p<com.parizene.netmonitor.m0.c0.b, com.parizene.netmonitor.m0.c0.b, Boolean> f13336b = a.f13338e;

    /* renamed from: c, reason: collision with root package name */
    private static final p<com.parizene.netmonitor.m0.c0.b, com.parizene.netmonitor.m0.c0.b, Boolean> f13337c = b.f13339e;

    /* compiled from: CellInfosSplitter.kt */
    static final class a extends m implements p<com.parizene.netmonitor.m0.c0.b, com.parizene.netmonitor.m0.c0.b, Boolean> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f13338e = new a();

        a() {
            super(2);
        }

        public final boolean a(com.parizene.netmonitor.m0.c0.b bVar, com.parizene.netmonitor.m0.c0.b bVar2) {
            l.d(bVar2, "cellInfoWithMeta");
            return bVar == null || bVar2.b().e();
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ Boolean i(com.parizene.netmonitor.m0.c0.b bVar, com.parizene.netmonitor.m0.c0.b bVar2) {
            return Boolean.valueOf(a(bVar, bVar2));
        }
    }

    /* compiled from: CellInfosSplitter.kt */
    static final class b extends m implements p<com.parizene.netmonitor.m0.c0.b, com.parizene.netmonitor.m0.c0.b, Boolean> {

        /* renamed from: e, reason: collision with root package name */
        public static final b f13339e = new b();

        b() {
            super(2);
        }

        public final boolean a(com.parizene.netmonitor.m0.c0.b bVar, com.parizene.netmonitor.m0.c0.b bVar2) {
            l.d(bVar2, "cellInfoWithMeta");
            return bVar == null || bVar.b().d() != bVar2.b().d();
        }

        @Override // i.y.c.p
        public /* bridge */ /* synthetic */ Boolean i(com.parizene.netmonitor.m0.c0.b bVar, com.parizene.netmonitor.m0.c0.b bVar2) {
            return Boolean.valueOf(a(bVar, bVar2));
        }
    }

    /* compiled from: CellInfosSplitter.kt */
    /* renamed from: com.parizene.netmonitor.m0.c0.c$c, reason: collision with other inner class name */
    public static final class C0160c {
        private C0160c() {
        }

        public /* synthetic */ C0160c(g gVar) {
            this();
        }

        public final p<com.parizene.netmonitor.m0.c0.b, com.parizene.netmonitor.m0.c0.b, Boolean> a() {
            return c.f13337c;
        }

        public final p<com.parizene.netmonitor.m0.c0.b, com.parizene.netmonitor.m0.c0.b, Boolean> b() {
            return c.f13336b;
        }
    }

    /* compiled from: CellInfosSplitter.kt */
    public static final class d {
        private final List<com.parizene.netmonitor.m0.c0.d> a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13340b;

        /* renamed from: c, reason: collision with root package name */
        private final Set<Long> f13341c;

        /* renamed from: d, reason: collision with root package name */
        private final Set<String> f13342d;

        public d() {
            this(null, 0, null, null, 15, null);
        }

        public d(List<com.parizene.netmonitor.m0.c0.d> list, int i2, Set<Long> set, Set<String> set2) {
            l.d(list, "groups");
            l.d(set, "timestampMillisSet");
            l.d(set2, "mccMncSet");
            this.a = list;
            this.f13340b = i2;
            this.f13341c = set;
            this.f13342d = set2;
        }

        public final List<com.parizene.netmonitor.m0.c0.d> a() {
            return this.a;
        }

        public final Set<String> b() {
            return this.f13342d;
        }

        public final Set<Long> c() {
            return this.f13341c;
        }

        public final int d() {
            return this.f13340b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return l.a(this.a, dVar.a) && this.f13340b == dVar.f13340b && l.a(this.f13341c, dVar.f13341c) && l.a(this.f13342d, dVar.f13342d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.f13340b) * 31) + this.f13341c.hashCode()) * 31) + this.f13342d.hashCode();
        }

        public String toString() {
            return "Result(groups=" + this.a + ", isRegisteredCount=" + this.f13340b + ", timestampMillisSet=" + this.f13341c + ", mccMncSet=" + this.f13342d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ d(List list, int i2, Set set, Set set2, int i3, g gVar) {
            this((i3 & 1) != 0 ? i.t.l.f() : list, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? g0.b() : set, (i3 & 8) != 0 ? g0.b() : set2);
        }
    }

    private final f c(o oVar) {
        int iA;
        int iB;
        com.parizene.netmonitor.m0.c0.a aVar;
        com.parizene.netmonitor.m0.c0.a aVar2;
        if (oVar instanceof i) {
            aVar2 = com.parizene.netmonitor.m0.c0.a.CDMA;
            iB = Integer.MAX_VALUE;
            iA = Integer.MAX_VALUE;
        } else {
            if (oVar instanceof j) {
                com.parizene.netmonitor.m0.d0.f.c cVar = ((j) oVar).f13426d;
                iA = cVar.f13393c;
                iB = cVar.f13394d;
                aVar = com.parizene.netmonitor.m0.c0.a.GSM;
            } else if (oVar instanceof n) {
                com.parizene.netmonitor.m0.d0.f.g gVar = ((n) oVar).f13434d;
                iA = gVar.f13417c;
                iB = gVar.f13418d;
                aVar = com.parizene.netmonitor.m0.c0.a.WCDMA;
            } else if (oVar instanceof k) {
                com.parizene.netmonitor.m0.d0.f.d dVar = ((k) oVar).f13428d;
                iA = dVar.f13400c;
                iB = dVar.f13401d;
                aVar = com.parizene.netmonitor.m0.c0.a.LTE;
            } else if (oVar instanceof com.parizene.netmonitor.m0.d0.f.m) {
                com.parizene.netmonitor.m0.d0.f.f fVar = ((com.parizene.netmonitor.m0.d0.f.m) oVar).f13432d;
                iA = fVar.a();
                iB = fVar.b();
                aVar = com.parizene.netmonitor.m0.c0.a.TDSCDMA;
            } else {
                if (!(oVar instanceof com.parizene.netmonitor.m0.d0.f.l)) {
                    throw new IllegalStateException();
                }
                com.parizene.netmonitor.m0.d0.f.e eVar = ((com.parizene.netmonitor.m0.d0.f.l) oVar).f13430d;
                iA = eVar.a();
                iB = eVar.b();
                aVar = com.parizene.netmonitor.m0.c0.a.NR;
            }
            aVar2 = aVar;
        }
        long j2 = oVar.f13437c;
        if (j2 == 0) {
            j2 = 2147483647L;
        }
        return new f(oVar.a, j2, iA == 0 ? Integer.MAX_VALUE : iA, iB == 0 ? Integer.MAX_VALUE : iB, aVar2);
    }

    public final d d(List<? extends o> list, p<? super com.parizene.netmonitor.m0.c0.b, ? super com.parizene.netmonitor.m0.c0.b, Boolean> pVar) {
        l.d(pVar, "splitter");
        if (list == null) {
            return new d(null, 0, null, null, 15, null);
        }
        int i2 = 0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList(i.t.m.o(list, 10));
        for (o oVar : list) {
            f fVarC = c(oVar);
            if (fVarC.e()) {
                i2++;
            }
            linkedHashSet.add(Long.valueOf(fVarC.d()));
            StringBuilder sb = new StringBuilder();
            sb.append(fVarC.b());
            sb.append(';');
            sb.append(fVarC.c());
            linkedHashSet2.add(sb.toString());
            arrayList.add(new com.parizene.netmonitor.m0.c0.b(oVar, fVarC));
        }
        return new d(e(arrayList, pVar), i2, linkedHashSet, linkedHashSet2);
    }

    public final List<com.parizene.netmonitor.m0.c0.d> e(List<com.parizene.netmonitor.m0.c0.b> list, p<? super com.parizene.netmonitor.m0.c0.b, ? super com.parizene.netmonitor.m0.c0.b, Boolean> pVar) {
        l.d(list, "list");
        l.d(pVar, "splitter");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        if (size > 0) {
            int i2 = 0;
            ArrayList arrayList2 = null;
            while (true) {
                int i3 = i2 + 1;
                com.parizene.netmonitor.m0.c0.b bVar = list.get(i2);
                int i4 = i2 - 1;
                if (pVar.i(i4 >= 0 ? list.get(i4) : null, bVar).booleanValue()) {
                    arrayList2 = new ArrayList();
                    arrayList.add(new com.parizene.netmonitor.m0.c0.d(arrayList2));
                }
                if (arrayList2 != null) {
                    arrayList2.add(bVar);
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }
}