package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.Log;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.xy.XYSeriesFormatter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class GroupRenderer<FormatterType extends XYSeriesFormatter<XYRegionFormatter>> extends XYSeriesRenderer<XYSeries, FormatterType> {
    private static final String TAG = "com.androidplot.xy.GroupRenderer";

    public GroupRenderer(XYPlot xYPlot) {
        super(xYPlot);
    }

    public abstract void onRender(Canvas canvas, RectF rectF, List<SeriesBundle<XYSeries, ? extends FormatterType>> list, int i2, RenderStack renderStack);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.androidplot.ui.SeriesRenderer
    public void onRender(Canvas canvas, RectF rectF, XYSeries xYSeries, FormatterType formattertype, RenderStack renderStack) {
        List seriesAndFormatterList = getSeriesAndFormatterList();
        if (seriesAndFormatterList == null) {
            return;
        }
        int size = ((XYSeries) ((SeriesBundle) seriesAndFormatterList.get(0)).getSeries()).size();
        for (int i2 = 1; i2 < seriesAndFormatterList.size(); i2++) {
            if (((XYSeries) ((SeriesBundle) seriesAndFormatterList.get(i2)).getSeries()).size() != size) {
                Log.w(TAG, getClass() + ": not all associated series are of same size.");
                return;
            }
        }
        renderStack.disable(getClass());
        onRender(canvas, rectF, seriesAndFormatterList, size, renderStack);
    }
}