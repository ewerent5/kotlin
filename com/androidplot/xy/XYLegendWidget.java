package com.androidplot.xy;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.ui.Size;
import com.androidplot.ui.TableModel;
import com.androidplot.ui.widget.LegendWidget;
import com.androidplot.xy.XYLegendItem;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class XYLegendWidget extends LegendWidget<XYLegendItem> {
    private XYPlot plot;

    /* renamed from: com.androidplot.xy.XYLegendWidget$1 */
    class AnonymousClass1 implements Comparator<XYLegendItem>, j$.util.Comparator {
        AnonymousClass1() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public int compare(XYLegendItem xYLegendItem, XYLegendItem xYLegendItem2) {
            XYLegendItem.Type type = xYLegendItem.type;
            XYLegendItem.Type type2 = xYLegendItem2.type;
            return type == type2 ? xYLegendItem.getTitle().compareTo(xYLegendItem2.getTitle()) : type.compareTo(type2);
        }
    }

    /* renamed from: com.androidplot.xy.XYLegendWidget$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$XYLegendItem$Type;

        static {
            int[] iArr = new int[XYLegendItem.Type.values().length];
            $SwitchMap$com$androidplot$xy$XYLegendItem$Type = iArr;
            try {
                iArr[XYLegendItem.Type.REGION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYLegendItem$Type[XYLegendItem.Type.SERIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public XYLegendWidget(LayoutManager layoutManager, XYPlot xYPlot, Size size, TableModel tableModel, Size size2) {
        super(tableModel, layoutManager, size, size2);
        this.plot = xYPlot;
        setLegendItemComparator(new AnonymousClass1());
    }

    protected void drawRegionLegendIcon(Canvas canvas, RectF rectF, XYRegionFormatter xYRegionFormatter) {
        canvas.drawRect(rectF, xYRegionFormatter.getPaint());
    }

    @Override // com.androidplot.ui.widget.LegendWidget
    protected List<XYLegendItem> getLegendItems() {
        ArrayList arrayList = new ArrayList();
        for (SeriesBundle<XYSeries, XYSeriesFormatter> seriesBundle : this.plot.getRegistry().getLegendEnabledItems()) {
            arrayList.add(new XYLegendItem(XYLegendItem.Type.SERIES, seriesBundle.getFormatter(), ((XYSeries) seriesBundle.getSeries()).getTitle()));
        }
        Iterator<XYSeriesRenderer> it = this.plot.getRendererList().iterator();
        while (it.hasNext()) {
            for (Map.Entry<XYRegionFormatter, String> entry : it.next().getUniqueRegionFormatters().entrySet()) {
                arrayList.add(new XYLegendItem(XYLegendItem.Type.REGION, entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }

    @Override // com.androidplot.ui.widget.LegendWidget
    public void drawIcon(Canvas canvas, RectF rectF, XYLegendItem xYLegendItem) {
        int i2 = AnonymousClass2.$SwitchMap$com$androidplot$xy$XYLegendItem$Type[xYLegendItem.type.ordinal()];
        if (i2 == 1) {
            drawRegionLegendIcon(canvas, rectF, (XYRegionFormatter) xYLegendItem.item);
            return;
        }
        if (i2 == 2) {
            XYSeriesFormatter xYSeriesFormatter = (XYSeriesFormatter) xYLegendItem.item;
            ((XYSeriesRenderer) this.plot.getRenderer(xYSeriesFormatter.getRendererClass())).drawSeriesLegendIcon(canvas, rectF, xYSeriesFormatter);
        } else {
            throw new UnsupportedOperationException("Unexpected item type: " + xYLegendItem.type);
        }
    }
}