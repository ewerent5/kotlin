package com.google.android.gms.internal.ads;

import j$.util.Spliterator;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zu2 {
    private static final byte[] a = new byte[Spliterator.CONCURRENT];

    /* renamed from: b, reason: collision with root package name */
    private final pz2 f10640b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10641c;

    /* renamed from: d, reason: collision with root package name */
    private long f10642d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f10643e = new byte[65536];

    /* renamed from: f, reason: collision with root package name */
    private int f10644f;

    /* renamed from: g, reason: collision with root package name */
    private int f10645g;

    public zu2(pz2 pz2Var, long j2, long j3) {
        this.f10640b = pz2Var;
        this.f10642d = j2;
        this.f10641c = j3;
    }

    private final int j(int i2) {
        int iMin = Math.min(this.f10645g, i2);
        l(iMin);
        return iMin;
    }

    private final int k(byte[] bArr, int i2, int i3) {
        int i4 = this.f10645g;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f10643e, 0, bArr, i2, iMin);
        l(iMin);
        return iMin;
    }

    private final void l(int i2) {
        int i3 = this.f10645g - i2;
        this.f10645g = i3;
        this.f10644f = 0;
        byte[] bArr = this.f10643e;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f10643e = bArr2;
    }

    private final int m(byte[] bArr, int i2, int i3, int i4, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iB = this.f10640b.b(bArr, i2 + i4, i3 - i4);
        if (iB != -1) {
            return i4 + iB;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final void n(int i2) {
        if (i2 != -1) {
            this.f10642d += i2;
        }
    }

    public final int a(byte[] bArr, int i2, int i3) throws InterruptedException, EOFException {
        int iK = k(bArr, i2, i3);
        if (iK == 0) {
            iK = m(bArr, i2, i3, 0, true);
        }
        n(iK);
        return iK;
    }

    public final boolean b(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        int iK = k(bArr, i2, i3);
        while (iK < i3 && iK != -1) {
            iK = m(bArr, i2, i3, iK, z);
        }
        n(iK);
        return iK != -1;
    }

    public final int c(int i2) throws InterruptedException, EOFException {
        int iJ = j(i2);
        if (iJ == 0) {
            iJ = m(a, 0, Math.min(i2, Spliterator.CONCURRENT), 0, true);
        }
        n(iJ);
        return iJ;
    }

    public final boolean d(int i2, boolean z) throws InterruptedException, EOFException {
        int iJ = j(i2);
        while (iJ < i2 && iJ != -1) {
            iJ = m(a, -iJ, Math.min(i2, iJ + Spliterator.CONCURRENT), iJ, false);
        }
        n(iJ);
        return iJ != -1;
    }

    public final boolean e(byte[] bArr, int i2, int i3, boolean z) {
        if (!f(i3, false)) {
            return false;
        }
        System.arraycopy(this.f10643e, this.f10644f - i3, bArr, i2, i3);
        return true;
    }

    public final boolean f(int i2, boolean z) throws InterruptedException, EOFException {
        int i3 = this.f10644f + i2;
        int length = this.f10643e.length;
        if (i3 > length) {
            this.f10643e = Arrays.copyOf(this.f10643e, v03.f(length + length, 65536 + i3, i3 + 524288));
        }
        int iMin = Math.min(this.f10645g - this.f10644f, i2);
        while (iMin < i2) {
            iMin = m(this.f10643e, this.f10644f, i2, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i4 = this.f10644f + i2;
        this.f10644f = i4;
        this.f10645g = Math.max(this.f10645g, i4);
        return true;
    }

    public final void g() {
        this.f10644f = 0;
    }

    public final long h() {
        return this.f10642d;
    }

    public final long i() {
        return this.f10641c;
    }
}