package j;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* compiled from: RealBufferedSink.kt */
/* loaded from: classes3.dex */
public final class w implements g {

    /* renamed from: e, reason: collision with root package name */
    public final f f16493e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16494f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f16495g;

    public w(b0 b0Var) {
        i.y.d.l.d(b0Var, "sink");
        this.f16495g = b0Var;
        this.f16493e = new f();
    }

    @Override // j.g
    public g A0(byte[] bArr) {
        i.y.d.l.d(bArr, "source");
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.A0(bArr);
        return O();
    }

    @Override // j.g
    public g B0(i iVar) {
        i.y.d.l.d(iVar, "byteString");
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.B0(iVar);
        return O();
    }

    @Override // j.g
    public g I(int i2) {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.I(i2);
        return O();
    }

    @Override // j.g
    public g M0(long j2) {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.M0(j2);
        return O();
    }

    @Override // j.g
    public g O() {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        long jG = this.f16493e.g();
        if (jG > 0) {
            this.f16495g.write(this.f16493e, jG);
        }
        return this;
    }

    @Override // j.g
    public g Y(String str) {
        i.y.d.l.d(str, "string");
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.Y(str);
        return O();
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f16494f) {
            return;
        }
        Throwable th = null;
        try {
            if (this.f16493e.y0() > 0) {
                b0 b0Var = this.f16495g;
                f fVar = this.f16493e;
                b0Var.write(fVar, fVar.y0());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f16495g.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f16494f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // j.g
    public f e() {
        return this.f16493e;
    }

    @Override // j.g, j.b0, java.io.Flushable
    public void flush() {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f16493e.y0() > 0) {
            b0 b0Var = this.f16495g;
            f fVar = this.f16493e;
            b0Var.write(fVar, fVar.y0());
        }
        this.f16495g.flush();
    }

    @Override // j.g
    public g g0(byte[] bArr, int i2, int i3) {
        i.y.d.l.d(bArr, "source");
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.g0(bArr, i2, i3);
        return O();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f16494f;
    }

    @Override // j.g
    public long m0(d0 d0Var) {
        i.y.d.l.d(d0Var, "source");
        long j2 = 0;
        while (true) {
            long j3 = d0Var.read(this.f16493e, 8192);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            O();
        }
    }

    @Override // j.g
    public g n0(long j2) {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.n0(j2);
        return O();
    }

    @Override // j.g
    public g t() {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        long jY0 = this.f16493e.y0();
        if (jY0 > 0) {
            this.f16495g.write(this.f16493e, jY0);
        }
        return this;
    }

    @Override // j.b0
    public e0 timeout() {
        return this.f16495g.timeout();
    }

    public String toString() {
        return "buffer(" + this.f16495g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // j.g
    public g u(int i2) {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.u(i2);
        return O();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        i.y.d.l.d(byteBuffer, "source");
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f16493e.write(byteBuffer);
        O();
        return iWrite;
    }

    @Override // j.g
    public g y(int i2) {
        if (!(!this.f16494f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f16493e.y(i2);
        return O();
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        i.y.d.l.d(fVar, "source");
        if (!this.f16494f) {
            this.f16493e.write(fVar, j2);
            O();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}