package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import e.c.b.c.c0.k;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes.dex */
class c extends e.c.b.c.c0.g {
    private final Paint C;
    private final RectF D;
    private int E;

    c() {
        this(null);
    }

    private void k0(Canvas canvas) {
        if (r0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.E);
    }

    private void l0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!r0(callback)) {
            n0(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    private void n0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.E = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.E = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    private void q0() {
        this.C.setStyle(Paint.Style.FILL_AND_STROKE);
        this.C.setColor(-1);
        this.C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean r0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        l0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.D, this.C);
        k0(canvas);
    }

    boolean j0() {
        return !this.D.isEmpty();
    }

    void m0() {
        o0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void o0(float f2, float f3, float f4, float f5) {
        RectF rectF = this.D;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }

    void p0(RectF rectF) {
        o0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.C = new Paint(1);
        q0();
        this.D = new RectF();
    }
}