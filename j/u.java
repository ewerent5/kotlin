package j;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
final class u implements b0 {

    /* renamed from: e, reason: collision with root package name */
    private final OutputStream f16485e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f16486f;

    public u(OutputStream outputStream, e0 e0Var) {
        i.y.d.l.d(outputStream, "out");
        i.y.d.l.d(e0Var, "timeout");
        this.f16485e = outputStream;
        this.f16486f = e0Var;
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16485e.close();
    }

    @Override // j.b0, java.io.Flushable
    public void flush() throws IOException {
        this.f16485e.flush();
    }

    @Override // j.b0
    public e0 timeout() {
        return this.f16486f;
    }

    public String toString() {
        return "sink(" + this.f16485e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // j.b0
    public void write(f fVar, long j2) throws IOException {
        i.y.d.l.d(fVar, "source");
        c.b(fVar.y0(), 0L, j2);
        while (j2 > 0) {
            this.f16486f.throwIfReached();
            y yVar = fVar.f16453e;
            i.y.d.l.b(yVar);
            int iMin = (int) Math.min(j2, yVar.f16502d - yVar.f16501c);
            this.f16485e.write(yVar.f16500b, yVar.f16501c, iMin);
            yVar.f16501c += iMin;
            long j3 = iMin;
            j2 -= j3;
            fVar.v0(fVar.y0() - j3);
            if (yVar.f16501c == yVar.f16502d) {
                fVar.f16453e = yVar.b();
                z.b(yVar);
            }
        }
    }
}