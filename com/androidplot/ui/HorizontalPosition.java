package com.androidplot.ui;

import com.androidplot.ui.PositionMetric;

/* loaded from: classes.dex */
public class HorizontalPosition extends PositionMetric<HorizontalPositioning> {

    /* renamed from: com.androidplot.ui.HorizontalPosition$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$HorizontalPositioning;

        static {
            int[] iArr = new int[HorizontalPositioning.values().length];
            $SwitchMap$com$androidplot$ui$HorizontalPositioning = iArr;
            try {
                iArr[HorizontalPositioning.ABSOLUTE_FROM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.ABSOLUTE_FROM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.ABSOLUTE_FROM_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.RELATIVE_TO_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.RELATIVE_TO_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$ui$HorizontalPositioning[HorizontalPositioning.RELATIVE_TO_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public HorizontalPosition(float f2, HorizontalPositioning horizontalPositioning) {
        super(f2, horizontalPositioning);
        validatePair(f2, horizontalPositioning);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public float getPixelValue(float f2) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$HorizontalPositioning[((HorizontalPositioning) getLayoutType()).ordinal()]) {
            case 1:
                return getAbsolutePosition(f2, PositionMetric.Origin.FROM_BEGINING);
            case 2:
                return getAbsolutePosition(f2, PositionMetric.Origin.FROM_END);
            case 3:
                return getAbsolutePosition(f2, PositionMetric.Origin.FROM_CENTER);
            case 4:
                return getRelativePosition(f2, PositionMetric.Origin.FROM_BEGINING);
            case 5:
                return getRelativePosition(f2, PositionMetric.Origin.FROM_END);
            case 6:
                return getRelativePosition(f2, PositionMetric.Origin.FROM_CENTER);
            default:
                throw new IllegalArgumentException("Unsupported LayoutType: " + getLayoutType());
        }
    }

    @Override // com.androidplot.ui.PositionMetric, com.androidplot.ui.LayoutMetric
    public void setLayoutType(HorizontalPositioning horizontalPositioning) {
        super.setLayoutType((Enum) horizontalPositioning);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.LayoutMetric
    public void validatePair(float f2, HorizontalPositioning horizontalPositioning) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$HorizontalPositioning[horizontalPositioning.ordinal()]) {
            case 1:
            case 2:
            case 3:
                PositionMetric.validateValue(f2, PositionMetric.LayoutMode.ABSOLUTE);
                break;
            case 4:
            case 5:
            case 6:
                PositionMetric.validateValue(f2, PositionMetric.LayoutMode.RELATIVE);
                break;
        }
    }
}