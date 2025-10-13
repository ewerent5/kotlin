package com.bumptech.glide.load.p.d;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes.dex */
public class w extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    private volatile byte[] f4012e;

    /* renamed from: f, reason: collision with root package name */
    private int f4013f;

    /* renamed from: g, reason: collision with root package name */
    private int f4014g;

    /* renamed from: h, reason: collision with root package name */
    private int f4015h;

    /* renamed from: i, reason: collision with root package name */
    private int f4016i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.b f4017j;

    /* compiled from: RecyclableBufferedInputStream.java */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar) {
        this(inputStream, bVar, 65536);
    }

    private int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f4015h;
        if (i2 != -1) {
            int i3 = this.f4016i - i2;
            int i4 = this.f4014g;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f4013f == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f4017j.e(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f4012e = bArr2;
                    this.f4017j.d(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f4016i - this.f4015h;
                this.f4016i = i5;
                this.f4015h = 0;
                this.f4013f = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.f4016i;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.f4013f = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.f4015h = -1;
            this.f4016i = 0;
            this.f4013f = i8;
        }
        return i8;
    }

    private static IOException g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f4012e == null || inputStream == null) {
            throw g();
        }
        return (this.f4013f - this.f4016i) + inputStream.available();
    }

    public synchronized void c() {
        this.f4014g = this.f4012e.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f4012e != null) {
            this.f4017j.d(this.f4012e);
            this.f4012e = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void d() {
        if (this.f4012e != null) {
            this.f4017j.d(this.f4012e);
            this.f4012e = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f4014g = Math.max(this.f4014g, i2);
        this.f4015h = this.f4016i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f4012e;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw g();
        }
        if (this.f4016i >= this.f4013f && b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f4012e && (bArr = this.f4012e) == null) {
            throw g();
        }
        int i2 = this.f4013f;
        int i3 = this.f4016i;
        if (i2 - i3 <= 0) {
            return -1;
        }
        this.f4016i = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f4012e == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.f4015h;
        if (-1 == i2) {
            throw new a("Mark has been invalidated, pos: " + this.f4016i + " markLimit: " + this.f4014g);
        }
        this.f4016i = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f4012e;
        if (bArr == null) {
            throw g();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw g();
        }
        int i2 = this.f4013f;
        int i3 = this.f4016i;
        if (i2 - i3 >= j2) {
            this.f4016i = (int) (i3 + j2);
            return j2;
        }
        long j3 = i2 - i3;
        this.f4016i = i2;
        if (this.f4015h == -1 || j2 > this.f4014g) {
            long jSkip = inputStream.skip(j2 - j3);
            if (jSkip > 0) {
                this.f4015h = -1;
            }
            return j3 + jSkip;
        }
        if (b(inputStream, bArr) == -1) {
            return j3;
        }
        int i4 = this.f4013f;
        int i5 = this.f4016i;
        if (i4 - i5 >= j2 - j3) {
            this.f4016i = (int) ((i5 + j2) - j3);
            return j2;
        }
        long j4 = (j3 + i4) - i5;
        this.f4016i = i4;
        return j4;
    }

    w(InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar, int i2) {
        super(inputStream);
        this.f4015h = -1;
        this.f4017j = bVar;
        this.f4012e = (byte[]) bVar.e(i2, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr2 = this.f4012e;
        if (bArr2 == null) {
            throw g();
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.f4016i;
            int i7 = this.f4013f;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f4016i += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.f4015h == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (b(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.f4012e && (bArr2 = this.f4012e) == null) {
                        throw g();
                    }
                    int i9 = this.f4013f;
                    int i10 = this.f4016i;
                    i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f4016i += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        } else {
            throw g();
        }
    }
}