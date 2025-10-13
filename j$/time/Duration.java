package j$.time;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {
    public static final Duration a = new Duration(0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final long f15898b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15899c;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j2, int i2) {
        this.f15898b = j2;
        this.f15899c = i2;
    }

    private static Duration h(long j2, int i2) {
        return (((long) i2) | j2) == 0 ? a : new Duration(j2, i2);
    }

    public static Duration j(long j2) {
        long j3 = j2 / 1000000000;
        int i2 = (int) (j2 % 1000000000);
        if (i2 < 0) {
            i2 = (int) (i2 + 1000000000);
            j3--;
        }
        return h(j3, i2);
    }

    public static Duration l(long j2) {
        return h(j2, 0);
    }

    public static Duration n(long j2, long j3) {
        return h(a.z(j2, a.D(j3, 1000000000L)), (int) a.B(j3, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f15898b, duration2.f15898b);
        return iCompare != 0 ? iCompare : this.f15899c - duration2.f15899c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        return this.f15898b == duration.f15898b && this.f15899c == duration.f15899c;
    }

    public int hashCode() {
        long j2 = this.f15898b;
        return (this.f15899c * 51) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public long toMillis() {
        return a.z(a.C(this.f15898b, CoreConstants.MILLIS_IN_ONE_SECOND), this.f15899c / 1000000);
    }

    public String toString() {
        if (this == a) {
            return "PT0S";
        }
        long j2 = this.f15898b;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && this.f15899c == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i3 >= 0 || this.f15899c <= 0) {
            sb.append(i3);
        } else if (i3 == -1) {
            sb.append("-0");
        } else {
            sb.append(i3 + 1);
        }
        if (this.f15899c > 0) {
            int length = sb.length();
            if (i3 < 0) {
                sb.append(2000000000 - this.f15899c);
            } else {
                sb.append(this.f15899c + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, CoreConstants.DOT);
        }
        sb.append('S');
        return sb.toString();
    }
}