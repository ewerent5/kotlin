package com.google.android.gms.internal.ads;

import j$.util.Map;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class kl2 implements Map.Entry, Comparable<kl2>, Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    private final Comparable f7008e;

    /* renamed from: f, reason: collision with root package name */
    private Object f7009f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ nl2 f7010g;

    kl2(nl2 nl2Var, Comparable comparable, Object obj) {
        this.f7010g = nl2Var;
        this.f7008e = comparable;
        this.f7009f = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f7008e;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(kl2 kl2Var) {
        return this.f7008e.compareTo(kl2Var.f7008e);
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
        return b(this.f7008e, entry.getKey()) && b(this.f7009f, entry.getValue());
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f7008e;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getValue() {
        return this.f7009f;
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f7008e;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f7009f;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f7010g.m();
        Object obj2 = this.f7009f;
        this.f7009f = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7008e);
        String strValueOf2 = String.valueOf(this.f7009f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}