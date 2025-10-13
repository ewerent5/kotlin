package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes.dex */
public abstract class u extends RecyclerView.r {
    RecyclerView a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f1775b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.t f1776c = new a();

    /* compiled from: SnapHelper.java */
    class a extends RecyclerView.t {
        boolean a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i2) {
            super.a(recyclerView, i2);
            if (i2 == 0 && this.a) {
                this.a = false;
                u.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.a = true;
        }
    }

    private void f() {
        this.a.Z0(this.f1776c);
        this.a.setOnFlingListener(null);
    }

    private void i() {
        if (this.a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.a.k(this.f1776c);
        this.a.setOnFlingListener(this);
    }

    private boolean j(RecyclerView.o oVar, int i2, int i3) {
        RecyclerView.z zVarD;
        int iH;
        if (!(oVar instanceof RecyclerView.z.b) || (zVarD = d(oVar)) == null || (iH = h(oVar, i2, i3)) == -1) {
            return false;
        }
        zVarD.p(iH);
        oVar.S1(zVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(int i2, int i3) {
        RecyclerView.o layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && j(layoutManager, i2, i3);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f1775b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.z d(RecyclerView.o oVar) {
        return e(oVar);
    }

    @Deprecated
    protected abstract l e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i2, int i3);

    void k() {
        RecyclerView.o layoutManager;
        View viewG;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        if (iArrC[0] == 0 && iArrC[1] == 0) {
            return;
        }
        this.a.m1(iArrC[0], iArrC[1]);
    }
}