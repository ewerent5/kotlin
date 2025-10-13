package com.androidplot.ui;

import com.androidplot.Series;
import com.androidplot.ui.Formatter;

/* loaded from: classes.dex */
public class SeriesBundle<SeriesType extends Series, FormatterType extends Formatter> {
    private final FormatterType formatter;
    private final SeriesType series;

    public SeriesBundle(SeriesType seriestype, FormatterType formattertype) {
        this.series = seriestype;
        this.formatter = formattertype;
    }

    public FormatterType getFormatter() {
        return this.formatter;
    }

    public SeriesType getSeries() {
        return this.series;
    }

    public boolean rendersWith(SeriesRenderer seriesRenderer) {
        return getFormatter().getRendererClass() == seriesRenderer.getClass();
    }
}