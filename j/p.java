package j;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
final class p implements d0 {

    /* renamed from: e, reason: collision with root package name */
    private final InputStream f16480e;

    /* renamed from: f, reason: collision with root package name */
    private final e0 f16481f;

    public p(InputStream inputStream, e0 e0Var) {
        i.y.d.l.d(inputStream, "input");
        i.y.d.l.d(e0Var, "timeout");
        this.f16480e = inputStream;
        this.f16481f = e0Var;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16480e.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) throws IOException {
        i.y.d.l.d(fVar, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        try {
            this.f16481f.throwIfReached();
            y yVarO0 = fVar.O0(1);
            int i2 = this.f16480e.read(yVarO0.f16500b, yVarO0.f16502d, (int) Math.min(j2, 8192 - yVarO0.f16502d));
            if (i2 != -1) {
                yVarO0.f16502d += i2;
                long j3 = i2;
                fVar.v0(fVar.y0() + j3);
                return j3;
            }
            if (yVarO0.f16501c != yVarO0.f16502d) {
                return -1L;
            }
            fVar.f16453e = yVarO0.b();
            z.b(yVarO0);
            return -1L;
        } catch (AssertionError e2) {
            if (q.e(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f16481f;
    }

    public String toString() {
        return "source(" + this.f16480e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}