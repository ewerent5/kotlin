package c.f.b;

import c.f.b.b;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class h extends c.f.b.b {

    /* renamed from: g, reason: collision with root package name */
    private int f2789g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f2790h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f2791i;

    /* renamed from: j, reason: collision with root package name */
    private int f2792j;

    /* renamed from: k, reason: collision with root package name */
    b f2793k;

    /* renamed from: l, reason: collision with root package name */
    c f2794l;

    /* compiled from: PriorityGoalRow.java */
    class a implements Comparator<i>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f2801d - iVar2.f2801d;
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

    /* compiled from: PriorityGoalRow.java */
    class b implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        i f2796e;

        /* renamed from: f, reason: collision with root package name */
        h f2797f;

        public b(h hVar) {
            this.f2797f = hVar;
        }

        public boolean a(i iVar, float f2) {
            boolean z = true;
            if (!this.f2796e.f2799b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = iVar.f2807j[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f2796e.f2807j[i2] = f4;
                    } else {
                        this.f2796e.f2807j[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f2796e.f2807j;
                fArr[i3] = fArr[i3] + (iVar.f2807j[i3] * f2);
                if (Math.abs(fArr[i3]) < 1.0E-4f) {
                    this.f2796e.f2807j[i3] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.G(this.f2796e);
            }
            return false;
        }

        public void b(i iVar) {
            this.f2796e = iVar;
        }

        public final boolean c() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f2796e.f2807j[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2796e.f2801d - ((i) obj).f2801d;
        }

        public final boolean d(i iVar) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = iVar.f2807j[i2];
                float f3 = this.f2796e.f2807j[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f2796e.f2807j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f2796e != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f2796e.f2807j[i2] + " ";
                }
            }
            return str + "] " + this.f2796e;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f2789g = 128;
        this.f2790h = new i[128];
        this.f2791i = new i[128];
        this.f2792j = 0;
        this.f2793k = new b(this);
        this.f2794l = cVar;
    }

    private final void F(i iVar) {
        int i2;
        int i3 = this.f2792j + 1;
        i[] iVarArr = this.f2790h;
        if (i3 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f2790h = iVarArr2;
            this.f2791i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f2790h;
        int i4 = this.f2792j;
        iVarArr3[i4] = iVar;
        int i5 = i4 + 1;
        this.f2792j = i5;
        if (i5 > 1 && iVarArr3[i5 - 1].f2801d > iVar.f2801d) {
            int i6 = 0;
            while (true) {
                i2 = this.f2792j;
                if (i6 >= i2) {
                    break;
                }
                this.f2791i[i6] = this.f2790h[i6];
                i6++;
            }
            Arrays.sort(this.f2791i, 0, i2, new a());
            for (int i7 = 0; i7 < this.f2792j; i7++) {
                this.f2790h[i7] = this.f2791i[i7];
            }
        }
        iVar.f2799b = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i2 = 0;
        while (i2 < this.f2792j) {
            if (this.f2790h[i2] == iVar) {
                while (true) {
                    int i3 = this.f2792j;
                    if (i2 >= i3 - 1) {
                        this.f2792j = i3 - 1;
                        iVar.f2799b = false;
                        return;
                    } else {
                        i[] iVarArr = this.f2790h;
                        int i4 = i2 + 1;
                        iVarArr[i2] = iVarArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // c.f.b.b
    public void B(d dVar, c.f.b.b bVar, boolean z) {
        i iVar = bVar.a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f2770e;
        int iA = aVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            i iVarB = aVar.b(i2);
            float fD = aVar.d(i2);
            this.f2793k.b(iVarB);
            if (this.f2793k.a(iVar, fD)) {
                F(iVarB);
            }
            this.f2767b += bVar.f2767b * fD;
        }
        G(iVar);
    }

    @Override // c.f.b.b, c.f.b.d.a
    public void a(i iVar) {
        this.f2793k.b(iVar);
        this.f2793k.e();
        iVar.f2807j[iVar.f2803f] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // c.f.b.b, c.f.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.b.i b(c.f.b.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.f2792j
            if (r0 >= r2) goto L32
            c.f.b.i[] r2 = r4.f2790h
            r2 = r2[r0]
            int r3 = r2.f2801d
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            c.f.b.h$b r3 = r4.f2793k
            r3.b(r2)
            if (r1 != r5) goto L22
            c.f.b.h$b r2 = r4.f2793k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            c.f.b.h$b r2 = r4.f2793k
            c.f.b.i[] r3 = r4.f2790h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            c.f.b.i[] r5 = r4.f2790h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.h.b(c.f.b.d, boolean[]):c.f.b.i");
    }

    @Override // c.f.b.b, c.f.b.d.a
    public void clear() {
        this.f2792j = 0;
        this.f2767b = 0.0f;
    }

    @Override // c.f.b.b, c.f.b.d.a
    public boolean isEmpty() {
        return this.f2792j == 0;
    }

    @Override // c.f.b.b
    public String toString() {
        String str = " goal -> (" + this.f2767b + ") : ";
        for (int i2 = 0; i2 < this.f2792j; i2++) {
            this.f2793k.b(this.f2790h[i2]);
            str = str + this.f2793k + " ";
        }
        return str;
    }
}