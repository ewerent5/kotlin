package com.google.android.gms.internal.ads;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* loaded from: classes.dex */
public final class ih2 {
    static final ch2 a;

    static {
        ch2 gh2Var;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e2) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e2.printStackTrace(System.err);
            }
            gh2Var = (num == null || num.intValue() < 19) ? !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new fh2() : new gh2() : new hh2();
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = gh2.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            gh2Var = new gh2();
        }
        a = gh2Var;
        if (num == null) {
            return;
        }
        num.intValue();
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void b(Throwable th) {
        a.b(th);
    }

    public static void c(Throwable th, PrintWriter printWriter) {
        a.c(th, printWriter);
    }
}