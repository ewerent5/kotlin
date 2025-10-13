package com.androidplot.ui;

import com.androidplot.ui.PositionMetric;

/* loaded from: classes.dex */
public class VerticalPosition extends PositionMetric<VerticalPositioning> {

    /* renamed from: com.androidplot.ui.VerticalPosition$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$VerticalPositioning;

        static {
            int[] iArr = new int[VerticalPositioning.values().length];
            $SwitchMap$com$androidplot$ui$VerticalPositioning = iArr;
            try {
                iArr[VerticalPositioning.ABSOLUTE_FROM_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.ABSOLUTE_FROM_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.ABSOLUTE_FROM_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.RELATIVE_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.RELATIVE_TO_BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$androidplot$ui$VerticalPositioning[VerticalPositioning.RELATIVE_TO_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public VerticalPosition(float f2, VerticalPositioning verticalPositioning) {
        super(f2, verticalPositioning);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public float getPixelValue(float f2) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$VerticalPositioning[((VerticalPositioning) getLayoutType()).ordinal()]) {
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
    public void setLayoutType(VerticalPositioning verticalPositioning) {
        super.setLayoutType((Enum) verticalPositioning);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.LayoutMetric
    public void validatePair(float f2, VerticalPositioning verticalPositioning) {
        switch (AnonymousClass1.$SwitchMap$com$androidplot$ui$VerticalPositioning[verticalPositioning.ordinal()]) {
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