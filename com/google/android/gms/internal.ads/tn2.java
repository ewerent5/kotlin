package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public class tn2 extends wn2 implements f50 {

    /* renamed from: m, reason: collision with root package name */
    g60 f9220m;
    protected final String n = "moov";

    public tn2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final void b(xn2 xn2Var, ByteBuffer byteBuffer, long j2, c20 c20Var) {
        xn2Var.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f10003h = xn2Var;
        this.f10005j = xn2Var.zzc();
        xn2Var.a(xn2Var.zzc() + j2);
        this.f10006k = xn2Var.zzc();
        this.f10002g = c20Var;
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final void c(g60 g60Var) {
        this.f9220m = g60Var;
    }

    @Override // com.google.android.gms.internal.ads.f50
    public final String zzb() {
        return this.n;
    }
}