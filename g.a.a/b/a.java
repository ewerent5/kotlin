package g.a.a.b;

import ch.qos.logback.core.CoreConstants;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Objects;

/* compiled from: CsvWriter.java */
/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private final C0196a f15746e;

    /* renamed from: f, reason: collision with root package name */
    private final char f15747f;

    /* renamed from: g, reason: collision with root package name */
    private final char f15748g;

    /* renamed from: h, reason: collision with root package name */
    private final c f15749h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15750i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15751j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15752k = true;

    /* compiled from: CsvWriter.java */
    /* renamed from: g.a.a.b.a$a, reason: collision with other inner class name */
    static final class C0196a {
        private final Writer a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f15753b = new char[8192];

        /* renamed from: c, reason: collision with root package name */
        private int f15754c;

        C0196a(Writer writer) {
            this.a = writer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() throws IOException {
            this.a.write(this.f15753b, 0, this.f15754c);
            this.f15754c = 0;
        }

        void b() throws IOException {
            c();
            this.a.close();
        }

        void d(char c2) throws IOException {
            if (this.f15754c == 8192) {
                c();
            }
            char[] cArr = this.f15753b;
            int i2 = this.f15754c;
            this.f15754c = i2 + 1;
            cArr[i2] = c2;
        }

        void e(String str, int i2, int i3) throws IOException {
            int i4 = this.f15754c;
            if (i4 + i3 >= 8192) {
                c();
                this.a.write(str, i2, i3);
            } else {
                str.getChars(i2, i2 + i3, this.f15753b, i4);
                this.f15754c += i3;
            }
        }
    }

    /* compiled from: CsvWriter.java */
    public static final class b {
        private char a = CoreConstants.COMMA_CHAR;

        /* renamed from: b, reason: collision with root package name */
        private char f15755b = CoreConstants.DOUBLE_QUOTE_CHAR;

        /* renamed from: c, reason: collision with root package name */
        private c f15756c = c.REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        private g.a.a.b.b f15757d = g.a.a.b.b.CRLF;

        b() {
        }

        private a b(Writer writer, boolean z) {
            return new a(writer, this.a, this.f15755b, this.f15756c, this.f15757d, z);
        }

        public a a(Path path, Charset charset, OpenOption... openOptionArr) {
            Objects.requireNonNull(path, "path must not be null");
            Objects.requireNonNull(charset, "charset must not be null");
            return b(new OutputStreamWriter(Files.newOutputStream(path, openOptionArr), charset), false);
        }
    }

    a(Writer writer, char c2, char c3, c cVar, g.a.a.b.b bVar, boolean z) {
        if (c2 == '\r' || c2 == '\n') {
            throw new IllegalArgumentException("fieldSeparator must not be a newline char");
        }
        if (c3 == '\r' || c3 == '\n') {
            throw new IllegalArgumentException("quoteCharacter must not be a newline char");
        }
        if (c2 == c3) {
            throw new IllegalArgumentException(String.format("Control characters must differ (fieldSeparator=%s, quoteCharacter=%s)", Character.valueOf(c2), Character.valueOf(c3)));
        }
        this.f15746e = new C0196a(writer);
        this.f15747f = c2;
        this.f15748g = c3;
        Objects.requireNonNull(cVar);
        this.f15749h = cVar;
        Objects.requireNonNull(bVar);
        this.f15750i = bVar.toString();
        this.f15751j = z;
    }

    public static b b() {
        return new b();
    }

    private void c() throws IOException {
        C0196a c0196a = this.f15746e;
        String str = this.f15750i;
        c0196a.e(str, 0, str.length());
        this.f15752k = true;
        if (this.f15751j) {
            this.f15746e.c();
        }
    }

    private void d(String str, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = (i3 - i4) + 1;
            this.f15746e.e(str, i4, i5);
            this.f15746e.d(this.f15748g);
            i4 += i5;
            i3 = i4;
            while (true) {
                if (i3 >= i2) {
                    i3 = -1;
                    break;
                } else if (str.charAt(i3) == this.f15748g) {
                    break;
                } else {
                    i3++;
                }
            }
        } while (i3 > -1);
        if (i2 > i4) {
            this.f15746e.e(str, i4, i2 - i4);
        }
    }

    private void g(String str) throws IOException {
        if (this.f15752k) {
            this.f15752k = false;
        } else {
            this.f15746e.d(this.f15747f);
        }
        if (str == null) {
            if (this.f15749h == c.ALWAYS) {
                this.f15746e.d(this.f15748g);
                this.f15746e.d(this.f15748g);
                return;
            }
            return;
        }
        if (str.isEmpty()) {
            c cVar = this.f15749h;
            if (cVar == c.ALWAYS || cVar == c.EMPTY) {
                this.f15746e.d(this.f15748g);
                this.f15746e.d(this.f15748g);
                return;
            }
            return;
        }
        int length = str.length();
        boolean z = true;
        boolean z2 = this.f15749h == c.ALWAYS;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = z2;
                i2 = -1;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == this.f15748g) {
                break;
            }
            if (!z2 && (cCharAt == this.f15747f || cCharAt == '\n' || cCharAt == '\r')) {
                z2 = true;
            }
            i2++;
        }
        if (z) {
            this.f15746e.d(this.f15748g);
        }
        if (i2 > -1) {
            d(str, length, i2);
        } else {
            this.f15746e.e(str, 0, length);
        }
        if (z) {
            this.f15746e.d(this.f15748g);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15746e.b();
    }

    public a i(String... strArr) {
        try {
            for (String str : strArr) {
                g(str);
            }
            c();
            return this;
        } catch (IOException e2) {
            throw new UncheckedIOException(e2);
        }
    }
}