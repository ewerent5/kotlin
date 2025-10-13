package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class jt2 {
    public static final jt2 a = new gt2();

    public abstract int a();

    public abstract it2 b(int i2, it2 it2Var, boolean z, long j2);

    public abstract int c();

    public abstract ht2 d(int i2, ht2 ht2Var, boolean z);

    public abstract int e(Object obj);

    public final boolean f() {
        return a() == 0;
    }

    public final it2 g(int i2, it2 it2Var, boolean z) {
        return b(i2, it2Var, false, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(int r3, com.google.android.gms.internal.ads.ht2 r4, com.google.android.gms.internal.ads.it2 r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.d(r3, r4, r0)
            r2.g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.a()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.a()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.g(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jt2.h(int, com.google.android.gms.internal.ads.ht2, com.google.android.gms.internal.ads.it2, int):int");
    }
}