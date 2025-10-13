package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.LabelWithTextView;

/* loaded from: classes3.dex */
public class CdmaCellInfoItemViewHolder_ViewBinding extends CellInfoItemViewHolder_ViewBinding {

    /* renamed from: c, reason: collision with root package name */
    private CdmaCellInfoItemViewHolder f13793c;

    public CdmaCellInfoItemViewHolder_ViewBinding(CdmaCellInfoItemViewHolder cdmaCellInfoItemViewHolder, View view) {
        super(cdmaCellInfoItemViewHolder, view);
        this.f13793c = cdmaCellInfoItemViewHolder;
        cdmaCellInfoItemViewHolder.sidView = (LabelWithTextView) a.c(view, R.id.sid, "field 'sidView'", LabelWithTextView.class);
        cdmaCellInfoItemViewHolder.bidView = (LabelWithTextView) a.c(view, R.id.bid, "field 'bidView'", LabelWithTextView.class);
        cdmaCellInfoItemViewHolder.nidView = (LabelWithTextView) a.c(view, R.id.nid, "field 'nidView'", LabelWithTextView.class);
        cdmaCellInfoItemViewHolder.latitudeView = (LabelWithTextView) a.c(view, R.id.latitude, "field 'latitudeView'", LabelWithTextView.class);
        cdmaCellInfoItemViewHolder.longitudeView = (LabelWithTextView) a.c(view, R.id.longitude, "field 'longitudeView'", LabelWithTextView.class);
    }
}