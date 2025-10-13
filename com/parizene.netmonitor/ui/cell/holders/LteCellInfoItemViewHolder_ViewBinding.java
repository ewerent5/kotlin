package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class LteCellInfoItemViewHolder_ViewBinding extends CellInfoItemViewHolder_ViewBinding {

    /* renamed from: c, reason: collision with root package name */
    private LteCellInfoItemViewHolder f13796c;

    public LteCellInfoItemViewHolder_ViewBinding(LteCellInfoItemViewHolder lteCellInfoItemViewHolder, View view) {
        super(lteCellInfoItemViewHolder, view);
        this.f13796c = lteCellInfoItemViewHolder;
        lteCellInfoItemViewHolder.tacView = (LabelWithTextView) a.c(view, R.id.tac, "field 'tacView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.ciView = (LabelWithTextView) a.c(view, R.id.ci, "field 'ciView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.pciView = (LabelWithTextView) a.c(view, R.id.pci, "field 'pciView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.earfcnView = (LabelWithTextView) a.c(view, R.id.earfcn, "field 'earfcnView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.bandwidthView = (LabelWithTextView) a.c(view, R.id.bandwidth, "field 'bandwidthView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.rsrqView = (LabelWithTextView) a.c(view, R.id.rsrq, "field 'rsrqView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.rssnrView = (LabelWithTextView) a.c(view, R.id.rssnr, "field 'rssnrView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.cqiView = (LabelWithTextView) a.c(view, R.id.cqi, "field 'cqiView'", LabelWithTextView.class);
        lteCellInfoItemViewHolder.taView = (LabelWithTextView) a.c(view, R.id.ta, "field 'taView'", LabelWithTextView.class);
    }
}