package com.androidplot.pie;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.Size;
import com.androidplot.ui.widget.Widget;
import java.util.Iterator;

/* loaded from: classes.dex */
public class PieWidget extends Widget {
    private PieChart pieChart;
    private RenderStack<? extends Segment, ? extends SegmentFormatter> renderStack;

    public PieWidget(LayoutManager layoutManager, PieChart pieChart, Size size) {
        super(layoutManager, size);
        this.pieChart = pieChart;
        this.renderStack = new RenderStack<>(pieChart);
    }

    @Override // com.androidplot.ui.widget.Widget
    protected void doOnDraw(Canvas canvas, RectF rectF) {
        this.renderStack.sync();
        Iterator it = this.renderStack.getElements().iterator();
        while (it.hasNext()) {
            RenderStack.StackElement stackElement = (RenderStack.StackElement) it.next();
            if (stackElement.isEnabled()) {
                ((PieRenderer) this.pieChart.getRenderer(stackElement.get().getFormatter().getRendererClass())).render(canvas, rectF, stackElement.get(), this.renderStack);
            }
        }
    }
}