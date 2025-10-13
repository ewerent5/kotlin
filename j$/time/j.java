package j$.time;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Marker;

/* loaded from: classes2.dex */
public abstract class j implements Serializable {
    public static final Map a;

    static {
        HashMap map = new HashMap(64);
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        a = Collections.unmodifiableMap(map);
    }

    j() {
        if (getClass() != k.class && getClass() != l.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static j v(String str, Map map) {
        int i2;
        Objects.requireNonNull(str, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str2 = (String) map.get(str);
        if (str2 != null) {
            str = str2;
        }
        if (str.length() <= 1 || str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
            return k.z(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i2 = 3;
        } else {
            if (!str.startsWith("UT")) {
                return l.y(str, true);
            }
            i2 = 2;
        }
        return x(str, i2, true);
    }

    public static j w(String str, k kVar) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(kVar, "offset");
        if (str.length() == 0) {
            return kVar;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (kVar.y() != 0) {
                str = str.concat(kVar.g());
            }
            return new l(str, j$.time.p.c.e(kVar));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static j x(String str, int i2, boolean z) {
        String strSubstring = str.substring(0, i2);
        if (str.length() == i2) {
            return w(strSubstring, k.f15926d);
        }
        if (str.charAt(i2) != '+' && str.charAt(i2) != '-') {
            return l.y(str, z);
        }
        try {
            k kVarZ = k.z(str.substring(i2));
            return kVarZ == k.f15926d ? w(strSubstring, kVarZ) : w(strSubstring, kVarZ);
        } catch (c e2) {
            throw new c("Invalid ID for offset-based ZoneId: " + str, e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return g().equals(((j) obj).g());
        }
        return false;
    }

    public abstract String g();

    public int hashCode() {
        return g().hashCode();
    }

    public abstract j$.time.p.c t();

    public String toString() {
        return g();
    }
}