package e.c.b.b.c.e;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class t3<T> implements r3<T>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final r3<T> f14851e;

    /* renamed from: f, reason: collision with root package name */
    private volatile transient boolean f14852f;

    /* renamed from: g, reason: collision with root package name */
    @NullableDecl
    private transient T f14853g;

    t3(r3<T> r3Var) {
        this.f14851e = (r3) q3.b(r3Var);
    }

    public final String toString() {
        Object string;
        if (this.f14852f) {
            String strValueOf = String.valueOf(this.f14853g);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f14851e;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // e.c.b.b.c.e.r3
    public final T zza() {
        if (!this.f14852f) {
            synchronized (this) {
                if (!this.f14852f) {
                    T tZza = this.f14851e.zza();
                    this.f14853g = tZza;
                    this.f14852f = true;
                    return tZza;
                }
            }
        }
        return this.f14853g;
    }
}