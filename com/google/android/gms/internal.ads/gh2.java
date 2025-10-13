package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* loaded from: classes.dex */
final class gh2 extends ch2 {
    gh2() {
    }

    @Override // com.google.android.gms.internal.ads.ch2
    public final void a(Throwable th, Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.ch2
    public final void b(Throwable th) {
        th.printStackTrace();
    }

    @Override // com.google.android.gms.internal.ads.ch2
    public final void c(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}