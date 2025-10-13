package androidx.work.impl;

import androidx.lifecycle.q;
import androidx.work.k;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public class b implements k {

    /* renamed from: c, reason: collision with root package name */
    private final q<k.b> f2137c = new q<>();

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.j.c<k.b.c> f2138d = androidx.work.impl.utils.j.c.t();

    public b() {
        a(k.f2406b);
    }

    public void a(k.b bVar) {
        this.f2137c.j(bVar);
        if (bVar instanceof k.b.c) {
            this.f2138d.p((k.b.c) bVar);
        } else if (bVar instanceof k.b.a) {
            this.f2138d.q(((k.b.a) bVar).a());
        }
    }
}