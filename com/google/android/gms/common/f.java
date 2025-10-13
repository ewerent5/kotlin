package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.b1;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class f {
    public static final int a = j.a;

    /* renamed from: b, reason: collision with root package name */
    private static final f f4648b = new f();

    f() {
    }

    @RecentlyNonNull
    public static f f() {
        return f4648b;
    }

    public int a(@RecentlyNonNull Context context) {
        return j.a(context);
    }

    @RecentlyNullable
    public Intent b(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            return b1.a("com.google.android.gms");
        }
        if (context != null && com.google.android.gms.common.util.j.f(context)) {
            return b1.c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(com.google.android.gms.common.p.c.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return b1.b("com.google.android.gms", sb.toString());
    }

    @RecentlyNullable
    public PendingIntent c(@RecentlyNonNull Context context, int i2, int i3) {
        return d(context, i2, i3, null);
    }

    @RecentlyNullable
    public PendingIntent d(@RecentlyNonNull Context context, int i2, int i3, String str) {
        Intent intentB = b(context, i2, str);
        if (intentB == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, intentB, 134217728);
    }

    public String e(int i2) {
        return j.b(i2);
    }

    public int g(@RecentlyNonNull Context context) {
        return h(context, a);
    }

    public int h(@RecentlyNonNull Context context, int i2) {
        int iF = j.f(context, i2);
        if (j.g(context, iF)) {
            return 18;
        }
        return iF;
    }

    public boolean i(int i2) {
        return j.i(i2);
    }
}