package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jq2 {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public static String a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID uuidFromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
        byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
        return pv1.a(bArr, true);
    }

    public static String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        ih2.c(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean d() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    public static long f(double d2, int i2, DisplayMetrics displayMetrics) {
        return Math.round(d2 / displayMetrics.density);
    }

    public static Activity g(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        for (int i2 = 0; (context instanceof ContextWrapper) && i2 < 10; i2++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}