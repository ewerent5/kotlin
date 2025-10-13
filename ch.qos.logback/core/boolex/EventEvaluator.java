package ch.qos.logback.core.boolex;

import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;

/* loaded from: classes.dex */
public interface EventEvaluator<E> extends ContextAware, LifeCycle {
    boolean evaluate(E e2);

    String getName();

    void setName(String str);
}