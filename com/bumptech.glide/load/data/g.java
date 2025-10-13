package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f3599e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f3600f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f3601g;

    /* renamed from: h, reason: collision with root package name */
    private final byte f3602h;

    /* renamed from: i, reason: collision with root package name */
    private int f3603i;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3599e = bArr;
        int length = bArr.length;
        f3600f = length;
        f3601g = length + 2;
    }

    public g(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= -1 && i2 <= 8) {
            this.f3602h = (byte) i2;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i2;
        int i3 = this.f3603i;
        int i4 = (i3 < 2 || i3 > (i2 = f3601g)) ? super.read() : i3 == i2 ? this.f3602h : f3599e[i3 - 2] & 255;
        if (i4 != -1) {
            this.f3603i++;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f3603i = (int) (this.f3603i + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f3603i;
        int i6 = f3601g;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f3602h;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i3);
            System.arraycopy(f3599e, this.f3603i - 2, bArr, i2, iMin);
            i4 = iMin;
        }
        if (i4 > 0) {
            this.f3603i += i4;
        }
        return i4;
    }
}