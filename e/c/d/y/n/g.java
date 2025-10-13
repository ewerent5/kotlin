package e.c.d.y.n;

import e.c.d.q;
import e.c.d.t;
import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class g implements w {

    /* renamed from: e, reason: collision with root package name */
    private final e.c.d.y.c f15514e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f15515f;

    /* compiled from: MapTypeAdapterFactory.java */
    private final class a<K, V> extends v<Map<K, V>> {
        private final v<K> a;

        /* renamed from: b, reason: collision with root package name */
        private final v<V> f15516b;

        /* renamed from: c, reason: collision with root package name */
        private final e.c.d.y.i<? extends Map<K, V>> f15517c;

        public a(e.c.d.f fVar, Type type, v<K> vVar, Type type2, v<V> vVar2, e.c.d.y.i<? extends Map<K, V>> iVar) {
            this.a = new m(fVar, vVar, type);
            this.f15516b = new m(fVar, vVar2, type2);
            this.f15517c = iVar;
        }

        private String e(e.c.d.l lVar) {
            if (!lVar.m()) {
                if (lVar.k()) {
                    return "null";
                }
                throw new AssertionError();
            }
            q qVarE = lVar.e();
            if (qVarE.x()) {
                return String.valueOf(qVarE.t());
            }
            if (qVarE.u()) {
                return Boolean.toString(qVarE.n());
            }
            if (qVarE.y()) {
                return qVarE.f();
            }
            throw new AssertionError();
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(e.c.d.a0.a aVar) throws IOException {
            e.c.d.a0.b bVarK0 = aVar.k0();
            if (bVarK0 == e.c.d.a0.b.NULL) {
                aVar.a0();
                return null;
            }
            Map<K, V> mapA = this.f15517c.a();
            if (bVarK0 == e.c.d.a0.b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.v()) {
                    aVar.b();
                    K kB = this.a.b(aVar);
                    if (mapA.put(kB, this.f15516b.b(aVar)) != null) {
                        throw new t("duplicate key: " + kB);
                    }
                    aVar.j();
                }
                aVar.j();
            } else {
                aVar.c();
                while (aVar.v()) {
                    e.c.d.y.f.a.a(aVar);
                    K kB2 = this.a.b(aVar);
                    if (mapA.put(kB2, this.f15516b.b(aVar)) != null) {
                        throw new t("duplicate key: " + kB2);
                    }
                }
                aVar.q();
            }
            return mapA;
        }

        @Override // e.c.d.v
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.C();
                return;
            }
            if (!g.this.f15515f) {
                cVar.g();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.A(String.valueOf(entry.getKey()));
                    this.f15516b.d(cVar, entry.getValue());
                }
                cVar.q();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                e.c.d.l lVarC = this.a.c(entry2.getKey());
                arrayList.add(lVarC);
                arrayList2.add(entry2.getValue());
                z |= lVarC.h() || lVarC.l();
            }
            if (!z) {
                cVar.g();
                int size = arrayList.size();
                while (i2 < size) {
                    cVar.A(e((e.c.d.l) arrayList.get(i2)));
                    this.f15516b.d(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.q();
                return;
            }
            cVar.d();
            int size2 = arrayList.size();
            while (i2 < size2) {
                cVar.d();
                e.c.d.y.l.b((e.c.d.l) arrayList.get(i2), cVar);
                this.f15516b.d(cVar, arrayList2.get(i2));
                cVar.j();
                i2++;
            }
            cVar.j();
        }
    }

    public g(e.c.d.y.c cVar, boolean z) {
        this.f15514e = cVar;
        this.f15515f = z;
    }

    private v<?> b(e.c.d.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f15554f : fVar.l(e.c.d.z.a.b(type));
    }

    @Override // e.c.d.w
    public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeE = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] typeArrJ = e.c.d.y.b.j(typeE, e.c.d.y.b.k(typeE));
        return new a(fVar, typeArrJ[0], b(fVar, typeArrJ[0]), typeArrJ[1], fVar.l(e.c.d.z.a.b(typeArrJ[1])), this.f15514e.a(aVar));
    }
}