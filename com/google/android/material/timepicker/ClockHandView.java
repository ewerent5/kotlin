package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c.h.l.t;
import e.c.b.c.k;
import e.c.b.c.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f11882e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11883f;

    /* renamed from: g, reason: collision with root package name */
    private float f11884g;

    /* renamed from: h, reason: collision with root package name */
    private float f11885h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f11886i;

    /* renamed from: j, reason: collision with root package name */
    private int f11887j;

    /* renamed from: k, reason: collision with root package name */
    private final List<d> f11888k;

    /* renamed from: l, reason: collision with root package name */
    private final int f11889l;

    /* renamed from: m, reason: collision with root package name */
    private final float f11890m;
    private final Paint n;
    private final RectF o;
    private final int p;
    private float q;
    private boolean r;
    private c s;
    private double t;
    private int u;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f2, boolean z);
    }

    public interface d {
        void a(float f2, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.t);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.u * ((float) Math.cos(this.t))) + width;
        float f2 = height;
        float fSin = (this.u * ((float) Math.sin(this.t))) + f2;
        this.n.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f11889l, this.n);
        double dSin = Math.sin(this.t);
        double dCos = Math.cos(this.t);
        this.n.setStrokeWidth(this.p);
        canvas.drawLine(width, f2, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.n);
        canvas.drawCircle(width, f2, this.f11890m, this.n);
    }

    private int e(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f2) {
        float f3 = f();
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f3), Float.valueOf(f2));
    }

    private boolean i(float f2, float f3, boolean z, boolean z2, boolean z3) {
        float fE = e(f2, f3);
        boolean z4 = false;
        boolean z5 = f() != fE;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f11883f) {
            z4 = true;
        }
        l(fE, z4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.q = f3;
        this.t = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.u * ((float) Math.cos(this.t)));
        float fSin = height + (this.u * ((float) Math.sin(this.t)));
        RectF rectF = this.o;
        int i2 = this.f11889l;
        rectF.set(width - i2, fSin - i2, width + i2, fSin + i2);
        Iterator<d> it = this.f11888k.iterator();
        while (it.hasNext()) {
            it.next().a(f3, z);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f11888k.add(dVar);
    }

    public RectF d() {
        return this.o;
    }

    public float f() {
        return this.q;
    }

    public int g() {
        return this.f11889l;
    }

    public void j(int i2) {
        this.u = i2;
        invalidate();
    }

    public void k(float f2) {
        l(f2, false);
    }

    public void l(float f2, boolean z) {
        ValueAnimator valueAnimator = this.f11882e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f2, false);
            return;
        }
        Pair<Float, Float> pairH = h(f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f11882e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f11882e.addUpdateListener(new a());
        this.f11882e.addListener(new b());
        this.f11882e.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i2 = (int) (x - this.f11884g);
                int i3 = (int) (y - this.f11885h);
                this.f11886i = (i2 * i2) + (i3 * i3) > this.f11887j;
                boolean z4 = this.r;
                z = actionMasked == 1;
                z2 = z4;
            } else {
                z = false;
                z2 = false;
            }
            z3 = false;
        } else {
            this.f11884g = x;
            this.f11885h = y;
            this.f11886i = true;
            this.r = false;
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean zI = i(x, y, z2, z3, z) | this.r;
        this.r = zI;
        if (zI && z && (cVar = this.s) != null) {
            cVar.a(e(x, y), this.f11886i);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f11888k = new ArrayList();
        Paint paint = new Paint();
        this.n = paint;
        this.o = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.W0, i2, k.w);
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.Y0, 0);
        this.f11889l = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.Z0, 0);
        this.p = getResources().getDimensionPixelSize(e.c.b.c.d.f15195m);
        this.f11890m = r6.getDimensionPixelSize(e.c.b.c.d.f15193k);
        int color = typedArrayObtainStyledAttributes.getColor(l.X0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f11887j = ViewConfiguration.get(context).getScaledTouchSlop();
        t.u0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}