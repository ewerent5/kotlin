package com.google.android.gms.common.p;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public class c {
    private static c a = new c();

    /* renamed from: b */
    private b f4772b = null;

    @RecentlyNonNull
    public static b a(@RecentlyNonNull Context context) {
        return a.b(context);
    }

    @RecentlyNonNull
    public final synchronized b b(@RecentlyNonNull Context context) {
        if (this.f4772b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f4772b = new b(context);
        }
        return this.f4772b;
    }
}