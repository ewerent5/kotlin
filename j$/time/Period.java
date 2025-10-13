package j$.time;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Period implements Serializable {
    public static final Period a = new Period(0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f15902b = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    /* renamed from: c, reason: collision with root package name */
    private final int f15903c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15904d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15905e;

    static {
        Collections.unmodifiableList(Arrays.asList(j$.time.o.i.YEARS, j$.time.o.i.MONTHS, j$.time.o.i.DAYS));
    }

    private Period(int i2, int i3, int i4) {
        this.f15903c = i2;
        this.f15904d = i3;
        this.f15905e = i4;
    }

    private static Period a(int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? a : new Period(i2, i3, i4);
    }

    private static int b(CharSequence charSequence, String str, int i2) {
        if (str == null) {
            return 0;
        }
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        try {
            return a.A(Integer.parseInt(str), i2);
        } catch (ArithmeticException e2) {
            throw new j$.time.n.d("Text cannot be parsed to a Period", charSequence, 0, e2);
        }
    }

    public static Period ofDays(int i2) {
        return a(0, 0, i2);
    }

    public static Period ofYears(int i2) {
        return a(i2, 0, 0);
    }

    public static Period parse(CharSequence charSequence) {
        Objects.requireNonNull(charSequence, "text");
        Matcher matcher = f15902b.matcher(charSequence);
        if (matcher.matches()) {
            int i2 = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup4 != null || strGroup3 != null) {
                try {
                    int iB = b(charSequence, strGroup, i2);
                    int iB2 = b(charSequence, strGroup2, i2);
                    long jB = b(charSequence, strGroup4, i2) + a.A(b(charSequence, strGroup3, i2), 7);
                    int i3 = (int) jB;
                    if (jB == i3) {
                        return a(iB, iB2, i3);
                    }
                    throw new ArithmeticException();
                } catch (NumberFormatException e2) {
                    throw new j$.time.n.d("Text cannot be parsed to a Period", charSequence, 0, e2);
                }
            }
        }
        throw new j$.time.n.d("Text cannot be parsed to a Period", charSequence, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.f15903c == period.f15903c && this.f15904d == period.f15904d && this.f15905e == period.f15905e;
    }

    public int getDays() {
        return this.f15905e;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f15905e, 16) + Integer.rotateLeft(this.f15904d, 8) + this.f15903c;
    }

    public String toString() {
        if (this == a) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i2 = this.f15903c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f15904d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f15905e;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }
}