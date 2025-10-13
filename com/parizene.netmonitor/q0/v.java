package com.parizene.netmonitor.q0;

import android.content.Context;
import com.parizene.netmonitor.db.AppDatabase;

/* compiled from: AppModule_ProvideAppDatabaseFactory.java */
/* loaded from: classes3.dex */
public final class v implements f.c.c<AppDatabase> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> f13622b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.google.firebase.crashlytics.c> f13623c;

    public v(h.a.a<Context> aVar, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar2, h.a.a<com.google.firebase.crashlytics.c> aVar3) {
        this.a = aVar;
        this.f13622b = aVar2;
        this.f13623c = aVar3;
    }

    public static v a(h.a.a<Context> aVar, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar2, h.a.a<com.google.firebase.crashlytics.c> aVar3) {
        return new v(aVar, aVar2, aVar3);
    }

    public static AppDatabase c(Context context, com.parizene.netmonitor.m0.d0.d dVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        return (AppDatabase) f.c.f.c(t.b(context, dVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AppDatabase get() {
        return c(this.a.get(), this.f13622b.get(), f.c.b.a(this.f13623c));
    }
}