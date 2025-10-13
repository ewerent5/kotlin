package c.h.h;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
/* loaded from: classes.dex */
public final class g {
    private static long a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f3026b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f3027c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f3028d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f3029e;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 18 || i2 >= 29) {
            return;
        }
        try {
            a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f3026b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f3027c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f3028d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f3029e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}