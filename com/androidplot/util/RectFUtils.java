package com.androidplot.util;

import android.graphics.RectF;
import com.androidplot.ui.Insets;

/* loaded from: classes.dex */
public abstract class RectFUtils {
    public static RectF applyInsets(RectF rectF, Insets insets) {
        return insets != null ? new RectF(rectF.left + insets.getLeft(), rectF.top + insets.getTop(), rectF.right - insets.getRight(), rectF.bottom - insets.getBottom()) : rectF;
    }

    public static boolean areIdentical(RectF rectF, RectF rectF2) {
        return rectF.left == rectF2.left && rectF.top == rectF2.top && rectF.right == rectF2.right && rectF.bottom == rectF2.bottom;
    }

    public static RectF createFromEdges(float f2, float f3, float f4, float f5) {
        boolean z = f2 <= f4;
        boolean z2 = f3 <= f5;
        float f6 = z ? f2 : f4;
        float f7 = z2 ? f3 : f5;
        if (z) {
            f2 = f4;
        }
        if (z2) {
            f3 = f5;
        }
        return new RectF(f6, f7, f2, f3);
    }
}