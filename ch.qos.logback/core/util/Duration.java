package ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Duration {
    static final long DAYS_COEFFICIENT = 86400000;
    private static final int DOUBLE_GROUP = 1;
    private static final String DOUBLE_PART = "([0-9]*(.[0-9]+)?)";
    private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    static final long HOURS_COEFFICIENT = 3600000;
    static final long MINUTES_COEFFICIENT = 60000;
    static final long SECONDS_COEFFICIENT = 1000;
    private static final int UNIT_GROUP = 3;
    private static final String UNIT_PART = "(|milli(second)?|second(e)?|minute|hour|day)s?";
    final long millis;

    public Duration(long j2) {
        this.millis = j2;
    }

    public static Duration buildByDays(double d2) {
        return new Duration((long) (d2 * 8.64E7d));
    }

    public static Duration buildByHours(double d2) {
        return new Duration((long) (d2 * 3600000.0d));
    }

    public static Duration buildByMilliseconds(double d2) {
        return new Duration((long) d2);
    }

    public static Duration buildByMinutes(double d2) {
        return new Duration((long) (d2 * 60000.0d));
    }

    public static Duration buildBySeconds(double d2) {
        return new Duration((long) (d2 * 1000.0d));
    }

    public static Duration buildUnbounded() {
        return new Duration(Long.MAX_VALUE);
    }

    public static Duration valueOf(String str) {
        Matcher matcher = DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("String value [" + str + "] is not in the expected format.");
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(3);
        double dDoubleValue = Double.valueOf(strGroup).doubleValue();
        if (strGroup2.equalsIgnoreCase("milli") || strGroup2.equalsIgnoreCase("millisecond") || strGroup2.length() == 0) {
            return buildByMilliseconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("second") || strGroup2.equalsIgnoreCase("seconde")) {
            return buildBySeconds(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("minute")) {
            return buildByMinutes(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("hour")) {
            return buildByHours(dDoubleValue);
        }
        if (strGroup2.equalsIgnoreCase("day")) {
            return buildByDays(dDoubleValue);
        }
        throw new IllegalStateException("Unexpected " + strGroup2);
    }

    public long getMilliseconds() {
        return this.millis;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        long j2 = this.millis;
        if (j2 < 1000) {
            sb = new StringBuilder();
            sb.append(this.millis);
            str = " milliseconds";
        } else if (j2 < 60000) {
            sb = new StringBuilder();
            sb.append(this.millis / 1000);
            str = " seconds";
        } else if (j2 < HOURS_COEFFICIENT) {
            sb = new StringBuilder();
            sb.append(this.millis / 60000);
            str = " minutes";
        } else {
            sb = new StringBuilder();
            sb.append(this.millis / HOURS_COEFFICIENT);
            str = " hours";
        }
        sb.append(str);
        return sb.toString();
    }
}