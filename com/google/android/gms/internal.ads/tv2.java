package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class tv2 {
    private static final long[] a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9277b = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    private int f9278c;

    /* renamed from: d, reason: collision with root package name */
    private int f9279d;

    public static int c(int i2) {
        int i3 = 0;
        while (i3 < 8) {
            long j2 = a[i3] & i2;
            i3++;
            if (j2 != 0) {
                return i3;
            }
        }
        return -1;
    }

    public static long d(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= ~a[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    public final void a() {
        this.f9278c = 0;
        this.f9279d = 0;
    }

    public final int b() {
        return this.f9279d;
    }

    public final long e(zu2 zu2Var, boolean z, boolean z2, int i2) throws InterruptedException, EOFException {
        if (this.f9278c == 0) {
            if (!zu2Var.b(this.f9277b, 0, 1, z)) {
                return -1L;
            }
            int iC = c(this.f9277b[0] & 255);
            this.f9279d = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f9278c = 1;
        }
        int i3 = this.f9279d;
        if (i3 > i2) {
            this.f9278c = 0;
            return -2L;
        }
        if (i3 != 1) {
            zu2Var.b(this.f9277b, 1, i3 - 1, false);
        }
        this.f9278c = 0;
        return d(this.f9277b, this.f9279d, z2);
    }
}