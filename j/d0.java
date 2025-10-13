package j;

import java.io.Closeable;

/* compiled from: Source.kt */
/* loaded from: classes3.dex */
public interface d0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(f fVar, long j2);

    e0 timeout();
}