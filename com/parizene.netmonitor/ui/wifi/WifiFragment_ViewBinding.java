package com.parizene.netmonitor.ui.wifi;

import android.view.View;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.ui.EmptyRecyclerView;

/* loaded from: classes3.dex */
public class WifiFragment_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private WifiFragment f14044b;

    public WifiFragment_ViewBinding(WifiFragment wifiFragment, View view) {
        this.f14044b = wifiFragment;
        wifiFragment.mRecyclerView = (EmptyRecyclerView) butterknife.b.a.c(view, R.id.recycler_view, "field 'mRecyclerView'", EmptyRecyclerView.class);
    }
}