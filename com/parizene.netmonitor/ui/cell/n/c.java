package com.parizene.netmonitor.ui.cell.n;

import com.parizene.netmonitor.ui.b1;
import com.parizene.netmonitor.ui.cell.holders.CellInfoItemViewHolder;
import com.parizene.netmonitor.ui.cell.o.b;

/* compiled from: CellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public abstract class c<ITEM extends com.parizene.netmonitor.ui.cell.o.b, VIEW_HOLDER extends CellInfoItemViewHolder> implements b1<ITEM, VIEW_HOLDER> {
    protected com.parizene.netmonitor.ui.cell.k a;

    public c(com.parizene.netmonitor.ui.cell.k kVar) {
        this.a = kVar;
    }

    public void c(ITEM item, VIEW_HOLDER view_holder) {
        view_holder.dbmBar.g(d(), item.f13819b.f13304c.a, e(), this.a.f13812c);
        view_holder.infoView.setText(item.a());
    }

    public abstract int[] d();

    public abstract int[] e();

    public void f(com.parizene.netmonitor.ui.cell.k kVar) {
        this.a = kVar;
    }
}