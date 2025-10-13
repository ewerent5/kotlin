package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.f.b.k.e;
import ch.qos.logback.classic.spi.CallerData;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: e, reason: collision with root package name */
    private int f771e;

    /* renamed from: f, reason: collision with root package name */
    private View f772f;

    /* renamed from: g, reason: collision with root package name */
    private int f773g;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f772f == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f772f.getLayoutParams();
        bVar2.n0.T0(0);
        e.b bVarY = bVar.n0.y();
        e.b bVar3 = e.b.FIXED;
        if (bVarY != bVar3) {
            bVar.n0.U0(bVar2.n0.R());
        }
        if (bVar.n0.O() != bVar3) {
            bVar.n0.v0(bVar2.n0.v());
        }
        bVar2.n0.T0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f771e == -1 && !isInEditMode()) {
            setVisibility(this.f773g);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f771e);
        this.f772f = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).b0 = true;
            this.f772f.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f772f;
    }

    public int getEmptyVisibility() {
        return this.f773g;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds(CallerData.NA, 0, 1, rect);
            canvas.drawText(CallerData.NA, ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.f771e == i2) {
            return;
        }
        View view = this.f772f;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f772f.getLayoutParams()).b0 = false;
            this.f772f = null;
        }
        this.f771e = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f773g = i2;
    }
}