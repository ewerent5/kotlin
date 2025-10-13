package e.c.b.c.s;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import e.c.b.c.z.b;

/* compiled from: MaterialColors.java */
/* loaded from: classes.dex */
public class a {
    public static int a(Context context, int i2, int i3) {
        TypedValue typedValueA = b.a(context, i2);
        return typedValueA != null ? typedValueA.data : i3;
    }

    public static int b(Context context, int i2, String str) {
        return b.c(context, i2, str);
    }

    public static int c(View view, int i2) {
        return b.d(view, i2);
    }

    public static int d(View view, int i2, int i3) {
        return a(view.getContext(), i2, i3);
    }

    public static int e(int i2, int i3) {
        return c.h.d.a.b(i3, i2);
    }

    public static int f(int i2, int i3, float f2) {
        return e(i2, c.h.d.a.d(i3, Math.round(Color.alpha(i3) * f2)));
    }

    public static int g(View view, int i2, int i3, float f2) {
        return f(c(view, i2), c(view, i3), f2);
    }
}