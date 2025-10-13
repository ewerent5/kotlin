package c.s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
class e0 extends d0 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f3364f = true;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f3365g = true;

    e0() {
    }

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f3364f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3364f = false;
            }
        }
    }

    @Override // c.s.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f3365g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3365g = false;
            }
        }
    }
}