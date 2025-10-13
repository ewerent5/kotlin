package e.c.b.b.c.e;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class e5<K, V> extends w4<Map.Entry<K, V>> {

    /* renamed from: g, reason: collision with root package name */
    private final transient s4<K, V> f14471g;

    /* renamed from: h, reason: collision with root package name */
    private final transient Object[] f14472h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f14473i = 0;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f14474j;

    e5(s4<K, V> s4Var, Object[] objArr, int i2, int i3) {
        this.f14471g = s4Var;
        this.f14472h = objArr;
        this.f14474j = i3;
    }

    @Override // e.c.b.b.c.e.n4
    final int a(Object[] objArr, int i2) {
        return k().a(objArr, i2);
    }

    @Override // e.c.b.b.c.e.n4
    /* renamed from: c */
    public final n5<Map.Entry<K, V>> iterator() {
        return (n5) k().iterator();
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14471g.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // e.c.b.b.c.e.w4, e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return true;
    }

    @Override // e.c.b.b.c.e.w4
    final r4<Map.Entry<K, V>> o() {
        return new h5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14474j;
    }
}