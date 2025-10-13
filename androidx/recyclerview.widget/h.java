package androidx.recyclerview.widget;

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
import java.util.Iterator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class h {
    private static final Comparator<g> a = new a();

    /* compiled from: DiffUtil.java */
    static class a implements Comparator<g>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int i2 = gVar.a - gVar2.a;
            return i2 == 0 ? gVar.f1720b - gVar2.f1720b : i2;
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

    /* compiled from: DiffUtil.java */
    public static abstract class b {
        public abstract boolean a(int i2, int i3);

        public abstract boolean b(int i2, int i3);

        public Object c(int i2, int i3) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil.java */
    public static class c {
        private final List<g> a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1709b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1710c;

        /* renamed from: d, reason: collision with root package name */
        private final b f1711d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1712e;

        /* renamed from: f, reason: collision with root package name */
        private final int f1713f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f1714g;

        c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.f1709b = iArr;
            this.f1710c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f1711d = bVar;
            this.f1712e = bVar.e();
            this.f1713f = bVar.d();
            this.f1714g = z;
            a();
            h();
        }

        private void a() {
            g gVar = this.a.isEmpty() ? null : this.a.get(0);
            if (gVar != null && gVar.a == 0 && gVar.f1720b == 0) {
                return;
            }
            g gVar2 = new g();
            gVar2.a = 0;
            gVar2.f1720b = 0;
            gVar2.f1722d = false;
            gVar2.f1721c = 0;
            gVar2.f1723e = false;
            this.a.add(0, gVar2);
        }

        private void b(List<e> list, n nVar, int i2, int i3, int i4) {
            if (!this.f1714g) {
                nVar.b(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.f1710c;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    nVar.b(i2, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f1715b++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    nVar.a(j(list, i8, true).f1715b, i2);
                    if (i7 == 4) {
                        nVar.d(i2, 1, this.f1711d.c(i8, i6));
                    }
                } else {
                    if (i7 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString(i7));
                    }
                    list.add(new e(i6, i2, false));
                }
            }
        }

        private void c(List<e> list, n nVar, int i2, int i3, int i4) {
            if (!this.f1714g) {
                nVar.c(i2, i3);
                return;
            }
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                int[] iArr = this.f1709b;
                int i6 = i4 + i5;
                int i7 = iArr[i6] & 31;
                if (i7 == 0) {
                    nVar.c(i2 + i5, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f1715b--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = iArr[i6] >> 5;
                    e eVarJ = j(list, i8, false);
                    nVar.a(i2 + i5, eVarJ.f1715b - 1);
                    if (i7 == 4) {
                        nVar.d(eVarJ.f1715b - 1, 1, this.f1711d.c(i6, i8));
                    }
                } else {
                    if (i7 != 16) {
                        throw new IllegalStateException("unknown flag for pos " + i6 + " " + Long.toBinaryString(i7));
                    }
                    list.add(new e(i6, i2 + i5, true));
                }
            }
        }

        private void f(int i2, int i3, int i4) {
            if (this.f1709b[i2 - 1] != 0) {
                return;
            }
            g(i2, i3, i4, false);
        }

        private boolean g(int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            int i7;
            if (z) {
                i3--;
                i6 = i2;
                i5 = i3;
            } else {
                i5 = i2 - 1;
                i6 = i5;
            }
            while (i4 >= 0) {
                g gVar = this.a.get(i4);
                int i8 = gVar.a;
                int i9 = gVar.f1721c;
                int i10 = i8 + i9;
                int i11 = gVar.f1720b + i9;
                if (z) {
                    for (int i12 = i6 - 1; i12 >= i10; i12--) {
                        if (this.f1711d.b(i12, i5)) {
                            i7 = this.f1711d.a(i12, i5) ? 8 : 4;
                            this.f1710c[i5] = (i12 << 5) | 16;
                            this.f1709b[i12] = (i5 << 5) | i7;
                            return true;
                        }
                    }
                } else {
                    for (int i13 = i3 - 1; i13 >= i11; i13--) {
                        if (this.f1711d.b(i5, i13)) {
                            i7 = this.f1711d.a(i5, i13) ? 8 : 4;
                            int i14 = i2 - 1;
                            this.f1709b[i14] = (i13 << 5) | 16;
                            this.f1710c[i13] = (i14 << 5) | i7;
                            return true;
                        }
                    }
                }
                i6 = gVar.a;
                i3 = gVar.f1720b;
                i4--;
            }
            return false;
        }

        private void h() {
            int i2 = this.f1712e;
            int i3 = this.f1713f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                g gVar = this.a.get(size);
                int i4 = gVar.a;
                int i5 = gVar.f1721c;
                int i6 = i4 + i5;
                int i7 = gVar.f1720b + i5;
                if (this.f1714g) {
                    while (i2 > i6) {
                        f(i2, i3, size);
                        i2--;
                    }
                    while (i3 > i7) {
                        i(i2, i3, size);
                        i3--;
                    }
                }
                for (int i8 = 0; i8 < gVar.f1721c; i8++) {
                    int i9 = gVar.a + i8;
                    int i10 = gVar.f1720b + i8;
                    int i11 = this.f1711d.a(i9, i10) ? 1 : 2;
                    this.f1709b[i9] = (i10 << 5) | i11;
                    this.f1710c[i10] = (i9 << 5) | i11;
                }
                i2 = gVar.a;
                i3 = gVar.f1720b;
            }
        }

        private void i(int i2, int i3, int i4) {
            if (this.f1710c[i3 - 1] != 0) {
                return;
            }
            g(i2, i3, i4, true);
        }

        private static e j(List<e> list, int i2, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.a == i2 && eVar.f1716c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f1715b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public void d(n nVar) {
            androidx.recyclerview.widget.e eVar = nVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) nVar : new androidx.recyclerview.widget.e(nVar);
            ArrayList arrayList = new ArrayList();
            int i2 = this.f1712e;
            int i3 = this.f1713f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                g gVar = this.a.get(size);
                int i4 = gVar.f1721c;
                int i5 = gVar.a + i4;
                int i6 = gVar.f1720b + i4;
                if (i5 < i2) {
                    c(arrayList, eVar, i5, i2 - i5, i5);
                }
                if (i6 < i3) {
                    b(arrayList, eVar, i5, i3 - i6, i6);
                }
                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                    int[] iArr = this.f1709b;
                    int i8 = gVar.a;
                    if ((iArr[i8 + i7] & 31) == 2) {
                        eVar.d(i8 + i7, 1, this.f1711d.c(i8 + i7, gVar.f1720b + i7));
                    }
                }
                i2 = gVar.a;
                i3 = gVar.f1720b;
            }
            eVar.e();
        }

        public void e(RecyclerView.g gVar) {
            d(new androidx.recyclerview.widget.b(gVar));
        }
    }

    /* compiled from: DiffUtil.java */
    public static abstract class d<T> {
        public abstract boolean a(T t, T t2);

        public abstract boolean b(T t, T t2);

        public Object c(T t, T t2) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    private static class e {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1715b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1716c;

        public e(int i2, int i3, boolean z) {
            this.a = i2;
            this.f1715b = i3;
            this.f1716c = z;
        }
    }

    /* compiled from: DiffUtil.java */
    static class f {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1717b;

        /* renamed from: c, reason: collision with root package name */
        int f1718c;

        /* renamed from: d, reason: collision with root package name */
        int f1719d;

        public f() {
        }

        public f(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.f1717b = i3;
            this.f1718c = i4;
            this.f1719d = i5;
        }
    }

    /* compiled from: DiffUtil.java */
    static class g {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1720b;

        /* renamed from: c, reason: collision with root package name */
        int f1721c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1722d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1723e;

        g() {
        }
    }

    public static c a(b bVar) {
        return b(bVar, true);
    }

    public static c b(b bVar, boolean z) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(0, iE, 0, iD));
        int iAbs = iE + iD + Math.abs(iE - iD);
        int i2 = iAbs * 2;
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar = (f) arrayList2.remove(arrayList2.size() - 1);
            g gVarC = c(bVar, fVar.a, fVar.f1717b, fVar.f1718c, fVar.f1719d, iArr, iArr2, iAbs);
            if (gVarC != null) {
                if (gVarC.f1721c > 0) {
                    arrayList.add(gVarC);
                }
                gVarC.a += fVar.a;
                gVarC.f1720b += fVar.f1718c;
                f fVar2 = arrayList3.isEmpty() ? new f() : (f) arrayList3.remove(arrayList3.size() - 1);
                fVar2.a = fVar.a;
                fVar2.f1718c = fVar.f1718c;
                if (gVarC.f1723e) {
                    fVar2.f1717b = gVarC.a;
                    fVar2.f1719d = gVarC.f1720b;
                } else if (gVarC.f1722d) {
                    fVar2.f1717b = gVarC.a - 1;
                    fVar2.f1719d = gVarC.f1720b;
                } else {
                    fVar2.f1717b = gVarC.a;
                    fVar2.f1719d = gVarC.f1720b - 1;
                }
                arrayList2.add(fVar2);
                if (!gVarC.f1723e) {
                    int i3 = gVarC.a;
                    int i4 = gVarC.f1721c;
                    fVar.a = i3 + i4;
                    fVar.f1718c = gVarC.f1720b + i4;
                } else if (gVarC.f1722d) {
                    int i5 = gVarC.a;
                    int i6 = gVarC.f1721c;
                    fVar.a = i5 + i6 + 1;
                    fVar.f1718c = gVarC.f1720b + i6;
                } else {
                    int i7 = gVarC.a;
                    int i8 = gVarC.f1721c;
                    fVar.a = i7 + i8;
                    fVar.f1718c = gVarC.f1720b + i8 + 1;
                }
                arrayList2.add(fVar);
            } else {
                arrayList3.add(fVar);
            }
        }
        Collections.sort(arrayList, a);
        return new c(bVar, arrayList, iArr, iArr2, z);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:52:0x00cd
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.recyclerview.widget.h.g c(androidx.recyclerview.widget.h.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.c(androidx.recyclerview.widget.h$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.h$g");
    }
}