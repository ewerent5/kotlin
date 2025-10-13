package com.bumptech.glide.m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
class b implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private final InputStream f4092e;

    /* renamed from: f, reason: collision with root package name */
    private final Charset f4093f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f4094g;

    /* renamed from: h, reason: collision with root package name */
    private int f4095h;

    /* renamed from: i, reason: collision with root package name */
    private int f4096i;

    /* compiled from: StrictLineReader.java */
    class a extends ByteArrayOutputStream {
        a(int i2) {
            super(i2);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i2 = ((ByteArrayOutputStream) this).count;
            if (i2 > 0 && ((ByteArrayOutputStream) this).buf[i2 - 1] == 13) {
                i2--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i2, b.this.f4093f.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void c() throws IOException {
        InputStream inputStream = this.f4092e;
        byte[] bArr = this.f4094g;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.f4095h = 0;
        this.f4096i = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f4092e) {
            if (this.f4094g != null) {
                this.f4094g = null;
                this.f4092e.close();
            }
        }
    }

    public boolean d() {
        return this.f4096i == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f4092e
            monitor-enter(r0)
            byte[] r1 = r7.f4094g     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L83
            int r1 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.f4096i     // Catch: java.lang.Throwable -> L8b
            if (r1 < r2) goto L10
            r7.c()     // Catch: java.lang.Throwable -> L8b
        L10:
            int r1 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
        L12:
            int r2 = r7.f4096i     // Catch: java.lang.Throwable -> L8b
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f4094g     // Catch: java.lang.Throwable -> L8b
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L8b
            if (r4 != r3) goto L42
            int r3 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
            if (r1 == r3) goto L2b
            int r3 = r1 + (-1)
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L8b
            r4 = 13
            if (r2 != r4) goto L2b
            goto L2c
        L2b:
            r3 = r1
        L2c:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L8b
            byte[] r4 = r7.f4094g     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
            int r3 = r3 - r5
            java.nio.charset.Charset r6 = r7.f4093f     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L8b
            int r1 = r1 + 1
            r7.f4095h = r1     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r2
        L42:
            int r1 = r1 + 1
            goto L12
        L45:
            com.bumptech.glide.m.b$a r1 = new com.bumptech.glide.m.b$a     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.f4096i     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
        L51:
            byte[] r2 = r7.f4094g     // Catch: java.lang.Throwable -> L8b
            int r4 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
            int r5 = r7.f4096i     // Catch: java.lang.Throwable -> L8b
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L8b
            r2 = -1
            r7.f4096i = r2     // Catch: java.lang.Throwable -> L8b
            r7.c()     // Catch: java.lang.Throwable -> L8b
            int r2 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
        L63:
            int r4 = r7.f4096i     // Catch: java.lang.Throwable -> L8b
            if (r2 == r4) goto L51
            byte[] r4 = r7.f4094g     // Catch: java.lang.Throwable -> L8b
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L8b
            if (r5 != r3) goto L80
            int r3 = r7.f4095h     // Catch: java.lang.Throwable -> L8b
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L8b
        L76:
            int r2 = r2 + 1
            r7.f4095h = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.m.b.g():java.lang.String");
    }

    public b(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f4092e = inputStream;
        this.f4093f = charset;
        this.f4094g = new byte[i2];
    }
}