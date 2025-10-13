package com.androidplot.xy;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.androidplot.R;
import com.androidplot.ui.Insets;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.RenderStack;
import com.androidplot.ui.Size;
import com.androidplot.ui.widget.Widget;
import com.androidplot.util.AttrUtils;
import com.androidplot.util.FontUtils;
import com.androidplot.util.PixelUtils;
import com.androidplot.util.RectFUtils;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class XYGraphWidget extends Widget {
    private static final float DEFAULT_LINE_LABEL_TEXT_SIZE_PX = PixelUtils.spToPix(15.0f);
    private static final float FUDGE = 1.0E-5f;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int ZERO = 0;
    private CursorLabelFormatter cursorLabelFormatter;
    private Paint domainCursorPaint;
    private Float domainCursorPosition;
    private Paint domainGridLinePaint;
    private Paint domainOriginLinePaint;
    private Paint domainSubGridLinePaint;
    private boolean drawGridOnTop;
    private boolean drawMarkersEnabled;
    private Paint gridBackgroundPaint;
    private Insets gridInsets;
    private RectF gridRect;
    private boolean isGridClippingEnabled;
    private RectF labelRect;
    private float lineExtensionBottom;
    private float lineExtensionLeft;
    private float lineExtensionRight;
    private float lineExtensionTop;
    private EnumSet<Edge> lineLabelEdges;
    private Insets lineLabelInsets;
    private Map<Edge, LineLabelRenderer> lineLabelRenderers;
    private Map<Edge, LineLabelStyle> lineLabelStyles;
    private int linesPerDomainLabel;
    private int linesPerRangeLabel;
    private XYPlot plot;
    private Paint rangeCursorPaint;
    private Float rangeCursorPosition;
    private Paint rangeGridLinePaint;
    private Paint rangeOriginLinePaint;
    private Paint rangeSubGridLinePaint;
    private RenderStack<? extends XYSeries, ? extends XYSeriesFormatter> renderStack;

    public interface CursorLabelFormatter {
        Paint getBackgroundPaint();

        String getLabelText(Number number, Number number2);

        Paint getTextPaint();
    }

    public enum Edge {
        NONE(0),
        LEFT(1),
        RIGHT(2),
        TOP(4),
        BOTTOM(8);

        private final int value;

        Edge(int i2) {
            this.value = i2;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class LineLabelStyle {
        private Paint paint = new Paint();
        private float rotation = 0.0f;
        private Format format = new DecimalFormat("0.0");

        public LineLabelStyle() {
            this.paint.setColor(-3355444);
            this.paint.setAntiAlias(true);
            this.paint.setTextAlign(Paint.Align.CENTER);
            this.paint.setTextSize(XYGraphWidget.DEFAULT_LINE_LABEL_TEXT_SIZE_PX);
        }

        public Format getFormat() {
            return this.format;
        }

        public Paint getPaint() {
            return this.paint;
        }

        public float getRotation() {
            return this.rotation;
        }

        public void setFormat(Format format) {
            this.format = format;
        }

        public void setPaint(Paint paint) {
            this.paint = paint;
        }

        public void setRotation(float f2) {
            this.rotation = f2;
        }
    }

    public XYGraphWidget(LayoutManager layoutManager, XYPlot xYPlot, Size size) {
        super(layoutManager, size);
        this.linesPerRangeLabel = 1;
        this.linesPerDomainLabel = 1;
        this.gridInsets = new Insets();
        this.lineLabelInsets = new Insets();
        this.isGridClippingEnabled = true;
        this.drawMarkersEnabled = true;
        this.lineLabelEdges = EnumSet.noneOf(Edge.class);
        this.lineLabelStyles = getDefaultLineLabelStyles();
        this.lineLabelRenderers = getDefaultLineLabelRenderers();
        Paint paint = new Paint();
        this.gridBackgroundPaint = paint;
        paint.setColor(Color.rgb(140, 140, 140));
        this.gridBackgroundPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        paint2.setColor(Color.rgb(180, 180, 180));
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.rangeGridLinePaint = new Paint(paint2);
        this.domainGridLinePaint = new Paint(paint2);
        this.domainSubGridLinePaint = new Paint(paint2);
        this.rangeSubGridLinePaint = new Paint(paint2);
        this.domainOriginLinePaint = new Paint(paint2);
        this.rangeOriginLinePaint = new Paint(paint2);
        Paint paint3 = new Paint();
        this.domainCursorPaint = paint3;
        paint3.setColor(-256);
        Paint paint4 = new Paint();
        this.rangeCursorPaint = paint4;
        paint4.setColor(-256);
        setMarginTop(7.0f);
        setMarginRight(4.0f);
        setMarginBottom(4.0f);
        setClippingEnabled(true);
        this.plot = xYPlot;
        this.renderStack = new RenderStack<>(xYPlot);
    }

    public boolean containsPoint(float f2, float f3) {
        RectF rectF = this.gridRect;
        if (rectF != null) {
            return rectF.contains(f2, f3);
        }
        return false;
    }

    @Override // com.androidplot.ui.widget.Widget
    protected void doOnDraw(Canvas canvas, RectF rectF) {
        if (this.gridRect.height() <= 0.0f || this.gridRect.width() <= 0.0f) {
            return;
        }
        RectRegion bounds = this.plot.getBounds();
        if (bounds.getMinX() == null || bounds.getMaxX() == null || bounds.getMinY() == null || bounds.getMaxY() == null) {
            return;
        }
        if (this.drawGridOnTop) {
            drawData(canvas);
            drawGrid(canvas);
        } else {
            drawGrid(canvas);
            drawData(canvas);
        }
        drawCursors(canvas);
        if (isDrawMarkersEnabled()) {
            drawMarkers(canvas);
        }
    }

    protected void drawCursorLabel(Canvas canvas) {
        String labelText = getCursorLabelFormatter().getLabelText(getDomainCursorVal(), getRangeCursorVal());
        RectF rectF = new RectF(FontUtils.getPackedStringDimensions(labelText, getCursorLabelFormatter().getTextPaint()));
        rectF.offsetTo(this.domainCursorPosition.floatValue(), this.rangeCursorPosition.floatValue() - rectF.height());
        if (rectF.right >= this.gridRect.right) {
            rectF.offsetTo(this.domainCursorPosition.floatValue() - rectF.width(), rectF.top);
        }
        if (rectF.top <= this.gridRect.top) {
            rectF.offsetTo(rectF.left, this.rangeCursorPosition.floatValue());
        }
        if (getCursorLabelFormatter().getBackgroundPaint() != null) {
            canvas.drawRect(rectF, getCursorLabelFormatter().getBackgroundPaint());
        }
        canvas.drawText(labelText, rectF.left, rectF.bottom, getCursorLabelFormatter().getTextPaint());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void drawCursors(android.graphics.Canvas r12) {
        /*
            r11 = this;
            android.graphics.Paint r0 = r11.domainCursorPaint
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L40
            java.lang.Float r0 = r11.domainCursorPosition
            if (r0 == 0) goto L40
            float r0 = r0.floatValue()
            android.graphics.RectF r3 = r11.gridRect
            float r3 = r3.right
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L40
            java.lang.Float r0 = r11.domainCursorPosition
            float r0 = r0.floatValue()
            android.graphics.RectF r3 = r11.gridRect
            float r3 = r3.left
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L40
            java.lang.Float r0 = r11.domainCursorPosition
            float r4 = r0.floatValue()
            android.graphics.RectF r0 = r11.gridRect
            float r5 = r0.top
            java.lang.Float r0 = r11.domainCursorPosition
            float r6 = r0.floatValue()
            android.graphics.RectF r0 = r11.gridRect
            float r7 = r0.bottom
            android.graphics.Paint r8 = r11.domainCursorPaint
            r3 = r12
            r3.drawLine(r4, r5, r6, r7, r8)
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            android.graphics.Paint r3 = r11.rangeCursorPaint
            if (r3 == 0) goto L7c
            java.lang.Float r3 = r11.rangeCursorPosition
            if (r3 == 0) goto L7c
            float r3 = r3.floatValue()
            android.graphics.RectF r4 = r11.gridRect
            float r4 = r4.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L7c
            java.lang.Float r3 = r11.rangeCursorPosition
            float r3 = r3.floatValue()
            android.graphics.RectF r4 = r11.gridRect
            float r5 = r4.bottom
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L7c
            float r6 = r4.left
            java.lang.Float r2 = r11.rangeCursorPosition
            float r7 = r2.floatValue()
            android.graphics.RectF r2 = r11.gridRect
            float r8 = r2.right
            java.lang.Float r2 = r11.rangeCursorPosition
            float r9 = r2.floatValue()
            android.graphics.Paint r10 = r11.rangeCursorPaint
            r5 = r12
            r5.drawLine(r6, r7, r8, r9, r10)
            goto L7d
        L7c:
            r1 = 0
        L7d:
            com.androidplot.xy.XYGraphWidget$CursorLabelFormatter r2 = r11.getCursorLabelFormatter()
            if (r2 == 0) goto L8a
            if (r1 == 0) goto L8a
            if (r0 == 0) goto L8a
            r11.drawCursorLabel(r12)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.xy.XYGraphWidget.drawCursors(android.graphics.Canvas):void");
    }

    protected void drawData(Canvas canvas) {
        if (this.drawGridOnTop) {
            drawGridBackground(canvas);
        }
        try {
            if (this.isGridClippingEnabled) {
                canvas.save();
                canvas.clipRect(this.gridRect, Region.Op.INTERSECT);
            }
            this.renderStack.sync();
            Iterator it = this.renderStack.getElements().iterator();
            while (it.hasNext()) {
                RenderStack.StackElement stackElement = (RenderStack.StackElement) it.next();
                if (stackElement.isEnabled()) {
                    ((XYSeriesRenderer) this.plot.getRenderer(stackElement.get().getFormatter().getRendererClass())).render(canvas, this.gridRect, stackElement.get(), this.renderStack);
                }
            }
        } finally {
            if (this.isGridClippingEnabled) {
                canvas.restore();
            }
        }
    }

    protected void drawDomainLine(Canvas canvas, float f2, Number number, Paint paint, boolean z) {
        if (paint != null) {
            RectF rectF = this.gridRect;
            canvas.drawLine(f2, rectF.top - this.lineExtensionTop, f2, rectF.bottom + this.lineExtensionBottom, paint);
        }
        drawLineLabel(canvas, Edge.TOP, number, f2, this.labelRect.top, z);
        drawLineLabel(canvas, Edge.BOTTOM, number, f2, this.labelRect.bottom, z);
    }

    protected void drawGrid(Canvas canvas) {
        double dTransform;
        double dTransform2;
        if (!this.drawGridOnTop) {
            drawGridBackground(canvas);
        }
        Number domainOrigin = this.plot.getDomainOrigin();
        if (domainOrigin != null) {
            com.androidplot.Region region = this.plot.getBounds().getxRegion();
            double dDoubleValue = this.plot.getDomainOrigin().doubleValue();
            RectF rectF = this.gridRect;
            dTransform = region.transform(dDoubleValue, rectF.left, rectF.right, false);
        } else {
            dTransform = this.gridRect.left;
            domainOrigin = this.plot.getBounds().getMinX();
        }
        Number number = domainOrigin;
        double d2 = dTransform;
        Step step = XYStepCalculator.getStep(this.plot, Axis.DOMAIN, this.gridRect);
        double stepPix = step.getStepPix();
        RectF rectF2 = this.gridRect;
        double d3 = ((rectF2.right - d2) + 9.999999747378752E-6d) / stepPix;
        int iCeil = (int) Math.ceil(((rectF2.left - d2) - 9.999999747378752E-6d) / stepPix);
        while (true) {
            double d4 = iCeil;
            if (d4 > d3) {
                break;
            }
            double dDoubleValue2 = number.doubleValue() + (step.getStepVal() * d4);
            double d5 = (d4 * stepPix) + d2;
            boolean z = iCeil % getLinesPerDomainLabel() == 0;
            boolean z2 = iCeil == 0;
            drawDomainLine(canvas, (float) d5, Double.valueOf(dDoubleValue2), z2 ? this.domainOriginLinePaint : z ? this.domainGridLinePaint : this.domainSubGridLinePaint, z2);
            iCeil++;
        }
        Number rangeOrigin = this.plot.getRangeOrigin();
        if (rangeOrigin != null) {
            com.androidplot.Region region2 = this.plot.getBounds().getyRegion();
            double dDoubleValue3 = rangeOrigin.doubleValue();
            RectF rectF3 = this.gridRect;
            dTransform2 = region2.transform(dDoubleValue3, rectF3.top, rectF3.bottom, true);
        } else {
            dTransform2 = this.gridRect.bottom;
            rangeOrigin = this.plot.getBounds().getMinY();
        }
        Number number2 = rangeOrigin;
        double d6 = dTransform2;
        Step step2 = XYStepCalculator.getStep(this.plot, Axis.RANGE, this.gridRect);
        double stepPix2 = step2.getStepPix();
        RectF rectF4 = this.gridRect;
        double d7 = ((rectF4.bottom - d6) + 9.999999747378752E-6d) / stepPix2;
        int iCeil2 = (int) Math.ceil(((rectF4.top - d6) - 9.999999747378752E-6d) / stepPix2);
        while (true) {
            double d8 = iCeil2;
            if (d8 > d7) {
                return;
            }
            double dDoubleValue4 = number2.doubleValue() - (step2.getStepVal() * d8);
            double d9 = (d8 * stepPix2) + d6;
            boolean z3 = iCeil2 % getLinesPerRangeLabel() == 0;
            boolean z4 = iCeil2 == 0;
            drawRangeLine(canvas, (float) d9, Double.valueOf(dDoubleValue4), z4 ? this.rangeOriginLinePaint : z3 ? this.rangeGridLinePaint : this.rangeSubGridLinePaint, z4);
            iCeil2++;
        }
    }

    protected void drawGridBackground(Canvas canvas) {
        Paint paint = this.gridBackgroundPaint;
        if (paint != null) {
            canvas.drawRect(this.gridRect, paint);
        }
    }

    protected void drawLineLabel(Canvas canvas, Edge edge, Number number, float f2, float f3, boolean z) {
        if (isLineLabelEnabled(edge)) {
            getLineLabelRenderer(edge).drawLabel(canvas, getLineLabelStyle(edge), number, f2, f3, z);
        }
    }

    protected void drawMarkers(Canvas canvas) {
        if (this.plot.getYValueMarkers() != null && this.plot.getYValueMarkers().size() > 0) {
            Iterator<YValueMarker> it = this.plot.getYValueMarkers().iterator();
            while (it.hasNext()) {
                it.next().draw(canvas, this.plot, this.gridRect);
            }
        }
        if (this.plot.getXValueMarkers() == null || this.plot.getXValueMarkers().size() <= 0) {
            return;
        }
        Iterator<XValueMarker> it2 = this.plot.getXValueMarkers().iterator();
        while (it2.hasNext()) {
            it2.next().draw(canvas, this.plot, this.gridRect);
        }
    }

    protected void drawPoint(Canvas canvas, PointF pointF, Paint paint) {
        canvas.drawPoint(pointF.x, pointF.y, paint);
    }

    protected void drawRangeLine(Canvas canvas, float f2, Number number, Paint paint, boolean z) {
        if (paint != null) {
            RectF rectF = this.gridRect;
            canvas.drawLine(rectF.left - this.lineExtensionLeft, f2, rectF.right + this.lineExtensionRight, f2, paint);
        }
        drawLineLabel(canvas, Edge.LEFT, number, this.labelRect.left, f2, z);
        drawLineLabel(canvas, Edge.RIGHT, number, this.labelRect.right, f2, z);
    }

    public CursorLabelFormatter getCursorLabelFormatter() {
        return this.cursorLabelFormatter;
    }

    protected Map<Edge, LineLabelRenderer> getDefaultLineLabelRenderers() {
        EnumMap enumMap = new EnumMap(Edge.class);
        enumMap.put((EnumMap) Edge.TOP, (Edge) new LineLabelRenderer());
        enumMap.put((EnumMap) Edge.BOTTOM, (Edge) new LineLabelRenderer());
        enumMap.put((EnumMap) Edge.LEFT, (Edge) new LineLabelRenderer());
        enumMap.put((EnumMap) Edge.RIGHT, (Edge) new LineLabelRenderer());
        return enumMap;
    }

    protected Map<Edge, LineLabelStyle> getDefaultLineLabelStyles() {
        EnumMap enumMap = new EnumMap(Edge.class);
        enumMap.put((EnumMap) Edge.TOP, (Edge) new LineLabelStyle());
        enumMap.put((EnumMap) Edge.BOTTOM, (Edge) new LineLabelStyle());
        enumMap.put((EnumMap) Edge.LEFT, (Edge) new LineLabelStyle());
        enumMap.put((EnumMap) Edge.RIGHT, (Edge) new LineLabelStyle());
        return enumMap;
    }

    public Paint getDomainCursorPaint() {
        return this.domainCursorPaint;
    }

    public Float getDomainCursorPosition() {
        return this.domainCursorPosition;
    }

    public Number getDomainCursorVal() {
        return screenToSeriesX(getDomainCursorPosition().floatValue());
    }

    public Paint getDomainGridLinePaint() {
        return this.domainGridLinePaint;
    }

    public Paint getDomainOriginLinePaint() {
        return this.domainOriginLinePaint;
    }

    public Paint getDomainSubGridLinePaint() {
        return this.domainSubGridLinePaint;
    }

    public Paint getGridBackgroundPaint() {
        return this.gridBackgroundPaint;
    }

    public Insets getGridInsets() {
        return this.gridInsets;
    }

    public RectF getGridRect() {
        return this.gridRect;
    }

    public RectF getLabelRect() {
        return this.labelRect;
    }

    public float getLineExtensionBottom() {
        return this.lineExtensionBottom;
    }

    public float getLineExtensionLeft() {
        return this.lineExtensionLeft;
    }

    public float getLineExtensionRight() {
        return this.lineExtensionRight;
    }

    public float getLineExtensionTop() {
        return this.lineExtensionTop;
    }

    public Insets getLineLabelInsets() {
        return this.lineLabelInsets;
    }

    public LineLabelRenderer getLineLabelRenderer(Edge edge) {
        return this.lineLabelRenderers.get(edge);
    }

    public LineLabelStyle getLineLabelStyle(Edge edge) {
        return this.lineLabelStyles.get(edge);
    }

    public int getLinesPerDomainLabel() {
        return this.linesPerDomainLabel;
    }

    public int getLinesPerRangeLabel() {
        return this.linesPerRangeLabel;
    }

    public Paint getRangeCursorPaint() {
        return this.rangeCursorPaint;
    }

    public Float getRangeCursorPosition() {
        return this.rangeCursorPosition;
    }

    public Number getRangeCursorVal() {
        return screenToSeriesY(getRangeCursorPosition().floatValue());
    }

    public Paint getRangeGridLinePaint() {
        return this.rangeGridLinePaint;
    }

    public Paint getRangeOriginLinePaint() {
        return this.rangeOriginLinePaint;
    }

    public Paint getRangeSubGridLinePaint() {
        return this.rangeSubGridLinePaint;
    }

    public boolean isDrawGridOnTop() {
        return this.drawGridOnTop;
    }

    public boolean isDrawMarkersEnabled() {
        return this.drawMarkersEnabled;
    }

    public boolean isGridClippingEnabled() {
        return this.isGridClippingEnabled;
    }

    public boolean isLineLabelEnabled(Edge edge) {
        return this.lineLabelEdges.contains(edge);
    }

    @Override // com.androidplot.ui.widget.Widget
    protected void onResize(RectF rectF, RectF rectF2) {
        recalculateSizes(rectF2);
    }

    public void processAttrs(TypedArray typedArray) {
        setDrawGridOnTop(typedArray.getBoolean(R.styleable.xy_XYPlot_drawGridOnTop, isDrawGridOnTop()));
        int i2 = typedArray.getInt(R.styleable.xy_XYPlot_lineLabels, 0);
        if (i2 != 0) {
            setLineLabelEdges(i2);
        }
        setGridClippingEnabled(typedArray.getBoolean(R.styleable.xy_XYPlot_gridClippingEnabled, isGridClippingEnabled()));
        LineLabelStyle lineLabelStyle = getLineLabelStyle(Edge.TOP);
        LineLabelStyle lineLabelStyle2 = getLineLabelStyle(Edge.BOTTOM);
        LineLabelStyle lineLabelStyle3 = getLineLabelStyle(Edge.LEFT);
        LineLabelStyle lineLabelStyle4 = getLineLabelStyle(Edge.RIGHT);
        lineLabelStyle.setRotation(typedArray.getFloat(R.styleable.xy_XYPlot_lineLabelRotationTop, lineLabelStyle.getRotation()));
        lineLabelStyle2.setRotation(typedArray.getFloat(R.styleable.xy_XYPlot_lineLabelRotationBottom, lineLabelStyle2.getRotation()));
        lineLabelStyle3.setRotation(typedArray.getFloat(R.styleable.xy_XYPlot_lineLabelRotationLeft, lineLabelStyle3.getRotation()));
        lineLabelStyle4.setRotation(typedArray.getFloat(R.styleable.xy_XYPlot_lineLabelRotationRight, lineLabelStyle4.getRotation()));
        setLineExtensionTop(typedArray.getDimension(R.styleable.xy_XYPlot_lineExtensionTop, getLineExtensionTop()));
        setLineExtensionBottom(typedArray.getDimension(R.styleable.xy_XYPlot_lineExtensionBottom, getLineExtensionBottom()));
        setLineExtensionLeft(typedArray.getDimension(R.styleable.xy_XYPlot_lineExtensionLeft, getLineExtensionLeft()));
        setLineExtensionRight(typedArray.getDimension(R.styleable.xy_XYPlot_lineExtensionRight, getLineExtensionRight()));
        AttrUtils.configureTextPaint(typedArray, lineLabelStyle.getPaint(), R.styleable.xy_XYPlot_lineLabelTextColorTop, R.styleable.xy_XYPlot_lineLabelTextSizeTop, Integer.valueOf(R.styleable.xy_XYPlot_lineLabelAlignTop));
        AttrUtils.configureTextPaint(typedArray, lineLabelStyle2.getPaint(), R.styleable.xy_XYPlot_lineLabelTextColorBottom, R.styleable.xy_XYPlot_lineLabelTextSizeBottom, Integer.valueOf(R.styleable.xy_XYPlot_lineLabelAlignBottom));
        AttrUtils.configureTextPaint(typedArray, lineLabelStyle3.getPaint(), R.styleable.xy_XYPlot_lineLabelTextColorLeft, R.styleable.xy_XYPlot_lineLabelTextSizeLeft, Integer.valueOf(R.styleable.xy_XYPlot_lineLabelAlignLeft));
        AttrUtils.configureTextPaint(typedArray, lineLabelStyle4.getPaint(), R.styleable.xy_XYPlot_lineLabelTextColorRight, R.styleable.xy_XYPlot_lineLabelTextSizeRight, Integer.valueOf(R.styleable.xy_XYPlot_lineLabelAlignRight));
        AttrUtils.configureInsets(typedArray, getGridInsets(), R.styleable.xy_XYPlot_gridInsetTop, R.styleable.xy_XYPlot_gridInsetBottom, R.styleable.xy_XYPlot_gridInsetLeft, R.styleable.xy_XYPlot_gridInsetRight);
        AttrUtils.configureInsets(typedArray, getLineLabelInsets(), R.styleable.xy_XYPlot_lineLabelInsetTop, R.styleable.xy_XYPlot_lineLabelInsetBottom, R.styleable.xy_XYPlot_lineLabelInsetLeft, R.styleable.xy_XYPlot_lineLabelInsetRight);
        AttrUtils.configureWidget(typedArray, this, R.styleable.xy_XYPlot_graphHeightMode, R.styleable.xy_XYPlot_graphHeight, R.styleable.xy_XYPlot_graphWidthMode, R.styleable.xy_XYPlot_graphWidth, R.styleable.xy_XYPlot_graphHorizontalPositioning, R.styleable.xy_XYPlot_graphHorizontalPosition, R.styleable.xy_XYPlot_graphVerticalPositioning, R.styleable.xy_XYPlot_graphVerticalPosition, R.styleable.xy_XYPlot_graphAnchor, R.styleable.xy_XYPlot_graphVisible);
        AttrUtils.configureWidget(typedArray, this, R.styleable.xy_XYPlot_domainTitleHeightMode, R.styleable.xy_XYPlot_domainTitleHeight, R.styleable.xy_XYPlot_domainTitleWidthMode, R.styleable.xy_XYPlot_domainTitleWidth, R.styleable.xy_XYPlot_domainTitleHorizontalPositioning, R.styleable.xy_XYPlot_domainTitleHorizontalPosition, R.styleable.xy_XYPlot_domainTitleVerticalPositioning, R.styleable.xy_XYPlot_domainTitleVerticalPosition, R.styleable.xy_XYPlot_domainTitleAnchor, R.styleable.xy_XYPlot_domainTitleVisible);
        AttrUtils.configureWidget(typedArray, this, R.styleable.xy_XYPlot_rangeTitleHeightMode, R.styleable.xy_XYPlot_rangeTitleHeight, R.styleable.xy_XYPlot_rangeTitleWidthMode, R.styleable.xy_XYPlot_rangeTitleWidth, R.styleable.xy_XYPlot_rangeTitleHorizontalPositioning, R.styleable.xy_XYPlot_rangeTitleHorizontalPosition, R.styleable.xy_XYPlot_rangeTitleVerticalPositioning, R.styleable.xy_XYPlot_rangeTitleVerticalPosition, R.styleable.xy_XYPlot_rangeTitleAnchor, R.styleable.xy_XYPlot_rangeTitleVisible);
        AttrUtils.configureWidgetRotation(typedArray, this, R.styleable.xy_XYPlot_graphRotation);
        AttrUtils.configureBoxModelable(typedArray, this, R.styleable.xy_XYPlot_graphMarginTop, R.styleable.xy_XYPlot_graphMarginBottom, R.styleable.xy_XYPlot_graphMarginLeft, R.styleable.xy_XYPlot_graphMarginRight, R.styleable.xy_XYPlot_graphPaddingTop, R.styleable.xy_XYPlot_graphPaddingBottom, R.styleable.xy_XYPlot_graphPaddingLeft, R.styleable.xy_XYPlot_graphPaddingRight);
        AttrUtils.configureLinePaint(typedArray, getDomainOriginLinePaint(), R.styleable.xy_XYPlot_domainOriginLineColor, R.styleable.xy_XYPlot_domainOriginLineThickness);
        AttrUtils.configureLinePaint(typedArray, getRangeOriginLinePaint(), R.styleable.xy_XYPlot_rangeOriginLineColor, R.styleable.xy_XYPlot_rangeOriginLineThickness);
        AttrUtils.configureLinePaint(typedArray, getDomainGridLinePaint(), R.styleable.xy_XYPlot_domainLineColor, R.styleable.xy_XYPlot_domainLineThickness);
        AttrUtils.configureLinePaint(typedArray, getRangeGridLinePaint(), R.styleable.xy_XYPlot_rangeLineColor, R.styleable.xy_XYPlot_rangeLineThickness);
        AttrUtils.setColor(typedArray, getBackgroundPaint(), R.styleable.xy_XYPlot_graphBackgroundColor);
        AttrUtils.setColor(typedArray, getGridBackgroundPaint(), R.styleable.xy_XYPlot_gridBackgroundColor);
    }

    protected void recalculateSizes(RectF rectF) {
        if (rectF == null) {
            rectF = getWidgetDimensions().paddedRect;
        }
        this.gridRect = RectFUtils.applyInsets(rectF, this.gridInsets);
        this.labelRect = RectFUtils.applyInsets(rectF, this.lineLabelInsets);
    }

    protected XYCoords screenToSeries(PointF pointF) {
        if (this.plot.getBounds().isFullyDefined()) {
            return new RectRegion(this.gridRect).transform((Number) Float.valueOf(pointF.x), (Number) Float.valueOf(pointF.y), this.plot.getBounds(), false, true);
        }
        return null;
    }

    protected Number screenToSeriesX(PointF pointF) {
        return screenToSeriesX(pointF.x);
    }

    protected Number screenToSeriesY(PointF pointF) {
        return screenToSeriesY(pointF.y);
    }

    protected PointF seriesToScreen(XYCoords xYCoords) {
        if (this.plot.getBounds().isFullyDefined()) {
            return this.plot.getBounds().transform(xYCoords, this.gridRect, false, true);
        }
        return null;
    }

    protected float seriesToScreenX(Number number) {
        com.androidplot.Region region = this.plot.getBounds().getxRegion();
        double dDoubleValue = number.doubleValue();
        RectF rectF = this.gridRect;
        return (float) region.transform(dDoubleValue, rectF.left, rectF.right, false);
    }

    protected float seriesToScreenY(Number number) {
        com.androidplot.Region region = this.plot.getBounds().getyRegion();
        double dDoubleValue = number.doubleValue();
        RectF rectF = this.gridRect;
        return (float) region.transform(dDoubleValue, rectF.bottom, rectF.top, true);
    }

    public void setCursorLabelFormatter(CursorLabelFormatter cursorLabelFormatter) {
        this.cursorLabelFormatter = cursorLabelFormatter;
    }

    public void setCursorPosition(Float f2, Float f3) {
        setDomainCursorPosition(f2);
        setRangeCursorPosition(f3);
    }

    public void setDomainCursorPaint(Paint paint) {
        this.domainCursorPaint = paint;
    }

    public void setDomainCursorPosition(Float f2) {
        this.domainCursorPosition = f2;
    }

    public void setDomainGridLinePaint(Paint paint) {
        this.domainGridLinePaint = paint;
    }

    public void setDomainOriginLinePaint(Paint paint) {
        this.domainOriginLinePaint = paint;
    }

    public void setDomainSubGridLinePaint(Paint paint) {
        this.domainSubGridLinePaint = paint;
    }

    public void setDrawGridOnTop(boolean z) {
        this.drawGridOnTop = z;
    }

    public void setDrawMarkersEnabled(boolean z) {
        this.drawMarkersEnabled = z;
    }

    public void setGridBackgroundPaint(Paint paint) {
        this.gridBackgroundPaint = paint;
    }

    public void setGridClippingEnabled(boolean z) {
        this.isGridClippingEnabled = z;
    }

    public void setGridInsets(Insets insets) {
        this.gridInsets = insets;
        recalculateSizes(null);
    }

    public void setGridRect(RectF rectF) {
        this.gridRect = rectF;
    }

    public void setLabelRect(RectF rectF) {
        this.labelRect = rectF;
    }

    public void setLineExtensionBottom(float f2) {
        this.lineExtensionBottom = f2;
    }

    public void setLineExtensionLeft(float f2) {
        this.lineExtensionLeft = f2;
    }

    public void setLineExtensionRight(float f2) {
        this.lineExtensionRight = f2;
    }

    public void setLineExtensionTop(float f2) {
        this.lineExtensionTop = f2;
    }

    public void setLineLabelEdges(Edge... edgeArr) {
        EnumSet<Edge> enumSetNoneOf = EnumSet.noneOf(Edge.class);
        if (edgeArr != null) {
            Collections.addAll(enumSetNoneOf, edgeArr);
        }
        this.lineLabelEdges = enumSetNoneOf;
    }

    public void setLineLabelInsets(Insets insets) {
        this.lineLabelInsets = insets;
        recalculateSizes(null);
    }

    public void setLineLabelRenderer(Edge edge, LineLabelRenderer lineLabelRenderer) {
        this.lineLabelRenderers.put(edge, lineLabelRenderer);
    }

    public void setLineLabelStyle(Edge edge, LineLabelStyle lineLabelStyle) {
        this.lineLabelStyles.put(edge, lineLabelStyle);
    }

    public void setLinesPerDomainLabel(int i2) {
        this.linesPerDomainLabel = i2;
    }

    public void setLinesPerRangeLabel(int i2) {
        this.linesPerRangeLabel = i2;
    }

    public void setRangeCursorPaint(Paint paint) {
        this.rangeCursorPaint = paint;
    }

    public void setRangeCursorPosition(Float f2) {
        this.rangeCursorPosition = f2;
    }

    public void setRangeGridLinePaint(Paint paint) {
        this.rangeGridLinePaint = paint;
    }

    public void setRangeOriginLinePaint(Paint paint) {
        this.rangeOriginLinePaint = paint;
    }

    public void setRangeSubGridLinePaint(Paint paint) {
        this.rangeSubGridLinePaint = paint;
    }

    protected Number screenToSeriesX(float f2) {
        if (this.plot.getBounds().xRegion.isDefined()) {
            return new com.androidplot.Region(Float.valueOf(this.gridRect.left), Float.valueOf(this.gridRect.right)).transform(f2, this.plot.getBounds().getxRegion());
        }
        return null;
    }

    protected Number screenToSeriesY(float f2) {
        if (this.plot.getBounds().getyRegion().isDefined()) {
            return new com.androidplot.Region(Float.valueOf(this.gridRect.top), Float.valueOf(this.gridRect.bottom)).transform(f2, this.plot.getBounds().getyRegion(), true);
        }
        return null;
    }

    public void setCursorPosition(PointF pointF) {
        setCursorPosition(Float.valueOf(pointF.x), Float.valueOf(pointF.y));
    }

    public void setLineLabelEdges(Collection<Edge> collection) {
        this.lineLabelEdges = EnumSet.copyOf((Collection) collection);
    }

    protected void setLineLabelEdges(int i2) {
        for (Edge edge : Edge.values()) {
            if ((edge.value & i2) == edge.value) {
                this.lineLabelEdges.add(edge);
            }
        }
    }

    public static class LineLabelRenderer {
        public void drawLabel(Canvas canvas, LineLabelStyle lineLabelStyle, Number number, float f2, float f3, boolean z) {
            int iSave = canvas.save();
            try {
                String str = lineLabelStyle.format.format(number);
                canvas.rotate(lineLabelStyle.getRotation(), f2, f3);
                drawLabel(canvas, str, lineLabelStyle.getPaint(), f2, f3, z);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }

        protected void drawLabel(Canvas canvas, String str, Paint paint, float f2, float f3, boolean z) {
            canvas.drawText(str, f2, f3, paint);
        }
    }
}