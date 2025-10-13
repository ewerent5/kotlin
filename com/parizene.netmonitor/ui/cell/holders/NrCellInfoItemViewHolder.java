package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.BindView;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class NrCellInfoItemViewHolder extends CellInfoItemViewHolder {

    @BindView
    public LabelWithTextView nciView;

    @BindView
    public LabelWithTextView nrArfcnView;

    @BindView
    public LabelWithTextView pciView;

    @BindView
    public LabelWithTextView tacView;

    public NrCellInfoItemViewHolder(View view) {
        super(view);
    }
}