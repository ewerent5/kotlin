package e.c.b.c.n;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: BadgeUtils.java */
/* loaded from: classes.dex */
public class b {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT < 18;
    }

    public static void a(a aVar, View view, FrameLayout frameLayout) {
        c(aVar, view, frameLayout);
        if (aVar.h() != null) {
            aVar.h().setForeground(aVar);
        } else {
            if (a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static void b(a aVar, View view) {
        if (aVar == null) {
            return;
        }
        if (a || aVar.h() != null) {
            aVar.h().setForeground(null);
        } else {
            view.getOverlay().remove(aVar);
        }
    }

    public static void c(a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.y(view, frameLayout);
    }

    public static void d(Rect rect, float f2, float f3, float f4, float f5) {
        rect.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
    }
}