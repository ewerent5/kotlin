package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.BindView;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class TdscdmaCellInfoItemViewHolder extends CellInfoItemViewHolder {

    @BindView
    public LabelWithTextView cidView;

    @BindView
    public LabelWithTextView cpidView;

    @BindView
    public LabelWithTextView lacView;

    @BindView
    public LabelWithTextView rscpView;

    @BindView
    public LabelWithTextView uarfcnView;

    public TdscdmaCellInfoItemViewHolder(View view) {
        super(view);
    }
}