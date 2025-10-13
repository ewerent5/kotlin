package com.parizene.netmonitor.n0;

import android.text.TextUtils;

/* compiled from: ClfImporter.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: ClfImporter.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.Hex20.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.Dec21.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.Hex30.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.Dec30.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static c a(String str) {
        String strSubstring;
        String strSubstring2;
        try {
            int iIntValue = Integer.decode("0x" + str.substring(0, 4)).intValue();
            int iIntValue2 = Integer.decode("0x" + str.substring(4, 8)).intValue();
            String strSubstring3 = str.substring(8, 11);
            if (str.substring(13, 14).matches("[\t ]")) {
                strSubstring = str.substring(11, 13);
                strSubstring2 = str.substring(14);
            } else {
                strSubstring = str.substring(11, 14);
                strSubstring2 = str.substring(15);
            }
            String str2 = strSubstring;
            if (strSubstring3.matches("\\d{3}") && str2.matches("\\d{2,3}") && !TextUtils.isEmpty(strSubstring2)) {
                return new c(strSubstring3, str2, iIntValue2, iIntValue, 0, 0, strSubstring2.replace("'", "''"));
            }
            return null;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }

    private static c b(String str) {
        String strSubstring;
        String strSubstring2;
        try {
            int iIntValue = Integer.valueOf(str.substring(0, 5)).intValue();
            int iIntValue2 = Integer.valueOf(str.substring(5, 10)).intValue();
            String strSubstring3 = str.substring(10, 13);
            if (str.substring(15, 16).matches("[\t ]")) {
                strSubstring = str.substring(13, 15);
                strSubstring2 = str.substring(16);
            } else {
                strSubstring = str.substring(13, 16);
                strSubstring2 = str.substring(17);
            }
            String str2 = strSubstring;
            if (strSubstring3.matches("\\d{3}") && str2.matches("\\d{2,3}") && !TextUtils.isEmpty(strSubstring2)) {
                return new c(strSubstring3, str2, iIntValue2, iIntValue, 0, 0, strSubstring2.replace("'", "''"));
            }
            return null;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }

    private static c c(String str) {
        int i2;
        int iDoubleValue;
        try {
            String[] strArrSplit = str.split(";", 9);
            String strSubstring = strArrSplit[0].substring(0, 3);
            String strSubstring2 = strArrSplit[0].substring(3);
            int iIntValue = Integer.valueOf(strArrSplit[1]).intValue();
            int iIntValue2 = Integer.valueOf(strArrSplit[2]).intValue();
            if (TextUtils.isEmpty(strArrSplit[4]) || TextUtils.isEmpty(strArrSplit[5])) {
                i2 = 0;
                iDoubleValue = 0;
            } else {
                int iDoubleValue2 = (int) (Double.valueOf(strArrSplit[4].replace(",", ".")).doubleValue() * 1000000.0d);
                iDoubleValue = (int) (Double.valueOf(strArrSplit[5].replace(",", ".")).doubleValue() * 1000000.0d);
                i2 = iDoubleValue2;
            }
            String str2 = strArrSplit[7];
            if (!strSubstring.matches("\\d{3}") || !strSubstring2.matches("\\d{2,3}")) {
                return null;
            }
            if (TextUtils.isEmpty(str2) && (i2 == 0 || iDoubleValue == 0)) {
                return null;
            }
            return new c(strSubstring, strSubstring2, iIntValue2, iIntValue, i2, iDoubleValue, str2.replace("'", "''"));
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }

    private static c d(String str) {
        int i2;
        int iDoubleValue;
        try {
            String[] strArrSplit = str.split(";", 9);
            String strSubstring = strArrSplit[0].substring(0, 3);
            String strSubstring2 = strArrSplit[0].substring(3);
            int iIntValue = Integer.decode(strArrSplit[1]).intValue();
            int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
            if (TextUtils.isEmpty(strArrSplit[4]) || TextUtils.isEmpty(strArrSplit[5])) {
                i2 = 0;
                iDoubleValue = 0;
            } else {
                int iDoubleValue2 = (int) (Double.valueOf(strArrSplit[4].replace(",", ".")).doubleValue() * 1000000.0d);
                iDoubleValue = (int) (Double.valueOf(strArrSplit[5].replace(",", ".")).doubleValue() * 1000000.0d);
                i2 = iDoubleValue2;
            }
            String str2 = strArrSplit[7];
            if (!strSubstring.matches("\\d{3}") || !strSubstring2.matches("\\d{2,3}")) {
                return null;
            }
            if (TextUtils.isEmpty(str2) && (i2 == 0 || iDoubleValue == 0)) {
                return null;
            }
            return new c(strSubstring, strSubstring2, iIntValue2, iIntValue, i2, iDoubleValue, str2.replace("'", "''"));
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }

    private static c e(String str) {
        int i2;
        int iDoubleValue;
        try {
            String[] strArrSplit = str.split(";", 7);
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            int iIntValue = Integer.valueOf(strArrSplit[2]).intValue();
            int iIntValue2 = Integer.valueOf(strArrSplit[3]).intValue();
            if (TextUtils.isEmpty(strArrSplit[4]) || TextUtils.isEmpty(strArrSplit[5])) {
                i2 = 0;
                iDoubleValue = 0;
            } else {
                int iDoubleValue2 = (int) (Double.valueOf(strArrSplit[4].replace(",", ".")).doubleValue() * 1000000.0d);
                iDoubleValue = (int) (Double.valueOf(strArrSplit[5].replace(",", ".")).doubleValue() * 1000000.0d);
                i2 = iDoubleValue2;
            }
            String str4 = strArrSplit[6];
            if (!str2.matches("\\d{3}")) {
                return null;
            }
            if (!str3.matches("\\d{2,3}") && !str3.matches("\\d{5}")) {
                return null;
            }
            if (TextUtils.isEmpty(str4) && (i2 == 0 || iDoubleValue == 0)) {
                return null;
            }
            return new c(str2, str3, iIntValue, iIntValue2, i2, iDoubleValue, str4.replace("'", "''"));
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }

    public static c f(String str, e eVar) {
        int i2 = a.a[eVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? e(str) : c(str) : d(str) : b(str) : a(str);
    }
}