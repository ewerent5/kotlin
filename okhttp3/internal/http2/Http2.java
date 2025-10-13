package okhttp3.internal.http2;

import i.d0.p;
import i.y.d.l;
import j.i;
import okhttp3.internal.Util;

/* compiled from: Http2.kt */
/* loaded from: classes3.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final i CONNECTION_PREFACE = i.f16464f.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            l.c(binaryString, "Integer.toBinaryString(it)");
            strArr[i2] = p.w(Util.format("%8s", binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = FLAGS;
            strArr3[i4 | 8] = l.i(strArr3[i4], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = FLAGS;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + "|" + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + "|" + strArr5[i6] + "|PADDED";
            }
        }
        int length = FLAGS.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i10] == null) {
                strArr6[i10] = BINARY[i10];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i2, int i3) {
        String str;
        if (i3 == 0) {
            return "";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4 || i2 == 6) {
                return i3 == 1 ? "ACK" : BINARY[i3];
            }
            if (i2 != 7 && i2 != 8) {
                String[] strArr = FLAGS;
                if (i3 < strArr.length) {
                    str = strArr[i3];
                    l.b(str);
                } else {
                    str = BINARY[i3];
                }
                String str2 = str;
                return (i2 != 5 || (i3 & 4) == 0) ? (i2 != 0 || (i3 & 32) == 0) ? str2 : p.x(str2, "PRIORITY", "COMPRESSED", false, 4, null) : p.x(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return BINARY[i3];
    }

    public final String formattedType$okhttp(int i2) {
        String[] strArr = FRAME_NAMES;
        return i2 < strArr.length ? strArr[i2] : Util.format("0x%02x", Integer.valueOf(i2));
    }

    public final String frameLog(boolean z, int i2, int i3, int i4, int i5) {
        return Util.format("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), formattedType$okhttp(i4), formatFlags(i4, i5));
    }
}