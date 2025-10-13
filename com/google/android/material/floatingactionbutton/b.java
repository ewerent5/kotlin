package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import c.h.l.t;
import e.c.b.c.c0.n;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
class b {
    static final TimeInterpolator a = e.c.b.c.m.a.f15265c;

    /* renamed from: b, reason: collision with root package name */
    static final int[] f11639b = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f11640c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f11641d = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f11642e = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f11643f = {R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f11644g = new int[0];
    private int A;
    private ArrayList<Animator.AnimatorListener> C;
    private ArrayList<Animator.AnimatorListener> D;
    private ArrayList<i> E;
    final FloatingActionButton F;
    final e.c.b.c.b0.b G;
    private ViewTreeObserver.OnPreDrawListener L;

    /* renamed from: h, reason: collision with root package name */
    e.c.b.c.c0.k f11645h;

    /* renamed from: i, reason: collision with root package name */
    e.c.b.c.c0.g f11646i;

    /* renamed from: j, reason: collision with root package name */
    Drawable f11647j;

    /* renamed from: k, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f11648k;

    /* renamed from: l, reason: collision with root package name */
    Drawable f11649l;

    /* renamed from: m, reason: collision with root package name */
    boolean f11650m;
    float o;
    float p;
    float q;
    int r;
    private final com.google.android.material.internal.f s;
    private e.c.b.c.m.h t;
    private e.c.b.c.m.h u;
    private Animator v;
    private e.c.b.c.m.h w;
    private e.c.b.c.m.h x;
    private float y;
    boolean n = true;
    private float z = 1.0f;
    private int B = 0;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    class a extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11651b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f11652c;

        a(boolean z, j jVar) {
            this.f11651b = z;
            this.f11652c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            if (this.a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.F;
            boolean z = this.f11651b;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.f11652c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.f11651b);
            b.this.B = 1;
            b.this.v = animator;
            this.a = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0120b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f11654b;

        C0120b(boolean z, j jVar) {
            this.a = z;
            this.f11654b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            j jVar = this.f11654b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.a);
            b.this.B = 2;
            b.this.v = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class c extends e.c.b.c.m.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            b.this.z = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class d implements TypeEvaluator<Float> {
        FloatEvaluator a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f2, Float f3, Float f4) {
            float fFloatValue = this.a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.F();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class f extends l {
        f() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class g extends l {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.o + bVar.p;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class h extends l {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.o + bVar.q;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface i {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface j {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class k extends l {
        k() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return b.this.o;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        private float f11663b;

        /* renamed from: c, reason: collision with root package name */
        private float f11664c;

        private l() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.c0((int) this.f11664c);
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                e.c.b.c.c0.g gVar = b.this.f11646i;
                this.f11663b = gVar == null ? 0.0f : gVar.w();
                this.f11664c = a();
                this.a = true;
            }
            b bVar = b.this;
            float f2 = this.f11663b;
            bVar.c0((int) (f2 + ((this.f11664c - f2) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }
    }

    b(FloatingActionButton floatingActionButton, e.c.b.c.b0.b bVar) {
        this.F = floatingActionButton;
        this.G = bVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        this.s = fVar;
        fVar.a(f11639b, i(new h()));
        fVar.a(f11640c, i(new g()));
        fVar.a(f11641d, i(new g()));
        fVar.a(f11642e, i(new g()));
        fVar.a(f11643f, i(new k()));
        fVar.a(f11644g, i(new f()));
        this.y = floatingActionButton.getRotation();
    }

    private boolean W() {
        return t.Q(this.F) && !this.F.isInEditMode();
    }

    private void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        if (this.F.getDrawable() == null || this.A == 0) {
            return;
        }
        RectF rectF = this.I;
        RectF rectF2 = this.J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.A;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.A;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    private AnimatorSet h(e.c.b.c.m.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        d0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        d0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        g(f4, this.K);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.F, new e.c.b.c.m.f(), new c(), new Matrix(this.K));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        e.c.b.c.m.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private e.c.b.c.m.h k() {
        if (this.u == null) {
            this.u = e.c.b.c.m.h.c(this.F.getContext(), e.c.b.c.a.a);
        }
        return (e.c.b.c.m.h) c.h.k.h.c(this.u);
    }

    private e.c.b.c.m.h l() {
        if (this.t == null) {
            this.t = e.c.b.c.m.h.c(this.F.getContext(), e.c.b.c.a.f15055b);
        }
        return (e.c.b.c.m.h) c.h.k.h.c(this.t);
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.L == null) {
            this.L = new e();
        }
        return this.L;
    }

    void A() {
    }

    void B() {
        ViewTreeObserver viewTreeObserver = this.F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.L = null;
        }
    }

    void C(int[] iArr) {
        this.s.d(iArr);
    }

    void D(float f2, float f3, float f4) {
        b0();
        c0(f2);
    }

    void E(Rect rect) {
        c.h.k.h.d(this.f11649l, "Didn't initialize content background");
        if (!V()) {
            this.G.c(this.f11649l);
        } else {
            this.G.c(new InsetDrawable(this.f11649l, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void F() {
        float rotation = this.F.getRotation();
        if (this.y != rotation) {
            this.y = rotation;
            Z();
        }
    }

    void G() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    void H() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean I() {
        return true;
    }

    void J(ColorStateList colorStateList) {
        e.c.b.c.c0.g gVar = this.f11646i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        if (this.f11648k != null) {
            throw null;
        }
    }

    void K(PorterDuff.Mode mode) {
        e.c.b.c.c0.g gVar = this.f11646i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void L(float f2) {
        if (this.o != f2) {
            this.o = f2;
            D(f2, this.p, this.q);
        }
    }

    void M(boolean z) {
        this.f11650m = z;
    }

    final void N(e.c.b.c.m.h hVar) {
        this.x = hVar;
    }

    final void O(float f2) {
        if (this.p != f2) {
            this.p = f2;
            D(this.o, f2, this.q);
        }
    }

    final void P(float f2) {
        this.z = f2;
        Matrix matrix = this.K;
        g(f2, matrix);
        this.F.setImageMatrix(matrix);
    }

    final void Q(float f2) {
        if (this.q != f2) {
            this.q = f2;
            D(this.o, this.p, f2);
        }
    }

    void R(ColorStateList colorStateList) {
        Drawable drawable = this.f11647j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, e.c.b.c.a0.b.d(colorStateList));
        }
    }

    void S(boolean z) {
        this.n = z;
        b0();
    }

    final void T(e.c.b.c.c0.k kVar) {
        this.f11645h = kVar;
        e.c.b.c.c0.g gVar = this.f11646i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.f11647j;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        if (this.f11648k != null) {
            throw null;
        }
    }

    final void U(e.c.b.c.m.h hVar) {
        this.w = hVar;
    }

    boolean V() {
        return true;
    }

    final boolean X() {
        return !this.f11650m || this.F.getSizeDimension() >= this.r;
    }

    void Y(j jVar, boolean z) {
        if (x()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.F.b(0, z);
            this.F.setAlpha(1.0f);
            this.F.setScaleY(1.0f);
            this.F.setScaleX(1.0f);
            P(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.F.getVisibility() != 0) {
            this.F.setAlpha(0.0f);
            this.F.setScaleY(0.0f);
            this.F.setScaleX(0.0f);
            P(0.0f);
        }
        e.c.b.c.m.h hVarL = this.w;
        if (hVarL == null) {
            hVarL = l();
        }
        AnimatorSet animatorSetH = h(hVarL, 1.0f, 1.0f, 1.0f);
        animatorSetH.addListener(new C0120b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.C;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    void Z() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.y % 90.0f != 0.0f) {
                if (this.F.getLayerType() != 1) {
                    this.F.setLayerType(1, null);
                }
            } else if (this.F.getLayerType() != 0) {
                this.F.setLayerType(0, null);
            }
        }
        e.c.b.c.c0.g gVar = this.f11646i;
        if (gVar != null) {
            gVar.b0((int) this.y);
        }
    }

    final void a0() {
        P(this.z);
    }

    final void b0() {
        Rect rect = this.H;
        r(rect);
        E(rect);
        this.G.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void c0(float f2) {
        e.c.b.c.c0.g gVar = this.f11646i;
        if (gVar != null) {
            gVar.W(f2);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(animatorListener);
    }

    void e(Animator.AnimatorListener animatorListener) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(animatorListener);
    }

    void f(i iVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(iVar);
    }

    final Drawable j() {
        return this.f11649l;
    }

    float m() {
        return this.o;
    }

    boolean n() {
        return this.f11650m;
    }

    final e.c.b.c.m.h o() {
        return this.x;
    }

    float p() {
        return this.p;
    }

    void r(Rect rect) {
        int sizeDimension = this.f11650m ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.n ? m() + this.q : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float s() {
        return this.q;
    }

    final e.c.b.c.c0.k t() {
        return this.f11645h;
    }

    final e.c.b.c.m.h u() {
        return this.w;
    }

    void v(j jVar, boolean z) {
        if (w()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.F.b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        e.c.b.c.m.h hVarK = this.x;
        if (hVarK == null) {
            hVarK = k();
        }
        AnimatorSet animatorSetH = h(hVarK, 0.0f, 0.0f, 0.0f);
        animatorSetH.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.D;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    boolean w() {
        return this.F.getVisibility() == 0 ? this.B == 1 : this.B != 2;
    }

    boolean x() {
        return this.F.getVisibility() != 0 ? this.B == 2 : this.B != 1;
    }

    void y() {
        this.s.c();
    }

    void z() {
        e.c.b.c.c0.g gVar = this.f11646i;
        if (gVar != null) {
            e.c.b.c.c0.h.f(this.F, gVar);
        }
        if (I()) {
            this.F.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}