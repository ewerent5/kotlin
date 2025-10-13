package com.parizene.netmonitor.ui.wifi;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.DbmBar;

/* loaded from: classes3.dex */
public class WifiItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private WifiItemViewHolder f14045b;

    public WifiItemViewHolder_ViewBinding(WifiItemViewHolder wifiItemViewHolder, View view) {
        this.f14045b = wifiItemViewHolder;
        wifiItemViewHolder.ssid = (TextView) butterknife.b.a.c(view, R.id.ssid, "field 'ssid'", TextView.class);
        wifiItemViewHolder.bssid = (TextView) butterknife.b.a.c(view, R.id.bssid, "field 'bssid'", TextView.class);
        wifiItemViewHolder.level = (DbmBar) butterknife.b.a.c(view, R.id.level, "field 'level'", DbmBar.class);
        wifiItemViewHolder.frequency = (TextView) butterknife.b.a.c(view, R.id.frequency, "field 'frequency'", TextView.class);
        wifiItemViewHolder.capabilities = (TextView) butterknife.b.a.c(view, R.id.capabilities, "field 'capabilities'", TextView.class);
    }
}