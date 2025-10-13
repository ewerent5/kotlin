package com.androidplot.ui;

/* loaded from: classes.dex */
public class PositionMetrics implements Comparable<PositionMetrics> {
    private Anchor anchor;
    private HorizontalPosition horizontalPosition;
    private float layerDepth;
    private VerticalPosition verticalPosition;

    public PositionMetrics(float f2, HorizontalPositioning horizontalPositioning, float f3, VerticalPositioning verticalPositioning, Anchor anchor) {
        setXPositionMetric(new HorizontalPosition(f2, horizontalPositioning));
        setYPositionMetric(new VerticalPosition(f3, verticalPositioning));
        setAnchor(anchor);
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public HorizontalPosition getXPositionMetric() {
        return this.horizontalPosition;
    }

    public VerticalPosition getYPositionMetric() {
        return this.verticalPosition;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setXPositionMetric(HorizontalPosition horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }

    public void setYPositionMetric(VerticalPosition verticalPosition) {
        this.verticalPosition = verticalPosition;
    }

    @Override // java.lang.Comparable
    public int compareTo(PositionMetrics positionMetrics) {
        float f2 = this.layerDepth;
        float f3 = positionMetrics.layerDepth;
        if (f2 < f3) {
            return -1;
        }
        return f2 == f3 ? 0 : 1;
    }
}