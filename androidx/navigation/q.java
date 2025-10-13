package androidx.navigation;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: Navigation.java */
/* loaded from: classes.dex */
public final class q {
    public static NavController a(Activity activity, int i2) {
        NavController navControllerC = c(androidx.core.app.a.n(activity, i2));
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i2);
    }

    public static NavController b(View view) {
        NavController navControllerC = c(view);
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private static NavController c(View view) {
        while (view != null) {
            NavController navControllerD = d(view);
            if (navControllerD != null) {
                return navControllerD;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private static NavController d(View view) {
        Object tag = view.getTag(t.a);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    public static void e(View view, NavController navController) {
        view.setTag(t.a, navController);
    }
}