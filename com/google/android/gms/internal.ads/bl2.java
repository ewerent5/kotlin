package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bl2 extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    private al2 f5137e;

    /* renamed from: f, reason: collision with root package name */
    private yh2 f5138f;

    /* renamed from: g, reason: collision with root package name */
    private int f5139g;

    /* renamed from: h, reason: collision with root package name */
    private int f5140h;

    /* renamed from: i, reason: collision with root package name */
    private int f5141i;

    /* renamed from: j, reason: collision with root package name */
    private int f5142j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ cl2 f5143k;

    public bl2(cl2 cl2Var) {
        this.f5143k = cl2Var;
        c();
    }

    private final int b(byte[] bArr, int i2, int i3) {
        int i4 = i3;
        while (i4 > 0) {
            d();
            if (this.f5138f == null) {
                break;
            }
            int iMin = Math.min(this.f5139g - this.f5140h, i4);
            if (bArr != null) {
                this.f5138f.M(bArr, this.f5140h, i2, iMin);
                i2 += iMin;
            }
            this.f5140h += iMin;
            i4 -= iMin;
        }
        return i3 - i4;
    }

    private final void c() {
        al2 al2Var = new al2(this.f5143k, null);
        this.f5137e = al2Var;
        yh2 next = al2Var.next();
        this.f5138f = next;
        this.f5139g = next.l();
        this.f5140h = 0;
        this.f5141i = 0;
    }

    private final void d() {
        if (this.f5138f != null) {
            int i2 = this.f5140h;
            int i3 = this.f5139g;
            if (i2 == i3) {
                this.f5141i += i3;
                int iL = 0;
                this.f5140h = 0;
                if (this.f5137e.hasNext()) {
                    yh2 next = this.f5137e.next();
                    this.f5138f = next;
                    iL = next.l();
                } else {
                    this.f5138f = null;
                }
                this.f5139g = iL;
            }
        }
    }

    private final int g() {
        return this.f5143k.l() - (this.f5141i + this.f5140h);
    }

    @Override // java.io.InputStream
    public final int available() {
        return g();
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        this.f5142j = this.f5141i + this.f5140h;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        d();
        yh2 yh2Var = this.f5138f;
        if (yh2Var == null) {
            return -1;
        }
        int i2 = this.f5140h;
        this.f5140h = i2 + 1;
        return yh2Var.h(i2) & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        c();
        b(null, 0, this.f5142j);
    }

    @Override // java.io.InputStream
    public final long skip(long j2) {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j2 > 2147483647L) {
            j2 = 2147483647L;
        }
        return b(null, 0, (int) j2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        Objects.requireNonNull(bArr);
        if (i2 >= 0 && i3 >= 0 && i3 <= bArr.length - i2) {
            int iB = b(bArr, i2, i3);
            return iB == 0 ? (i3 > 0 || g() == 0) ? -1 : 0 : iB;
        }
        throw new IndexOutOfBoundsException();
    }
}