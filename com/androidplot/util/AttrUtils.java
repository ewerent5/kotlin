package com.androidplot.util;

import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.Log;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.BoxModelable;
import com.androidplot.ui.HorizontalPositioning;
import com.androidplot.ui.Insets;
import com.androidplot.ui.PositionMetrics;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMetric;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.VerticalPositioning;
import com.androidplot.ui.widget.Widget;
import com.androidplot.xy.StepMode;
import com.androidplot.xy.StepModel;

/* loaded from: classes.dex */
public class AttrUtils {
    private static final String TAG = "com.androidplot.util.AttrUtils";

    public static void configureBoxModelable(TypedArray typedArray, BoxModelable boxModelable, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (typedArray != null) {
            boxModelable.setMargins(typedArray.getDimension(i4, boxModelable.getMarginLeft()), typedArray.getDimension(i2, boxModelable.getMarginTop()), typedArray.getDimension(i5, boxModelable.getMarginRight()), typedArray.getDimension(i3, boxModelable.getMarginBottom()));
            boxModelable.setPadding(typedArray.getDimension(i8, boxModelable.getPaddingLeft()), typedArray.getDimension(i6, boxModelable.getPaddingTop()), typedArray.getDimension(i9, boxModelable.getPaddingRight()), typedArray.getDimension(i7, boxModelable.getPaddingBottom()));
        }
    }

    public static void configureInsets(TypedArray typedArray, Insets insets, int i2, int i3, int i4, int i5) {
        insets.setTop(typedArray.getDimension(i2, insets.getTop()));
        insets.setBottom(typedArray.getDimension(i3, insets.getBottom()));
        insets.setLeft(typedArray.getDimension(i4, insets.getLeft()));
        insets.setRight(typedArray.getDimension(i5, insets.getRight()));
    }

    public static void configureLinePaint(TypedArray typedArray, Paint paint, int i2, int i3) {
        if (typedArray != null) {
            setColor(typedArray, paint, i2);
            paint.setStrokeWidth(typedArray.getDimension(i3, paint.getStrokeWidth()));
        }
    }

    public static void configurePositionMetrics(TypedArray typedArray, PositionMetrics positionMetrics, int i2, int i3, int i4, int i5, int i6) {
        if (typedArray == null || positionMetrics == null) {
            return;
        }
        positionMetrics.getXPositionMetric().set(getIntFloatDimenValue(typedArray, i3, Float.valueOf(positionMetrics.getXPositionMetric().getValue())).floatValue(), getXLayoutStyle(typedArray, i2, (HorizontalPositioning) positionMetrics.getXPositionMetric().getLayoutType()));
        positionMetrics.getYPositionMetric().set(getIntFloatDimenValue(typedArray, i5, Float.valueOf(positionMetrics.getYPositionMetric().getValue())).floatValue(), getYLayoutStyle(typedArray, i4, (VerticalPositioning) positionMetrics.getYPositionMetric().getLayoutType()));
        positionMetrics.setAnchor(getAnchorPosition(typedArray, i6, positionMetrics.getAnchor()));
    }

    public static void configureSize(TypedArray typedArray, Size size, int i2, int i3, int i4, int i5) {
        if (typedArray != null) {
            configureSizeMetric(typedArray, size.getHeight(), i2, i3);
            configureSizeMetric(typedArray, size.getWidth(), i4, i5);
        }
    }

    private static void configureSizeMetric(TypedArray typedArray, SizeMetric sizeMetric, int i2, int i3) {
        sizeMetric.set(getIntFloatDimenValue(typedArray, i3, Float.valueOf(sizeMetric.getValue())).floatValue(), getSizeLayoutType(typedArray, i2, sizeMetric.getLayoutType()));
    }

    public static void configureStep(TypedArray typedArray, StepModel stepModel, int i2, int i3) {
        if (typedArray != null) {
            stepModel.setMode(StepMode.values()[typedArray.getInt(i2, stepModel.getMode().ordinal())]);
            stepModel.setValue(getIntFloatDimenValue(typedArray, i3, Double.valueOf(stepModel.getValue())).doubleValue());
        }
    }

    public static void configureTextAlign(TypedArray typedArray, Paint paint, int i2) {
        if (typedArray != null) {
            paint.setTextAlign(Paint.Align.values()[typedArray.getInt(i2, paint.getTextAlign().ordinal())]);
        }
    }

    public static void configureTextPaint(TypedArray typedArray, Paint paint, int i2, int i3) {
        configureTextPaint(typedArray, paint, i2, i3, null);
    }

    public static void configureWidget(TypedArray typedArray, Widget widget, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (typedArray != null) {
            configureSize(typedArray, widget.getSize(), i2, i3, i4, i5);
            configurePositionMetrics(typedArray, widget.getPositionMetrics(), i6, i7, i8, i9, i10);
            widget.setVisible(typedArray.getBoolean(i11, widget.isVisible()));
        }
    }

    public static void configureWidgetRotation(TypedArray typedArray, Widget widget, int i2) {
        if (typedArray != null) {
            widget.setRotation(getWidgetRotation(typedArray, i2, Widget.Rotation.NONE));
        }
    }

    private static Anchor getAnchorPosition(TypedArray typedArray, int i2, Anchor anchor) {
        return Anchor.values()[typedArray.getInt(i2, anchor.ordinal())];
    }

    private static Number getIntFloatDimenValue(TypedArray typedArray, int i2, Number number) {
        if (typedArray == null || !typedArray.hasValue(i2)) {
            return number;
        }
        int i3 = typedArray.peekValue(i2).type;
        if (i3 == 5) {
            return Float.valueOf(typedArray.getDimension(i2, number.floatValue()));
        }
        if (i3 == 16) {
            return Integer.valueOf(typedArray.getInt(i2, number.intValue()));
        }
        if (i3 == 4) {
            return Float.valueOf(typedArray.getFloat(i2, number.floatValue()));
        }
        throw new IllegalArgumentException("Invalid value type - must be int, float or dimension.");
    }

    private static SizeMode getSizeLayoutType(TypedArray typedArray, int i2, SizeMode sizeMode) {
        return SizeMode.values()[typedArray.getInt(i2, sizeMode.ordinal())];
    }

    private static Widget.Rotation getWidgetRotation(TypedArray typedArray, int i2, Widget.Rotation rotation) {
        return Widget.Rotation.values()[typedArray.getInt(i2, rotation.ordinal())];
    }

    private static HorizontalPositioning getXLayoutStyle(TypedArray typedArray, int i2, HorizontalPositioning horizontalPositioning) {
        return HorizontalPositioning.values()[typedArray.getInt(i2, horizontalPositioning.ordinal())];
    }

    private static VerticalPositioning getYLayoutStyle(TypedArray typedArray, int i2, VerticalPositioning verticalPositioning) {
        return VerticalPositioning.values()[typedArray.getInt(i2, verticalPositioning.ordinal())];
    }

    public static void setColor(TypedArray typedArray, Paint paint, int i2) {
        if (paint != null) {
            paint.setColor(typedArray.getColor(i2, paint.getColor()));
            return;
        }
        Log.w(TAG, "Attempt to configure null Paint property for attrId: " + i2);
    }

    public static void setTextSize(TypedArray typedArray, Paint paint, int i2) {
        paint.setTextSize(typedArray.getDimension(i2, paint.getTextSize()));
    }

    public static void configureTextPaint(TypedArray typedArray, Paint paint, int i2, int i3, Integer num) {
        if (typedArray != null) {
            setColor(typedArray, paint, i2);
            setTextSize(typedArray, paint, i3);
            if (num == null || !typedArray.hasValue(num.intValue())) {
                return;
            }
            configureTextAlign(typedArray, paint, num.intValue());
        }
    }
}