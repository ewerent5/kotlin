package com.parizene.netmonitor.db.i;

import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.k;

/* compiled from: BackupHelper_Factory.java */
/* loaded from: classes.dex */
public final class c implements f.c.c<b> {
    private final h.a.a<com.parizene.netmonitor.db.celllog.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<AppDatabase> f13173b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<k> f13174c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<d> f13175d;

    public c(h.a.a<com.parizene.netmonitor.db.celllog.b> aVar, h.a.a<AppDatabase> aVar2, h.a.a<k> aVar3, h.a.a<d> aVar4) {
        this.a = aVar;
        this.f13173b = aVar2;
        this.f13174c = aVar3;
        this.f13175d = aVar4;
    }

    public static c a(h.a.a<com.parizene.netmonitor.db.celllog.b> aVar, h.a.a<AppDatabase> aVar2, h.a.a<k> aVar3, h.a.a<d> aVar4) {
        return new c(aVar, aVar2, aVar3, aVar4);
    }

    public static b c(com.parizene.netmonitor.db.celllog.b bVar, AppDatabase appDatabase, k kVar, d dVar) {
        return new b(bVar, appDatabase, kVar, dVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.a.get(), this.f13173b.get(), this.f13174c.get(), this.f13175d.get());
    }
}