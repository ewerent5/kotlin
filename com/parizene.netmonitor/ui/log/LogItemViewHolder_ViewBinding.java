package com.parizene.netmonitor.ui.log;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.parizene.netmonitor.R;

/* loaded from: classes3.dex */
public class LogItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private LogItemViewHolder f13863b;

    public LogItemViewHolder_ViewBinding(LogItemViewHolder logItemViewHolder, View view) {
        this.f13863b = logItemViewHolder;
        logItemViewHolder.operatorView = (TextView) butterknife.b.a.c(view, R.id.operator, "field 'operatorView'", TextView.class);
        logItemViewHolder.lacNidView = (TextView) butterknife.b.a.c(view, R.id.lac, "field 'lacNidView'", TextView.class);
        logItemViewHolder.cidBidView = (TextView) butterknife.b.a.c(view, R.id.cid, "field 'cidBidView'", TextView.class);
        logItemViewHolder.rncView = (TextView) butterknife.b.a.c(view, R.id.rnc, "field 'rncView'", TextView.class);
        logItemViewHolder.pscView = (TextView) butterknife.b.a.c(view, R.id.psc, "field 'pscView'", TextView.class);
        logItemViewHolder.cellInfoView = (TextView) butterknife.b.a.c(view, R.id.info, "field 'cellInfoView'", TextView.class);
        logItemViewHolder.wasCurrentView = (ImageView) butterknife.b.a.c(view, R.id.was_current, "field 'wasCurrentView'", ImageView.class);
        logItemViewHolder.locationSrcView = (ImageView) butterknife.b.a.c(view, R.id.location_type, "field 'locationSrcView'", ImageView.class);
        logItemViewHolder.infoSrcView = (ImageView) butterknife.b.a.c(view, R.id.info_type, "field 'infoSrcView'", ImageView.class);
        logItemViewHolder.networkTypeAndChannelView = (TextView) butterknife.b.a.c(view, R.id.network_type_and_channel, "field 'networkTypeAndChannelView'", TextView.class);
        logItemViewHolder.lastMentionedView = (TextView) butterknife.b.a.c(view, R.id.last_mentioned, "field 'lastMentionedView'", TextView.class);
    }
}