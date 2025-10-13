package com.parizene.netmonitor.ui.map;

import android.location.Location;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.ads.RequestConfiguration;
import com.parizene.netmonitor.R;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class LocationViewBinder {
    private Calendar a = Calendar.getInstance();

    public static class ViewHolder {

        @BindView
        TextView accuracyView;

        @BindView
        TextView altitudeView;

        @BindView
        TextView bearingView;

        @BindView
        TextView latitudeView;

        @BindView
        TextView longitudeView;

        @BindView
        TextView providerView;

        @BindView
        TextView speedView;

        @BindView
        TextView timeView;

        public ViewHolder(View view) throws NoSuchMethodException, SecurityException {
            ButterKnife.a(this, view);
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* renamed from: b, reason: collision with root package name */
        private ViewHolder f13936b;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f13936b = viewHolder;
            viewHolder.latitudeView = (TextView) butterknife.b.a.c(view, R.id.lat, "field 'latitudeView'", TextView.class);
            viewHolder.longitudeView = (TextView) butterknife.b.a.c(view, R.id.lon, "field 'longitudeView'", TextView.class);
            viewHolder.accuracyView = (TextView) butterknife.b.a.c(view, R.id.accuracy, "field 'accuracyView'", TextView.class);
            viewHolder.altitudeView = (TextView) butterknife.b.a.c(view, R.id.altitude, "field 'altitudeView'", TextView.class);
            viewHolder.bearingView = (TextView) butterknife.b.a.c(view, R.id.bearing, "field 'bearingView'", TextView.class);
            viewHolder.speedView = (TextView) butterknife.b.a.c(view, R.id.speed, "field 'speedView'", TextView.class);
            viewHolder.providerView = (TextView) butterknife.b.a.c(view, R.id.provider, "field 'providerView'", TextView.class);
            viewHolder.timeView = (TextView) butterknife.b.a.c(view, R.id.time, "field 'timeView'", TextView.class);
        }
    }

    public void a(ViewHolder viewHolder, Location location) {
        viewHolder.latitudeView.setText(String.format("%.4f°", Double.valueOf(location.getLatitude())));
        viewHolder.longitudeView.setText(String.format("%.4f°", Double.valueOf(location.getLongitude())));
        if (location.hasAccuracy()) {
            viewHolder.accuracyView.setText(String.format("%d (m)", Integer.valueOf((int) location.getAccuracy())));
        } else {
            viewHolder.accuracyView.setText("-");
        }
        if (location.hasAltitude()) {
            viewHolder.altitudeView.setText(String.format("%d (m)", Integer.valueOf((int) location.getAltitude())));
        } else {
            viewHolder.altitudeView.setText("-");
        }
        if (location.hasBearing()) {
            viewHolder.bearingView.setText(String.format("%.1f°", Float.valueOf(location.getBearing())));
        } else {
            viewHolder.bearingView.setText("-");
        }
        if (location.hasSpeed()) {
            viewHolder.speedView.setText(String.format("%.2f (km/h)", Float.valueOf(location.getSpeed() * 3.6f)));
        } else {
            viewHolder.speedView.setText("-");
        }
        if ("gps".equals(location.getProvider())) {
            viewHolder.providerView.setText(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        } else if ("network".equals(location.getProvider())) {
            viewHolder.providerView.setText("N");
        } else {
            viewHolder.providerView.setText("-");
        }
        this.a.setTimeInMillis(location.getTime());
        viewHolder.timeView.setText(this.a.getTime().toLocaleString());
    }
}