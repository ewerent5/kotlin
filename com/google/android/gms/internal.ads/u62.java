package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u62<P> {
    private final P a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f9398b;

    /* renamed from: c, reason: collision with root package name */
    private final td2 f9399c;

    /* renamed from: d, reason: collision with root package name */
    private final ye2 f9400d;

    u62(P p, byte[] bArr, td2 td2Var, ye2 ye2Var, int i2) {
        this.a = p;
        this.f9398b = Arrays.copyOf(bArr, bArr.length);
        this.f9399c = td2Var;
        this.f9400d = ye2Var;
    }

    public final P a() {
        return this.a;
    }

    public final td2 b() {
        return this.f9399c;
    }

    public final ye2 c() {
        return this.f9400d;
    }

    public final byte[] d() {
        byte[] bArr = this.f9398b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}