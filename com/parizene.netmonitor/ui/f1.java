package com.parizene.netmonitor.ui;

import android.text.TextUtils;

/* compiled from: NetworkTypeUtils.java */
/* loaded from: classes3.dex */
public class f1 {
    public static String a(int i2) {
        if (1 == i2) {
            return "lte";
        }
        if (2 == i2) {
            return "wcdma";
        }
        if (3 == i2) {
            return "gsm";
        }
        if (4 == i2) {
            return "cdma";
        }
        if (5 == i2) {
            return "tdscdma";
        }
        if (6 == i2) {
            return "nr";
        }
        return null;
    }

    public static String b(com.parizene.netmonitor.m0.z.b bVar, int i2, int i3, String str) {
        String strA = a(i2);
        String strD = null;
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        if (i3 == -1) {
            return strA;
        }
        if (3 == i2) {
            strD = bVar.a(i3, str);
        } else if (2 == i2) {
            strD = bVar.e(i3);
        } else if (1 == i2) {
            strD = bVar.b(i3);
        } else if (6 == i2) {
            strD = bVar.d(i3);
        }
        if (TextUtils.isEmpty(strD)) {
            return strA;
        }
        return strA + " • " + i3 + " (" + strD + ")";
    }
}