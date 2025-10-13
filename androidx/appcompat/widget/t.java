package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar.java */
/* loaded from: classes.dex */
public class t extends RatingBar {

    /* renamed from: e, reason: collision with root package name */
    private final r f575e;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.G);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmapB = this.f575e.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }

    public t(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(this, getContext());
        r rVar = new r(this);
        this.f575e = rVar;
        rVar.c(attributeSet, i2);
    }
}