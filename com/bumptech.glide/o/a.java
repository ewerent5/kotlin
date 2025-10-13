package com.bumptech.glide.o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes.dex */
class a implements l {
    private final Set<m> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private boolean f4136b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4137c;

    a() {
    }

    @Override // com.bumptech.glide.o.l
    public void a(m mVar) {
        this.a.add(mVar);
        if (this.f4137c) {
            mVar.onDestroy();
        } else if (this.f4136b) {
            mVar.h();
        } else {
            mVar.l();
        }
    }

    @Override // com.bumptech.glide.o.l
    public void b(m mVar) {
        this.a.remove(mVar);
    }

    void c() {
        this.f4137c = true;
        Iterator it = com.bumptech.glide.t.k.i(this.a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
    }

    void d() {
        this.f4136b = true;
        Iterator it = com.bumptech.glide.t.k.i(this.a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).h();
        }
    }

    void e() {
        this.f4136b = false;
        Iterator it = com.bumptech.glide.t.k.i(this.a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).l();
        }
    }
}