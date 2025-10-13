package j;

import ch.qos.logback.core.CoreConstants;

/* compiled from: ForwardingSource.kt */
/* loaded from: classes3.dex */
public abstract class l implements d0 {
    private final d0 delegate;

    public l(d0 d0Var) {
        i.y.d.l.d(d0Var, "delegate");
        this.delegate = d0Var;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final d0 m11deprecated_delegate() {
        return this.delegate;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final d0 delegate() {
        return this.delegate;
    }

    @Override // j.d0
    public long read(f fVar, long j2) {
        i.y.d.l.d(fVar, "sink");
        return this.delegate.read(fVar, j2);
    }

    @Override // j.d0
    public e0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}