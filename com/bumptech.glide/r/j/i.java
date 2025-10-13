package com.bumptech.glide.r.j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.t.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends com.bumptech.glide.r.j.a<Z> {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f4219e;

    /* renamed from: f, reason: collision with root package name */
    private static int f4220f = com.bumptech.glide.h.a;

    /* renamed from: g, reason: collision with root package name */
    protected final T f4221g;

    /* renamed from: h, reason: collision with root package name */
    private final a f4222h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnAttachStateChangeListener f4223i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4224j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4225k;

    /* compiled from: ViewTarget.java */
    static final class a {
        static Integer a;

        /* renamed from: b, reason: collision with root package name */
        private final View f4226b;

        /* renamed from: c, reason: collision with root package name */
        private final List<g> f4227c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        boolean f4228d;

        /* renamed from: e, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0101a f4229e;

        /* compiled from: ViewTarget.java */
        /* renamed from: com.bumptech.glide.r.j.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0101a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: e, reason: collision with root package name */
            private final WeakReference<a> f4230e;

            ViewTreeObserverOnPreDrawListenerC0101a(a aVar) {
                this.f4230e = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f4230e.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f4226b = view;
        }

        private static int c(Context context) {
            if (a == null) {
                Display defaultDisplay = ((WindowManager) j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return a.intValue();
        }

        private int e(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            if (this.f4228d && this.f4226b.isLayoutRequested()) {
                return 0;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.f4226b.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f4226b.getContext());
        }

        private int f() {
            int paddingTop = this.f4226b.getPaddingTop() + this.f4226b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f4226b.getLayoutParams();
            return e(this.f4226b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f4226b.getPaddingLeft() + this.f4226b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f4226b.getLayoutParams();
            return e(this.f4226b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i2) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }

        private boolean i(int i2, int i3) {
            return h(i2) && h(i3);
        }

        private void j(int i2, int i3) {
            Iterator it = new ArrayList(this.f4227c).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f(i2, i3);
            }
        }

        void a() {
            if (this.f4227c.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f4226b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4229e);
            }
            this.f4229e = null;
            this.f4227c.clear();
        }

        void d(g gVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                gVar.f(iG, iF);
                return;
            }
            if (!this.f4227c.contains(gVar)) {
                this.f4227c.add(gVar);
            }
            if (this.f4229e == null) {
                ViewTreeObserver viewTreeObserver = this.f4226b.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0101a viewTreeObserverOnPreDrawListenerC0101a = new ViewTreeObserverOnPreDrawListenerC0101a(this);
                this.f4229e = viewTreeObserverOnPreDrawListenerC0101a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0101a);
            }
        }

        void k(g gVar) {
            this.f4227c.remove(gVar);
        }
    }

    public i(T t) {
        this.f4221g = (T) j.d(t);
        this.f4222h = new a(t);
    }

    private Object j() {
        return this.f4221g.getTag(f4220f);
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4223i;
        if (onAttachStateChangeListener == null || this.f4225k) {
            return;
        }
        this.f4221g.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f4225k = true;
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4223i;
        if (onAttachStateChangeListener == null || !this.f4225k) {
            return;
        }
        this.f4221g.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f4225k = false;
    }

    private void n(Object obj) {
        f4219e = true;
        this.f4221g.setTag(f4220f, obj);
    }

    @Override // com.bumptech.glide.r.j.h
    public void a(g gVar) {
        this.f4222h.k(gVar);
    }

    @Override // com.bumptech.glide.r.j.h
    public void c(com.bumptech.glide.r.c cVar) {
        n(cVar);
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void e(Drawable drawable) {
        super.e(drawable);
        k();
    }

    @Override // com.bumptech.glide.r.j.h
    public com.bumptech.glide.r.c f() {
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        if (objJ instanceof com.bumptech.glide.r.c) {
            return (com.bumptech.glide.r.c) objJ;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void g(Drawable drawable) {
        super.g(drawable);
        this.f4222h.b();
        if (this.f4224j) {
            return;
        }
        m();
    }

    @Override // com.bumptech.glide.r.j.h
    public void i(g gVar) {
        this.f4222h.d(gVar);
    }

    public String toString() {
        return "Target for: " + this.f4221g;
    }
}