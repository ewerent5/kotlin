package e.c.b.b.c.e;

import j$.util.Map;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class ca<K, V> implements Comparable<ca>, Map.Entry<K, V>, Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    /* JADX INFO: Incorrect field signature: TK; */
    private final Comparable f14434e;

    /* renamed from: f, reason: collision with root package name */
    private V f14435f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ t9 f14436g;

    ca(t9 t9Var, Map.Entry<K, V> entry) {
        this(t9Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ca caVar) {
        return ((Comparable) getKey()).compareTo((Comparable) caVar.getKey());
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f14434e, entry.getKey()) && a(this.f14435f, entry.getValue());
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f14434e;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final V getValue() {
        return this.f14435f;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14434e;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f14435f;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final V setValue(V v) {
        this.f14436g.p();
        V v2 = this.f14435f;
        this.f14435f = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14434e);
        String strValueOf2 = String.valueOf(this.f14435f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    ca(t9 t9Var, K k2, V v) {
        this.f14436g = t9Var;
        this.f14434e = k2;
        this.f14435f = v;
    }
}