package e.c.b.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import e.c.b.a.i.w.j.b0;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class w implements b0.b {
    private final b0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.m f14333b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.h f14334c;

    private w(b0 b0Var, e.c.b.a.i.m mVar, e.c.b.a.i.h hVar) {
        this.a = b0Var;
        this.f14333b = mVar;
        this.f14334c = hVar;
    }

    public static b0.b a(b0 b0Var, e.c.b.a.i.m mVar, e.c.b.a.i.h hVar) {
        return new w(b0Var, mVar, hVar);
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return b0.k0(this.a, this.f14333b, this.f14334c, (SQLiteDatabase) obj);
    }
}