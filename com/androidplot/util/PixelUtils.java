package com.androidplot.util;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class PixelUtils {
    private static DisplayMetrics metrics;
    public static final Map<String, Integer> dimensionConstantLookup = initDimensionConstantLookup();
    protected static final String DIMENSION_REGEX = "^\\-?\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$";
    protected static final Pattern DIMENSION_PATTERN = Pattern.compile(DIMENSION_REGEX);

    private static class InternalDimension {
        int unit;
        float value;

        public InternalDimension(float f2, int i2) {
            this.value = f2;
            this.unit = i2;
        }
    }

    public static PointF add(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    private static void checkMetrics() {
        if (metrics == null) {
            throw new RuntimeException("PixelUtils not initialized; call PixelUtils.init(Context) before using.");
        }
    }

    public static float dpToPix(float f2) {
        checkMetrics();
        return TypedValue.applyDimension(1, f2, metrics);
    }

    public static void init(Context context) {
        metrics = context.getResources().getDisplayMetrics();
    }

    private static Map<String, Integer> initDimensionConstantLookup() {
        HashMap map = new HashMap();
        map.put("px", 0);
        map.put("dip", 1);
        map.put("dp", 1);
        map.put("sp", 2);
        map.put("pt", 3);
        map.put("in", 4);
        map.put("mm", 5);
        return Collections.unmodifiableMap(map);
    }

    public static float spToPix(float f2) {
        checkMetrics();
        return TypedValue.applyDimension(2, f2, metrics);
    }

    public static float stringToDimension(String str) {
        InternalDimension internalDimensionStringToInternalDimension = stringToInternalDimension(str);
        return TypedValue.applyDimension(internalDimensionStringToInternalDimension.unit, internalDimensionStringToInternalDimension.value, metrics);
    }

    private static InternalDimension stringToInternalDimension(String str) {
        Matcher matcher = DIMENSION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float fFloatValue = Float.valueOf(matcher.group(1)).floatValue();
        Integer num = dimensionConstantLookup.get(matcher.group(3).toLowerCase());
        if (num != null) {
            return new InternalDimension(fFloatValue, num.intValue());
        }
        throw new NumberFormatException();
    }

    public static PointF sub(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
    }
}