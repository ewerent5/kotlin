package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class sa {
    /* JADX INFO: Access modifiers changed from: private */
    public static void f(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws a8 {
        if (o(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || o(b4) || o(b5)) {
            throw a8.f();
        }
        int i3 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i2] = (char) ((i3 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(byte b2, byte b3, byte b4, char[] cArr, int i2) throws a8 {
        if (o(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || o(b4)))) {
            throw a8.f();
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(byte b2, byte b3, char[] cArr, int i2) throws a8 {
        if (b2 < -62 || o(b3)) {
            throw a8.f();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(byte b2) {
        return b2 < -16;
    }

    private static boolean o(byte b2) {
        return b2 > -65;
    }
}