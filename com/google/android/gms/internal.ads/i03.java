package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i03 {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f6453b = new long[32];

    public i03(int i2) {
    }

    public final void a(long j2) {
        int i2 = this.a;
        long[] jArr = this.f6453b;
        if (i2 == jArr.length) {
            this.f6453b = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.f6453b;
        int i3 = this.a;
        this.a = i3 + 1;
        jArr2[i3] = j2;
    }

    public final long b(int i2) {
        if (i2 >= 0 && i2 < this.a) {
            return this.f6453b[i2];
        }
        int i3 = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i2);
        sb.append(", size is ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int c() {
        return this.a;
    }
}