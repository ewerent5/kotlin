package com.parizene.netmonitor.ui.cell;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CellDividerItemDecoration.java */
/* loaded from: classes3.dex */
public class f extends RecyclerView.n {
    private static final int[] a = {R.attr.listDivider};

    /* renamed from: b, reason: collision with root package name */
    private Drawable f13791b;

    public f(Context context, int i2) {
        this.f13791b = androidx.core.content.a.e(context, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        super.e(rect, view, recyclerView, a0Var);
        int iD0 = recyclerView.d0(view);
        if (iD0 == -1) {
            return;
        }
        if (((e) recyclerView.getAdapter()).F(iD0)) {
            rect.setEmpty();
        } else {
            rect.set(0, 0, 0, this.f13791b.getIntrinsicHeight());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int iD0 = recyclerView.d0(childAt);
            if (iD0 != -1 && !((e) recyclerView.getAdapter()).F(iD0)) {
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).bottomMargin;
                this.f13791b.setBounds(paddingLeft, bottom, width, this.f13791b.getIntrinsicHeight() + bottom);
                this.f13791b.draw(canvas);
            }
        }
    }
}