package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: ThemeUtils.java */
/* loaded from: classes.dex */
public class r0 {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f563b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f564c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f565d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f566e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f567f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f568g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f569h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f570i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f571j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.a.j.z0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(c.a.j.E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList colorStateListE = e(context, i2);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f563b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i2, typedValueF.getFloat());
    }

    public static int c(Context context, int i2) {
        int[] iArr = f571j;
        iArr[0] = i2;
        w0 w0VarU = w0.u(context, null, iArr);
        try {
            return w0VarU.b(0, 0);
        } finally {
            w0VarU.w();
        }
    }

    static int d(Context context, int i2, float f2) {
        return c.h.d.a.d(c(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    public static ColorStateList e(Context context, int i2) {
        int[] iArr = f571j;
        iArr[0] = i2;
        w0 w0VarU = w0.u(context, null, iArr);
        try {
            return w0VarU.c(0);
        } finally {
            w0VarU.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}