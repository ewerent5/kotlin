package e.c.b.d.a.b;

import java.util.Objects;

/* loaded from: classes.dex */
final class a0 extends x {
    private final z a = new z();

    a0() {
    }

    @Override // e.c.b.d.a.b.x
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.a.a(th).add(th2);
    }
}