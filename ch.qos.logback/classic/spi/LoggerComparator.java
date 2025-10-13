package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Logger;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class LoggerComparator implements Comparator<Logger>, Serializable, j$.util.Comparator {
    private static final long serialVersionUID = 1;

    @Override // java.util.Comparator, j$.util.Comparator
    public int compare(Logger logger, Logger logger2) {
        if (logger.getName().equals(logger2.getName())) {
            return 0;
        }
        if (logger.getName().equals(org.slf4j.Logger.ROOT_LOGGER_NAME)) {
            return -1;
        }
        if (logger2.getName().equals(org.slf4j.Logger.ROOT_LOGGER_NAME)) {
            return 1;
        }
        return logger.getName().compareTo(logger2.getName());
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ Comparator reversed() {
        return Collections.reverseOrder(this);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }
}