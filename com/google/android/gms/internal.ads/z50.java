package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class z50 implements Runnable {

    /* renamed from: e */
    private final a60 f10564e;

    /* renamed from: f */
    private final Runnable f10565f;

    z50(a60 a60Var, Runnable runnable) {
        this.f10564e = a60Var;
        this.f10565f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10564e.n(this.f10565f);
    }
}