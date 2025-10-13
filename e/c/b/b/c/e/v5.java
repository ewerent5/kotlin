package e.c.b.b.c.e;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class v5 extends r5 {

    /* renamed from: b, reason: collision with root package name */
    private final u5 f14887b = new u5();

    v5() {
    }

    @Override // e.c.b.b.c.e.r5
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.f14887b.a(th, true).add(th2);
    }
}