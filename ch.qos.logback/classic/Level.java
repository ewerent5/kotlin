package ch.qos.logback.classic;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class Level implements Serializable {
    public static final int DEBUG_INT = 10000;
    public static final int OFF_INT = Integer.MAX_VALUE;
    public static final int WARN_INT = 30000;
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;
    public static final Integer OFF_INTEGER = Integer.MAX_VALUE;
    public static final int ERROR_INT = 40000;
    public static final Integer ERROR_INTEGER = Integer.valueOf(ERROR_INT);
    public static final Integer WARN_INTEGER = 30000;
    public static final int INFO_INT = 20000;
    public static final Integer INFO_INTEGER = Integer.valueOf(INFO_INT);
    public static final Integer DEBUG_INTEGER = 10000;
    public static final int TRACE_INT = 5000;
    public static final Integer TRACE_INTEGER = Integer.valueOf(TRACE_INT);
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final Integer ALL_INTEGER = Integer.valueOf(ALL_INT);
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF");
    public static final Level ERROR = new Level(ERROR_INT, "ERROR");
    public static final Level WARN = new Level(30000, "WARN");
    public static final Level INFO = new Level(INFO_INT, "INFO");
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Level TRACE = new Level(TRACE_INT, "TRACE");
    public static final Level ALL = new Level(ALL_INT, "ALL");

    private Level(int i2, String str) {
        this.levelInt = i2;
        this.levelStr = str;
    }

    public static Level fromLocationAwareLoggerInteger(int i2) {
        if (i2 == 0) {
            return TRACE;
        }
        if (i2 == 10) {
            return DEBUG;
        }
        if (i2 == 20) {
            return INFO;
        }
        if (i2 == 30) {
            return WARN;
        }
        if (i2 == 40) {
            return ERROR;
        }
        throw new IllegalArgumentException(i2 + " not a valid level value");
    }

    private Object readResolve() {
        return toLevel(this.levelInt);
    }

    public static Level toLevel(int i2) {
        return toLevel(i2, DEBUG);
    }

    public static Level toLevel(int i2, Level level) {
        return i2 != Integer.MIN_VALUE ? i2 != 5000 ? i2 != 10000 ? i2 != 20000 ? i2 != 30000 ? i2 != 40000 ? i2 != Integer.MAX_VALUE ? level : OFF : ERROR : WARN : INFO : DEBUG : TRACE : ALL;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    public static Level toLevel(String str, Level level) {
        return str == null ? level : str.equalsIgnoreCase("ALL") ? ALL : str.equalsIgnoreCase("TRACE") ? TRACE : str.equalsIgnoreCase("DEBUG") ? DEBUG : str.equalsIgnoreCase("INFO") ? INFO : str.equalsIgnoreCase("WARN") ? WARN : str.equalsIgnoreCase("ERROR") ? ERROR : str.equalsIgnoreCase("OFF") ? OFF : level;
    }

    public static int toLocationAwareLoggerInteger(Level level) {
        if (level == null) {
            throw new IllegalArgumentException("null level parameter is not admitted");
        }
        int i2 = level.toInt();
        if (i2 == 5000) {
            return 0;
        }
        if (i2 == 10000) {
            return 10;
        }
        if (i2 == 20000) {
            return 20;
        }
        if (i2 == 30000) {
            return 30;
        }
        if (i2 == 40000) {
            return 40;
        }
        throw new IllegalArgumentException(level + " not a valid level value");
    }

    public static Level valueOf(String str) {
        return toLevel(str, DEBUG);
    }

    public boolean isGreaterOrEqual(Level level) {
        return this.levelInt >= level.levelInt;
    }

    public int toInt() {
        return this.levelInt;
    }

    public Integer toInteger() {
        int i2 = this.levelInt;
        if (i2 == Integer.MIN_VALUE) {
            return ALL_INTEGER;
        }
        if (i2 == 5000) {
            return TRACE_INTEGER;
        }
        if (i2 == 10000) {
            return DEBUG_INTEGER;
        }
        if (i2 == 20000) {
            return INFO_INTEGER;
        }
        if (i2 == 30000) {
            return WARN_INTEGER;
        }
        if (i2 == 40000) {
            return ERROR_INTEGER;
        }
        if (i2 == Integer.MAX_VALUE) {
            return OFF_INTEGER;
        }
        throw new IllegalStateException("Level " + this.levelStr + ", " + this.levelInt + " is unknown.");
    }

    public String toString() {
        return this.levelStr;
    }
}