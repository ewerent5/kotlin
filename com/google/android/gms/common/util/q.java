package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class q {
    @Deprecated
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull SharedPreferences.Editor editor, @RecentlyNonNull String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}