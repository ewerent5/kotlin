package com.androidplot.ui;

import android.content.Context;
import android.content.res.Resources;
import com.androidplot.Plot;
import e.d.a.a;
import e.d.a.b;

/* loaded from: classes.dex */
public abstract class Formatter<PlotType extends Plot> {
    private boolean isLegendIconEnabled = true;

    public Formatter() {
    }

    public void configure(Context context, int i2) throws Resources.NotFoundException {
        try {
            a.a(context, this, i2);
        } catch (b e2) {
            throw new RuntimeException(e2);
        }
    }

    protected abstract SeriesRenderer doGetRendererInstance(PlotType plottype);

    public abstract Class<? extends SeriesRenderer> getRendererClass();

    public <T extends SeriesRenderer> T getRendererInstance(PlotType plottype) {
        return (T) doGetRendererInstance(plottype);
    }

    public boolean isLegendIconEnabled() {
        return this.isLegendIconEnabled;
    }

    public void setLegendIconEnabled(boolean z) {
        this.isLegendIconEnabled = z;
    }

    public Formatter(Context context, int i2) throws Resources.NotFoundException {
        configure(context, i2);
    }
}