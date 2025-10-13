package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sz2 {

    /* renamed from: b, reason: collision with root package name */
    private int f9042b;

    /* renamed from: c, reason: collision with root package name */
    private int f9043c;

    /* renamed from: d, reason: collision with root package name */
    private int f9044d = 0;

    /* renamed from: e, reason: collision with root package name */
    private mz2[] f9045e = new mz2[100];
    private final mz2[] a = new mz2[1];

    public sz2(boolean z, int i2) {
    }

    public final synchronized void a() {
        b(0);
    }

    public final synchronized void b(int i2) {
        int i3 = this.f9042b;
        this.f9042b = i2;
        if (i2 < i3) {
            f();
        }
    }

    public final synchronized mz2 c() {
        mz2 mz2Var;
        this.f9043c++;
        int i2 = this.f9044d;
        if (i2 > 0) {
            mz2[] mz2VarArr = this.f9045e;
            int i3 = i2 - 1;
            this.f9044d = i3;
            mz2Var = mz2VarArr[i3];
            mz2VarArr[i3] = null;
        } else {
            mz2Var = new mz2(new byte[65536], 0);
        }
        return mz2Var;
    }

    public final synchronized void d(mz2 mz2Var) {
        mz2[] mz2VarArr = this.a;
        mz2VarArr[0] = mz2Var;
        e(mz2VarArr);
    }

    public final synchronized void e(mz2[] mz2VarArr) {
        int length = this.f9044d + mz2VarArr.length;
        mz2[] mz2VarArr2 = this.f9045e;
        int length2 = mz2VarArr2.length;
        if (length >= length2) {
            this.f9045e = (mz2[]) Arrays.copyOf(mz2VarArr2, Math.max(length2 + length2, length));
        }
        for (mz2 mz2Var : mz2VarArr) {
            f03.a(mz2Var.a.length == 65536);
            mz2[] mz2VarArr3 = this.f9045e;
            int i2 = this.f9044d;
            this.f9044d = i2 + 1;
            mz2VarArr3[i2] = mz2Var;
        }
        this.f9043c -= mz2VarArr.length;
        notifyAll();
    }

    public final synchronized void f() {
        int iMax = Math.max(0, v03.e(this.f9042b, 65536) - this.f9043c);
        int i2 = this.f9044d;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.f9045e, iMax, i2, (Object) null);
        this.f9044d = iMax;
    }

    public final synchronized int g() {
        return this.f9043c * 65536;
    }
}