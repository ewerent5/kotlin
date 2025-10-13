package com.bumptech.glide.t;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionPassthroughInputStream.java */
/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    private static final Queue<d> f4241e = k.e(0);

    /* renamed from: f, reason: collision with root package name */
    private InputStream f4242f;

    /* renamed from: g, reason: collision with root package name */
    private IOException f4243g;

    d() {
    }

    public static d c(InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f4241e;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.g(inputStream);
        return dVarPoll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f4242f.available();
    }

    public IOException b() {
        return this.f4243g;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4242f.close();
    }

    public void d() {
        this.f4243g = null;
        this.f4242f = null;
        Queue<d> queue = f4241e;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void g(InputStream inputStream) {
        this.f4242f = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f4242f.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f4242f.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f4242f.read();
        } catch (IOException e2) {
            this.f4243g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f4242f.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        try {
            return this.f4242f.skip(j2);
        } catch (IOException e2) {
            this.f4243g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f4242f.read(bArr);
        } catch (IOException e2) {
            this.f4243g = e2;
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        try {
            return this.f4242f.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f4243g = e2;
            throw e2;
        }
    }
}