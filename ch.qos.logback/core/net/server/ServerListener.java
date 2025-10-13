package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface ServerListener<T extends Client> extends Closeable {
    T acceptClient();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}