package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class ml0 implements Runnable {

    /* renamed from: e */
    private final ol0 f7504e;

    /* renamed from: f */
    private final boolean f7505f;

    ml0(ol0 ol0Var, boolean z) {
        this.f7504e = ol0Var;
        this.f7505f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7504e.n(this.f7505f);
    }
}