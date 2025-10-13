package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c.h.j.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView.java */
/* loaded from: classes.dex */
public class z extends TextView implements c.h.l.s, androidx.core.widget.k, androidx.core.widget.b {

    /* renamed from: e, reason: collision with root package name */
    private final e f646e;

    /* renamed from: f, reason: collision with root package name */
    private final y f647f;

    /* renamed from: g, reason: collision with root package name */
    private final x f648g;

    /* renamed from: h, reason: collision with root package name */
    private Future<c.h.j.c> f649h;

    public z(Context context) {
        this(context, null);
    }

    private void f() {
        Future<c.h.j.c> future = this.f649h;
        if (future != null) {
            try {
                this.f649h = null;
                androidx.core.widget.i.p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f646e;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f647f;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f647f;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f647f;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f647f;
        return yVar != null ? yVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f647f;
        if (yVar != null) {
            return yVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.i.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.i.c(this);
    }

    @Override // c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f646e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f646e;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f647f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f647f.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f648g) == null) ? super.getTextClassifier() : xVar.a();
    }

    public c.a getTextMetricsParamsCompat() {
        return androidx.core.widget.i.g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.o(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        f();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f647f;
        if (yVar == null || androidx.core.widget.b.a || !yVar.l()) {
            return;
        }
        this.f647f.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.s(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.t(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (androidx.core.widget.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.u(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f646e;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f646e;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            androidx.core.widget.i.m(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            androidx.core.widget.i.n(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        androidx.core.widget.i.o(this, i2);
    }

    public void setPrecomputedText(c.h.j.c cVar) {
        androidx.core.widget.i.p(this, cVar);
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f646e;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f646e;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f647f.v(colorStateList);
        this.f647f.b();
    }

    @Override // androidx.core.widget.k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f647f.w(mode);
        this.f647f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f648g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<c.h.j.c> future) {
        this.f649h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c.a aVar) {
        androidx.core.widget.i.r(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (androidx.core.widget.b.a) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.z(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        Typeface typefaceA = (typeface == null || i2 <= 0) ? null : c.h.d.d.a(getContext(), typeface, i2);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        super.setTypeface(typeface, i2);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public z(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.f646e = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f647f = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
        this.f648g = new x(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? c.a.k.a.a.d(context, i2) : null, i3 != 0 ? c.a.k.a.a.d(context, i3) : null, i4 != 0 ? c.a.k.a.a.d(context, i4) : null, i5 != 0 ? c.a.k.a.a.d(context, i5) : null);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? c.a.k.a.a.d(context, i2) : null, i3 != 0 ? c.a.k.a.a.d(context, i3) : null, i4 != 0 ? c.a.k.a.a.d(context, i4) : null, i5 != 0 ? c.a.k.a.a.d(context, i5) : null);
        y yVar = this.f647f;
        if (yVar != null) {
            yVar.p();
        }
    }
}