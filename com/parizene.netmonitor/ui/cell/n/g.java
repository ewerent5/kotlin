package com.parizene.netmonitor.ui.cell.n;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.m0.w;
import com.parizene.netmonitor.ui.b1;
import com.parizene.netmonitor.ui.cell.holders.NetworkInfoItemViewHolder;
import java.util.Arrays;

/* compiled from: NetworkInfoItemViewBinder.java */
/* loaded from: classes3.dex */
public class g implements b1<com.parizene.netmonitor.ui.cell.o.f, NetworkInfoItemViewHolder> {
    private Context a;

    public g(Context context) {
        this.a = context;
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(com.parizene.netmonitor.ui.cell.o.f fVar, NetworkInfoItemViewHolder networkInfoItemViewHolder) {
        if (fVar.b()) {
            networkInfoItemViewHolder.mccView.setText(fVar.a);
        } else {
            networkInfoItemViewHolder.mccView.setText("-");
        }
        if (fVar.c()) {
            networkInfoItemViewHolder.mncView.setText(fVar.f13821b);
        } else {
            networkInfoItemViewHolder.mncView.setText("-");
        }
        if (fVar.d()) {
            networkInfoItemViewHolder.networkOperatorNameView.setVisibility(0);
            networkInfoItemViewHolder.networkOperatorNameView.setText("(" + fVar.f13822c + ")");
        } else {
            networkInfoItemViewHolder.networkOperatorNameView.setVisibility(8);
        }
        networkInfoItemViewHolder.networkTypeView.setText(w.h(fVar.f13823d));
        if (fVar.f13824e) {
            networkInfoItemViewHolder.networkRoamingView.setVisibility(0);
            networkInfoItemViewHolder.networkRoamingView.setText("(" + this.a.getString(R.string.roaming) + ")");
        } else {
            networkInfoItemViewHolder.networkRoamingView.setVisibility(8);
        }
        networkInfoItemViewHolder.stateView.setText(w.j(fVar.f13825f));
        if (!fVar.a()) {
            networkInfoItemViewHolder.labelCellBandwidths.setVisibility(8);
            networkInfoItemViewHolder.cellBandwidths.setVisibility(8);
            return;
        }
        networkInfoItemViewHolder.labelCellBandwidths.setVisibility(0);
        networkInfoItemViewHolder.cellBandwidths.setVisibility(0);
        int length = fVar.f13826g.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = Math.round(fVar.f13826g[i2] / 1000.0f);
        }
        networkInfoItemViewHolder.cellBandwidths.setText(Arrays.toString(iArr));
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public NetworkInfoItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new NetworkInfoItemViewHolder(layoutInflater.inflate(R.layout.item_network_info, viewGroup, false));
    }
}