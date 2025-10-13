package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.BindView;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class LteCellInfoItemViewHolder extends CellInfoItemViewHolder {

    @BindView
    public LabelWithTextView bandwidthView;

    @BindView
    public LabelWithTextView ciView;

    @BindView
    public LabelWithTextView cqiView;

    @BindView
    public LabelWithTextView earfcnView;

    @BindView
    public LabelWithTextView pciView;

    @BindView
    public LabelWithTextView rsrqView;

    @BindView
    public LabelWithTextView rssnrView;

    @BindView
    public LabelWithTextView taView;

    @BindView
    public LabelWithTextView tacView;

    public LteCellInfoItemViewHolder(View view) {
        super(view);
    }
}