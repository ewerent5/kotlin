package com.parizene.netmonitor.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class EmptyRecyclerView extends RecyclerView {
    private View L0;
    private final RecyclerView.i M0;

    class a extends RecyclerView.i {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            EmptyRecyclerView.this.y1();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i2, int i3) {
            EmptyRecyclerView.this.y1();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i2, int i3) {
            EmptyRecyclerView.this.y1();
        }
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M0 = new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.g gVar) {
        RecyclerView.g adapter = getAdapter();
        if (adapter != null) {
            adapter.A(this.M0);
        }
        super.setAdapter(gVar);
        if (gVar != null) {
            gVar.y(this.M0);
        }
        y1();
    }

    public void setEmptyView(View view) {
        this.L0 = view;
        y1();
    }

    void y1() {
        if (this.L0 == null || getAdapter() == null) {
            return;
        }
        boolean z = getAdapter().e() == 0;
        this.L0.setVisibility(z ? 0 : 8);
        setVisibility(z ? 8 : 0);
    }
}