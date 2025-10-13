package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h {
    private final Map<BasePendingResult<?>, Boolean> a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<e.c.b.b.e.i<?>, Boolean> f4600b = DesugarCollections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.a) {
            map = new HashMap(this.a);
        }
        synchronized (this.f4600b) {
            map2 = new HashMap(this.f4600b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).h(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((e.c.b.b.e.i) entry2.getKey()).d(new com.google.android.gms.common.api.b(status));
            }
        }
    }

    final boolean b() {
        return (this.a.isEmpty() && this.f4600b.isEmpty()) ? false : true;
    }

    public final void c() {
        a(false, b.f4562e);
    }

    public final void d() {
        a(true, y.a);
    }
}