package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public abstract class i {
    private static int a = 4225;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4701b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static i f4702c;

    public static int a() {
        return a;
    }

    @RecentlyNonNull
    public static i b(@RecentlyNonNull Context context) {
        synchronized (f4701b) {
            if (f4702c == null) {
                f4702c = new z0(context.getApplicationContext());
            }
        }
        return f4702c;
    }

    public final void c(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i2, @RecentlyNonNull ServiceConnection serviceConnection, @RecentlyNonNull String str3, boolean z) {
        e(new v0(str, str2, i2, z), serviceConnection, str3);
    }

    protected abstract boolean d(v0 v0Var, ServiceConnection serviceConnection, String str);

    protected abstract void e(v0 v0Var, ServiceConnection serviceConnection, String str);
}