package j;

import ch.qos.logback.core.CoreConstants;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink.kt */
/* loaded from: classes3.dex */
public final class j implements b0 {

    /* renamed from: e, reason: collision with root package name */
    private boolean f16468e;

    /* renamed from: f, reason: collision with root package name */
    private final g f16469f;

    /* renamed from: g, reason: collision with root package name */
    private final Deflater f16470g;

    public j(g gVar, Deflater deflater) {
        i.y.d.l.d(gVar, "sink");
        i.y.d.l.d(deflater, "deflater");
        this.f16469f = gVar;
        this.f16470g = deflater;
    }

    @IgnoreJRERequirement
    private final void b(boolean z) {
        y yVarO0;
        int iDeflate;
        f fVarE = this.f16469f.e();
        while (true) {
            yVarO0 = fVarE.O0(1);
            if (z) {
                Deflater deflater = this.f16470g;
                byte[] bArr = yVarO0.f16500b;
                int i2 = yVarO0.f16502d;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f16470g;
                byte[] bArr2 = yVarO0.f16500b;
                int i3 = yVarO0.f16502d;
                iDeflate = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                yVarO0.f16502d += iDeflate;
                fVarE.v0(fVarE.y0() + iDeflate);
                this.f16469f.O();
            } else if (this.f16470g.needsInput()) {
                break;
            }
        }
        if (yVarO0.f16501c == yVarO0.f16502d) {
            fVarE.f16453e = yVarO0.b();
            z.b(yVarO0);
        }
    }

    public final void c() {
        this.f16470g.finish();
        b(false);
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f16468e) {
            return;
        }
        Throwable th = null;
        try {
            c();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f16470g.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f16469f.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f16468e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // j.b0, java.io.Flushable
    public void flush() {
        b(true);
        this.f16469f.flush();
    }

    @Override // j.b0
    public e0 timeout() {
        return this.f16469f.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f16469f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        i.y.d.l.d(fVar, "source");
        c.b(fVar.y0(), 0L, j2);
        while (j2 > 0) {
            y yVar = fVar.f16453e;
            i.y.d.l.b(yVar);
            int iMin = (int) Math.min(j2, yVar.f16502d - yVar.f16501c);
            this.f16470g.setInput(yVar.f16500b, yVar.f16501c, iMin);
            b(false);
            long j3 = iMin;
            fVar.v0(fVar.y0() - j3);
            int i2 = yVar.f16501c + iMin;
            yVar.f16501c = i2;
            if (i2 == yVar.f16502d) {
                fVar.f16453e = yVar.b();
                z.b(yVar);
            }
            j2 -= j3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(b0 b0Var, Deflater deflater) {
        this(q.c(b0Var), deflater);
        i.y.d.l.d(b0Var, "sink");
        i.y.d.l.d(deflater, "deflater");
    }
}