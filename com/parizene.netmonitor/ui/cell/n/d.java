package com.parizene.netmonitor.ui.cell.n;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.m;
import com.parizene.netmonitor.m0.b0.t;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.LabelWithTextView;
import com.parizene.netmonitor.ui.cell.holders.GsmCellInfoItemViewHolder;
import com.parizene.netmonitor.ui.p0;

/* compiled from: GsmCellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class d extends c<com.parizene.netmonitor.ui.cell.o.c, GsmCellInfoItemViewHolder> {

    /* renamed from: b */
    private com.parizene.netmonitor.m0.z.b f13815b;

    public d(com.parizene.netmonitor.ui.cell.k kVar, com.parizene.netmonitor.m0.z.b bVar) {
        super(kVar);
        this.f13815b = bVar;
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] d() {
        return n.a(o.Gsm);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] e() {
        return n.b(o.Gsm);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: g */
    public void a(com.parizene.netmonitor.ui.cell.o.c cVar, GsmCellInfoItemViewHolder gsmCellInfoItemViewHolder) {
        String str;
        super.c(cVar, gsmCellInfoItemViewHolder);
        com.parizene.netmonitor.m0.b0.f fVarA = ((m) cVar.f13819b).a();
        t tVarB = ((m) cVar.f13819b).b();
        if (fVarA.d()) {
            gsmCellInfoItemViewHolder.lacView.setVisibility(0);
            gsmCellInfoItemViewHolder.lacView.setText(Integer.toString(fVarA.f13278c));
        } else {
            gsmCellInfoItemViewHolder.lacView.setVisibility(8);
        }
        gsmCellInfoItemViewHolder.cidView.setText(p0.b(fVarA.f13279d, this.a.a));
        if (fVarA.a()) {
            gsmCellInfoItemViewHolder.arfcnView.setVisibility(0);
            String strA = this.f13815b.a(fVarA.f13280e, fVarA.a);
            LabelWithTextView labelWithTextView = gsmCellInfoItemViewHolder.arfcnView;
            StringBuilder sb = new StringBuilder();
            sb.append(fVarA.f13280e);
            if (TextUtils.isEmpty(strA)) {
                str = "";
            } else {
                str = " (" + strA + ")";
            }
            sb.append(str);
            labelWithTextView.setText(sb.toString());
        } else {
            gsmCellInfoItemViewHolder.arfcnView.setVisibility(8);
        }
        if (fVarA.b()) {
            gsmCellInfoItemViewHolder.bsicView.setVisibility(0);
            gsmCellInfoItemViewHolder.bsicView.setText(Integer.toString(fVarA.f13281f));
        } else {
            gsmCellInfoItemViewHolder.bsicView.setVisibility(8);
        }
        if (!tVarB.c()) {
            gsmCellInfoItemViewHolder.taView.setVisibility(8);
            return;
        }
        gsmCellInfoItemViewHolder.taView.setVisibility(0);
        gsmCellInfoItemViewHolder.taView.setText(tVarB.f13305b + " | " + tVarB.b() + " (m)");
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: h */
    public GsmCellInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new GsmCellInfoItemViewHolder(layoutInflater.inflate(R.layout.item_gsm_cell, viewGroup, false));
    }
}