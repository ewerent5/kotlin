package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.z;
import c.h.l.t;
import com.google.android.material.internal.CheckableImageButton;
import e.c.b.c.c0.k;
import e.c.b.c.j;
import e.c.b.c.k;
import e.c.b.c.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int f11797e = k.f15248j;
    private final TextView A;
    private int A0;
    private CharSequence B;
    private ColorStateList B0;
    private final TextView C;
    private int C0;
    private boolean D;
    private int D0;
    private CharSequence E;
    private int E0;
    private boolean F;
    private int F0;
    private e.c.b.c.c0.g G;
    private int G0;
    private e.c.b.c.c0.g H;
    private boolean H0;
    private e.c.b.c.c0.k I;
    final com.google.android.material.internal.a I0;
    private final int J;
    private boolean J0;
    private int K;
    private boolean K0;
    private int L;
    private ValueAnimator L0;
    private int M;
    private boolean M0;
    private int N;
    private boolean N0;
    private int O;
    private int P;
    private int Q;
    private final Rect R;
    private final Rect S;
    private final RectF T;
    private Typeface U;
    private final CheckableImageButton V;
    private ColorStateList W;
    private boolean a0;
    private PorterDuff.Mode b0;
    private boolean c0;
    private Drawable d0;
    private int e0;

    /* renamed from: f, reason: collision with root package name */
    private final FrameLayout f11798f;
    private View.OnLongClickListener f0;

    /* renamed from: g, reason: collision with root package name */
    private final LinearLayout f11799g;
    private final LinkedHashSet<f> g0;

    /* renamed from: h, reason: collision with root package name */
    private final LinearLayout f11800h;
    private int h0;

    /* renamed from: i, reason: collision with root package name */
    private final FrameLayout f11801i;
    private final SparseArray<com.google.android.material.textfield.e> i0;

    /* renamed from: j, reason: collision with root package name */
    EditText f11802j;
    private final CheckableImageButton j0;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f11803k;
    private final LinkedHashSet<g> k0;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.android.material.textfield.f f11804l;
    private ColorStateList l0;

    /* renamed from: m, reason: collision with root package name */
    boolean f11805m;
    private boolean m0;
    private int n;
    private PorterDuff.Mode n0;
    private boolean o;
    private boolean o0;
    private TextView p;
    private Drawable p0;
    private int q;
    private int q0;
    private int r;
    private Drawable r0;
    private CharSequence s;
    private View.OnLongClickListener s0;
    private boolean t;
    private View.OnLongClickListener t0;
    private TextView u;
    private final CheckableImageButton u0;
    private ColorStateList v;
    private ColorStateList v0;
    private int w;
    private ColorStateList w0;
    private ColorStateList x;
    private ColorStateList x0;
    private ColorStateList y;
    private int y0;
    private CharSequence z;
    private int z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            TextInputLayout.this.u0(!r0.N0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f11805m) {
                textInputLayout.n0(editable.length());
            }
            if (TextInputLayout.this.t) {
                TextInputLayout.this.y0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.j0.performClick();
            TextInputLayout.this.j0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f11802j.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            TextInputLayout.this.I0.V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends c.h.l.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f11809d;

        public e(TextInputLayout textInputLayout) {
            this.f11809d = textInputLayout;
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f11809d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f11809d.getHint();
            CharSequence error = this.f11809d.getError();
            CharSequence placeholderText = this.f11809d.getPlaceholderText();
            int counterMaxLength = this.f11809d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f11809d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f11809d.N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            if (z) {
                cVar.u0(text);
            } else if (!TextUtils.isEmpty(string)) {
                cVar.u0(string);
                if (z3 && placeholderText != null) {
                    cVar.u0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                cVar.u0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.j0(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    cVar.u0(string);
                }
                cVar.s0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.k0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.f0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(e.c.b.c.f.M);
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    static class h extends c.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        CharSequence f11810g;

        /* renamed from: h, reason: collision with root package name */
        boolean f11811h;

        /* renamed from: i, reason: collision with root package name */
        CharSequence f11812i;

        /* renamed from: j, reason: collision with root package name */
        CharSequence f11813j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f11814k;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f11810g) + " hint=" + ((Object) this.f11812i) + " helperText=" + ((Object) this.f11813j) + " placeholderText=" + ((Object) this.f11814k) + "}";
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            TextUtils.writeToParcel(this.f11810g, parcel, i2);
            parcel.writeInt(this.f11811h ? 1 : 0);
            TextUtils.writeToParcel(this.f11812i, parcel, i2);
            TextUtils.writeToParcel(this.f11813j, parcel, i2);
            TextUtils.writeToParcel(this.f11814k, parcel, i2);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11810g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11811h = parcel.readInt() == 1;
            this.f11812i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11813j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f11814k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.I);
    }

    private boolean A() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof com.google.android.material.textfield.c);
    }

    private void A0() {
        this.A.setVisibility((this.z == null || N()) ? 8 : 0);
        q0();
    }

    private void B() {
        Iterator<f> it = this.g0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B0(boolean z, boolean z2) {
        int defaultColor = this.B0.getDefaultColor();
        int colorForState = this.B0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.B0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.P = colorForState2;
        } else if (z2) {
            this.P = colorForState;
        } else {
            this.P = defaultColor;
        }
    }

    private void C(int i2) {
        Iterator<g> it = this.k0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
    }

    private void C0() {
        if (this.f11802j == null) {
            return;
        }
        t.x0(this.C, getContext().getResources().getDimensionPixelSize(e.c.b.c.d.w), this.f11802j.getPaddingTop(), (K() || L()) ? 0 : t.F(this.f11802j), this.f11802j.getPaddingBottom());
    }

    private void D(Canvas canvas) {
        e.c.b.c.c0.g gVar = this.H;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.M;
            this.H.draw(canvas);
        }
    }

    private void D0() {
        int visibility = this.C.getVisibility();
        boolean z = (this.B == null || N()) ? false : true;
        this.C.setVisibility(z ? 0 : 8);
        if (visibility != this.C.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        q0();
    }

    private void E(Canvas canvas) {
        if (this.D) {
            this.I0.j(canvas);
        }
    }

    private void F(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.L0.cancel();
        }
        if (z && this.K0) {
            i(0.0f);
        } else {
            this.I0.V(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.c) this.G).j0()) {
            y();
        }
        this.H0 = true;
        J();
        A0();
        D0();
    }

    private int G(int i2, boolean z) {
        int compoundPaddingLeft = i2 + this.f11802j.getCompoundPaddingLeft();
        return (this.z == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.A.getMeasuredWidth()) + this.A.getPaddingLeft();
    }

    private int H(int i2, boolean z) {
        int compoundPaddingRight = i2 - this.f11802j.getCompoundPaddingRight();
        return (this.z == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.A.getMeasuredWidth() - this.A.getPaddingRight());
    }

    private boolean I() {
        return this.h0 != 0;
    }

    private void J() {
        TextView textView = this.u;
        if (textView == null || !this.t) {
            return;
        }
        textView.setText((CharSequence) null);
        this.u.setVisibility(4);
    }

    private boolean L() {
        return this.u0.getVisibility() == 0;
    }

    private boolean P() {
        return this.K == 1 && (Build.VERSION.SDK_INT < 16 || this.f11802j.getMinLines() <= 1);
    }

    private int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    private void S() {
        p();
        a0();
        E0();
        k0();
        h();
        if (this.K != 0) {
            t0();
        }
    }

    private void T() {
        if (A()) {
            RectF rectF = this.T;
            this.I0.m(rectF, this.f11802j.getWidth(), this.f11802j.getGravity());
            l(rectF);
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            ((com.google.android.material.textfield.c) this.G).p0(rectF);
        }
    }

    private static void U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z);
            }
        }
    }

    private void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        androidx.core.graphics.drawable.a.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private void Z() {
        TextView textView = this.u;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void a0() {
        if (h0()) {
            t.n0(this.f11802j, this.G);
        }
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zL = t.L(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zL || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zL);
        checkableImageButton.setPressable(zL);
        checkableImageButton.setLongClickable(z);
        t.u0(checkableImageButton, z2 ? 1 : 2);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private boolean f0() {
        return (this.u0.getVisibility() == 0 || ((I() && K()) || this.B != null)) && this.f11800h.getMeasuredWidth() > 0;
    }

    private void g() {
        TextView textView = this.u;
        if (textView != null) {
            this.f11798f.addView(textView);
            this.u.setVisibility(0);
        }
    }

    private boolean g0() {
        return !(getStartIconDrawable() == null && this.z == null) && this.f11799g.getMeasuredWidth() > 0;
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.i0.get(this.h0);
        return eVar != null ? eVar : this.i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.u0.getVisibility() == 0) {
            return this.u0;
        }
        if (I() && K()) {
            return this.j0;
        }
        return null;
    }

    private void h() {
        if (this.f11802j == null || this.K != 1) {
            return;
        }
        if (e.c.b.c.z.c.h(getContext())) {
            EditText editText = this.f11802j;
            t.x0(editText, t.G(editText), getResources().getDimensionPixelSize(e.c.b.c.d.q), t.F(this.f11802j), getResources().getDimensionPixelSize(e.c.b.c.d.p));
        } else if (e.c.b.c.z.c.g(getContext())) {
            EditText editText2 = this.f11802j;
            t.x0(editText2, t.G(editText2), getResources().getDimensionPixelSize(e.c.b.c.d.o), t.F(this.f11802j), getResources().getDimensionPixelSize(e.c.b.c.d.n));
        }
    }

    private boolean h0() {
        EditText editText = this.f11802j;
        return (editText == null || this.G == null || editText.getBackground() != null || this.K == 0) ? false : true;
    }

    private void i0() {
        TextView textView = this.u;
        if (textView == null || !this.t) {
            return;
        }
        textView.setText(this.s);
        this.u.setVisibility(0);
        this.u.bringToFront();
    }

    private void j() {
        e.c.b.c.c0.g gVar = this.G;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.I);
        if (w()) {
            this.G.c0(this.M, this.P);
        }
        int iQ = q();
        this.Q = iQ;
        this.G.X(ColorStateList.valueOf(iQ));
        if (this.h0 == 3) {
            this.f11802j.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    private void j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(drawableMutate, this.f11804l.o());
        this.j0.setImageDrawable(drawableMutate);
    }

    private void k() {
        if (this.H == null) {
            return;
        }
        if (x()) {
            this.H.X(ColorStateList.valueOf(this.P));
        }
        invalidate();
    }

    private void k0() {
        if (this.K == 1) {
            if (e.c.b.c.z.c.h(getContext())) {
                this.L = getResources().getDimensionPixelSize(e.c.b.c.d.s);
            } else if (e.c.b.c.z.c.g(getContext())) {
                this.L = getResources().getDimensionPixelSize(e.c.b.c.d.r);
            }
        }
    }

    private void l(RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.J;
        rectF.left = f2 - i2;
        rectF.top -= i2;
        rectF.right += i2;
        rectF.bottom += i2;
    }

    private void l0(Rect rect) {
        e.c.b.c.c0.g gVar = this.H;
        if (gVar != null) {
            int i2 = rect.bottom;
            gVar.setBounds(rect.left, i2 - this.O, rect.right, i2);
        }
    }

    private void m() {
        n(this.j0, this.m0, this.l0, this.o0, this.n0);
    }

    private void m0() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.p != null) {
            EditText editText = this.f11802j;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void o() {
        n(this.V, this.a0, this.W, this.c0, this.b0);
    }

    private static void o0(Context context, TextView textView, int i2, int i3, boolean z) {
        textView.setContentDescription(context.getString(z ? j.f15229c : j.f15228b, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    private void p() {
        int i2 = this.K;
        if (i2 == 0) {
            this.G = null;
            this.H = null;
            return;
        }
        if (i2 == 1) {
            this.G = new e.c.b.c.c0.g(this.I);
            this.H = new e.c.b.c.c0.g();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(this.K + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.D || (this.G instanceof com.google.android.material.textfield.c)) {
                this.G = new e.c.b.c.c0.g(this.I);
            } else {
                this.G = new com.google.android.material.textfield.c(this.I);
            }
            this.H = null;
        }
    }

    private void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.p;
        if (textView != null) {
            e0(textView, this.o ? this.q : this.r);
            if (!this.o && (colorStateList2 = this.x) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.o || (colorStateList = this.y) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    private int q() {
        return this.K == 1 ? e.c.b.c.s.a.e(e.c.b.c.s.a.d(this, e.c.b.c.b.f15081l, 0), this.Q) : this.Q;
    }

    private boolean q0() {
        boolean z;
        if (this.f11802j == null) {
            return false;
        }
        boolean z2 = true;
        if (g0()) {
            int measuredWidth = this.f11799g.getMeasuredWidth() - this.f11802j.getPaddingLeft();
            if (this.d0 == null || this.e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.d0 = colorDrawable;
                this.e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.i.a(this.f11802j);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.d0;
            if (drawable != drawable2) {
                androidx.core.widget.i.l(this.f11802j, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.d0 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.i.a(this.f11802j);
                androidx.core.widget.i.l(this.f11802j, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.d0 = null;
                z = true;
            }
            z = false;
        }
        if (f0()) {
            int measuredWidth2 = this.C.getMeasuredWidth() - this.f11802j.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + c.h.l.g.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.i.a(this.f11802j);
            Drawable drawable3 = this.p0;
            if (drawable3 == null || this.q0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.p0 = colorDrawable2;
                    this.q0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.p0;
                if (drawable4 != drawable5) {
                    this.r0 = drawableArrA3[2];
                    androidx.core.widget.i.l(this.f11802j, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.q0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.i.l(this.f11802j, drawableArrA3[0], drawableArrA3[1], this.p0, drawableArrA3[3]);
            }
        } else {
            if (this.p0 == null) {
                return z;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.i.a(this.f11802j);
            if (drawableArrA4[2] == this.p0) {
                androidx.core.widget.i.l(this.f11802j, drawableArrA4[0], drawableArrA4[1], this.r0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.p0 = null;
        }
        return z2;
    }

    private Rect r(Rect rect) {
        if (this.f11802j == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.S;
        boolean z = t.B(this) == 1;
        rect2.bottom = rect.bottom;
        int i2 = this.K;
        if (i2 == 1) {
            rect2.left = G(rect.left, z);
            rect2.top = rect.top + this.L;
            rect2.right = H(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = G(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = H(rect.right, z);
            return rect2;
        }
        rect2.left = rect.left + this.f11802j.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f11802j.getPaddingRight();
        return rect2;
    }

    private int s(Rect rect, Rect rect2, float f2) {
        return P() ? (int) (rect2.top + f2) : rect.bottom - this.f11802j.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int iMax;
        if (this.f11802j == null || this.f11802j.getMeasuredHeight() >= (iMax = Math.max(this.f11800h.getMeasuredHeight(), this.f11799g.getMeasuredHeight()))) {
            return false;
        }
        this.f11802j.setMinimumHeight(iMax);
        return true;
    }

    private void setEditText(EditText editText) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11802j != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.h0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f11802j = editText;
        S();
        setTextInputAccessibilityDelegate(new e(this));
        this.I0.b0(this.f11802j.getTypeface());
        this.I0.T(this.f11802j.getTextSize());
        int gravity = this.f11802j.getGravity();
        this.I0.L((gravity & (-113)) | 48);
        this.I0.S(gravity);
        this.f11802j.addTextChangedListener(new a());
        if (this.w0 == null) {
            this.w0 = this.f11802j.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.f11802j.getHint();
                this.f11803k = hint;
                setHint(hint);
                this.f11802j.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (this.p != null) {
            n0(this.f11802j.getText().length());
        }
        r0();
        this.f11804l.e();
        this.f11799g.bringToFront();
        this.f11800h.bringToFront();
        this.f11801i.bringToFront();
        this.u0.bringToFront();
        B();
        z0();
        C0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.u0.setVisibility(z ? 0 : 8);
        this.f11801i.setVisibility(z ? 8 : 0);
        C0();
        if (I()) {
            return;
        }
        q0();
    }

    private void setHintInternal(CharSequence charSequence) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.I0.Z(charSequence);
        if (this.H0) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        if (z) {
            z zVar = new z(getContext());
            this.u = zVar;
            zVar.setId(e.c.b.c.f.N);
            t.m0(this.u, 1);
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
            g();
        } else {
            Z();
            this.u = null;
        }
        this.t = z;
    }

    private int t(Rect rect, float f2) {
        return P() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.f11802j.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.K != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11798f.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f11798f.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f11802j == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.S;
        float fU = this.I0.u();
        rect2.left = rect.left + this.f11802j.getCompoundPaddingLeft();
        rect2.top = t(rect, fU);
        rect2.right = rect.right - this.f11802j.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fU);
        return rect2;
    }

    private int v() {
        float fO;
        if (!this.D) {
            return 0;
        }
        int i2 = this.K;
        if (i2 == 0 || i2 == 1) {
            fO = this.I0.o();
        } else {
            if (i2 != 2) {
                return 0;
            }
            fO = this.I0.o() / 2.0f;
        }
        return (int) fO;
    }

    private void v0(boolean z, boolean z2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f11802j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f11802j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zK = this.f11804l.k();
        ColorStateList colorStateList2 = this.w0;
        if (colorStateList2 != null) {
            this.I0.K(colorStateList2);
            this.I0.R(this.w0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.w0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.G0) : this.G0;
            this.I0.K(ColorStateList.valueOf(colorForState));
            this.I0.R(ColorStateList.valueOf(colorForState));
        } else if (zK) {
            this.I0.K(this.f11804l.p());
        } else if (this.o && (textView = this.p) != null) {
            this.I0.K(textView.getTextColors());
        } else if (z4 && (colorStateList = this.x0) != null) {
            this.I0.K(colorStateList);
        }
        if (z3 || !this.J0 || (isEnabled() && z4)) {
            if (z2 || this.H0) {
                z(z);
                return;
            }
            return;
        }
        if (z2 || !this.H0) {
            F(z);
        }
    }

    private boolean w() {
        return this.K == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.u == null || (editText = this.f11802j) == null) {
            return;
        }
        this.u.setGravity(editText.getGravity());
        this.u.setPadding(this.f11802j.getCompoundPaddingLeft(), this.f11802j.getCompoundPaddingTop(), this.f11802j.getCompoundPaddingRight(), this.f11802j.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.M > -1 && this.P != 0;
    }

    private void x0() {
        EditText editText = this.f11802j;
        y0(editText == null ? 0 : editText.getText().length());
    }

    private void y() {
        if (A()) {
            ((com.google.android.material.textfield.c) this.G).m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(int i2) {
        if (i2 != 0 || this.H0) {
            J();
        } else {
            i0();
        }
    }

    private void z(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.L0.cancel();
        }
        if (z && this.K0) {
            i(1.0f);
        } else {
            this.I0.V(1.0f);
        }
        this.H0 = false;
        if (A()) {
            T();
        }
        x0();
        A0();
        D0();
    }

    private void z0() {
        if (this.f11802j == null) {
            return;
        }
        t.x0(this.A, Q() ? 0 : t.G(this.f11802j), this.f11802j.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(e.c.b.c.d.w), this.f11802j.getCompoundPaddingBottom());
    }

    void E0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.K == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f11802j) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f11802j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.P = this.G0;
        } else if (this.f11804l.k()) {
            if (this.B0 != null) {
                B0(z2, z3);
            } else {
                this.P = this.f11804l.o();
            }
        } else if (!this.o || (textView = this.p) == null) {
            if (z2) {
                this.P = this.A0;
            } else if (z3) {
                this.P = this.z0;
            } else {
                this.P = this.y0;
            }
        } else if (this.B0 != null) {
            B0(z2, z3);
        } else {
            this.P = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.f11804l.x() && this.f11804l.k()) {
            z = true;
        }
        setErrorIconVisible(z);
        W();
        Y();
        V();
        if (getEndIconDelegate().d()) {
            j0(this.f11804l.k());
        }
        if (z2 && isEnabled()) {
            this.M = this.O;
        } else {
            this.M = this.N;
        }
        if (this.K == 1) {
            if (!isEnabled()) {
                this.Q = this.D0;
            } else if (z3 && !z2) {
                this.Q = this.F0;
            } else if (z2) {
                this.Q = this.E0;
            } else {
                this.Q = this.C0;
            }
        }
        j();
    }

    public boolean K() {
        return this.f11801i.getVisibility() == 0 && this.j0.getVisibility() == 0;
    }

    public boolean M() {
        return this.f11804l.y();
    }

    final boolean N() {
        return this.H0;
    }

    public boolean O() {
        return this.F;
    }

    public boolean Q() {
        return this.V.getVisibility() == 0;
    }

    public void V() {
        X(this.j0, this.l0);
    }

    public void W() {
        X(this.u0, this.v0);
    }

    public void Y() {
        X(this.V, this.W);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f11798f.addView(view, layoutParams2);
        this.f11798f.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f11802j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f11803k != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f11802j.setHint(this.f11803k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f11802j.setHint(hint);
                this.F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        viewStructure.setChildCount(this.f11798f.getChildCount());
        for (int i3 = 0; i3 < this.f11798f.getChildCount(); i3++) {
            View childAt = this.f11798f.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f11802j) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.N0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.N0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.I0;
        boolean zY = aVar != null ? aVar.Y(drawableState) | false : false;
        if (this.f11802j != null) {
            u0(t.Q(this) && isEnabled());
        }
        r0();
        E0();
        if (zY) {
            invalidate();
        }
        this.M0 = false;
    }

    public void e(f fVar) {
        this.g0.add(fVar);
        if (this.f11802j != null) {
            fVar.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void e0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.i.q(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = e.c.b.c.k.a
            androidx.core.widget.i.q(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = e.c.b.c.c.a
            int r4 = androidx.core.content.a.c(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e0(android.widget.TextView, int):void");
    }

    public void f(g gVar) {
        this.k0.add(gVar);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f11802j;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    e.c.b.c.c0.g getBoxBackground() {
        int i2 = this.K;
        if (i2 == 1 || i2 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.Q;
    }

    public int getBoxBackgroundMode() {
        return this.K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.G.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.G.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.G.G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.G.F();
    }

    public int getBoxStrokeColor() {
        return this.A0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.B0;
    }

    public int getBoxStrokeWidth() {
        return this.N;
    }

    public int getBoxStrokeWidthFocused() {
        return this.O;
    }

    public int getCounterMaxLength() {
        return this.n;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f11805m && this.o && (textView = this.p) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.x;
    }

    public ColorStateList getCounterTextColor() {
        return this.x;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.w0;
    }

    public EditText getEditText() {
        return this.f11802j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.h0;
    }

    CheckableImageButton getEndIconView() {
        return this.j0;
    }

    public CharSequence getError() {
        if (this.f11804l.x()) {
            return this.f11804l.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f11804l.m();
    }

    public int getErrorCurrentTextColors() {
        return this.f11804l.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.u0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f11804l.o();
    }

    public CharSequence getHelperText() {
        if (this.f11804l.y()) {
            return this.f11804l.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f11804l.r();
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.I0.o();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.I0.r();
    }

    public ColorStateList getHintTextColor() {
        return this.x0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    public CharSequence getPrefixText() {
        return this.z;
    }

    public ColorStateList getPrefixTextColor() {
        return this.A.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.A;
    }

    public CharSequence getStartIconContentDescription() {
        return this.V.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.V.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.C;
    }

    public Typeface getTypeface() {
        return this.U;
    }

    void i(float f2) {
        if (this.I0.v() == f2) {
            return;
        }
        if (this.L0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.L0 = valueAnimator;
            valueAnimator.setInterpolator(e.c.b.c.m.a.f15264b);
            this.L0.setDuration(167L);
            this.L0.addUpdateListener(new d());
        }
        this.L0.setFloatValues(this.I0.v(), f2);
        this.L0.start();
    }

    void n0(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean z = this.o;
        int i3 = this.n;
        if (i3 == -1) {
            this.p.setText(String.valueOf(i2));
            this.p.setContentDescription(null);
            this.o = false;
        } else {
            this.o = i2 > i3;
            o0(getContext(), this.p, i2, this.n, this.o);
            if (z != this.o) {
                p0();
            }
            this.p.setText(c.h.j.a.c().j(getContext().getString(j.f15230d, Integer.valueOf(i2), Integer.valueOf(this.n))));
        }
        if (this.f11802j == null || z == this.o) {
            return;
        }
        u0(false);
        E0();
        r0();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f11802j;
        if (editText != null) {
            Rect rect = this.R;
            com.google.android.material.internal.b.a(this, editText, rect);
            l0(rect);
            if (this.D) {
                this.I0.T(this.f11802j.getTextSize());
                int gravity = this.f11802j.getGravity();
                this.I0.L((gravity & (-113)) | 48);
                this.I0.S(gravity);
                this.I0.H(r(rect));
                this.I0.P(u(rect));
                this.I0.E();
                if (!A() || this.H0) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        boolean zS0 = s0();
        boolean zQ0 = q0();
        if (zS0 || zQ0) {
            this.f11802j.post(new c());
        }
        w0();
        z0();
        C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f11810g);
        if (hVar.f11811h) {
            this.j0.post(new b());
        }
        setHint(hVar.f11812i);
        setHelperText(hVar.f11813j);
        setPlaceholderText(hVar.f11814k);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f11804l.k()) {
            hVar.f11810g = getError();
        }
        hVar.f11811h = I() && this.j0.isChecked();
        hVar.f11812i = getHint();
        hVar.f11813j = getHelperText();
        hVar.f11814k = getPlaceholderText();
        return hVar;
    }

    void r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f11802j;
        if (editText == null || this.K != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (e0.a(background)) {
            background = background.mutate();
        }
        if (this.f11804l.k()) {
            background.setColorFilter(androidx.appcompat.widget.j.e(this.f11804l.o(), PorterDuff.Mode.SRC_IN));
        } else if (this.o && (textView = this.p) != null) {
            background.setColorFilter(androidx.appcompat.widget.j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.a.c(background);
            this.f11802j.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.Q != i2) {
            this.Q = i2;
            this.C0 = i2;
            this.E0 = i2;
            this.F0 = i2;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.C0 = defaultColor;
        this.Q = defaultColor;
        this.D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 == this.K) {
            return;
        }
        this.K = i2;
        if (this.f11802j != null) {
            S();
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.A0 != i2) {
            this.A0 = i2;
            E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.y0 = colorStateList.getDefaultColor();
            this.G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.z0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.A0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.A0 != colorStateList.getDefaultColor()) {
            this.A0 = colorStateList.getDefaultColor();
        }
        E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            E0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.N = i2;
        E0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.O = i2;
        E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11805m != z) {
            if (z) {
                z zVar = new z(getContext());
                this.p = zVar;
                zVar.setId(e.c.b.c.f.K);
                Typeface typeface = this.U;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                this.f11804l.d(this.p, 2);
                c.h.l.g.d((ViewGroup.MarginLayoutParams) this.p.getLayoutParams(), getResources().getDimensionPixelOffset(e.c.b.c.d.Y));
                p0();
                m0();
            } else {
                this.f11804l.z(this.p, 2);
                this.p = null;
            }
            this.f11805m = z;
        }
    }

    public void setCounterMaxLength(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.n != i2) {
            if (i2 > 0) {
                this.n = i2;
            } else {
                this.n = -1;
            }
            if (this.f11805m) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.q != i2) {
            this.q = i2;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.r != i2) {
            this.r = i2;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.w0 = colorStateList;
        this.x0 = colorStateList;
        if (this.f11802j != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.j0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.j0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.h0;
        this.h0 = i2;
        C(i3);
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().b(this.K)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.K + " is not supported by the end icon mode " + i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.j0, onClickListener, this.s0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.s0 = onLongClickListener;
        d0(this.j0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.l0 != colorStateList) {
            this.l0 = colorStateList;
            this.m0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.n0 != mode) {
            this.n0 = mode;
            this.o0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (K() != z) {
            this.j0.setVisibility(z ? 0 : 8);
            C0();
            q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f11804l.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f11804l.t();
        } else {
            this.f11804l.M(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f11804l.B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f11804l.C(z);
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
        W();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.u0, onClickListener, this.t0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.t0 = onLongClickListener;
        d0(this.u0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        Drawable drawable = this.u0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.u0.getDrawable() != drawable) {
            this.u0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.u0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.u0.getDrawable() != drawable) {
            this.u0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        this.f11804l.D(i2);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f11804l.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.J0 != z) {
            this.J0 = z;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.f11804l.N(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f11804l.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f11804l.G(z);
    }

    public void setHelperTextTextAppearance(int i2) {
        this.f11804l.F(i2);
    }

    public void setHint(CharSequence charSequence) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.K0 = z;
    }

    public void setHintEnabled(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.f11802j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f11802j.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f11802j.getHint())) {
                    this.f11802j.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.f11802j != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.I0.I(i2);
        this.x0 = this.I0.n();
        if (this.f11802j != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.x0 != colorStateList) {
            if (this.w0 == null) {
                this.I0.K(colorStateList);
            }
            this.x0 = colorStateList;
            if (this.f11802j != null) {
                u0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.h0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        this.m0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.n0 = mode;
        this.o0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.t && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.w = i2;
        TextView textView = this.u;
        if (textView != null) {
            androidx.core.widget.i.q(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            TextView textView = this.u;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.z = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.A.setText(charSequence);
        A0();
    }

    public void setPrefixTextAppearance(int i2) {
        androidx.core.widget.i.q(this.A, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.V.setCheckable(z);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.V, onClickListener, this.f0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f0 = onLongClickListener;
        d0(this.V, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            this.a0 = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.b0 != mode) {
            this.b0 = mode;
            this.c0 = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (Q() != z) {
            this.V.setVisibility(z ? 0 : 8);
            z0();
            q0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.C.setText(charSequence);
        D0();
    }

    public void setSuffixTextAppearance(int i2) {
        androidx.core.widget.i.q(this.C, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f11802j;
        if (editText != null) {
            t.k0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (typeface != this.U) {
            this.U = typeface;
            this.I0.b0(typeface);
            this.f11804l.J(typeface);
            TextView textView = this.p;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        v0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i2) throws NoSuchMethodException, Resources.NotFoundException, SecurityException, ClassNotFoundException {
        int i3;
        int i4;
        int i5 = f11797e;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i5), attributeSet, i2);
        this.f11804l = new com.google.android.material.textfield.f(this);
        this.R = new Rect();
        this.S = new Rect();
        this.T = new RectF();
        this.g0 = new LinkedHashSet<>();
        this.h0 = 0;
        this.i0 = new SparseArray<>();
        this.k0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.I0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f11798f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f11799g = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f11800h = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f11801i = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = e.c.b.c.m.a.a;
        aVar.a0(timeInterpolator);
        aVar.X(timeInterpolator);
        aVar.L(8388659);
        int[] iArr = l.c5;
        int i6 = l.v5;
        int i7 = l.t5;
        int i8 = l.I5;
        int i9 = l.N5;
        int i10 = l.R5;
        w0 w0VarI = com.google.android.material.internal.j.i(context2, attributeSet, iArr, i2, i5, i6, i7, i8, i9, i10);
        this.D = w0VarI.a(l.Q5, true);
        setHint(w0VarI.p(l.f5));
        this.K0 = w0VarI.a(l.P5, true);
        this.J0 = w0VarI.a(l.K5, true);
        this.I = e.c.b.c.c0.k.e(context2, attributeSet, i2, i5).m();
        this.J = context2.getResources().getDimensionPixelOffset(e.c.b.c.d.V);
        this.L = w0VarI.e(l.i5, 0);
        this.N = w0VarI.f(l.p5, context2.getResources().getDimensionPixelSize(e.c.b.c.d.W));
        this.O = w0VarI.f(l.q5, context2.getResources().getDimensionPixelSize(e.c.b.c.d.X));
        this.M = this.N;
        float fD = w0VarI.d(l.m5, -1.0f);
        float fD2 = w0VarI.d(l.l5, -1.0f);
        float fD3 = w0VarI.d(l.j5, -1.0f);
        float fD4 = w0VarI.d(l.k5, -1.0f);
        k.b bVarV = this.I.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.I = bVarV.m();
        ColorStateList colorStateListB = e.c.b.c.z.c.b(context2, w0VarI, l.g5);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.C0 = defaultColor;
            this.Q = defaultColor;
            if (colorStateListB.isStateful()) {
                this.D0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                i3 = 2;
                this.E0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.F0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                i3 = 2;
                this.E0 = this.C0;
                ColorStateList colorStateListC = c.a.k.a.a.c(context2, e.c.b.c.c.f15095c);
                this.D0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.F0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            i3 = 2;
            this.Q = 0;
            this.C0 = 0;
            this.D0 = 0;
            this.E0 = 0;
            this.F0 = 0;
        }
        int i11 = l.e5;
        if (w0VarI.s(i11)) {
            ColorStateList colorStateListC2 = w0VarI.c(i11);
            this.x0 = colorStateListC2;
            this.w0 = colorStateListC2;
        }
        int i12 = l.n5;
        ColorStateList colorStateListB2 = e.c.b.c.z.c.b(context2, w0VarI, i12);
        this.A0 = w0VarI.b(i12, 0);
        this.y0 = androidx.core.content.a.c(context2, e.c.b.c.c.f15096d);
        this.G0 = androidx.core.content.a.c(context2, e.c.b.c.c.f15097e);
        this.z0 = androidx.core.content.a.c(context2, e.c.b.c.c.f15098f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i13 = l.o5;
        if (w0VarI.s(i13)) {
            setBoxStrokeErrorColor(e.c.b.c.z.c.b(context2, w0VarI, i13));
        }
        if (w0VarI.n(i10, -1) != -1) {
            setHintTextAppearance(w0VarI.n(i10, 0));
        }
        int iN = w0VarI.n(i8, 0);
        CharSequence charSequenceP = w0VarI.p(l.D5);
        boolean zA = w0VarI.a(l.E5, false);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i14 = e.c.b.c.h.f15220f;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i14, (ViewGroup) linearLayout2, false);
        this.u0 = checkableImageButton;
        checkableImageButton.setId(e.c.b.c.f.J);
        checkableImageButton.setVisibility(8);
        if (e.c.b.c.z.c.g(context2)) {
            c.h.l.g.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        int i15 = l.F5;
        if (w0VarI.s(i15)) {
            setErrorIconDrawable(w0VarI.g(i15));
        }
        int i16 = l.G5;
        if (w0VarI.s(i16)) {
            setErrorIconTintList(e.c.b.c.z.c.b(context2, w0VarI, i16));
        }
        int i17 = l.H5;
        if (w0VarI.s(i17)) {
            setErrorIconTintMode(com.google.android.material.internal.k.e(w0VarI.k(i17, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(j.f15232f));
        t.u0(checkableImageButton, i3);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = w0VarI.n(i9, 0);
        boolean zA2 = w0VarI.a(l.M5, false);
        CharSequence charSequenceP2 = w0VarI.p(l.L5);
        int iN3 = w0VarI.n(l.Z5, 0);
        CharSequence charSequenceP3 = w0VarI.p(l.Y5);
        int iN4 = w0VarI.n(l.c6, 0);
        CharSequence charSequenceP4 = w0VarI.p(l.b6);
        int iN5 = w0VarI.n(l.k6, 0);
        CharSequence charSequenceP5 = w0VarI.p(l.j6);
        boolean zA3 = w0VarI.a(l.r5, false);
        setCounterMaxLength(w0VarI.k(l.s5, -1));
        this.r = w0VarI.n(i6, 0);
        this.q = w0VarI.n(i7, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(e.c.b.c.h.f15221g, (ViewGroup) this.f11799g, false);
        this.V = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (e.c.b.c.z.c.g(context2)) {
            c.h.l.g.c((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i18 = l.g6;
        if (w0VarI.s(i18)) {
            setStartIconDrawable(w0VarI.g(i18));
            int i19 = l.f6;
            if (w0VarI.s(i19)) {
                setStartIconContentDescription(w0VarI.p(i19));
            }
            setStartIconCheckable(w0VarI.a(l.e6, true));
        }
        int i20 = l.h6;
        if (w0VarI.s(i20)) {
            setStartIconTintList(e.c.b.c.z.c.b(context2, w0VarI, i20));
        }
        int i21 = l.i6;
        if (w0VarI.s(i21)) {
            setStartIconTintMode(com.google.android.material.internal.k.e(w0VarI.k(i21, -1), null));
        }
        setBoxBackgroundMode(w0VarI.k(l.h5, 0));
        this.j0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i14, (ViewGroup) this.f11801i, false);
        this.f11801i.addView(this.j0);
        this.j0.setVisibility(8);
        if (e.c.b.c.z.c.g(context2)) {
            i4 = 0;
            c.h.l.g.d((ViewGroup.MarginLayoutParams) this.j0.getLayoutParams(), 0);
        } else {
            i4 = 0;
        }
        this.i0.append(-1, new com.google.android.material.textfield.b(this));
        this.i0.append(i4, new com.google.android.material.textfield.h(this));
        this.i0.append(1, new i(this));
        this.i0.append(2, new com.google.android.material.textfield.a(this));
        this.i0.append(3, new com.google.android.material.textfield.d(this));
        int i22 = l.A5;
        if (w0VarI.s(i22)) {
            setEndIconMode(w0VarI.k(i22, 0));
            int i23 = l.z5;
            if (w0VarI.s(i23)) {
                setEndIconDrawable(w0VarI.g(i23));
            }
            int i24 = l.y5;
            if (w0VarI.s(i24)) {
                setEndIconContentDescription(w0VarI.p(i24));
            }
            setEndIconCheckable(w0VarI.a(l.x5, true));
        } else {
            int i25 = l.V5;
            if (w0VarI.s(i25)) {
                setEndIconMode(w0VarI.a(i25, false) ? 1 : 0);
                setEndIconDrawable(w0VarI.g(l.U5));
                setEndIconContentDescription(w0VarI.p(l.T5));
                int i26 = l.W5;
                if (w0VarI.s(i26)) {
                    setEndIconTintList(e.c.b.c.z.c.b(context2, w0VarI, i26));
                }
                int i27 = l.X5;
                if (w0VarI.s(i27)) {
                    setEndIconTintMode(com.google.android.material.internal.k.e(w0VarI.k(i27, -1), null));
                }
            }
        }
        if (!w0VarI.s(l.V5)) {
            int i28 = l.B5;
            if (w0VarI.s(i28)) {
                setEndIconTintList(e.c.b.c.z.c.b(context2, w0VarI, i28));
            }
            int i29 = l.C5;
            if (w0VarI.s(i29)) {
                setEndIconTintMode(com.google.android.material.internal.k.e(w0VarI.k(i29, -1), null));
            }
        }
        z zVar = new z(context2);
        this.A = zVar;
        zVar.setId(e.c.b.c.f.O);
        zVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        t.m0(zVar, 1);
        this.f11799g.addView(this.V);
        this.f11799g.addView(zVar);
        z zVar2 = new z(context2);
        this.C = zVar2;
        zVar2.setId(e.c.b.c.f.P);
        zVar2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        t.m0(zVar2, 1);
        this.f11800h.addView(zVar2);
        this.f11800h.addView(this.u0);
        this.f11800h.addView(this.f11801i);
        setHelperTextEnabled(zA2);
        setHelperText(charSequenceP2);
        setHelperTextTextAppearance(iN2);
        setErrorEnabled(zA);
        setErrorTextAppearance(iN);
        setErrorContentDescription(charSequenceP);
        setCounterTextAppearance(this.r);
        setCounterOverflowTextAppearance(this.q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setPrefixText(charSequenceP4);
        setPrefixTextAppearance(iN4);
        setSuffixText(charSequenceP5);
        setSuffixTextAppearance(iN5);
        int i30 = l.J5;
        if (w0VarI.s(i30)) {
            setErrorTextColor(w0VarI.c(i30));
        }
        int i31 = l.O5;
        if (w0VarI.s(i31)) {
            setHelperTextColor(w0VarI.c(i31));
        }
        int i32 = l.S5;
        if (w0VarI.s(i32)) {
            setHintTextColor(w0VarI.c(i32));
        }
        int i33 = l.w5;
        if (w0VarI.s(i33)) {
            setCounterTextColor(w0VarI.c(i33));
        }
        int i34 = l.u5;
        if (w0VarI.s(i34)) {
            setCounterOverflowTextColor(w0VarI.c(i34));
        }
        int i35 = l.a6;
        if (w0VarI.s(i35)) {
            setPlaceholderTextColor(w0VarI.c(i35));
        }
        int i36 = l.d6;
        if (w0VarI.s(i36)) {
            setPrefixTextColor(w0VarI.c(i36));
        }
        int i37 = l.l6;
        if (w0VarI.s(i37)) {
            setSuffixTextColor(w0VarI.c(i37));
        }
        setCounterEnabled(zA3);
        setEnabled(w0VarI.a(l.d5, true));
        w0VarI.w();
        t.u0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            t.v0(this, 1);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.j0.setImageDrawable(drawable);
        V();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.V.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.V.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.u0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f11804l.x());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.j0.setImageDrawable(drawable);
    }

    public void setHint(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}