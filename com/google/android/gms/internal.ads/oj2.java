package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class oj2 {
    static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f7949b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f7950c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f7951d;

    /* renamed from: e, reason: collision with root package name */
    public static final gi2 f7952e;

    static {
        byte[] bArr = new byte[0];
        f7950c = bArr;
        f7951d = ByteBuffer.wrap(bArr);
        f7952e = gi2.d(bArr, 0, 0, false);
    }

    static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    static <T> T b(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static boolean c(byte[] bArr) {
        return hm2.a(bArr);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int e(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int f(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int g(byte[] bArr) {
        int length = bArr.length;
        int iH = h(length, bArr, 0, length);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    static int h(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    static Object i(Object obj, Object obj2) {
        return ((lk2) obj).b().K((lk2) obj2).G0();
    }
}