package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.h.l.c0.c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean M;
    int N;
    int[] O;
    View[] P;
    final SparseIntArray Q;
    final SparseIntArray R;
    c S;
    final Rect T;
    private boolean U;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i2, int i3) {
            return i2 % i3;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i2) {
            return 1;
        }
    }

    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f1490b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f1491c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1492d = false;

        static int a(SparseIntArray sparseIntArray, int i2) {
            int size = sparseIntArray.size() - 1;
            int i3 = 0;
            while (i3 <= size) {
                int i4 = (i3 + size) >>> 1;
                if (sparseIntArray.keyAt(i4) < i2) {
                    i3 = i4 + 1;
                } else {
                    size = i4 - 1;
                }
            }
            int i5 = i3 - 1;
            if (i5 < 0 || i5 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i5);
        }

        int b(int i2, int i3) {
            if (!this.f1492d) {
                return d(i2, i3);
            }
            int i4 = this.f1490b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iD = d(i2, i3);
            this.f1490b.put(i2, iD);
            return iD;
        }

        int c(int i2, int i3) {
            if (!this.f1491c) {
                return e(i2, i3);
            }
            int i4 = this.a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int iE = e(i2, i3);
            this.a.put(i2, iE);
            return iE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f1492d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f1490b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f1490b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i2, int i3);

        public abstract int f(int i2);

        public void g() {
            this.f1490b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.M = false;
        this.N = -1;
        this.Q = new SparseIntArray();
        this.R = new SparseIntArray();
        this.S = new a();
        this.T = new Rect();
        n3(RecyclerView.o.o0(context, attributeSet, i2, i3).f1572b);
    }

    private void W2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, boolean z) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = -1;
        if (z) {
            i6 = i2;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = i2 - 1;
            i4 = -1;
        }
        while (i3 != i6) {
            View view = this.P[i3];
            b bVar = (b) view.getLayoutParams();
            int iJ3 = j3(vVar, a0Var, n0(view));
            bVar.f1489j = iJ3;
            bVar.f1488i = i5;
            i5 += iJ3;
            i3 += i4;
        }
    }

    private void X2() {
        int iT = T();
        for (int i2 = 0; i2 < iT; i2++) {
            b bVar = (b) S(i2).getLayoutParams();
            int iA = bVar.a();
            this.Q.put(iA, bVar.i());
            this.R.put(iA, bVar.g());
        }
    }

    private void Y2(int i2) {
        this.O = Z2(this.O, this.N, i2);
    }

    static int[] Z2(int[] iArr, int i2, int i3) {
        int i4;
        if (iArr == null || iArr.length != i2 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i2 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i3 / i2;
        int i7 = i3 % i2;
        int i8 = 0;
        for (int i9 = 1; i9 <= i2; i9++) {
            i5 += i7;
            if (i5 <= 0 || i2 - i5 >= i7) {
                i4 = i6;
            } else {
                i4 = i6 + 1;
                i5 -= i2;
            }
            i8 += i4;
            iArr[i9] = i8;
        }
        return iArr;
    }

    private void a3() {
        this.Q.clear();
        this.R.clear();
    }

    private int b3(RecyclerView.a0 a0Var) {
        if (T() != 0 && a0Var.b() != 0) {
            c2();
            boolean zA2 = A2();
            View viewH2 = h2(!zA2, true);
            View viewG2 = g2(!zA2, true);
            if (viewH2 != null && viewG2 != null) {
                int iB = this.S.b(n0(viewH2), this.N);
                int iB2 = this.S.b(n0(viewG2), this.N);
                int iMax = this.B ? Math.max(0, ((this.S.b(a0Var.b() - 1, this.N) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zA2) {
                    return Math.round((iMax * (Math.abs(this.y.d(viewG2) - this.y.g(viewH2)) / ((this.S.b(n0(viewG2), this.N) - this.S.b(n0(viewH2), this.N)) + 1))) + (this.y.m() - this.y.g(viewH2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int c3(RecyclerView.a0 a0Var) {
        if (T() != 0 && a0Var.b() != 0) {
            c2();
            View viewH2 = h2(!A2(), true);
            View viewG2 = g2(!A2(), true);
            if (viewH2 != null && viewG2 != null) {
                if (!A2()) {
                    return this.S.b(a0Var.b() - 1, this.N) + 1;
                }
                int iD = this.y.d(viewG2) - this.y.g(viewH2);
                int iB = this.S.b(n0(viewH2), this.N);
                return (int) ((iD / ((this.S.b(n0(viewG2), this.N) - iB) + 1)) * (this.S.b(a0Var.b() - 1, this.N) + 1));
            }
        }
        return 0;
    }

    private void d3(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        boolean z = i2 == 1;
        int iI3 = i3(vVar, a0Var, aVar.f1493b);
        if (z) {
            while (iI3 > 0) {
                int i3 = aVar.f1493b;
                if (i3 <= 0) {
                    return;
                }
                int i4 = i3 - 1;
                aVar.f1493b = i4;
                iI3 = i3(vVar, a0Var, i4);
            }
            return;
        }
        int iB = a0Var.b() - 1;
        int i5 = aVar.f1493b;
        while (i5 < iB) {
            int i6 = i5 + 1;
            int iI32 = i3(vVar, a0Var, i6);
            if (iI32 <= iI3) {
                break;
            }
            i5 = i6;
            iI3 = iI32;
        }
        aVar.f1493b = i5;
    }

    private void e3() {
        View[] viewArr = this.P;
        if (viewArr == null || viewArr.length != this.N) {
            this.P = new View[this.N];
        }
    }

    private int h3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.S.b(i2, this.N);
        }
        int iF = vVar.f(i2);
        if (iF != -1) {
            return this.S.b(iF, this.N);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    private int i3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.S.c(i2, this.N);
        }
        int i3 = this.R.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF = vVar.f(i2);
        if (iF != -1) {
            return this.S.c(iF, this.N);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    private int j3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.e()) {
            return this.S.f(i2);
        }
        int i3 = this.Q.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int iF = vVar.f(i2);
        if (iF != -1) {
            return this.S.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 1;
    }

    private void k3(float f2, int i2) {
        Y2(Math.max(Math.round(f2 * this.N), i2));
    }

    private void l3(View view, int i2, boolean z) {
        int iU;
        int iU2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1576f;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iF3 = f3(bVar.f1488i, bVar.f1489j);
        if (this.w == 1) {
            iU2 = RecyclerView.o.U(iF3, i2, i4, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iU = RecyclerView.o.U(this.y.n(), h0(), i3, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iU3 = RecyclerView.o.U(iF3, i2, i3, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iU4 = RecyclerView.o.U(this.y.n(), v0(), i4, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iU = iU3;
            iU2 = iU4;
        }
        m3(view, iU2, iU, z);
    }

    private void m3(View view, int i2, int i3, boolean z) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? Q1(view, i2, i3, pVar) : O1(view, i2, i3, pVar)) {
            view.measure(i2, i3);
        }
    }

    private void o3() {
        int iG0;
        int paddingTop;
        if (y2() == 1) {
            iG0 = u0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            iG0 = g0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        Y2(iG0 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int B(RecyclerView.a0 a0Var) {
        return this.U ? b3(a0Var) : super.B(a0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void B2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.B2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int C(RecyclerView.a0 a0Var) {
        return this.U ? c3(a0Var) : super.C(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void D2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        super.D2(vVar, a0Var, aVar, i2);
        o3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            d3(vVar, a0Var, aVar, i2);
        }
        e3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int E(RecyclerView.a0 a0Var) {
        return this.U ? b3(a0Var) : super.E(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int E1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        o3();
        e3();
        return super.E1(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int F(RecyclerView.a0 a0Var) {
        return this.U ? c3(a0Var) : super.F(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int G1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        o3();
        e3();
        return super.G1(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L1(Rect rect, int i2, int i3) {
        int iX;
        int iX2;
        if (this.O == null) {
            super.L1(rect, i2, i3);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.w == 1) {
            iX2 = RecyclerView.o.x(i3, rect.height() + paddingTop, l0());
            int[] iArr = this.O;
            iX = RecyclerView.o.x(i2, iArr[iArr.length - 1] + paddingLeft, m0());
        } else {
            iX = RecyclerView.o.x(i2, rect.width() + paddingLeft, m0());
            int[] iArr2 = this.O;
            iX2 = RecyclerView.o.x(i3, iArr2[iArr2.length - 1] + paddingTop, l0());
        }
        K1(iX, iX2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p N() {
        return this.w == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void N2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.N2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p O(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p P(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View Q0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean U1() {
        return this.H == null && !this.M;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, c.h.l.c0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.V0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iH3 = h3(vVar, a0Var, bVar.a());
        if (this.w == 0) {
            cVar.b0(c.C0058c.f(bVar.g(), bVar.i(), iH3, 1, false, false));
        } else {
            cVar.b0(c.C0058c.f(iH3, 1, bVar.g(), bVar.i(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void W1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iF = this.N;
        for (int i2 = 0; i2 < this.N && cVar.c(a0Var) && iF > 0; i2++) {
            int i3 = cVar.f1502d;
            cVar2.a(i3, Math.max(0, cVar.f1505g));
            iF -= this.S.f(i3);
            cVar.f1502d += cVar.f1503e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int X(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 1) {
            return this.N;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return h3(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i2, int i3) {
        this.S.h();
        this.S.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView) {
        this.S.h();
        this.S.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.S.h();
        this.S.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView recyclerView, int i2, int i3) {
        this.S.h();
        this.S.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.S.h();
        this.S.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            X2();
        }
        super.e1(vVar, a0Var);
        a3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.M = false;
    }

    int f3(int i2, int i3) {
        if (this.w != 1 || !z2()) {
            int[] iArr = this.O;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.O;
        int i4 = this.N;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public int g3() {
        return this.N;
    }

    public void n3(int i2) {
        if (i2 == this.N) {
            return;
        }
        this.M = true;
        if (i2 >= 1) {
            this.N = i2;
            this.S.h();
            B1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 0) {
            return this.N;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return h3(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View q2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3, int i4) {
        c2();
        int iM = this.y.m();
        int i5 = this.y.i();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View viewS = S(i2);
            int iN0 = n0(viewS);
            if (iN0 >= 0 && iN0 < i4 && i3(vVar, a0Var, iN0) == 0) {
                if (((RecyclerView.p) viewS.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewS;
                    }
                } else {
                    if (this.y.g(viewS) < i5 && this.y.d(viewS) >= iM) {
                        return viewS;
                    }
                    if (view == null) {
                        view = viewS;
                    }
                }
            }
            i2 += i6;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public static class b extends RecyclerView.p {

        /* renamed from: i, reason: collision with root package name */
        int f1488i;

        /* renamed from: j, reason: collision with root package name */
        int f1489j;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1488i = -1;
            this.f1489j = 0;
        }

        public int g() {
            return this.f1488i;
        }

        public int i() {
            return this.f1489j;
        }

        public b(int i2, int i3) {
            super(i2, i3);
            this.f1488i = -1;
            this.f1489j = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1488i = -1;
            this.f1489j = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1488i = -1;
            this.f1489j = 0;
        }
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i3, z);
        this.M = false;
        this.N = -1;
        this.Q = new SparseIntArray();
        this.R = new SparseIntArray();
        this.S = new a();
        this.T = new Rect();
        n3(i2);
    }
}