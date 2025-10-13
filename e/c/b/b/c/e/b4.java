package e.c.b.b.c.e;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class b4<K, V> extends AbstractMap<K, V> implements Serializable, Map {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f14396e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @NullableDecl
    private transient Object f14397f;

    /* renamed from: g, reason: collision with root package name */
    @NullableDecl
    transient int[] f14398g;

    /* renamed from: h, reason: collision with root package name */
    @NullableDecl
    transient Object[] f14399h;

    /* renamed from: i, reason: collision with root package name */
    @NullableDecl
    transient Object[] f14400i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f14401j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f14402k;

    /* renamed from: l, reason: collision with root package name */
    @NullableDecl
    private transient Set<K> f14403l;

    /* renamed from: m, reason: collision with root package name */
    @NullableDecl
    private transient Set<Map.Entry<K, V>> f14404m;

    @NullableDecl
    private transient Collection<V> n;

    b4() {
        q3.f(true, "Expected size must be >= 0");
        this.f14401j = p5.a(3, 1, 1073741823);
    }

    private final int b(int i2, int i3, int i4, int i5) {
        Object objD = m4.d(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            m4.e(objD, i4 & i6, i5 + 1);
        }
        Object obj = this.f14397f;
        int[] iArr = this.f14398g;
        for (int i7 = 0; i7 <= i2; i7++) {
            int iB = m4.b(obj, i7);
            while (iB != 0) {
                int i8 = iB - 1;
                int i9 = iArr[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int iB2 = m4.b(objD, i11);
                m4.e(objD, i11, iB);
                iArr[i8] = m4.a(i10, iB2, i6);
                iB = i9 & i2;
            }
        }
        this.f14397f = objD;
        m(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(@NullableDecl Object obj) {
        if (g()) {
            return -1;
        }
        int iB = o4.b(obj);
        int iV = v();
        int iB2 = m4.b(this.f14397f, iB & iV);
        if (iB2 == 0) {
            return -1;
        }
        int i2 = ~iV;
        int i3 = iB & i2;
        do {
            int i4 = iB2 - 1;
            int i5 = this.f14398g[i4];
            if ((i5 & i2) == i3 && o3.a(obj, this.f14399h[i4])) {
                return i4;
            }
            iB2 = i5 & iV;
        } while (iB2 != 0);
        return -1;
    }

    static int h(int i2, int i3) {
        return i2 - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public final Object k(@NullableDecl Object obj) {
        if (g()) {
            return f14396e;
        }
        int iV = v();
        int iC = m4.c(obj, null, iV, this.f14397f, this.f14398g, this.f14399h, null);
        if (iC == -1) {
            return f14396e;
        }
        Object obj2 = this.f14400i[iC];
        f(iC, iV);
        this.f14402k--;
        o();
        return obj2;
    }

    private final void m(int i2) {
        this.f14401j = m4.a(this.f14401j, 32 - Integer.numberOfLeadingZeros(i2), 31);
    }

    static /* synthetic */ int q(b4 b4Var) {
        int i2 = b4Var.f14402k;
        b4Var.f14402k = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v() {
        return (1 << (this.f14401j & 31)) - 1;
    }

    final int a(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f14402k) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map, java.util.HashMap
    public final void clear() {
        if (g()) {
            return;
        }
        o();
        java.util.Map<K, V> mapL = l();
        if (mapL != null) {
            this.f14401j = p5.a(size(), 3, 1073741823);
            mapL.clear();
            this.f14397f = null;
            this.f14402k = 0;
            return;
        }
        Arrays.fill(this.f14399h, 0, this.f14402k, (Object) null);
        Arrays.fill(this.f14400i, 0, this.f14402k, (Object) null);
        Object obj = this.f14397f;
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(this.f14398g, 0, this.f14402k, 0);
        this.f14402k = 0;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        java.util.Map<K, V> mapL = l();
        return mapL != null ? mapL.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        java.util.Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f14402k; i2++) {
            if (o3.a(obj, this.f14400i[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f14404m;
        if (set != null) {
            return set;
        }
        f4 f4Var = new f4(this);
        this.f14404m = f4Var;
        return f4Var;
    }

    final void f(int i2, int i3) {
        int size = size() - 1;
        if (i2 >= size) {
            this.f14399h[i2] = null;
            this.f14400i[i2] = null;
            this.f14398g[i2] = 0;
            return;
        }
        Object[] objArr = this.f14399h;
        Object obj = objArr[size];
        objArr[i2] = obj;
        Object[] objArr2 = this.f14400i;
        objArr2[i2] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        int[] iArr = this.f14398g;
        iArr[i2] = iArr[size];
        iArr[size] = 0;
        int iB = o4.b(obj) & i3;
        int iB2 = m4.b(this.f14397f, iB);
        int i4 = size + 1;
        if (iB2 == i4) {
            m4.e(this.f14397f, iB, i2 + 1);
            return;
        }
        while (true) {
            int i5 = iB2 - 1;
            int[] iArr2 = this.f14398g;
            int i6 = iArr2[i5];
            int i7 = i6 & i3;
            if (i7 == i4) {
                iArr2[i5] = m4.a(i6, i2 + 1, i3);
                return;
            }
            iB2 = i7;
        }
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.f14397f == null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V get(@NullableDecl Object obj) {
        java.util.Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return (V) this.f14400i[iD];
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f14403l;
        if (set != null) {
            return set;
        }
        h4 h4Var = new h4(this);
        this.f14403l = h4Var;
        return h4Var;
    }

    @NullableDecl
    final java.util.Map<K, V> l() {
        Object obj = this.f14397f;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final void o() {
        this.f14401j += 32;
    }

    final int p() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    @NullableDecl
    public final V put(@NullableDecl K k2, @NullableDecl V v) {
        int iMin;
        if (g()) {
            q3.h(g(), "Arrays already allocated");
            int i2 = this.f14401j;
            int iMax = Math.max(i2 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            int iMax2 = Math.max(4, (iMax <= ((int) (((double) iHighestOneBit) * 1.0d)) || (iHighestOneBit = iHighestOneBit << 1) > 0) ? iHighestOneBit : 1073741824);
            this.f14397f = m4.d(iMax2);
            m(iMax2 - 1);
            this.f14398g = new int[i2];
            this.f14399h = new Object[i2];
            this.f14400i = new Object[i2];
        }
        java.util.Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.put(k2, v);
        }
        int[] iArr = this.f14398g;
        Object[] objArr = this.f14399h;
        Object[] objArr2 = this.f14400i;
        int i3 = this.f14402k;
        int i4 = i3 + 1;
        int iB = o4.b(k2);
        int iV = v();
        int i5 = iB & iV;
        int iB2 = m4.b(this.f14397f, i5);
        if (iB2 != 0) {
            int i6 = ~iV;
            int i7 = iB & i6;
            int i8 = 0;
            while (true) {
                int i9 = iB2 - 1;
                int i10 = iArr[i9];
                if ((i10 & i6) == i7 && o3.a(k2, objArr[i9])) {
                    V v2 = (V) objArr2[i9];
                    objArr2[i9] = v;
                    return v2;
                }
                int i11 = i10 & iV;
                Object[] objArr3 = objArr;
                int i12 = i8 + 1;
                if (i11 != 0) {
                    i8 = i12;
                    iB2 = i11;
                    objArr = objArr3;
                } else {
                    if (i12 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(v() + 1, 1.0f);
                        int iP = p();
                        while (iP >= 0) {
                            linkedHashMap.put(this.f14399h[iP], this.f14400i[iP]);
                            iP = a(iP);
                        }
                        this.f14397f = linkedHashMap;
                        this.f14398g = null;
                        this.f14399h = null;
                        this.f14400i = null;
                        o();
                        return (V) linkedHashMap.put(k2, v);
                    }
                    if (i4 > iV) {
                        iV = b(iV, m4.f(iV), iB, i3);
                    } else {
                        iArr[i9] = m4.a(i10, i4, iV);
                    }
                }
            }
        } else if (i4 > iV) {
            iV = b(iV, m4.f(iV), iB, i3);
        } else {
            m4.e(this.f14397f, i5, i4);
        }
        int length = this.f14398g.length;
        if (i4 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            this.f14398g = Arrays.copyOf(this.f14398g, iMin);
            this.f14399h = Arrays.copyOf(this.f14399h, iMin);
            this.f14400i = Arrays.copyOf(this.f14400i, iMin);
        }
        this.f14398g[i3] = m4.a(iB, 0, iV);
        this.f14399h[i3] = k2;
        this.f14400i[i3] = v;
        this.f14402k = i4;
        o();
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    final Iterator<K> r() {
        java.util.Map<K, V> mapL = l();
        return mapL != null ? mapL.keySet().iterator() : new e4(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        java.util.Map<K, V> mapL = l();
        if (mapL != null) {
            return mapL.remove(obj);
        }
        V v = (V) k(obj);
        if (v == f14396e) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    final Iterator<Map.Entry<K, V>> s() {
        java.util.Map<K, V> mapL = l();
        return mapL != null ? mapL.entrySet().iterator() : new d4(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        java.util.Map<K, V> mapL = l();
        return mapL != null ? mapL.size() : this.f14402k;
    }

    final Iterator<V> t() {
        java.util.Map<K, V> mapL = l();
        return mapL != null ? mapL.values().iterator() : new g4(this);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.n;
        if (collection != null) {
            return collection;
        }
        j4 j4Var = new j4(this);
        this.n = j4Var;
        return j4Var;
    }
}