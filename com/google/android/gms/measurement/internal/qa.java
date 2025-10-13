package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.n1;
import e.c.b.b.c.e.qc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class qa {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11162b;

    /* renamed from: c, reason: collision with root package name */
    private e.c.b.b.c.e.m1 f11163c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f11164d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f11165e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Integer, Long> f11166f;

    /* renamed from: g, reason: collision with root package name */
    private Map<Integer, List<Long>> f11167g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ oa f11168h;

    private qa(oa oaVar, String str) {
        this.f11168h = oaVar;
        this.a = str;
        this.f11162b = true;
        this.f11164d = new BitSet();
        this.f11165e = new BitSet();
        this.f11166f = new c.e.a();
        this.f11167g = new c.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e.c.b.b.c.e.e1$a, e.c.b.b.c.e.o7$b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [e.c.b.b.c.e.m1$a] */
    final e.c.b.b.c.e.e1 a(int i2) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? N = e.c.b.b.c.e.e1.N();
        N.q(i2);
        N.t(this.f11162b);
        e.c.b.b.c.e.m1 m1Var = this.f11163c;
        if (m1Var != null) {
            N.s(m1Var);
        }
        ?? S = e.c.b.b.c.e.m1.X().v(z9.C(this.f11164d)).s(z9.C(this.f11165e));
        if (this.f11166f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f11166f.size());
            Iterator<Integer> it = this.f11166f.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                arrayList.add((e.c.b.b.c.e.f1) ((e.c.b.b.c.e.o7) e.c.b.b.c.e.f1.G().q(iIntValue).r(this.f11166f.get(Integer.valueOf(iIntValue)).longValue()).zzy()));
            }
        }
        S.w(arrayList);
        if (this.f11167g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.f11167g.size());
            for (Integer num : this.f11167g.keySet()) {
                n1.a aVarQ = e.c.b.b.c.e.n1.H().q(num.intValue());
                List<Long> list = this.f11167g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    aVarQ.r(list);
                }
                arrayList2.add((e.c.b.b.c.e.n1) ((e.c.b.b.c.e.o7) aVarQ.zzy()));
            }
        }
        S.x(arrayList2);
        N.r(S);
        return (e.c.b.b.c.e.e1) ((e.c.b.b.c.e.o7) N.zzy());
    }

    final void c(ra raVar) {
        int iA = raVar.a();
        Boolean bool = raVar.f11189c;
        if (bool != null) {
            this.f11165e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = raVar.f11190d;
        if (bool2 != null) {
            this.f11164d.set(iA, bool2.booleanValue());
        }
        if (raVar.f11191e != null) {
            Long l2 = this.f11166f.get(Integer.valueOf(iA));
            long jLongValue = raVar.f11191e.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.f11166f.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (raVar.f11192f != null) {
            List<Long> arrayList = this.f11167g.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f11167g.put(Integer.valueOf(iA), arrayList);
            }
            if (raVar.i()) {
                arrayList.clear();
            }
            if (qc.a() && this.f11168h.i().v(this.a, t.d0) && raVar.j()) {
                arrayList.clear();
            }
            if (!qc.a() || !this.f11168h.i().v(this.a, t.d0)) {
                arrayList.add(Long.valueOf(raVar.f11192f.longValue() / 1000));
                return;
            }
            long jLongValue2 = raVar.f11192f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    private qa(oa oaVar, String str, e.c.b.b.c.e.m1 m1Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f11168h = oaVar;
        this.a = str;
        this.f11164d = bitSet;
        this.f11165e = bitSet2;
        this.f11166f = map;
        this.f11167g = new c.e.a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.f11167g.put(num, arrayList);
            }
        }
        this.f11162b = false;
        this.f11163c = m1Var;
    }

    /* synthetic */ qa(oa oaVar, String str, e.c.b.b.c.e.m1 m1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, na naVar) {
        this(oaVar, str, m1Var, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ qa(oa oaVar, String str, na naVar) {
        this(oaVar, str);
    }
}