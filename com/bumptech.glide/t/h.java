package com.bumptech.glide.t;

import ch.qos.logback.classic.Level;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: classes.dex */
public class h extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    private int f4249e;

    public h(InputStream inputStream) {
        super(inputStream);
        this.f4249e = Level.ALL_INT;
    }

    private long b(long j2) {
        int i2 = this.f4249e;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    private void c(long j2) {
        int i2 = this.f4249e;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f4249e = (int) (i2 - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i2 = this.f4249e;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        this.f4249e = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (b(1L) == -1) {
            return -1;
        }
        int i2 = super.read();
        c(1L);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f4249e = Level.ALL_INT;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jB = b(j2);
        if (jB == -1) {
            return 0L;
        }
        long jSkip = super.skip(jB);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int iB = (int) b(i3);
        if (iB == -1) {
            return -1;
        }
        int i4 = super.read(bArr, i2, iB);
        c(i4);
        return i4;
    }
}