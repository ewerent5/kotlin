package com.google.android.gms.common.p;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.n;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class a {
    private static Context a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4771b;

    public static synchronized boolean a(@RecentlyNonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = f4771b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f4771b = null;
        if (n.k()) {
            f4771b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f4771b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f4771b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return f4771b.booleanValue();
    }
}