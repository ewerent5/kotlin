package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qg2 {
    static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jC = c(bArr, 0, 0);
        int i2 = 2;
        long jC2 = c(bArr, 3, 2) & 67108611;
        long jC3 = c(bArr, 6, 4) & 67092735;
        long jC4 = c(bArr, 9, 6) & 66076671;
        long jC5 = c(bArr, 12, 8) & 1048575;
        long j2 = jC2 * 5;
        long j3 = jC3 * 5;
        long j4 = jC4 * 5;
        long j5 = jC5 * 5;
        int i3 = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i4 = 0;
        while (true) {
            int length = bArr2.length;
            if (i4 >= length) {
                long j11 = j6 + (j7 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j8 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j10 + ((j15 >> 26) * 5);
                long j18 = j17 & 67108863;
                long j19 = (j7 & 67108863) + (j17 >> 26);
                long j20 = j18 + 5;
                long j21 = (j20 >> 26) + j19;
                long j22 = j12 + (j21 >> 26);
                long j23 = j14 + (j22 >> 26);
                long j24 = (j16 + (j23 >> 26)) - 67108864;
                long j25 = j24 >> 63;
                long j26 = ~j25;
                long j27 = (j19 & j25) | (j21 & 67108863 & j26);
                long j28 = (j12 & j25) | (j22 & 67108863 & j26);
                long j29 = (j14 & j25) | (j23 & 67108863 & j26);
                long jB = (((j18 & j25) | (j20 & 67108863 & j26) | (j27 << 26)) & 4294967295L) + b(bArr, 16);
                long jB2 = (((j27 >> 6) | (j28 << 20)) & 4294967295L) + b(bArr, 20) + (jB >> 32);
                long jB3 = (((j28 >> 12) | (j29 << 14)) & 4294967295L) + b(bArr, 24) + (jB2 >> 32);
                long jB4 = b(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, jB & 4294967295L, 0);
                d(bArr4, jB2 & 4294967295L, 4);
                d(bArr4, jB3 & 4294967295L, 8);
                d(bArr4, ((((((j24 & j26) | (j25 & j16)) << 8) | (j29 >> 18)) & 4294967295L) + jB4 + (jB3 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i4);
            System.arraycopy(bArr2, i4, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i3, (byte) 0);
            }
            long jC6 = j10 + c(bArr3, 0, 0);
            long jC7 = j7 + c(bArr3, 3, i2);
            long jC8 = j6 + c(bArr3, 6, 4);
            long jC9 = j8 + c(bArr3, 9, 6);
            long jC10 = j9 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j30 = (jC6 * jC) + (jC7 * j5) + (jC8 * j4) + (jC9 * j3) + (jC10 * j2);
            long j31 = (jC6 * jC2) + (jC7 * jC) + (jC8 * j5) + (jC9 * j4) + (jC10 * j3) + (j30 >> 26);
            long j32 = (jC6 * jC3) + (jC7 * jC2) + (jC8 * jC) + (jC9 * j5) + (jC10 * j4) + (j31 >> 26);
            long j33 = (jC6 * jC4) + (jC7 * jC3) + (jC8 * jC2) + (jC9 * jC) + (jC10 * j5) + (j32 >> 26);
            long j34 = (jC6 * jC5) + (jC7 * jC4) + (jC8 * jC3) + (jC9 * jC2) + (jC10 * jC) + (j33 >> 26);
            j9 = j34 & 67108863;
            long j35 = (j30 & 67108863) + ((j34 >> 26) * 5);
            j10 = j35 & 67108863;
            j7 = (j31 & 67108863) + (j35 >> 26);
            i4 += 16;
            j8 = j33 & 67108863;
            j6 = j32 & 67108863;
            i3 = 17;
            i2 = 2;
        }
    }

    private static long b(byte[] bArr, int i2) {
        return (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16)) & 4294967295L;
    }

    private static long c(byte[] bArr, int i2, int i3) {
        return (b(bArr, i2) >> i3) & 67108863;
    }

    private static void d(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j2);
            i3++;
            j2 >>= 8;
        }
    }
}