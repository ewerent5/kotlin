package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zf2 implements g62 {
    private static final byte[] a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final cg2 f10587b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10588c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f10589d;

    /* renamed from: e, reason: collision with root package name */
    private final xf2 f10590e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10591f;

    public zf2(ECPublicKey eCPublicKey, byte[] bArr, String str, int i2, xf2 xf2Var) throws GeneralSecurityException {
        dg2.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f10587b = new cg2(eCPublicKey);
        this.f10589d = bArr;
        this.f10588c = str;
        this.f10591f = i2;
        this.f10590e = xf2Var;
    }

    @Override // com.google.android.gms.internal.ads.g62
    public final byte[] a(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        bg2 bg2VarA = this.f10587b.a(this.f10588c, this.f10589d, bArr2, this.f10590e.zza(), this.f10591f);
        byte[] bArrA = this.f10590e.a(bg2VarA.b()).a(bArr, a);
        byte[] bArrA2 = bg2VarA.a();
        return ByteBuffer.allocate(bArrA2.length + bArrA.length).put(bArrA2).put(bArrA).array();
    }
}