package com.parizene.netmonitor.ui;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes3.dex */
public class q0 extends RecyclerView.n {
    private static final int[] a = {R.attr.listDivider};

    /* renamed from: b, reason: collision with root package name */
    private Drawable f14017b;

    public q0(Context context, int i2) {
        this.f14017b = androidx.core.content.a.e(context, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void d(Rect rect, int i2, RecyclerView recyclerView) {
        rect.set(0, 0, 0, this.f14017b.getIntrinsicHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) childAt.getLayoutParams())).bottomMargin;
            this.f14017b.setBounds(paddingLeft, bottom, width, this.f14017b.getIntrinsicHeight() + bottom);
            this.f14017b.draw(canvas);
        }
    }
}