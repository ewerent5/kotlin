package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iu1 implements cu1 {
    private final mu1 a;

    /* renamed from: b, reason: collision with root package name */
    private final ku1 f6607b;

    /* renamed from: c, reason: collision with root package name */
    private final zt1 f6608c;

    public iu1(zt1 zt1Var, mu1 mu1Var, ku1 ku1Var, byte[] bArr) {
        this.f6608c = zt1Var;
        this.a = mu1Var;
        this.f6607b = ku1Var;
    }

    @Override // com.google.android.gms.internal.ads.cu1
    public final String a(bu1 bu1Var) {
        mu1 mu1Var = this.a;
        Map<String, String> mapJ = bu1Var.j();
        this.f6607b.a(mapJ);
        return mu1Var.a(mapJ);
    }

    @Override // com.google.android.gms.internal.ads.cu1
    public final void b(bu1 bu1Var) {
        this.f6608c.a(a(bu1Var));
    }
}