package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.BindView;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class GsmCellInfoItemViewHolder extends CellInfoItemViewHolder {

    @BindView
    public LabelWithTextView arfcnView;

    @BindView
    public LabelWithTextView bsicView;

    @BindView
    public LabelWithTextView cidView;

    @BindView
    public LabelWithTextView lacView;

    @BindView
    public LabelWithTextView taView;

    public GsmCellInfoItemViewHolder(View view) {
        super(view);
    }
}