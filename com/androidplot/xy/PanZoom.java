package com.androidplot.xy;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.androidplot.Region;
import java.io.Serializable;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class PanZoom implements View.OnTouchListener {
    protected static final int FIRST_FINGER = 0;
    protected static final float MIN_DIST_2_FING = 5.0f;
    protected static final int SECOND_FINGER = 1;
    private View.OnTouchListener delegate;
    private DragState dragState;
    protected RectF fingersRect;
    private PointF firstFingerPos;
    private boolean isEnabled;
    private Pan pan;
    private XYPlot plot;
    private State state;
    private Zoom zoom;
    private ZoomLimit zoomLimit;

    /* renamed from: com.androidplot.xy.PanZoom$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$xy$PanZoom$Zoom;

        static {
            int[] iArr = new int[Zoom.values().length];
            $SwitchMap$com$androidplot$xy$PanZoom$Zoom = iArr;
            try {
                iArr[Zoom.STRETCH_HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$xy$PanZoom$Zoom[Zoom.STRETCH_VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$xy$PanZoom$Zoom[Zoom.STRETCH_BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$xy$PanZoom$Zoom[Zoom.SCALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected enum DragState {
        NONE,
        ONE_FINGER,
        TWO_FINGERS
    }

    public enum Pan {
        NONE,
        HORIZONTAL,
        VERTICAL,
        BOTH
    }

    public static class State implements Serializable {
        private BoundaryMode domainBoundaryMode;
        private Number domainLowerBoundary;
        private Number domainUpperBoundary;
        private BoundaryMode rangeBoundaryMode;
        private Number rangeLowerBoundary;
        private Number rangeUpperBoundary;

        public void apply(XYPlot xYPlot) {
            applyDomainBoundaries(xYPlot);
            applyRangeBoundaries(xYPlot);
        }

        public void applyDomainBoundaries(XYPlot xYPlot) {
            xYPlot.setDomainBoundaries(this.domainLowerBoundary, this.domainUpperBoundary, this.domainBoundaryMode);
        }

        public void applyRangeBoundaries(XYPlot xYPlot) {
            xYPlot.setRangeBoundaries(this.rangeLowerBoundary, this.rangeUpperBoundary, this.rangeBoundaryMode);
        }

        public void setDomainBoundaries(Number number, Number number2, BoundaryMode boundaryMode) {
            this.domainLowerBoundary = number;
            this.domainUpperBoundary = number2;
            this.domainBoundaryMode = boundaryMode;
        }

        public void setRangeBoundaries(Number number, Number number2, BoundaryMode boundaryMode) {
            this.rangeLowerBoundary = number;
            this.rangeUpperBoundary = number2;
            this.rangeBoundaryMode = boundaryMode;
        }
    }

    public enum Zoom {
        NONE,
        STRETCH_HORIZONTAL,
        STRETCH_VERTICAL,
        STRETCH_BOTH,
        SCALE
    }

    public enum ZoomLimit {
        OUTER,
        MIN_TICKS
    }

    protected PanZoom(XYPlot xYPlot, Pan pan, Zoom zoom) {
        this.isEnabled = true;
        this.dragState = DragState.NONE;
        this.state = new State();
        this.plot = xYPlot;
        this.pan = pan;
        this.zoom = zoom;
        this.zoomLimit = ZoomLimit.OUTER;
    }

    public static PanZoom attach(XYPlot xYPlot) {
        return attach(xYPlot, Pan.BOTH, Zoom.SCALE);
    }

    protected void adjustDomainBoundary(Number number, Number number2, BoundaryMode boundaryMode) {
        this.state.setDomainBoundaries(number, number2, boundaryMode);
        this.state.applyDomainBoundaries(this.plot);
    }

    protected void adjustRangeBoundary(Number number, Number number2, BoundaryMode boundaryMode) {
        this.state.setRangeBoundaries(number, number2, boundaryMode);
        this.state.applyRangeBoundaries(this.plot);
    }

    protected void calculatePan(PointF pointF, Region region, boolean z) {
        float f2;
        float fFloatValue;
        int height;
        if (z) {
            region.setMinMax(this.plot.getBounds().getxRegion());
            f2 = pointF.x - this.firstFingerPos.x;
            fFloatValue = region.getMax().floatValue() - region.getMin().floatValue();
            height = this.plot.getWidth();
        } else {
            region.setMinMax(this.plot.getBounds().getyRegion());
            f2 = -(pointF.y - this.firstFingerPos.y);
            fFloatValue = region.getMax().floatValue() - region.getMin().floatValue();
            height = this.plot.getHeight();
        }
        float f3 = f2 * (fFloatValue / height);
        region.setMin(Float.valueOf(region.getMin().floatValue() + f3));
        region.setMax(Float.valueOf(region.getMax().floatValue() + f3));
        float fFloatValue2 = region.length().floatValue();
        if (z && this.plot.getOuterLimits().getxRegion().isDefined()) {
            if (region.getMin().floatValue() < this.plot.getOuterLimits().getMinX().floatValue()) {
                region.setMin(this.plot.getOuterLimits().getMinX());
                region.setMax(Float.valueOf(region.getMin().floatValue() + fFloatValue2));
            }
            if (region.getMax().floatValue() > this.plot.getOuterLimits().getMaxX().floatValue()) {
                region.setMax(this.plot.getOuterLimits().getMaxX());
                region.setMin(Float.valueOf(region.getMax().floatValue() - fFloatValue2));
                return;
            }
            return;
        }
        if (this.plot.getOuterLimits().getyRegion().isDefined()) {
            if (region.getMin().floatValue() < this.plot.getOuterLimits().getMinY().floatValue()) {
                region.setMin(this.plot.getOuterLimits().getMinY());
                region.setMax(Float.valueOf(region.getMin().floatValue() + fFloatValue2));
            }
            if (region.getMax().floatValue() > this.plot.getOuterLimits().getMaxY().floatValue()) {
                region.setMax(this.plot.getOuterLimits().getMaxY());
                region.setMin(Float.valueOf(region.getMax().floatValue() - fFloatValue2));
            }
        }
    }

    protected void calculateZoom(RectF rectF, float f2, boolean z) {
        float fFloatValue;
        float fFloatValue2;
        RectRegion bounds = this.plot.getBounds();
        if (z) {
            fFloatValue = bounds.getMaxX().floatValue();
            fFloatValue2 = bounds.getMinX().floatValue();
        } else {
            fFloatValue = bounds.getMaxY().floatValue();
            fFloatValue2 = bounds.getMinY().floatValue();
        }
        float f3 = fFloatValue - fFloatValue2;
        float f4 = fFloatValue - (f3 / 2.0f);
        float f5 = f3 * f2;
        float rangeStepValue = f5 / 2.0f;
        RectRegion outerLimits = this.plot.getOuterLimits();
        if (z) {
            if (this.zoomLimit == ZoomLimit.MIN_TICKS && this.plot.getDomainStepValue() > f5) {
                rangeStepValue = (float) (this.plot.getDomainStepValue() / 2.0d);
            }
            rectF.left = f4 - rangeStepValue;
            rectF.right = f4 + rangeStepValue;
            if (outerLimits.isFullyDefined()) {
                if (rectF.left < outerLimits.getMinX().floatValue()) {
                    rectF.left = outerLimits.getMinX().floatValue();
                }
                if (rectF.right > outerLimits.getMaxX().floatValue()) {
                    rectF.right = outerLimits.getMaxX().floatValue();
                    return;
                }
                return;
            }
            return;
        }
        if (this.zoomLimit == ZoomLimit.MIN_TICKS && this.plot.getRangeStepValue() > f5) {
            rangeStepValue = (float) (this.plot.getRangeStepValue() / 2.0d);
        }
        rectF.top = f4 - rangeStepValue;
        rectF.bottom = f4 + rangeStepValue;
        if (outerLimits.isFullyDefined()) {
            if (rectF.top < outerLimits.getMinY().floatValue()) {
                rectF.top = outerLimits.getMinY().floatValue();
            }
            if (rectF.bottom > outerLimits.getMaxY().floatValue()) {
                rectF.bottom = outerLimits.getMaxY().floatValue();
            }
        }
    }

    protected RectF fingerDistance(float f2, float f3, float f4, float f5) {
        float f6 = f2 > f4 ? f4 : f2;
        if (f2 <= f4) {
            f2 = f4;
        }
        float f7 = f3 > f5 ? f5 : f3;
        if (f3 <= f5) {
            f3 = f5;
        }
        return new RectF(f6, f7, f2, f3);
    }

    public View.OnTouchListener getDelegate() {
        return this.delegate;
    }

    protected RectF getFingersRect() {
        return this.fingersRect;
    }

    public Pan getPan() {
        return this.pan;
    }

    public State getState() {
        return this.state;
    }

    public Zoom getZoom() {
        return this.zoom;
    }

    public ZoomLimit getZoomLimit() {
        return this.zoomLimit;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    protected boolean isValidScale(float f2) {
        if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
            double d2 = f2;
            if (d2 <= -0.001d || d2 >= 0.001d) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.delegate;
        boolean zOnTouch = onTouchListener != null ? onTouchListener.onTouch(view, motionEvent) : false;
        if (isEnabled() && !zOnTouch) {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.firstFingerPos = new PointF(motionEvent.getX(), motionEvent.getY());
                this.dragState = DragState.ONE_FINGER;
            } else if (action == 1) {
                reset();
            } else if (action == 2) {
                DragState dragState = this.dragState;
                if (dragState == DragState.ONE_FINGER) {
                    pan(motionEvent);
                } else if (dragState == DragState.TWO_FINGERS) {
                    zoom(motionEvent);
                }
            } else if (action == 5) {
                setFingersRect(fingerDistance(motionEvent));
                if (getFingersRect().width() > MIN_DIST_2_FING || getFingersRect().width() < -5.0f) {
                    this.dragState = DragState.TWO_FINGERS;
                }
            } else if (action == 6) {
                this.dragState = DragState.NONE;
            }
        }
        return true;
    }

    protected void pan(MotionEvent motionEvent) {
        if (this.pan == Pan.NONE) {
            return;
        }
        PointF pointF = this.firstFingerPos;
        this.firstFingerPos = new PointF(motionEvent.getX(), motionEvent.getY());
        Pan pan = Pan.HORIZONTAL;
        Pan pan2 = Pan.BOTH;
        if (EnumSet.of(pan, pan2).contains(this.pan)) {
            Region region = new Region();
            calculatePan(pointF, region, true);
            adjustDomainBoundary(region.getMin(), region.getMax(), BoundaryMode.FIXED);
        }
        if (EnumSet.of(Pan.VERTICAL, pan2).contains(this.pan)) {
            Region region2 = new Region();
            calculatePan(pointF, region2, false);
            adjustRangeBoundary(region2.getMin(), region2.getMax(), BoundaryMode.FIXED);
        }
        this.plot.redraw();
    }

    public void reset() {
        this.firstFingerPos = null;
        setFingersRect(null);
        setFingersRect(null);
    }

    public void setDelegate(View.OnTouchListener onTouchListener) {
        this.delegate = onTouchListener;
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    protected void setFingersRect(RectF rectF) {
        this.fingersRect = rectF;
    }

    public void setPan(Pan pan) {
        this.pan = pan;
    }

    public void setState(State state) {
        this.state = state;
        state.apply(this.plot);
    }

    public void setZoom(Zoom zoom) {
        this.zoom = zoom;
    }

    public void setZoomLimit(ZoomLimit zoomLimit) {
        this.zoomLimit = zoomLimit;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void zoom(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidplot.xy.PanZoom.zoom(android.view.MotionEvent):void");
    }

    public static PanZoom attach(XYPlot xYPlot, Pan pan, Zoom zoom) {
        return attach(xYPlot, pan, zoom, ZoomLimit.OUTER);
    }

    protected RectF fingerDistance(MotionEvent motionEvent) {
        return fingerDistance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
    }

    public static PanZoom attach(XYPlot xYPlot, Pan pan, Zoom zoom, ZoomLimit zoomLimit) {
        PanZoom panZoom = new PanZoom(xYPlot, pan, zoom, zoomLimit);
        xYPlot.setOnTouchListener(panZoom);
        return panZoom;
    }

    protected PanZoom(XYPlot xYPlot, Pan pan, Zoom zoom, ZoomLimit zoomLimit) {
        this.isEnabled = true;
        this.dragState = DragState.NONE;
        this.state = new State();
        this.plot = xYPlot;
        this.pan = pan;
        this.zoom = zoom;
        this.zoomLimit = zoomLimit;
    }
}