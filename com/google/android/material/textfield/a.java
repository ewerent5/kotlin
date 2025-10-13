package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import e.c.b.c.j;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
class a extends com.google.android.material.textfield.e {

    /* renamed from: d */
    private final TextWatcher f11815d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f11816e;

    /* renamed from: f */
    private final TextInputLayout.f f11817f;

    /* renamed from: g */
    private final TextInputLayout.g f11818g;

    /* renamed from: h */
    private AnimatorSet f11819h;

    /* renamed from: i */
    private ValueAnimator f11820i;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a */
    class C0123a implements TextWatcher {
        C0123a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() != null) {
                return;
            }
            a.this.i(a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a.this.i((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && a.l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f11816e);
            editText.removeTextChangedListener(a.this.f11815d);
            editText.addTextChangedListener(a.this.f11815d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class d implements TextInputLayout.g {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.a$d$a */
        class RunnableC0124a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ EditText f11822e;

            RunnableC0124a(EditText editText) {
                this.f11822e = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f11822e.removeTextChangedListener(a.this.f11815d);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 2) {
                return;
            }
            editText.post(new RunnableC0124a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f11816e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.a.V();
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.a.setEndIconVisible(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.a.setEndIconVisible(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f11845c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f11845c.setScaleX(fFloatValue);
            a.this.f11845c.setScaleY(fFloatValue);
        }
    }

    a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f11815d = new C0123a();
        this.f11816e = new b();
        this.f11817f = new c();
        this.f11818g = new d();
    }

    public void i(boolean z) {
        boolean z2 = this.a.K() == z;
        if (z && !this.f11819h.isRunning()) {
            this.f11820i.cancel();
            this.f11819h.start();
            if (z2) {
                this.f11819h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f11819h.cancel();
        this.f11820i.start();
        if (z2) {
            this.f11820i.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.a);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new h());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.f15266d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new i());
        return valueAnimatorOfFloat;
    }

    public static boolean l(Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator valueAnimatorK = k();
        ValueAnimator valueAnimatorJ = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f11819h = animatorSet;
        animatorSet.playTogether(valueAnimatorK, valueAnimatorJ);
        this.f11819h.addListener(new f());
        ValueAnimator valueAnimatorJ2 = j(1.0f, 0.0f);
        this.f11820i = valueAnimatorJ2;
        valueAnimatorJ2.addListener(new g());
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.a.setEndIconDrawable(c.a.k.a.a.d(this.f11844b, e.c.b.c.e.f15201f));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(j.f15231e));
        this.a.setEndIconOnClickListener(new e());
        this.a.e(this.f11817f);
        this.a.f(this.f11818g);
        m();
    }

    @Override // com.google.android.material.textfield.e
    void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        i(z);
    }
}