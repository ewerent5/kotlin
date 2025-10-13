package okhttp3.internal.cache;

import i.s;
import i.y.c.l;
import j.b0;
import j.f;
import j.k;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: FaultHidingSink.kt */
/* loaded from: classes3.dex */
public class FaultHidingSink extends k {
    private boolean hasErrors;
    private final l<IOException, s> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(b0 b0Var, l<? super IOException, s> lVar) {
        super(b0Var);
        i.y.d.l.d(b0Var, "delegate");
        i.y.d.l.d(lVar, "onException");
        this.onException = lVar;
    }

    @Override // j.k, j.b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    @Override // j.k, j.b0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    public final l<IOException, s> getOnException() {
        return this.onException;
    }

    @Override // j.k, j.b0
    public void write(f fVar, long j2) throws EOFException {
        i.y.d.l.d(fVar, "source");
        if (this.hasErrors) {
            fVar.h(j2);
            return;
        }
        try {
            super.write(fVar, j2);
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }
}