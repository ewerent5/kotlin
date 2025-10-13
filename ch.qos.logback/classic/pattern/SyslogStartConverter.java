package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.net.SyslogAppenderBase;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public class SyslogStartConverter extends ClassicConverter {
    int facility;
    SimpleDateFormat simpleFormat;
    long lastTimestamp = -1;
    String timesmapStr = null;
    final String localHostName = "localhost";

    String computeTimeStampString(long j2) {
        String str;
        synchronized (this) {
            if (j2 != this.lastTimestamp) {
                this.lastTimestamp = j2;
                this.timesmapStr = this.simpleFormat.format(new Date(j2));
            }
            str = this.timesmapStr;
        }
        return str;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        StringBuilder sb = new StringBuilder();
        int iConvert = this.facility + LevelToSyslogSeverity.convert(iLoggingEvent);
        sb.append("<");
        sb.append(iConvert);
        sb.append(">");
        sb.append(computeTimeStampString(iLoggingEvent.getTimeStamp()));
        sb.append(' ');
        sb.append("localhost");
        sb.append(' ');
        return sb.toString();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z;
        String firstOption = getFirstOption();
        if (firstOption == null) {
            addError("was expecting a facility string as an option");
            return;
        }
        this.facility = SyslogAppenderBase.facilityStringToint(firstOption);
        try {
            this.simpleFormat = new SimpleDateFormat("MMM dd HH:mm:ss", new DateFormatSymbols(Locale.US));
            z = false;
        } catch (IllegalArgumentException e2) {
            addError("Could not instantiate SimpleDateFormat", e2);
            z = true;
        }
        if (z) {
            return;
        }
        super.start();
    }
}