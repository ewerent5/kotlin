package g.a.a.a;

import ch.qos.logback.core.CoreConstants;
import j$.C$r8$wrapper$java$util$Spliterator$WRP;
import j$.lang.Iterable;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.StringJoiner;
import j$.util.function.Consumer;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: CsvReader.java */
/* loaded from: classes3.dex */
public final class c implements Iterable<d>, Closeable, Iterable {

    /* renamed from: e, reason: collision with root package name */
    private final h f15712e;

    /* renamed from: f, reason: collision with root package name */
    private final g.a.a.a.b f15713f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15714g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f15715h;

    /* renamed from: j, reason: collision with root package name */
    private final Reader f15717j;

    /* renamed from: i, reason: collision with root package name */
    private final g.a.a.a.a<d> f15716i = new C0195c();

    /* renamed from: k, reason: collision with root package name */
    private int f15718k = -1;

    /* compiled from: CsvReader.java */
    public static final class b {
        private char a;

        /* renamed from: b, reason: collision with root package name */
        private char f15719b;

        /* renamed from: c, reason: collision with root package name */
        private g.a.a.a.b f15720c;

        /* renamed from: d, reason: collision with root package name */
        private char f15721d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15722e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15723f;

        private c b(Reader reader) {
            return new c(reader, this.a, this.f15719b, this.f15720c, this.f15721d, this.f15722e, this.f15723f);
        }

        public c a(Path path, Charset charset) {
            Objects.requireNonNull(path, "path must not be null");
            Objects.requireNonNull(charset, "charset must not be null");
            return b(new InputStreamReader(Files.newInputStream(path, new OpenOption[0]), charset));
        }

        public String toString() {
            return new StringJoiner(", ", b.class.getSimpleName() + "[", "]").add("fieldSeparator=" + this.a).add("quoteCharacter=" + this.f15719b).add("commentStrategy=" + this.f15720c).add("commentCharacter=" + this.f15721d).add("skipEmptyRows=" + this.f15722e).add("errorOnDifferentFieldCount=" + this.f15723f).toString();
        }

        private b() {
            this.a = CoreConstants.COMMA_CHAR;
            this.f15719b = CoreConstants.DOUBLE_QUOTE_CHAR;
            this.f15720c = g.a.a.a.b.NONE;
            this.f15721d = '#';
            this.f15722e = true;
        }
    }

    /* compiled from: CsvReader.java */
    /* renamed from: g.a.a.a.c$c, reason: collision with other inner class name */
    private class C0195c implements g.a.a.a.a<d> {

        /* renamed from: e, reason: collision with root package name */
        private d f15724e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f15725f;

        private C0195c() {
        }

        private void b() {
            try {
                this.f15724e = c.this.G0();
                this.f15725f = true;
            } catch (IOException e2) {
                throw new UncheckedIOException(e2);
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d next() {
            if (!this.f15725f) {
                b();
            }
            d dVar = this.f15724e;
            if (dVar == null) {
                throw new NoSuchElementException();
            }
            this.f15725f = false;
            return dVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c.this.f15717j.close();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (!this.f15725f) {
                b();
            }
            return this.f15724e != null;
        }
    }

    c(Reader reader, char c2, char c3, g.a.a.a.b bVar, char c4, boolean z, boolean z2) {
        if (c2 == '\r' || c2 == '\n') {
            throw new IllegalArgumentException("fieldSeparator must not be a newline char");
        }
        if (c3 == '\r' || c3 == '\n') {
            throw new IllegalArgumentException("quoteCharacter must not be a newline char");
        }
        if (c4 == '\r' || c4 == '\n') {
            throw new IllegalArgumentException("commentCharacter must not be a newline char");
        }
        if (c2 == c3 || c2 == c4 || c3 == c4) {
            throw new IllegalArgumentException(String.format("Control characters must differ (fieldSeparator=%s, quoteCharacter=%s, commentCharacter=%s)", Character.valueOf(c2), Character.valueOf(c3), Character.valueOf(c4)));
        }
        this.f15717j = reader;
        this.f15712e = new h(reader, c2, c3, bVar, c4);
        this.f15713f = bVar;
        this.f15714g = z;
        this.f15715h = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d G0() {
        d dVarC;
        while (true) {
            dVarC = this.f15712e.c();
            if (dVarC == null) {
                break;
            }
            if (this.f15713f != g.a.a.a.b.SKIP || !dVarC.e()) {
                if (dVarC.f()) {
                    if (!this.f15714g) {
                        break;
                    }
                } else if (this.f15715h) {
                    int iB = dVarC.b();
                    int i2 = this.f15718k;
                    if (i2 == -1) {
                        this.f15718k = iB;
                    } else if (iB != i2) {
                        throw new f(String.format("Row %d has %d fields, but first row had %d fields", Long.valueOf(dVarC.d()), Integer.valueOf(iB), Integer.valueOf(this.f15718k)));
                    }
                }
            }
        }
        return dVarC;
    }

    public static b b0() {
        return new b();
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public g.a.a.a.a<d> iterator() {
        return this.f15716i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15717j.close();
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable, j$.lang.Iterable
    public Spliterator<d> spliterator() {
        return new e(this.f15716i);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Spliterator<d> spliterator() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
    }

    public String toString() {
        return new StringJoiner(", ", c.class.getSimpleName() + "[", "]").add("commentStrategy=" + this.f15713f).add("skipEmptyRows=" + this.f15714g).add("errorOnDifferentFieldCount=" + this.f15715h).toString();
    }
}