package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

/* loaded from: classes3.dex */
public class NetworkInfoItemViewHolder extends RecyclerView.d0 {

    @BindView
    public TextView cellBandwidths;

    @BindView
    public TextView labelCellBandwidths;

    @BindView
    public TextView mccView;

    @BindView
    public TextView mncView;

    @BindView
    public TextView networkOperatorNameView;

    @BindView
    public TextView networkRoamingView;

    @BindView
    public TextView networkTypeView;

    @BindView
    public TextView stateView;

    public NetworkInfoItemViewHolder(View view) throws NoSuchMethodException, SecurityException {
        super(view);
        ButterKnife.a(this, view);
    }
}