package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.ui.DbmBar;

/* loaded from: classes3.dex */
public abstract class CellInfoItemViewHolder extends RecyclerView.d0 {

    @BindView
    public DbmBar dbmBar;

    @BindView
    public TextView infoView;

    public CellInfoItemViewHolder(View view) throws NoSuchMethodException, SecurityException {
        super(view);
        ButterKnife.a(this, view);
    }
}