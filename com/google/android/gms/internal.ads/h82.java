package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class h82 implements b62 {
    private static final byte[] a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private final wd2 f6310b;

    /* renamed from: c, reason: collision with root package name */
    private final b62 f6311c;

    public h82(wd2 wd2Var, b62 b62Var) {
        this.f6310b = wd2Var;
        this.f6311c = b62Var;
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrI = f72.h(this.f6310b).i();
        byte[] bArrA = this.f6311c.a(bArrI, a);
        byte[] bArrA2 = ((b62) f72.j(this.f6310b.D(), bArrI, b62.class)).a(bArr, bArr2);
        int length = bArrA.length;
        return ByteBuffer.allocate(length + 4 + bArrA2.length).putInt(length).put(bArrA).put(bArrA2).array();
    }
}