package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class TdscdmaCellInfoItemViewHolder_ViewBinding extends CellInfoItemViewHolder_ViewBinding {

    /* renamed from: c, reason: collision with root package name */
    private TdscdmaCellInfoItemViewHolder f13800c;

    public TdscdmaCellInfoItemViewHolder_ViewBinding(TdscdmaCellInfoItemViewHolder tdscdmaCellInfoItemViewHolder, View view) {
        super(tdscdmaCellInfoItemViewHolder, view);
        this.f13800c = tdscdmaCellInfoItemViewHolder;
        tdscdmaCellInfoItemViewHolder.lacView = (LabelWithTextView) a.c(view, R.id.lac, "field 'lacView'", LabelWithTextView.class);
        tdscdmaCellInfoItemViewHolder.cidView = (LabelWithTextView) a.c(view, R.id.cid, "field 'cidView'", LabelWithTextView.class);
        tdscdmaCellInfoItemViewHolder.cpidView = (LabelWithTextView) a.c(view, R.id.cpid, "field 'cpidView'", LabelWithTextView.class);
        tdscdmaCellInfoItemViewHolder.uarfcnView = (LabelWithTextView) a.c(view, R.id.uarfcn, "field 'uarfcnView'", LabelWithTextView.class);
        tdscdmaCellInfoItemViewHolder.rscpView = (LabelWithTextView) a.c(view, R.id.rscp, "field 'rscpView'", LabelWithTextView.class);
    }
}