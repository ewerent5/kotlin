package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class il0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final cm0 f6539e;

    private il0(cm0 cm0Var) {
        this.f6539e = cm0Var;
    }

    static Runnable a(cm0 cm0Var) {
        return new il0(cm0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6539e.zzu();
    }
}