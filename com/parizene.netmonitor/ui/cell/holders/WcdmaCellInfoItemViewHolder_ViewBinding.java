package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class WcdmaCellInfoItemViewHolder_ViewBinding extends CellInfoItemViewHolder_ViewBinding {

    /* renamed from: c, reason: collision with root package name */
    private WcdmaCellInfoItemViewHolder f13801c;

    public WcdmaCellInfoItemViewHolder_ViewBinding(WcdmaCellInfoItemViewHolder wcdmaCellInfoItemViewHolder, View view) {
        super(wcdmaCellInfoItemViewHolder, view);
        this.f13801c = wcdmaCellInfoItemViewHolder;
        wcdmaCellInfoItemViewHolder.lacView = (LabelWithTextView) a.c(view, R.id.lac, "field 'lacView'", LabelWithTextView.class);
        wcdmaCellInfoItemViewHolder.cidView = (LabelWithTextView) a.c(view, R.id.cid, "field 'cidView'", LabelWithTextView.class);
        wcdmaCellInfoItemViewHolder.rncView = (LabelWithTextView) a.c(view, R.id.rnc, "field 'rncView'", LabelWithTextView.class);
        wcdmaCellInfoItemViewHolder.pscView = (LabelWithTextView) a.c(view, R.id.psc, "field 'pscView'", LabelWithTextView.class);
        wcdmaCellInfoItemViewHolder.uarfcnView = (LabelWithTextView) a.c(view, R.id.uarfcn, "field 'uarfcnView'", LabelWithTextView.class);
        wcdmaCellInfoItemViewHolder.ecNoView = (LabelWithTextView) a.c(view, R.id.ecNo, "field 'ecNoView'", LabelWithTextView.class);
    }
}