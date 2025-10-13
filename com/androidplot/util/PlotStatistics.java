package com.androidplot.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.androidplot.Plot;
import com.androidplot.PlotListener;

/* loaded from: classes.dex */
public class PlotStatistics implements PlotListener {
    private boolean annotatePlotEnabled;
    long lastAnnotation;
    private Paint paint;
    long updateDelayMs;
    long longestRenderMs = 0;
    long shortestRenderMs = 0;
    long lastStart = 0;
    long lastLatency = 0;
    long latencySamples = 0;
    long latencySum = 0;
    String annotationString = "";

    public PlotStatistics(long j2, boolean z) {
        Paint paint = new Paint();
        this.paint = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        this.paint.setColor(-1);
        this.paint.setTextSize(30.0f);
        resetCounters();
        this.updateDelayMs = j2;
        this.annotatePlotEnabled = z;
    }

    private void annotatePlot(Plot plot, Canvas canvas) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.lastAnnotation;
        if (j2 >= this.updateDelayMs) {
            long j3 = this.latencySamples;
            float f2 = j3 > 0 ? this.latencySum / j3 : 0.0f;
            Object[] objArr = new Object[1];
            objArr[0] = Float.valueOf(j3 > 0 ? (1000.0f / j2) * j3 : 0.0f);
            String str = String.format("%.2f", objArr);
            Object[] objArr2 = new Object[1];
            objArr2[0] = Float.valueOf(this.latencySamples > 0 ? 1000.0f / f2 : 0.0f);
            this.annotationString = "FPS (potential): " + String.format("%.2f", objArr2) + " FPS (actual): " + str + " Latency (ms) Avg: " + this.lastLatency + " \nMin: " + this.shortestRenderMs + " Max: " + this.longestRenderMs;
            this.lastAnnotation = jCurrentTimeMillis;
            resetCounters();
        }
        RectF rectF = plot.getDisplayDimensions().canvasRect;
        if (this.annotatePlotEnabled) {
            canvas.drawText(this.annotationString, rectF.centerX(), rectF.centerY(), this.paint);
        }
    }

    private void resetCounters() {
        this.longestRenderMs = 0L;
        this.shortestRenderMs = 999999999L;
        this.latencySamples = 0L;
        this.latencySum = 0L;
    }

    @Override // com.androidplot.PlotListener
    public void onAfterDraw(Plot plot, Canvas canvas) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.lastStart;
        this.lastLatency = jCurrentTimeMillis;
        if (jCurrentTimeMillis < this.shortestRenderMs) {
            this.shortestRenderMs = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis > this.longestRenderMs) {
            this.longestRenderMs = jCurrentTimeMillis;
        }
        this.latencySum += jCurrentTimeMillis;
        this.latencySamples++;
        annotatePlot(plot, canvas);
    }

    @Override // com.androidplot.PlotListener
    public void onBeforeDraw(Plot plot, Canvas canvas) {
        this.lastStart = System.currentTimeMillis();
    }

    public void setAnnotatePlotEnabled(boolean z) {
        this.annotatePlotEnabled = z;
    }

    public void setEnabled(boolean z) {
        this.annotatePlotEnabled = z;
    }
}