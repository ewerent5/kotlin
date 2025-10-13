package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ai2 extends OutputStream {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f4909e = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    private int f4912h;

    /* renamed from: j, reason: collision with root package name */
    private int f4914j;

    /* renamed from: f, reason: collision with root package name */
    private final int f4910f = 128;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<ci2> f4911g = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private byte[] f4913i = new byte[128];

    ai2(int i2) {
    }

    private final void d(int i2) {
        this.f4911g.add(new zh2(this.f4913i));
        int length = this.f4912h + this.f4913i.length;
        this.f4912h = length;
        this.f4913i = new byte[Math.max(this.f4910f, Math.max(i2, length >>> 1))];
        this.f4914j = 0;
    }

    public final synchronized ci2 b() {
        int i2 = this.f4914j;
        byte[] bArr = this.f4913i;
        int length = bArr.length;
        if (i2 >= length) {
            this.f4911g.add(new zh2(bArr));
            this.f4913i = f4909e;
        } else if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i2));
            this.f4911g.add(new zh2(bArr2));
        }
        this.f4912h += this.f4914j;
        this.f4914j = 0;
        return ci2.L(this.f4911g);
    }

    public final synchronized int c() {
        return this.f4912h + this.f4914j;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i2) {
        if (this.f4914j == this.f4913i.length) {
            d(1);
        }
        byte[] bArr = this.f4913i;
        int i3 = this.f4914j;
        this.f4914j = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f4913i;
        int length = bArr2.length;
        int i4 = this.f4914j;
        int i5 = length - i4;
        if (i3 <= i5) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f4914j += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i5);
        int i6 = i3 - i5;
        d(i6);
        System.arraycopy(bArr, i2 + i5, this.f4913i, 0, i6);
        this.f4914j = i6;
    }
}