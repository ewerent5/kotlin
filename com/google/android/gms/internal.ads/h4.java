package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class h4 extends i4 {
    h4() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (length > 0) {
            int i4 = length - 1;
            if (str.charAt(i4) != ',') {
                break;
            }
            length = i4;
        }
        if (length < i3) {
            return null;
        }
        if (i3 != 0) {
            i2 = i3;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i2, length);
    }

    @Override // com.google.android.gms.internal.ads.i4
    public final String a(String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        if (TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (TextUtils.isEmpty(strB2)) {
            return strB;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(strB2).length());
        sb.append(strB);
        sb.append(",");
        sb.append(strB2);
        return sb.toString();
    }
}