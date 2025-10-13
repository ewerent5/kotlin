package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements i {

    /* renamed from: e, reason: collision with root package name */
    private static int f9e;

    /* renamed from: f, reason: collision with root package name */
    private static Field f10f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f11g;

    /* renamed from: h, reason: collision with root package name */
    private static Field f12h;

    /* renamed from: i, reason: collision with root package name */
    private Activity f13i;

    ImmLeaksCleaner(Activity activity) {
        this.f13i = activity;
    }

    private static void h() throws NoSuchFieldException {
        try {
            f9e = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f11g = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f12h = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f10f = declaredField3;
            declaredField3.setAccessible(true);
            f9e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (bVar != g.b.ON_DESTROY) {
            return;
        }
        if (f9e == 0) {
            h();
        }
        if (f9e == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f13i.getSystemService("input_method");
            try {
                Object obj = f10f.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f11g.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f12h.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}