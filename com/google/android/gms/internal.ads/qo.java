package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qo {
    public static gv2 a(t83 t83Var) throws NumberFormatException {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = t83Var.f9091c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jB = str != null ? b(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i3 = 0;
            j2 = 0;
            j3 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get("Expires");
        long jB2 = str3 != null ? b(str3) : 0L;
        String str4 = map.get("Last-Modified");
        long jB3 = str4 != null ? b(str4) : 0L;
        String str5 = map.get("ETag");
        if (z) {
            j5 = jCurrentTimeMillis + (j2 * 1000);
            if (i2 != 0) {
                j6 = j5;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j5;
            }
            j4 = j6;
        } else {
            j4 = 0;
            if (jB <= 0 || jB2 < jB) {
                j5 = 0;
            } else {
                j5 = jCurrentTimeMillis + (jB2 - jB);
                j4 = j5;
            }
        }
        gv2 gv2Var = new gv2();
        gv2Var.a = t83Var.f9090b;
        gv2Var.f6205b = str5;
        gv2Var.f6209f = j5;
        gv2Var.f6208e = j4;
        gv2Var.f6206c = jB;
        gv2Var.f6207d = jB3;
        gv2Var.f6210g = map;
        gv2Var.f6211h = t83Var.f9092d;
        return gv2Var;
    }

    public static long b(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || "-1".equals(str)) {
                pd.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            pd.d(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String c(long j2) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j2));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}