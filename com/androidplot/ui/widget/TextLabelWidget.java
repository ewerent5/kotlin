package com.androidplot.ui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.androidplot.ui.Anchor;
import com.androidplot.ui.LayoutManager;
import com.androidplot.ui.Size;
import com.androidplot.ui.SizeMode;
import com.androidplot.ui.TextOrientation;
import com.androidplot.util.FontUtils;

/* loaded from: classes.dex */
public class TextLabelWidget extends Widget {
    private boolean autoPackEnabled;
    private Paint labelPaint;
    private TextOrientation orientation;
    private String text;

    /* renamed from: com.androidplot.ui.widget.TextLabelWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$androidplot$ui$TextOrientation;

        static {
            int[] iArr = new int[TextOrientation.values().length];
            $SwitchMap$com$androidplot$ui$TextOrientation = iArr;
            try {
                iArr[TextOrientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$androidplot$ui$TextOrientation[TextOrientation.VERTICAL_ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$androidplot$ui$TextOrientation[TextOrientation.VERTICAL_DESCENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TextLabelWidget(LayoutManager layoutManager, Size size) {
        this(layoutManager, size, TextOrientation.HORIZONTAL);
    }

    @Override // com.androidplot.ui.widget.Widget
    public void doOnDraw(Canvas canvas, RectF rectF) {
        String str = this.text;
        if (str == null || str.length() == 0) {
            return;
        }
        float f2 = this.labelPaint.getFontMetrics().descent;
        PointF anchorCoordinates = Widget.getAnchorCoordinates(rectF, Anchor.CENTER);
        try {
            canvas.save();
            canvas.translate(anchorCoordinates.x, anchorCoordinates.y);
            int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$TextOrientation[this.orientation.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    canvas.rotate(-90.0f);
                } else {
                    if (i2 != 3) {
                        throw new UnsupportedOperationException("Orientation " + this.orientation + " not yet implemented for TextLabelWidget.");
                    }
                    canvas.rotate(90.0f);
                }
            }
            canvas.drawText(this.text, 0.0f, f2, this.labelPaint);
        } finally {
            canvas.restore();
        }
    }

    public Paint getLabelPaint() {
        return this.labelPaint;
    }

    public TextOrientation getOrientation() {
        return this.orientation;
    }

    public String getText() {
        return this.text;
    }

    public boolean isAutoPackEnabled() {
        return this.autoPackEnabled;
    }

    @Override // com.androidplot.ui.widget.Widget
    protected void onMetricsChanged(Size size, Size size2) {
        if (this.autoPackEnabled) {
            pack();
        }
    }

    @Override // com.androidplot.ui.widget.Widget
    public void onPostInit() {
        if (this.autoPackEnabled) {
            pack();
        }
    }

    public void pack() {
        Rect stringDimensions = FontUtils.getStringDimensions(this.text, getLabelPaint());
        if (stringDimensions == null) {
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$androidplot$ui$TextOrientation[this.orientation.ordinal()];
        if (i2 == 1) {
            float fHeight = stringDimensions.height();
            SizeMode sizeMode = SizeMode.ABSOLUTE;
            setSize(new Size(fHeight, sizeMode, stringDimensions.width() + 2, sizeMode));
        } else if (i2 == 2 || i2 == 3) {
            float fWidth = stringDimensions.width();
            SizeMode sizeMode2 = SizeMode.ABSOLUTE;
            setSize(new Size(fWidth, sizeMode2, stringDimensions.height() + 2, sizeMode2));
        }
        refreshLayout();
    }

    public void setAutoPackEnabled(boolean z) {
        this.autoPackEnabled = z;
        if (z) {
            pack();
        }
    }

    public void setLabelPaint(Paint paint) {
        this.labelPaint = paint;
        if (this.autoPackEnabled) {
            pack();
        }
    }

    public void setOrientation(TextOrientation textOrientation) {
        this.orientation = textOrientation;
        if (this.autoPackEnabled) {
            pack();
        }
    }

    public void setText(String str) {
        this.text = str;
        if (this.autoPackEnabled) {
            pack();
        }
    }

    public TextLabelWidget(LayoutManager layoutManager, String str, Size size, TextOrientation textOrientation) {
        this(layoutManager, size, textOrientation);
        setText(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextLabelWidget(LayoutManager layoutManager, Size size, TextOrientation textOrientation) {
        SizeMode sizeMode = SizeMode.ABSOLUTE;
        super(layoutManager, new Size(0.0f, sizeMode, 0.0f, sizeMode));
        this.autoPackEnabled = true;
        Paint paint = new Paint();
        this.labelPaint = paint;
        paint.setColor(-1);
        this.labelPaint.setAntiAlias(true);
        this.labelPaint.setTextAlign(Paint.Align.CENTER);
        setClippingEnabled(false);
        setSize(size);
        this.orientation = textOrientation;
    }
}