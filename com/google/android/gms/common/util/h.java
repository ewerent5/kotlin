package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class h {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            com.google.android.gms.common.internal.p.j(context);
            com.google.android.gms.common.internal.p.j(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}