package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class w00 implements Runnable {

    /* renamed from: e */
    private final y00 f9823e;

    /* renamed from: f */
    private final Runnable f9824f;

    w00(y00 y00Var, Runnable runnable) {
        this.f9823e = y00Var;
        this.f9824f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qr.f8450e.execute(new Runnable(this.f9823e, this.f9824f) { // from class: com.google.android.gms.internal.ads.x00

            /* renamed from: e */
            private final y00 f10094e;

            /* renamed from: f */
            private final Runnable f10095f;

            x00(y00 y00Var, Runnable runnable) {
                this.f10094e = y00Var;
                this.f10095f = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10094e.I4(this.f10095f);
            }
        });
    }
}