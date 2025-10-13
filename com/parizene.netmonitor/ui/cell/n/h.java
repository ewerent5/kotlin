package com.parizene.netmonitor.ui.cell.n;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.LabelWithTextView;
import com.parizene.netmonitor.ui.cell.holders.NrCellInfoItemViewHolder;

/* compiled from: NrCellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class h extends c<com.parizene.netmonitor.ui.cell.o.g, NrCellInfoItemViewHolder> {

    /* renamed from: b */
    private final com.parizene.netmonitor.m0.z.b f13817b;

    public h(com.parizene.netmonitor.ui.cell.k kVar, com.parizene.netmonitor.m0.z.b bVar) {
        super(kVar);
        this.f13817b = bVar;
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] d() {
        return n.a(o.Nr);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] e() {
        return n.b(o.Nr);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: g */
    public void a(com.parizene.netmonitor.ui.cell.o.g gVar, NrCellInfoItemViewHolder nrCellInfoItemViewHolder) {
        String str;
        super.c(gVar, nrCellInfoItemViewHolder);
        com.parizene.netmonitor.m0.b0.h hVarA = ((com.parizene.netmonitor.m0.b0.o) gVar.f13819b).a();
        if (hVarA.d()) {
            nrCellInfoItemViewHolder.tacView.setVisibility(0);
            nrCellInfoItemViewHolder.tacView.setText(Integer.toString(hVarA.f13289c));
        } else {
            nrCellInfoItemViewHolder.tacView.setVisibility(8);
        }
        if (hVarA.a()) {
            nrCellInfoItemViewHolder.nciView.setVisibility(0);
            nrCellInfoItemViewHolder.nciView.setText(Long.toString(hVarA.f13290d));
        } else {
            nrCellInfoItemViewHolder.nciView.setVisibility(8);
        }
        if (hVarA.c()) {
            nrCellInfoItemViewHolder.pciView.setVisibility(0);
            nrCellInfoItemViewHolder.pciView.setText(Integer.toString(hVarA.f13291e));
        } else {
            nrCellInfoItemViewHolder.pciView.setVisibility(8);
        }
        if (hVarA.b()) {
            nrCellInfoItemViewHolder.nrArfcnView.setVisibility(0);
            String strD = this.f13817b.d(hVarA.f13292f);
            LabelWithTextView labelWithTextView = nrCellInfoItemViewHolder.nrArfcnView;
            StringBuilder sb = new StringBuilder();
            sb.append(hVarA.f13292f);
            if (TextUtils.isEmpty(strD)) {
                str = "";
            } else {
                str = " (" + strD + ")";
            }
            sb.append(str);
            labelWithTextView.setText(sb.toString());
        } else {
            nrCellInfoItemViewHolder.nrArfcnView.setVisibility(8);
        }
        if (hVarA.d() && hVarA.a()) {
            nrCellInfoItemViewHolder.infoView.setVisibility(0);
        } else {
            nrCellInfoItemViewHolder.infoView.setVisibility(8);
        }
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: h */
    public NrCellInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new NrCellInfoItemViewHolder(layoutInflater.inflate(R.layout.item_nr_cell, viewGroup, false));
    }
}