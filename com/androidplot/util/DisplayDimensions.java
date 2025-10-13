package com.androidplot.util;

import android.graphics.RectF;

/* loaded from: classes.dex */
public class DisplayDimensions {
    private static final int ONE = 1;
    private static final RectF initRect = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
    public final RectF canvasRect;
    public final RectF marginatedRect;
    public final RectF paddedRect;

    /* JADX WARN: Illegal instructions before constructor call */
    public DisplayDimensions() {
        RectF rectF = initRect;
        this(rectF, rectF, rectF);
    }

    public DisplayDimensions(RectF rectF, RectF rectF2, RectF rectF3) {
        this.canvasRect = rectF;
        this.marginatedRect = rectF2;
        this.paddedRect = rectF3;
    }
}