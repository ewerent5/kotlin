package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class t extends RecyclerView.l {

    /* renamed from: g, reason: collision with root package name */
    boolean f1774g = true;

    public final void A(RecyclerView.d0 d0Var) {
        I(d0Var);
        h(d0Var);
    }

    public final void B(RecyclerView.d0 d0Var) {
        J(d0Var);
    }

    public final void C(RecyclerView.d0 d0Var, boolean z) {
        K(d0Var, z);
        h(d0Var);
    }

    public final void D(RecyclerView.d0 d0Var, boolean z) {
        L(d0Var, z);
    }

    public final void E(RecyclerView.d0 d0Var) {
        M(d0Var);
        h(d0Var);
    }

    public final void F(RecyclerView.d0 d0Var) {
        N(d0Var);
    }

    public final void G(RecyclerView.d0 d0Var) {
        O(d0Var);
        h(d0Var);
    }

    public final void H(RecyclerView.d0 d0Var) {
        P(d0Var);
    }

    public void I(RecyclerView.d0 d0Var) {
    }

    public void J(RecyclerView.d0 d0Var) {
    }

    public void K(RecyclerView.d0 d0Var, boolean z) {
    }

    public void L(RecyclerView.d0 d0Var, boolean z) {
    }

    public void M(RecyclerView.d0 d0Var) {
    }

    public void N(RecyclerView.d0 d0Var) {
    }

    public void O(RecyclerView.d0 d0Var) {
    }

    public void P(RecyclerView.d0 d0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        return (cVar == null || ((i2 = cVar.a) == (i3 = cVar2.a) && cVar.f1560b == cVar2.f1560b)) ? w(d0Var) : y(d0Var, i2, cVar.f1560b, i3, cVar2.f1560b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.f1560b;
        if (d0Var2.K()) {
            int i6 = cVar.a;
            i3 = cVar.f1560b;
            i2 = i6;
        } else {
            i2 = cVar2.a;
            i3 = cVar2.f1560b;
        }
        return x(d0Var, d0Var2, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.a;
        int i3 = cVar.f1560b;
        View view = d0Var.f1546f;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1560b;
        if (d0Var.w() || (i2 == left && i3 == top)) {
            return z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d0Var, i2, i3, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.a;
        int i3 = cVar2.a;
        if (i2 != i3 || cVar.f1560b != cVar2.f1560b) {
            return y(d0Var, i2, cVar.f1560b, i3, cVar2.f1560b);
        }
        E(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.d0 d0Var) {
        return !this.f1774g || d0Var.u();
    }

    public abstract boolean w(RecyclerView.d0 d0Var);

    public abstract boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5);

    public abstract boolean y(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5);

    public abstract boolean z(RecyclerView.d0 d0Var);
}