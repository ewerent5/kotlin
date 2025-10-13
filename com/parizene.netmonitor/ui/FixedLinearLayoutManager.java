package com.parizene.netmonitor.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class FixedLinearLayoutManager extends LinearLayoutManager {
    public FixedLinearLayoutManager(Context context, int i2, boolean z) {
        super(context, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        try {
            super.e1(vVar, a0Var);
        } catch (Exception e2) {
            m.a.a.g(e2);
        }
    }

    public FixedLinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}