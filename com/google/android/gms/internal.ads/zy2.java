package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class zy2 {
    protected final uy2 a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f10663b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f10664c;

    /* renamed from: d, reason: collision with root package name */
    private final xs2[] f10665d;

    /* renamed from: e, reason: collision with root package name */
    private int f10666e;

    public zy2(uy2 uy2Var, int... iArr) {
        int length = iArr.length;
        f03.d(length > 0);
        Objects.requireNonNull(uy2Var);
        this.a = uy2Var;
        this.f10663b = length;
        this.f10665d = new xs2[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f10665d[i2] = uy2Var.a(iArr[i2]);
        }
        Arrays.sort(this.f10665d, new yy2(null));
        this.f10664c = new int[this.f10663b];
        for (int i3 = 0; i3 < this.f10663b; i3++) {
            this.f10664c[i3] = uy2Var.b(this.f10665d[i3]);
        }
    }

    public final uy2 a() {
        return this.a;
    }

    public final int b() {
        return this.f10664c.length;
    }

    public final xs2 c(int i2) {
        return this.f10665d[i2];
    }

    public final int d(int i2) {
        return this.f10664c[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zy2 zy2Var = (zy2) obj;
            if (this.a == zy2Var.a && Arrays.equals(this.f10664c, zy2Var.f10664c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f10666e;
        if (i2 != 0) {
            return i2;
        }
        int iIdentityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.f10664c);
        this.f10666e = iIdentityHashCode;
        return iIdentityHashCode;
    }
}