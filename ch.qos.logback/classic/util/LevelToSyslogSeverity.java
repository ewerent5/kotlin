package ch.qos.logback.classic.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;

/* loaded from: classes.dex */
public class LevelToSyslogSeverity {
    public static int convert(ILoggingEvent iLoggingEvent) {
        Level level = iLoggingEvent.getLevel();
        int i2 = level.levelInt;
        if (i2 == 5000 || i2 == 10000) {
            return 7;
        }
        if (i2 == 20000) {
            return 6;
        }
        if (i2 == 30000) {
            return 4;
        }
        if (i2 == 40000) {
            return 3;
        }
        throw new IllegalArgumentException("Level " + level + " is not a valid level for a printing method");
    }
}