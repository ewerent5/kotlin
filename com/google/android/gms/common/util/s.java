package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class s {
    public static boolean a(@RecentlyNonNull Context context, int i2) throws PackageManager.NameNotFoundException {
        if (!b(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.k.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(@RecentlyNonNull Context context, int i2, @RecentlyNonNull String str) {
        return com.google.android.gms.common.p.c.a(context).h(i2, str);
    }
}