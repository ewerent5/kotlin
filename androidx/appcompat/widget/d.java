package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* compiled from: AppCompatAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class d extends AutoCompleteTextView implements c.h.l.s {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f432e = {R.attr.popupBackground};

    /* renamed from: f, reason: collision with root package name */
    private final e f433f;

    /* renamed from: g, reason: collision with root package name */
    private final y f434g;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.p);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f433f;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f434g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f433f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f433f;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f433f;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f433f;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.s(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(c.a.k.a.a.d(getContext(), i2));
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f433f;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f433f;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f434g;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        w0 w0VarV = w0.v(getContext(), attributeSet, f432e, i2, 0);
        if (w0VarV.s(0)) {
            setDropDownBackgroundDrawable(w0VarV.g(0));
        }
        w0VarV.w();
        e eVar = new e(this);
        this.f433f = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f434g = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
    }
}