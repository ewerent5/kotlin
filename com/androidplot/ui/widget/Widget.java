package com.androidplot.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.BoxModel;
import com.androidplot.ui.BoxModelable;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.PositionMetrics;
import com.androidplot.ui.Resizable;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMetric;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.util.DisplayDimensions;
import com.androidplot.util.PixelUtils;

/* loaded from: classes.dex */
public abstract class Widget implements BoxModelable, Resizable {
    private Paint backgroundPaint;
    private Paint borderPaint;
    private BoxModel boxModel;
    private boolean clippingEnabled;
    private boolean isVisible;
    private RectF lastWidgetRect;
    private LayoutManager layoutManager;
    private DisplayDimensions plotDimensions;
    private PositionMetrics positionMetrics;
    private Rotation rotation;
    private Size size;
    private DisplayDimensions widgetDimensions;

    /* renamed from: com.androidplot.ui.widget.Widget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$Anchor;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$widget$Widget$Rotation;

        static {
            int[] iArr = new int[Rotation.values().length];
            $SwitchMap$com$androidplot$ui$widget$Widget$Rotation = iArr;
            try {
                iArr[Rotation.NINETY_DEGREES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$widget$Widget$Rotation[Rotation.NEGATIVE_NINETY_DEGREES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$widget$Widget$Rotation[Rotation.ONE_HUNDRED_EIGHTY_DEGREES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$widget$Widget$Rotation[Rotation.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Anchor.values().length];
            $SwitchMap$com$androidplot$ui$Anchor = iArr2;
            try {
                iArr2[Anchor.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.LEFT_MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.LEFT_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.RIGHT_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.RIGHT_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.RIGHT_MIDDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.TOP_MIDDLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.BOTTOM_MIDDLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$androidplot$ui$Anchor[Anchor.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum Rotation {
        NINETY_DEGREES,
        NEGATIVE_NINETY_DEGREES,
        ONE_HUNDRED_EIGHTY_DEGREES,
        NONE
    }

    public Widget(LayoutManager layoutManager, SizeMetric sizeMetric, SizeMetric sizeMetric2) {
        this(layoutManager, new Size(sizeMetric, sizeMetric2));
    }

    public static PointF calculateCoordinates(float f2, float f3, RectF rectF, PositionMetrics positionMetrics) {
        return PixelUtils.sub(new PointF(positionMetrics.getXPositionMetric().getPixelValue(rectF.width()) + rectF.left, positionMetrics.getYPositionMetric().getPixelValue(rectF.height()) + rectF.top), getAnchorOffset(f3, f2, positionMetrics.getAnchor()));
    }

    private void checkSize(RectF rectF) {
        RectF rectF2 = this.lastWidgetRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            onResize(this.lastWidgetRect, rectF);
        }
        this.lastWidgetRect = rectF;
    }

    public static PointF getAnchorCoordinates(RectF rectF, Anchor anchor) {
        return PixelUtils.add(new PointF(rectF.left, rectF.top), getAnchorOffset(rectF.width(), rectF.height(), anchor));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PointF getAnchorOffset(float f2, float f3, Anchor anchor) {
        PointF pointF = new PointF();
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$Anchor[anchor.ordinal()]) {
            case 1:
                return pointF;
            case 2:
                pointF.set(0.0f, f3 / 2.0f);
                return pointF;
            case 3:
                pointF.set(0.0f, f3);
                return pointF;
            case 4:
                pointF.set(f2, 0.0f);
                return pointF;
            case 5:
                pointF.set(f2, f3);
                return pointF;
            case 6:
                pointF.set(f2, f3 / 2.0f);
                return pointF;
            case 7:
                pointF.set(f2 / 2.0f, 0.0f);
                return pointF;
            case 8:
                pointF.set(f2 / 2.0f, f3);
                return pointF;
            case 9:
                pointF.set(f2 / 2.0f, f3 / 2.0f);
                return pointF;
            default:
                throw new IllegalArgumentException("Unsupported anchor location: " + anchor);
        }
    }

    protected RectF applyRotation(Canvas canvas, RectF rectF) {
        float f2;
        float fCenterX = this.widgetDimensions.paddedRect.centerX();
        float fCenterY = this.widgetDimensions.paddedRect.centerY();
        float fHeight = this.widgetDimensions.paddedRect.height() / 2.0f;
        float fWidth = this.widgetDimensions.paddedRect.width() / 2.0f;
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$widget$Widget$Rotation[this.rotation.ordinal()];
        if (i2 == 1) {
            rectF = new RectF(fCenterX - fHeight, fCenterY - fWidth, fHeight + fCenterX, fWidth + fCenterY);
            f2 = 90.0f;
        } else if (i2 == 2) {
            rectF = new RectF(fCenterX - fHeight, fCenterY - fWidth, fHeight + fCenterX, fWidth + fCenterY);
            f2 = -90.0f;
        } else if (i2 == 3) {
            f2 = 180.0f;
        } else {
            if (i2 != 4) {
                throw new UnsupportedOperationException("Not yet implemented.");
            }
            f2 = 0.0f;
        }
        if (this.rotation != Rotation.NONE) {
            canvas.rotate(f2, fCenterX, fCenterY);
        }
        return rectF;
    }

    public boolean containsPoint(PointF pointF) {
        return this.widgetDimensions.canvasRect.contains(pointF.x, pointF.y);
    }

    protected abstract void doOnDraw(Canvas canvas, RectF rectF);

    public void draw(Canvas canvas) {
        if (isVisible()) {
            if (this.backgroundPaint != null) {
                drawBackground(canvas, this.widgetDimensions.canvasRect);
            }
            canvas.save();
            RectF rectFApplyRotation = applyRotation(canvas, this.widgetDimensions.paddedRect);
            checkSize(rectFApplyRotation);
            doOnDraw(canvas, rectFApplyRotation);
            canvas.restore();
            if (this.borderPaint != null) {
                drawBorder(canvas, rectFApplyRotation);
            }
        }
    }

    protected void drawBackground(Canvas canvas, RectF rectF) {
        canvas.drawRect(rectF, this.backgroundPaint);
    }

    protected void drawBorder(Canvas canvas, RectF rectF) {
        canvas.drawRect(rectF, this.borderPaint);
    }

    public Anchor getAnchor() {
        return getPositionMetrics().getAnchor();
    }

    public Paint getBackgroundPaint() {
        return this.backgroundPaint;
    }

    public Paint getBorderPaint() {
        return this.borderPaint;
    }

    public SizeMetric getHeightMetric() {
        return this.size.getHeight();
    }

    public float getHeightPix(float f2) {
        return this.size.getHeight().getPixelValue(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginBottom() {
        return this.boxModel.getMarginBottom();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginLeft() {
        return this.boxModel.getMarginLeft();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginRight() {
        return this.boxModel.getMarginRight();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getMarginTop() {
        return this.boxModel.getMarginTop();
    }

    @Override // com.androidplot.ui.BoxModelable
    public RectF getMarginatedRect(RectF rectF) {
        return this.boxModel.getMarginatedRect(rectF);
    }

    @Override // com.androidplot.ui.BoxModelable
    public RectF getPaddedRect(RectF rectF) {
        return this.boxModel.getPaddedRect(rectF);
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingBottom() {
        return this.boxModel.getPaddingBottom();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingLeft() {
        return this.boxModel.getPaddingLeft();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingRight() {
        return this.boxModel.getPaddingRight();
    }

    @Override // com.androidplot.ui.BoxModelable
    public float getPaddingTop() {
        return this.boxModel.getPaddingTop();
    }

    public PositionMetrics getPositionMetrics() {
        return this.positionMetrics;
    }

    public Rotation getRotation() {
        return this.rotation;
    }

    public Size getSize() {
        return this.size;
    }

    public DisplayDimensions getWidgetDimensions() {
        return this.widgetDimensions;
    }

    public SizeMetric getWidthMetric() {
        return this.size.getWidth();
    }

    public float getWidthPix(float f2) {
        return this.size.getWidth().getPixelValue(f2);
    }

    public boolean isClippingEnabled() {
        return this.clippingEnabled;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    @Override // com.androidplot.ui.Resizable
    public synchronized void layout(DisplayDimensions displayDimensions) {
        this.plotDimensions = displayDimensions;
        refreshLayout();
    }

    protected void onMetricsChanged(Size size, Size size2) {
    }

    public void onPostInit() {
    }

    protected void onResize(RectF rectF, RectF rectF2) {
    }

    public void position(float f2, HorizontalPositioning horizontalPositioning, float f3, VerticalPositioning verticalPositioning) {
        position(f2, horizontalPositioning, f3, verticalPositioning, Anchor.LEFT_TOP);
    }

    public synchronized void refreshLayout() {
        if (this.positionMetrics == null) {
            return;
        }
        float widthPix = getWidthPix(this.plotDimensions.paddedRect.width());
        float heightPix = getHeightPix(this.plotDimensions.paddedRect.height());
        PointF pointFCalculateCoordinates = calculateCoordinates(heightPix, widthPix, this.plotDimensions.paddedRect, this.positionMetrics);
        float f2 = pointFCalculateCoordinates.x;
        float f3 = pointFCalculateCoordinates.y;
        RectF rectF = new RectF(f2, f3, widthPix + f2, heightPix + f3);
        RectF marginatedRect = getMarginatedRect(rectF);
        this.widgetDimensions = new DisplayDimensions(rectF, marginatedRect, getPaddedRect(marginatedRect));
    }

    public void setAnchor(Anchor anchor) {
        getPositionMetrics().setAnchor(anchor);
    }

    public void setBackgroundPaint(Paint paint) {
        this.backgroundPaint = paint;
    }

    public void setBorderPaint(Paint paint) {
        this.borderPaint = paint;
    }

    public void setClippingEnabled(boolean z) {
        this.clippingEnabled = z;
    }

    public void setHeight(float f2) {
        this.size.getHeight().setValue(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginBottom(float f2) {
        this.boxModel.setMarginBottom(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginLeft(float f2) {
        this.boxModel.setMarginLeft(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginRight(float f2) {
        this.boxModel.setMarginRight(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMarginTop(float f2) {
        this.boxModel.setMarginTop(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setMargins(float f2, float f3, float f4, float f5) {
        this.boxModel.setMargins(f2, f3, f4, f5);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPadding(float f2, float f3, float f4, float f5) {
        this.boxModel.setPadding(f2, f3, f4, f5);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingBottom(float f2) {
        this.boxModel.setPaddingBottom(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingLeft(float f2) {
        this.boxModel.setPaddingLeft(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingRight(float f2) {
        this.boxModel.setPaddingRight(f2);
    }

    @Override // com.androidplot.ui.BoxModelable
    public void setPaddingTop(float f2) {
        this.boxModel.setPaddingTop(f2);
    }

    public void setPositionMetrics(PositionMetrics positionMetrics) {
        this.positionMetrics = positionMetrics;
    }

    public void setRotation(Rotation rotation) {
        this.rotation = rotation;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public void setWidth(float f2) {
        this.size.getWidth().setValue(f2);
    }

    public Widget(LayoutManager layoutManager, Size size) {
        this.clippingEnabled = false;
        this.boxModel = new BoxModel();
        this.plotDimensions = new DisplayDimensions();
        this.widgetDimensions = new DisplayDimensions();
        this.isVisible = true;
        this.rotation = Rotation.NONE;
        this.lastWidgetRect = null;
        this.layoutManager = layoutManager;
        Size size2 = this.size;
        setSize(size);
        onMetricsChanged(size2, size);
    }

    public void position(float f2, HorizontalPositioning horizontalPositioning, float f3, VerticalPositioning verticalPositioning, Anchor anchor) {
        setPositionMetrics(new PositionMetrics(f2, horizontalPositioning, f3, verticalPositioning, anchor));
        this.layoutManager.addToTop(this);
    }

    public void setHeight(float f2, SizeMode sizeMode) {
        this.size.getHeight().set(f2, sizeMode);
    }

    public void setWidth(float f2, SizeMode sizeMode) {
        this.size.getWidth().set(f2, sizeMode);
    }

    public static PointF getAnchorCoordinates(float f2, float f3, float f4, float f5, Anchor anchor) {
        return getAnchorCoordinates(new RectF(f2, f3, f4 + f2, f5 + f3), anchor);
    }
}