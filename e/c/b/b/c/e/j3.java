package e.c.b.b.c.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class j3<T> extends n3<T> {

    /* renamed from: e, reason: collision with root package name */
    static final j3<Object> f14635e = new j3<>();

    private j3() {
    }

    @Override // e.c.b.b.c.e.n3
    public final boolean b() {
        return false;
    }

    @Override // e.c.b.b.c.e.n3
    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}