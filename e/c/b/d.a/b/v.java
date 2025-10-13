package e.c.b.d.a.b;

import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class v implements Closeable {
    public abstract long b();

    protected abstract InputStream c(long j2, long j3);

    public final synchronized InputStream d() {
        return c(0L, b());
    }
}