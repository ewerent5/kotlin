package e.c.b.b.c.e;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class r7 {
    static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f14814b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14815c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f14816d;

    /* renamed from: e, reason: collision with root package name */
    private static final t6 f14817e;

    static {
        byte[] bArr = new byte[0];
        f14815c = bArr;
        f14816d = ByteBuffer.wrap(bArr);
        f14817e = t6.b(bArr, 0, bArr.length, false);
    }

    static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T d(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    static Object e(Object obj, Object obj2) {
        return ((b9) obj).d().b0((b9) obj2).zzx();
    }

    static <T> T f(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    static boolean g(b9 b9Var) {
        if (!(b9Var instanceof y5)) {
            return false;
        }
        return false;
    }

    public static boolean h(byte[] bArr) {
        return ta.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}