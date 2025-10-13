package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class NrCellInfoItemViewHolder_ViewBinding extends CellInfoItemViewHolder_ViewBinding {

    /* renamed from: c, reason: collision with root package name */
    private NrCellInfoItemViewHolder f13798c;

    public NrCellInfoItemViewHolder_ViewBinding(NrCellInfoItemViewHolder nrCellInfoItemViewHolder, View view) {
        super(nrCellInfoItemViewHolder, view);
        this.f13798c = nrCellInfoItemViewHolder;
        nrCellInfoItemViewHolder.tacView = (LabelWithTextView) a.c(view, R.id.tac, "field 'tacView'", LabelWithTextView.class);
        nrCellInfoItemViewHolder.nciView = (LabelWithTextView) a.c(view, R.id.nci, "field 'nciView'", LabelWithTextView.class);
        nrCellInfoItemViewHolder.pciView = (LabelWithTextView) a.c(view, R.id.pci, "field 'pciView'", LabelWithTextView.class);
        nrCellInfoItemViewHolder.nrArfcnView = (LabelWithTextView) a.c(view, R.id.nrArfcn, "field 'nrArfcnView'", LabelWithTextView.class);
    }
}