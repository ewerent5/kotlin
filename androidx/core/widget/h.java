package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import c.h.l.t;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* loaded from: classes.dex */
public final class h {
    private static Method a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f961b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f962c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f963d;

    public static void a(PopupWindow popupWindow, boolean z) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (i2 >= 21) {
            if (!f963d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f962c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f963d = true;
            }
            Field field = f962c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!f961b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f961b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i2, i3, i4);
            return;
        }
        if ((c.h.l.d.b(i4, t.B(view)) & 7) == 5) {
            i2 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i2, i3);
    }
}