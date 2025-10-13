package com.parizene.netmonitor.ui.cell.holders;

import android.view.View;
import butterknife.Unbinder;
import butterknife.b.a;
import com.androidplot.xy.XYPlot;
import com.parizene.netmonitor.R;

/* loaded from: classes3.dex */
public class SignalPlotItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: b, reason: collision with root package name */
    private SignalPlotItemViewHolder f13799b;

    public SignalPlotItemViewHolder_ViewBinding(SignalPlotItemViewHolder signalPlotItemViewHolder, View view) {
        this.f13799b = signalPlotItemViewHolder;
        signalPlotItemViewHolder.mSignalPlot = (XYPlot) a.c(view, R.id.signal_plot, "field 'mSignalPlot'", XYPlot.class);
    }
}