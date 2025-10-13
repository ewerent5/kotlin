package com.parizene.netmonitor.ui.wifi;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.parizene.netmonitor.ui.DbmBar;

/* loaded from: classes3.dex */
class WifiItemViewHolder extends RecyclerView.d0 {

    @BindView
    TextView bssid;

    @BindView
    TextView capabilities;

    @BindView
    TextView frequency;

    @BindView
    DbmBar level;

    @BindView
    TextView ssid;

    WifiItemViewHolder(View view) throws NoSuchMethodException, SecurityException {
        super(view);
        ButterKnife.a(this, view);
    }
}