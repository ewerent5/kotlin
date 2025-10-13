package com.bumptech.glide.load.n.a0;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.n.a0.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
class h<K extends m, V> {
    private final a<K, V> a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f3652b = new HashMap();

    /* compiled from: GroupedLinkedMap.java */
    private static class a<K, V> {
        final K a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f3653b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f3654c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f3655d;

        a() {
            this(null);
        }

        public void a(V v) {
            if (this.f3653b == null) {
                this.f3653b = new ArrayList();
            }
            this.f3653b.add(v);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f3653b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f3653b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k2) {
            this.f3655d = this;
            this.f3654c = this;
            this.a = k2;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.f3655d = aVar2;
        aVar.f3654c = aVar2.f3654c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.f3655d = aVar2.f3655d;
        aVar.f3654c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f3655d;
        aVar2.f3654c = aVar.f3654c;
        aVar.f3654c.f3655d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f3654c.f3655d = aVar;
        aVar.f3655d.f3654c = aVar;
    }

    public V a(K k2) {
        a<K, V> aVar = this.f3652b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f3652b.put(k2, aVar);
        } else {
            k2.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k2, V v) {
        a<K, V> aVar = this.f3652b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            c(aVar);
            this.f3652b.put(k2, aVar);
        } else {
            k2.a();
        }
        aVar.a(v);
    }

    public V f() {
        for (a aVar = this.a.f3655d; !aVar.equals(this.a); aVar = aVar.f3655d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.f3652b.remove(aVar.a);
            ((m) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.a.f3654c; !aVar.equals(this.a); aVar = aVar.f3654c) {
            z = true;
            sb.append(CoreConstants.CURLY_LEFT);
            sb.append(aVar.a);
            sb.append(CoreConstants.COLON_CHAR);
            sb.append(aVar.c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}