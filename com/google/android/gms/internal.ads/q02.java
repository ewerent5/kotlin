package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class q02 extends p02 {
    private final char a;

    q02(char c2) {
        this.a = c2;
    }

    @Override // com.google.android.gms.internal.ads.t02
    public final boolean a(char c2) {
        return c2 == this.a;
    }

    public final String toString() {
        int i2 = this.a;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strCopyValueOf);
        sb.append("')");
        return sb.toString();
    }
}