package e.f;

import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;
import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.zip.ZipException;

/* compiled from: CSVReader.java */
/* loaded from: classes.dex */
public class f implements Closeable, Iterable<String[]>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    protected static final List<Class<? extends IOException>> f15614e = Collections.unmodifiableList(Arrays.asList(CharacterCodingException.class, CharConversionException.class, UnsupportedEncodingException.class, UTFDataFormatException.class, ZipException.class, FileNotFoundException.class, MalformedInputException.class));

    /* renamed from: f, reason: collision with root package name */
    protected i f15615f;

    /* renamed from: g, reason: collision with root package name */
    protected int f15616g;

    /* renamed from: h, reason: collision with root package name */
    protected BufferedReader f15617h;

    /* renamed from: i, reason: collision with root package name */
    protected e.f.n.a.a f15618i;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f15620k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f15621l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f15622m;
    protected int n;
    protected Locale o;
    private final e.f.o.b t;
    private final e.f.o.d u;
    private final e.f.m.a v;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f15619j = true;
    protected long p = 0;
    protected long q = 0;
    protected String[] r = null;
    protected final Queue<e.f.j.a.a<String>> s = new LinkedList();

    f(Reader reader, int i2, i iVar, boolean z, boolean z2, int i3, Locale locale, e.f.o.b bVar, e.f.o.d dVar, e.f.m.a aVar) {
        this.n = 0;
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
        this.f15617h = bufferedReader;
        this.f15618i = new e.f.n.a.a(bufferedReader, z);
        this.f15616g = i2;
        this.f15615f = iVar;
        this.f15621l = z;
        this.f15622m = z2;
        this.n = i3;
        this.o = (Locale) k.a.a.a.b.a(locale, Locale.getDefault());
        this.t = bVar;
        this.u = dVar;
        this.v = aVar;
    }

    private void G0() throws e.f.l.c, e.f.l.d {
        long j2 = this.p + 1;
        int i2 = 0;
        do {
            String strB0 = b0();
            this.s.add(new e.f.j.a.a<>(j2, strB0));
            i2++;
            if (!this.f15619j) {
                if (this.f15615f.c()) {
                    throw new e.f.l.c(String.format(ResourceBundle.getBundle("opencsv", this.o).getString("unterminated.quote"), k.a.a.a.c.a(this.f15615f.b(), 100)), j2, this.f15615f.b());
                }
                return;
            }
            int i3 = this.n;
            if (i3 > 0 && i2 > i3) {
                long j3 = this.q + 1;
                String strB = this.f15615f.b();
                if (strB.length() > 100) {
                    strB = strB.substring(0, 100);
                }
                throw new e.f.l.d(String.format(this.o, ResourceBundle.getBundle("opencsv", this.o).getString("multiline.limit.broken"), Integer.valueOf(this.n), Long.valueOf(j3), strB), j3, this.f15615f.b(), this.n);
            }
            String[] strArrA = this.f15615f.a(strB0);
            if (strArrA.length > 0) {
                String[] strArr = this.r;
                if (strArr == null) {
                    this.r = strArrA;
                } else {
                    this.r = c(strArr, strArrA);
                }
            }
        } while (this.f15615f.c());
    }

    private String[] K(boolean z, boolean z2) throws e.f.l.c, e.f.l.d, e.f.l.e {
        if (this.s.isEmpty()) {
            G0();
        }
        if (z2) {
            for (e.f.j.a.a<String> aVar : this.s) {
                S0(aVar.b(), aVar.a());
            }
            T0(this.r, this.p);
        }
        String[] strArr = this.r;
        if (z) {
            this.s.clear();
            this.r = null;
            if (strArr != null) {
                this.q++;
            }
        }
        return strArr;
    }

    private void S0(long j2, String str) throws e.f.l.e {
        try {
            this.t.a(str);
        } catch (e.f.l.e e2) {
            e2.a(j2);
            throw e2;
        }
    }

    public String[] I0() {
        return K(true, true);
    }

    protected void T0(String[] strArr, long j2) throws e.f.l.e {
        if (strArr != null) {
            e.f.m.a aVar = this.v;
            if (aVar != null) {
                aVar.a(strArr);
            }
            try {
                this.u.a(strArr);
            } catch (e.f.l.e e2) {
                e2.a(j2);
                throw e2;
            }
        }
    }

    protected String b0() {
        if (isClosed()) {
            this.f15619j = false;
            return null;
        }
        if (!this.f15620k) {
            for (int i2 = 0; i2 < this.f15616g; i2++) {
                this.f15618i.a();
                this.p++;
            }
            this.f15620k = true;
        }
        String strA = this.f15618i.a();
        if (strA == null) {
            this.f15619j = false;
        } else {
            this.p++;
        }
        if (this.f15619j) {
            return strA;
        }
        return null;
    }

    protected String[] c(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15617h.close();
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    protected boolean isClosed() throws IOException {
        if (!this.f15622m) {
            return false;
        }
        try {
            this.f15617h.mark(2);
            int i2 = this.f15617h.read();
            this.f15617h.reset();
            return i2 == -1;
        } catch (IOException e2) {
            if (f15614e.contains(e2.getClass())) {
                throw e2;
            }
            return true;
        }
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public Iterator<String[]> iterator() {
        try {
            c cVar = new c(this);
            cVar.b(this.o);
            return cVar;
        } catch (e.f.l.e | IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return v.o(iterator(), 0);
    }
}