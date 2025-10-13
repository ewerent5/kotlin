package j;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: Sink.kt */
/* loaded from: classes3.dex */
public interface b0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    e0 timeout();

    void write(f fVar, long j2);
}