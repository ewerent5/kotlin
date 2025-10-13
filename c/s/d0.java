package c.s;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
class d0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3351e = true;

    d0() {
    }

    @Override // c.s.i0
    public void a(View view) {
    }

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f3351e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f3351e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // c.s.i0
    public void d(View view) {
    }

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f2) {
        if (f3351e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f3351e = false;
            }
        }
        view.setAlpha(f2);
    }
}