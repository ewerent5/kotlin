package com.bumptech.glide.q;

import com.bumptech.glide.load.n.i;
import com.bumptech.glide.load.n.t;
import com.bumptech.glide.load.p.i.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LoadPathCache.java */
/* loaded from: classes.dex */
public class c {
    private static final t<?, ?, ?> a = new t<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: b, reason: collision with root package name */
    private final c.e.a<com.bumptech.glide.t.i, t<?, ?, ?>> f4162b = new c.e.a<>();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<com.bumptech.glide.t.i> f4163c = new AtomicReference<>();

    private com.bumptech.glide.t.i b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        com.bumptech.glide.t.i andSet = this.f4163c.getAndSet(null);
        if (andSet == null) {
            andSet = new com.bumptech.glide.t.i();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        com.bumptech.glide.t.i iVarB = b(cls, cls2, cls3);
        synchronized (this.f4162b) {
            tVar = (t) this.f4162b.get(iVarB);
        }
        this.f4163c.set(iVarB);
        return tVar;
    }

    public boolean c(t<?, ?, ?> tVar) {
        return a.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f4162b) {
            c.e.a<com.bumptech.glide.t.i, t<?, ?, ?>> aVar = this.f4162b;
            com.bumptech.glide.t.i iVar = new com.bumptech.glide.t.i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = a;
            }
            aVar.put(iVar, tVar);
        }
    }
}