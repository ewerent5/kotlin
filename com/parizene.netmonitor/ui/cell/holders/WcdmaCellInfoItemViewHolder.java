package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.BindView;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class WcdmaCellInfoItemViewHolder extends CellInfoItemViewHolder {

    @BindView
    public LabelWithTextView cidView;

    @BindView
    public LabelWithTextView ecNoView;

    @BindView
    public LabelWithTextView lacView;

    @BindView
    public LabelWithTextView pscView;

    @BindView
    public LabelWithTextView rncView;

    @BindView
    public LabelWithTextView uarfcnView;

    public WcdmaCellInfoItemViewHolder(View view) {
        super(view);
    }
}