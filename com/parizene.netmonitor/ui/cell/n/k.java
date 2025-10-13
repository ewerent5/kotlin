package com.parizene.netmonitor.ui.cell.n;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.q;
import com.parizene.netmonitor.m0.b0.x;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.LabelWithTextView;
import com.parizene.netmonitor.ui.cell.holders.WcdmaCellInfoItemViewHolder;
import com.parizene.netmonitor.ui.p0;

/* compiled from: WcdmaCellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class k extends c<com.parizene.netmonitor.ui.cell.o.k, WcdmaCellInfoItemViewHolder> {

    /* renamed from: b */
    private com.parizene.netmonitor.m0.z.b f13818b;

    public k(com.parizene.netmonitor.ui.cell.k kVar, com.parizene.netmonitor.m0.z.b bVar) {
        super(kVar);
        this.f13818b = bVar;
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] d() {
        return n.a(o.Wcdma);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] e() {
        return n.b(o.Wcdma);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: g */
    public void a(com.parizene.netmonitor.ui.cell.o.k kVar, WcdmaCellInfoItemViewHolder wcdmaCellInfoItemViewHolder) {
        String str;
        super.c(kVar, wcdmaCellInfoItemViewHolder);
        com.parizene.netmonitor.m0.b0.j jVarA = ((q) kVar.f13819b).a();
        x xVarB = ((q) kVar.f13819b).b();
        if (jVarA.d()) {
            wcdmaCellInfoItemViewHolder.lacView.setVisibility(0);
            wcdmaCellInfoItemViewHolder.lacView.setText(Integer.toString(jVarA.f13299c));
        } else {
            wcdmaCellInfoItemViewHolder.lacView.setVisibility(8);
        }
        if (jVarA.c()) {
            wcdmaCellInfoItemViewHolder.cidView.setVisibility(0);
            wcdmaCellInfoItemViewHolder.cidView.setText(p0.e(jVarA.f13300d, jVarA.b(), this.a.a));
        } else {
            wcdmaCellInfoItemViewHolder.cidView.setVisibility(8);
        }
        if (jVarA.f()) {
            wcdmaCellInfoItemViewHolder.rncView.setVisibility(0);
            wcdmaCellInfoItemViewHolder.rncView.setText(Integer.toString(jVarA.a()));
        } else {
            wcdmaCellInfoItemViewHolder.rncView.setVisibility(8);
        }
        if (jVarA.e()) {
            wcdmaCellInfoItemViewHolder.pscView.setVisibility(0);
            wcdmaCellInfoItemViewHolder.pscView.setText(Integer.toString(jVarA.f13301e));
        } else {
            wcdmaCellInfoItemViewHolder.pscView.setVisibility(8);
        }
        if (jVarA.g()) {
            wcdmaCellInfoItemViewHolder.uarfcnView.setVisibility(0);
            String strE = this.f13818b.e(jVarA.f13302f);
            LabelWithTextView labelWithTextView = wcdmaCellInfoItemViewHolder.uarfcnView;
            StringBuilder sb = new StringBuilder();
            sb.append(jVarA.f13302f);
            if (TextUtils.isEmpty(strE)) {
                str = "";
            } else {
                str = " (" + strE + ")";
            }
            sb.append(str);
            labelWithTextView.setText(sb.toString());
        } else {
            wcdmaCellInfoItemViewHolder.uarfcnView.setVisibility(8);
        }
        if (jVarA.d() && jVarA.c()) {
            wcdmaCellInfoItemViewHolder.infoView.setVisibility(0);
        } else {
            wcdmaCellInfoItemViewHolder.infoView.setVisibility(8);
        }
        if (!xVarB.b()) {
            wcdmaCellInfoItemViewHolder.ecNoView.setVisibility(8);
        } else {
            wcdmaCellInfoItemViewHolder.ecNoView.setVisibility(0);
            wcdmaCellInfoItemViewHolder.ecNoView.setText(Integer.toString(xVarB.f13312b));
        }
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: h */
    public WcdmaCellInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new WcdmaCellInfoItemViewHolder(layoutInflater.inflate(R.layout.item_wcdma_cell, viewGroup, false));
    }
}