package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class v62 implements Comparable<v62> {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f9666e;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(v62 v62Var) {
        v62 v62Var2 = v62Var;
        int length = this.f9666e.length;
        int length2 = v62Var2.f9666e.length;
        if (length != length2) {
            return length - length2;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f9666e;
            if (i2 >= bArr.length) {
                return 0;
            }
            byte b2 = bArr[i2];
            byte b3 = v62Var2.f9666e[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v62) {
            return Arrays.equals(this.f9666e, ((v62) obj).f9666e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9666e);
    }

    public final String toString() {
        byte[] bArr = this.f9666e;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            sb.append("0123456789abcdef".charAt(i2 >> 4));
            sb.append("0123456789abcdef".charAt(i2 & 15));
        }
        return sb.toString();
    }
}