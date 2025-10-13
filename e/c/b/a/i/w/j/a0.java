package e.c.b.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import e.c.b.a.i.w.j.b0;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class a0 implements b0.b {
    private final b0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.m f14307b;

    private a0(b0 b0Var, e.c.b.a.i.m mVar) {
        this.a = b0Var;
        this.f14307b = mVar;
    }

    public static b0.b a(b0 b0Var, e.c.b.a.i.m mVar) {
        return new a0(b0Var, mVar);
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return b0.W(this.a, this.f14307b, (SQLiteDatabase) obj);
    }
}