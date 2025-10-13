package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.Level;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class q extends u {

    /* renamed from: d, reason: collision with root package name */
    private p f1768d;

    /* renamed from: e, reason: collision with root package name */
    private p f1769e;

    /* compiled from: PagerSnapHelper.java */
    class a extends l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView.z
        protected void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            q qVar = q.this;
            int[] iArrC = qVar.c(qVar.a.getLayoutManager(), view);
            int i2 = iArrC[0];
            int i3 = iArrC[1];
            int iW = w(Math.max(Math.abs(i2), Math.abs(i3)));
            if (iW > 0) {
                aVar.d(i2, i3, iW, this.f1760j);
            }
        }

        @Override // androidx.recyclerview.widget.l
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.l
        protected int x(int i2) {
            return Math.min(100, super.x(i2));
        }
    }

    private int l(RecyclerView.o oVar, View view, p pVar) {
        return (pVar.g(view) + (pVar.e(view) / 2)) - (pVar.m() + (pVar.n() / 2));
    }

    private View m(RecyclerView.o oVar, p pVar) {
        int iT = oVar.T();
        View view = null;
        if (iT == 0) {
            return null;
        }
        int iM = pVar.m() + (pVar.n() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iT; i3++) {
            View viewS = oVar.S(i3);
            int iAbs = Math.abs((pVar.g(viewS) + (pVar.e(viewS) / 2)) - iM);
            if (iAbs < i2) {
                view = viewS;
                i2 = iAbs;
            }
        }
        return view;
    }

    private p n(RecyclerView.o oVar) {
        p pVar = this.f1769e;
        if (pVar == null || pVar.a != oVar) {
            this.f1769e = p.a(oVar);
        }
        return this.f1769e;
    }

    private p o(RecyclerView.o oVar) {
        if (oVar.v()) {
            return p(oVar);
        }
        if (oVar.u()) {
            return n(oVar);
        }
        return null;
    }

    private p p(RecyclerView.o oVar) {
        p pVar = this.f1768d;
        if (pVar == null || pVar.a != oVar) {
            this.f1768d = p.c(oVar);
        }
        return this.f1768d;
    }

    private boolean q(RecyclerView.o oVar, int i2, int i3) {
        return oVar.u() ? i2 > 0 : i3 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean r(RecyclerView.o oVar) {
        PointF pointFA;
        int iI0 = oVar.i0();
        if (!(oVar instanceof RecyclerView.z.b) || (pointFA = ((RecyclerView.z.b) oVar).a(iI0 - 1)) == null) {
            return false;
        }
        return pointFA.x < 0.0f || pointFA.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.u
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.u()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.v()) {
            iArr[1] = l(oVar, view, p(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.u
    protected l e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.z.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.u
    public View g(RecyclerView.o oVar) {
        if (oVar.v()) {
            return m(oVar, p(oVar));
        }
        if (oVar.u()) {
            return m(oVar, n(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.u
    public int h(RecyclerView.o oVar, int i2, int i3) {
        p pVarO;
        int iI0 = oVar.i0();
        if (iI0 == 0 || (pVarO = o(oVar)) == null) {
            return -1;
        }
        int i4 = Level.ALL_INT;
        int i5 = Integer.MAX_VALUE;
        int iT = oVar.T();
        View view = null;
        View view2 = null;
        for (int i6 = 0; i6 < iT; i6++) {
            View viewS = oVar.S(i6);
            if (viewS != null) {
                int iL = l(oVar, viewS, pVarO);
                if (iL <= 0 && iL > i4) {
                    view2 = viewS;
                    i4 = iL;
                }
                if (iL >= 0 && iL < i5) {
                    view = viewS;
                    i5 = iL;
                }
            }
        }
        boolean zQ = q(oVar, i2, i3);
        if (zQ && view != null) {
            return oVar.n0(view);
        }
        if (!zQ && view2 != null) {
            return oVar.n0(view2);
        }
        if (zQ) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iN0 = oVar.n0(view) + (r(oVar) == zQ ? -1 : 1);
        if (iN0 < 0 || iN0 >= iI0) {
            return -1;
        }
        return iN0;
    }
}