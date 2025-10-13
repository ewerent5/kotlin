package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.PostCompileProcessor;

/* loaded from: classes.dex */
public class EnsureExceptionHandling implements PostCompileProcessor<ILoggingEvent> {
    public boolean chainHandlesThrowable(Converter converter) {
        while (converter != null) {
            if (converter instanceof ThrowableHandlingConverter) {
                return true;
            }
            converter = converter.getNext();
        }
        return false;
    }

    @Override // ch.qos.logback.core.pattern.PostCompileProcessor
    public void process(Converter<ILoggingEvent> converter) {
        if (converter == null) {
            throw new IllegalArgumentException("cannot process empty chain");
        }
        if (chainHandlesThrowable(converter)) {
            return;
        }
        ConverterUtil.findTail(converter).setNext(new ExtendedThrowableProxyConverter());
    }
}