package com.parizene.netmonitor.ui.wifi;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.n;
import com.parizene.netmonitor.o;
import com.parizene.netmonitor.ui.b1;

/* compiled from: WifiItemViewBinder.java */
/* loaded from: classes3.dex */
public class f implements b1<e, WifiItemViewHolder> {
    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(e eVar, WifiItemViewHolder wifiItemViewHolder) {
        wifiItemViewHolder.ssid.setText(eVar.a);
        wifiItemViewHolder.bssid.setText(eVar.f14049b);
        wifiItemViewHolder.level.g(n.a(o.Wifi), eVar.f14052e, new int[0], false);
        wifiItemViewHolder.frequency.setText(eVar.f14050c);
        wifiItemViewHolder.capabilities.setText(eVar.f14051d);
    }

    @Override // com.parizene.netmonitor.ui.b1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public WifiItemViewHolder b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new WifiItemViewHolder(layoutInflater.inflate(R.layout.list_item_wifi, viewGroup, false));
    }
}