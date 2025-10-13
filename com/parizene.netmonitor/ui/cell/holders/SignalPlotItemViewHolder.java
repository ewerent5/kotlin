package com.parizene.netmonitor.ui.cell.holders;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import c.h.d.a;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.xy.BoundaryMode;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.StepMode;
import com.androidplot.xy.XYGraphWidget;
import com.androidplot.xy.XYPlot;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.h0;
import java.text.DecimalFormat;
import java.util.List;

/* loaded from: classes3.dex */
public class SignalPlotItemViewHolder extends RecyclerView.d0 {

    @BindView
    XYPlot mSignalPlot;
    private SimpleXYSeries x;

    public SignalPlotItemViewHolder(Context context, View view) throws NoSuchMethodException, SecurityException {
        super(view);
        ButterKnife.a(this, view);
        XYGraphWidget graph = this.mSignalPlot.getGraph();
        graph.getLineLabelStyle(XYGraphWidget.Edge.LEFT).setFormat(new DecimalFormat("0"));
        SizeMode sizeMode = SizeMode.FILL;
        graph.setSize(new Size(0.0f, sizeMode, 0.0f, sizeMode));
        this.mSignalPlot.getLayoutManager().remove(this.mSignalPlot.getLegend());
        this.x = new SimpleXYSeries("dBm");
        int iD = h0.d(context, R.attr.color_plot_line);
        this.mSignalPlot.addSeries((XYPlot) this.x, (SimpleXYSeries) new LineAndPointFormatter(Integer.valueOf(iD), null, Integer.valueOf(a.d(iD, 64)), null));
        this.mSignalPlot.setRangeStep(StepMode.SUBDIVIDE, 5.0d);
        this.mSignalPlot.setDomainBoundaries(0, 60, BoundaryMode.FIXED);
        this.mSignalPlot.setDomainStepMode(StepMode.INCREMENT_BY_VAL);
        this.mSignalPlot.setDomainStepValue(10.0d);
    }

    public void N(List<Integer> list, int i2, int i3) {
        this.x.setModel(list, SimpleXYSeries.ArrayFormat.XY_VALS_INTERLEAVED);
        this.mSignalPlot.setRangeBoundaries(Integer.valueOf(i2 - 4), Integer.valueOf(i3 + 4), BoundaryMode.FIXED);
        this.mSignalPlot.redraw();
    }
}