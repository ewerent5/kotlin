package com.bumptech.glide.t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class g<T, Y> {
    private final Map<T, a<Y>> a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f4245b;

    /* renamed from: c, reason: collision with root package name */
    private long f4246c;

    /* renamed from: d, reason: collision with root package name */
    private long f4247d;

    /* compiled from: LruCache.java */
    static final class a<Y> {
        final Y a;

        /* renamed from: b, reason: collision with root package name */
        final int f4248b;

        a(Y y, int i2) {
            this.a = y;
            this.f4248b = i2;
        }
    }

    public g(long j2) {
        this.f4245b = j2;
        this.f4246c = j2;
    }

    private void f() {
        m(this.f4246c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t) {
        a<Y> aVar;
        aVar = this.a.get(t);
        return aVar != null ? aVar.a : null;
    }

    public synchronized long h() {
        return this.f4246c;
    }

    protected int i(Y y) {
        return 1;
    }

    protected void j(T t, Y y) {
    }

    public synchronized Y k(T t, Y y) {
        int i2 = i(y);
        long j2 = i2;
        if (j2 >= this.f4246c) {
            j(t, y);
            return null;
        }
        if (y != null) {
            this.f4247d += j2;
        }
        a<Y> aVarPut = this.a.put(t, y == null ? null : new a<>(y, i2));
        if (aVarPut != null) {
            this.f4247d -= aVarPut.f4248b;
            if (!aVarPut.a.equals(y)) {
                j(t, aVarPut.a);
            }
        }
        f();
        return aVarPut != null ? aVarPut.a : null;
    }

    public synchronized Y l(T t) {
        a<Y> aVarRemove = this.a.remove(t);
        if (aVarRemove == null) {
            return null;
        }
        this.f4247d -= aVarRemove.f4248b;
        return aVarRemove.a;
    }

    protected synchronized void m(long j2) {
        while (this.f4247d > j2) {
            Iterator<Map.Entry<T, a<Y>>> it = this.a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f4247d -= value.f4248b;
            T key = next.getKey();
            it.remove();
            j(key, value.a);
        }
    }
}