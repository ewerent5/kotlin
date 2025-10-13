package androidx.work.impl.l;

import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public class j {
    private static final String a = androidx.work.h.f("WorkSpec");

    /* renamed from: b, reason: collision with root package name */
    public static final c.b.a.c.a<List<c>, List<androidx.work.n>> f2301b = new a();

    /* renamed from: c, reason: collision with root package name */
    public String f2302c;

    /* renamed from: d, reason: collision with root package name */
    public n.a f2303d;

    /* renamed from: e, reason: collision with root package name */
    public String f2304e;

    /* renamed from: f, reason: collision with root package name */
    public String f2305f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.work.e f2306g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.work.e f2307h;

    /* renamed from: i, reason: collision with root package name */
    public long f2308i;

    /* renamed from: j, reason: collision with root package name */
    public long f2309j;

    /* renamed from: k, reason: collision with root package name */
    public long f2310k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.work.c f2311l;

    /* renamed from: m, reason: collision with root package name */
    public int f2312m;
    public androidx.work.a n;
    public long o;
    public long p;
    public long q;
    public long r;

    /* compiled from: WorkSpec.java */
    static class a implements c.b.a.c.a<List<c>, List<androidx.work.n>> {
        a() {
        }

        @Override // c.b.a.c.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<androidx.work.n> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec.java */
    public static class b {
        public String a;

        /* renamed from: b, reason: collision with root package name */
        public n.a f2313b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2313b != bVar.f2313b) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.f2313b.hashCode();
        }
    }

    /* compiled from: WorkSpec.java */
    public static class c {
        public String a;

        /* renamed from: b, reason: collision with root package name */
        public n.a f2314b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.work.e f2315c;

        /* renamed from: d, reason: collision with root package name */
        public int f2316d;

        /* renamed from: e, reason: collision with root package name */
        public List<String> f2317e;

        public androidx.work.n a() {
            return new androidx.work.n(UUID.fromString(this.a), this.f2314b, this.f2315c, this.f2317e, this.f2316d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f2316d != cVar.f2316d) {
                return false;
            }
            String str = this.a;
            if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
                return false;
            }
            if (this.f2314b != cVar.f2314b) {
                return false;
            }
            androidx.work.e eVar = this.f2315c;
            if (eVar == null ? cVar.f2315c != null : !eVar.equals(cVar.f2315c)) {
                return false;
            }
            List<String> list = this.f2317e;
            List<String> list2 = cVar.f2317e;
            return list != null ? list.equals(list2) : list2 == null;
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            n.a aVar = this.f2314b;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.e eVar = this.f2315c;
            int iHashCode3 = (((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f2316d) * 31;
            List<String> list = this.f2317e;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }
    }

    public j(String str, String str2) {
        this.f2303d = n.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f2122b;
        this.f2306g = eVar;
        this.f2307h = eVar;
        this.f2311l = androidx.work.c.a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000L;
        this.r = -1L;
        this.f2302c = str;
        this.f2304e = str2;
    }

    public long a() {
        if (c()) {
            return this.p + Math.min(18000000L, this.n == androidx.work.a.LINEAR ? this.o * this.f2312m : (long) Math.scalb(this.o, this.f2312m - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.p;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f2308i;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.p;
        long j3 = j2 == 0 ? jCurrentTimeMillis2 + this.f2308i : j2;
        long j4 = this.f2310k;
        long j5 = this.f2309j;
        if (j4 != j5) {
            return j3 + j5 + (j2 == 0 ? j4 * (-1) : 0L);
        }
        return j3 + (j2 != 0 ? j5 : 0L);
    }

    public boolean b() {
        return !androidx.work.c.a.equals(this.f2311l);
    }

    public boolean c() {
        return this.f2303d == n.a.ENQUEUED && this.f2312m > 0;
    }

    public boolean d() {
        return this.f2309j != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f2308i != jVar.f2308i || this.f2309j != jVar.f2309j || this.f2310k != jVar.f2310k || this.f2312m != jVar.f2312m || this.o != jVar.o || this.p != jVar.p || this.q != jVar.q || this.r != jVar.r || !this.f2302c.equals(jVar.f2302c) || this.f2303d != jVar.f2303d || !this.f2304e.equals(jVar.f2304e)) {
            return false;
        }
        String str = this.f2305f;
        if (str == null ? jVar.f2305f == null : str.equals(jVar.f2305f)) {
            return this.f2306g.equals(jVar.f2306g) && this.f2307h.equals(jVar.f2307h) && this.f2311l.equals(jVar.f2311l) && this.n == jVar.n;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.f2302c.hashCode() * 31) + this.f2303d.hashCode()) * 31) + this.f2304e.hashCode()) * 31;
        String str = this.f2305f;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f2306g.hashCode()) * 31) + this.f2307h.hashCode()) * 31;
        long j2 = this.f2308i;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f2309j;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f2310k;
        int iHashCode3 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f2311l.hashCode()) * 31) + this.f2312m) * 31) + this.n.hashCode()) * 31;
        long j5 = this.o;
        int i4 = (iHashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.p;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.q;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.r;
        return i6 + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "{WorkSpec: " + this.f2302c + "}";
    }

    public j(j jVar) {
        this.f2303d = n.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f2122b;
        this.f2306g = eVar;
        this.f2307h = eVar;
        this.f2311l = androidx.work.c.a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000L;
        this.r = -1L;
        this.f2302c = jVar.f2302c;
        this.f2304e = jVar.f2304e;
        this.f2303d = jVar.f2303d;
        this.f2305f = jVar.f2305f;
        this.f2306g = new androidx.work.e(jVar.f2306g);
        this.f2307h = new androidx.work.e(jVar.f2307h);
        this.f2308i = jVar.f2308i;
        this.f2309j = jVar.f2309j;
        this.f2310k = jVar.f2310k;
        this.f2311l = new androidx.work.c(jVar.f2311l);
        this.f2312m = jVar.f2312m;
        this.n = jVar.n;
        this.o = jVar.o;
        this.p = jVar.p;
        this.q = jVar.q;
        this.r = jVar.r;
    }
}