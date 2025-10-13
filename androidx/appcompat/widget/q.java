package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatPopupWindow.java */
/* loaded from: classes.dex */
class q extends PopupWindow {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f556b;

    static {
        a = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        w0 w0VarV = w0.v(context, attributeSet, c.a.j.b2, i2, i3);
        int i4 = c.a.j.d2;
        if (w0VarV.s(i4)) {
            b(w0VarV.a(i4, false));
        }
        setBackgroundDrawable(w0VarV.g(c.a.j.c2));
        w0VarV.w();
    }

    private void b(boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (a) {
            this.f556b = z;
        } else {
            androidx.core.widget.h.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (a && this.f556b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (a && this.f556b) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (a && this.f556b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }
}