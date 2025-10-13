package e.c.d.y.n;

import e.c.d.o;
import e.c.d.q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes.dex */
public final class f extends e.c.d.a0.c {
    private static final Writer p = new a();
    private static final q q = new q("closed");
    private final List<e.c.d.l> r;
    private String s;
    private e.c.d.l t;

    /* compiled from: JsonTreeWriter.java */
    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(p);
        this.r = new ArrayList();
        this.t = e.c.d.n.a;
    }

    private e.c.d.l r0() {
        return this.r.get(r0.size() - 1);
    }

    private void v0(e.c.d.l lVar) {
        if (this.s != null) {
            if (!lVar.k() || s()) {
                ((o) r0()).n(this.s, lVar);
            }
            this.s = null;
            return;
        }
        if (this.r.isEmpty()) {
            this.t = lVar;
            return;
        }
        e.c.d.l lVarR0 = r0();
        if (!(lVarR0 instanceof e.c.d.i)) {
            throw new IllegalStateException();
        }
        ((e.c.d.i) lVarR0).n(lVar);
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c A(String str) {
        if (this.r.isEmpty() || this.s != null) {
            throw new IllegalStateException();
        }
        if (!(r0() instanceof o)) {
            throw new IllegalStateException();
        }
        this.s = str;
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c C() {
        v0(e.c.d.n.a);
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c a0(long j2) {
        v0(new q(Long.valueOf(j2)));
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c b0(Boolean bool) {
        if (bool == null) {
            return C();
        }
        v0(new q(bool));
        return this;
    }

    @Override // e.c.d.a0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.r.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.r.add(q);
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c d() {
        e.c.d.i iVar = new e.c.d.i();
        v0(iVar);
        this.r.add(iVar);
        return this;
    }

    @Override // e.c.d.a0.c, java.io.Flushable
    public void flush() {
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c g() {
        o oVar = new o();
        v0(oVar);
        this.r.add(oVar);
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c h0(Number number) {
        if (number == null) {
            return C();
        }
        if (!v()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        v0(new q(number));
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c j() {
        if (this.r.isEmpty() || this.s != null) {
            throw new IllegalStateException();
        }
        if (!(r0() instanceof e.c.d.i)) {
            throw new IllegalStateException();
        }
        this.r.remove(r0.size() - 1);
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c j0(String str) {
        if (str == null) {
            return C();
        }
        v0(new q(str));
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c k0(boolean z) {
        v0(new q(Boolean.valueOf(z)));
        return this;
    }

    @Override // e.c.d.a0.c
    public e.c.d.a0.c q() {
        if (this.r.isEmpty() || this.s != null) {
            throw new IllegalStateException();
        }
        if (!(r0() instanceof o)) {
            throw new IllegalStateException();
        }
        this.r.remove(r0.size() - 1);
        return this;
    }

    public e.c.d.l q0() {
        if (this.r.isEmpty()) {
            return this.t;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.r);
    }
}