package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rz2 {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8804b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8805c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8806d;

    public rz2(Uri uri, byte[] bArr, long j2, long j3, long j4, String str, int i2) {
        f03.a(j2 >= 0);
        f03.a(j3 >= 0);
        f03.a(j4 > 0 || j4 == -1);
        this.a = uri;
        this.f8804b = j2;
        this.f8805c = j3;
        this.f8806d = j4;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = Arrays.toString((byte[]) null);
        long j2 = this.f8804b;
        long j3 = this.f8805c;
        long j4 = this.f8806d;
        int length = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 93 + String.valueOf(string).length() + "null".length());
        sb.append("DataSpec[");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(string);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(j4);
        sb.append(", null, 0]");
        return sb.toString();
    }
}