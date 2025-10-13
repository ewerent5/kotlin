package e.c.b.b.c.e;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class w3<T> implements r3<T> {

    /* renamed from: e, reason: collision with root package name */
    private volatile r3<T> f14914e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f14915f;

    /* renamed from: g, reason: collision with root package name */
    @NullableDecl
    private T f14916g;

    w3(r3<T> r3Var) {
        this.f14914e = (r3) q3.b(r3Var);
    }

    public final String toString() {
        Object string = this.f14914e;
        if (string == null) {
            String strValueOf = String.valueOf(this.f14916g);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
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
        if (!this.f14915f) {
            synchronized (this) {
                if (!this.f14915f) {
                    T tZza = this.f14914e.zza();
                    this.f14916g = tZza;
                    this.f14915f = true;
                    this.f14914e = null;
                    return tZza;
                }
            }
        }
        return this.f14916g;
    }
}