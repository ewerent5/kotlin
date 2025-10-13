package com.bumptech.glide.t;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public final class a {
    private static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    static final class b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final int f4236b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f4237c;

        b(byte[] bArr, int i2, int i3) {
            this.f4237c = bArr;
            this.a = i2;
            this.f4236b = i3;
        }
    }

    public static ByteBuffer a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i2 = inputStream.read(andSet);
            if (i2 < 0) {
                a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
            byteArrayOutputStream.write(andSet, 0, i2);
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.a == 0 && bVarC.f4236b == bVarC.f4237c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            channel = randomAccessFile.getChannel();
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile.close();
            try {
                channel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    public static InputStream f(ByteBuffer byteBuffer) {
        return new C0103a(byteBuffer);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: com.bumptech.glide.t.a$a, reason: collision with other inner class name */
    private static class C0103a extends InputStream {

        /* renamed from: e, reason: collision with root package name */
        private final ByteBuffer f4234e;

        /* renamed from: f, reason: collision with root package name */
        private int f4235f = -1;

        C0103a(ByteBuffer byteBuffer) {
            this.f4234e = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f4234e.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i2) {
            this.f4235f = this.f4234e.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f4234e.hasRemaining()) {
                return this.f4234e.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i2 = this.f4235f;
            if (i2 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f4234e.position(i2);
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (!this.f4234e.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j2, available());
            this.f4234e.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            if (!this.f4234e.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i3, available());
            this.f4234e.get(bArr, i2, iMin);
            return iMin;
        }
    }
}