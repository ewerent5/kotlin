package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public final class i8 extends a6<String> implements h8, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final i8 f14621f;

    /* renamed from: g, reason: collision with root package name */
    private static final h8 f14622g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Object> f14623h;

    static {
        i8 i8Var = new i8();
        f14621f = i8Var;
        i8Var.C0();
        f14622g = i8Var;
    }

    public i8() {
        this(10);
    }

    private static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof g6 ? ((g6) obj).t() : r7.i((byte[]) obj);
    }

    @Override // e.c.b.b.c.e.h8
    public final h8 A() {
        return zza() ? new la(this) : this;
    }

    @Override // e.c.b.b.c.e.h8
    public final void D(g6 g6Var) {
        a();
        this.f14623h.add(g6Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f14623h.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // e.c.b.b.c.e.x7
    public final /* synthetic */ x7 b(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f14623h);
        return new i8((ArrayList<Object>) arrayList);
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final void clear() {
        a();
        this.f14623h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f14623h.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g6) {
            g6 g6Var = (g6) obj;
            String strT = g6Var.t();
            if (g6Var.w()) {
                this.f14623h.set(i2, strT);
            }
            return strT;
        }
        byte[] bArr = (byte[]) obj;
        String strI = r7.i(bArr);
        if (r7.h(bArr)) {
            this.f14623h.set(i2, strI);
        }
        return strI;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        a();
        return c(this.f14623h.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14623h.size();
    }

    @Override // e.c.b.b.c.e.a6, e.c.b.b.c.e.x7
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    @Override // e.c.b.b.c.e.h8
    public final Object zzb(int i2) {
        return this.f14623h.get(i2);
    }

    public i8(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof h8) {
            collection = ((h8) collection).zzb();
        }
        boolean zAddAll = this.f14623h.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        Object objRemove = this.f14623h.remove(i2);
        ((AbstractList) this).modCount++;
        return c(objRemove);
    }

    @Override // e.c.b.b.c.e.h8
    public final List<?> zzb() {
        return Collections.unmodifiableList(this.f14623h);
    }

    private i8(ArrayList<Object> arrayList) {
        this.f14623h = arrayList;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}