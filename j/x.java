package j;

import ch.qos.logback.core.CoreConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes3.dex */
public final class x implements h {

    /* renamed from: e, reason: collision with root package name */
    public final f f16496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16497f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f16498g;

    public x(d0 d0Var) {
        i.y.d.l.d(d0Var, "source");
        this.f16498g = d0Var;
        this.f16496e = new f();
    }

    @Override // j.h
    public byte[] F() {
        this.f16496e.m0(this.f16498g);
        return this.f16496e.F();
    }

    @Override // j.h
    public boolean H() {
        if (!this.f16497f) {
            return this.f16496e.H() && this.f16498g.read(this.f16496e, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // j.h
    public void L0(long j2) throws EOFException {
        if (!p0(j2)) {
            throw new EOFException();
        }
    }

    @Override // j.h
    public void M(f fVar, long j2) throws EOFException {
        i.y.d.l.d(fVar, "sink");
        try {
            L0(j2);
            this.f16496e.M(fVar, j2);
        } catch (EOFException e2) {
            fVar.m0(this.f16496e);
            throw e2;
        }
    }

    @Override // j.h
    public long P() throws EOFException {
        byte bV;
        L0(1L);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!p0(j3)) {
                break;
            }
            bV = this.f16496e.v(j2);
            if ((bV < ((byte) 48) || bV > ((byte) 57)) && !(j2 == 0 && bV == ((byte) 45))) {
                break;
            }
            j2 = j3;
        }
        if (j2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9] or '-' character but was 0x");
            String string = Integer.toString(bV, i.d0.b.a(i.d0.b.a(16)));
            i.y.d.l.c(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f16496e.P();
    }

    @Override // j.h
    public long P0() throws EOFException {
        byte bV;
        L0(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!p0(i3)) {
                break;
            }
            bV = this.f16496e.v(i2);
            if ((bV < ((byte) 48) || bV > ((byte) 57)) && ((bV < ((byte) 97) || bV > ((byte) 102)) && (bV < ((byte) 65) || bV > ((byte) 70)))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bV, i.d0.b.a(i.d0.b.a(16)));
            i.y.d.l.c(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            throw new NumberFormatException(sb.toString());
        }
        return this.f16496e.P0();
    }

    @Override // j.h
    public String Q(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        byte b2 = (byte) 10;
        long jC = c(b2, 0L, j3);
        if (jC != -1) {
            return j.f0.a.c(this.f16496e, jC);
        }
        if (j3 < Long.MAX_VALUE && p0(j3) && this.f16496e.v(j3 - 1) == ((byte) 13) && p0(1 + j3) && this.f16496e.v(j3) == b2) {
            return j.f0.a.c(this.f16496e, j3);
        }
        f fVar = new f();
        f fVar2 = this.f16496e;
        fVar2.j(fVar, 0L, Math.min(32, fVar2.y0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f16496e.y0(), j2) + " content=" + fVar.o0().k() + "…");
    }

    @Override // j.h
    public InputStream Q0() {
        return new a();
    }

    @Override // j.h
    public int R0(t tVar) throws EOFException {
        i.y.d.l.d(tVar, "options");
        if (!(!this.f16497f)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int iD = j.f0.a.d(this.f16496e, tVar, true);
            if (iD != -2) {
                if (iD != -1) {
                    this.f16496e.h(tVar.f()[iD].u());
                    return iD;
                }
            } else if (this.f16498g.read(this.f16496e, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    public long b(byte b2) {
        return c(b2, 0L, Long.MAX_VALUE);
    }

    public long c(byte b2, long j2, long j3) {
        if (!(!this.f16497f)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j2 && j3 >= j2)) {
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        while (j2 < j3) {
            long jA = this.f16496e.A(b2, j2, j3);
            if (jA != -1) {
                return jA;
            }
            long jY0 = this.f16496e.y0();
            if (jY0 >= j3 || this.f16498g.read(this.f16496e, 8192) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, jY0);
        }
        return -1L;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16497f) {
            return;
        }
        this.f16497f = true;
        this.f16498g.close();
        this.f16496e.b();
    }

    public boolean d(long j2, i iVar, int i2, int i3) {
        i.y.d.l.d(iVar, "bytes");
        if (!(!this.f16497f)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j2 >= 0 && i2 >= 0 && i3 >= 0 && iVar.u() - i2 >= i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                long j3 = i4 + j2;
                if (p0(1 + j3) && this.f16496e.v(j3) == iVar.d(i2 + i4)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j.h, j.g
    public f e() {
        return this.f16496e;
    }

    @Override // j.h
    public boolean e0(long j2, i iVar) {
        i.y.d.l.d(iVar, "bytes");
        return d(j2, iVar, 0, iVar.u());
    }

    @Override // j.h
    public String f0(Charset charset) {
        i.y.d.l.d(charset, "charset");
        this.f16496e.m0(this.f16498g);
        return this.f16496e.f0(charset);
    }

    public int g() throws EOFException {
        L0(4L);
        return this.f16496e.h0();
    }

    @Override // j.h
    public void h(long j2) throws EOFException {
        if (!(!this.f16497f)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j2 > 0) {
            if (this.f16496e.y0() == 0 && this.f16498g.read(this.f16496e, 8192) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.f16496e.y0());
            this.f16496e.h(jMin);
            j2 -= jMin;
        }
    }

    public short i() throws EOFException {
        L0(2L);
        return this.f16496e.j0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f16497f;
    }

    @Override // j.h
    public i o(long j2) throws EOFException {
        L0(j2);
        return this.f16496e.o(j2);
    }

    @Override // j.h
    public i o0() {
        this.f16496e.m0(this.f16498g);
        return this.f16496e.o0();
    }

    @Override // j.h
    public boolean p0(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(!this.f16497f)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f16496e.y0() < j2) {
            if (this.f16498g.read(this.f16496e, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // j.h
    public h peek() {
        return q.d(new v(this));
    }

    @Override // j.d0
    public long read(f fVar, long j2) {
        i.y.d.l.d(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (!(true ^ this.f16497f)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f16496e.y0() == 0 && this.f16498g.read(this.f16496e, 8192) == -1) {
            return -1L;
        }
        return this.f16496e.read(fVar, Math.min(j2, this.f16496e.y0()));
    }

    @Override // j.h
    public byte readByte() throws EOFException {
        L0(1L);
        return this.f16496e.readByte();
    }

    @Override // j.h
    public void readFully(byte[] bArr) throws EOFException {
        i.y.d.l.d(bArr, "sink");
        try {
            L0(bArr.length);
            this.f16496e.readFully(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (this.f16496e.y0() > 0) {
                f fVar = this.f16496e;
                int iW = fVar.W(bArr, i2, (int) fVar.y0());
                if (iW == -1) {
                    throw new AssertionError();
                }
                i2 += iW;
            }
            throw e2;
        }
    }

    @Override // j.h
    public int readInt() throws EOFException {
        L0(4L);
        return this.f16496e.readInt();
    }

    @Override // j.h
    public long readLong() throws EOFException {
        L0(8L);
        return this.f16496e.readLong();
    }

    @Override // j.h
    public short readShort() throws EOFException {
        L0(2L);
        return this.f16496e.readShort();
    }

    @Override // j.d0
    public e0 timeout() {
        return this.f16498g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f16498g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // j.h
    public String u0() {
        return Q(Long.MAX_VALUE);
    }

    @Override // j.h
    public byte[] w0(long j2) throws EOFException {
        L0(j2);
        return this.f16496e.w0(j2);
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            x xVar = x.this;
            if (xVar.f16497f) {
                throw new IOException("closed");
            }
            return (int) Math.min(xVar.f16496e.y0(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            x.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            x xVar = x.this;
            if (xVar.f16497f) {
                throw new IOException("closed");
            }
            if (xVar.f16496e.y0() == 0) {
                x xVar2 = x.this;
                if (xVar2.f16498g.read(xVar2.f16496e, 8192) == -1) {
                    return -1;
                }
            }
            return x.this.f16496e.readByte() & 255;
        }

        public String toString() {
            return x.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            i.y.d.l.d(bArr, "data");
            if (!x.this.f16497f) {
                c.b(bArr.length, i2, i3);
                if (x.this.f16496e.y0() == 0) {
                    x xVar = x.this;
                    if (xVar.f16498g.read(xVar.f16496e, 8192) == -1) {
                        return -1;
                    }
                }
                return x.this.f16496e.W(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        i.y.d.l.d(byteBuffer, "sink");
        if (this.f16496e.y0() == 0 && this.f16498g.read(this.f16496e, 8192) == -1) {
            return -1;
        }
        return this.f16496e.read(byteBuffer);
    }
}