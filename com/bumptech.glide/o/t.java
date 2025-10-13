package com.bumptech.glide.o;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: e, reason: collision with root package name */
    private final Set<com.bumptech.glide.r.j.h<?>> f4160e = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.o.m
    public void h() {
        Iterator it = com.bumptech.glide.t.k.i(this.f4160e).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.r.j.h) it.next()).h();
        }
    }

    public void j() {
        this.f4160e.clear();
    }

    public List<com.bumptech.glide.r.j.h<?>> k() {
        return com.bumptech.glide.t.k.i(this.f4160e);
    }

    @Override // com.bumptech.glide.o.m
    public void l() {
        Iterator it = com.bumptech.glide.t.k.i(this.f4160e).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.r.j.h) it.next()).l();
        }
    }

    public void m(com.bumptech.glide.r.j.h<?> hVar) {
        this.f4160e.add(hVar);
    }

    public void n(com.bumptech.glide.r.j.h<?> hVar) {
        this.f4160e.remove(hVar);
    }

    @Override // com.bumptech.glide.o.m
    public void onDestroy() {
        Iterator it = com.bumptech.glide.t.k.i(this.f4160e).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.r.j.h) it.next()).onDestroy();
        }
    }
}