package c.s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: ViewOverlayApi14.java */
/* loaded from: classes.dex */
class z implements b0 {
    protected a a;

    /* compiled from: ViewOverlayApi14.java */
    static class a extends ViewGroup {

        /* renamed from: e, reason: collision with root package name */
        static Method f3424e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f3425f;

        /* renamed from: g, reason: collision with root package name */
        View f3426g;

        /* renamed from: h, reason: collision with root package name */
        ArrayList<Drawable> f3427h;

        /* renamed from: i, reason: collision with root package name */
        z f3428i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f3429j;

        static {
            try {
                Class cls = Integer.TYPE;
                f3424e = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, z zVar) {
            super(context);
            this.f3427h = null;
            this.f3425f = viewGroup;
            this.f3426g = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f3428i = zVar;
        }

        private void c() {
            if (this.f3429j) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f3427h;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f3429j = true;
                    this.f3425f.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f3425f.getLocationOnScreen(iArr2);
            this.f3426g.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f3427h == null) {
                this.f3427h = new ArrayList<>();
            }
            if (this.f3427h.contains(drawable)) {
                return;
            }
            this.f3427h.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f3425f && viewGroup.getParent() != null && c.h.l.t.P(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f3425f.getLocationOnScreen(iArr2);
                    c.h.l.t.V(view, iArr[0] - iArr2[0]);
                    c.h.l.t.W(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f3425f.getLocationOnScreen(new int[2]);
            this.f3426g.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f3426g.getWidth(), this.f3426g.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f3427h;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3427h.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f3427h;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f3425f == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (!(this.f3425f instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f3427h) != null && arrayList.contains(drawable));
        }
    }

    z(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    static z e(View view) {
        ViewGroup viewGroupF = f(view);
        if (viewGroupF == null) {
            return null;
        }
        int childCount = viewGroupF.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroupF.getChildAt(i2);
            if (childAt instanceof a) {
                return ((a) childAt).f3428i;
            }
        }
        return new u(viewGroupF.getContext(), viewGroupF, view);
    }

    static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // c.s.b0
    public void a(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // c.s.b0
    public void b(Drawable drawable) {
        this.a.f(drawable);
    }
}