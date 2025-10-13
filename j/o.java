package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.kt */
/* loaded from: classes3.dex */
public final class o implements d0 {

    /* renamed from: e, reason: collision with root package name */
    private int f16476e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16477f;

    /* renamed from: g, reason: collision with root package name */
    private final h f16478g;

    /* renamed from: h, reason: collision with root package name */
    private final Inflater f16479h;

    public o(h hVar, Inflater inflater) {
        i.y.d.l.d(hVar, "source");
        i.y.d.l.d(inflater, "inflater");
        this.f16478g = hVar;
        this.f16479h = inflater;
    }

    private final void d() {
        int i2 = this.f16476e;
        if (i2 == 0) {
            return;
        }
        int remaining = i2 - this.f16479h.getRemaining();
        this.f16476e -= remaining;
        this.f16478g.h(remaining);
    }

    public final long b(f fVar, long j2) throws DataFormatException, IOException {
        i.y.d.l.d(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f16477f)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        try {
            y yVarO0 = fVar.O0(1);
            int iMin = (int) Math.min(j2, 8192 - yVarO0.f16502d);
            c();
            int iInflate = this.f16479h.inflate(yVarO0.f16500b, yVarO0.f16502d, iMin);
            d();
            if (iInflate > 0) {
                yVarO0.f16502d += iInflate;
                long j3 = iInflate;
                fVar.v0(fVar.y0() + j3);
                return j3;
            }
            if (yVarO0.f16501c == yVarO0.f16502d) {
                fVar.f16453e = yVarO0.b();
                z.b(yVarO0);
            }
            return 0L;
        } catch (DataFormatException e2) {
            throw new IOException(e2);
        }
    }

    public final boolean c() {
        if (!this.f16479h.needsInput()) {
            return false;
        }
        if (this.f16478g.H()) {
            return true;
        }
        y yVar = this.f16478g.e().f16453e;
        i.y.d.l.b(yVar);
        int i2 = yVar.f16502d;
        int i3 = yVar.f16501c;
        int i4 = i2 - i3;
        this.f16476e = i4;
        this.f16479h.setInput(yVar.f16500b, i3, i4);
        return false;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16477f) {
            return;
        }
        this.f16479h.end();
        this.f16477f = true;
        this.f16478g.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) throws DataFormatException, IOException {
        i.y.d.l.d(fVar, "sink");
        do {
            long jB = b(fVar, j2);
            if (jB > 0) {
                return jB;
            }
            if (this.f16479h.finished() || this.f16479h.needsDictionary()) {
                return -1L;
            }
        } while (!this.f16478g.H());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f16478g.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(d0 d0Var, Inflater inflater) {
        this(q.d(d0Var), inflater);
        i.y.d.l.d(d0Var, "source");
        i.y.d.l.d(inflater, "inflater");
    }
}