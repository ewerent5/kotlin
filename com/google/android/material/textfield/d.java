package com.google.android.material.textfield;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c.h.l.t;
import com.google.android.material.textfield.TextInputLayout;
import e.c.b.c.c0.k;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
class d extends com.google.android.material.textfield.e {

    /* renamed from: d */
    private static final boolean f11825d;

    /* renamed from: e */
    private final TextWatcher f11826e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f11827f;

    /* renamed from: g */
    private final TextInputLayout.e f11828g;

    /* renamed from: h */
    private final TextInputLayout.f f11829h;

    /* renamed from: i */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.g f11830i;

    /* renamed from: j */
    private boolean f11831j;

    /* renamed from: k */
    private boolean f11832k;

    /* renamed from: l */
    private long f11833l;

    /* renamed from: m */
    private StateListDrawable f11834m;
    private e.c.b.c.c0.g n;
    private AccessibilityManager o;
    private ValueAnimator p;
    private ValueAnimator q;

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class a extends com.google.android.material.internal.i {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.d$a$a */
        class RunnableC0125a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ AutoCompleteTextView f11836e;

            RunnableC0125a(AutoCompleteTextView autoCompleteTextView) {
                this.f11836e = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f11836e.isPopupShowing();
                d.this.E(zIsPopupShowing);
                d.this.f11831j = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.a.getEditText());
            if (d.this.o.isTouchExplorationEnabled() && d.D(autoCompleteTextViewY) && !d.this.f11845c.hasFocus()) {
                autoCompleteTextViewY.dismissDropDown();
            }
            autoCompleteTextViewY.post(new RunnableC0125a(autoCompleteTextViewY));
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f11845c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.a.setEndIconActivated(z);
            if (z) {
                return;
            }
            d.this.E(false);
            d.this.f11831j = false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.d$d */
    class C0126d extends TextInputLayout.e {
        C0126d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            if (!d.D(d.this.a.getEditText())) {
                cVar.Y(Spinner.class.getName());
            }
            if (cVar.K()) {
                cVar.j0(null);
            }
        }

        @Override // c.h.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.o.isTouchExplorationEnabled() && !d.D(d.this.a.getEditText())) {
                d.this.H(autoCompleteTextViewY);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class e implements TextInputLayout.f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(textInputLayout.getEditText());
            d.this.F(autoCompleteTextViewY);
            d.this.v(autoCompleteTextViewY);
            d.this.G(autoCompleteTextViewY);
            autoCompleteTextViewY.setThreshold(0);
            autoCompleteTextViewY.removeTextChangedListener(d.this.f11826e);
            autoCompleteTextViewY.addTextChangedListener(d.this.f11826e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(autoCompleteTextViewY)) {
                t.u0(d.this.f11845c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f11828g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class f implements TextInputLayout.g {

        /* compiled from: DropdownMenuEndIconDelegate.java */
        class a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ AutoCompleteTextView f11839e;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f11839e = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11839e.removeTextChangedListener(d.this.f11826e);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i2 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f11827f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f11825d) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.a.getEditText());
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class h implements View.OnTouchListener {

        /* renamed from: e */
        final /* synthetic */ AutoCompleteTextView f11842e;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f11842e = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f11831j = false;
                }
                d.this.H(this.f11842e);
            }
            return false;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f11831j = true;
            d.this.f11833l = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate.java */
    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f11845c.setChecked(dVar.f11832k);
            d.this.q.start();
        }
    }

    static {
        f11825d = Build.VERSION.SDK_INT >= 21;
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f11826e = new a();
        this.f11827f = new c();
        this.f11828g = new C0126d(this.a);
        this.f11829h = new e();
        this.f11830i = new f();
        this.f11831j = false;
        this.f11832k = false;
        this.f11833l = Long.MAX_VALUE;
    }

    private e.c.b.c.c0.g A(float f2, float f3, float f4, int i2) {
        k kVarM = k.a().A(f2).E(f2).s(f3).w(f3).m();
        e.c.b.c.c0.g gVarM = e.c.b.c.c0.g.m(this.f11844b, f4);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.Z(0, i2, 0, i2);
        return gVarM;
    }

    private void B() {
        this.q = z(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(50, 1.0f, 0.0f);
        this.p = valueAnimatorZ;
        valueAnimatorZ.addListener(new j());
    }

    public boolean C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f11833l;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public void E(boolean z) {
        if (this.f11832k != z) {
            this.f11832k = z;
            this.q.cancel();
            this.p.start();
        }
    }

    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (f11825d) {
            int boxBackgroundMode = this.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f11834m);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f11827f);
        if (f11825d) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f11831j = false;
        }
        if (this.f11831j) {
            this.f11831j = false;
            return;
        }
        if (f11825d) {
            E(!this.f11832k);
        } else {
            this.f11832k = !this.f11832k;
            this.f11845c.toggle();
        }
        if (!this.f11832k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    public void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.a.getBoxBackgroundMode();
        e.c.b.c.c0.g boxBackground = this.a.getBoxBackground();
        int iC = e.c.b.c.s.a.c(autoCompleteTextView, e.c.b.c.b.f15077h);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, iC, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, iC, iArr, boxBackground);
        }
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, e.c.b.c.c0.g gVar) {
        int boxBackgroundColor = this.a.getBoxBackgroundColor();
        int[] iArr2 = {e.c.b.c.s.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f11825d) {
            t.n0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        e.c.b.c.c0.g gVar2 = new e.c.b.c.c0.g(gVar.C());
        gVar2.X(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int iG = t.G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iF = t.F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        t.n0(autoCompleteTextView, layerDrawable);
        t.x0(autoCompleteTextView, iG, paddingTop, iF, paddingBottom);
    }

    private void x(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, e.c.b.c.c0.g gVar) {
        LayerDrawable layerDrawable;
        int iC = e.c.b.c.s.a.c(autoCompleteTextView, e.c.b.c.b.f15081l);
        e.c.b.c.c0.g gVar2 = new e.c.b.c.c0.g(gVar.C());
        int iF = e.c.b.c.s.a.f(i2, iC, 0.1f);
        gVar2.X(new ColorStateList(iArr, new int[]{iF, 0}));
        if (f11825d) {
            gVar2.setTint(iC);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iC});
            e.c.b.c.c0.g gVar3 = new e.c.b.c.c0.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        t.n0(autoCompleteTextView, layerDrawable);
    }

    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.a);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.e
    void a() throws Resources.NotFoundException {
        float dimensionPixelOffset = this.f11844b.getResources().getDimensionPixelOffset(e.c.b.c.d.S);
        float dimensionPixelOffset2 = this.f11844b.getResources().getDimensionPixelOffset(e.c.b.c.d.P);
        int dimensionPixelOffset3 = this.f11844b.getResources().getDimensionPixelOffset(e.c.b.c.d.Q);
        e.c.b.c.c0.g gVarA = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        e.c.b.c.c0.g gVarA2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = gVarA;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f11834m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarA);
        this.f11834m.addState(new int[0], gVarA2);
        this.a.setEndIconDrawable(c.a.k.a.a.d(this.f11844b, f11825d ? e.c.b.c.e.f15199d : e.c.b.c.e.f15200e));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(e.c.b.c.j.f15233g));
        this.a.setEndIconOnClickListener(new g());
        this.a.e(this.f11829h);
        this.a.f(this.f11830i);
        B();
        this.o = (AccessibilityManager) this.f11844b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}