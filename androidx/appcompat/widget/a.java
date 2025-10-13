package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.classic.Level;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    protected final C0003a f396e;

    /* renamed from: f, reason: collision with root package name */
    protected final Context f397f;

    /* renamed from: g, reason: collision with root package name */
    protected ActionMenuView f398g;

    /* renamed from: h, reason: collision with root package name */
    protected c f399h;

    /* renamed from: i, reason: collision with root package name */
    protected int f400i;

    /* renamed from: j, reason: collision with root package name */
    protected c.h.l.x f401j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f402k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f403l;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0003a implements c.h.l.y {
        private boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        int f404b;

        protected C0003a() {
        }

        @Override // c.h.l.y
        public void a(View view) {
            this.a = true;
        }

        @Override // c.h.l.y
        public void b(View view) {
            if (this.a) {
                return;
            }
            a aVar = a.this;
            aVar.f401j = null;
            a.super.setVisibility(this.f404b);
        }

        @Override // c.h.l.y
        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public C0003a d(c.h.l.x xVar, int i2) {
            a.this.f401j = xVar;
            this.f404b = i2;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    protected int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Level.ALL_INT), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    protected int e(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i3 + ((i4 - measuredHeight) / 2);
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public c.h.l.x f(int i2, long j2) {
        c.h.l.x xVar = this.f401j;
        if (xVar != null) {
            xVar.b();
        }
        if (i2 != 0) {
            c.h.l.x xVarA = c.h.l.t.d(this).a(0.0f);
            xVarA.d(j2);
            xVarA.f(this.f396e.d(xVarA, i2));
            return xVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        c.h.l.x xVarA2 = c.h.l.t.d(this).a(1.0f);
        xVarA2.d(j2);
        xVarA2.f(this.f396e.d(xVarA2, i2));
        return xVarA2;
    }

    public int getAnimatedVisibility() {
        return this.f401j != null ? this.f396e.f404b : getVisibility();
    }

    public int getContentHeight() {
        return this.f400i;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, c.a.j.a, c.a.a.f2442c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(c.a.j.f2529j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f399h;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f403l = false;
        }
        if (!this.f403l) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f403l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f403l = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f402k = false;
        }
        if (!this.f402k) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f402k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f402k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            c.h.l.x xVar = this.f401j;
            if (xVar != null) {
                xVar.b();
            }
            super.setVisibility(i2);
        }
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f396e = new C0003a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(c.a.a.a, typedValue, true) || typedValue.resourceId == 0) {
            this.f397f = context;
        } else {
            this.f397f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}