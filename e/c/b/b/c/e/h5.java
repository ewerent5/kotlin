package e.c.b.b.c.e;

import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class h5<K, V> extends r4<Map.Entry<K, V>> {

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ e5 f14587g;

    h5(e5 e5Var) {
        this.f14587g = e5Var;
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        q3.a(i2, this.f14587g.f14474j);
        int i3 = i2 * 2;
        return new AbstractMap.SimpleImmutableEntry(this.f14587g.f14472h[i3], this.f14587g.f14472h[i3 + 1]);
    }

    @Override // e.c.b.b.c.e.n4
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14587g.f14474j;
    }
}