package e.c.b.c.r;

import android.os.Build;

/* compiled from: CircularRevealHelper.java */
/* loaded from: classes.dex */
public class c {
    public static final int a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            a = 2;
        } else if (i2 >= 18) {
            a = 1;
        } else {
            a = 0;
        }
    }
}