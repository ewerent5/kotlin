package com.parizene.netmonitor.ui.test;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.parizene.netmonitor.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TestAdapter.java */
/* loaded from: classes3.dex */
public class c extends RecyclerView.g<h> {

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f14035c;

    /* renamed from: d, reason: collision with root package name */
    private List<g> f14036d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private List<g> f14037e = new ArrayList();

    public c(Context context) {
        this.f14035c = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void q(h hVar, int i2) {
        hVar.N(i2 >= this.f14036d.size() ? this.f14037e.get(i2 - this.f14036d.size()) : this.f14036d.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public h s(ViewGroup viewGroup, int i2) {
        return new h(this.f14035c.inflate(R.layout.item_test, viewGroup, false));
    }

    public void D(com.parizene.netmonitor.m0.b0.a aVar, int i2, SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.m0.b0.b>> sparseArray) {
        List<g> list = com.parizene.netmonitor.m0.b0.a.OLD == aVar ? this.f14036d : this.f14037e;
        list.clear();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            list.add(new g(aVar, i2, sparseArray.keyAt(i3), sparseArray.valueAt(i3).f3105b));
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f14036d.size() + this.f14037e.size();
    }
}