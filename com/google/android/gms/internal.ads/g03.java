package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g03 {
    private static final byte[] a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6003b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6004c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        n03 n03Var = new n03(bArr, bArr.length);
        int iC = c(n03Var);
        int iD = d(n03Var);
        int iA = n03Var.a(4);
        if (iC == 5 || iC == 29) {
            iD = d(n03Var);
            if (c(n03Var) == 22) {
                iA = n03Var.a(4);
            }
        }
        int i2 = f6004c[iA];
        f03.a(i2 != -1);
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(i2));
    }

    public static byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }

    private static int c(n03 n03Var) {
        int iA = n03Var.a(5);
        return iA == 31 ? n03Var.a(6) + 32 : iA;
    }

    private static int d(n03 n03Var) {
        int iA = n03Var.a(4);
        if (iA == 15) {
            return n03Var.a(24);
        }
        f03.a(iA < 13);
        return f6003b[iA];
    }
}