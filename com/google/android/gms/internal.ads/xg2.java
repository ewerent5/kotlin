package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xg2 {
    private static final ThreadLocal<SecureRandom> a = new wg2();

    public static byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}