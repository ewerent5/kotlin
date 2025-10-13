package com.parizene.netmonitor.ui.log;

import com.parizene.netmonitor.db.AppDatabase;

/* compiled from: LogItemsRepository_Factory.java */
/* loaded from: classes3.dex */
public final class k implements f.c.c<j> {
    private final h.a.a<AppDatabase> a;

    public k(h.a.a<AppDatabase> aVar) {
        this.a = aVar;
    }

    public static k a(h.a.a<AppDatabase> aVar) {
        return new k(aVar);
    }

    public static j c(AppDatabase appDatabase) {
        return new j(appDatabase);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.a.get());
    }
}