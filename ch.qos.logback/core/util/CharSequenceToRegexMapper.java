package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.androidplot.R;

/* loaded from: classes.dex */
class CharSequenceToRegexMapper {
    CharSequenceToRegexMapper() {
    }

    private String number(int i2) {
        return "\\d{" + i2 + "}";
    }

    String toRegex(CharSequenceState charSequenceState) {
        int i2 = charSequenceState.occurrences;
        char c2 = charSequenceState.f3510c;
        if (c2 != 'y') {
            if (c2 == 'z') {
                return ".*";
            }
            switch (c2) {
                case '\'':
                    if (i2 == 1) {
                        return "";
                    }
                    throw new IllegalStateException("Too many single quotes");
                case '.':
                    return "\\.";
                case 'K':
                case 'S':
                case 'W':
                case 'd':
                case SyslogConstants.LOG_AUDIT /* 104 */:
                case 'k':
                case 'm':
                case 's':
                case 'w':
                    break;
                case 'M':
                    return i2 >= 3 ? ".{3,12}" : number(i2);
                case R.styleable.xy_XYPlot_rangeLineExtension /* 90 */:
                    return "(\\+|-)\\d{4}";
                case '\\':
                    throw new IllegalStateException("Forward slashes are not allowed");
                case 'a':
                    return ".{2}";
                default:
                    switch (c2) {
                        case 'D':
                        case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                        case SyslogConstants.LOG_CRON /* 72 */:
                            break;
                        case 'E':
                            return ".{2,12}";
                        case 'G':
                            return ".*";
                        default:
                            if (i2 == 1) {
                                return "" + c2;
                            }
                            return c2 + "{" + i2 + "}";
                    }
            }
        }
        return number(i2);
    }
}