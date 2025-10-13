package e.c.b.c.c0;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: MaterialShapeUtils.java */
/* loaded from: classes.dex */
public class h {
    static d a(int i2) {
        return i2 != 0 ? i2 != 1 ? b() : new e() : new j();
    }

    static d b() {
        return new j();
    }

    static f c() {
        return new f();
    }

    public static void d(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).W(f2);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.O()) {
            gVar.a0(com.google.android.material.internal.k.c(view));
        }
    }
}