package ch.qos.logback.core.pattern;

import ch.qos.logback.classic.Level;
import java.util.Objects;

/* loaded from: classes.dex */
public class FormatInfo {
    private boolean leftPad;
    private boolean leftTruncate;
    private int max;
    private int min;

    public FormatInfo() {
        this.min = Level.ALL_INT;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
    }

    public FormatInfo(int i2, int i3) {
        this.min = Level.ALL_INT;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i2;
        this.max = i3;
    }

    public FormatInfo(int i2, int i3, boolean z, boolean z2) {
        this.min = Level.ALL_INT;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i2;
        this.max = i3;
        this.leftPad = z;
        this.leftTruncate = z2;
    }

    public static FormatInfo valueOf(String str) throws NumberFormatException {
        Objects.requireNonNull(str, "Argument cannot be null");
        FormatInfo formatInfo = new FormatInfo();
        int iIndexOf = str.indexOf(46);
        String strSubstring = null;
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            int i2 = iIndexOf + 1;
            if (i2 == str.length()) {
                throw new IllegalArgumentException("Formatting string [" + str + "] should not end with '.'");
            }
            strSubstring = str.substring(i2);
            str = strSubstring2;
        }
        if (str != null && str.length() > 0) {
            int i3 = Integer.parseInt(str);
            if (i3 >= 0) {
                formatInfo.min = i3;
            } else {
                formatInfo.min = -i3;
                formatInfo.leftPad = false;
            }
        }
        if (strSubstring != null && strSubstring.length() > 0) {
            int i4 = Integer.parseInt(strSubstring);
            if (i4 >= 0) {
                formatInfo.max = i4;
            } else {
                formatInfo.max = -i4;
                formatInfo.leftTruncate = false;
            }
        }
        return formatInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatInfo)) {
            return false;
        }
        FormatInfo formatInfo = (FormatInfo) obj;
        return this.min == formatInfo.min && this.max == formatInfo.max && this.leftPad == formatInfo.leftPad && this.leftTruncate == formatInfo.leftTruncate;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((((this.min * 31) + this.max) * 31) + (this.leftPad ? 1 : 0)) * 31) + (this.leftTruncate ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.leftPad;
    }

    public boolean isLeftTruncate() {
        return this.leftTruncate;
    }

    public void setLeftPad(boolean z) {
        this.leftPad = z;
    }

    public void setLeftTruncate(boolean z) {
        this.leftTruncate = z;
    }

    public void setMax(int i2) {
        this.max = i2;
    }

    public void setMin(int i2) {
        this.min = i2;
    }

    public String toString() {
        return "FormatInfo(" + this.min + ", " + this.max + ", " + this.leftPad + ", " + this.leftTruncate + ")";
    }
}