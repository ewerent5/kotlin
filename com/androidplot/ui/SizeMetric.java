package com.androidplot.ui;

/* loaded from: classes.dex */
public class SizeMetric extends LayoutMetric<SizeMode> {

    /* renamed from: com.androidplot.ui.SizeMetric$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$SizeMode;

        static {
            int[] iArr = new int[SizeMode.values().length];
            $SwitchMap$com$androidplot$ui$SizeMode = iArr;
            try {
                iArr[SizeMode.RELATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$SizeMode[SizeMode.ABSOLUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$SizeMode[SizeMode.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SizeMetric(float f2, SizeMode sizeMode) {
        super(f2, sizeMode);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public float getPixelValue(float f2) {
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$SizeMode[getLayoutType().ordinal()];
        if (i2 == 1) {
            return getValue() * f2;
        }
        if (i2 == 2) {
            return getValue();
        }
        if (i2 == 3) {
            return f2 - getValue();
        }
        throw new IllegalArgumentException("Unsupported LayoutType: " + getLayoutType());
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ float getValue() {
        return super.getValue();
    }

    @Override // com.androidplot.ui.LayoutMetric
    public /* bridge */ /* synthetic */ void setValue(float f2) {
        super.setValue(f2);
    }

    @Override // com.androidplot.ui.LayoutMetric
    public void setLayoutType(SizeMode sizeMode) {
        super.setLayoutType((SizeMetric) sizeMode);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidplot.ui.LayoutMetric
    public void validatePair(float f2, SizeMode sizeMode) {
        if (AnonymousClass1.$SwitchMap$com$androidplot$ui$SizeMode[sizeMode.ordinal()] != 1) {
            return;
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("SizeMetric Relative and Hybrid layout values must be within the range of 0 to 1.");
        }
    }
}