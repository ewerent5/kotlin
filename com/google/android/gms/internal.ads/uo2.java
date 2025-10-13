package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uo2<T> implements mo2<Set<T>> {
    private static final mo2<Set<Object>> a = no2.a(Collections.emptySet());

    /* renamed from: b, reason: collision with root package name */
    private final List<wo2<T>> f9525b;

    /* renamed from: c, reason: collision with root package name */
    private final List<wo2<Collection<T>>> f9526c;

    /* synthetic */ uo2(List list, List list2, so2 so2Var) {
        this.f9525b = list;
        this.f9526c = list2;
    }

    public static <T> to2<T> a(int i2, int i3) {
        return new to2<>(i2, i3, null);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set<T> zzb() {
        int size = this.f9525b.size();
        ArrayList arrayList = new ArrayList(this.f9526c.size());
        int size2 = this.f9526c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Collection<T> collectionZzb = this.f9526c.get(i2).zzb();
            size += collectionZzb.size();
            arrayList.add(collectionZzb);
        }
        HashSet hashSetB = jo2.b(size);
        int size3 = this.f9525b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            T tZzb = this.f9525b.get(i3).zzb();
            Objects.requireNonNull(tZzb);
            hashSetB.add(tZzb);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object obj : (Collection) arrayList.get(i4)) {
                Objects.requireNonNull(obj);
                hashSetB.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetB);
    }
}