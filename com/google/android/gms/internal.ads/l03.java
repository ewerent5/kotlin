package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class l03 {
    private int a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f7157b;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.f7157b;
    }

    public final void c(ma maVar) throws ma {
        int i2 = this.f7157b + 1;
        this.f7157b = i2;
        int i3 = this.a;
        this.a = i3 + i3;
        if (i2 > 1) {
            throw maVar;
        }
    }
}