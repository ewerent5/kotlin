package com.google.android.gms.internal.ads;

import java.io.EOFException;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sv2 {
    private final o03 a = new o03(8);

    /* renamed from: b, reason: collision with root package name */
    private int f9000b;

    private final long b(zu2 zu2Var) {
        int i2 = 0;
        zu2Var.e(this.a.a, 0, 1, false);
        int i3 = this.a.a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        zu2Var.e(this.a.a, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (this.a.a[i2] & 255) + (i6 << 8);
        }
        this.f9000b += i5 + 1;
        return i6;
    }

    public final boolean a(zu2 zu2Var) throws InterruptedException, EOFException {
        long jI = zu2Var.i();
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (jI != -1 && jI <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = jI;
        }
        int i2 = (int) j2;
        zu2Var.e(this.a.a, 0, 4, false);
        long jP = this.a.p();
        this.f9000b = 4;
        while (jP != 440786851) {
            int i3 = this.f9000b + 1;
            this.f9000b = i3;
            if (i3 == i2) {
                return false;
            }
            zu2Var.e(this.a.a, 0, 1, false);
            jP = ((jP << 8) & (-256)) | (this.a.a[0] & 255);
        }
        long jB = b(zu2Var);
        long j3 = this.f9000b;
        if (jB != Long.MIN_VALUE && (jI == -1 || j3 + jB < jI)) {
            while (true) {
                long j4 = this.f9000b;
                long j5 = j3 + jB;
                if (j4 < j5) {
                    if (b(zu2Var) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jB2 = b(zu2Var);
                    if (jB2 < 0) {
                        return false;
                    }
                    if (jB2 != 0) {
                        zu2Var.f((int) jB2, false);
                        this.f9000b = (int) (this.f9000b + jB2);
                    }
                } else if (j4 == j5) {
                    return true;
                }
            }
        }
        return false;
    }
}