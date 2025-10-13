package com.androidplot.xy;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import com.androidplot.Plot;
import com.androidplot.R;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.DynamicTableModel;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.TextOrientation;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.ui.widget.TextLabelWidget;
import com.androidplot.util.AttrUtils;
import com.androidplot.util.PixelUtils;
import com.androidplot.util.SeriesUtils;
import com.androidplot.xy.CandlestickSeries;
import com.androidplot.xy.SimpleXYSeries;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class XYPlot extends Plot<XYSeries, XYSeriesFormatter, XYSeriesRenderer, XYSeriesBundle, XYSeriesRegistry> {
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_H_DP = 10;
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_W_DP = 80;
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_X_OFFSET_DP = 20;
    private static final int DEFAULT_DOMAIN_LABEL_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_GRAPH_WIDGET_H_DP = 18;
    private static final int DEFAULT_GRAPH_WIDGET_W_DP = 10;
    private static final int DEFAULT_GRAPH_WIDGET_X_OFFSET_DP = 0;
    private static final int DEFAULT_GRAPH_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_LEGEND_WIDGET_H_DP = 10;
    private static final int DEFAULT_LEGEND_WIDGET_ICON_SIZE_DP = 7;
    private static final int DEFAULT_LEGEND_WIDGET_X_OFFSET_DP = 40;
    private static final int DEFAULT_LEGEND_WIDGET_Y_OFFSET_DP = 0;
    private static final int DEFAULT_PLOT_BOTTOM_MARGIN_DP = 1;
    private static final int DEFAULT_PLOT_LEFT_MARGIN_DP = 1;
    private static final int DEFAULT_PLOT_RIGHT_MARGIN_DP = 1;
    private static final int DEFAULT_PLOT_TOP_MARGIN_DP = 1;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_H_DP = 50;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_W_DP = 10;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_X_OFFSET_DP = 0;
    private static final int DEFAULT_RANGE_LABEL_WIDGET_Y_OFFSET_DP = 0;
    private RectRegion bounds;
    private XYCoords calculatedOrigin;
    private XYConstraints constraints;
    private BoundaryMode domainOriginBoundaryMode;
    private Number domainOriginExtent;
    private StepModel domainStepModel;
    private TextLabelWidget domainTitle;
    private XYGraphWidget graph;
    private final RectRegion innerLimits;
    private XYLegendWidget legend;
    private final RectRegion outerLimits;
    private Number prevMaxX;
    private Number prevMaxY;
    private Number prevMinX;
    private Number prevMinY;
    private PreviewMode previewMode;
    private BoundaryMode rangeOriginBoundaryMode;
    private Number rangeOriginExtent;
    private StepModel rangeStepModel;
    private TextLabelWidget rangeTitle;
    private Number userDomainOrigin;
    private Number userRangeOrigin;
    private ArrayList<XValueMarker> xValueMarkers;
    private ArrayList<YValueMarker> yValueMarkers;

    /* renamed from: com.androidplot.xy.XYPlot$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$BoundaryMode;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$XYFramingModel;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode;

        static {
            int[] iArr = new int[BoundaryMode.values().length];
            $SwitchMap$com$androidplot$xy$BoundaryMode = iArr;
            try {
                iArr[BoundaryMode.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BoundaryMode[BoundaryMode.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BoundaryMode[BoundaryMode.GROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$xy$BoundaryMode[BoundaryMode.SHRINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[XYFramingModel.values().length];
            $SwitchMap$com$androidplot$xy$XYFramingModel = iArr2;
            try {
                iArr2[XYFramingModel.ORIGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYFramingModel[XYFramingModel.EDGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreviewMode.values().length];
            $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode = iArr3;
            try {
                iArr3[PreviewMode.LineAndPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode[PreviewMode.Candlestick.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$androidplot$xy$XYPlot$PreviewMode[PreviewMode.Bar.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum PreviewMode {
        LineAndPoint,
        Candlestick,
        Bar
    }

    public XYPlot(Context context, String str) {
        super(context, str);
        this.constraints = new XYConstraints();
        this.bounds = RectRegion.withDefaults(new RectRegion(-1, 1, -1, 1));
        this.innerLimits = new RectRegion();
        this.outerLimits = new RectRegion();
        this.calculatedOrigin = new XYCoords();
        this.domainOriginExtent = null;
        this.rangeOriginExtent = null;
    }

    private static Number applyUserMinMax(Number number, Number number2, Number number3) {
        if (number2 != null && number != null && number.doubleValue() <= number2.doubleValue()) {
            number = number2;
        }
        return (number3 == null || number == null || number.doubleValue() < number3.doubleValue()) ? number : number3;
    }

    private static double distance(double d2, double d3) {
        return d2 > d3 ? d2 - d3 : d3 - d2;
    }

    public boolean addMarker(YValueMarker yValueMarker) {
        if (this.yValueMarkers.contains(yValueMarker)) {
            return false;
        }
        return this.yValueMarkers.add(yValueMarker);
    }

    public void calculateMinMaxVals() {
        this.prevMinX = this.bounds.isMinXSet() ? this.bounds.getMinX() : null;
        this.prevMaxX = this.bounds.isMaxXSet() ? this.bounds.getMaxX() : null;
        this.prevMinY = this.bounds.isMinYSet() ? this.bounds.getMinY() : null;
        this.prevMaxY = this.bounds.isMaxYSet() ? this.bounds.getMaxY() : null;
        this.bounds.setMinX(this.constraints.getMinX());
        this.bounds.setMaxX(this.constraints.getMaxX());
        this.bounds.setMinY(this.constraints.getMinY());
        this.bounds.setMaxY(this.constraints.getMaxY());
        if (!this.bounds.isFullyDefined()) {
            RectRegion rectRegionMinMax = SeriesUtils.minMax(this.constraints, getRegistry().getSeriesList());
            if (!this.bounds.isMinXSet()) {
                this.bounds.setMinX(rectRegionMinMax.getMinX());
            }
            if (!this.bounds.isMaxXSet()) {
                this.bounds.setMaxX(rectRegionMinMax.getMaxX());
            }
            if (!this.bounds.isMinYSet()) {
                this.bounds.setMinY(rectRegionMinMax.getMinY());
            }
            if (!this.bounds.isMaxYSet()) {
                this.bounds.setMaxY(rectRegionMinMax.getMaxY());
            }
        }
        int[] iArr = AnonymousClass1.$SwitchMap$com$androidplot$xy$XYFramingModel;
        int i2 = iArr[this.constraints.getDomainFramingModel().ordinal()];
        if (i2 == 1) {
            updateDomainMinMaxForOriginModel();
        } else {
            if (i2 != 2) {
                throw new UnsupportedOperationException("Domain Framing Model not yet supported: " + this.constraints.getDomainFramingModel());
            }
            this.bounds.setMaxX(applyUserMinMax(getCalculatedUpperBoundary(this.constraints.getDomainUpperBoundaryMode(), this.prevMaxX, this.bounds.getMaxX()), this.innerLimits.getMaxX(), this.outerLimits.getMaxX()));
            this.bounds.setMinX(applyUserMinMax(getCalculatedLowerBoundary(this.constraints.getDomainLowerBoundaryMode(), this.prevMinX, this.bounds.getMinX()), this.outerLimits.getMinX(), this.innerLimits.getMinX()));
        }
        int i3 = iArr[this.constraints.getRangeFramingModel().ordinal()];
        if (i3 == 1) {
            updateRangeMinMaxForOriginModel();
        } else {
            if (i3 != 2) {
                throw new UnsupportedOperationException("Range Framing Model not yet supported: " + this.constraints.getRangeFramingModel());
            }
            if (getRegistry().size() > 0) {
                this.bounds.setMaxY(applyUserMinMax(getCalculatedUpperBoundary(this.constraints.getRangeUpperBoundaryMode(), this.prevMaxY, this.bounds.getMaxY()), this.innerLimits.getMaxY(), this.outerLimits.getMaxY()));
                this.bounds.setMinY(applyUserMinMax(getCalculatedLowerBoundary(this.constraints.getRangeLowerBoundaryMode(), this.prevMinY, this.bounds.getMinY()), this.outerLimits.getMinY(), this.innerLimits.getMinY()));
            }
        }
        XYCoords xYCoords = this.calculatedOrigin;
        Number minX = this.userDomainOrigin;
        if (minX == null) {
            minX = this.bounds.getMinX();
        }
        xYCoords.x = minX;
        XYCoords xYCoords2 = this.calculatedOrigin;
        Number minY = this.userRangeOrigin;
        if (minY == null) {
            minY = this.bounds.getMinY();
        }
        xYCoords2.y = minY;
    }

    public void centerOnDomainOrigin(Number number) {
        centerOnDomainOrigin(number, null, BoundaryMode.AUTO);
    }

    public void centerOnRangeOrigin(Number number) {
        centerOnRangeOrigin(number, null, BoundaryMode.AUTO);
    }

    public boolean containsPoint(float f2, float f3) {
        return getGraph().containsPoint(f2, f3);
    }

    public RectRegion getBounds() {
        return this.bounds;
    }

    protected Number getCalculatedLowerBoundary(BoundaryMode boundaryMode, Number number, Number number2) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[boundaryMode.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new UnsupportedOperationException("BoundaryMode not supported: " + boundaryMode);
                }
                if (number != null && number2.doubleValue() <= number.doubleValue()) {
                    return number;
                }
            } else if (number != null && number2.doubleValue() >= number.doubleValue()) {
                return number;
            }
        }
        return number2;
    }

    protected Number getCalculatedUpperBoundary(BoundaryMode boundaryMode, Number number, Number number2) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[boundaryMode.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new UnsupportedOperationException("BoundaryMode not supported: " + boundaryMode);
                }
                if (number != null && number2.doubleValue() >= number.doubleValue()) {
                    return number;
                }
            } else if (number != null && number2.doubleValue() <= number.doubleValue()) {
                return number;
            }
        }
        return number2;
    }

    public Number getDomainOrigin() {
        return this.calculatedOrigin.x;
    }

    public StepMode getDomainStepMode() {
        return this.domainStepModel.getMode();
    }

    public StepModel getDomainStepModel() {
        return this.domainStepModel;
    }

    public double getDomainStepValue() {
        return this.domainStepModel.getValue();
    }

    public TextLabelWidget getDomainTitle() {
        return this.domainTitle;
    }

    public XYGraphWidget getGraph() {
        return this.graph;
    }

    public RectRegion getInnerLimits() {
        return this.innerLimits;
    }

    public XYLegendWidget getLegend() {
        return this.legend;
    }

    public int getLinesPerDomainLabel() {
        return this.graph.getLinesPerDomainLabel();
    }

    public int getLinesPerRangeLabel() {
        return this.graph.getLinesPerRangeLabel();
    }

    public XYCoords getOrigin() {
        return this.calculatedOrigin;
    }

    protected Number[] getOriginMinMax(BoundaryMode boundaryMode, Number number, Number number2) {
        if (boundaryMode != BoundaryMode.FIXED) {
            return new Number[]{null, null};
        }
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        return new Number[]{Double.valueOf(dDoubleValue - dDoubleValue2), Double.valueOf(dDoubleValue + dDoubleValue2)};
    }

    public RectRegion getOuterLimits() {
        return this.outerLimits;
    }

    public Number getRangeOrigin() {
        return this.calculatedOrigin.y;
    }

    public StepMode getRangeStepMode() {
        return this.rangeStepModel.getMode();
    }

    public StepModel getRangeStepModel() {
        return this.rangeStepModel;
    }

    public double getRangeStepValue() {
        return this.rangeStepModel.getValue();
    }

    public TextLabelWidget getRangeTitle() {
        return this.rangeTitle;
    }

    @Deprecated
    public Number getXVal(float f2) {
        return getGraph().screenToSeriesX(f2);
    }

    protected List<XValueMarker> getXValueMarkers() {
        return this.xValueMarkers;
    }

    public Number getYVal(float f2) {
        return getGraph().screenToSeriesY(f2);
    }

    protected List<YValueMarker> getYValueMarkers() {
        return this.yValueMarkers;
    }

    @Override // com.androidplot.Plot
    protected void notifyListenersBeforeDraw(Canvas canvas) {
        super.notifyListenersBeforeDraw(canvas);
        calculateMinMaxVals();
        getRegistry().estimate(this);
    }

    @Override // com.androidplot.Plot
    protected void onAfterConfig() {
        if (isInEditMode()) {
            int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$XYPlot$PreviewMode[this.previewMode.ordinal()];
            if (i2 == 1) {
                List listAsList = Arrays.asList(1, 2, 3, 3, 4);
                SimpleXYSeries.ArrayFormat arrayFormat = SimpleXYSeries.ArrayFormat.Y_VALS_ONLY;
                addSeries((XYPlot) new SimpleXYSeries((List<? extends Number>) listAsList, arrayFormat, "Red"), (SimpleXYSeries) new LineAndPointFormatter(-65536, null, null, null));
                addSeries((XYPlot) new SimpleXYSeries((List<? extends Number>) Arrays.asList(2, 1, 4, 2, 5), arrayFormat, "Green"), (SimpleXYSeries) new LineAndPointFormatter(-16711936, null, null, null));
                addSeries((XYPlot) new SimpleXYSeries((List<? extends Number>) Arrays.asList(3, 3, 2, 3, 3), arrayFormat, "Blue"), (SimpleXYSeries) new LineAndPointFormatter(-16776961, null, null, null));
                return;
            }
            if (i2 == 2) {
                CandlestickMaker.make(this, new CandlestickFormatter(), new CandlestickSeries(new CandlestickSeries.Item(1.0d, 10.0d, 2.0d, 9.0d), new CandlestickSeries.Item(4.0d, 18.0d, 6.0d, 5.0d), new CandlestickSeries.Item(3.0d, 11.0d, 5.0d, 10.0d), new CandlestickSeries.Item(2.0d, 17.0d, 2.0d, 15.0d), new CandlestickSeries.Item(6.0d, 11.0d, 11.0d, 7.0d), new CandlestickSeries.Item(8.0d, 16.0d, 10.0d, 15.0d)));
            } else {
                if (i2 == 3) {
                    throw new UnsupportedOperationException("Not yet implemented.");
                }
                throw new UnsupportedOperationException("Unexpected preview mode: " + this.previewMode);
            }
        }
    }

    @Override // com.androidplot.Plot
    protected void onPreInit() {
        LayoutManager layoutManager = getLayoutManager();
        float fDpToPix = PixelUtils.dpToPix(10.0f);
        SizeMode sizeMode = SizeMode.ABSOLUTE;
        this.legend = new XYLegendWidget(layoutManager, this, new Size(fDpToPix, sizeMode, 0.5f, SizeMode.RELATIVE), new DynamicTableModel(0, 1), new Size(PixelUtils.dpToPix(7.0f), sizeMode, PixelUtils.dpToPix(7.0f), sizeMode));
        LayoutManager layoutManager2 = getLayoutManager();
        float fDpToPix2 = PixelUtils.dpToPix(18.0f);
        SizeMode sizeMode2 = SizeMode.FILL;
        this.graph = new XYGraphWidget(layoutManager2, this, new Size(fDpToPix2, sizeMode2, PixelUtils.dpToPix(10.0f), sizeMode2));
        Paint paint = new Paint();
        paint.setColor(-12303292);
        paint.setStyle(Paint.Style.FILL);
        this.graph.setBackgroundPaint(paint);
        this.domainTitle = new TextLabelWidget(getLayoutManager(), new Size(PixelUtils.dpToPix(10.0f), sizeMode, PixelUtils.dpToPix(80.0f), sizeMode), TextOrientation.HORIZONTAL);
        this.rangeTitle = new TextLabelWidget(getLayoutManager(), new Size(PixelUtils.dpToPix(50.0f), sizeMode, PixelUtils.dpToPix(10.0f), sizeMode), TextOrientation.VERTICAL_ASCENDING);
        XYLegendWidget xYLegendWidget = this.legend;
        float fDpToPix3 = PixelUtils.dpToPix(40.0f);
        HorizontalPositioning horizontalPositioning = HorizontalPositioning.ABSOLUTE_FROM_RIGHT;
        float fDpToPix4 = PixelUtils.dpToPix(0.0f);
        VerticalPositioning verticalPositioning = VerticalPositioning.ABSOLUTE_FROM_BOTTOM;
        xYLegendWidget.position(fDpToPix3, horizontalPositioning, fDpToPix4, verticalPositioning, Anchor.RIGHT_BOTTOM);
        XYGraphWidget xYGraphWidget = this.graph;
        float fDpToPix5 = PixelUtils.dpToPix(0.0f);
        float fDpToPix6 = PixelUtils.dpToPix(0.0f);
        VerticalPositioning verticalPositioning2 = VerticalPositioning.ABSOLUTE_FROM_CENTER;
        xYGraphWidget.position(fDpToPix5, horizontalPositioning, fDpToPix6, verticalPositioning2, Anchor.RIGHT_MIDDLE);
        TextLabelWidget textLabelWidget = this.domainTitle;
        float fDpToPix7 = PixelUtils.dpToPix(20.0f);
        HorizontalPositioning horizontalPositioning2 = HorizontalPositioning.ABSOLUTE_FROM_LEFT;
        textLabelWidget.position(fDpToPix7, horizontalPositioning2, PixelUtils.dpToPix(0.0f), verticalPositioning, Anchor.LEFT_BOTTOM);
        this.rangeTitle.position(PixelUtils.dpToPix(0.0f), horizontalPositioning2, PixelUtils.dpToPix(0.0f), verticalPositioning2, Anchor.LEFT_MIDDLE);
        getLayoutManager().moveToTop(getTitle());
        getLayoutManager().moveToTop(getLegend());
        getDomainTitle().pack();
        getRangeTitle().pack();
        setPlotMarginLeft(PixelUtils.dpToPix(1.0f));
        setPlotMarginRight(PixelUtils.dpToPix(1.0f));
        setPlotMarginTop(PixelUtils.dpToPix(1.0f));
        setPlotMarginBottom(PixelUtils.dpToPix(1.0f));
        this.xValueMarkers = new ArrayList<>();
        this.yValueMarkers = new ArrayList<>();
        StepMode stepMode = StepMode.SUBDIVIDE;
        this.domainStepModel = new StepModel(stepMode, 10.0d);
        this.rangeStepModel = new StepModel(stepMode, 10.0d);
    }

    @Override // com.androidplot.Plot
    protected void processAttrs(TypedArray typedArray) {
        this.previewMode = PreviewMode.values()[typedArray.getInt(R.styleable.xy_XYPlot_previewMode, PreviewMode.LineAndPoint.ordinal())];
        String string = typedArray.getString(R.styleable.xy_XYPlot_domainTitle);
        if (string != null) {
            getDomainTitle().setText(string);
        }
        String string2 = typedArray.getString(R.styleable.xy_XYPlot_rangeTitle);
        if (string2 != null) {
            getRangeTitle().setText(string2);
        }
        AttrUtils.configureStep(typedArray, getDomainStepModel(), R.styleable.xy_XYPlot_domainStepMode, R.styleable.xy_XYPlot_domainStep);
        AttrUtils.configureStep(typedArray, getRangeStepModel(), R.styleable.xy_XYPlot_rangeStepMode, R.styleable.xy_XYPlot_rangeStep);
        AttrUtils.configureTextPaint(typedArray, getDomainTitle().getLabelPaint(), R.styleable.xy_XYPlot_domainTitleTextColor, R.styleable.xy_XYPlot_domainTitleTextSize);
        AttrUtils.configureTextPaint(typedArray, getRangeTitle().getLabelPaint(), R.styleable.xy_XYPlot_rangeTitleTextColor, R.styleable.xy_XYPlot_rangeTitleTextSize);
        AttrUtils.configureTextPaint(typedArray, getLegend().getTextPaint(), R.styleable.xy_XYPlot_legendTextColor, R.styleable.xy_XYPlot_legendTextSize);
        AttrUtils.configureSize(typedArray, getLegend().getIconSize(), R.styleable.xy_XYPlot_legendIconHeightMode, R.styleable.xy_XYPlot_legendIconHeight, R.styleable.xy_XYPlot_legendIconWidthMode, R.styleable.xy_XYPlot_legendIconWidth);
        AttrUtils.configureWidget(typedArray, getLegend(), R.styleable.xy_XYPlot_legendHeightMode, R.styleable.xy_XYPlot_legendHeight, R.styleable.xy_XYPlot_legendWidthMode, R.styleable.xy_XYPlot_legendWidth, R.styleable.xy_XYPlot_legendHorizontalPositioning, R.styleable.xy_XYPlot_legendHorizontalPosition, R.styleable.xy_XYPlot_legendVerticalPositioning, R.styleable.xy_XYPlot_legendVerticalPosition, R.styleable.xy_XYPlot_legendAnchor, R.styleable.xy_XYPlot_legendVisible);
        getGraph().processAttrs(typedArray);
    }

    public YValueMarker removeMarker(YValueMarker yValueMarker) {
        int iIndexOf = this.yValueMarkers.indexOf(yValueMarker);
        if (iIndexOf == -1) {
            return null;
        }
        return this.yValueMarkers.remove(iIndexOf);
    }

    public int removeMarkers() {
        return removeXMarkers() + removeYMarkers();
    }

    public int removeXMarkers() {
        int size = this.xValueMarkers.size();
        this.xValueMarkers.clear();
        return size;
    }

    public int removeYMarkers() {
        int size = this.yValueMarkers.size();
        this.yValueMarkers.clear();
        return size;
    }

    public Number screenToSeriesX(float f2) {
        return getGraph().screenToSeriesX(f2);
    }

    public Number screenToSeriesY(float f2) {
        return getGraph().screenToSeriesY(f2);
    }

    public XYCoords screentoSeries(PointF pointF) {
        return getGraph().screenToSeries(pointF);
    }

    public PointF seriesToScreen(XYCoords xYCoords) {
        return getGraph().seriesToScreen(xYCoords);
    }

    public float seriesToScreenX(Number number) {
        return getGraph().seriesToScreenX(number);
    }

    public float seriesToScreenY(Number number) {
        return getGraph().seriesToScreenY(number);
    }

    public void setCursorPosition(PointF pointF) {
        getGraph().setCursorPosition(pointF);
    }

    public synchronized void setDomainBoundaries(Number number, Number number2, BoundaryMode boundaryMode) {
        setDomainBoundaries(number, boundaryMode, number2, boundaryMode);
    }

    protected void setDomainFramingModel(XYFramingModel xYFramingModel) {
        this.constraints.setDomainFramingModel(xYFramingModel);
    }

    public void setDomainLabel(String str) {
        getDomainTitle().setText(str);
    }

    public synchronized void setDomainLowerBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMinX(number);
        setDomainLowerBoundaryMode(boundaryMode);
        setDomainFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setDomainLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setDomainLowerBoundaryMode(boundaryMode);
    }

    public void setDomainStep(StepMode stepMode, double d2) {
        setDomainStepMode(stepMode);
        setDomainStepValue(d2);
    }

    public void setDomainStepMode(StepMode stepMode) {
        this.domainStepModel.setMode(stepMode);
    }

    public void setDomainStepModel(StepModel stepModel) {
        this.domainStepModel = stepModel;
    }

    public void setDomainStepValue(double d2) {
        this.domainStepModel.setValue(d2);
    }

    public void setDomainTitle(TextLabelWidget textLabelWidget) {
        this.domainTitle = textLabelWidget;
    }

    public synchronized void setDomainUpperBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMaxX(number);
        setDomainUpperBoundaryMode(boundaryMode);
        setDomainFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setDomainUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setDomainUpperBoundaryMode(boundaryMode);
    }

    public void setGraph(XYGraphWidget xYGraphWidget) {
        this.graph = xYGraphWidget;
    }

    public void setLegend(XYLegendWidget xYLegendWidget) {
        this.legend = xYLegendWidget;
    }

    public void setLinesPerDomainLabel(int i2) {
        this.graph.setLinesPerDomainLabel(i2);
    }

    public void setLinesPerRangeLabel(int i2) {
        this.graph.setLinesPerRangeLabel(i2);
    }

    public synchronized void setRangeBoundaries(Number number, Number number2, BoundaryMode boundaryMode) {
        setRangeBoundaries(number, boundaryMode, number2, boundaryMode);
    }

    protected void setRangeFramingModel(XYFramingModel xYFramingModel) {
        this.constraints.setRangeFramingModel(xYFramingModel);
    }

    public void setRangeLabel(String str) {
        getRangeTitle().setText(str);
    }

    public synchronized void setRangeLowerBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMinY(number);
        setRangeLowerBoundaryMode(boundaryMode);
        setRangeFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setRangeLowerBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setRangeLowerBoundaryMode(boundaryMode);
    }

    public void setRangeStep(StepMode stepMode, double d2) {
        setRangeStepMode(stepMode);
        setRangeStepValue(d2);
    }

    public void setRangeStepMode(StepMode stepMode) {
        this.rangeStepModel.setMode(stepMode);
    }

    public void setRangeStepModel(StepModel stepModel) {
        this.rangeStepModel = stepModel;
    }

    public void setRangeStepValue(double d2) {
        this.rangeStepModel.setValue(d2);
    }

    public void setRangeTitle(TextLabelWidget textLabelWidget) {
        this.rangeTitle = textLabelWidget;
    }

    public synchronized void setRangeUpperBoundary(Number number, BoundaryMode boundaryMode) {
        if (boundaryMode != BoundaryMode.FIXED) {
            number = null;
        }
        setUserMaxY(number);
        setRangeUpperBoundaryMode(boundaryMode);
        setRangeFramingModel(XYFramingModel.EDGE);
    }

    protected synchronized void setRangeUpperBoundaryMode(BoundaryMode boundaryMode) {
        this.constraints.setRangeUpperBoundaryMode(boundaryMode);
    }

    public synchronized void setUserDomainOrigin(Number number) {
        if (number == null) {
            throw new NullPointerException("Origin value cannot be null.");
        }
        this.userDomainOrigin = number;
    }

    protected synchronized void setUserMaxX(Number number) {
        this.constraints.setMaxX(number);
    }

    protected synchronized void setUserMaxY(Number number) {
        this.constraints.setMaxY(number);
    }

    protected synchronized void setUserMinX(Number number) {
        this.constraints.setMinX(number);
    }

    protected synchronized void setUserMinY(Number number) {
        this.constraints.setMinY(number);
    }

    public synchronized void setUserRangeOrigin(Number number) {
        if (number == null) {
            throw new NullPointerException("Origin value cannot be null.");
        }
        this.userRangeOrigin = number;
    }

    public void updateDomainMinMaxForOriginModel() {
        double dDoubleValue = this.userDomainOrigin.doubleValue();
        double dDistance = distance(this.bounds.getMaxX().doubleValue(), dDoubleValue);
        double dDistance2 = distance(this.bounds.getMinX().doubleValue(), dDoubleValue);
        if (dDistance <= dDistance2) {
            dDistance = dDistance2;
        }
        double d2 = dDoubleValue - dDistance;
        double d3 = dDoubleValue + dDistance;
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[this.domainOriginBoundaryMode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.bounds.setMinX(Double.valueOf(d2));
                this.bounds.setMaxX(Double.valueOf(d3));
                return;
            }
            if (i2 == 3) {
                Number number = this.prevMinX;
                if (number == null || d2 < number.doubleValue()) {
                    this.bounds.setMinX(Double.valueOf(d2));
                } else {
                    this.bounds.setMinX(this.prevMinX);
                }
                Number number2 = this.prevMaxX;
                if (number2 == null || d3 > number2.doubleValue()) {
                    this.bounds.setMaxX(Double.valueOf(d3));
                    return;
                } else {
                    this.bounds.setMaxX(this.prevMaxX);
                    return;
                }
            }
            if (i2 != 4) {
                throw new UnsupportedOperationException("Domain Origin Boundary Mode not yet supported: " + this.domainOriginBoundaryMode);
            }
            Number number3 = this.prevMinX;
            if (number3 == null || d2 > number3.doubleValue()) {
                this.bounds.setMinX(Double.valueOf(d2));
            } else {
                this.bounds.setMinX(this.prevMinX);
            }
            Number number4 = this.prevMaxX;
            if (number4 == null || d3 < number4.doubleValue()) {
                this.bounds.setMaxX(Double.valueOf(d3));
            } else {
                this.bounds.setMaxX(this.prevMaxX);
            }
        }
    }

    public void updateRangeMinMaxForOriginModel() {
        if (AnonymousClass1.$SwitchMap$com$androidplot$xy$BoundaryMode[this.rangeOriginBoundaryMode.ordinal()] != 2) {
            throw new UnsupportedOperationException("Range Origin Boundary Mode not yet supported: " + this.rangeOriginBoundaryMode);
        }
        double dDoubleValue = this.userRangeOrigin.doubleValue();
        double dDistance = distance(this.bounds.getMaxY().doubleValue(), dDoubleValue);
        double dDistance2 = distance(this.bounds.getMinY().doubleValue(), dDoubleValue);
        if (dDistance > dDistance2) {
            this.bounds.setMinY(Double.valueOf(dDoubleValue - dDistance));
            this.bounds.setMaxY(Double.valueOf(dDoubleValue + dDistance));
        } else {
            this.bounds.setMinY(Double.valueOf(dDoubleValue - dDistance2));
            this.bounds.setMaxY(Double.valueOf(dDoubleValue + dDistance2));
        }
    }

    public void centerOnDomainOrigin(Number number, Number number2, BoundaryMode boundaryMode) {
        if (number == null) {
            throw new IllegalArgumentException("Origin param cannot be null.");
        }
        this.constraints.setDomainFramingModel(XYFramingModel.ORIGIN);
        setUserDomainOrigin(number);
        this.domainOriginExtent = number2;
        this.domainOriginBoundaryMode = boundaryMode;
        Number[] originMinMax = getOriginMinMax(boundaryMode, this.userDomainOrigin, number2);
        this.constraints.setMinX(originMinMax[0]);
        this.constraints.setMaxX(originMinMax[1]);
    }

    public void centerOnRangeOrigin(Number number, Number number2, BoundaryMode boundaryMode) {
        if (number == null) {
            throw new IllegalArgumentException("Origin param cannot be null.");
        }
        this.constraints.setRangeFramingModel(XYFramingModel.ORIGIN);
        setUserRangeOrigin(number);
        this.rangeOriginExtent = number2;
        this.rangeOriginBoundaryMode = boundaryMode;
        Number[] originMinMax = getOriginMinMax(boundaryMode, this.userRangeOrigin, number2);
        this.constraints.setMinY(originMinMax[0]);
        this.constraints.setMaxY(originMinMax[1]);
    }

    public boolean containsPoint(PointF pointF) {
        return containsPoint(pointF.x, pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.Plot
    public XYSeriesRegistry getRegistryInstance() {
        return new XYSeriesRegistry();
    }

    @Deprecated
    public Number getXVal(PointF pointF) {
        return getGraph().screenToSeriesX(pointF);
    }

    @Deprecated
    public Number getYVal(PointF pointF) {
        return getGraph().screenToSeriesY(pointF);
    }

    public void setCursorPosition(float f2, float f3) {
        getGraph().setCursorPosition(Float.valueOf(f2), Float.valueOf(f3));
    }

    public boolean addMarker(XValueMarker xValueMarker) {
        return !this.xValueMarkers.contains(xValueMarker) && this.xValueMarkers.add(xValueMarker);
    }

    public XValueMarker removeMarker(XValueMarker xValueMarker) {
        int iIndexOf = this.xValueMarkers.indexOf(xValueMarker);
        if (iIndexOf == -1) {
            return null;
        }
        return this.xValueMarkers.remove(iIndexOf);
    }

    public synchronized void setDomainBoundaries(Number number, BoundaryMode boundaryMode, Number number2, BoundaryMode boundaryMode2) {
        setDomainLowerBoundary(number, boundaryMode);
        setDomainUpperBoundary(number2, boundaryMode2);
    }

    public synchronized void setRangeBoundaries(Number number, BoundaryMode boundaryMode, Number number2, BoundaryMode boundaryMode2) {
        setRangeLowerBoundary(number, boundaryMode);
        setRangeUpperBoundary(number2, boundaryMode2);
    }

    public XYPlot(Context context, String str, Plot.RenderMode renderMode) {
        super(context, str, renderMode);
        this.constraints = new XYConstraints();
        this.bounds = RectRegion.withDefaults(new RectRegion(-1, 1, -1, 1));
        this.innerLimits = new RectRegion();
        this.outerLimits = new RectRegion();
        this.calculatedOrigin = new XYCoords();
        this.domainOriginExtent = null;
        this.rangeOriginExtent = null;
    }

    public XYPlot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.constraints = new XYConstraints();
        this.bounds = RectRegion.withDefaults(new RectRegion(-1, 1, -1, 1));
        this.innerLimits = new RectRegion();
        this.outerLimits = new RectRegion();
        this.calculatedOrigin = new XYCoords();
        this.domainOriginExtent = null;
        this.rangeOriginExtent = null;
    }

    public XYPlot(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.constraints = new XYConstraints();
        this.bounds = RectRegion.withDefaults(new RectRegion(-1, 1, -1, 1));
        this.innerLimits = new RectRegion();
        this.outerLimits = new RectRegion();
        this.calculatedOrigin = new XYCoords();
        this.domainOriginExtent = null;
        this.rangeOriginExtent = null;
    }
}