package com.parizene.netmonitor.ui.map;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;

/* loaded from: classes3.dex */
public class MapFragment_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private MapFragment f13937b;

    public MapFragment_ViewBinding(MapFragment mapFragment, View view) {
        this.f13937b = mapFragment;
        mapFragment.mLocationInfoContainer = (FrameLayout) butterknife.b.a.c(view, R.id.location_container, "field 'mLocationInfoContainer'", FrameLayout.class);
        mapFragment.mBannerStub = (ViewStub) butterknife.b.a.c(view, R.id.banner_stub, "field 'mBannerStub'", ViewStub.class);
        mapFragment.mMyLocationView = butterknife.b.a.b(view, R.id.my_location, "field 'mMyLocationView'");
        mapFragment.mCountView = (TextView) butterknife.b.a.c(view, R.id.count, "field 'mCountView'", TextView.class);
        mapFragment.mMapContainer = (ViewGroup) butterknife.b.a.c(view, R.id.map_container, "field 'mMapContainer'", ViewGroup.class);
    }
}