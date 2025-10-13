package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery.java */
/* loaded from: classes.dex */
public class u0 implements c.r.a.e, c.r.a.d {

    /* renamed from: e, reason: collision with root package name */
    static final TreeMap<Integer, u0> f1963e = new TreeMap<>();

    /* renamed from: f, reason: collision with root package name */
    private volatile String f1964f;

    /* renamed from: g, reason: collision with root package name */
    final long[] f1965g;

    /* renamed from: h, reason: collision with root package name */
    final double[] f1966h;

    /* renamed from: i, reason: collision with root package name */
    final String[] f1967i;

    /* renamed from: j, reason: collision with root package name */
    final byte[][] f1968j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f1969k;

    /* renamed from: l, reason: collision with root package name */
    final int f1970l;

    /* renamed from: m, reason: collision with root package name */
    int f1971m;

    private u0(int i2) {
        this.f1970l = i2;
        int i3 = i2 + 1;
        this.f1969k = new int[i3];
        this.f1965g = new long[i3];
        this.f1966h = new double[i3];
        this.f1967i = new String[i3];
        this.f1968j = new byte[i3][];
    }

    public static u0 d(String str, int i2) {
        TreeMap<Integer, u0> treeMap = f1963e;
        synchronized (treeMap) {
            Map.Entry<Integer, u0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                u0 u0Var = new u0(i2);
                u0Var.g(str, i2);
                return u0Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            u0 value = entryCeilingEntry.getValue();
            value.g(str, i2);
            return value;
        }
    }

    private static void i() {
        TreeMap<Integer, u0> treeMap = f1963e;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i2;
        }
    }

    @Override // c.r.a.d
    public void E(int i2, double d2) {
        this.f1969k[i2] = 3;
        this.f1966h[i2] = d2;
    }

    @Override // c.r.a.d
    public void R(int i2, long j2) {
        this.f1969k[i2] = 2;
        this.f1965g[i2] = j2;
    }

    @Override // c.r.a.d
    public void X(int i2, byte[] bArr) {
        this.f1969k[i2] = 5;
        this.f1968j[i2] = bArr;
    }

    @Override // c.r.a.e
    public String b() {
        return this.f1964f;
    }

    @Override // c.r.a.e
    public void c(c.r.a.d dVar) {
        for (int i2 = 1; i2 <= this.f1971m; i2++) {
            int i3 = this.f1969k[i2];
            if (i3 == 1) {
                dVar.t0(i2);
            } else if (i3 == 2) {
                dVar.R(i2, this.f1965g[i2]);
            } else if (i3 == 3) {
                dVar.E(i2, this.f1966h[i2]);
            } else if (i3 == 4) {
                dVar.r(i2, this.f1967i[i2]);
            } else if (i3 == 5) {
                dVar.X(i2, this.f1968j[i2]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    void g(String str, int i2) {
        this.f1964f = str;
        this.f1971m = i2;
    }

    public void j() {
        TreeMap<Integer, u0> treeMap = f1963e;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f1970l), this);
            i();
        }
    }

    @Override // c.r.a.d
    public void r(int i2, String str) {
        this.f1969k[i2] = 4;
        this.f1967i[i2] = str;
    }

    @Override // c.r.a.d
    public void t0(int i2) {
        this.f1969k[i2] = 1;
    }
}