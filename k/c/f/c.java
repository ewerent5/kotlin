package k.c.f;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: GEMFFile.java */
/* loaded from: classes3.dex */
public class c {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final List<RandomAccessFile> f16726b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f16727c;

    /* renamed from: d, reason: collision with root package name */
    private final List<C0215c> f16728d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Long> f16729e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashMap<Integer, String> f16730f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16731g;

    /* renamed from: h, reason: collision with root package name */
    private int f16732h;

    /* compiled from: GEMFFile.java */
    /* renamed from: k.c.f.c$c, reason: collision with other inner class name */
    private class C0215c {
        Integer a;

        /* renamed from: b, reason: collision with root package name */
        Integer f16736b;

        /* renamed from: c, reason: collision with root package name */
        Integer f16737c;

        /* renamed from: d, reason: collision with root package name */
        Integer f16738d;

        /* renamed from: e, reason: collision with root package name */
        Integer f16739e;

        /* renamed from: f, reason: collision with root package name */
        Integer f16740f;

        /* renamed from: g, reason: collision with root package name */
        Long f16741g;

        private C0215c() {
        }

        public String toString() {
            return String.format("GEMF Range: source=%d, zoom=%d, x=%d-%d, y=%d-%d, offset=0x%08X", this.f16740f, this.a, this.f16736b, this.f16737c, this.f16738d, this.f16739e, this.f16741g);
        }
    }

    public c(File file) {
        this(file.getAbsolutePath());
    }

    private void d() {
        File file = new File(this.a);
        this.f16726b.add(new RandomAccessFile(file, "r"));
        this.f16727c.add(file.getPath());
        int i2 = 0;
        while (true) {
            i2++;
            File file2 = new File(this.a + "-" + i2);
            if (!file2.exists()) {
                return;
            }
            this.f16726b.add(new RandomAccessFile(file2, "r"));
            this.f16727c.add(file2.getPath());
        }
    }

    private void e() throws IOException {
        RandomAccessFile randomAccessFile = this.f16726b.get(0);
        Iterator<RandomAccessFile> it = this.f16726b.iterator();
        while (it.hasNext()) {
            this.f16729e.add(Long.valueOf(it.next().length()));
        }
        int i2 = randomAccessFile.readInt();
        if (i2 != 4) {
            throw new IOException("Bad file version: " + i2);
        }
        int i3 = randomAccessFile.readInt();
        if (i3 != 256) {
            throw new IOException("Bad tile size: " + i3);
        }
        int i4 = randomAccessFile.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = randomAccessFile.readInt();
            int i7 = randomAccessFile.readInt();
            byte[] bArr = new byte[i7];
            randomAccessFile.read(bArr, 0, i7);
            this.f16730f.put(new Integer(i6), new String(bArr));
        }
        int i8 = randomAccessFile.readInt();
        for (int i9 = 0; i9 < i8; i9++) {
            C0215c c0215c = new C0215c();
            c0215c.a = Integer.valueOf(randomAccessFile.readInt());
            c0215c.f16736b = Integer.valueOf(randomAccessFile.readInt());
            c0215c.f16737c = Integer.valueOf(randomAccessFile.readInt());
            c0215c.f16738d = Integer.valueOf(randomAccessFile.readInt());
            c0215c.f16739e = Integer.valueOf(randomAccessFile.readInt());
            c0215c.f16740f = Integer.valueOf(randomAccessFile.readInt());
            c0215c.f16741g = Long.valueOf(randomAccessFile.readLong());
            this.f16728d.add(c0215c);
        }
    }

    public void a() throws IOException {
        Iterator<RandomAccessFile> it = this.f16726b.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream b(int r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.c.f.c.b(int, int, int):java.io.InputStream");
    }

    public String c() {
        return this.a;
    }

    /* compiled from: GEMFFile.java */
    class b extends InputStream {

        /* renamed from: e, reason: collision with root package name */
        RandomAccessFile f16733e;

        /* renamed from: f, reason: collision with root package name */
        int f16734f;

        b(String str, long j2, int i2) throws IOException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.f16733e = randomAccessFile;
            randomAccessFile.seek(j2);
            this.f16734f = i2;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f16734f;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16733e.close();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            RandomAccessFile randomAccessFile = this.f16733e;
            int i4 = this.f16734f;
            if (i3 > i4) {
                i3 = i4;
            }
            int i5 = randomAccessFile.read(bArr, i2, i3);
            this.f16734f -= i5;
            return i5;
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            return 0L;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i2 = this.f16734f;
            if (i2 > 0) {
                this.f16734f = i2 - 1;
                return this.f16733e.read();
            }
            throw new IOException("End of stream");
        }
    }

    public c(String str) throws IOException {
        this.f16726b = new ArrayList();
        this.f16727c = new ArrayList();
        this.f16728d = new ArrayList();
        this.f16729e = new ArrayList();
        this.f16730f = new LinkedHashMap<>();
        this.f16731g = false;
        this.f16732h = 0;
        this.a = str;
        d();
        e();
    }
}