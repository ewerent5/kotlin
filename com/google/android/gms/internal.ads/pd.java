package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pd {
    public static final String a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8137b = Log.isLoggable("Volley", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f8138c = pd.class.getName();

    public static void a(String str, Object... objArr) {
        if (f8137b) {
            Log.v(a, e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d(a, e(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(a, e(str, objArr));
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.e(a, e(str, objArr), th);
    }

    private static String e(String str, Object... objArr) {
        String string;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i2 = 2;
        while (true) {
            if (i2 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!stackTrace[i2].getClassName().equals(f8138c)) {
                String className = stackTrace[i2].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i2].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(strSubstring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(strSubstring2);
                sb.append(".");
                sb.append(methodName);
                string = sb.toString();
                break;
            }
            i2++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), string, str2);
    }
}