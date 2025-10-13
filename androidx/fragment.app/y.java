package androidx.fragment.app;

import androidx.lifecycle.g;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
class y implements androidx.lifecycle.k {

    /* renamed from: e, reason: collision with root package name */
    private androidx.lifecycle.l f1168e = null;

    y() {
    }

    void a(g.b bVar) {
        this.f1168e.h(bVar);
    }

    void b() {
        if (this.f1168e == null) {
            this.f1168e = new androidx.lifecycle.l(this);
        }
    }

    boolean c() {
        return this.f1168e != null;
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g i() {
        b();
        return this.f1168e;
    }
}