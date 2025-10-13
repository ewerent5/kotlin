package ch.qos.logback.core.encoder;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class ByteArrayUtil {
    public static byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Integer.parseInt(str.substring(i3, i3 + 2), 16) & 255);
        }
        return bArr;
    }

    static int readInt(byte[] bArr, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            i3 += (bArr[i2 + i4] & 255) << (24 - (i4 * 8));
        }
        return i3;
    }

    public static String toHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    static void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            byteArrayOutputStream.write((byte) (i2 >>> (24 - (i3 * 8))));
        }
    }

    static void writeInt(byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < 4; i4++) {
            bArr[i2 + i4] = (byte) (i3 >>> (24 - (i4 * 8)));
        }
    }
}