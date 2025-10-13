package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yf2 implements f62 {
    private final ECPrivateKey a;

    /* renamed from: b, reason: collision with root package name */
    private final ag2 f10419b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10420c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f10421d;

    /* renamed from: e, reason: collision with root package name */
    private final xf2 f10422e;

    public yf2(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i2, xf2 xf2Var) {
        this.a = eCPrivateKey;
        this.f10419b = new ag2(eCPrivateKey);
        this.f10421d = bArr;
        this.f10420c = str;
        this.f10422e = xf2Var;
    }
}