package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class j41 implements Runnable {

    /* renamed from: e */
    private final l41 f6677e;

    /* renamed from: f */
    private final ew f6678f;

    j41(l41 l41Var, ew ewVar) {
        this.f6677e = l41Var;
        this.f6678f = ewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6677e.c(this.f6678f);
    }
}