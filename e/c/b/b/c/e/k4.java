package e.c.b.b.c.e;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class k4<K, V> extends x3<K, V> {

    /* renamed from: e, reason: collision with root package name */
    @NullableDecl
    private final K f14660e;

    /* renamed from: f, reason: collision with root package name */
    private int f14661f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ b4 f14662g;

    k4(b4 b4Var, int i2) {
        this.f14662g = b4Var;
        this.f14660e = (K) b4Var.f14399h[i2];
        this.f14661f = i2;
    }

    private final void a() {
        int i2 = this.f14661f;
        if (i2 == -1 || i2 >= this.f14662g.size() || !o3.a(this.f14660e, this.f14662g.f14399h[this.f14661f])) {
            this.f14661f = this.f14662g.d(this.f14660e);
        }
    }

    @Override // e.c.b.b.c.e.x3, java.util.Map.Entry, j$.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.f14660e;
    }

    @Override // e.c.b.b.c.e.x3, java.util.Map.Entry, j$.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        Map<K, V> mapL = this.f14662g.l();
        if (mapL != null) {
            return mapL.get(this.f14660e);
        }
        a();
        int i2 = this.f14661f;
        if (i2 == -1) {
            return null;
        }
        return (V) this.f14662g.f14400i[i2];
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final V setValue(V v) {
        Map<K, V> mapL = this.f14662g.l();
        if (mapL != null) {
            return mapL.put(this.f14660e, v);
        }
        a();
        int i2 = this.f14661f;
        if (i2 == -1) {
            this.f14662g.put(this.f14660e, v);
            return null;
        }
        Object[] objArr = this.f14662g.f14400i;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }
}