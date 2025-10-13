package com.bumptech.glide.o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public class r {
    private final Set<com.bumptech.glide.r.c> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.r.c> f4158b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f4159c;

    public boolean a(com.bumptech.glide.r.c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.a.remove(cVar);
        if (!this.f4158b.remove(cVar) && !zRemove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    public void b() {
        Iterator it = com.bumptech.glide.t.k.i(this.a).iterator();
        while (it.hasNext()) {
            a((com.bumptech.glide.r.c) it.next());
        }
        this.f4158b.clear();
    }

    public void c() {
        this.f4159c = true;
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.a)) {
            if (cVar.isRunning() || cVar.k()) {
                cVar.clear();
                this.f4158b.add(cVar);
            }
        }
    }

    public void d() {
        this.f4159c = true;
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.a)) {
            if (cVar.isRunning()) {
                cVar.e();
                this.f4158b.add(cVar);
            }
        }
    }

    public void e() {
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.a)) {
            if (!cVar.k() && !cVar.g()) {
                cVar.clear();
                if (this.f4159c) {
                    this.f4158b.add(cVar);
                } else {
                    cVar.i();
                }
            }
        }
    }

    public void f() {
        this.f4159c = false;
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.a)) {
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        this.f4158b.clear();
    }

    public void g(com.bumptech.glide.r.c cVar) {
        this.a.add(cVar);
        if (!this.f4159c) {
            cVar.i();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f4158b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.f4159c + "}";
    }
}