package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
class s {
    static int a(RecyclerView.a0 a0Var, p pVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.n0(view) - oVar.n0(view2)) + 1;
        }
        return Math.min(pVar.n(), pVar.d(view2) - pVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, p pVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (a0Var.b() - Math.max(oVar.n0(view), oVar.n0(view2))) - 1) : Math.max(0, Math.min(oVar.n0(view), oVar.n0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(pVar.d(view2) - pVar.g(view)) / (Math.abs(oVar.n0(view) - oVar.n0(view2)) + 1))) + (pVar.m() - pVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.a0 a0Var, p pVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.T() == 0 || a0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.b();
        }
        return (int) (((pVar.d(view2) - pVar.g(view)) / (Math.abs(oVar.n0(view) - oVar.n0(view2)) + 1)) * a0Var.b());
    }
}