package e.c.b.b.c.e;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class v3<T> implements r3<T>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    @NullableDecl
    private final T f14884e;

    v3(@NullableDecl T t) {
        this.f14884e = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof v3) {
            return o3.a(this.f14884e, ((v3) obj).f14884e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14884e});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14884e);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // e.c.b.b.c.e.r3
    public final T zza() {
        return this.f14884e;
    }
}