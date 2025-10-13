package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes.dex */
class q extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    class a extends androidx.recyclerview.widget.l {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.l
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    q(Context context, int i2, boolean z) {
        super(context, i2, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void R1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i2);
        S1(aVar);
    }
}