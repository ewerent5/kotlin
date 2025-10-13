package e.c.b.b.c.e;

import android.content.Context;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class e2 extends e3 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final r3<n3<s2>> f14469b;

    e2(Context context, @Nullable r3<n3<s2>> r3Var) {
        Objects.requireNonNull(context, "Null context");
        this.a = context;
        this.f14469b = r3Var;
    }

    @Override // e.c.b.b.c.e.e3
    final Context a() {
        return this.a;
    }

    @Override // e.c.b.b.c.e.e3
    @Nullable
    final r3<n3<s2>> b() {
        return this.f14469b;
    }

    public final boolean equals(Object obj) {
        r3<n3<s2>> r3Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e3) {
            e3 e3Var = (e3) obj;
            if (this.a.equals(e3Var.a()) && ((r3Var = this.f14469b) != null ? r3Var.equals(e3Var.b()) : e3Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        r3<n3<s2>> r3Var = this.f14469b;
        return iHashCode ^ (r3Var == null ? 0 : r3Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.f14469b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 46 + strValueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}