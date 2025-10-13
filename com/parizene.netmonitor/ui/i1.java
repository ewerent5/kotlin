package com.parizene.netmonitor.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.d0;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: RecyclerAdapter.java */
/* loaded from: classes3.dex */
public abstract class i1<ITEM, VIEW_HOLDER extends RecyclerView.d0> extends androidx.recyclerview.widget.m<ITEM, VIEW_HOLDER> {

    /* renamed from: e, reason: collision with root package name */
    private LayoutInflater f13839e;

    /* renamed from: f, reason: collision with root package name */
    private List<Class> f13840f;

    /* renamed from: g, reason: collision with root package name */
    private Map<Class, b1> f13841g;

    public i1(LayoutInflater layoutInflater, h.d<ITEM> dVar) {
        super(dVar);
        this.f13839e = layoutInflater;
        this.f13840f = new ArrayList();
        this.f13841g = new HashMap();
    }

    protected void E(Class cls, b1 b1Var) {
        this.f13840f.add(cls);
        this.f13841g.put(cls, b1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int g(int i2) {
        return this.f13840f.indexOf(B(i2).getClass());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void q(VIEW_HOLDER view_holder, int i2) {
        ITEM itemB = B(i2);
        this.f13841g.get(itemB.getClass()).a(itemB, view_holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public VIEW_HOLDER s(ViewGroup viewGroup, int i2) {
        return (VIEW_HOLDER) this.f13841g.get(this.f13840f.get(i2)).b(this.f13839e, viewGroup);
    }
}