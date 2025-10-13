package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uy2 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    private final xs2[] f9588b;

    /* renamed from: c, reason: collision with root package name */
    private int f9589c;

    public uy2(xs2... xs2VarArr) {
        int length = xs2VarArr.length;
        f03.d(length > 0);
        this.f9588b = xs2VarArr;
        this.a = length;
    }

    public final xs2 a(int i2) {
        return this.f9588b[i2];
    }

    public final int b(xs2 xs2Var) {
        int i2 = 0;
        while (true) {
            xs2[] xs2VarArr = this.f9588b;
            if (i2 >= xs2VarArr.length) {
                return -1;
            }
            if (xs2Var == xs2VarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uy2.class == obj.getClass()) {
            uy2 uy2Var = (uy2) obj;
            if (this.a == uy2Var.a && Arrays.equals(this.f9588b, uy2Var.f9588b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f9589c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f9588b) + 527;
        this.f9589c = iHashCode;
        return iHashCode;
    }
}