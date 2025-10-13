package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gz1 {
    private final yr2 a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6252b;

    /* renamed from: c, reason: collision with root package name */
    private final File f6253c;

    /* renamed from: d, reason: collision with root package name */
    private final File f6254d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f6255e;

    public gz1(yr2 yr2Var, File file, File file2, File file3) {
        this.a = yr2Var;
        this.f6252b = file;
        this.f6253c = file3;
        this.f6254d = file2;
    }

    public final yr2 a() {
        return this.a;
    }

    public final File b() {
        return this.f6252b;
    }

    public final File c() {
        return this.f6253c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] d() throws java.lang.Throwable {
        /*
            r3 = this;
            byte[] r0 = r3.f6255e
            r1 = 0
            if (r0 != 0) goto L27
            java.io.File r0 = r3.f6254d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L20
            com.google.android.gms.internal.ads.ci2 r0 = com.google.android.gms.internal.ads.ci2.K(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            byte[] r0 = r0.O()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L21
            com.google.android.gms.common.util.l.a(r2)
            goto L25
        L18:
            r0 = move-exception
            r1 = r2
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            com.google.android.gms.common.util.l.a(r1)
            throw r0
        L20:
            r2 = r1
        L21:
            com.google.android.gms.common.util.l.a(r2)
            r0 = r1
        L25:
            r3.f6255e = r0
        L27:
            byte[] r0 = r3.f6255e
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gz1.d():byte[]");
    }

    public final boolean e(long j2) {
        return this.a.F() - (System.currentTimeMillis() / 1000) < 3600;
    }
}