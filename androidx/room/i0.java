package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.LiveData;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public class i0 {
    private static final String[] a = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: c, reason: collision with root package name */
    final String[] f1843c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Set<String>> f1844d;

    /* renamed from: f, reason: collision with root package name */
    final q0 f1846f;

    /* renamed from: i, reason: collision with root package name */
    volatile c.r.a.f f1849i;

    /* renamed from: j, reason: collision with root package name */
    private b f1850j;

    /* renamed from: k, reason: collision with root package name */
    private final h0 f1851k;

    /* renamed from: m, reason: collision with root package name */
    private j0 f1853m;

    /* renamed from: e, reason: collision with root package name */
    w f1845e = null;

    /* renamed from: g, reason: collision with root package name */
    AtomicBoolean f1847g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f1848h = false;

    /* renamed from: l, reason: collision with root package name */
    @SuppressLint({"RestrictedApi"})
    final c.b.a.b.b<c, d> f1852l = new c.b.a.b.b<>();
    Runnable n = new a();

    /* renamed from: b, reason: collision with root package name */
    final HashMap<String, Integer> f1842b = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor cursorB = i0.this.f1846f.B(new c.r.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorB.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorB.getInt(0)));
                } catch (Throwable th) {
                    cursorB.close();
                    throw th;
                }
            }
            cursorB.close();
            if (!hashSet.isEmpty()) {
                i0.this.f1849i.w();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar;
            w wVar2;
            Lock lockJ = i0.this.f1846f.j();
            lockJ.lock();
            Set<Integer> setA = null;
            try {
                try {
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    lockJ.unlock();
                    wVar = i0.this.f1845e;
                    if (wVar != null) {
                    }
                }
                if (!i0.this.f()) {
                    if (wVar2 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                if (!i0.this.f1847g.compareAndSet(true, false)) {
                    lockJ.unlock();
                    w wVar3 = i0.this.f1845e;
                    if (wVar3 != null) {
                        wVar3.b();
                        return;
                    }
                    return;
                }
                if (i0.this.f1846f.q()) {
                    lockJ.unlock();
                    w wVar4 = i0.this.f1845e;
                    if (wVar4 != null) {
                        wVar4.b();
                        return;
                    }
                    return;
                }
                q0 q0Var = i0.this.f1846f;
                if (q0Var.f1913g) {
                    c.r.a.b bVarC0 = q0Var.l().c0();
                    bVarC0.U();
                    try {
                        setA = a();
                        bVarC0.S();
                        bVarC0.i0();
                    } catch (Throwable th) {
                        bVarC0.i0();
                        throw th;
                    }
                } else {
                    setA = a();
                }
                lockJ.unlock();
                wVar = i0.this.f1845e;
                if (wVar != null) {
                    wVar.b();
                }
                if (setA == null || setA.isEmpty()) {
                    return;
                }
                synchronized (i0.this.f1852l) {
                    Iterator<Map.Entry<c, d>> it = i0.this.f1852l.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().a(setA);
                    }
                }
            } finally {
                lockJ.unlock();
                wVar2 = i0.this.f1845e;
                if (wVar2 != null) {
                    wVar2.b();
                }
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    static class b {
        final long[] a;

        /* renamed from: b, reason: collision with root package name */
        final boolean[] f1855b;

        /* renamed from: c, reason: collision with root package name */
        final int[] f1856c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1857d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1858e;

        b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            boolean[] zArr = new boolean[i2];
            this.f1855b = zArr;
            this.f1856c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            synchronized (this) {
                if (this.f1857d && !this.f1858e) {
                    int length = this.a.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1;
                        if (i2 >= length) {
                            this.f1858e = true;
                            this.f1857d = false;
                            return this.f1856c;
                        }
                        boolean z = this.a[i2] > 0;
                        boolean[] zArr = this.f1855b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.f1856c;
                            if (!z) {
                                i3 = 2;
                            }
                            iArr[i2] = i3;
                        } else {
                            this.f1856c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i2++;
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.a;
                    long j2 = jArr[i2];
                    jArr[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.f1857d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        boolean c(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = this.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.f1857d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        void d() {
            synchronized (this) {
                this.f1858e = false;
            }
        }

        void e() {
            synchronized (this) {
                Arrays.fill(this.f1855b, false);
                this.f1857d = true;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    public static abstract class c {
        final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    static class d {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f1859b;

        /* renamed from: c, reason: collision with root package name */
        final c f1860c;

        /* renamed from: d, reason: collision with root package name */
        private final Set<String> f1861d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f1860c = cVar;
            this.a = iArr;
            this.f1859b = strArr;
            if (iArr.length != 1) {
                this.f1861d = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f1861d = Collections.unmodifiableSet(hashSet);
        }

        void a(Set<Integer> set) {
            int length = this.a.length;
            Set<String> hashSet = null;
            for (int i2 = 0; i2 < length; i2++) {
                if (set.contains(Integer.valueOf(this.a[i2]))) {
                    if (length == 1) {
                        hashSet = this.f1861d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.f1859b[i2]);
                    }
                }
            }
            if (hashSet != null) {
                this.f1860c.b(hashSet);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f1859b.length == 1) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (strArr[i2].equalsIgnoreCase(this.f1859b[0])) {
                        set = this.f1861d;
                        break;
                    }
                    i2++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f1859b;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            String str2 = strArr2[i3];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f1860c.b(set);
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    static class e extends c {

        /* renamed from: b, reason: collision with root package name */
        final i0 f1862b;

        /* renamed from: c, reason: collision with root package name */
        final WeakReference<c> f1863c;

        e(i0 i0Var, c cVar) {
            super(cVar.a);
            this.f1862b = i0Var;
            this.f1863c = new WeakReference<>(cVar);
        }

        @Override // androidx.room.i0.c
        public void b(Set<String> set) {
            c cVar = this.f1863c.get();
            if (cVar == null) {
                this.f1862b.k(this);
            } else {
                cVar.b(set);
            }
        }
    }

    public i0(q0 q0Var, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f1846f = q0Var;
        this.f1850j = new b(strArr.length);
        this.f1844d = map2;
        this.f1851k = new h0(q0Var);
        int length = strArr.length;
        this.f1843c = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1842b.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.f1843c[i2] = str2.toLowerCase(locale);
            } else {
                this.f1843c[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f1842b.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.f1842b;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    private static void c(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private static void d(c.r.a.b bVar) {
        if (Build.VERSION.SDK_INT < 16 || !bVar.E0()) {
            bVar.k();
        } else {
            bVar.U();
        }
    }

    private String[] l(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f1844d.containsKey(lowerCase)) {
                hashSet.addAll(this.f1844d.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void o(c.r.a.b bVar, int i2) {
        bVar.p("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f1843c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            c(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.p(sb.toString());
        }
    }

    private void q(c.r.a.b bVar, int i2) {
        String str = this.f1843c[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            c(sb, str, str2);
            bVar.p(sb.toString());
        }
    }

    private String[] t(String[] strArr) {
        String[] strArrL = l(strArr);
        for (String str : strArrL) {
            if (!this.f1842b.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        return strArrL;
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d dVarK;
        String[] strArrL = l(cVar.a);
        int[] iArr = new int[strArrL.length];
        int length = strArrL.length;
        for (int i2 = 0; i2 < length; i2++) {
            Integer num = this.f1842b.get(strArrL[i2].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrL[i2]);
            }
            iArr[i2] = num.intValue();
        }
        d dVar = new d(cVar, iArr, strArrL);
        synchronized (this.f1852l) {
            dVarK = this.f1852l.k(cVar, dVar);
        }
        if (dVarK == null && this.f1850j.b(iArr)) {
            r();
        }
    }

    public void b(c cVar) {
        a(new e(this, cVar));
    }

    public <T> LiveData<T> e(String[] strArr, boolean z, Callable<T> callable) {
        return this.f1851k.a(t(strArr), z, callable);
    }

    boolean f() {
        if (!this.f1846f.w()) {
            return false;
        }
        if (!this.f1848h) {
            this.f1846f.l().c0();
        }
        if (this.f1848h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    void g(c.r.a.b bVar) {
        synchronized (this) {
            if (this.f1848h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.p("PRAGMA temp_store = MEMORY;");
            bVar.p("PRAGMA recursive_triggers='ON';");
            bVar.p("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            s(bVar);
            this.f1849i = bVar.x("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f1848h = true;
        }
    }

    public void h(String... strArr) {
        synchronized (this.f1852l) {
            Iterator<Map.Entry<c, d>> it = this.f1852l.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    void i() {
        synchronized (this) {
            this.f1848h = false;
            this.f1850j.e();
        }
    }

    public void j() {
        if (this.f1847g.compareAndSet(false, true)) {
            w wVar = this.f1845e;
            if (wVar != null) {
                wVar.e();
            }
            this.f1846f.m().execute(this.n);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void k(c cVar) {
        d dVarL;
        synchronized (this.f1852l) {
            dVarL = this.f1852l.l(cVar);
        }
        if (dVarL == null || !this.f1850j.c(dVarL.a)) {
            return;
        }
        r();
    }

    void m(w wVar) {
        this.f1845e = wVar;
        wVar.h(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f1962e.i();
            }
        });
    }

    void n(Context context, String str) {
        this.f1853m = new j0(context, str, this, this.f1846f.m());
    }

    void p() {
        j0 j0Var = this.f1853m;
        if (j0Var != null) {
            j0Var.a();
            this.f1853m = null;
        }
    }

    void r() {
        if (this.f1846f.w()) {
            s(this.f1846f.l().c0());
        }
    }

    void s(c.r.a.b bVar) {
        if (bVar.x0()) {
            return;
        }
        while (true) {
            try {
                Lock lockJ = this.f1846f.j();
                lockJ.lock();
                try {
                    int[] iArrA = this.f1850j.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    d(bVar);
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            int i3 = iArrA[i2];
                            if (i3 == 1) {
                                o(bVar, i2);
                            } else if (i3 == 2) {
                                q(bVar, i2);
                            }
                        } finally {
                        }
                    }
                    bVar.S();
                    bVar.i0();
                    this.f1850j.d();
                } finally {
                    lockJ.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}