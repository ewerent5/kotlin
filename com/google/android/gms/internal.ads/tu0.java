package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class tu0 implements Runnable {

    /* renamed from: e */
    private final uu0 f9258e;

    /* renamed from: f */
    private final String f9259f;

    tu0(uu0 uu0Var, String str) {
        this.f9258e = uu0Var;
        this.f9259f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uu0 uu0Var = this.f9258e;
        uu0Var.f9564d.zza(this.f9259f);
    }
}