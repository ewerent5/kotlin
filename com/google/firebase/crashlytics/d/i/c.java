package com.google.firebase.crashlytics.d.i;

import j$.util.Spliterator;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* loaded from: classes.dex */
class c implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f12494e = Logger.getLogger(c.class.getName());

    /* renamed from: f, reason: collision with root package name */
    private final RandomAccessFile f12495f;

    /* renamed from: g, reason: collision with root package name */
    int f12496g;

    /* renamed from: h, reason: collision with root package name */
    private int f12497h;

    /* renamed from: i, reason: collision with root package name */
    private b f12498i;

    /* renamed from: j, reason: collision with root package name */
    private b f12499j;

    /* renamed from: k, reason: collision with root package name */
    private final byte[] f12500k = new byte[16];

    /* compiled from: QueueFile.java */
    class a implements d {
        boolean a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f12501b;

        a(StringBuilder sb) {
            this.f12501b = sb;
        }

        @Override // com.google.firebase.crashlytics.d.i.c.d
        public void a(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.f12501b.append(", ");
            }
            this.f12501b.append(i2);
        }
    }

    /* compiled from: QueueFile.java */
    static class b {
        static final b a = new b(0, 0);

        /* renamed from: b, reason: collision with root package name */
        final int f12503b;

        /* renamed from: c, reason: collision with root package name */
        final int f12504c;

        b(int i2, int i3) {
            this.f12503b = i2;
            this.f12504c = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.f12503b + ", length = " + this.f12504c + "]";
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.d.i.c$c, reason: collision with other inner class name */
    private final class C0133c extends InputStream {

        /* renamed from: e, reason: collision with root package name */
        private int f12505e;

        /* renamed from: f, reason: collision with root package name */
        private int f12506f;

        /* synthetic */ C0133c(c cVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            c.C(bArr, "buffer");
            if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = this.f12506f;
            if (i4 <= 0) {
                return -1;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            c.this.a0(this.f12505e, bArr, i2, i3);
            this.f12505e = c.this.k0(this.f12505e + i3);
            this.f12506f -= i3;
            return i3;
        }

        private C0133c(b bVar) {
            this.f12505e = c.this.k0(bVar.f12503b + 4);
            this.f12506f = bVar.f12504c;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f12506f == 0) {
                return -1;
            }
            c.this.f12495f.seek(this.f12505e);
            int i2 = c.this.f12495f.read();
            this.f12505e = c.this.k0(this.f12505e + 1);
            this.f12506f--;
            return i2;
        }
    }

    /* compiled from: QueueFile.java */
    public interface d {
        void a(InputStream inputStream, int i2);
    }

    public c(File file) throws IOException {
        if (!file.exists()) {
            A(file);
        }
        this.f12495f = D(file);
        N();
    }

    private static void A(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileD = D(file2);
        try {
            randomAccessFileD.setLength(4096L);
            randomAccessFileD.seek(0L);
            byte[] bArr = new byte[16];
            r0(bArr, Spliterator.CONCURRENT, 0, 0, 0);
            randomAccessFileD.write(bArr);
            randomAccessFileD.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileD.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T C(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    private static RandomAccessFile D(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b K(int i2) throws IOException {
        if (i2 == 0) {
            return b.a;
        }
        this.f12495f.seek(i2);
        return new b(i2, this.f12495f.readInt());
    }

    private void N() throws IOException {
        this.f12495f.seek(0L);
        this.f12495f.readFully(this.f12500k);
        int iT = T(this.f12500k, 0);
        this.f12496g = iT;
        if (iT <= this.f12495f.length()) {
            this.f12497h = T(this.f12500k, 4);
            int iT2 = T(this.f12500k, 8);
            int iT3 = T(this.f12500k, 12);
            this.f12498i = K(iT2);
            this.f12499j = K(iT3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f12496g + ", Actual length: " + this.f12495f.length());
    }

    private static int T(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int W() {
        return this.f12496g - j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iK0 = k0(i2);
        int i5 = iK0 + i4;
        int i6 = this.f12496g;
        if (i5 <= i6) {
            this.f12495f.seek(iK0);
            this.f12495f.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iK0;
        this.f12495f.seek(iK0);
        this.f12495f.readFully(bArr, i3, i7);
        this.f12495f.seek(16L);
        this.f12495f.readFully(bArr, i3 + i7, i4 - i7);
    }

    private void b0(int i2, byte[] bArr, int i3, int i4) throws IOException {
        int iK0 = k0(i2);
        int i5 = iK0 + i4;
        int i6 = this.f12496g;
        if (i5 <= i6) {
            this.f12495f.seek(iK0);
            this.f12495f.write(bArr, i3, i4);
            return;
        }
        int i7 = i6 - iK0;
        this.f12495f.seek(iK0);
        this.f12495f.write(bArr, i3, i7);
        this.f12495f.seek(16L);
        this.f12495f.write(bArr, i3 + i7, i4 - i7);
    }

    private void h0(int i2) throws IOException {
        this.f12495f.setLength(i2);
        this.f12495f.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k0(int i2) {
        int i3 = this.f12496g;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void l0(int i2, int i3, int i4, int i5) throws IOException {
        r0(this.f12500k, i2, i3, i4, i5);
        this.f12495f.seek(0L);
        this.f12495f.write(this.f12500k);
    }

    private static void q0(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void r0(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int i3 : iArr) {
            q0(bArr, i2, i3);
            i2 += 4;
        }
    }

    private void s(int i2) throws IOException {
        int i3 = i2 + 4;
        int iW = W();
        if (iW >= i3) {
            return;
        }
        int i4 = this.f12496g;
        do {
            iW += i4;
            i4 <<= 1;
        } while (iW < i3);
        h0(i4);
        b bVar = this.f12499j;
        int iK0 = k0(bVar.f12503b + 4 + bVar.f12504c);
        if (iK0 < this.f12498i.f12503b) {
            FileChannel channel = this.f12495f.getChannel();
            channel.position(this.f12496g);
            long j2 = iK0 - 4;
            if (channel.transferTo(16L, j2, channel) != j2) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.f12499j.f12503b;
        int i6 = this.f12498i.f12503b;
        if (i5 < i6) {
            int i7 = (this.f12496g + i5) - 16;
            l0(i4, this.f12497h, i6, i7);
            this.f12499j = new b(i7, this.f12499j.f12504c);
        } else {
            l0(i4, this.f12497h, i6, i5);
        }
        this.f12496g = i4;
    }

    public synchronized boolean B() {
        return this.f12497h == 0;
    }

    public synchronized void Z() {
        if (B()) {
            throw new NoSuchElementException();
        }
        if (this.f12497h == 1) {
            q();
        } else {
            b bVar = this.f12498i;
            int iK0 = k0(bVar.f12503b + 4 + bVar.f12504c);
            a0(iK0, this.f12500k, 0, 4);
            int iT = T(this.f12500k, 0);
            l0(this.f12496g, this.f12497h - 1, iK0, this.f12499j.f12503b);
            this.f12497h--;
            this.f12498i = new b(iK0, iT);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f12495f.close();
    }

    public void i(byte[] bArr) {
        j(bArr, 0, bArr.length);
    }

    public synchronized void j(byte[] bArr, int i2, int i3) {
        int iK0;
        C(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        s(i3);
        boolean zB = B();
        if (zB) {
            iK0 = 16;
        } else {
            b bVar = this.f12499j;
            iK0 = k0(bVar.f12503b + 4 + bVar.f12504c);
        }
        b bVar2 = new b(iK0, i3);
        q0(this.f12500k, 0, i3);
        b0(bVar2.f12503b, this.f12500k, 0, 4);
        b0(bVar2.f12503b + 4, bArr, i2, i3);
        l0(this.f12496g, this.f12497h + 1, zB ? bVar2.f12503b : this.f12498i.f12503b, bVar2.f12503b);
        this.f12499j = bVar2;
        this.f12497h++;
        if (zB) {
            this.f12498i = bVar2;
        }
    }

    public int j0() {
        if (this.f12497h == 0) {
            return 16;
        }
        b bVar = this.f12499j;
        int i2 = bVar.f12503b;
        int i3 = this.f12498i.f12503b;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.f12504c + 16 : (((i2 + 4) + bVar.f12504c) + this.f12496g) - i3;
    }

    public synchronized void q() {
        l0(Spliterator.CONCURRENT, 0, 0, 0);
        this.f12497h = 0;
        b bVar = b.a;
        this.f12498i = bVar;
        this.f12499j = bVar;
        if (this.f12496g > 4096) {
            h0(Spliterator.CONCURRENT);
        }
        this.f12496g = Spliterator.CONCURRENT;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f12496g);
        sb.append(", size=");
        sb.append(this.f12497h);
        sb.append(", first=");
        sb.append(this.f12498i);
        sb.append(", last=");
        sb.append(this.f12499j);
        sb.append(", element lengths=[");
        try {
            v(new a(sb));
        } catch (IOException e2) {
            f12494e.log(Level.WARNING, "read error", (Throwable) e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void v(d dVar) {
        int iK0 = this.f12498i.f12503b;
        for (int i2 = 0; i2 < this.f12497h; i2++) {
            b bVarK = K(iK0);
            dVar.a(new C0133c(this, bVarK, null), bVarK.f12504c);
            iK0 = k0(bVarK.f12503b + 4 + bVarK.f12504c);
        }
    }
}