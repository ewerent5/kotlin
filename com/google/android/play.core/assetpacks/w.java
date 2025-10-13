package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class w extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    private final InputStream f12175e;

    /* renamed from: f, reason: collision with root package name */
    private long f12176f;

    w(InputStream inputStream, long j2) {
        this.f12175e = inputStream;
        this.f12176f = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f12175e.close();
        this.f12176f = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j2 = this.f12176f;
        if (j2 <= 0) {
            return -1;
        }
        this.f12176f = j2 - 1;
        return this.f12175e.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f12176f;
        if (j2 <= 0) {
            return -1;
        }
        int i4 = this.f12175e.read(bArr, i2, (int) Math.min(i3, j2));
        if (i4 != -1) {
            this.f12176f -= i4;
        }
        return i4;
    }
}