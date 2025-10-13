package e.c.b.b.e;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class h0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ d0 f15017e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Callable f15018f;

    h0(d0 d0Var, Callable callable) {
        this.f15017e = d0Var;
        this.f15018f = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f15017e.r(this.f15018f.call());
        } catch (Exception e2) {
            this.f15017e.q(e2);
        }
    }
}