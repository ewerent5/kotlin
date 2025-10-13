package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.BindView;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class CdmaCellInfoItemViewHolder extends CellInfoItemViewHolder {

    @BindView
    public LabelWithTextView bidView;

    @BindView
    public LabelWithTextView latitudeView;

    @BindView
    public LabelWithTextView longitudeView;

    @BindView
    public LabelWithTextView nidView;

    @BindView
    public LabelWithTextView sidView;

    public CdmaCellInfoItemViewHolder(View view) {
        super(view);
    }
}