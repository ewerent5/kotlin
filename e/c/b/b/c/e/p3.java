package e.c.b.b.c.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class p3<T> extends n3<T> {

    /* renamed from: e, reason: collision with root package name */
    private final T f14772e;

    p3(T t) {
        this.f14772e = t;
    }

    @Override // e.c.b.b.c.e.n3
    public final boolean b() {
        return true;
    }

    @Override // e.c.b.b.c.e.n3
    public final T c() {
        return this.f14772e;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof p3) {
            return this.f14772e.equals(((p3) obj).f14772e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14772e.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14772e);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}