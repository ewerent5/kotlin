package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    static final Handler a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f11718b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f11719c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f11720d;

    /* renamed from: e, reason: collision with root package name */
    private final ViewGroup f11721e;

    /* renamed from: f, reason: collision with root package name */
    private final Context f11722f;

    /* renamed from: g, reason: collision with root package name */
    protected final w f11723g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f11724h;

    /* renamed from: i, reason: collision with root package name */
    private int f11725i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11726j;

    /* renamed from: k, reason: collision with root package name */
    private View f11727k;
    private Rect o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private List<s<B>> u;
    private Behavior v;
    private final AccessibilityManager w;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11728l = false;

    /* renamed from: m, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f11729m = new k();
    private final Runnable n = new l();
    b.InterfaceC0122b x = new o();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        private final t f11730k = new t(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f11730k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f11730k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f11730k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = BaseTransientBottomBar.this.f11723g;
            if (wVar == null) {
                return;
            }
            if (wVar.getParent() != null) {
                BaseTransientBottomBar.this.f11723g.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f11723g.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.T();
            } else {
                BaseTransientBottomBar.this.V();
            }
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        c(int i2) {
            this.a = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.a);
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f11723g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f11723g.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f11723g.setScaleY(fFloatValue);
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11724h.a(70, 180);
        }
    }

    class g implements ValueAnimator.AnimatorUpdateListener {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11733b;

        g(int i2) {
            this.f11733b = i2;
            this.a = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f11718b) {
                c.h.l.t.W(BaseTransientBottomBar.this.f11723g, iIntValue - this.a);
            } else {
                BaseTransientBottomBar.this.f11723g.setTranslationY(iIntValue);
            }
            this.a = iIntValue;
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        h(int i2) {
            this.a = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f11724h.b(0, 180);
        }
    }

    class i implements ValueAnimator.AnimatorUpdateListener {
        private int a = 0;

        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f11718b) {
                c.h.l.t.W(BaseTransientBottomBar.this.f11723g, iIntValue - this.a);
            } else {
                BaseTransientBottomBar.this.f11723g.setTranslationY(iIntValue);
            }
            this.a = iIntValue;
        }
    }

    static class j implements Handler.Callback {
        j() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                ((BaseTransientBottomBar) message.obj).R();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).H(message.arg1);
            return true;
        }
    }

    class k implements ViewTreeObserver.OnGlobalLayoutListener {
        k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f11728l) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                baseTransientBottomBar.t = baseTransientBottomBar.u();
                BaseTransientBottomBar.this.X();
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iC;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f11723g == null || baseTransientBottomBar.f11722f == null || (iC = (BaseTransientBottomBar.this.C() - BaseTransientBottomBar.this.F()) + ((int) BaseTransientBottomBar.this.f11723g.getTranslationY())) >= BaseTransientBottomBar.this.s) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f11723g.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f11720d, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.s - iC;
            BaseTransientBottomBar.this.f11723g.requestLayout();
        }
    }

    class m implements c.h.l.p {
        m() {
        }

        @Override // c.h.l.p
        public b0 a(View view, b0 b0Var) {
            BaseTransientBottomBar.this.p = b0Var.e();
            BaseTransientBottomBar.this.q = b0Var.f();
            BaseTransientBottomBar.this.r = b0Var.g();
            BaseTransientBottomBar.this.X();
            return b0Var;
        }
    }

    class n extends c.h.l.a {
        n() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.a(1048576);
            cVar.d0(true);
        }

        @Override // c.h.l.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.j(view, i2, bundle);
            }
            BaseTransientBottomBar.this.v();
            return true;
        }
    }

    class o implements b.InterfaceC0122b {
        o() {
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0122b
        public void a(int i2) {
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0122b
        public void b() {
            Handler handler = BaseTransientBottomBar.a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class p implements u {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.K(3);
            }
        }

        p() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.u
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f11723g.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.X();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.u
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.I()) {
                BaseTransientBottomBar.a.post(new a());
            }
        }
    }

    class q implements v {
        q() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.v
        public void a(View view, int i2, int i3, int i4, int i5) {
            BaseTransientBottomBar.this.f11723g.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.S();
        }
    }

    class r implements SwipeDismissBehavior.c {
        r() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.w(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i2) {
            if (i2 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.x);
            } else if (i2 == 1 || i2 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.x);
            }
        }
    }

    public static abstract class s<B> {
        public void a(B b2, int i2) {
        }

        public void b(B b2) {
        }
    }

    public static class t {
        private b.InterfaceC0122b a;

        public t(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof w;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.x;
        }
    }

    protected interface u {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface v {
        void a(View view, int i2, int i3, int i4, int i5);
    }

    protected static class w extends FrameLayout {

        /* renamed from: e, reason: collision with root package name */
        private static final View.OnTouchListener f11741e = new a();

        /* renamed from: f, reason: collision with root package name */
        private v f11742f;

        /* renamed from: g, reason: collision with root package name */
        private u f11743g;

        /* renamed from: h, reason: collision with root package name */
        private int f11744h;

        /* renamed from: i, reason: collision with root package name */
        private final float f11745i;

        /* renamed from: j, reason: collision with root package name */
        private final float f11746j;

        /* renamed from: k, reason: collision with root package name */
        private ColorStateList f11747k;

        /* renamed from: l, reason: collision with root package name */
        private PorterDuff.Mode f11748l;

        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected w(Context context, AttributeSet attributeSet) {
            super(com.google.android.material.theme.a.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, e.c.b.c.l.T3);
            if (typedArrayObtainStyledAttributes.hasValue(e.c.b.c.l.a4)) {
                c.h.l.t.r0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r1, 0));
            }
            this.f11744h = typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.W3, 0);
            this.f11745i = typedArrayObtainStyledAttributes.getFloat(e.c.b.c.l.X3, 1.0f);
            setBackgroundTintList(e.c.b.c.z.c.a(context2, typedArrayObtainStyledAttributes, e.c.b.c.l.Y3));
            setBackgroundTintMode(com.google.android.material.internal.k.e(typedArrayObtainStyledAttributes.getInt(e.c.b.c.l.Z3, -1), PorterDuff.Mode.SRC_IN));
            this.f11746j = typedArrayObtainStyledAttributes.getFloat(e.c.b.c.l.V3, 1.0f);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f11741e);
            setFocusable(true);
            if (getBackground() == null) {
                c.h.l.t.n0(this, a());
            }
        }

        private Drawable a() throws Resources.NotFoundException {
            float dimension = getResources().getDimension(e.c.b.c.d.T);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(e.c.b.c.s.a.g(this, e.c.b.c.b.f15081l, e.c.b.c.b.f15078i, getBackgroundOverlayColorAlpha()));
            if (this.f11747k == null) {
                return androidx.core.graphics.drawable.a.r(gradientDrawable);
            }
            Drawable drawableR = androidx.core.graphics.drawable.a.r(gradientDrawable);
            androidx.core.graphics.drawable.a.o(drawableR, this.f11747k);
            return drawableR;
        }

        float getActionTextColorAlpha() {
            return this.f11746j;
        }

        int getAnimationMode() {
            return this.f11744h;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f11745i;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            u uVar = this.f11743g;
            if (uVar != null) {
                uVar.onViewAttachedToWindow(this);
            }
            c.h.l.t.h0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            u uVar = this.f11743g;
            if (uVar != null) {
                uVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            v vVar = this.f11742f;
            if (vVar != null) {
                vVar.a(this, i2, i3, i4, i5);
            }
        }

        void setAnimationMode(int i2) {
            this.f11744h = i2;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f11747k != null) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f11747k);
                androidx.core.graphics.drawable.a.p(drawable, this.f11748l);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f11747k = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(drawableR, colorStateList);
                androidx.core.graphics.drawable.a.p(drawableR, this.f11748l);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f11748l = mode;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        void setOnAttachStateChangeListener(u uVar) {
            this.f11743g = uVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f11741e);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(v vVar) {
            this.f11742f = vVar;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f11718b = i2 >= 16 && i2 <= 19;
        f11719c = new int[]{e.c.b.c.b.y};
        f11720d = BaseTransientBottomBar.class.getSimpleName();
        a = new Handler(Looper.getMainLooper(), new j());
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f11721e = viewGroup;
        this.f11724h = aVar;
        this.f11722f = context;
        com.google.android.material.internal.j.a(context);
        w wVar = (w) LayoutInflater.from(context).inflate(D(), viewGroup, false);
        this.f11723g = wVar;
        if (view instanceof SnackbarContentLayout) {
            ((SnackbarContentLayout) view).c(wVar.getActionTextColorAlpha());
        }
        wVar.addView(view);
        ViewGroup.LayoutParams layoutParams = wVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.o = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        c.h.l.t.m0(wVar, 1);
        c.h.l.t.u0(wVar, 1);
        c.h.l.t.s0(wVar, true);
        c.h.l.t.w0(wVar, new m());
        c.h.l.t.k0(wVar, new n());
        this.w = (AccessibilityManager) context.getSystemService("accessibility");
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.f15266d);
        valueAnimatorOfFloat.addUpdateListener(new e());
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        WindowManager windowManager = (WindowManager) this.f11722f.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private int E() {
        int height = this.f11723g.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f11723g.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        int[] iArr = new int[2];
        this.f11723g.getLocationOnScreen(iArr);
        return iArr[1] + this.f11723g.getHeight();
    }

    private boolean J() {
        ViewGroup.LayoutParams layoutParams = this.f11723g.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void N(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorA = this.v;
        if (swipeDismissBehaviorA == null) {
            swipeDismissBehaviorA = A();
        }
        if (swipeDismissBehaviorA instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorA).P(this);
        }
        swipeDismissBehaviorA.K(new r());
        fVar.o(swipeDismissBehaviorA);
        if (this.f11727k == null) {
            fVar.f801g = 80;
        }
    }

    private boolean P() {
        return this.s > 0 && !this.f11726j && J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        if (O()) {
            s();
            return;
        }
        if (this.f11723g.getParent() != null) {
            this.f11723g.setVisibility(0);
        }
        L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        ValueAnimator valueAnimatorX = x(0.0f, 1.0f);
        ValueAnimator valueAnimatorB = B(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorX, valueAnimatorB);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    private void U(int i2) {
        ValueAnimator valueAnimatorX = x(1.0f, 0.0f);
        valueAnimatorX.setDuration(75L);
        valueAnimatorX.addListener(new c(i2));
        valueAnimatorX.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        int iE = E();
        if (f11718b) {
            c.h.l.t.W(this.f11723g, iE);
        } else {
            this.f11723g.setTranslationY(iE);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iE, 0);
        valueAnimator.setInterpolator(e.c.b.c.m.a.f15264b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(iE));
        valueAnimator.start();
    }

    private void W(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, E());
        valueAnimator.setInterpolator(e.c.b.c.m.a.f15264b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new h(i2));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f11723g.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.o) == null) {
            Log.w(f11720d, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f11727k != null ? this.t : this.p);
        marginLayoutParams.leftMargin = rect.left + this.q;
        marginLayoutParams.rightMargin = rect.right + this.r;
        this.f11723g.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !P()) {
            return;
        }
        this.f11723g.removeCallbacks(this.n);
        this.f11723g.post(this.n);
    }

    private void t(int i2) {
        if (this.f11723g.getAnimationMode() == 1) {
            U(i2);
        } else {
            W(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u() {
        View view = this.f11727k;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.f11721e.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f11721e.getHeight()) - i2;
    }

    private ValueAnimator x(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.a);
        valueAnimatorOfFloat.addUpdateListener(new d());
        return valueAnimatorOfFloat;
    }

    protected SwipeDismissBehavior<? extends View> A() {
        return new Behavior();
    }

    protected int D() {
        return G() ? e.c.b.c.h.t : e.c.b.c.h.a;
    }

    protected boolean G() {
        TypedArray typedArrayObtainStyledAttributes = this.f11722f.obtainStyledAttributes(f11719c);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void H(int i2) {
        if (O() && this.f11723g.getVisibility() == 0) {
            t(i2);
        } else {
            K(i2);
        }
    }

    public boolean I() {
        return com.google.android.material.snackbar.b.c().e(this.x);
    }

    void K(int i2) {
        com.google.android.material.snackbar.b.c().h(this.x);
        List<s<B>> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).a(this, i2);
            }
        }
        ViewParent parent = this.f11723g.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f11723g);
        }
    }

    void L() {
        com.google.android.material.snackbar.b.c().i(this.x);
        List<s<B>> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u.get(size).b(this);
            }
        }
    }

    public B M(int i2) {
        this.f11725i = i2;
        return this;
    }

    boolean O() {
        AccessibilityManager accessibilityManager = this.w;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void Q() {
        com.google.android.material.snackbar.b.c().m(z(), this.x);
    }

    final void R() {
        this.f11723g.setOnAttachStateChangeListener(new p());
        if (this.f11723g.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f11723g.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                N((CoordinatorLayout.f) layoutParams);
            }
            this.t = u();
            X();
            this.f11723g.setVisibility(4);
            this.f11721e.addView(this.f11723g);
        }
        if (c.h.l.t.Q(this.f11723g)) {
            S();
        } else {
            this.f11723g.setOnLayoutChangeListener(new q());
        }
    }

    void s() {
        this.f11723g.post(new a());
    }

    public void v() {
        w(3);
    }

    protected void w(int i2) {
        com.google.android.material.snackbar.b.c().b(this.x, i2);
    }

    public Context y() {
        return this.f11722f;
    }

    public int z() {
        return this.f11725i;
    }
}