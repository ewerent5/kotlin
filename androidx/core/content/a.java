package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* compiled from: ContextCompat.java */
/* loaded from: classes.dex */
public class a {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static TypedValue f890b;

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    public static int c(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i2) : context.getResources().getColor(i2);
    }

    public static ColorStateList d(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i2) : context.getResources().getColorStateList(i2);
    }

    public static Drawable e(Context context, int i2) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            return context.getDrawable(i2);
        }
        if (i4 >= 16) {
            return context.getResources().getDrawable(i2);
        }
        synchronized (a) {
            if (f890b == null) {
                f890b = new TypedValue();
            }
            context.getResources().getValue(i2, f890b, true);
            i3 = f890b.resourceId;
        }
        return context.getResources().getDrawable(i3);
    }

    public static File[] f(Context context) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalCacheDirs() : new File[]{context.getExternalCacheDir()};
    }

    public static File[] g(Context context, String str) {
        return Build.VERSION.SDK_INT >= 19 ? context.getExternalFilesDirs(str) : new File[]{context.getExternalFilesDir(str)};
    }

    public static boolean h(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void i(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}