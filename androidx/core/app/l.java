package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class l {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static Set<String> f879b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f880c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Context f881d;

    /* renamed from: e, reason: collision with root package name */
    private final NotificationManager f882e;

    private l(Context context) {
        this.f881d = context;
        this.f882e = (NotificationManager) context.getSystemService("notification");
    }

    public static l b(Context context) {
        return new l(context);
    }

    public boolean a() throws ClassNotFoundException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return this.f882e.areNotificationsEnabled();
        }
        if (i2 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f881d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f881d.getApplicationInfo();
        String packageName = this.f881d.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i3), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}