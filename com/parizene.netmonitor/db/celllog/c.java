package com.parizene.netmonitor.db.celllog;

import android.content.Context;
import android.os.Handler;
import com.parizene.netmonitor.db.AppDatabase;
import com.parizene.netmonitor.u;

/* compiled from: CellLogDatabaseAdapter_Factory.java */
/* loaded from: classes.dex */
public final class c implements f.c.c<b> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<AppDatabase> f13063b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<Handler> f13064c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<u> f13065d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<c.p.a.a> f13066e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a.a<com.google.firebase.crashlytics.c> f13067f;

    public c(h.a.a<Context> aVar, h.a.a<AppDatabase> aVar2, h.a.a<Handler> aVar3, h.a.a<u> aVar4, h.a.a<c.p.a.a> aVar5, h.a.a<com.google.firebase.crashlytics.c> aVar6) {
        this.a = aVar;
        this.f13063b = aVar2;
        this.f13064c = aVar3;
        this.f13065d = aVar4;
        this.f13066e = aVar5;
        this.f13067f = aVar6;
    }

    public static c a(h.a.a<Context> aVar, h.a.a<AppDatabase> aVar2, h.a.a<Handler> aVar3, h.a.a<u> aVar4, h.a.a<c.p.a.a> aVar5, h.a.a<com.google.firebase.crashlytics.c> aVar6) {
        return new c(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static b c(Context context, AppDatabase appDatabase, Handler handler, u uVar, c.p.a.a aVar, f.a<com.google.firebase.crashlytics.c> aVar2) {
        return new b(context, appDatabase, handler, uVar, aVar, aVar2);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.a.get(), this.f13063b.get(), this.f13064c.get(), this.f13065d.get(), this.f13066e.get(), f.c.b.a(this.f13067f));
    }
}