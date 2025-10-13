package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

/* loaded from: classes.dex */
public abstract class NamedConverter extends ClassicConverter {
    Abbreviator abbreviator = null;

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        String fullyQualifiedName = getFullyQualifiedName(iLoggingEvent);
        Abbreviator abbreviator = this.abbreviator;
        return abbreviator == null ? fullyQualifiedName : abbreviator.abbreviate(fullyQualifiedName);
    }

    protected abstract String getFullyQualifiedName(ILoggingEvent iLoggingEvent);

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() throws NumberFormatException {
        String firstOption = getFirstOption();
        if (firstOption != null) {
            try {
                int i2 = Integer.parseInt(firstOption);
                if (i2 == 0) {
                    this.abbreviator = new ClassNameOnlyAbbreviator();
                } else if (i2 > 0) {
                    this.abbreviator = new TargetLengthBasedClassNameAbbreviator(i2);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }
}