package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class dm2 {
    static /* synthetic */ boolean a(byte b2) {
        return b2 >= 0;
    }

    static /* synthetic */ void b(byte b2, byte b3, char[] cArr, int i2) throws qj2 {
        if (b2 < -62 || e(b3)) {
            throw qj2.j();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018 A[PHI: r2
  0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void c(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.ads.qj2 {
        /*
            boolean r0 = e(r3)
            if (r0 != 0) goto L2e
            r0 = -96
            r1 = -32
            if (r2 != r1) goto L10
            if (r3 < r0) goto L2e
            r2 = -32
        L10:
            r1 = -19
            if (r2 != r1) goto L18
            if (r3 >= r0) goto L2e
            r2 = -19
        L18:
            boolean r0 = e(r4)
            if (r0 != 0) goto L2e
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2e:
            com.google.android.gms.internal.ads.qj2 r2 = com.google.android.gms.internal.ads.qj2.j()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dm2.c(byte, byte, byte, char[], int):void");
    }

    static /* synthetic */ void d(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws qj2 {
        if (e(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || e(b4) || e(b5)) {
            throw qj2.j();
        }
        int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    private static boolean e(byte b2) {
        return b2 > -65;
    }
}