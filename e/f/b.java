package e.f;

import j$.util.Spliterator;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: AbstractCSVWriter.java */
/* loaded from: classes.dex */
public abstract class b implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    protected final Writer f15590e;

    /* renamed from: f, reason: collision with root package name */
    protected String f15591f;

    /* renamed from: g, reason: collision with root package name */
    protected volatile IOException f15592g;

    public b(Writer writer, String str) {
        this.f15590e = writer;
        this.f15591f = str;
    }

    public void b(String[] strArr, boolean z) {
        try {
            c(strArr, z, new StringBuilder(Spliterator.IMMUTABLE));
        } catch (IOException e2) {
            this.f15592g = e2;
        }
    }

    protected abstract void c(String[] strArr, boolean z, Appendable appendable);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.f15590e.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f15590e.flush();
    }
}