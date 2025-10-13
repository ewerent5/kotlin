package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.h.l.t;
import e.c.b.c.f;
import e.c.b.c.l;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: e, reason: collision with root package name */
    private TextView f11751e;

    /* renamed from: f, reason: collision with root package name */
    private Button f11752f;

    /* renamed from: g, reason: collision with root package name */
    private int f11753g;

    /* renamed from: h, reason: collision with root package name */
    private int f11754h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.T3);
        this.f11753g = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.U3, -1);
        this.f11754h = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.b4, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static void d(View view, int i2, int i3) {
        if (t.S(view)) {
            t.x0(view, t.G(view), i2, t.F(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    private boolean e(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f11751e.getPaddingTop() == i3 && this.f11751e.getPaddingBottom() == i4) {
            return z;
        }
        d(this.f11751e, i3, i4);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i2, int i3) {
        this.f11751e.setAlpha(0.0f);
        long j2 = i3;
        long j3 = i2;
        this.f11751e.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f11752f.getVisibility() == 0) {
            this.f11752f.setAlpha(0.0f);
            this.f11752f.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i2, int i3) {
        this.f11751e.setAlpha(1.0f);
        long j2 = i3;
        long j3 = i2;
        this.f11751e.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f11752f.getVisibility() == 0) {
            this.f11752f.setAlpha(1.0f);
            this.f11752f.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    void c(float f2) {
        if (f2 != 1.0f) {
            this.f11752f.setTextColor(e.c.b.c.s.a.f(e.c.b.c.s.a.c(this, e.c.b.c.b.f15081l), this.f11752f.getCurrentTextColor(), f2));
        }
    }

    public Button getActionView() {
        return this.f11752f;
    }

    public TextView getMessageView() {
        return this.f11751e;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f11751e = (TextView) findViewById(f.I);
        this.f11752f = (Button) findViewById(f.H);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f11753g
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f11753g
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = e.c.b.c.d.f15189g
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = e.c.b.c.d.f15188f
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f11751e
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f11754h
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f11752f
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f11754h
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f11754h = i2;
    }
}