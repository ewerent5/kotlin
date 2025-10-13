package com.parizene.netmonitor.ui.cell.n;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.p;
import com.parizene.netmonitor.m0.b0.w;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.cell.holders.TdscdmaCellInfoItemViewHolder;

/* compiled from: TdscdmaCellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class j extends c<com.parizene.netmonitor.ui.cell.o.j, TdscdmaCellInfoItemViewHolder> {
    public j(com.parizene.netmonitor.ui.cell.k kVar) {
        super(kVar);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] d() {
        return n.a(o.Tdscdma);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] e() {
        return n.b(o.Tdscdma);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: g */
    public void a(com.parizene.netmonitor.ui.cell.o.j jVar, TdscdmaCellInfoItemViewHolder tdscdmaCellInfoItemViewHolder) {
        super.c(jVar, tdscdmaCellInfoItemViewHolder);
        com.parizene.netmonitor.m0.b0.i iVarA = ((p) jVar.f13819b).a();
        w wVarB = ((p) jVar.f13819b).b();
        if (iVarA.c()) {
            tdscdmaCellInfoItemViewHolder.lacView.setVisibility(0);
            tdscdmaCellInfoItemViewHolder.lacView.setText(Integer.toString(iVarA.f13294c));
        } else {
            tdscdmaCellInfoItemViewHolder.lacView.setVisibility(8);
        }
        if (iVarA.a()) {
            tdscdmaCellInfoItemViewHolder.cidView.setVisibility(0);
            tdscdmaCellInfoItemViewHolder.cidView.setText(Integer.toString(iVarA.f13295d));
        } else {
            tdscdmaCellInfoItemViewHolder.cidView.setVisibility(8);
        }
        if (iVarA.b()) {
            tdscdmaCellInfoItemViewHolder.cpidView.setVisibility(0);
            tdscdmaCellInfoItemViewHolder.cpidView.setText(Integer.toString(iVarA.f13296e));
        } else {
            tdscdmaCellInfoItemViewHolder.cpidView.setVisibility(8);
        }
        if (iVarA.d()) {
            tdscdmaCellInfoItemViewHolder.uarfcnView.setVisibility(0);
            tdscdmaCellInfoItemViewHolder.uarfcnView.setText(Integer.toString(iVarA.f13297f));
        } else {
            tdscdmaCellInfoItemViewHolder.uarfcnView.setVisibility(8);
        }
        if (wVarB.b()) {
            tdscdmaCellInfoItemViewHolder.rscpView.setVisibility(0);
            tdscdmaCellInfoItemViewHolder.rscpView.setText(Integer.toString(wVarB.f13311b));
        } else {
            tdscdmaCellInfoItemViewHolder.rscpView.setVisibility(8);
        }
        if (iVarA.c() && iVarA.a()) {
            tdscdmaCellInfoItemViewHolder.infoView.setVisibility(0);
        } else {
            tdscdmaCellInfoItemViewHolder.infoView.setVisibility(8);
        }
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: h */
    public TdscdmaCellInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new TdscdmaCellInfoItemViewHolder(layoutInflater.inflate(R.layout.item_tdscdma_cell, viewGroup, false));
    }
}