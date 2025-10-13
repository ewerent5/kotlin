package com.bumptech.glide.t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    private final long f4239e;

    /* renamed from: f, reason: collision with root package name */
    private int f4240f;

    private c(InputStream inputStream, long j2) {
        super(inputStream);
        this.f4239e = j2;
    }

    private int b(int i2) throws IOException {
        if (i2 >= 0) {
            this.f4240f += i2;
        } else if (this.f4239e - this.f4240f > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f4239e + ", but read: " + this.f4240f);
        }
        return i2;
    }

    public static InputStream c(InputStream inputStream, long j2) {
        return new c(inputStream, j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f4239e - this.f4240f, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i2;
        i2 = super.read();
        b(i2 >= 0 ? 1 : -1);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        return b(super.read(bArr, i2, i3));
    }
}