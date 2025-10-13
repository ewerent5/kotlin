package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class tx0 extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final int f9288e;

    public tx0(int i2) {
        this.f9288e = i2;
    }

    public final int a() {
        return this.f9288e;
    }

    public tx0(int i2, String str) {
        super(str);
        this.f9288e = i2;
    }

    public tx0(int i2, String str, Throwable th) {
        super(str, th);
        this.f9288e = 1;
    }
}