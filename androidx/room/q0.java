package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import c.r.a.c;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase.java */
/* loaded from: classes.dex */
public abstract class q0 {

    @Deprecated
    protected volatile c.r.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private Executor f1908b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f1909c;

    /* renamed from: d, reason: collision with root package name */
    private c.r.a.c f1910d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1912f;

    /* renamed from: g, reason: collision with root package name */
    boolean f1913g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    protected List<b> f1914h;

    /* renamed from: j, reason: collision with root package name */
    private w f1916j;

    /* renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f1915i = new ReentrantReadWriteLock();

    /* renamed from: k, reason: collision with root package name */
    private final ThreadLocal<Integer> f1917k = new ThreadLocal<>();

    /* renamed from: l, reason: collision with root package name */
    private final Map<String, Object> f1918l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: e, reason: collision with root package name */
    private final i0 f1911e = f();

    /* renamed from: m, reason: collision with root package name */
    private final Map<Class<?>, Object> f1919m = new HashMap();

    /* compiled from: RoomDatabase.java */
    public static class a<T extends q0> {
        private final Class<T> a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1920b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f1921c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<b> f1922d;

        /* renamed from: e, reason: collision with root package name */
        private e f1923e;

        /* renamed from: f, reason: collision with root package name */
        private f f1924f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f1925g;

        /* renamed from: h, reason: collision with root package name */
        private List<Object> f1926h;

        /* renamed from: i, reason: collision with root package name */
        private Executor f1927i;

        /* renamed from: j, reason: collision with root package name */
        private Executor f1928j;

        /* renamed from: k, reason: collision with root package name */
        private c.InterfaceC0068c f1929k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f1930l;
        private boolean n;
        private boolean p;
        private TimeUnit r;
        private Set<Integer> t;
        private Set<Integer> u;
        private String v;
        private File w;
        private Callable<InputStream> x;
        private long q = -1;

        /* renamed from: m, reason: collision with root package name */
        private c f1931m = c.AUTOMATIC;
        private boolean o = true;
        private final d s = new d();

        a(Context context, Class<T> cls, String str) {
            this.f1921c = context;
            this.a = cls;
            this.f1920b = str;
        }

        public a<T> a(b bVar) {
            if (this.f1922d == null) {
                this.f1922d = new ArrayList<>();
            }
            this.f1922d.add(bVar);
            return this;
        }

        public a<T> b(androidx.room.b1.a... aVarArr) {
            if (this.u == null) {
                this.u = new HashSet();
            }
            for (androidx.room.b1.a aVar : aVarArr) {
                this.u.add(Integer.valueOf(aVar.a));
                this.u.add(Integer.valueOf(aVar.f1809b));
            }
            this.s.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f1930l = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f1921c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.a == null) {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            Executor executor2 = this.f1927i;
            if (executor2 == null && this.f1928j == null) {
                Executor executorE = c.b.a.a.a.e();
                this.f1928j = executorE;
                this.f1927i = executorE;
            } else if (executor2 != null && this.f1928j == null) {
                this.f1928j = executor2;
            } else if (executor2 == null && (executor = this.f1928j) != null) {
                this.f1927i = executor;
            }
            Set<Integer> set = this.u;
            if (set != null && this.t != null) {
                for (Integer num : set) {
                    if (this.t.contains(num)) {
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                    }
                }
            }
            c.InterfaceC0068c x0Var = this.f1929k;
            if (x0Var == null) {
                x0Var = new c.r.a.g.c();
            }
            long j2 = this.q;
            if (j2 > 0) {
                if (this.f1920b == null) {
                    throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                }
                x0Var = new y(x0Var, new w(j2, this.r, this.f1928j));
            }
            String str = this.v;
            if (str != null || this.w != null || this.x != null) {
                if (this.f1920b == null) {
                    throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                }
                int i2 = str == null ? 0 : 1;
                File file = this.w;
                int i3 = i2 + (file == null ? 0 : 1);
                Callable<InputStream> callable = this.x;
                if (i3 + (callable != null ? 1 : 0) != 1) {
                    throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                }
                x0Var = new x0(str, file, callable, x0Var);
            }
            f fVar = this.f1924f;
            c.InterfaceC0068c m0Var = fVar != null ? new m0(x0Var, fVar, this.f1925g) : x0Var;
            Context context = this.f1921c;
            b0 b0Var = new b0(context, this.f1920b, m0Var, this.s, this.f1922d, this.f1930l, this.f1931m.b(context), this.f1927i, this.f1928j, this.n, this.o, this.p, this.t, this.v, this.w, this.x, this.f1923e, this.f1926h);
            T t = (T) p0.b(this.a, "_Impl");
            t.r(b0Var);
            return t;
        }

        public a<T> e() {
            this.o = false;
            this.p = true;
            return this;
        }

        public a<T> f(Executor executor) {
            this.f1927i = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.java */
    public static abstract class b {
        public void a(c.r.a.b bVar) {
        }

        public void b(c.r.a.b bVar) {
        }

        public void c(c.r.a.b bVar) {
        }
    }

    /* compiled from: RoomDatabase.java */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        c b(Context context) {
            ActivityManager activityManager;
            return this != AUTOMATIC ? this : (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase.java */
    public static class d {
        private HashMap<Integer, TreeMap<Integer, androidx.room.b1.a>> a = new HashMap<>();

        private void a(androidx.room.b1.a aVar) {
            int i2 = aVar.a;
            int i3 = aVar.f1809b;
            TreeMap<Integer, androidx.room.b1.a> treeMap = this.a.get(Integer.valueOf(i2));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.a.put(Integer.valueOf(i2), treeMap);
            }
            androidx.room.b1.a aVar2 = treeMap.get(Integer.valueOf(i3));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i3), aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:13:0x0026->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List<androidx.room.b1.a> d(java.util.List<androidx.room.b1.a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L5a
                goto L7
            L5:
                if (r9 <= r10) goto L5a
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.b1.a>> r0 = r6.a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L56
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                androidx.room.b1.a r9 = (androidx.room.b1.a) r9
                r7.add(r9)
                r9 = r3
                goto L57
            L56:
                r4 = 0
            L57:
                if (r4 != 0) goto L0
                return r1
            L5a:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.q0.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(androidx.room.b1.a... aVarArr) {
            for (androidx.room.b1.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<androidx.room.b1.a> c(int i2, int i3) {
            if (i2 == i3) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i3 > i2, i2, i3);
        }
    }

    /* compiled from: RoomDatabase.java */
    public static abstract class e {
    }

    /* compiled from: RoomDatabase.java */
    public interface f {
        void a(String str, List<Object> list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T E(Class<T> cls, c.r.a.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof c0) {
            return (T) E(cls, ((c0) cVar).getDelegate());
        }
        return null;
    }

    private void s() {
        a();
        c.r.a.b bVarC0 = this.f1910d.c0();
        this.f1911e.s(bVarC0);
        if (Build.VERSION.SDK_INT < 16 || !bVarC0.E0()) {
            bVarC0.k();
        } else {
            bVarC0.U();
        }
    }

    private void t() {
        this.f1910d.c0().i0();
        if (q()) {
            return;
        }
        this.f1911e.j();
    }

    private static boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    private /* synthetic */ Object x(c.r.a.b bVar) {
        s();
        return null;
    }

    private /* synthetic */ Object z(c.r.a.b bVar) {
        t();
        return null;
    }

    public /* synthetic */ Object A(c.r.a.b bVar) {
        z(bVar);
        return null;
    }

    public Cursor B(c.r.a.e eVar) {
        return C(eVar, null);
    }

    public Cursor C(c.r.a.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return (cancellationSignal == null || Build.VERSION.SDK_INT < 16) ? this.f1910d.c0().s0(eVar) : this.f1910d.c0().J(eVar, cancellationSignal);
    }

    @Deprecated
    public void D() {
        this.f1910d.c0().S();
    }

    public void a() {
        if (!this.f1912f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!q() && this.f1917k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        w wVar = this.f1916j;
        if (wVar == null) {
            s();
        } else {
            wVar.c(new c.b.a.c.a() { // from class: androidx.room.q
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    this.a.y((c.r.a.b) obj);
                    return null;
                }
            });
        }
    }

    public void d() {
        if (w()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f1915i.writeLock();
            writeLock.lock();
            try {
                this.f1911e.p();
                this.f1910d.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public c.r.a.f e(String str) {
        a();
        b();
        return this.f1910d.c0().x(str);
    }

    protected abstract i0 f();

    protected abstract c.r.a.c g(b0 b0Var);

    @Deprecated
    public void h() {
        w wVar = this.f1916j;
        if (wVar == null) {
            t();
        } else {
            wVar.c(new c.b.a.c.a() { // from class: androidx.room.r
                @Override // c.b.a.c.a
                public final Object apply(Object obj) {
                    this.a.A((c.r.a.b) obj);
                    return null;
                }
            });
        }
    }

    Map<String, Object> i() {
        return this.f1918l;
    }

    Lock j() {
        return this.f1915i.readLock();
    }

    public i0 k() {
        return this.f1911e;
    }

    public c.r.a.c l() {
        return this.f1910d;
    }

    public Executor m() {
        return this.f1908b;
    }

    protected Map<Class<?>, List<Class<?>>> n() {
        return Collections.emptyMap();
    }

    ThreadLocal<Integer> o() {
        return this.f1917k;
    }

    public Executor p() {
        return this.f1909c;
    }

    public boolean q() {
        return this.f1910d.c0().x0();
    }

    public void r(b0 b0Var) {
        c.r.a.c cVarG = g(b0Var);
        this.f1910d = cVarG;
        w0 w0Var = (w0) E(w0.class, cVarG);
        if (w0Var != null) {
            w0Var.g(b0Var);
        }
        x xVar = (x) E(x.class, this.f1910d);
        if (xVar != null) {
            w wVarB = xVar.b();
            this.f1916j = wVarB;
            this.f1911e.m(wVarB);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            z = b0Var.f1804i == c.WRITE_AHEAD_LOGGING;
            this.f1910d.setWriteAheadLoggingEnabled(z);
        }
        this.f1914h = b0Var.f1800e;
        this.f1908b = b0Var.f1805j;
        this.f1909c = new a1(b0Var.f1806k);
        this.f1912f = b0Var.f1803h;
        this.f1913g = z;
        if (b0Var.f1807l) {
            this.f1911e.n(b0Var.f1797b, b0Var.f1798c);
        }
        Map<Class<?>, List<Class<?>>> mapN = n();
        BitSet bitSet = new BitSet();
        for (Map.Entry<Class<?>, List<Class<?>>> entry : mapN.entrySet()) {
            Class<?> key = entry.getKey();
            for (Class<?> cls : entry.getValue()) {
                int size = b0Var.f1802g.size() - 1;
                while (true) {
                    if (size < 0) {
                        size = -1;
                        break;
                    } else {
                        if (cls.isAssignableFrom(b0Var.f1802g.get(size).getClass())) {
                            bitSet.set(size);
                            break;
                        }
                        size--;
                    }
                }
                if (size < 0) {
                    throw new IllegalArgumentException("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.");
                }
                this.f1919m.put(cls, b0Var.f1802g.get(size));
            }
        }
        for (int size2 = b0Var.f1802g.size() - 1; size2 >= 0; size2--) {
            if (!bitSet.get(size2)) {
                throw new IllegalArgumentException("Unexpected type converter " + b0Var.f1802g.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
        }
    }

    protected void u(c.r.a.b bVar) {
        this.f1911e.g(bVar);
    }

    public boolean w() {
        w wVar = this.f1916j;
        if (wVar != null) {
            return wVar.g();
        }
        c.r.a.b bVar = this.a;
        return bVar != null && bVar.isOpen();
    }

    public /* synthetic */ Object y(c.r.a.b bVar) {
        x(bVar);
        return null;
    }
}