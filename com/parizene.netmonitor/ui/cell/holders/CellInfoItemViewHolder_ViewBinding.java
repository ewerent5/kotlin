package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.b.a;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.DbmBar;

/* loaded from: classes3.dex */
public class CellInfoItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private CellInfoItemViewHolder f13794b;

    public CellInfoItemViewHolder_ViewBinding(CellInfoItemViewHolder cellInfoItemViewHolder, View view) {
        this.f13794b = cellInfoItemViewHolder;
        cellInfoItemViewHolder.dbmBar = (DbmBar) a.c(view, R.id.dbm, "field 'dbmBar'", DbmBar.class);
        cellInfoItemViewHolder.infoView = (TextView) a.c(view, R.id.info, "field 'infoView'", TextView.class);
    }
}