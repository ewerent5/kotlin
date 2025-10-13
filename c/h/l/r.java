package c.h.l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class r {
    private Object a;

    private r(Object obj) {
        this.a = obj;
    }

    public static r b(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new r(PointerIcon.getSystemIcon(context, i2)) : new r(null);
    }

    public Object a() {
        return this.a;
    }
}