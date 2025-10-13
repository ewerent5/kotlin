package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    private boolean A;
    boolean B;
    private boolean C;
    private boolean D;
    int E;
    int F;
    private boolean G;
    d H;
    final a I;
    private final b J;
    private int K;
    private int[] L;
    int w;
    private c x;
    p y;
    private boolean z;

    static class a {
        p a;

        /* renamed from: b, reason: collision with root package name */
        int f1493b;

        /* renamed from: c, reason: collision with root package name */
        int f1494c;

        /* renamed from: d, reason: collision with root package name */
        boolean f1495d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1496e;

        a() {
            e();
        }

        void a() {
            this.f1494c = this.f1495d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i2) {
            if (this.f1495d) {
                this.f1494c = this.a.d(view) + this.a.o();
            } else {
                this.f1494c = this.a.g(view);
            }
            this.f1493b = i2;
        }

        public void c(View view, int i2) {
            int iO = this.a.o();
            if (iO >= 0) {
                b(view, i2);
                return;
            }
            this.f1493b = i2;
            if (this.f1495d) {
                int i3 = (this.a.i() - iO) - this.a.d(view);
                this.f1494c = this.a.i() - i3;
                if (i3 > 0) {
                    int iE = this.f1494c - this.a.e(view);
                    int iM = this.a.m();
                    int iMin = iE - (iM + Math.min(this.a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f1494c += Math.min(i3, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.a.g(view);
            int iM2 = iG - this.a.m();
            this.f1494c = iG;
            if (iM2 > 0) {
                int i4 = (this.a.i() - Math.min(0, (this.a.i() - iO) - this.a.d(view))) - (iG + this.a.e(view));
                if (i4 < 0) {
                    this.f1494c -= Math.min(iM2, -i4);
                }
            }
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        void e() {
            this.f1493b = -1;
            this.f1494c = Level.ALL_INT;
            this.f1495d = false;
            this.f1496e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1493b + ", mCoordinate=" + this.f1494c + ", mLayoutFromEnd=" + this.f1495d + ", mValid=" + this.f1496e + CoreConstants.CURLY_RIGHT;
        }
    }

    protected static class b {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1497b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1498c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1499d;

        protected b() {
        }

        void a() {
            this.a = 0;
            this.f1497b = false;
            this.f1498c = false;
            this.f1499d = false;
        }
    }

    static class c {

        /* renamed from: b, reason: collision with root package name */
        int f1500b;

        /* renamed from: c, reason: collision with root package name */
        int f1501c;

        /* renamed from: d, reason: collision with root package name */
        int f1502d;

        /* renamed from: e, reason: collision with root package name */
        int f1503e;

        /* renamed from: f, reason: collision with root package name */
        int f1504f;

        /* renamed from: g, reason: collision with root package name */
        int f1505g;

        /* renamed from: k, reason: collision with root package name */
        int f1509k;

        /* renamed from: m, reason: collision with root package name */
        boolean f1511m;
        boolean a = true;

        /* renamed from: h, reason: collision with root package name */
        int f1506h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f1507i = 0;

        /* renamed from: j, reason: collision with root package name */
        boolean f1508j = false;

        /* renamed from: l, reason: collision with root package name */
        List<RecyclerView.d0> f1510l = null;

        c() {
        }

        private View e() {
            int size = this.f1510l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f1510l.get(i2).f1546f;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f1502d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            if (viewF == null) {
                this.f1502d = -1;
            } else {
                this.f1502d = ((RecyclerView.p) viewF.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.a0 a0Var) {
            int i2 = this.f1502d;
            return i2 >= 0 && i2 < a0Var.b();
        }

        View d(RecyclerView.v vVar) {
            if (this.f1510l != null) {
                return e();
            }
            View viewO = vVar.o(this.f1502d);
            this.f1502d += this.f1503e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f1510l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f1510l.get(i3).f1546f;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f1502d) * this.f1503e) >= 0 && iA < i2) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i2 = iA;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        int f1512e;

        /* renamed from: f, reason: collision with root package name */
        int f1513f;

        /* renamed from: g, reason: collision with root package name */
        boolean f1514g;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f1512e >= 0;
        }

        void b() {
            this.f1512e = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1512e);
            parcel.writeInt(this.f1513f);
            parcel.writeInt(this.f1514g ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f1512e = parcel.readInt();
            this.f1513f = parcel.readInt();
            this.f1514g = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f1512e = dVar.f1512e;
            this.f1513f = dVar.f1513f;
            this.f1514g = dVar.f1514g;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void C2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3) {
        if (!a0Var.g() || T() == 0 || a0Var.e() || !U1()) {
            return;
        }
        List<RecyclerView.d0> listK = vVar.k();
        int size = listK.size();
        int iN0 = n0(S(0));
        int iE = 0;
        int iE2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.d0 d0Var = listK.get(i4);
            if (!d0Var.w()) {
                if (((d0Var.n() < iN0) != this.B ? (char) 65535 : (char) 1) == 65535) {
                    iE += this.y.e(d0Var.f1546f);
                } else {
                    iE2 += this.y.e(d0Var.f1546f);
                }
            }
        }
        this.x.f1510l = listK;
        if (iE > 0) {
            U2(n0(w2()), i2);
            c cVar = this.x;
            cVar.f1506h = iE;
            cVar.f1501c = 0;
            cVar.a();
            d2(vVar, this.x, a0Var, false);
        }
        if (iE2 > 0) {
            S2(n0(v2()), i3);
            c cVar2 = this.x;
            cVar2.f1506h = iE2;
            cVar2.f1501c = 0;
            cVar2.a();
            d2(vVar, this.x, a0Var, false);
        }
        this.x.f1510l = null;
    }

    private void E2(RecyclerView.v vVar, c cVar) {
        if (!cVar.a || cVar.f1511m) {
            return;
        }
        int i2 = cVar.f1505g;
        int i3 = cVar.f1507i;
        if (cVar.f1504f == -1) {
            G2(vVar, i2, i3);
        } else {
            H2(vVar, i2, i3);
        }
    }

    private void F2(RecyclerView.v vVar, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                v1(i2, vVar);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                v1(i4, vVar);
            }
        }
    }

    private void G2(RecyclerView.v vVar, int i2, int i3) {
        int iT = T();
        if (i2 < 0) {
            return;
        }
        int iH = (this.y.h() - i2) + i3;
        if (this.B) {
            for (int i4 = 0; i4 < iT; i4++) {
                View viewS = S(i4);
                if (this.y.g(viewS) < iH || this.y.q(viewS) < iH) {
                    F2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iT - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewS2 = S(i6);
            if (this.y.g(viewS2) < iH || this.y.q(viewS2) < iH) {
                F2(vVar, i5, i6);
                return;
            }
        }
    }

    private void H2(RecyclerView.v vVar, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i4 = i2 - i3;
        int iT = T();
        if (!this.B) {
            for (int i5 = 0; i5 < iT; i5++) {
                View viewS = S(i5);
                if (this.y.d(viewS) > i4 || this.y.p(viewS) > i4) {
                    F2(vVar, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = iT - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View viewS2 = S(i7);
            if (this.y.d(viewS2) > i4 || this.y.p(viewS2) > i4) {
                F2(vVar, i6, i7);
                return;
            }
        }
    }

    private void J2() {
        if (this.w == 1 || !z2()) {
            this.B = this.A;
        } else {
            this.B = !this.A;
        }
    }

    private boolean O2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (T() == 0) {
            return false;
        }
        View viewF0 = f0();
        if (viewF0 != null && aVar.d(viewF0, a0Var)) {
            aVar.c(viewF0, n0(viewF0));
            return true;
        }
        if (this.z != this.C) {
            return false;
        }
        View viewR2 = aVar.f1495d ? r2(vVar, a0Var) : s2(vVar, a0Var);
        if (viewR2 == null) {
            return false;
        }
        aVar.b(viewR2, n0(viewR2));
        if (!a0Var.e() && U1()) {
            if (this.y.g(viewR2) >= this.y.i() || this.y.d(viewR2) < this.y.m()) {
                aVar.f1494c = aVar.f1495d ? this.y.i() : this.y.m();
            }
        }
        return true;
    }

    private boolean P2(RecyclerView.a0 a0Var, a aVar) {
        int i2;
        if (!a0Var.e() && (i2 = this.E) != -1) {
            if (i2 >= 0 && i2 < a0Var.b()) {
                aVar.f1493b = this.E;
                d dVar = this.H;
                if (dVar != null && dVar.a()) {
                    boolean z = this.H.f1514g;
                    aVar.f1495d = z;
                    if (z) {
                        aVar.f1494c = this.y.i() - this.H.f1513f;
                    } else {
                        aVar.f1494c = this.y.m() + this.H.f1513f;
                    }
                    return true;
                }
                if (this.F != Integer.MIN_VALUE) {
                    boolean z2 = this.B;
                    aVar.f1495d = z2;
                    if (z2) {
                        aVar.f1494c = this.y.i() - this.F;
                    } else {
                        aVar.f1494c = this.y.m() + this.F;
                    }
                    return true;
                }
                View viewM = M(this.E);
                if (viewM == null) {
                    if (T() > 0) {
                        aVar.f1495d = (this.E < n0(S(0))) == this.B;
                    }
                    aVar.a();
                } else {
                    if (this.y.e(viewM) > this.y.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.y.g(viewM) - this.y.m() < 0) {
                        aVar.f1494c = this.y.m();
                        aVar.f1495d = false;
                        return true;
                    }
                    if (this.y.i() - this.y.d(viewM) < 0) {
                        aVar.f1494c = this.y.i();
                        aVar.f1495d = true;
                        return true;
                    }
                    aVar.f1494c = aVar.f1495d ? this.y.d(viewM) + this.y.o() : this.y.g(viewM);
                }
                return true;
            }
            this.E = -1;
            this.F = Level.ALL_INT;
        }
        return false;
    }

    private void Q2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (P2(a0Var, aVar) || O2(vVar, a0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f1493b = this.C ? a0Var.b() - 1 : 0;
    }

    private void R2(int i2, int i3, boolean z, RecyclerView.a0 a0Var) {
        int iM;
        this.x.f1511m = I2();
        this.x.f1504f = i2;
        int[] iArr = this.L;
        iArr[0] = 0;
        iArr[1] = 0;
        V1(a0Var, iArr);
        int iMax = Math.max(0, this.L[0]);
        int iMax2 = Math.max(0, this.L[1]);
        boolean z2 = i2 == 1;
        c cVar = this.x;
        int i4 = z2 ? iMax2 : iMax;
        cVar.f1506h = i4;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.f1507i = iMax;
        if (z2) {
            cVar.f1506h = i4 + this.y.j();
            View viewV2 = v2();
            c cVar2 = this.x;
            cVar2.f1503e = this.B ? -1 : 1;
            int iN0 = n0(viewV2);
            c cVar3 = this.x;
            cVar2.f1502d = iN0 + cVar3.f1503e;
            cVar3.f1500b = this.y.d(viewV2);
            iM = this.y.d(viewV2) - this.y.i();
        } else {
            View viewW2 = w2();
            this.x.f1506h += this.y.m();
            c cVar4 = this.x;
            cVar4.f1503e = this.B ? 1 : -1;
            int iN02 = n0(viewW2);
            c cVar5 = this.x;
            cVar4.f1502d = iN02 + cVar5.f1503e;
            cVar5.f1500b = this.y.g(viewW2);
            iM = (-this.y.g(viewW2)) + this.y.m();
        }
        c cVar6 = this.x;
        cVar6.f1501c = i3;
        if (z) {
            cVar6.f1501c = i3 - iM;
        }
        cVar6.f1505g = iM;
    }

    private void S2(int i2, int i3) {
        this.x.f1501c = this.y.i() - i3;
        c cVar = this.x;
        cVar.f1503e = this.B ? -1 : 1;
        cVar.f1502d = i2;
        cVar.f1504f = 1;
        cVar.f1500b = i3;
        cVar.f1505g = Level.ALL_INT;
    }

    private void T2(a aVar) {
        S2(aVar.f1493b, aVar.f1494c);
    }

    private void U2(int i2, int i3) {
        this.x.f1501c = i3 - this.y.m();
        c cVar = this.x;
        cVar.f1502d = i2;
        cVar.f1503e = this.B ? 1 : -1;
        cVar.f1504f = -1;
        cVar.f1500b = i3;
        cVar.f1505g = Level.ALL_INT;
    }

    private void V2(a aVar) {
        U2(aVar.f1493b, aVar.f1494c);
    }

    private int X1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        c2();
        return s.a(a0Var, this.y, h2(!this.D, true), g2(!this.D, true), this, this.D);
    }

    private int Y1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        c2();
        return s.b(a0Var, this.y, h2(!this.D, true), g2(!this.D, true), this, this.D, this.B);
    }

    private int Z1(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        c2();
        return s.c(a0Var, this.y, h2(!this.D, true), g2(!this.D, true), this, this.D);
    }

    private View e2() {
        return m2(0, T());
    }

    private View f2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return q2(vVar, a0Var, 0, T(), a0Var.b());
    }

    private View j2() {
        return m2(T() - 1, -1);
    }

    private View k2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return q2(vVar, a0Var, T() - 1, -1, a0Var.b());
    }

    private View o2() {
        return this.B ? e2() : j2();
    }

    private View p2() {
        return this.B ? j2() : e2();
    }

    private View r2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.B ? f2(vVar, a0Var) : k2(vVar, a0Var);
    }

    private View s2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.B ? k2(vVar, a0Var) : f2(vVar, a0Var);
    }

    private int t2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i3;
        int i4 = this.y.i() - i2;
        if (i4 <= 0) {
            return 0;
        }
        int i5 = -K2(-i4, vVar, a0Var);
        int i6 = i2 + i5;
        if (!z || (i3 = this.y.i() - i6) <= 0) {
            return i5;
        }
        this.y.r(i3);
        return i3 + i5;
    }

    private int u2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int iM;
        int iM2 = i2 - this.y.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i3 = -K2(iM2, vVar, a0Var);
        int i4 = i2 + i3;
        if (!z || (iM = i4 - this.y.m()) <= 0) {
            return i3;
        }
        this.y.r(-iM);
        return i3 - iM;
    }

    private View v2() {
        return S(this.B ? 0 : T() - 1);
    }

    private View w2() {
        return S(this.B ? T() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    public boolean A2() {
        return this.D;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int B(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    void B2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iF;
        View viewD = cVar.d(vVar);
        if (viewD == null) {
            bVar.f1497b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f1510l == null) {
            if (this.B == (cVar.f1504f == -1)) {
                n(viewD);
            } else {
                o(viewD, 0);
            }
        } else {
            if (this.B == (cVar.f1504f == -1)) {
                l(viewD);
            } else {
                m(viewD, 0);
            }
        }
        H0(viewD, 0, 0);
        bVar.a = this.y.e(viewD);
        if (this.w == 1) {
            if (z2()) {
                iF = u0() - getPaddingRight();
                paddingLeft = iF - this.y.f(viewD);
            } else {
                paddingLeft = getPaddingLeft();
                iF = this.y.f(viewD) + paddingLeft;
            }
            if (cVar.f1504f == -1) {
                int i5 = cVar.f1500b;
                i4 = i5;
                i3 = iF;
                i2 = i5 - bVar.a;
            } else {
                int i6 = cVar.f1500b;
                i2 = i6;
                i3 = iF;
                i4 = bVar.a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iF2 = this.y.f(viewD) + paddingTop;
            if (cVar.f1504f == -1) {
                int i7 = cVar.f1500b;
                i3 = i7;
                i2 = paddingTop;
                i4 = iF2;
                paddingLeft = i7 - bVar.a;
            } else {
                int i8 = cVar.f1500b;
                i2 = paddingTop;
                i3 = bVar.a + i8;
                i4 = iF2;
                paddingLeft = i8;
            }
        }
        G0(viewD, paddingLeft, i2, i3, i4);
        if (pVar.c() || pVar.b()) {
            bVar.f1498c = true;
        }
        bVar.f1499d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C(RecyclerView.a0 a0Var) {
        return Z1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    void D2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E(RecyclerView.a0 a0Var) {
        return Y1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 1) {
            return 0;
        }
        return K2(i2, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int F(RecyclerView.a0 a0Var) {
        return Z1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void F1(int i2) {
        this.E = i2;
        this.F = Level.ALL_INT;
        d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int G1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 0) {
            return 0;
        }
        return K2(i2, vVar, a0Var);
    }

    boolean I2() {
        return this.y.k() == 0 && this.y.h() == 0;
    }

    int K2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (T() == 0 || i2 == 0) {
            return 0;
        }
        c2();
        this.x.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        R2(i3, iAbs, true, a0Var);
        c cVar = this.x;
        int iD2 = cVar.f1505g + d2(vVar, cVar, a0Var, false);
        if (iD2 < 0) {
            return 0;
        }
        if (iAbs > iD2) {
            i2 = i3 * iD2;
        }
        this.y.r(-i2);
        this.x.f1509k = i2;
        return i2;
    }

    public void L2(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        q(null);
        if (i2 != this.w || this.y == null) {
            p pVarB = p.b(this, i2);
            this.y = pVarB;
            this.I.a = pVarB;
            this.w = i2;
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View M(int i2) {
        int iT = T();
        if (iT == 0) {
            return null;
        }
        int iN0 = i2 - n0(S(0));
        if (iN0 >= 0 && iN0 < iT) {
            View viewS = S(iN0);
            if (n0(viewS) == i2) {
                return viewS;
            }
        }
        return super.M(i2);
    }

    public void M2(boolean z) {
        q(null);
        if (z == this.A) {
            return;
        }
        this.A = z;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p N() {
        return new RecyclerView.p(-2, -2);
    }

    public void N2(boolean z) {
        q(null);
        if (this.C == z) {
            return;
        }
        this.C = z;
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.P0(recyclerView, vVar);
        if (this.G) {
            s1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean P1() {
        return (h0() == 1073741824 || v0() == 1073741824 || !w0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View Q0(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int iA2;
        J2();
        if (T() == 0 || (iA2 = a2(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        c2();
        R2(iA2, (int) (this.y.n() * 0.33333334f), false, a0Var);
        c cVar = this.x;
        cVar.f1505g = Level.ALL_INT;
        cVar.a = false;
        d2(vVar, cVar, a0Var, true);
        View viewP2 = iA2 == -1 ? p2() : o2();
        View viewW2 = iA2 == -1 ? w2() : v2();
        if (!viewW2.hasFocusable()) {
            return viewP2;
        }
        if (viewP2 == null) {
            return null;
        }
        return viewW2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(AccessibilityEvent accessibilityEvent) {
        super.R0(accessibilityEvent);
        if (T() > 0) {
            accessibilityEvent.setFromIndex(i2());
            accessibilityEvent.setToIndex(l2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i2);
        S1(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean U1() {
        return this.H == null && this.z == this.C;
    }

    protected void V1(RecyclerView.a0 a0Var, int[] iArr) {
        int i2;
        int iX2 = x2(a0Var);
        if (this.x.f1504f == -1) {
            i2 = 0;
        } else {
            i2 = iX2;
            iX2 = 0;
        }
        iArr[0] = iX2;
        iArr[1] = i2;
    }

    void W1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i2 = cVar.f1502d;
        if (i2 < 0 || i2 >= a0Var.b()) {
            return;
        }
        cVar2.a(i2, Math.max(0, cVar.f1505g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i2) {
        if (T() == 0) {
            return null;
        }
        int i3 = (i2 < n0(S(0))) != this.B ? -1 : 1;
        return this.w == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    int a2(int i2) {
        if (i2 == 1) {
            return (this.w != 1 && z2()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.w != 1 && z2()) ? -1 : 1;
        }
        if (i2 == 17) {
            if (this.w == 0) {
                return -1;
            }
            return Level.ALL_INT;
        }
        if (i2 == 33) {
            if (this.w == 1) {
                return -1;
            }
            return Level.ALL_INT;
        }
        if (i2 == 66) {
            if (this.w == 0) {
                return 1;
            }
            return Level.ALL_INT;
        }
        if (i2 == 130 && this.w == 1) {
            return 1;
        }
        return Level.ALL_INT;
    }

    c b2() {
        return new c();
    }

    void c2() {
        if (this.x == null) {
            this.x = b2();
        }
    }

    int d2(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i2 = cVar.f1501c;
        int i3 = cVar.f1505g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f1505g = i3 + i2;
            }
            E2(vVar, cVar);
        }
        int i4 = cVar.f1501c + cVar.f1506h;
        b bVar = this.J;
        while (true) {
            if ((!cVar.f1511m && i4 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            B2(vVar, a0Var, cVar, bVar);
            if (!bVar.f1497b) {
                cVar.f1500b += bVar.a * cVar.f1504f;
                if (!bVar.f1498c || cVar.f1510l != null || !a0Var.e()) {
                    int i5 = cVar.f1501c;
                    int i6 = bVar.a;
                    cVar.f1501c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = cVar.f1505g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + bVar.a;
                    cVar.f1505g = i8;
                    int i9 = cVar.f1501c;
                    if (i9 < 0) {
                        cVar.f1505g = i8 + i9;
                    }
                    E2(vVar, cVar);
                }
                if (z && bVar.f1499d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f1501c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iT2;
        int i6;
        View viewM;
        int iG;
        int i7;
        int i8 = -1;
        if (!(this.H == null && this.E == -1) && a0Var.b() == 0) {
            s1(vVar);
            return;
        }
        d dVar = this.H;
        if (dVar != null && dVar.a()) {
            this.E = this.H.f1512e;
        }
        c2();
        this.x.a = false;
        J2();
        View viewF0 = f0();
        a aVar = this.I;
        if (!aVar.f1496e || this.E != -1 || this.H != null) {
            aVar.e();
            a aVar2 = this.I;
            aVar2.f1495d = this.B ^ this.C;
            Q2(vVar, a0Var, aVar2);
            this.I.f1496e = true;
        } else if (viewF0 != null && (this.y.g(viewF0) >= this.y.i() || this.y.d(viewF0) <= this.y.m())) {
            this.I.c(viewF0, n0(viewF0));
        }
        c cVar = this.x;
        cVar.f1504f = cVar.f1509k >= 0 ? 1 : -1;
        int[] iArr = this.L;
        iArr[0] = 0;
        iArr[1] = 0;
        V1(a0Var, iArr);
        int iMax = Math.max(0, this.L[0]) + this.y.m();
        int iMax2 = Math.max(0, this.L[1]) + this.y.j();
        if (a0Var.e() && (i6 = this.E) != -1 && this.F != Integer.MIN_VALUE && (viewM = M(i6)) != null) {
            if (this.B) {
                i7 = this.y.i() - this.y.d(viewM);
                iG = this.F;
            } else {
                iG = this.y.g(viewM) - this.y.m();
                i7 = this.F;
            }
            int i9 = i7 - iG;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        a aVar3 = this.I;
        if (!aVar3.f1495d ? !this.B : this.B) {
            i8 = 1;
        }
        D2(vVar, a0Var, aVar3, i8);
        G(vVar);
        this.x.f1511m = I2();
        this.x.f1508j = a0Var.e();
        this.x.f1507i = 0;
        a aVar4 = this.I;
        if (aVar4.f1495d) {
            V2(aVar4);
            c cVar2 = this.x;
            cVar2.f1506h = iMax;
            d2(vVar, cVar2, a0Var, false);
            c cVar3 = this.x;
            i3 = cVar3.f1500b;
            int i10 = cVar3.f1502d;
            int i11 = cVar3.f1501c;
            if (i11 > 0) {
                iMax2 += i11;
            }
            T2(this.I);
            c cVar4 = this.x;
            cVar4.f1506h = iMax2;
            cVar4.f1502d += cVar4.f1503e;
            d2(vVar, cVar4, a0Var, false);
            c cVar5 = this.x;
            i2 = cVar5.f1500b;
            int i12 = cVar5.f1501c;
            if (i12 > 0) {
                U2(i10, i3);
                c cVar6 = this.x;
                cVar6.f1506h = i12;
                d2(vVar, cVar6, a0Var, false);
                i3 = this.x.f1500b;
            }
        } else {
            T2(aVar4);
            c cVar7 = this.x;
            cVar7.f1506h = iMax2;
            d2(vVar, cVar7, a0Var, false);
            c cVar8 = this.x;
            i2 = cVar8.f1500b;
            int i13 = cVar8.f1502d;
            int i14 = cVar8.f1501c;
            if (i14 > 0) {
                iMax += i14;
            }
            V2(this.I);
            c cVar9 = this.x;
            cVar9.f1506h = iMax;
            cVar9.f1502d += cVar9.f1503e;
            d2(vVar, cVar9, a0Var, false);
            c cVar10 = this.x;
            i3 = cVar10.f1500b;
            int i15 = cVar10.f1501c;
            if (i15 > 0) {
                S2(i13, i2);
                c cVar11 = this.x;
                cVar11.f1506h = i15;
                d2(vVar, cVar11, a0Var, false);
                i2 = this.x.f1500b;
            }
        }
        if (T() > 0) {
            if (this.B ^ this.C) {
                int iT22 = t2(i2, vVar, a0Var, true);
                i4 = i3 + iT22;
                i5 = i2 + iT22;
                iT2 = u2(i4, vVar, a0Var, false);
            } else {
                int iU2 = u2(i3, vVar, a0Var, true);
                i4 = i3 + iU2;
                i5 = i2 + iU2;
                iT2 = t2(i5, vVar, a0Var, false);
            }
            i3 = i4 + iT2;
            i2 = i5 + iT2;
        }
        C2(vVar, a0Var, i3, i2);
        if (a0Var.e()) {
            this.I.e();
        } else {
            this.y.s();
        }
        this.z = this.C;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.H = null;
        this.E = -1;
        this.F = Level.ALL_INT;
        this.I.e();
    }

    View g2(boolean z, boolean z2) {
        return this.B ? n2(0, T(), z, z2) : n2(T() - 1, -1, z, z2);
    }

    View h2(boolean z, boolean z2) {
        return this.B ? n2(T() - 1, -1, z, z2) : n2(0, T(), z, z2);
    }

    public int i2() {
        View viewN2 = n2(0, T(), false, true);
        if (viewN2 == null) {
            return -1;
        }
        return n0(viewN2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.H = (d) parcelable;
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable k1() {
        if (this.H != null) {
            return new d(this.H);
        }
        d dVar = new d();
        if (T() > 0) {
            c2();
            boolean z = this.z ^ this.B;
            dVar.f1514g = z;
            if (z) {
                View viewV2 = v2();
                dVar.f1513f = this.y.i() - this.y.d(viewV2);
                dVar.f1512e = n0(viewV2);
            } else {
                View viewW2 = w2();
                dVar.f1512e = n0(viewW2);
                dVar.f1513f = this.y.g(viewW2) - this.y.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    public int l2() {
        View viewN2 = n2(T() - 1, -1, false, true);
        if (viewN2 == null) {
            return -1;
        }
        return n0(viewN2);
    }

    View m2(int i2, int i3) {
        int i4;
        int i5;
        c2();
        if ((i3 > i2 ? (char) 1 : i3 < i2 ? (char) 65535 : (char) 0) == 0) {
            return S(i2);
        }
        if (this.y.g(S(i2)) < this.y.m()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.w == 0 ? this.f1567i.a(i2, i3, i4, i5) : this.f1568j.a(i2, i3, i4, i5);
    }

    View n2(int i2, int i3, boolean z, boolean z2) {
        c2();
        int i4 = z ? 24579 : 320;
        int i5 = z2 ? 320 : 0;
        return this.w == 0 ? this.f1567i.a(i2, i3, i4, i5) : this.f1568j.a(i2, i3, i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q(String str) {
        if (this.H == null) {
            super.q(str);
        }
    }

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
            if (iN0 >= 0 && iN0 < i4) {
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
    public boolean u() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        return this.w == 1;
    }

    @Deprecated
    protected int x2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.y.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.w != 0) {
            i2 = i3;
        }
        if (T() == 0 || i2 == 0) {
            return;
        }
        c2();
        R2(i2 > 0 ? 1 : -1, Math.abs(i2), true, a0Var);
        W1(a0Var, this.x, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean y0() {
        return true;
    }

    public int y2() {
        return this.w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void z(int i2, RecyclerView.o.c cVar) {
        boolean z;
        int i3;
        d dVar = this.H;
        if (dVar == null || !dVar.a()) {
            J2();
            z = this.B;
            i3 = this.E;
            if (i3 == -1) {
                i3 = z ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.H;
            z = dVar2.f1514g;
            i3 = dVar2.f1512e;
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < this.K && i3 >= 0 && i3 < i2; i5++) {
            cVar.a(i3, 0);
            i3 += i4;
        }
    }

    protected boolean z2() {
        return j0() == 1;
    }

    public LinearLayoutManager(Context context, int i2, boolean z) {
        this.w = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = -1;
        this.F = Level.ALL_INT;
        this.H = null;
        this.I = new a();
        this.J = new b();
        this.K = 2;
        this.L = new int[2];
        L2(i2);
        M2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.w = 1;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = true;
        this.E = -1;
        this.F = Level.ALL_INT;
        this.H = null;
        this.I = new a();
        this.J = new b();
        this.K = 2;
        this.L = new int[2];
        RecyclerView.o.d dVarO0 = RecyclerView.o.o0(context, attributeSet, i2, i3);
        L2(dVarO0.a);
        M2(dVarO0.f1573c);
        N2(dVarO0.f1574d);
    }
}