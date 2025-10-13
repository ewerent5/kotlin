package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class GsmCellInfoItemViewHolder_ViewBinding extends CellInfoItemViewHolder_ViewBinding {

    /* renamed from: c, reason: collision with root package name */
    private GsmCellInfoItemViewHolder f13795c;

    public GsmCellInfoItemViewHolder_ViewBinding(GsmCellInfoItemViewHolder gsmCellInfoItemViewHolder, View view) {
        super(gsmCellInfoItemViewHolder, view);
        this.f13795c = gsmCellInfoItemViewHolder;
        gsmCellInfoItemViewHolder.lacView = (LabelWithTextView) a.c(view, R.id.lac, "field 'lacView'", LabelWithTextView.class);
        gsmCellInfoItemViewHolder.cidView = (LabelWithTextView) a.c(view, R.id.cid, "field 'cidView'", LabelWithTextView.class);
        gsmCellInfoItemViewHolder.arfcnView = (LabelWithTextView) a.c(view, R.id.arfcn, "field 'arfcnView'", LabelWithTextView.class);
        gsmCellInfoItemViewHolder.bsicView = (LabelWithTextView) a.c(view, R.id.bsic, "field 'bsicView'", LabelWithTextView.class);
        gsmCellInfoItemViewHolder.taView = (LabelWithTextView) a.c(view, R.id.ta, "field 'taView'", LabelWithTextView.class);
    }
}