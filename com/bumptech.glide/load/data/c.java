package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: e, reason: collision with root package name */
    private final OutputStream f3594e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f3595f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.n.a0.b f3596g;

    /* renamed from: h, reason: collision with root package name */
    private int f3597h;

    public c(OutputStream outputStream, com.bumptech.glide.load.n.a0.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void b() throws IOException {
        int i2 = this.f3597h;
        if (i2 > 0) {
            this.f3594e.write(this.f3595f, 0, i2);
            this.f3597h = 0;
        }
    }

    private void c() throws IOException {
        if (this.f3597h == this.f3595f.length) {
            b();
        }
    }

    private void d() {
        byte[] bArr = this.f3595f;
        if (bArr != null) {
            this.f3596g.d(bArr);
            this.f3595f = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f3594e.close();
            d();
        } catch (Throwable th) {
            this.f3594e.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        b();
        this.f3594e.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.f3595f;
        int i3 = this.f3597h;
        this.f3597h = i3 + 1;
        bArr[i3] = (byte) i2;
        c();
    }

    c(OutputStream outputStream, com.bumptech.glide.load.n.a0.b bVar, int i2) {
        this.f3594e = outputStream;
        this.f3596g = bVar;
        this.f3595f = (byte[]) bVar.e(i2, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f3597h;
            if (i7 == 0 && i5 >= this.f3595f.length) {
                this.f3594e.write(bArr, i6, i5);
                return;
            }
            int iMin = Math.min(i5, this.f3595f.length - i7);
            System.arraycopy(bArr, i6, this.f3595f, this.f3597h, iMin);
            this.f3597h += iMin;
            i4 += iMin;
            c();
        } while (i4 < i3);
    }
}