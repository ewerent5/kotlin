package com.parizene.netmonitor.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;

/* compiled from: ItemViewBinder.java */
/* loaded from: classes3.dex */
public interface b1<ITEM, VIEW_HOLDER extends RecyclerView.d0> {
    void a(ITEM item, VIEW_HOLDER view_holder);

    VIEW_HOLDER b(LayoutInflater layoutInflater, ViewGroup viewGroup);
}