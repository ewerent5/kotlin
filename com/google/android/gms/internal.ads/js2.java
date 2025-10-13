package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class js2 extends Exception {
    private js2(int i2, String str, Throwable th, int i3) {
        super(null, th);
    }

    public static js2 a(Exception exc, int i2) {
        return new js2(1, null, exc, i2);
    }

    public static js2 b(IOException iOException) {
        return new js2(0, null, iOException, -1);
    }

    static js2 c(RuntimeException runtimeException) {
        return new js2(2, null, runtimeException, -1);
    }
}