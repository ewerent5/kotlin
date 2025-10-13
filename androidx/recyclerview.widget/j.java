package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
final class j implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal<j> f1738e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static Comparator<c> f1739f = new a();

    /* renamed from: h, reason: collision with root package name */
    long f1741h;

    /* renamed from: i, reason: collision with root package name */
    long f1742i;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<RecyclerView> f1740g = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<c> f1743j = new ArrayList<>();

    /* compiled from: GapWorker.java */
    static class a implements Comparator<c>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f1749d;
            if ((recyclerView == null) != (cVar2.f1749d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i2 = cVar2.f1747b - cVar.f1747b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f1748c - cVar2.f1748c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.o.c {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1744b;

        /* renamed from: c, reason: collision with root package name */
        int[] f1745c;

        /* renamed from: d, reason: collision with root package name */
        int f1746d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i4 = this.f1746d * 2;
            int[] iArr = this.f1745c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f1745c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i4 * 2];
                this.f1745c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f1745c;
            iArr4[i4] = i2;
            iArr4[i4 + 1] = i3;
            this.f1746d++;
        }

        void b() {
            int[] iArr = this.f1745c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1746d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.f1746d = 0;
            int[] iArr = this.f1745c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.z;
            if (recyclerView.y == null || oVar == null || !oVar.A0()) {
                return;
            }
            if (z) {
                if (!recyclerView.q.p()) {
                    oVar.z(recyclerView.y.e(), this);
                }
            } else if (!recyclerView.m0()) {
                oVar.y(this.a, this.f1744b, recyclerView.u0, this);
            }
            int i2 = this.f1746d;
            if (i2 > oVar.q) {
                oVar.q = i2;
                oVar.r = z;
                recyclerView.o.K();
            }
        }

        boolean d(int i2) {
            if (this.f1745c != null) {
                int i3 = this.f1746d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f1745c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i2, int i3) {
            this.a = i2;
            this.f1744b = i3;
        }
    }

    /* compiled from: GapWorker.java */
    static class c {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        public int f1747b;

        /* renamed from: c, reason: collision with root package name */
        public int f1748c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f1749d;

        /* renamed from: e, reason: collision with root package name */
        public int f1750e;

        c() {
        }

        public void a() {
            this.a = false;
            this.f1747b = 0;
            this.f1748c = 0;
            this.f1749d = null;
            this.f1750e = 0;
        }
    }

    j() {
    }

    private void b() {
        c cVar;
        int size = this.f1740g.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView = this.f1740g.get(i3);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.t0.c(recyclerView, false);
                i2 += recyclerView.t0.f1746d;
            }
        }
        this.f1743j.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView2 = this.f1740g.get(i5);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.t0;
                int iAbs = Math.abs(bVar.a) + Math.abs(bVar.f1744b);
                for (int i6 = 0; i6 < bVar.f1746d * 2; i6 += 2) {
                    if (i4 >= this.f1743j.size()) {
                        cVar = new c();
                        this.f1743j.add(cVar);
                    } else {
                        cVar = this.f1743j.get(i4);
                    }
                    int[] iArr = bVar.f1745c;
                    int i7 = iArr[i6 + 1];
                    cVar.a = i7 <= iAbs;
                    cVar.f1747b = iAbs;
                    cVar.f1748c = i7;
                    cVar.f1749d = recyclerView2;
                    cVar.f1750e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f1743j, f1739f);
    }

    private void c(c cVar, long j2) {
        RecyclerView.d0 d0VarI = i(cVar.f1749d, cVar.f1750e, cVar.a ? Long.MAX_VALUE : j2);
        if (d0VarI == null || d0VarI.f1547g == null || !d0VarI.t() || d0VarI.u()) {
            return;
        }
        h(d0VarI.f1547g.get(), j2);
    }

    private void d(long j2) {
        for (int i2 = 0; i2 < this.f1743j.size(); i2++) {
            c cVar = this.f1743j.get(i2);
            if (cVar.f1749d == null) {
                return;
            }
            c(cVar, j2);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i2) {
        int iJ = recyclerView.r.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            RecyclerView.d0 d0VarG0 = RecyclerView.g0(recyclerView.r.i(i3));
            if (d0VarG0.f1548h == i2 && !d0VarG0.u()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j2) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.Q && recyclerView.r.j() != 0) {
            recyclerView.V0();
        }
        b bVar = recyclerView.t0;
        bVar.c(recyclerView, true);
        if (bVar.f1746d != 0) {
            try {
                c.h.h.g.a("RV Nested Prefetch");
                recyclerView.u0.f(recyclerView.y);
                for (int i2 = 0; i2 < bVar.f1746d * 2; i2 += 2) {
                    i(recyclerView, bVar.f1745c[i2], j2);
                }
            } finally {
                c.h.h.g.b();
            }
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i2, long j2) {
        if (e(recyclerView, i2)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.o;
        try {
            recyclerView.H0();
            RecyclerView.d0 d0VarI = vVar.I(i2, false, j2);
            if (d0VarI != null) {
                if (!d0VarI.t() || d0VarI.u()) {
                    vVar.a(d0VarI, false);
                } else {
                    vVar.B(d0VarI.f1546f);
                }
            }
            return d0VarI;
        } finally {
            recyclerView.J0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1740g.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f1741h == 0) {
            this.f1741h = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.t0.e(i2, i3);
    }

    void g(long j2) {
        b();
        d(j2);
    }

    public void j(RecyclerView recyclerView) {
        this.f1740g.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            c.h.h.g.a("RV Prefetch");
            if (!this.f1740g.isEmpty()) {
                int size = this.f1740g.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = this.f1740g.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1742i);
                }
            }
        } finally {
            this.f1741h = 0L;
            c.h.h.g.b();
        }
    }
}