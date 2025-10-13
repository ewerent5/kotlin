package j;

import ch.qos.logback.core.CoreConstants;

/* compiled from: ForwardingSink.kt */
/* loaded from: classes3.dex */
public abstract class k implements b0 {
    private final b0 delegate;

    public k(b0 b0Var) {
        i.y.d.l.d(b0Var, "delegate");
        this.delegate = b0Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final b0 m10deprecated_delegate() {
        return this.delegate;
    }

    @Override // j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final b0 delegate() {
        return this.delegate;
    }

    @Override // j.b0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // j.b0
    public e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // j.b0
    public void write(f fVar, long j2) {
        i.y.d.l.d(fVar, "source");
        this.delegate.write(fVar, j2);
    }
}