package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class i0 {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    private static boolean f4703b;

    /* renamed from: c, reason: collision with root package name */
    private static String f4704c;

    /* renamed from: d, reason: collision with root package name */
    private static int f4705d;

    public static String a(Context context) {
        c(context);
        return f4704c;
    }

    public static int b(Context context) {
        c(context);
        return f4705d;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (a) {
            if (f4703b) {
                return;
            }
            f4703b = true;
            try {
                bundle = com.google.android.gms.common.p.c.a(context).c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            }
            if (bundle == null) {
                return;
            }
            f4704c = bundle.getString("com.google.app.id");
            f4705d = bundle.getInt("com.google.android.gms.version");
        }
    }
}