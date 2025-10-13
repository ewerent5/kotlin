package j;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: GzipSource.kt */
/* loaded from: classes3.dex */
public final class n implements d0 {

    /* renamed from: e, reason: collision with root package name */
    private byte f16471e;

    /* renamed from: f, reason: collision with root package name */
    private final x f16472f;

    /* renamed from: g, reason: collision with root package name */
    private final Inflater f16473g;

    /* renamed from: h, reason: collision with root package name */
    private final o f16474h;

    /* renamed from: i, reason: collision with root package name */
    private final CRC32 f16475i;

    public n(d0 d0Var) {
        i.y.d.l.d(d0Var, "source");
        x xVar = new x(d0Var);
        this.f16472f = xVar;
        Inflater inflater = new Inflater(true);
        this.f16473g = inflater;
        this.f16474h = new o((h) xVar, inflater);
        this.f16475i = new CRC32();
    }

    private final void b(String str, int i2, int i3) throws IOException {
        if (i3 == i2) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
        i.y.d.l.c(str2, "java.lang.String.format(this, *args)");
        throw new IOException(str2);
    }

    private final void c() throws IOException {
        this.f16472f.L0(10L);
        byte bV = this.f16472f.f16496e.v(3L);
        boolean z = ((bV >> 1) & 1) == 1;
        if (z) {
            g(this.f16472f.f16496e, 0L, 10L);
        }
        b("ID1ID2", 8075, this.f16472f.readShort());
        this.f16472f.h(8L);
        if (((bV >> 2) & 1) == 1) {
            this.f16472f.L0(2L);
            if (z) {
                g(this.f16472f.f16496e, 0L, 2L);
            }
            long jJ0 = this.f16472f.f16496e.j0();
            this.f16472f.L0(jJ0);
            if (z) {
                g(this.f16472f.f16496e, 0L, jJ0);
            }
            this.f16472f.h(jJ0);
        }
        if (((bV >> 3) & 1) == 1) {
            long jB = this.f16472f.b((byte) 0);
            if (jB == -1) {
                throw new EOFException();
            }
            if (z) {
                g(this.f16472f.f16496e, 0L, jB + 1);
            }
            this.f16472f.h(jB + 1);
        }
        if (((bV >> 4) & 1) == 1) {
            long jB2 = this.f16472f.b((byte) 0);
            if (jB2 == -1) {
                throw new EOFException();
            }
            if (z) {
                g(this.f16472f.f16496e, 0L, jB2 + 1);
            }
            this.f16472f.h(jB2 + 1);
        }
        if (z) {
            b("FHCRC", this.f16472f.i(), (short) this.f16475i.getValue());
            this.f16475i.reset();
        }
    }

    private final void d() throws IOException {
        b("CRC", this.f16472f.g(), (int) this.f16475i.getValue());
        b("ISIZE", this.f16472f.g(), (int) this.f16473g.getBytesWritten());
    }

    private final void g(f fVar, long j2, long j3) {
        y yVar = fVar.f16453e;
        i.y.d.l.b(yVar);
        while (true) {
            int i2 = yVar.f16502d;
            int i3 = yVar.f16501c;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= i2 - i3;
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
        }
        while (j3 > 0) {
            int iMin = (int) Math.min(yVar.f16502d - r7, j3);
            this.f16475i.update(yVar.f16500b, (int) (yVar.f16501c + j2), iMin);
            j3 -= iMin;
            yVar = yVar.f16505g;
            i.y.d.l.b(yVar);
            j2 = 0;
        }
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16474h.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) throws DataFormatException, IOException {
        i.y.d.l.d(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (j2 == 0) {
            return 0L;
        }
        if (this.f16471e == 0) {
            c();
            this.f16471e = (byte) 1;
        }
        if (this.f16471e == 1) {
            long jY0 = fVar.y0();
            long j3 = this.f16474h.read(fVar, j2);
            if (j3 != -1) {
                g(fVar, jY0, j3);
                return j3;
            }
            this.f16471e = (byte) 2;
        }
        if (this.f16471e == 2) {
            d();
            this.f16471e = (byte) 3;
            if (!this.f16472f.H()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f16472f.timeout();
    }
}