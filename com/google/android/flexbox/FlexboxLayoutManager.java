package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FlexboxLayoutManager extends RecyclerView.o implements com.google.android.flexbox.a, RecyclerView.z.b {
    private static final Rect w = new Rect();
    private int A;
    private boolean C;
    private boolean D;
    private RecyclerView.v G;
    private RecyclerView.a0 H;
    private d I;
    private p K;
    private p L;
    private e M;
    private boolean R;
    private final Context T;
    private View U;
    private int x;
    private int y;
    private int z;
    private int B = -1;
    private List<com.google.android.flexbox.c> E = new ArrayList();
    private final com.google.android.flexbox.d F = new com.google.android.flexbox.d(this);
    private b J = new b();
    private int N = -1;
    private int O = Level.ALL_INT;
    private int P = Level.ALL_INT;
    private int Q = Level.ALL_INT;
    private SparseArray<View> S = new SparseArray<>();
    private int V = -1;
    private d.b W = new d.b();

    private class b {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f4456b;

        /* renamed from: c, reason: collision with root package name */
        private int f4457c;

        /* renamed from: d, reason: collision with root package name */
        private int f4458d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4459e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f4460f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4461g;

        private b() {
            this.f4458d = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.C) {
                this.f4457c = this.f4459e ? FlexboxLayoutManager.this.K.i() : FlexboxLayoutManager.this.K.m();
            } else {
                this.f4457c = this.f4459e ? FlexboxLayoutManager.this.K.i() : FlexboxLayoutManager.this.u0() - FlexboxLayoutManager.this.K.m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(View view) {
            p pVar = FlexboxLayoutManager.this.y == 0 ? FlexboxLayoutManager.this.L : FlexboxLayoutManager.this.K;
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.C) {
                if (this.f4459e) {
                    this.f4457c = pVar.d(view) + pVar.o();
                } else {
                    this.f4457c = pVar.g(view);
                }
            } else if (this.f4459e) {
                this.f4457c = pVar.g(view) + pVar.o();
            } else {
                this.f4457c = pVar.d(view);
            }
            this.a = FlexboxLayoutManager.this.n0(view);
            this.f4461g = false;
            int[] iArr = FlexboxLayoutManager.this.F.f4492c;
            int i2 = this.a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            this.f4456b = i3 != -1 ? i3 : 0;
            if (FlexboxLayoutManager.this.E.size() > this.f4456b) {
                this.a = ((com.google.android.flexbox.c) FlexboxLayoutManager.this.E.get(this.f4456b)).o;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            this.a = -1;
            this.f4456b = -1;
            this.f4457c = Level.ALL_INT;
            this.f4460f = false;
            this.f4461g = false;
            if (FlexboxLayoutManager.this.j()) {
                if (FlexboxLayoutManager.this.y == 0) {
                    this.f4459e = FlexboxLayoutManager.this.x == 1;
                    return;
                } else {
                    this.f4459e = FlexboxLayoutManager.this.y == 2;
                    return;
                }
            }
            if (FlexboxLayoutManager.this.y == 0) {
                this.f4459e = FlexboxLayoutManager.this.x == 3;
            } else {
                this.f4459e = FlexboxLayoutManager.this.y == 2;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.f4456b + ", mCoordinate=" + this.f4457c + ", mPerpendicularCoordinate=" + this.f4458d + ", mLayoutFromEnd=" + this.f4459e + ", mValid=" + this.f4460f + ", mAssignedFromSavedState=" + this.f4461g + CoreConstants.CURLY_RIGHT;
        }
    }

    private static class d {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4468b;

        /* renamed from: c, reason: collision with root package name */
        private int f4469c;

        /* renamed from: d, reason: collision with root package name */
        private int f4470d;

        /* renamed from: e, reason: collision with root package name */
        private int f4471e;

        /* renamed from: f, reason: collision with root package name */
        private int f4472f;

        /* renamed from: g, reason: collision with root package name */
        private int f4473g;

        /* renamed from: h, reason: collision with root package name */
        private int f4474h;

        /* renamed from: i, reason: collision with root package name */
        private int f4475i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f4476j;

        private d() {
            this.f4474h = 1;
            this.f4475i = 1;
        }

        static /* synthetic */ int i(d dVar) {
            int i2 = dVar.f4469c;
            dVar.f4469c = i2 + 1;
            return i2;
        }

        static /* synthetic */ int j(d dVar) {
            int i2 = dVar.f4469c;
            dVar.f4469c = i2 - 1;
            return i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean w(RecyclerView.a0 a0Var, List<com.google.android.flexbox.c> list) {
            int i2;
            int i3 = this.f4470d;
            return i3 >= 0 && i3 < a0Var.b() && (i2 = this.f4469c) >= 0 && i2 < list.size();
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.a + ", mFlexLinePosition=" + this.f4469c + ", mPosition=" + this.f4470d + ", mOffset=" + this.f4471e + ", mScrollingOffset=" + this.f4472f + ", mLastScrollDelta=" + this.f4473g + ", mItemDirection=" + this.f4474h + ", mLayoutDirection=" + this.f4475i + CoreConstants.CURLY_RIGHT;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.o.d dVarO0 = RecyclerView.o.o0(context, attributeSet, i2, i3);
        int i4 = dVarO0.a;
        if (i4 != 0) {
            if (i4 == 1) {
                if (dVarO0.f1573c) {
                    N2(3);
                } else {
                    N2(2);
                }
            }
        } else if (dVarO0.f1573c) {
            N2(1);
        } else {
            N2(0);
        }
        O2(1);
        M2(4);
        H1(true);
        this.T = context;
    }

    private int A2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) throws NoSuchFieldException {
        if (T() == 0 || i2 == 0) {
            return 0;
        }
        j2();
        int i3 = 1;
        this.I.f4476j = true;
        boolean z = !j() && this.C;
        if (!z ? i2 <= 0 : i2 >= 0) {
            i3 = -1;
        }
        int iAbs = Math.abs(i2);
        U2(i3, iAbs);
        int iK2 = this.I.f4472f + k2(vVar, a0Var, this.I);
        if (iK2 < 0) {
            return 0;
        }
        if (z) {
            if (iAbs > iK2) {
                i2 = (-i3) * iK2;
            }
        } else if (iAbs > iK2) {
            i2 = i3 * iK2;
        }
        this.K.r(-i2);
        this.I.f4473g = i2;
        return i2;
    }

    private int B2(int i2) {
        int iMin;
        if (T() == 0 || i2 == 0) {
            return 0;
        }
        j2();
        boolean zJ = j();
        View view = this.U;
        int width = zJ ? view.getWidth() : view.getHeight();
        int iU0 = zJ ? u0() : g0();
        if (j0() == 1) {
            int iAbs = Math.abs(i2);
            if (i2 < 0) {
                iMin = Math.min((iU0 + this.J.f4458d) - width, iAbs);
            } else {
                if (this.J.f4458d + i2 <= 0) {
                    return i2;
                }
                iMin = this.J.f4458d;
            }
        } else {
            if (i2 > 0) {
                return Math.min((iU0 - this.J.f4458d) - width, i2);
            }
            if (this.J.f4458d + i2 >= 0) {
                return i2;
            }
            iMin = this.J.f4458d;
        }
        return -iMin;
    }

    private boolean C2(View view, boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iU0 = u0() - getPaddingRight();
        int iG0 = g0() - getPaddingBottom();
        int iX2 = x2(view);
        int iZ2 = z2(view);
        int iY2 = y2(view);
        int iV2 = v2(view);
        return z ? (paddingLeft <= iX2 && iU0 >= iY2) && (paddingTop <= iZ2 && iG0 >= iV2) : (iX2 >= iU0 || iY2 >= paddingLeft) && (iZ2 >= iG0 || iV2 >= paddingTop);
    }

    private static boolean D0(int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (i4 > 0 && i2 != i4) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i2;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i2;
        }
        return true;
    }

    private int D2(com.google.android.flexbox.c cVar, d dVar) {
        return j() ? E2(cVar, dVar) : F2(cVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int E2(com.google.android.flexbox.c r22, com.google.android.flexbox.FlexboxLayoutManager.d r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int F2(com.google.android.flexbox.c r26, com.google.android.flexbox.FlexboxLayoutManager.d r27) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.F2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    private void G2(RecyclerView.v vVar, d dVar) {
        if (dVar.f4476j) {
            if (dVar.f4475i == -1) {
                I2(vVar, dVar);
            } else {
                J2(vVar, dVar);
            }
        }
    }

    private void H2(RecyclerView.v vVar, int i2, int i3) {
        while (i3 >= i2) {
            v1(i3, vVar);
            i3--;
        }
    }

    private void I2(RecyclerView.v vVar, d dVar) {
        if (dVar.f4472f < 0) {
            return;
        }
        this.K.h();
        int unused = dVar.f4472f;
        int iT = T();
        if (iT == 0) {
            return;
        }
        int i2 = iT - 1;
        int i3 = this.F.f4492c[n0(S(i2))];
        if (i3 == -1) {
            return;
        }
        com.google.android.flexbox.c cVar = this.E.get(i3);
        int i4 = i2;
        while (true) {
            if (i4 < 0) {
                break;
            }
            View viewS = S(i4);
            if (!c2(viewS, dVar.f4472f)) {
                break;
            }
            if (cVar.o == n0(viewS)) {
                if (i3 <= 0) {
                    iT = i4;
                    break;
                } else {
                    i3 += dVar.f4475i;
                    cVar = this.E.get(i3);
                    iT = i4;
                }
            }
            i4--;
        }
        H2(vVar, iT, i2);
    }

    private void J2(RecyclerView.v vVar, d dVar) {
        int iT;
        if (dVar.f4472f >= 0 && (iT = T()) != 0) {
            int i2 = this.F.f4492c[n0(S(0))];
            int i3 = -1;
            if (i2 == -1) {
                return;
            }
            com.google.android.flexbox.c cVar = this.E.get(i2);
            int i4 = 0;
            while (true) {
                if (i4 >= iT) {
                    break;
                }
                View viewS = S(i4);
                if (!d2(viewS, dVar.f4472f)) {
                    break;
                }
                if (cVar.p == n0(viewS)) {
                    if (i2 >= this.E.size() - 1) {
                        i3 = i4;
                        break;
                    } else {
                        i2 += dVar.f4475i;
                        cVar = this.E.get(i2);
                        i3 = i4;
                    }
                }
                i4++;
            }
            H2(vVar, 0, i3);
        }
    }

    private void K2() {
        int iH0 = j() ? h0() : v0();
        this.I.f4468b = iH0 == 0 || iH0 == Integer.MIN_VALUE;
    }

    private void L2() {
        int iJ0 = j0();
        int i2 = this.x;
        if (i2 == 0) {
            this.C = iJ0 == 1;
            this.D = this.y == 2;
            return;
        }
        if (i2 == 1) {
            this.C = iJ0 != 1;
            this.D = this.y == 2;
            return;
        }
        if (i2 == 2) {
            boolean z = iJ0 == 1;
            this.C = z;
            if (this.y == 2) {
                this.C = !z;
            }
            this.D = false;
            return;
        }
        if (i2 != 3) {
            this.C = false;
            this.D = false;
            return;
        }
        boolean z2 = iJ0 == 1;
        this.C = z2;
        if (this.y == 2) {
            this.C = !z2;
        }
        this.D = true;
    }

    private boolean O1(View view, int i2, int i3, RecyclerView.p pVar) {
        return (!view.isLayoutRequested() && C0() && D0(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) pVar).width) && D0(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
    }

    private boolean P2(RecyclerView.a0 a0Var, b bVar) {
        if (T() == 0) {
            return false;
        }
        View viewO2 = bVar.f4459e ? o2(a0Var.b()) : l2(a0Var.b());
        if (viewO2 == null) {
            return false;
        }
        bVar.r(viewO2);
        if (!a0Var.e() && U1()) {
            if (this.K.g(viewO2) >= this.K.i() || this.K.d(viewO2) < this.K.m()) {
                bVar.f4457c = bVar.f4459e ? this.K.i() : this.K.m();
            }
        }
        return true;
    }

    private boolean Q2(RecyclerView.a0 a0Var, b bVar, e eVar) {
        int i2;
        if (!a0Var.e() && (i2 = this.N) != -1) {
            if (i2 >= 0 && i2 < a0Var.b()) {
                bVar.a = this.N;
                bVar.f4456b = this.F.f4492c[bVar.a];
                e eVar2 = this.M;
                if (eVar2 != null && eVar2.j(a0Var.b())) {
                    bVar.f4457c = this.K.m() + eVar.f4478f;
                    bVar.f4461g = true;
                    bVar.f4456b = -1;
                    return true;
                }
                if (this.O != Integer.MIN_VALUE) {
                    if (j() || !this.C) {
                        bVar.f4457c = this.K.m() + this.O;
                    } else {
                        bVar.f4457c = this.O - this.K.j();
                    }
                    return true;
                }
                View viewM = M(this.N);
                if (viewM == null) {
                    if (T() > 0) {
                        bVar.f4459e = this.N < n0(S(0));
                    }
                    bVar.q();
                } else {
                    if (this.K.e(viewM) > this.K.n()) {
                        bVar.q();
                        return true;
                    }
                    if (this.K.g(viewM) - this.K.m() < 0) {
                        bVar.f4457c = this.K.m();
                        bVar.f4459e = false;
                        return true;
                    }
                    if (this.K.i() - this.K.d(viewM) < 0) {
                        bVar.f4457c = this.K.i();
                        bVar.f4459e = true;
                        return true;
                    }
                    bVar.f4457c = bVar.f4459e ? this.K.d(viewM) + this.K.o() : this.K.g(viewM);
                }
                return true;
            }
            this.N = -1;
            this.O = Level.ALL_INT;
        }
        return false;
    }

    private void R2(RecyclerView.a0 a0Var, b bVar) {
        if (Q2(a0Var, bVar, this.M) || P2(a0Var, bVar)) {
            return;
        }
        bVar.q();
        bVar.a = 0;
        bVar.f4456b = 0;
    }

    private void S2(int i2) {
        if (i2 >= q2()) {
            return;
        }
        int iT = T();
        this.F.t(iT);
        this.F.u(iT);
        this.F.s(iT);
        if (i2 >= this.F.f4492c.length) {
            return;
        }
        this.V = i2;
        View viewW2 = w2();
        if (viewW2 == null) {
            return;
        }
        this.N = n0(viewW2);
        if (j() || !this.C) {
            this.O = this.K.g(viewW2) - this.K.m();
        } else {
            this.O = this.K.d(viewW2) + this.K.j();
        }
    }

    private void T2(int i2) throws NoSuchFieldException {
        boolean z;
        int i3;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        int iU0 = u0();
        int iG0 = g0();
        if (j()) {
            int i4 = this.P;
            z = (i4 == Integer.MIN_VALUE || i4 == iU0) ? false : true;
            i3 = this.I.f4468b ? this.T.getResources().getDisplayMetrics().heightPixels : this.I.a;
        } else {
            int i5 = this.Q;
            z = (i5 == Integer.MIN_VALUE || i5 == iG0) ? false : true;
            i3 = this.I.f4468b ? this.T.getResources().getDisplayMetrics().widthPixels : this.I.a;
        }
        int i6 = i3;
        this.P = iU0;
        this.Q = iG0;
        int i7 = this.V;
        if (i7 == -1 && (this.N != -1 || z)) {
            if (this.J.f4459e) {
                return;
            }
            this.E.clear();
            this.W.a();
            if (j()) {
                this.F.e(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i6, this.J.a, this.E);
            } else {
                this.F.h(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i6, this.J.a, this.E);
            }
            this.E = this.W.a;
            this.F.p(iMakeMeasureSpec, iMakeMeasureSpec2);
            this.F.X();
            b bVar = this.J;
            bVar.f4456b = this.F.f4492c[bVar.a];
            this.I.f4469c = this.J.f4456b;
            return;
        }
        int iMin = i7 != -1 ? Math.min(i7, this.J.a) : this.J.a;
        this.W.a();
        if (j()) {
            if (this.E.size() > 0) {
                this.F.j(this.E, iMin);
                this.F.b(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i6, iMin, this.J.a, this.E);
            } else {
                this.F.s(i2);
                this.F.d(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i6, 0, this.E);
            }
        } else if (this.E.size() > 0) {
            this.F.j(this.E, iMin);
            this.F.b(this.W, iMakeMeasureSpec2, iMakeMeasureSpec, i6, iMin, this.J.a, this.E);
        } else {
            this.F.s(i2);
            this.F.g(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i6, 0, this.E);
        }
        this.E = this.W.a;
        this.F.q(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
        this.F.Y(iMin);
    }

    private void U2(int i2, int i3) throws NoSuchFieldException {
        this.I.f4475i = i2;
        boolean zJ = j();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        boolean z = !zJ && this.C;
        if (i2 == 1) {
            View viewS = S(T() - 1);
            this.I.f4471e = this.K.d(viewS);
            int iN0 = n0(viewS);
            View viewP2 = p2(viewS, this.E.get(this.F.f4492c[iN0]));
            this.I.f4474h = 1;
            d dVar = this.I;
            dVar.f4470d = iN0 + dVar.f4474h;
            if (this.F.f4492c.length <= this.I.f4470d) {
                this.I.f4469c = -1;
            } else {
                d dVar2 = this.I;
                dVar2.f4469c = this.F.f4492c[dVar2.f4470d];
            }
            if (z) {
                this.I.f4471e = this.K.g(viewP2);
                this.I.f4472f = (-this.K.g(viewP2)) + this.K.m();
                d dVar3 = this.I;
                dVar3.f4472f = dVar3.f4472f >= 0 ? this.I.f4472f : 0;
            } else {
                this.I.f4471e = this.K.d(viewP2);
                this.I.f4472f = this.K.d(viewP2) - this.K.i();
            }
            if ((this.I.f4469c == -1 || this.I.f4469c > this.E.size() - 1) && this.I.f4470d <= getFlexItemCount()) {
                int i4 = i3 - this.I.f4472f;
                this.W.a();
                if (i4 > 0) {
                    if (zJ) {
                        this.F.d(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i4, this.I.f4470d, this.E);
                    } else {
                        this.F.g(this.W, iMakeMeasureSpec, iMakeMeasureSpec2, i4, this.I.f4470d, this.E);
                    }
                    this.F.q(iMakeMeasureSpec, iMakeMeasureSpec2, this.I.f4470d);
                    this.F.Y(this.I.f4470d);
                }
            }
        } else {
            View viewS2 = S(0);
            this.I.f4471e = this.K.g(viewS2);
            int iN02 = n0(viewS2);
            View viewM2 = m2(viewS2, this.E.get(this.F.f4492c[iN02]));
            this.I.f4474h = 1;
            int i5 = this.F.f4492c[iN02];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 > 0) {
                this.I.f4470d = iN02 - this.E.get(i5 - 1).b();
            } else {
                this.I.f4470d = -1;
            }
            this.I.f4469c = i5 > 0 ? i5 - 1 : 0;
            if (z) {
                this.I.f4471e = this.K.d(viewM2);
                this.I.f4472f = this.K.d(viewM2) - this.K.i();
                d dVar4 = this.I;
                dVar4.f4472f = dVar4.f4472f >= 0 ? this.I.f4472f : 0;
            } else {
                this.I.f4471e = this.K.g(viewM2);
                this.I.f4472f = (-this.K.g(viewM2)) + this.K.m();
            }
        }
        d dVar5 = this.I;
        dVar5.a = i3 - dVar5.f4472f;
    }

    private void V2(b bVar, boolean z, boolean z2) {
        if (z2) {
            K2();
        } else {
            this.I.f4468b = false;
        }
        if (j() || !this.C) {
            this.I.a = this.K.i() - bVar.f4457c;
        } else {
            this.I.a = bVar.f4457c - getPaddingRight();
        }
        this.I.f4470d = bVar.a;
        this.I.f4474h = 1;
        this.I.f4475i = 1;
        this.I.f4471e = bVar.f4457c;
        this.I.f4472f = Level.ALL_INT;
        this.I.f4469c = bVar.f4456b;
        if (!z || this.E.size() <= 1 || bVar.f4456b < 0 || bVar.f4456b >= this.E.size() - 1) {
            return;
        }
        com.google.android.flexbox.c cVar = this.E.get(bVar.f4456b);
        d.i(this.I);
        this.I.f4470d += cVar.b();
    }

    private void W2(b bVar, boolean z, boolean z2) {
        if (z2) {
            K2();
        } else {
            this.I.f4468b = false;
        }
        if (j() || !this.C) {
            this.I.a = bVar.f4457c - this.K.m();
        } else {
            this.I.a = (this.U.getWidth() - bVar.f4457c) - this.K.m();
        }
        this.I.f4470d = bVar.a;
        this.I.f4474h = 1;
        this.I.f4475i = -1;
        this.I.f4471e = bVar.f4457c;
        this.I.f4472f = Level.ALL_INT;
        this.I.f4469c = bVar.f4456b;
        if (!z || bVar.f4456b <= 0 || this.E.size() <= bVar.f4456b) {
            return;
        }
        com.google.android.flexbox.c cVar = this.E.get(bVar.f4456b);
        d.j(this.I);
        this.I.f4470d -= cVar.b();
    }

    private boolean c2(View view, int i2) {
        return (j() || !this.C) ? this.K.g(view) >= this.K.h() - i2 : this.K.d(view) <= i2;
    }

    private boolean d2(View view, int i2) {
        return (j() || !this.C) ? this.K.d(view) <= i2 : this.K.h() - this.K.g(view) <= i2;
    }

    private void e2() {
        this.E.clear();
        this.J.s();
        this.J.f4458d = 0;
    }

    private int f2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int iB = a0Var.b();
        j2();
        View viewL2 = l2(iB);
        View viewO2 = o2(iB);
        if (a0Var.b() == 0 || viewL2 == null || viewO2 == null) {
            return 0;
        }
        return Math.min(this.K.n(), this.K.d(viewO2) - this.K.g(viewL2));
    }

    private int g2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int iB = a0Var.b();
        View viewL2 = l2(iB);
        View viewO2 = o2(iB);
        if (a0Var.b() != 0 && viewL2 != null && viewO2 != null) {
            int iN0 = n0(viewL2);
            int iN02 = n0(viewO2);
            int iAbs = Math.abs(this.K.d(viewO2) - this.K.g(viewL2));
            int i2 = this.F.f4492c[iN0];
            if (i2 != 0 && i2 != -1) {
                return Math.round((i2 * (iAbs / ((r4[iN02] - i2) + 1))) + (this.K.m() - this.K.g(viewL2)));
            }
        }
        return 0;
    }

    private int h2(RecyclerView.a0 a0Var) {
        if (T() == 0) {
            return 0;
        }
        int iB = a0Var.b();
        View viewL2 = l2(iB);
        View viewO2 = o2(iB);
        if (a0Var.b() == 0 || viewL2 == null || viewO2 == null) {
            return 0;
        }
        int iN2 = n2();
        return (int) ((Math.abs(this.K.d(viewO2) - this.K.g(viewL2)) / ((q2() - iN2) + 1)) * a0Var.b());
    }

    private void i2() {
        if (this.I == null) {
            this.I = new d();
        }
    }

    private void j2() {
        if (this.K != null) {
            return;
        }
        if (j()) {
            if (this.y == 0) {
                this.K = p.a(this);
                this.L = p.c(this);
                return;
            } else {
                this.K = p.c(this);
                this.L = p.a(this);
                return;
            }
        }
        if (this.y == 0) {
            this.K = p.c(this);
            this.L = p.a(this);
        } else {
            this.K = p.a(this);
            this.L = p.c(this);
        }
    }

    private int k2(RecyclerView.v vVar, RecyclerView.a0 a0Var, d dVar) {
        if (dVar.f4472f != Integer.MIN_VALUE) {
            if (dVar.a < 0) {
                dVar.f4472f += dVar.a;
            }
            G2(vVar, dVar);
        }
        int i2 = dVar.a;
        int iA = dVar.a;
        int iD2 = 0;
        boolean zJ = j();
        while (true) {
            if ((iA <= 0 && !this.I.f4468b) || !dVar.w(a0Var, this.E)) {
                break;
            }
            com.google.android.flexbox.c cVar = this.E.get(dVar.f4469c);
            dVar.f4470d = cVar.o;
            iD2 += D2(cVar, dVar);
            if (zJ || !this.C) {
                dVar.f4471e += cVar.a() * dVar.f4475i;
            } else {
                dVar.f4471e -= cVar.a() * dVar.f4475i;
            }
            iA -= cVar.a();
        }
        dVar.a -= iD2;
        if (dVar.f4472f != Integer.MIN_VALUE) {
            dVar.f4472f += iD2;
            if (dVar.a < 0) {
                dVar.f4472f += dVar.a;
            }
            G2(vVar, dVar);
        }
        return i2 - dVar.a;
    }

    private View l2(int i2) {
        View viewS2 = s2(0, T(), i2);
        if (viewS2 == null) {
            return null;
        }
        int i3 = this.F.f4492c[n0(viewS2)];
        if (i3 == -1) {
            return null;
        }
        return m2(viewS2, this.E.get(i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View m2(android.view.View r6, com.google.android.flexbox.c r7) {
        /*
            r5 = this;
            boolean r0 = r5.j()
            int r7 = r7.f4485h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.S(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.C
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.p r3 = r5.K
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.p r4 = r5.K
            int r4 = r4.d(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.p r3 = r5.K
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.p r4 = r5.K
            int r4 = r4.g(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m2(android.view.View, com.google.android.flexbox.c):android.view.View");
    }

    private View o2(int i2) {
        View viewS2 = s2(T() - 1, -1, i2);
        if (viewS2 == null) {
            return null;
        }
        return p2(viewS2, this.E.get(this.F.f4492c[n0(viewS2)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View p2(android.view.View r6, com.google.android.flexbox.c r7) {
        /*
            r5 = this;
            boolean r0 = r5.j()
            int r1 = r5.T()
            int r1 = r1 + (-2)
            int r2 = r5.T()
            int r7 = r7.f4485h
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.S(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.C
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.p r3 = r5.K
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.p r4 = r5.K
            int r4 = r4.g(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.p r3 = r5.K
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.p r4 = r5.K
            int r4 = r4.d(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.p2(android.view.View, com.google.android.flexbox.c):android.view.View");
    }

    private View r2(int i2, int i3, boolean z) {
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View viewS = S(i2);
            if (C2(viewS, z)) {
                return viewS;
            }
            i2 += i4;
        }
        return null;
    }

    private View s2(int i2, int i3, int i4) {
        j2();
        i2();
        int iM = this.K.m();
        int i5 = this.K.i();
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
                    if (this.K.g(viewS) >= iM && this.K.d(viewS) <= i5) {
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

    private int t2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) throws NoSuchFieldException {
        int iA2;
        int i3;
        if (!j() && this.C) {
            int iM = i2 - this.K.m();
            if (iM <= 0) {
                return 0;
            }
            iA2 = A2(iM, vVar, a0Var);
        } else {
            int i4 = this.K.i() - i2;
            if (i4 <= 0) {
                return 0;
            }
            iA2 = -A2(-i4, vVar, a0Var);
        }
        int i5 = i2 + iA2;
        if (!z || (i3 = this.K.i() - i5) <= 0) {
            return iA2;
        }
        this.K.r(i3);
        return i3 + iA2;
    }

    private int u2(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) throws NoSuchFieldException {
        int iA2;
        int iM;
        if (j() || !this.C) {
            int iM2 = i2 - this.K.m();
            if (iM2 <= 0) {
                return 0;
            }
            iA2 = -A2(iM2, vVar, a0Var);
        } else {
            int i3 = this.K.i() - i2;
            if (i3 <= 0) {
                return 0;
            }
            iA2 = A2(-i3, vVar, a0Var);
        }
        int i4 = i2 + iA2;
        if (!z || (iM = i4 - this.K.m()) <= 0) {
            return iA2;
        }
        this.K.r(-iM);
        return iA2 - iM;
    }

    private int v2(View view) {
        return Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
    }

    private View w2() {
        return S(0);
    }

    private int x2(View view) {
        return a0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
    }

    private int y2(View view) {
        return d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
    }

    private int z2(View view) {
        return e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int B(RecyclerView.a0 a0Var) {
        return g2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C(RecyclerView.a0 a0Var) {
        return h2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int D(RecyclerView.a0 a0Var) {
        return f2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E(RecyclerView.a0 a0Var) {
        return g2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) throws NoSuchFieldException {
        if (!j() || (this.y == 0 && j())) {
            int iA2 = A2(i2, vVar, a0Var);
            this.S.clear();
            return iA2;
        }
        int iB2 = B2(i2);
        this.J.f4458d += iB2;
        this.L.r(-iB2);
        return iB2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int F(RecyclerView.a0 a0Var) {
        return h2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void F1(int i2) {
        this.N = i2;
        this.O = Level.ALL_INT;
        e eVar = this.M;
        if (eVar != null) {
            eVar.q();
        }
        B1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int G1(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) throws NoSuchFieldException {
        if (j() || (this.y == 0 && !j())) {
            int iA2 = A2(i2, vVar, a0Var);
            this.S.clear();
            return iA2;
        }
        int iB2 = B2(i2);
        this.J.f4458d += iB2;
        this.L.r(-iB2);
        return iB2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L0(RecyclerView.g gVar, RecyclerView.g gVar2) {
        r1();
    }

    public void M2(int i2) {
        int i3 = this.A;
        if (i3 != i2) {
            if (i3 == 4 || i2 == 4) {
                r1();
                e2();
            }
            this.A = i2;
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p N() {
        return new c(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void N0(RecyclerView recyclerView) {
        super.N0(recyclerView);
        this.U = (View) recyclerView.getParent();
    }

    public void N2(int i2) {
        if (this.x != i2) {
            r1();
            this.x = i2;
            this.K = null;
            this.L = null;
            e2();
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p O(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void O2(int i2) {
        if (i2 == 2) {
            throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
        }
        int i3 = this.y;
        if (i3 != i2) {
            if (i3 == 0 || i2 == 0) {
                r1();
                e2();
            }
            this.y = i2;
            this.K = null;
            this.L = null;
            B1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.P0(recyclerView, vVar);
        if (this.R) {
            s1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i2);
        S1(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i2, int i3) {
        super.Y0(recyclerView, i2, i3);
        S2(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i2) {
        if (T() == 0) {
            return null;
        }
        int i3 = i2 < n0(S(0)) ? -1 : 1;
        return j() ? new PointF(0.0f, i3) : new PointF(i3, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i2, int i3, int i4) {
        super.a1(recyclerView, i2, i3, i4);
        S2(Math.min(i2, i3));
    }

    @Override // com.google.android.flexbox.a
    public void b(View view, int i2, int i3, com.google.android.flexbox.c cVar) {
        t(view, w);
        if (j()) {
            int iK0 = k0(view) + p0(view);
            cVar.f4482e += iK0;
            cVar.f4483f += iK0;
        } else {
            int iS0 = s0(view) + R(view);
            cVar.f4482e += iS0;
            cVar.f4483f += iS0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView recyclerView, int i2, int i3) {
        super.b1(recyclerView, i2, i3);
        S2(i2);
    }

    @Override // com.google.android.flexbox.a
    public void c(com.google.android.flexbox.c cVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView recyclerView, int i2, int i3) {
        super.c1(recyclerView, i2, i3);
        S2(i2);
    }

    @Override // com.google.android.flexbox.a
    public View d(int i2) {
        return g(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView recyclerView, int i2, int i3, Object obj) {
        super.d1(recyclerView, i2, i3, obj);
        S2(i2);
    }

    @Override // com.google.android.flexbox.a
    public int e(int i2, int i3, int i4) {
        return RecyclerView.o.U(u0(), v0(), i3, i4, u());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var) throws NoSuchFieldException {
        int i2;
        int i3;
        this.G = vVar;
        this.H = a0Var;
        int iB = a0Var.b();
        if (iB == 0 && a0Var.e()) {
            return;
        }
        L2();
        j2();
        i2();
        this.F.t(iB);
        this.F.u(iB);
        this.F.s(iB);
        this.I.f4476j = false;
        e eVar = this.M;
        if (eVar != null && eVar.j(iB)) {
            this.N = this.M.f4477e;
        }
        if (!this.J.f4460f || this.N != -1 || this.M != null) {
            this.J.s();
            R2(a0Var, this.J);
            this.J.f4460f = true;
        }
        G(vVar);
        if (this.J.f4459e) {
            W2(this.J, false, true);
        } else {
            V2(this.J, false, true);
        }
        T2(iB);
        if (this.J.f4459e) {
            k2(vVar, a0Var, this.I);
            i3 = this.I.f4471e;
            V2(this.J, true, false);
            k2(vVar, a0Var, this.I);
            i2 = this.I.f4471e;
        } else {
            k2(vVar, a0Var, this.I);
            i2 = this.I.f4471e;
            W2(this.J, true, false);
            k2(vVar, a0Var, this.I);
            i3 = this.I.f4471e;
        }
        if (T() > 0) {
            if (this.J.f4459e) {
                u2(i3 + t2(i2, vVar, a0Var, true), vVar, a0Var, false);
            } else {
                t2(i2 + u2(i3, vVar, a0Var, true), vVar, a0Var, false);
            }
        }
    }

    @Override // com.google.android.flexbox.a
    public void f(int i2, View view) {
        this.S.put(i2, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f1(RecyclerView.a0 a0Var) {
        super.f1(a0Var);
        this.M = null;
        this.N = -1;
        this.O = Level.ALL_INT;
        this.V = -1;
        this.J.s();
        this.S.clear();
    }

    @Override // com.google.android.flexbox.a
    public View g(int i2) {
        View view = this.S.get(i2);
        return view != null ? view : this.G.o(i2);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.A;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.x;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.H.b();
    }

    @Override // com.google.android.flexbox.a
    public List<com.google.android.flexbox.c> getFlexLinesInternal() {
        return this.E;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.y;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.E.size() == 0) {
            return 0;
        }
        int iMax = Level.ALL_INT;
        int size = this.E.size();
        for (int i2 = 0; i2 < size; i2++) {
            iMax = Math.max(iMax, this.E.get(i2).f4482e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.B;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.E.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.E.get(i3).f4484g;
        }
        return i2;
    }

    @Override // com.google.android.flexbox.a
    public int h(View view, int i2, int i3) {
        int iS0;
        int iR;
        if (j()) {
            iS0 = k0(view);
            iR = p0(view);
        } else {
            iS0 = s0(view);
            iR = R(view);
        }
        return iS0 + iR;
    }

    @Override // com.google.android.flexbox.a
    public int i(int i2, int i3, int i4) {
        return RecyclerView.o.U(g0(), h0(), i3, i4, v());
    }

    @Override // com.google.android.flexbox.a
    public boolean j() {
        int i2 = this.x;
        return i2 == 0 || i2 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.M = (e) parcelable;
            B1();
        }
    }

    @Override // com.google.android.flexbox.a
    public int k(View view) {
        int iK0;
        int iP0;
        if (j()) {
            iK0 = s0(view);
            iP0 = R(view);
        } else {
            iK0 = k0(view);
            iP0 = p0(view);
        }
        return iK0 + iP0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable k1() {
        if (this.M != null) {
            return new e(this.M);
        }
        e eVar = new e();
        if (T() > 0) {
            View viewW2 = w2();
            eVar.f4477e = n0(viewW2);
            eVar.f4478f = this.K.g(viewW2) - this.K.m();
        } else {
            eVar.q();
        }
        return eVar;
    }

    public int n2() {
        View viewR2 = r2(0, T(), false);
        if (viewR2 == null) {
            return -1;
        }
        return n0(viewR2);
    }

    public int q2() {
        View viewR2 = r2(T() - 1, -1, false);
        if (viewR2 == null) {
            return -1;
        }
        return n0(viewR2);
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<com.google.android.flexbox.c> list) {
        this.E = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean u() {
        if (this.y == 0) {
            return j();
        }
        if (j()) {
            int iU0 = u0();
            View view = this.U;
            if (iU0 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        if (this.y == 0) {
            return !j();
        }
        if (j()) {
            return true;
        }
        int iG0 = g0();
        View view = this.U;
        return iG0 > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    private static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        private int f4477e;

        /* renamed from: f, reason: collision with root package name */
        private int f4478f;

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

        /* JADX INFO: Access modifiers changed from: private */
        public boolean j(int i2) {
            int i3 = this.f4477e;
            return i3 >= 0 && i3 < i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            this.f4477e = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f4477e + ", mAnchorOffset=" + this.f4478f + CoreConstants.CURLY_RIGHT;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f4477e);
            parcel.writeInt(this.f4478f);
        }

        e() {
        }

        private e(Parcel parcel) {
            this.f4477e = parcel.readInt();
            this.f4478f = parcel.readInt();
        }

        private e(e eVar) {
            this.f4477e = eVar.f4477e;
            this.f4478f = eVar.f4478f;
        }
    }

    public static class c extends RecyclerView.p implements com.google.android.flexbox.b {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: i, reason: collision with root package name */
        private float f4463i;

        /* renamed from: j, reason: collision with root package name */
        private float f4464j;

        /* renamed from: k, reason: collision with root package name */
        private int f4465k;

        /* renamed from: l, reason: collision with root package name */
        private float f4466l;

        /* renamed from: m, reason: collision with root package name */
        private int f4467m;
        private int n;
        private int o;
        private int p;
        private boolean q;

        static class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4463i = 0.0f;
            this.f4464j = 1.0f;
            this.f4465k = -1;
            this.f4466l = -1.0f;
            this.o = 16777215;
            this.p = 16777215;
        }

        @Override // com.google.android.flexbox.b
        public boolean E() {
            return this.q;
        }

        @Override // com.google.android.flexbox.b
        public int F() {
            return this.p;
        }

        @Override // com.google.android.flexbox.b
        public int H() {
            return this.o;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int h() {
            return this.f4465k;
        }

        @Override // com.google.android.flexbox.b
        public float k() {
            return this.f4464j;
        }

        @Override // com.google.android.flexbox.b
        public int l() {
            return this.f4467m;
        }

        @Override // com.google.android.flexbox.b
        public void m(int i2) {
            this.f4467m = i2;
        }

        @Override // com.google.android.flexbox.b
        public void o(int i2) {
            this.n = i2;
        }

        @Override // com.google.android.flexbox.b
        public float p() {
            return this.f4463i;
        }

        @Override // com.google.android.flexbox.b
        public float u() {
            return this.f4466l;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.f4463i);
            parcel.writeFloat(this.f4464j);
            parcel.writeInt(this.f4465k);
            parcel.writeFloat(this.f4466l);
            parcel.writeInt(this.f4467m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.b
        public int z() {
            return this.n;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.f4463i = 0.0f;
            this.f4464j = 1.0f;
            this.f4465k = -1;
            this.f4466l = -1.0f;
            this.o = 16777215;
            this.p = 16777215;
        }

        protected c(Parcel parcel) {
            super(-2, -2);
            this.f4463i = 0.0f;
            this.f4464j = 1.0f;
            this.f4465k = -1;
            this.f4466l = -1.0f;
            this.o = 16777215;
            this.p = 16777215;
            this.f4463i = parcel.readFloat();
            this.f4464j = parcel.readFloat();
            this.f4465k = parcel.readInt();
            this.f4466l = parcel.readFloat();
            this.f4467m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}