package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* loaded from: classes.dex */
final class fh2 extends ch2 {
    private final eh2 a = new eh2();

    fh2() {
    }

    @Override // com.google.android.gms.internal.ads.ch2
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        this.a.a(th, true).add(th2);
    }

    @Override // com.google.android.gms.internal.ads.ch2
    public final void b(Throwable th) {
        th.printStackTrace();
        List<Throwable> listA = this.a.a(th, false);
        if (listA == null) {
            return;
        }
        synchronized (listA) {
            for (Throwable th2 : listA) {
                System.err.print(CoreConstants.SUPPRESSED);
                th2.printStackTrace();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ch2
    public final void c(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> listA = this.a.a(th, false);
        if (listA == null) {
            return;
        }
        synchronized (listA) {
            for (Throwable th2 : listA) {
                printWriter.print(CoreConstants.SUPPRESSED);
                th2.printStackTrace(printWriter);
            }
        }
    }
}