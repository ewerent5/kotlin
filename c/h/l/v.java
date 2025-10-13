package c.h.l;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupCompat.java */
/* loaded from: classes.dex */
public final class v {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(c.h.b.M);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && t.I(viewGroup) == null) ? false : true;
    }
}