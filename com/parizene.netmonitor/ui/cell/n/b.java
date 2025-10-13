package com.parizene.netmonitor.ui.cell.n;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.l;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.cell.holders.CdmaCellInfoItemViewHolder;

/* compiled from: CdmaCellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class b extends c<com.parizene.netmonitor.ui.cell.o.a, CdmaCellInfoItemViewHolder> {
    public b(com.parizene.netmonitor.ui.cell.k kVar) {
        super(kVar);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] d() {
        return n.a(o.Cdma);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] e() {
        return n.b(o.Cdma);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: g */
    public void a(com.parizene.netmonitor.ui.cell.o.a aVar, CdmaCellInfoItemViewHolder cdmaCellInfoItemViewHolder) {
        super.c(aVar, cdmaCellInfoItemViewHolder);
        com.parizene.netmonitor.m0.b0.e eVarA = ((l) aVar.f13819b).a();
        cdmaCellInfoItemViewHolder.sidView.setText(Integer.toString(eVarA.f13272b));
        cdmaCellInfoItemViewHolder.nidView.setText(Integer.toString(eVarA.f13273c));
        cdmaCellInfoItemViewHolder.bidView.setText(Integer.toString(eVarA.f13274d));
        if (!eVarA.d()) {
            cdmaCellInfoItemViewHolder.latitudeView.setVisibility(8);
            cdmaCellInfoItemViewHolder.longitudeView.setVisibility(8);
        } else {
            cdmaCellInfoItemViewHolder.latitudeView.setVisibility(0);
            cdmaCellInfoItemViewHolder.latitudeView.setText(String.format("%.4f°", Double.valueOf(eVarA.a())));
            cdmaCellInfoItemViewHolder.longitudeView.setVisibility(0);
            cdmaCellInfoItemViewHolder.longitudeView.setText(String.format("%.4f°", Double.valueOf(eVarA.b())));
        }
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: h */
    public CdmaCellInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new CdmaCellInfoItemViewHolder(layoutInflater.inflate(R.layout.item_cdma_cell, viewGroup, false));
    }
}