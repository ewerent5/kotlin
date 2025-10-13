package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.b.a;
import com.parizene.netmonitor.R;

/* loaded from: classes3.dex */
public class NetworkInfoItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private NetworkInfoItemViewHolder f13797b;

    public NetworkInfoItemViewHolder_ViewBinding(NetworkInfoItemViewHolder networkInfoItemViewHolder, View view) {
        this.f13797b = networkInfoItemViewHolder;
        networkInfoItemViewHolder.mccView = (TextView) a.c(view, R.id.mcc, "field 'mccView'", TextView.class);
        networkInfoItemViewHolder.mncView = (TextView) a.c(view, R.id.mnc, "field 'mncView'", TextView.class);
        networkInfoItemViewHolder.networkOperatorNameView = (TextView) a.c(view, R.id.network_operator_name, "field 'networkOperatorNameView'", TextView.class);
        networkInfoItemViewHolder.networkTypeView = (TextView) a.c(view, R.id.network_type, "field 'networkTypeView'", TextView.class);
        networkInfoItemViewHolder.networkRoamingView = (TextView) a.c(view, R.id.network_roaming, "field 'networkRoamingView'", TextView.class);
        networkInfoItemViewHolder.stateView = (TextView) a.c(view, R.id.state, "field 'stateView'", TextView.class);
        networkInfoItemViewHolder.labelCellBandwidths = (TextView) a.c(view, R.id.labelCellBandwidths, "field 'labelCellBandwidths'", TextView.class);
        networkInfoItemViewHolder.cellBandwidths = (TextView) a.c(view, R.id.cellBandwidths, "field 'cellBandwidths'", TextView.class);
    }
}