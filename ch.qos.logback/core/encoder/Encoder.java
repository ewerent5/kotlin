package ch.qos.logback.core.encoder;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface Encoder<E> extends ContextAware, LifeCycle {
    void close();

    void doEncode(E e2);

    void init(OutputStream outputStream);
}