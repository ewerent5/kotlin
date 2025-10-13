package com.androidplot.ui;

import java.lang.Enum;

/* loaded from: classes.dex */
public abstract class PositionMetric<LayoutType extends Enum> extends LayoutMetric<LayoutType> {

    /* renamed from: com.androidplot.ui.PositionMetric$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode;
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$PositionMetric$Origin;

        static {
            int[] iArr = new int[Origin.values().length];
            $SwitchMap$com$androidplot$ui$PositionMetric$Origin = iArr;
            try {
                iArr[Origin.FROM_BEGINING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$PositionMetric$Origin[Origin.FROM_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$PositionMetric$Origin[Origin.FROM_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LayoutMode.values().length];
            $SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode = iArr2;
            try {
                iArr2[LayoutMode.ABSOLUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode[LayoutMode.RELATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    protected enum LayoutMode {
        ABSOLUTE,
        RELATIVE
    }

    protected enum Origin {
        FROM_BEGINING,
        FROM_CENTER,
        FROM_END
    }

    public PositionMetric(float f2, LayoutType layouttype) {
        super(f2, layouttype);
    }

    protected static void validateValue(float f2, LayoutMode layoutMode) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$PositionMetric$LayoutMode[layoutMode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (f2 < -1.0f || f2 > 1.0f) {
                    throw new IllegalArgumentException("Relative layout values must be within the range of -1 to 1.");
                }
            } else {
                throw new IllegalArgumentException("Unknown LayoutMode: " + layoutMode);
            }
        }
    }

    protected float getAbsolutePosition(float f2, Origin origin) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$PositionMetric$Origin[origin.ordinal()];
        if (i2 == 1) {
            return getValue();
        }
        if (i2 == 2) {
            return (f2 / 2.0f) + getValue();
        }
        if (i2 == 3) {
            return f2 - getValue();
        }
        throw new IllegalArgumentException("Unsupported Origin: " + origin);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ Enum getLayoutType() {
        return super.getLayoutType();
    }

    protected float getRelativePosition(float f2, Origin origin) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$PositionMetric$Origin[origin.ordinal()];
        if (i2 == 1) {
            return f2 * getValue();
        }
        if (i2 == 2) {
            float f3 = f2 / 2.0f;
            return f3 + (getValue() * f3);
        }
        if (i2 == 3) {
            return f2 + (getValue() * f2);
        }
        throw new IllegalArgumentException("Unsupported Origin: " + origin);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ float getValue() {
        return super.getValue();
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void set(float f2, Enum r2) {
        super.set(f2, r2);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void setLayoutType(Enum r1) {
        super.setLayoutType(r1);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void setValue(float f2) {
        super.setValue(f2);
    }
}