package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tj2 extends mh2<String> implements RandomAccess, uj2 {

    /* renamed from: f, reason: collision with root package name */
    private static final tj2 f9158f;

    /* renamed from: g, reason: collision with root package name */
    public static final uj2 f9159g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Object> f9160h;

    static {
        tj2 tj2Var = new tj2(10);
        f9158f = tj2Var;
        tj2Var.zzb();
        f9159g = tj2Var;
    }

    public tj2() {
        this(10);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ci2 ? ((ci2) obj).P(oj2.a) : oj2.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.uj2
    public final Object W(int i2) {
        return this.f9160h.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f9160h.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof uj2) {
            collection = ((uj2) collection).zzh();
        }
        boolean zAddAll = this.f9160h.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i2) {
        Object obj = this.f9160h.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ci2) {
            ci2 ci2Var = (ci2) obj;
            String strP = ci2Var.P(oj2.a);
            if (ci2Var.w()) {
                this.f9160h.set(i2, strP);
            }
            return strP;
        }
        byte[] bArr = (byte[]) obj;
        String strD = oj2.d(bArr);
        if (oj2.c(bArr)) {
            this.f9160h.set(i2, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final void clear() {
        a();
        this.f9160h.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.uj2
    public final void i(ci2 ci2Var) {
        a();
        this.f9160h.add(ci2Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        Object objRemove = this.f9160h.remove(i2);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        a();
        return e(this.f9160h.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f9160h.size();
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final /* bridge */ /* synthetic */ nj2 v(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f9160h);
        return new tj2((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.ads.uj2
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.f9160h);
    }

    @Override // com.google.android.gms.internal.ads.uj2
    public final uj2 zzi() {
        return zza() ? new wl2(this) : this;
    }

    public tj2(int i2) {
        this.f9160h = new ArrayList(i2);
    }

    private tj2(ArrayList<Object> arrayList) {
        this.f9160h = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}