package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import c.h.l.c0.c;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    private int A;
    private int B;
    private final k C;
    private BitSet F;
    private boolean K;
    private boolean L;
    private e M;
    private int N;
    private int[] S;
    f[] x;
    p y;
    p z;
    private int w = -1;
    boolean D = false;
    boolean E = false;
    int G = -1;
    int H = Level.ALL_INT;
    d I = new d();
    private int J = 2;
    private final Rect O = new Rect();
    private final b P = new b();
    private boolean Q = false;
    private boolean R = true;
    private final Runnable T = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.b2();
        }
    }

    class b {
        int a;

        /* renamed from: b, reason: collision with root package name */
        int f1606b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1607c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1608d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1609e;

        /* renamed from: f, reason: collision with root package name */
        int[] f1610f;

        b() {
            c();
        }

        void a() {
            this.f1606b = this.f1607c ? StaggeredGridLayoutManager.this.y.i() : StaggeredGridLayoutManager.this.y.m();
        }

        void b(int i2) {
            if (this.f1607c) {
                this.f1606b = StaggeredGridLayoutManager.this.y.i() - i2;
            } else {
                this.f1606b = StaggeredGridLayoutManager.this.y.m() + i2;
            }
        }

        void c() {
            this.a = -1;
            this.f1606b = Level.ALL_INT;
            this.f1607c = false;
            this.f1608d = false;
            this.f1609e = false;
            int[] iArr = this.f1610f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f1610f;
            if (iArr == null || iArr.length < length) {
                this.f1610f = new int[StaggeredGridLayoutManager.this.x.length];
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.f1610f[i2] = fVarArr[i2].r(Level.ALL_INT);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: i, reason: collision with root package name */
        f f1612i;

        /* renamed from: j, reason: collision with root package name */
        boolean f1613j;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int g() {
            f fVar = this.f1612i;
            if (fVar == null) {
                return -1;
            }
            return fVar.f1631e;
        }

        public boolean i() {
            return this.f1613j;
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        int f1619e;

        /* renamed from: f, reason: collision with root package name */
        int f1620f;

        /* renamed from: g, reason: collision with root package name */
        int f1621g;

        /* renamed from: h, reason: collision with root package name */
        int[] f1622h;

        /* renamed from: i, reason: collision with root package name */
        int f1623i;

        /* renamed from: j, reason: collision with root package name */
        int[] f1624j;

        /* renamed from: k, reason: collision with root package name */
        List<d.a> f1625k;

        /* renamed from: l, reason: collision with root package name */
        boolean f1626l;

        /* renamed from: m, reason: collision with root package name */
        boolean f1627m;
        boolean n;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        void a() {
            this.f1622h = null;
            this.f1621g = 0;
            this.f1619e = -1;
            this.f1620f = -1;
        }

        void b() {
            this.f1622h = null;
            this.f1621g = 0;
            this.f1623i = 0;
            this.f1624j = null;
            this.f1625k = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1619e);
            parcel.writeInt(this.f1620f);
            parcel.writeInt(this.f1621g);
            if (this.f1621g > 0) {
                parcel.writeIntArray(this.f1622h);
            }
            parcel.writeInt(this.f1623i);
            if (this.f1623i > 0) {
                parcel.writeIntArray(this.f1624j);
            }
            parcel.writeInt(this.f1626l ? 1 : 0);
            parcel.writeInt(this.f1627m ? 1 : 0);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeList(this.f1625k);
        }

        e(Parcel parcel) {
            this.f1619e = parcel.readInt();
            this.f1620f = parcel.readInt();
            int i2 = parcel.readInt();
            this.f1621g = i2;
            if (i2 > 0) {
                int[] iArr = new int[i2];
                this.f1622h = iArr;
                parcel.readIntArray(iArr);
            }
            int i3 = parcel.readInt();
            this.f1623i = i3;
            if (i3 > 0) {
                int[] iArr2 = new int[i3];
                this.f1624j = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f1626l = parcel.readInt() == 1;
            this.f1627m = parcel.readInt() == 1;
            this.n = parcel.readInt() == 1;
            this.f1625k = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1621g = eVar.f1621g;
            this.f1619e = eVar.f1619e;
            this.f1620f = eVar.f1620f;
            this.f1622h = eVar.f1622h;
            this.f1623i = eVar.f1623i;
            this.f1624j = eVar.f1624j;
            this.f1626l = eVar.f1626l;
            this.f1627m = eVar.f1627m;
            this.n = eVar.n;
            this.f1625k = eVar.f1625k;
        }
    }

    class f {
        ArrayList<View> a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f1628b = Level.ALL_INT;

        /* renamed from: c, reason: collision with root package name */
        int f1629c = Level.ALL_INT;

        /* renamed from: d, reason: collision with root package name */
        int f1630d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f1631e;

        f(int i2) {
            this.f1631e = i2;
        }

        void a(View view) {
            c cVarP = p(view);
            cVarP.f1612i = this;
            this.a.add(view);
            this.f1629c = Level.ALL_INT;
            if (this.a.size() == 1) {
                this.f1628b = Level.ALL_INT;
            }
            if (cVarP.c() || cVarP.b()) {
                this.f1630d += StaggeredGridLayoutManager.this.y.e(view);
            }
        }

        void b(boolean z, int i2) {
            int iN = z ? n(Level.ALL_INT) : r(Level.ALL_INT);
            e();
            if (iN == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iN >= StaggeredGridLayoutManager.this.y.i()) {
                if (z || iN <= StaggeredGridLayoutManager.this.y.m()) {
                    if (i2 != Integer.MIN_VALUE) {
                        iN += i2;
                    }
                    this.f1629c = iN;
                    this.f1628b = iN;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarP = p(view);
            this.f1629c = StaggeredGridLayoutManager.this.y.d(view);
            if (cVarP.f1613j && (aVarF = StaggeredGridLayoutManager.this.I.f(cVarP.a())) != null && aVarF.f1616f == 1) {
                this.f1629c += aVarF.a(this.f1631e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.a.get(0);
            c cVarP = p(view);
            this.f1628b = StaggeredGridLayoutManager.this.y.g(view);
            if (cVarP.f1613j && (aVarF = StaggeredGridLayoutManager.this.I.f(cVarP.a())) != null && aVarF.f1616f == -1) {
                this.f1628b -= aVarF.a(this.f1631e);
            }
        }

        void e() {
            this.a.clear();
            s();
            this.f1630d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.D ? j(this.a.size() - 1, -1, true) : j(0, this.a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.D ? j(0, this.a.size(), true) : j(this.a.size() - 1, -1, true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.D ? k(0, this.a.size(), false) : k(this.a.size() - 1, -1, false);
        }

        int i(int i2, int i3, boolean z, boolean z2, boolean z3) {
            int iM = StaggeredGridLayoutManager.this.y.m();
            int i4 = StaggeredGridLayoutManager.this.y.i();
            int i5 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int iG = StaggeredGridLayoutManager.this.y.g(view);
                int iD = StaggeredGridLayoutManager.this.y.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iG >= i4 : iG > i4;
                if (!z3 ? iD > iM : iD >= iM) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iG >= iM && iD <= i4) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                        if (iG < iM || iD > i4) {
                            return StaggeredGridLayoutManager.this.n0(view);
                        }
                    }
                }
                i2 += i5;
            }
            return -1;
        }

        int j(int i2, int i3, boolean z) {
            return i(i2, i3, false, false, z);
        }

        int k(int i2, int i3, boolean z) {
            return i(i2, i3, z, true, false);
        }

        public int l() {
            return this.f1630d;
        }

        int m() {
            int i2 = this.f1629c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            c();
            return this.f1629c;
        }

        int n(int i2) {
            int i3 = this.f1629c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            c();
            return this.f1629c;
        }

        public View o(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.D && staggeredGridLayoutManager.n0(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.D && staggeredGridLayoutManager2.n0(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.D && staggeredGridLayoutManager3.n0(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.D && staggeredGridLayoutManager4.n0(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        c p(View view) {
            return (c) view.getLayoutParams();
        }

        int q() {
            int i2 = this.f1628b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            d();
            return this.f1628b;
        }

        int r(int i2) {
            int i3 = this.f1628b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            d();
            return this.f1628b;
        }

        void s() {
            this.f1628b = Level.ALL_INT;
            this.f1629c = Level.ALL_INT;
        }

        void t(int i2) {
            int i3 = this.f1628b;
            if (i3 != Integer.MIN_VALUE) {
                this.f1628b = i3 + i2;
            }
            int i4 = this.f1629c;
            if (i4 != Integer.MIN_VALUE) {
                this.f1629c = i4 + i2;
            }
        }

        void u() {
            int size = this.a.size();
            View viewRemove = this.a.remove(size - 1);
            c cVarP = p(viewRemove);
            cVarP.f1612i = null;
            if (cVarP.c() || cVarP.b()) {
                this.f1630d -= StaggeredGridLayoutManager.this.y.e(viewRemove);
            }
            if (size == 1) {
                this.f1628b = Level.ALL_INT;
            }
            this.f1629c = Level.ALL_INT;
        }

        void v() {
            View viewRemove = this.a.remove(0);
            c cVarP = p(viewRemove);
            cVarP.f1612i = null;
            if (this.a.size() == 0) {
                this.f1629c = Level.ALL_INT;
            }
            if (cVarP.c() || cVarP.b()) {
                this.f1630d -= StaggeredGridLayoutManager.this.y.e(viewRemove);
            }
            this.f1628b = Level.ALL_INT;
        }

        void w(View view) {
            c cVarP = p(view);
            cVarP.f1612i = this;
            this.a.add(0, view);
            this.f1628b = Level.ALL_INT;
            if (this.a.size() == 1) {
                this.f1629c = Level.ALL_INT;
            }
            if (cVarP.c() || cVarP.b()) {
                this.f1630d += StaggeredGridLayoutManager.this.y.e(view);
            }
        }

        void x(int i2) {
            this.f1628b = i2;
            this.f1629c = i2;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.o.d dVarO0 = RecyclerView.o.o0(context, attributeSet, i2, i3);
        R2(dVarO0.a);
        T2(dVarO0.f1572b);
        S2(dVarO0.f1573c);
        this.C = new k();
        j2();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.E
            if (r0 == 0) goto L9
            int r0 = r6.u2()
            goto Ld
        L9:
            int r0 = r6.t2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.I
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.I
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.I
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.I
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.I
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.E
            if (r7 == 0) goto L4d
            int r7 = r6.t2()
            goto L51
        L4d:
            int r7 = r6.u2()
        L51:
            if (r3 > r7) goto L56
            r6.B1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(int, int, int):void");
    }

    private void E2(View view, int i2, int i3, boolean z) {
        t(view, this.O);
        c cVar = (c) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.O;
        int iB3 = b3(i2, i4 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.O;
        int iB32 = b3(i3, i5 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? Q1(view, iB3, iB32, cVar) : O1(view, iB3, iB32, cVar)) {
            view.measure(iB3, iB32);
        }
    }

    private void F2(View view, c cVar, boolean z) {
        if (cVar.f1613j) {
            if (this.A == 1) {
                E2(view, this.N, RecyclerView.o.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                E2(view, RecyclerView.o.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.N, z);
                return;
            }
        }
        if (this.A == 1) {
            E2(view, RecyclerView.o.U(this.B, v0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.U(g0(), h0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            E2(view, RecyclerView.o.U(u0(), v0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.U(this.B, h0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean H2(int i2) {
        if (this.A == 0) {
            return (i2 == -1) != this.E;
        }
        return ((i2 == -1) == this.E) == D2();
    }

    private void J2(View view) {
        for (int i2 = this.w - 1; i2 >= 0; i2--) {
            this.x[i2].w(view);
        }
    }

    private void K2(RecyclerView.v vVar, k kVar) {
        if (!kVar.a || kVar.f1758i) {
            return;
        }
        if (kVar.f1751b == 0) {
            if (kVar.f1754e == -1) {
                L2(vVar, kVar.f1756g);
                return;
            } else {
                M2(vVar, kVar.f1755f);
                return;
            }
        }
        if (kVar.f1754e != -1) {
            int iX2 = x2(kVar.f1756g) - kVar.f1756g;
            M2(vVar, iX2 < 0 ? kVar.f1755f : Math.min(iX2, kVar.f1751b) + kVar.f1755f);
        } else {
            int i2 = kVar.f1755f;
            int iW2 = i2 - w2(i2);
            L2(vVar, iW2 < 0 ? kVar.f1756g : kVar.f1756g - Math.min(iW2, kVar.f1751b));
        }
    }

    private void L2(RecyclerView.v vVar, int i2) {
        for (int iT = T() - 1; iT >= 0; iT--) {
            View viewS = S(iT);
            if (this.y.g(viewS) < i2 || this.y.q(viewS) < i2) {
                return;
            }
            c cVar = (c) viewS.getLayoutParams();
            if (cVar.f1613j) {
                for (int i3 = 0; i3 < this.w; i3++) {
                    if (this.x[i3].a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.w; i4++) {
                    this.x[i4].u();
                }
            } else if (cVar.f1612i.a.size() == 1) {
                return;
            } else {
                cVar.f1612i.u();
            }
            u1(viewS, vVar);
        }
    }

    private void M2(RecyclerView.v vVar, int i2) {
        while (T() > 0) {
            View viewS = S(0);
            if (this.y.d(viewS) > i2 || this.y.p(viewS) > i2) {
                return;
            }
            c cVar = (c) viewS.getLayoutParams();
            if (cVar.f1613j) {
                for (int i3 = 0; i3 < this.w; i3++) {
                    if (this.x[i3].a.size() == 1) {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.w; i4++) {
                    this.x[i4].v();
                }
            } else if (cVar.f1612i.a.size() == 1) {
                return;
            } else {
                cVar.f1612i.v();
            }
            u1(viewS, vVar);
        }
    }

    private void N2() {
        if (this.z.k() == 1073741824) {
            return;
        }
        float fMax = 0.0f;
        int iT = T();
        for (int i2 = 0; i2 < iT; i2++) {
            View viewS = S(i2);
            float fE = this.z.e(viewS);
            if (fE >= fMax) {
                if (((c) viewS.getLayoutParams()).i()) {
                    fE = (fE * 1.0f) / this.w;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i3 = this.B;
        int iRound = Math.round(fMax * this.w);
        if (this.z.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.z.n());
        }
        Z2(iRound);
        if (this.B == i3) {
            return;
        }
        for (int i4 = 0; i4 < iT; i4++) {
            View viewS2 = S(i4);
            c cVar = (c) viewS2.getLayoutParams();
            if (!cVar.f1613j) {
                if (D2() && this.A == 1) {
                    int i5 = this.w;
                    int i6 = cVar.f1612i.f1631e;
                    viewS2.offsetLeftAndRight(((-((i5 - 1) - i6)) * this.B) - ((-((i5 - 1) - i6)) * i3));
                } else {
                    int i7 = cVar.f1612i.f1631e;
                    int i8 = this.B * i7;
                    int i9 = i7 * i3;
                    if (this.A == 1) {
                        viewS2.offsetLeftAndRight(i8 - i9);
                    } else {
                        viewS2.offsetTopAndBottom(i8 - i9);
                    }
                }
            }
        }
    }

    private void O2() {
        if (this.A == 1 || !D2()) {
            this.E = this.D;
        } else {
            this.E = !this.D;
        }
    }

    private void Q2(int i2) {
        k kVar = this.C;
        kVar.f1754e = i2;
        kVar.f1753d = this.E != (i2 == -1) ? -1 : 1;
    }

    private void U2(int i2, int i3) {
        for (int i4 = 0; i4 < this.w; i4++) {
            if (!this.x[i4].a.isEmpty()) {
                a3(this.x[i4], i2, i3);
            }
        }
    }

    private void V1(View view) {
        for (int i2 = this.w - 1; i2 >= 0; i2--) {
            this.x[i2].a(view);
        }
    }

    private boolean V2(RecyclerView.a0 a0Var, b bVar) {
        bVar.a = this.K ? p2(a0Var.b()) : l2(a0Var.b());
        bVar.f1606b = Level.ALL_INT;
        return true;
    }

    private void W1(b bVar) {
        e eVar = this.M;
        int i2 = eVar.f1621g;
        if (i2 > 0) {
            if (i2 == this.w) {
                for (int i3 = 0; i3 < this.w; i3++) {
                    this.x[i3].e();
                    e eVar2 = this.M;
                    int i4 = eVar2.f1622h[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        i4 += eVar2.f1627m ? this.y.i() : this.y.m();
                    }
                    this.x[i3].x(i4);
                }
            } else {
                eVar.b();
                e eVar3 = this.M;
                eVar3.f1619e = eVar3.f1620f;
            }
        }
        e eVar4 = this.M;
        this.L = eVar4.n;
        S2(eVar4.f1626l);
        O2();
        e eVar5 = this.M;
        int i5 = eVar5.f1619e;
        if (i5 != -1) {
            this.G = i5;
            bVar.f1607c = eVar5.f1627m;
        } else {
            bVar.f1607c = this.E;
        }
        if (eVar5.f1623i > 1) {
            d dVar = this.I;
            dVar.a = eVar5.f1624j;
            dVar.f1614b = eVar5.f1625k;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Y2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.k r0 = r4.C
            r1 = 0
            r0.f1751b = r1
            r0.f1752c = r5
            boolean r0 = r4.E0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.E
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.p r5 = r4.y
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.p r5 = r4.y
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.W()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.k r0 = r4.C
            androidx.recyclerview.widget.p r3 = r4.y
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f1755f = r3
            androidx.recyclerview.widget.k r6 = r4.C
            androidx.recyclerview.widget.p r0 = r4.y
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f1756g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.k r0 = r4.C
            androidx.recyclerview.widget.p r3 = r4.y
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f1756g = r3
            androidx.recyclerview.widget.k r5 = r4.C
            int r6 = -r6
            r5.f1755f = r6
        L5d:
            androidx.recyclerview.widget.k r5 = r4.C
            r5.f1757h = r1
            r5.a = r2
            androidx.recyclerview.widget.p r6 = r4.y
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.p r6 = r4.y
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f1758i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void Z1(View view, c cVar, k kVar) {
        if (kVar.f1754e == 1) {
            if (cVar.f1613j) {
                V1(view);
                return;
            } else {
                cVar.f1612i.a(view);
                return;
            }
        }
        if (cVar.f1613j) {
            J2(view);
        } else {
            cVar.f1612i.w(view);
        }
    }

    private int a2(int i2) {
        if (T() == 0) {
            return this.E ? 1 : -1;
        }
        return (i2 < t2()) != this.E ? -1 : 1;
    }

    private void a3(f fVar, int i2, int i3) {
        int iL = fVar.l();
        if (i2 == -1) {
            if (fVar.q() + iL <= i3) {
                this.F.set(fVar.f1631e, false);
            }
        } else if (fVar.m() - iL >= i3) {
            this.F.set(fVar.f1631e, false);
        }
    }

    private int b3(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    private boolean c2(f fVar) {
        if (this.E) {
            if (fVar.m() < this.y.i()) {
                ArrayList<View> arrayList = fVar.a;
                return !fVar.p(arrayList.get(arrayList.size() - 1)).f1613j;
            }
        } else if (fVar.q() > this.y.m()) {
            return !fVar.p(fVar.a.get(0)).f1613j;
        }
        return false;
    }

    private int d2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return s.a(a0Var, this.y, n2(!this.R), m2(!this.R), this, this.R);
    }

    private int e2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return s.b(a0Var, this.y, n2(!this.R), m2(!this.R), this, this.R, this.E);
    }

    private int f2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        return s.c(a0Var, this.y, n2(!this.R), m2(!this.R), this, this.R);
    }

    private int g2(int i2) {
        if (i2 == 1) {
            return (this.A != 1 && D2()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.A != 1 && D2()) ? -1 : 1;
        }
        if (i2 == 17) {
            if (this.A == 0) {
                return -1;
            }
            return Level.ALL_INT;
        }
        if (i2 == 33) {
            if (this.A == 1) {
                return -1;
            }
            return Level.ALL_INT;
        }
        if (i2 == 66) {
            if (this.A == 0) {
                return 1;
            }
            return Level.ALL_INT;
        }
        if (i2 == 130 && this.A == 1) {
            return 1;
        }
        return Level.ALL_INT;
    }

    private d.a h2(int i2) {
        d.a aVar = new d.a();
        aVar.f1617g = new int[this.w];
        for (int i3 = 0; i3 < this.w; i3++) {
            aVar.f1617g[i3] = i2 - this.x[i3].n(i2);
        }
        return aVar;
    }

    private d.a i2(int i2) {
        d.a aVar = new d.a();
        aVar.f1617g = new int[this.w];
        for (int i3 = 0; i3 < this.w; i3++) {
            aVar.f1617g[i3] = this.x[i3].r(i2) - i2;
        }
        return aVar;
    }

    private void j2() {
        this.y = p.b(this, this.A);
        this.z = p.b(this, 1 - this.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int k2(RecyclerView.v vVar, k kVar, RecyclerView.a0 a0Var) {
        int i2;
        f fVarZ2;
        int iE;
        int i3;
        int iE2;
        int iE3;
        ?? r9 = 0;
        this.F.set(0, this.w, true);
        if (this.C.f1758i) {
            i2 = kVar.f1754e == 1 ? Integer.MAX_VALUE : Level.ALL_INT;
        } else {
            i2 = kVar.f1754e == 1 ? kVar.f1756g + kVar.f1751b : kVar.f1755f - kVar.f1751b;
        }
        U2(kVar.f1754e, i2);
        int i4 = this.E ? this.y.i() : this.y.m();
        boolean z = false;
        while (kVar.a(a0Var) && (this.C.f1758i || !this.F.isEmpty())) {
            View viewB = kVar.b(vVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.I.g(iA);
            boolean z2 = iG == -1;
            if (z2) {
                fVarZ2 = cVar.f1613j ? this.x[r9] : z2(kVar);
                this.I.n(iA, fVarZ2);
            } else {
                fVarZ2 = this.x[iG];
            }
            f fVar = fVarZ2;
            cVar.f1612i = fVar;
            if (kVar.f1754e == 1) {
                n(viewB);
            } else {
                o(viewB, r9);
            }
            F2(viewB, cVar, r9);
            if (kVar.f1754e == 1) {
                int iV2 = cVar.f1613j ? v2(i4) : fVar.n(i4);
                int iE4 = this.y.e(viewB) + iV2;
                if (z2 && cVar.f1613j) {
                    d.a aVarH2 = h2(iV2);
                    aVarH2.f1616f = -1;
                    aVarH2.f1615e = iA;
                    this.I.a(aVarH2);
                }
                i3 = iE4;
                iE = iV2;
            } else {
                int iY2 = cVar.f1613j ? y2(i4) : fVar.r(i4);
                iE = iY2 - this.y.e(viewB);
                if (z2 && cVar.f1613j) {
                    d.a aVarI2 = i2(iY2);
                    aVarI2.f1616f = 1;
                    aVarI2.f1615e = iA;
                    this.I.a(aVarI2);
                }
                i3 = iY2;
            }
            if (cVar.f1613j && kVar.f1753d == -1) {
                if (z2) {
                    this.Q = true;
                } else {
                    if (!(kVar.f1754e == 1 ? X1() : Y1())) {
                        d.a aVarF = this.I.f(iA);
                        if (aVarF != null) {
                            aVarF.f1618h = true;
                        }
                        this.Q = true;
                    }
                }
            }
            Z1(viewB, cVar, kVar);
            if (D2() && this.A == 1) {
                int i5 = cVar.f1613j ? this.z.i() : this.z.i() - (((this.w - 1) - fVar.f1631e) * this.B);
                iE3 = i5;
                iE2 = i5 - this.z.e(viewB);
            } else {
                int iM = cVar.f1613j ? this.z.m() : (fVar.f1631e * this.B) + this.z.m();
                iE2 = iM;
                iE3 = this.z.e(viewB) + iM;
            }
            if (this.A == 1) {
                G0(viewB, iE2, iE, iE3, i3);
            } else {
                G0(viewB, iE, iE2, i3, iE3);
            }
            if (cVar.f1613j) {
                U2(this.C.f1754e, i2);
            } else {
                a3(fVar, this.C.f1754e, i2);
            }
            K2(vVar, this.C);
            if (this.C.f1757h && viewB.hasFocusable()) {
                if (cVar.f1613j) {
                    this.F.clear();
                } else {
                    this.F.set(fVar.f1631e, false);
                }
            }
            z = true;
            r9 = 0;
        }
        if (!z) {
            K2(vVar, this.C);
        }
        int iM2 = this.C.f1754e == -1 ? this.y.m() - y2(this.y.m()) : v2(this.y.i()) - this.y.i();
        if (iM2 > 0) {
            return Math.min(kVar.f1751b, iM2);
        }
        return 0;
    }

    private int l2(int i2) {
        int iT = T();
        for (int i3 = 0; i3 < iT; i3++) {
            int iN0 = n0(S(i3));
            if (iN0 >= 0 && iN0 < i2) {
                return iN0;
            }
        }
        return 0;
    }

    private int p2(int i2) {
        for (int iT = T() - 1; iT >= 0; iT--) {
            int iN0 = n0(S(iT));
            if (iN0 >= 0 && iN0 < i2) {
                return iN0;
            }
        }
        return 0;
    }

    private void r2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int iV2 = v2(Level.ALL_INT);
        if (iV2 != Integer.MIN_VALUE && (i2 = this.y.i() - iV2) > 0) {
            int i3 = i2 - (-P2(-i2, vVar, a0Var));
            if (!z || i3 <= 0) {
                return;
            }
            this.y.r(i3);
        }
    }

    private void s2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iM;
        int iY2 = y2(Integer.MAX_VALUE);
        if (iY2 != Integer.MAX_VALUE && (iM = iY2 - this.y.m()) > 0) {
            int iP2 = iM - P2(iM, vVar, a0Var);
            if (!z || iP2 <= 0) {
                return;
            }
            this.y.r(-iP2);
        }
    }

    private int v2(int i2) {
        int iN = this.x[0].n(i2);
        for (int i3 = 1; i3 < this.w; i3++) {
            int iN2 = this.x[i3].n(i2);
            if (iN2 > iN) {
                iN = iN2;
            }
        }
        return iN;
    }

    private int w2(int i2) {
        int iR = this.x[0].r(i2);
        for (int i3 = 1; i3 < this.w; i3++) {
            int iR2 = this.x[i3].r(i2);
            if (iR2 > iR) {
                iR = iR2;
            }
        }
        return iR;
    }

    private int x2(int i2) {
        int iN = this.x[0].n(i2);
        for (int i3 = 1; i3 < this.w; i3++) {
            int iN2 = this.x[i3].n(i2);
            if (iN2 < iN) {
                iN = iN2;
            }
        }
        return iN;
    }

    private int y2(int i2) {
        int iR = this.x[0].r(i2);
        for (int i3 = 1; i3 < this.w; i3++) {
            int iR2 = this.x[i3].r(i2);
            if (iR2 < iR) {
                iR = iR2;
            }
        }
        return iR;
    }

    private f z2(k kVar) {
        int i2;
        int i3;
        int i4 = -1;
        if (H2(kVar.f1754e)) {
            i2 = this.w - 1;
            i3 = -1;
        } else {
            i2 = 0;
            i4 = this.w;
            i3 = 1;
        }
        f fVar = null;
        if (kVar.f1754e == 1) {
            int i5 = Integer.MAX_VALUE;
            int iM = this.y.m();
            while (i2 != i4) {
                f fVar2 = this.x[i2];
                int iN = fVar2.n(iM);
                if (iN < i5) {
                    fVar = fVar2;
                    i5 = iN;
                }
                i2 += i3;
            }
            return fVar;
        }
        int i6 = Level.ALL_INT;
        int i7 = this.y.i();
        while (i2 != i4) {
            f fVar3 = this.x[i2];
            int iR = fVar3.r(i7);
            if (iR > i6) {
                fVar = fVar3;
                i6 = iR;
            }
            i2 += i3;
        }
        return fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int B(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View B2() {
        /*
            r12 = this;
            int r0 = r12.T()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.w
            r2.<init>(r3)
            int r3 = r12.w
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.A
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.D2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.E
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.S(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1612i
            int r9 = r9.f1631e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1612i
            boolean r9 = r12.c2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1612i
            int r9 = r9.f1631e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f1613j
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.S(r9)
            boolean r10 = r12.E
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.p r10 = r12.y
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.p r11 = r12.y
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.p r10 = r12.y
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.p r11 = r12.y
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1612i
            int r8 = r8.f1631e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1612i
            int r9 = r9.f1631e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    public void C2() {
        this.I.b();
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D(RecyclerView.a0 a0Var) {
        return d2(a0Var);
    }

    boolean D2() {
        return j0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E(RecyclerView.a0 a0Var) {
        return e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return P2(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int F(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void F1(int i2) {
        e eVar = this.M;
        if (eVar != null && eVar.f1619e != i2) {
            eVar.a();
        }
        this.G = i2;
        this.H = Level.ALL_INT;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int G1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return P2(i2, vVar, a0Var);
    }

    void I2(int i2, RecyclerView.a0 a0Var) {
        int iT2;
        int i3;
        if (i2 > 0) {
            iT2 = u2();
            i3 = 1;
        } else {
            iT2 = t2();
            i3 = -1;
        }
        this.C.a = true;
        Y2(iT2, a0Var);
        Q2(i3);
        k kVar = this.C;
        kVar.f1752c = iT2 + kVar.f1753d;
        kVar.f1751b = Math.abs(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void J0(int i2) {
        super.J0(i2);
        for (int i3 = 0; i3 < this.w; i3++) {
            this.x[i3].t(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(int i2) {
        super.K0(i2);
        for (int i3 = 0; i3 < this.w; i3++) {
            this.x[i3].t(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L1(Rect rect, int i2, int i3) {
        int iX;
        int iX2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A == 1) {
            iX2 = RecyclerView.o.x(i3, rect.height() + paddingTop, l0());
            iX = RecyclerView.o.x(i2, (this.B * this.w) + paddingLeft, m0());
        } else {
            iX = RecyclerView.o.x(i2, rect.width() + paddingLeft, m0());
            iX2 = RecyclerView.o.x(i3, (this.B * this.w) + paddingTop, l0());
        }
        K1(iX, iX2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p N() {
        return this.A == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p O(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p P(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.P0(recyclerView, vVar);
        w1(this.T);
        for (int i2 = 0; i2 < this.w; i2++) {
            this.x[i2].e();
        }
        recyclerView.requestLayout();
    }

    int P2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (T() == 0 || i2 == 0) {
            return 0;
        }
        I2(i2, a0Var);
        int iK2 = k2(vVar, this.C, a0Var);
        if (this.C.f1751b >= iK2) {
            i2 = i2 < 0 ? -iK2 : iK2;
        }
        this.y.r(-i2);
        this.K = this.E;
        k kVar = this.C;
        kVar.f1751b = 0;
        K2(vVar, kVar);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View Q0(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View viewL;
        View viewO;
        if (T() == 0 || (viewL = L(view)) == null) {
            return null;
        }
        O2();
        int iG2 = g2(i2);
        if (iG2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewL.getLayoutParams();
        boolean z = cVar.f1613j;
        f fVar = cVar.f1612i;
        int iU2 = iG2 == 1 ? u2() : t2();
        Y2(iU2, a0Var);
        Q2(iG2);
        k kVar = this.C;
        kVar.f1752c = kVar.f1753d + iU2;
        kVar.f1751b = (int) (this.y.n() * 0.33333334f);
        k kVar2 = this.C;
        kVar2.f1757h = true;
        kVar2.a = false;
        k2(vVar, kVar2, a0Var);
        this.K = this.E;
        if (!z && (viewO = fVar.o(iU2, iG2)) != null && viewO != viewL) {
            return viewO;
        }
        if (H2(iG2)) {
            for (int i3 = this.w - 1; i3 >= 0; i3--) {
                View viewO2 = this.x[i3].o(iU2, iG2);
                if (viewO2 != null && viewO2 != viewL) {
                    return viewO2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.w; i4++) {
                View viewO3 = this.x[i4].o(iU2, iG2);
                if (viewO3 != null && viewO3 != viewL) {
                    return viewO3;
                }
            }
        }
        boolean z2 = (this.D ^ true) == (iG2 == -1);
        if (!z) {
            View viewM = M(z2 ? fVar.f() : fVar.g());
            if (viewM != null && viewM != viewL) {
                return viewM;
            }
        }
        if (H2(iG2)) {
            for (int i5 = this.w - 1; i5 >= 0; i5--) {
                if (i5 != fVar.f1631e) {
                    View viewM2 = M(z2 ? this.x[i5].f() : this.x[i5].g());
                    if (viewM2 != null && viewM2 != viewL) {
                        return viewM2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.w; i6++) {
                View viewM3 = M(z2 ? this.x[i6].f() : this.x[i6].g());
                if (viewM3 != null && viewM3 != viewL) {
                    return viewM3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            View viewN2 = n2(false);
            View viewM2 = m2(false);
            if (viewN2 == null || viewM2 == null) {
                return;
            }
            int iN0 = n0(viewN2);
            int iN02 = n0(viewM2);
            if (iN0 < iN02) {
                accessibilityEvent.setFromIndex(iN0);
                accessibilityEvent.setToIndex(iN02);
            } else {
                accessibilityEvent.setFromIndex(iN02);
                accessibilityEvent.setToIndex(iN0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i2);
        S1(lVar);
    }

    public void R2(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        q(null);
        if (i2 == this.A) {
            return;
        }
        this.A = i2;
        p pVar = this.y;
        this.y = this.z;
        this.z = pVar;
        B1();
    }

    public void S2(boolean z) {
        q(null);
        e eVar = this.M;
        if (eVar != null && eVar.f1626l != z) {
            eVar.f1626l = z;
        }
        this.D = z;
        B1();
    }

    public void T2(int i2) {
        q(null);
        if (i2 != this.w) {
            C2();
            this.w = i2;
            this.F = new BitSet(this.w);
            this.x = new f[this.w];
            for (int i3 = 0; i3 < this.w; i3++) {
                this.x[i3] = new f(i3);
            }
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean U1() {
        return this.M == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, c.h.l.c0.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.V0(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.A == 0) {
            cVar.b0(c.C0058c.f(cVar2.g(), cVar2.f1613j ? this.w : 1, -1, -1, false, false));
        } else {
            cVar.b0(c.C0058c.f(-1, -1, cVar2.g(), cVar2.f1613j ? this.w : 1, false, false));
        }
    }

    boolean W2(RecyclerView.a0 a0Var, b bVar) {
        int i2;
        if (!a0Var.e() && (i2 = this.G) != -1) {
            if (i2 >= 0 && i2 < a0Var.b()) {
                e eVar = this.M;
                if (eVar == null || eVar.f1619e == -1 || eVar.f1621g < 1) {
                    View viewM = M(this.G);
                    if (viewM != null) {
                        bVar.a = this.E ? u2() : t2();
                        if (this.H != Integer.MIN_VALUE) {
                            if (bVar.f1607c) {
                                bVar.f1606b = (this.y.i() - this.H) - this.y.d(viewM);
                            } else {
                                bVar.f1606b = (this.y.m() + this.H) - this.y.g(viewM);
                            }
                            return true;
                        }
                        if (this.y.e(viewM) > this.y.n()) {
                            bVar.f1606b = bVar.f1607c ? this.y.i() : this.y.m();
                            return true;
                        }
                        int iG = this.y.g(viewM) - this.y.m();
                        if (iG < 0) {
                            bVar.f1606b = -iG;
                            return true;
                        }
                        int i3 = this.y.i() - this.y.d(viewM);
                        if (i3 < 0) {
                            bVar.f1606b = i3;
                            return true;
                        }
                        bVar.f1606b = Level.ALL_INT;
                    } else {
                        int i4 = this.G;
                        bVar.a = i4;
                        int i5 = this.H;
                        if (i5 == Integer.MIN_VALUE) {
                            bVar.f1607c = a2(i4) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i5);
                        }
                        bVar.f1608d = true;
                    }
                } else {
                    bVar.f1606b = Level.ALL_INT;
                    bVar.a = this.G;
                }
                return true;
            }
            this.G = -1;
            this.H = Level.ALL_INT;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int X(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.A == 1 ? this.w : super.X(vVar, a0Var);
    }

    boolean X1() {
        int iN = this.x[0].n(Level.ALL_INT);
        for (int i2 = 1; i2 < this.w; i2++) {
            if (this.x[i2].n(Level.ALL_INT) != iN) {
                return false;
            }
        }
        return true;
    }

    void X2(RecyclerView.a0 a0Var, b bVar) {
        if (W2(a0Var, bVar) || V2(a0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i2, int i3) {
        A2(i2, i3, 1);
    }

    boolean Y1() {
        int iR = this.x[0].r(Level.ALL_INT);
        for (int i2 = 1; i2 < this.w; i2++) {
            if (this.x[i2].r(Level.ALL_INT) != iR) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView) {
        this.I.b();
        B1();
    }

    void Z2(int i2) {
        this.B = i2 / this.w;
        this.N = View.MeasureSpec.makeMeasureSpec(i2, this.z.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i2) {
        int iA2 = a2(i2);
        PointF pointF = new PointF();
        if (iA2 == 0) {
            return null;
        }
        if (this.A == 0) {
            pointF.x = iA2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iA2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i2, int i3, int i4) {
        A2(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView recyclerView, int i2, int i3) {
        A2(i2, i3, 2);
    }

    boolean b2() {
        int iT2;
        int iU2;
        if (T() == 0 || this.J == 0 || !x0()) {
            return false;
        }
        if (this.E) {
            iT2 = u2();
            iU2 = t2();
        } else {
            iT2 = t2();
            iU2 = u2();
        }
        if (iT2 == 0 && B2() != null) {
            this.I.b();
            C1();
            B1();
            return true;
        }
        if (!this.Q) {
            return false;
        }
        int i2 = this.E ? -1 : 1;
        int i3 = iU2 + 1;
        d.a aVarE = this.I.e(iT2, i3, i2, true);
        if (aVarE == null) {
            this.Q = false;
            this.I.d(i3);
            return false;
        }
        d.a aVarE2 = this.I.e(iT2, aVarE.f1615e, i2 * (-1), true);
        if (aVarE2 == null) {
            this.I.d(aVarE.f1615e);
        } else {
            this.I.d(aVarE2.f1615e + 1);
        }
        C1();
        B1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView recyclerView, int i2, int i3, Object obj) {
        A2(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        G2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.G = -1;
        this.H = Level.ALL_INT;
        this.M = null;
        this.P.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.M = (e) parcelable;
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable k1() {
        int iR;
        int iM;
        int[] iArr;
        if (this.M != null) {
            return new e(this.M);
        }
        e eVar = new e();
        eVar.f1626l = this.D;
        eVar.f1627m = this.K;
        eVar.n = this.L;
        d dVar = this.I;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.f1623i = 0;
        } else {
            eVar.f1624j = iArr;
            eVar.f1623i = iArr.length;
            eVar.f1625k = dVar.f1614b;
        }
        if (T() > 0) {
            eVar.f1619e = this.K ? u2() : t2();
            eVar.f1620f = o2();
            int i2 = this.w;
            eVar.f1621g = i2;
            eVar.f1622h = new int[i2];
            for (int i3 = 0; i3 < this.w; i3++) {
                if (this.K) {
                    iR = this.x[i3].n(Level.ALL_INT);
                    if (iR != Integer.MIN_VALUE) {
                        iM = this.y.i();
                        iR -= iM;
                    }
                } else {
                    iR = this.x[i3].r(Level.ALL_INT);
                    if (iR != Integer.MIN_VALUE) {
                        iM = this.y.m();
                        iR -= iM;
                    }
                }
                eVar.f1622h[i3] = iR;
            }
        } else {
            eVar.f1619e = -1;
            eVar.f1620f = -1;
            eVar.f1621g = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(int i2) {
        if (i2 == 0) {
            b2();
        }
    }

    View m2(boolean z) {
        int iM = this.y.m();
        int i2 = this.y.i();
        View view = null;
        for (int iT = T() - 1; iT >= 0; iT--) {
            View viewS = S(iT);
            int iG = this.y.g(viewS);
            int iD = this.y.d(viewS);
            if (iD > iM && iG < i2) {
                if (iD <= i2 || !z) {
                    return viewS;
                }
                if (view == null) {
                    view = viewS;
                }
            }
        }
        return view;
    }

    View n2(boolean z) {
        int iM = this.y.m();
        int i2 = this.y.i();
        int iT = T();
        View view = null;
        for (int i3 = 0; i3 < iT; i3++) {
            View viewS = S(i3);
            int iG = this.y.g(viewS);
            if (this.y.d(viewS) > iM && iG < i2) {
                if (iG >= iM || !z) {
                    return viewS;
                }
                if (view == null) {
                    view = viewS;
                }
            }
        }
        return view;
    }

    int o2() {
        View viewM2 = this.E ? m2(true) : n2(true);
        if (viewM2 == null) {
            return -1;
        }
        return n0(viewM2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q(String str) {
        if (this.M == null) {
            super.q(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.A == 0 ? this.w : super.q0(vVar, a0Var);
    }

    public int[] q2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.w];
        } else if (iArr.length < this.w) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.w + ", array size:" + iArr.length);
        }
        for (int i2 = 0; i2 < this.w; i2++) {
            iArr[i2] = this.x[i2].h();
        }
        return iArr;
    }

    int t2() {
        if (T() == 0) {
            return 0;
        }
        return n0(S(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean u() {
        return this.A == 0;
    }

    int u2() {
        int iT = T();
        if (iT == 0) {
            return 0;
        }
        return n0(S(iT - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        return this.A == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int iN;
        int iR;
        if (this.A != 0) {
            i2 = i3;
        }
        if (T() == 0 || i2 == 0) {
            return;
        }
        I2(i2, a0Var);
        int[] iArr = this.S;
        if (iArr == null || iArr.length < this.w) {
            this.S = new int[this.w];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.w; i5++) {
            k kVar = this.C;
            if (kVar.f1753d == -1) {
                iN = kVar.f1755f;
                iR = this.x[i5].r(iN);
            } else {
                iN = this.x[i5].n(kVar.f1756g);
                iR = this.C.f1756g;
            }
            int i6 = iN - iR;
            if (i6 >= 0) {
                this.S[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.S, 0, i4);
        for (int i7 = 0; i7 < i4 && this.C.a(a0Var); i7++) {
            cVar.a(this.C.f1752c, this.S[i7]);
            k kVar2 = this.C;
            kVar2.f1752c += kVar2.f1753d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean y0() {
        return this.J != 0;
    }

    static class d {
        int[] a;

        /* renamed from: b, reason: collision with root package name */
        List<a> f1614b;

        d() {
        }

        private int i(int i2) {
            if (this.f1614b == null) {
                return -1;
            }
            a aVarF = f(i2);
            if (aVarF != null) {
                this.f1614b.remove(aVarF);
            }
            int size = this.f1614b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (this.f1614b.get(i3).f1615e >= i2) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return -1;
            }
            a aVar = this.f1614b.get(i3);
            this.f1614b.remove(i3);
            return aVar.f1615e;
        }

        private void l(int i2, int i3) {
            List<a> list = this.f1614b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1614b.get(size);
                int i4 = aVar.f1615e;
                if (i4 >= i2) {
                    aVar.f1615e = i4 + i3;
                }
            }
        }

        private void m(int i2, int i3) {
            List<a> list = this.f1614b;
            if (list == null) {
                return;
            }
            int i4 = i2 + i3;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1614b.get(size);
                int i5 = aVar.f1615e;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f1614b.remove(size);
                    } else {
                        aVar.f1615e = i5 - i3;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f1614b == null) {
                this.f1614b = new ArrayList();
            }
            int size = this.f1614b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = this.f1614b.get(i2);
                if (aVar2.f1615e == aVar.f1615e) {
                    this.f1614b.remove(i2);
                }
                if (aVar2.f1615e >= aVar.f1615e) {
                    this.f1614b.add(i2, aVar);
                    return;
                }
            }
            this.f1614b.add(aVar);
        }

        void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1614b = null;
        }

        void c(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int[] iArr3 = new int[o(i2)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i2) {
            List<a> list = this.f1614b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1614b.get(size).f1615e >= i2) {
                        this.f1614b.remove(size);
                    }
                }
            }
            return h(i2);
        }

        public a e(int i2, int i3, int i4, boolean z) {
            List<a> list = this.f1614b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.f1614b.get(i5);
                int i6 = aVar.f1615e;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || aVar.f1616f == i4 || (z && aVar.f1618h))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i2) {
            List<a> list = this.f1614b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1614b.get(size);
                if (aVar.f1615e == i2) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            return iArr[i2];
        }

        int h(int i2) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return -1;
            }
            int i3 = i(i2);
            if (i3 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i2, iArr2.length, -1);
                return this.a.length;
            }
            int i4 = i3 + 1;
            Arrays.fill(this.a, i2, i4, -1);
            return i4;
        }

        void j(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.a, i2, i4, -1);
            l(i2, i3);
        }

        void k(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            c(i4);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            m(i2, i3);
        }

        void n(int i2, f fVar) {
            c(i2);
            this.a[i2] = fVar.f1631e;
        }

        int o(int i2) {
            int length = this.a.length;
            while (length <= i2) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0022a();

            /* renamed from: e, reason: collision with root package name */
            int f1615e;

            /* renamed from: f, reason: collision with root package name */
            int f1616f;

            /* renamed from: g, reason: collision with root package name */
            int[] f1617g;

            /* renamed from: h, reason: collision with root package name */
            boolean f1618h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0022a implements Parcelable.Creator<a> {
                C0022a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            a(Parcel parcel) {
                this.f1615e = parcel.readInt();
                this.f1616f = parcel.readInt();
                this.f1618h = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    this.f1617g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i2) {
                int[] iArr = this.f1617g;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i2];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1615e + ", mGapDir=" + this.f1616f + ", mHasUnwantedGapAfter=" + this.f1618h + ", mGapPerSpan=" + Arrays.toString(this.f1617g) + CoreConstants.CURLY_RIGHT;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f1615e);
                parcel.writeInt(this.f1616f);
                parcel.writeInt(this.f1618h ? 1 : 0);
                int[] iArr = this.f1617g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1617g);
                }
            }

            a() {
            }
        }
    }
}