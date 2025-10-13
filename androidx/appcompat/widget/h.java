package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes.dex */
public class h extends CheckedTextView {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f459e = {R.attr.checkMark};

    /* renamed from: f, reason: collision with root package name */
    private final y f460f;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f460f;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(c.a.k.a.a.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.s(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f460f;
        if (yVar != null) {
            yVar.q(context, i2);
        }
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        y yVar = new y(this);
        this.f460f = yVar;
        yVar.m(attributeSet, i2);
        yVar.b();
        w0 w0VarV = w0.v(getContext(), attributeSet, f459e, i2, 0);
        setCheckMarkDrawable(w0VarV.g(0));
        w0VarV.w();
    }
}