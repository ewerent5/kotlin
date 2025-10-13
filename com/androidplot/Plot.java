package com.androidplot;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.androidplot.R;
import com.androidplot.Series;
import com.androidplot.SeriesRegistry;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.BoxModel;
import com.androidplot.ui.Formatter;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Resizable;
import com.androidplot.ui.SeriesBundle;
import com.androidplot.ui.SeriesRenderer;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.TextOrientation;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.ui.widget.TextLabelWidget;
import com.androidplot.util.AttrUtils;
import com.androidplot.util.DisplayDimensions;
import com.androidplot.util.PixelUtils;
import e.d.a.a;
import e.d.a.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Plot<SeriesType extends Series, FormatterType extends Formatter, RendererType extends SeriesRenderer, BundleType extends SeriesBundle<SeriesType, FormatterType>, RegistryType extends SeriesRegistry<BundleType, SeriesType, FormatterType>> extends View implements Resizable {
    private static final String BASE_PACKAGE = "com.androidplot.";
    private static final int DEFAULT_TITLE_WIDGET_TEXT_SIZE_SP = 10;
    private static final String TAG = Plot.class.getName();
    private static final String XML_ATTR_PREFIX = "androidplot";
    private Paint backgroundPaint;
    private Paint borderPaint;
    private float borderRadiusX;
    private float borderRadiusY;
    private BorderStyle borderStyle;
    private BoxModel boxModel;
    private DisplayDimensions displayDims;
    private boolean isIdle;
    private boolean keepRunning;
    private LayoutManager layoutManager;
    private final ArrayList<PlotListener> listeners;
    private final BufferedCanvas pingPong;
    private RegistryType registry;
    private RenderMode renderMode;
    private final Object renderSync;
    private Thread renderThread;
    private HashMap<Class<? extends RendererType>, RendererType> renderers;
    private TextLabelWidget title;

    /* renamed from: com.androidplot.Plot$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$Plot$BorderStyle;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            $SwitchMap$com$androidplot$Plot$BorderStyle = iArr;
            try {
                iArr[BorderStyle.ROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$Plot$BorderStyle[BorderStyle.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum BorderStyle {
        ROUNDED,
        SQUARE,
        NONE
    }

    private static class BufferedCanvas {
        private volatile Bitmap bgBuffer;
        private Canvas canvas;
        private volatile Bitmap fgBuffer;

        private BufferedCanvas() {
            this.canvas = new Canvas();
        }

        public Bitmap getBitmap() {
            return this.fgBuffer;
        }

        public synchronized Canvas getCanvas() {
            if (this.bgBuffer == null) {
                return null;
            }
            this.canvas.setBitmap(this.bgBuffer);
            return this.canvas;
        }

        public void recycle() {
            if (this.bgBuffer != null) {
                this.bgBuffer.recycle();
                this.bgBuffer = null;
            }
            if (this.fgBuffer != null) {
                this.fgBuffer.recycle();
                this.fgBuffer = null;
            }
            System.gc();
        }

        public synchronized void resize(int i2, int i3) {
            if (i3 <= 0 || i2 <= 0) {
                this.bgBuffer = null;
                this.fgBuffer = null;
            } else {
                try {
                    this.bgBuffer = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                    this.fgBuffer = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                } catch (IllegalArgumentException unused) {
                    throw new IllegalArgumentException("Illegal argument passed to Bitmap.createBitmap.  width: " + i3 + " height: " + i2);
                }
            }
        }

        public synchronized void swap() {
            Bitmap bitmap = this.bgBuffer;
            this.bgBuffer = this.fgBuffer;
            this.fgBuffer = bitmap;
        }
    }

    public enum RenderMode {
        USE_BACKGROUND_THREAD,
        USE_MAIN_THREAD
    }

    public Plot(Context context, String str) {
        this(context, str, RenderMode.USE_MAIN_THREAD);
    }

    private void loadAttrs(AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        Field field;
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null) {
            String strReplace = getClass().getName().substring(16).replace(CoreConstants.DOT, '_');
            try {
                field = R.styleable.class.getField(strReplace);
            } catch (NoSuchFieldException unused) {
                Log.d(TAG, "Styleable definition not found for: " + strReplace);
                field = null;
            }
            if (field != null) {
                try {
                    typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, (int[]) field.get(null), i2, 0);
                    if (typedArrayObtainStyledAttributes != null) {
                        processAttrs(typedArrayObtainStyledAttributes);
                        typedArrayObtainStyledAttributes.recycle();
                    }
                } catch (IllegalAccessException unused2) {
                }
            } else {
                typedArrayObtainStyledAttributes = null;
            }
            try {
                try {
                    Field field2 = R.styleable.class.getField(Plot.class.getSimpleName());
                    if (field2 != null) {
                        typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, (int[]) field2.get(null), i2, 0);
                    }
                } catch (IllegalAccessException unused3) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                } catch (NoSuchFieldException unused4) {
                    Log.d(TAG, "Styleable definition not found for: " + Plot.class.getSimpleName());
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                }
                if (typedArrayObtainStyledAttributes != null) {
                    processBaseAttrs(typedArrayObtainStyledAttributes);
                    typedArrayObtainStyledAttributes.recycle();
                }
                HashMap map = new HashMap();
                for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                    String attributeName = attributeSet.getAttributeName(i3);
                    if (attributeName != null && attributeName.toUpperCase().startsWith(XML_ATTR_PREFIX.toUpperCase())) {
                        map.put(attributeName.substring(12), attributeSet.getAttributeValue(i3));
                    }
                }
                try {
                    a.c(getContext(), this, map);
                } catch (b e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                if (typedArrayObtainStyledAttributes != null) {
                    processBaseAttrs(typedArrayObtainStyledAttributes);
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th;
            }
        }
    }

    private void processBaseAttrs(TypedArray typedArray) {
        setMarkupEnabled(typedArray.getBoolean(R.styleable.Plot_markupEnabled, false));
        RenderMode renderMode = RenderMode.values()[typedArray.getInt(R.styleable.Plot_renderMode, getRenderMode().ordinal())];
        if (renderMode != getRenderMode()) {
            setRenderMode(renderMode);
        }
        AttrUtils.configureBoxModelable(typedArray, this.boxModel, R.styleable.Plot_marginTop, R.styleable.Plot_marginBottom, R.styleable.Plot_marginLeft, R.styleable.Plot_marginRight, R.styleable.Plot_paddingTop, R.styleable.Plot_paddingBottom, R.styleable.Plot_paddingLeft, R.styleable.Plot_paddingRight);
        getTitle().setText(typedArray.getString(R.styleable.Plot_title));
        getTitle().getLabelPaint().setTextSize(typedArray.getDimension(R.styleable.Plot_titleTextSize, PixelUtils.spToPix(10.0f)));
        getTitle().getLabelPaint().setColor(typedArray.getColor(R.styleable.Plot_titleTextColor, getTitle().getLabelPaint().getColor()));
        getBackgroundPaint().setColor(typedArray.getColor(R.styleable.Plot_backgroundColor, getBackgroundPaint().getColor()));
        AttrUtils.configureLinePaint(typedArray, getBorderPaint(), R.styleable.Plot_borderColor, R.styleable.Plot_borderThickness);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean addListener(com.androidplot.PlotListener r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.ArrayList<com.androidplot.PlotListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L13
            java.util.ArrayList<com.androidplot.PlotListener> r0 = r1.listeners     // Catch: java.lang.Throwable -> L16
            boolean r2 = r0.add(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.Plot.addListener(com.androidplot.PlotListener):boolean");
    }

    public synchronized boolean addSeries(FormatterType formattertype, SeriesType... seriestypeArr) {
        for (SeriesType seriestype : seriestypeArr) {
            if (!addSeries((Plot<SeriesType, FormatterType, RendererType, BundleType, RegistryType>) seriestype, (SeriesType) formattertype)) {
                return false;
            }
        }
        return true;
    }

    protected void attachSeries(SeriesType seriestype, FormatterType formattertype) {
        Class<? extends SeriesRenderer> rendererClass = formattertype.getRendererClass();
        if (!getRenderers().containsKey(rendererClass)) {
            getRenderers().put(rendererClass, formattertype.getRendererInstance(this));
        }
        if (seriestype instanceof PlotListener) {
            addListener((PlotListener) seriestype);
        }
    }

    public void clear() {
        for (SeriesType seriestype : getRegistry().getSeriesList()) {
            if (seriestype instanceof PlotListener) {
                removeListener((PlotListener) seriestype);
            }
        }
        getRegistry().clear();
    }

    protected void drawBackground(Canvas canvas, RectF rectF) {
        drawRect(canvas, rectF, this.backgroundPaint);
    }

    protected void drawBorder(Canvas canvas, RectF rectF) {
        drawRect(canvas, rectF, this.borderPaint);
    }

    protected void drawRect(Canvas canvas, RectF rectF, Paint paint) {
        if (AnonymousClass2.$SwitchMap$com$androidplot$Plot$BorderStyle[this.borderStyle.ordinal()] != 1) {
            canvas.drawRect(rectF, paint);
        } else {
            canvas.drawRoundRect(rectF, this.borderRadiusX, this.borderRadiusY, paint);
        }
    }

    public Paint getBackgroundPaint() {
        return this.backgroundPaint;
    }

    public Paint getBorderPaint() {
        return this.borderPaint;
    }

    public DisplayDimensions getDisplayDimensions() {
        return this.displayDims;
    }

    public FormatterType getFormatter(SeriesType seriestype, Class<? extends RendererType> cls) {
        return (FormatterType) getSeries(seriestype, cls).getFormatter();
    }

    public LayoutManager getLayoutManager() {
        return this.layoutManager;
    }

    protected ArrayList<PlotListener> getListeners() {
        return this.listeners;
    }

    public float getPlotMarginBottom() {
        return this.boxModel.getMarginBottom();
    }

    public float getPlotMarginLeft() {
        return this.boxModel.getMarginLeft();
    }

    public float getPlotMarginRight() {
        return this.boxModel.getMarginRight();
    }

    public float getPlotMarginTop() {
        return this.boxModel.getMarginTop();
    }

    public float getPlotPaddingBottom() {
        return this.boxModel.getPaddingBottom();
    }

    public float getPlotPaddingLeft() {
        return this.boxModel.getPaddingLeft();
    }

    public float getPlotPaddingRight() {
        return this.boxModel.getPaddingRight();
    }

    public float getPlotPaddingTop() {
        return this.boxModel.getPaddingTop();
    }

    public RegistryType getRegistry() {
        return this.registry;
    }

    protected abstract RegistryType getRegistryInstance();

    public RenderMode getRenderMode() {
        return this.renderMode;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:TRendererType;>(Ljava/lang/Class<TT;>;)TT; */
    public SeriesRenderer getRenderer(Class cls) {
        return getRenderers().get(cls);
    }

    public List<RendererType> getRendererList() {
        return new ArrayList(getRenderers().values());
    }

    public HashMap<Class<? extends RendererType>, RendererType> getRenderers() {
        return this.renderers;
    }

    protected SeriesBundle<SeriesType, FormatterType> getSeries(SeriesType seriestype, Class<? extends RendererType> cls) {
        for (SeriesBundle<SeriesType, FormatterType> seriesBundle : getSeries(seriestype)) {
            if (seriesBundle.getFormatter().getRendererClass() == cls) {
                return seriesBundle;
            }
        }
        return null;
    }

    public TextLabelWidget getTitle() {
        return this.title;
    }

    protected final void init(Context context, AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        PixelUtils.init(context);
        LayoutManager layoutManager = new LayoutManager();
        this.layoutManager = layoutManager;
        SizeMode sizeMode = SizeMode.ABSOLUTE;
        TextLabelWidget textLabelWidget = new TextLabelWidget(layoutManager, new Size(25.0f, sizeMode, 100.0f, sizeMode), TextOrientation.HORIZONTAL);
        this.title = textLabelWidget;
        textLabelWidget.position(0.0f, HorizontalPositioning.RELATIVE_TO_CENTER, 0.0f, VerticalPositioning.ABSOLUTE_FROM_TOP, Anchor.TOP_MIDDLE);
        this.title.getLabelPaint().setTextSize(PixelUtils.spToPix(10.0f));
        onPreInit();
        this.layoutManager.moveToTop(this.title);
        if (context != null && attributeSet != null) {
            loadAttrs(attributeSet, i2);
        }
        onAfterConfig();
        this.layoutManager.onPostInit();
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            this.renderThread = new Thread(new Runnable() { // from class: com.androidplot.Plot.1
                @Override // java.lang.Runnable
                public void run() {
                    Plot.this.keepRunning = true;
                    while (Plot.this.keepRunning) {
                        Plot.this.isIdle = false;
                        synchronized (Plot.this.pingPong) {
                            Plot.this.renderOnCanvas(Plot.this.pingPong.getCanvas());
                            Plot.this.pingPong.swap();
                        }
                        synchronized (Plot.this.renderSync) {
                            Plot.this.postInvalidate();
                            if (Plot.this.keepRunning) {
                                try {
                                    Plot.this.renderSync.wait();
                                } catch (InterruptedException unused) {
                                    Plot.this.keepRunning = false;
                                }
                            }
                        }
                    }
                    Plot.this.pingPong.recycle();
                }
            }, "Androidplot renderThread");
        }
    }

    public boolean isEmpty() {
        return getRegistry().isEmpty();
    }

    protected boolean isHwAccelerationSupported() {
        return false;
    }

    @Override // com.androidplot.ui.Resizable
    public synchronized void layout(DisplayDimensions displayDimensions) {
        this.displayDims = displayDimensions;
        this.layoutManager.layout(displayDimensions);
    }

    protected void notifyListenersAfterDraw(Canvas canvas) {
        Iterator<PlotListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onAfterDraw(this, canvas);
        }
    }

    protected void notifyListenersBeforeDraw(Canvas canvas) {
        Iterator<PlotListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDraw(this, canvas);
        }
    }

    protected void onAfterConfig() {
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        synchronized (this.renderSync) {
            this.keepRunning = false;
            this.renderSync.notify();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RenderMode renderMode = this.renderMode;
        if (renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            synchronized (this.pingPong) {
                Bitmap bitmap = this.pingPong.getBitmap();
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            }
            return;
        }
        if (renderMode == RenderMode.USE_MAIN_THREAD) {
            renderOnCanvas(canvas);
            return;
        }
        throw new IllegalArgumentException("Unsupported Render Mode: " + this.renderMode);
    }

    protected void onPreInit() {
    }

    @Override // android.view.View
    protected synchronized void onSizeChanged(int i2, int i3, int i4, int i5) {
        PixelUtils.init(getContext());
        if (Build.VERSION.SDK_INT >= 11 && !isHwAccelerationSupported() && isHardwareAccelerated()) {
            setLayerType(1, null);
        }
        if (this.renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            this.pingPong.resize(i3, i2);
        }
        RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
        RectF marginatedRect = this.boxModel.getMarginatedRect(rectF);
        layout(new DisplayDimensions(rectF, marginatedRect, this.boxModel.getPaddedRect(marginatedRect)));
        super.onSizeChanged(i2, i3, i4, i5);
        Thread thread = this.renderThread;
        if (thread != null && !thread.isAlive()) {
            this.renderThread.start();
        }
    }

    protected abstract void processAttrs(TypedArray typedArray);

    public void redraw() {
        RenderMode renderMode = this.renderMode;
        if (renderMode == RenderMode.USE_BACKGROUND_THREAD) {
            if (this.isIdle) {
                synchronized (this.renderSync) {
                    this.renderSync.notify();
                }
                return;
            }
            return;
        }
        if (renderMode != RenderMode.USE_MAIN_THREAD) {
            throw new IllegalArgumentException("Unsupported Render Mode: " + this.renderMode);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    public synchronized boolean removeListener(PlotListener plotListener) {
        return this.listeners.remove(plotListener);
    }

    public synchronized boolean removeSeries(SeriesType seriestype, Class<? extends RendererType> cls) {
        if (getRegistry().remove(seriestype, cls).size() != 1 || !(seriestype instanceof PlotListener)) {
            return false;
        }
        removeListener((PlotListener) seriestype);
        return true;
    }

    protected synchronized void renderOnCanvas(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        notifyListenersBeforeDraw(canvas);
        try {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.backgroundPaint != null) {
                drawBackground(canvas, this.displayDims.marginatedRect);
            }
            this.layoutManager.draw(canvas);
        } catch (Exception e2) {
            Log.e(TAG, "Exception while rendering Plot.", e2);
        }
        if (getBorderPaint() == null) {
            this.isIdle = true;
            notifyListenersAfterDraw(canvas);
            return;
        } else {
            drawBorder(canvas, this.displayDims.marginatedRect);
            this.isIdle = true;
            notifyListenersAfterDraw(canvas);
            return;
        }
    }

    public void setBackgroundPaint(Paint paint) {
        this.backgroundPaint = paint;
    }

    public void setBorderPaint(Paint paint) {
        if (paint == null) {
            this.borderPaint = null;
            return;
        }
        Paint paint2 = new Paint(paint);
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    public void setBorderStyle(BorderStyle borderStyle, Float f2, Float f3) {
        if (borderStyle == BorderStyle.ROUNDED) {
            if (f2 == null || f3 == null) {
                throw new IllegalArgumentException("radiusX and radiusY cannot be null when using BorderStyle.ROUNDED");
            }
            this.borderRadiusX = f2.floatValue();
            this.borderRadiusY = f3.floatValue();
        }
        this.borderStyle = borderStyle;
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public void setMarkupEnabled(boolean z) {
        this.layoutManager.setMarkupEnabled(z);
    }

    public void setPlotMarginBottom(float f2) {
        this.boxModel.setMarginBottom(f2);
    }

    public void setPlotMarginLeft(float f2) {
        this.boxModel.setMarginLeft(f2);
    }

    public void setPlotMarginRight(float f2) {
        this.boxModel.setMarginRight(f2);
    }

    public void setPlotMarginTop(float f2) {
        this.boxModel.setMarginTop(f2);
    }

    public void setPlotMargins(float f2, float f3, float f4, float f5) {
        setPlotMarginLeft(f2);
        setPlotMarginTop(f3);
        setPlotMarginRight(f4);
        setPlotMarginBottom(f5);
    }

    public void setPlotPadding(float f2, float f3, float f4, float f5) {
        setPlotPaddingLeft(f2);
        setPlotPaddingTop(f3);
        setPlotPaddingRight(f4);
        setPlotPaddingBottom(f5);
    }

    public void setPlotPaddingBottom(float f2) {
        this.boxModel.setPaddingBottom(f2);
    }

    public void setPlotPaddingLeft(float f2) {
        this.boxModel.setPaddingLeft(f2);
    }

    public void setPlotPaddingRight(float f2) {
        this.boxModel.setPaddingRight(f2);
    }

    public void setPlotPaddingTop(float f2) {
        this.boxModel.setPaddingTop(f2);
    }

    public void setRegistry(RegistryType registrytype) {
        this.registry = registrytype;
        for (BundleType bundletype : registrytype.getSeriesAndFormatterList()) {
            attachSeries(bundletype.getSeries(), bundletype.getFormatter());
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
    }

    public void setTitle(TextLabelWidget textLabelWidget) {
        this.title = textLabelWidget;
    }

    public Plot(Context context, String str, RenderMode renderMode) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        super(context);
        this.boxModel = new BoxModel();
        this.borderStyle = BorderStyle.NONE;
        this.borderRadiusX = 15.0f;
        this.borderRadiusY = 15.0f;
        this.displayDims = new DisplayDimensions();
        this.renderMode = RenderMode.USE_MAIN_THREAD;
        this.pingPong = new BufferedCanvas();
        this.renderSync = new Object();
        this.keepRunning = false;
        this.isIdle = true;
        this.listeners = new ArrayList<>();
        this.registry = (RegistryType) getRegistryInstance();
        this.renderers = new HashMap<>();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.rgb(150, 150, 150));
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.backgroundPaint = paint2;
        paint2.setColor(-12303292);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        this.renderMode = renderMode;
        init(context, null, 0);
        getTitle().setText(str);
    }

    public void setTitle(String str) {
        getTitle().setText(str);
    }

    protected List<SeriesBundle<SeriesType, FormatterType>> getSeries(SeriesType seriestype) {
        return getRegistry().get(seriestype);
    }

    public synchronized boolean addSeries(SeriesType seriestype, FormatterType formattertype) {
        boolean zAdd;
        zAdd = getRegistry().add(seriestype, formattertype);
        attachSeries(seriestype, formattertype);
        return zAdd;
    }

    public synchronized void removeSeries(SeriesType seriestype) {
        if (seriestype instanceof PlotListener) {
            removeListener((PlotListener) seriestype);
        }
        getRegistry().remove(seriestype);
    }

    public Plot(Context context, AttributeSet attributeSet) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet);
        this.boxModel = new BoxModel();
        this.borderStyle = BorderStyle.NONE;
        this.borderRadiusX = 15.0f;
        this.borderRadiusY = 15.0f;
        this.displayDims = new DisplayDimensions();
        this.renderMode = RenderMode.USE_MAIN_THREAD;
        this.pingPong = new BufferedCanvas();
        this.renderSync = new Object();
        this.keepRunning = false;
        this.isIdle = true;
        this.listeners = new ArrayList<>();
        this.registry = (RegistryType) getRegistryInstance();
        this.renderers = new HashMap<>();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.rgb(150, 150, 150));
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.backgroundPaint = paint2;
        paint2.setColor(-12303292);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        init(context, attributeSet, 0);
    }

    public Plot(Context context, AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet, i2);
        this.boxModel = new BoxModel();
        this.borderStyle = BorderStyle.NONE;
        this.borderRadiusX = 15.0f;
        this.borderRadiusY = 15.0f;
        this.displayDims = new DisplayDimensions();
        this.renderMode = RenderMode.USE_MAIN_THREAD;
        this.pingPong = new BufferedCanvas();
        this.renderSync = new Object();
        this.keepRunning = false;
        this.isIdle = true;
        this.listeners = new ArrayList<>();
        this.registry = (RegistryType) getRegistryInstance();
        this.renderers = new HashMap<>();
        Paint paint = new Paint();
        this.borderPaint = paint;
        paint.setColor(Color.rgb(150, 150, 150));
        this.borderPaint.setStyle(Paint.Style.STROKE);
        this.borderPaint.setStrokeWidth(1.0f);
        this.borderPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.backgroundPaint = paint2;
        paint2.setColor(-12303292);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        init(context, attributeSet, i2);
    }
}