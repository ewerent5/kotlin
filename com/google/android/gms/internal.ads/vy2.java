package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vy2 {
    public static final vy2 a = new vy2(new uy2[0]);

    /* renamed from: b, reason: collision with root package name */
    public final int f9815b;

    /* renamed from: c, reason: collision with root package name */
    private final uy2[] f9816c;

    /* renamed from: d, reason: collision with root package name */
    private int f9817d;

    public vy2(uy2... uy2VarArr) {
        this.f9816c = uy2VarArr;
        this.f9815b = uy2VarArr.length;
    }

    public final uy2 a(int i2) {
        return this.f9816c[i2];
    }

    public final int b(uy2 uy2Var) {
        for (int i2 = 0; i2 < this.f9815b; i2++) {
            if (this.f9816c[i2] == uy2Var) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vy2.class == obj.getClass()) {
            vy2 vy2Var = (vy2) obj;
            if (this.f9815b == vy2Var.f9815b && Arrays.equals(this.f9816c, vy2Var.f9816c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f9817d;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f9816c);
        this.f9817d = iHashCode;
        return iHashCode;
    }
}