package com.parizene.netmonitor.ui.cell.n;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.b0.u;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.LabelWithTextView;
import com.parizene.netmonitor.ui.cell.holders.LteCellInfoItemViewHolder;
import com.parizene.netmonitor.ui.p0;

/* compiled from: LteCellInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class f extends c<com.parizene.netmonitor.ui.cell.o.e, LteCellInfoItemViewHolder> {

    /* renamed from: b */
    private com.parizene.netmonitor.m0.z.b f13816b;

    public f(com.parizene.netmonitor.ui.cell.k kVar, com.parizene.netmonitor.m0.z.b bVar) {
        super(kVar);
        this.f13816b = bVar;
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] d() {
        return n.a(o.Lte);
    }

    @Override // com.parizene.netmonitor.ui.cell.n.c
    public int[] e() {
        return n.b(o.Lte);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: g */
    public void a(com.parizene.netmonitor.ui.cell.o.e eVar, LteCellInfoItemViewHolder lteCellInfoItemViewHolder) {
        String str;
        super.c(eVar, lteCellInfoItemViewHolder);
        com.parizene.netmonitor.m0.b0.g gVarA = ((com.parizene.netmonitor.m0.b0.n) eVar.f13819b).a();
        u uVarB = ((com.parizene.netmonitor.m0.b0.n) eVar.f13819b).b();
        if (gVarA.g()) {
            lteCellInfoItemViewHolder.tacView.setVisibility(0);
            lteCellInfoItemViewHolder.tacView.setText(Integer.toString(gVarA.f13283c));
        } else {
            lteCellInfoItemViewHolder.tacView.setVisibility(8);
        }
        if (gVarA.d()) {
            lteCellInfoItemViewHolder.ciView.setVisibility(0);
            LabelWithTextView labelWithTextView = lteCellInfoItemViewHolder.ciView;
            int i2 = gVarA.f13284d;
            int iA = gVarA.a();
            int iB = gVarA.b();
            com.parizene.netmonitor.ui.cell.k kVar = this.a;
            labelWithTextView.setText(p0.c(i2, iA, iB, kVar.a, kVar.f13811b));
        } else {
            lteCellInfoItemViewHolder.ciView.setVisibility(8);
        }
        if (gVarA.f()) {
            lteCellInfoItemViewHolder.pciView.setVisibility(0);
            lteCellInfoItemViewHolder.pciView.setText(Integer.toString(gVarA.f13285e));
        } else {
            lteCellInfoItemViewHolder.pciView.setVisibility(8);
        }
        if (gVarA.e()) {
            lteCellInfoItemViewHolder.earfcnView.setVisibility(0);
            String strB = this.f13816b.b(gVarA.f13286f);
            LabelWithTextView labelWithTextView2 = lteCellInfoItemViewHolder.earfcnView;
            StringBuilder sb = new StringBuilder();
            sb.append(gVarA.f13286f);
            if (TextUtils.isEmpty(strB)) {
                str = "";
            } else {
                str = " (" + strB + ")";
            }
            sb.append(str);
            labelWithTextView2.setText(sb.toString());
        } else {
            lteCellInfoItemViewHolder.earfcnView.setVisibility(8);
        }
        if (gVarA.c()) {
            lteCellInfoItemViewHolder.infoView.setVisibility(0);
        } else {
            lteCellInfoItemViewHolder.infoView.setVisibility(8);
        }
        if (uVarB.c()) {
            lteCellInfoItemViewHolder.rsrqView.setVisibility(0);
            lteCellInfoItemViewHolder.rsrqView.setText(Integer.toString(uVarB.f13307c));
        } else {
            lteCellInfoItemViewHolder.rsrqView.setVisibility(8);
        }
        if (uVarB.d()) {
            lteCellInfoItemViewHolder.rssnrView.setVisibility(0);
            lteCellInfoItemViewHolder.rssnrView.setText(Integer.toString(uVarB.f13308d));
        } else {
            lteCellInfoItemViewHolder.rssnrView.setVisibility(8);
        }
        if (uVarB.b()) {
            lteCellInfoItemViewHolder.cqiView.setVisibility(0);
            lteCellInfoItemViewHolder.cqiView.setText(Integer.toString(uVarB.f13309e));
        } else {
            lteCellInfoItemViewHolder.cqiView.setVisibility(8);
        }
        if (uVarB.e()) {
            lteCellInfoItemViewHolder.taView.setVisibility(0);
            lteCellInfoItemViewHolder.taView.setText(uVarB.f13310f + " | " + this.a.a(uVarB.f13310f) + " (m)");
        } else {
            lteCellInfoItemViewHolder.taView.setVisibility(8);
        }
        if (gVarA.g() && gVarA.d()) {
            lteCellInfoItemViewHolder.infoView.setVisibility(0);
        } else {
            lteCellInfoItemViewHolder.infoView.setVisibility(8);
        }
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: h */
    public LteCellInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new LteCellInfoItemViewHolder(layoutInflater.inflate(R.layout.item_lte_cell, viewGroup, false));
    }
}