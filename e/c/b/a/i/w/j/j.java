package e.c.b.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import e.c.b.a.i.w.j.b0;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class j implements b0.b {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.m f14329b;

    private j(long j2, e.c.b.a.i.m mVar) {
        this.a = j2;
        this.f14329b = mVar;
    }

    public static b0.b a(long j2, e.c.b.a.i.m mVar) {
        return new j(j2, mVar);
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return b0.r0(this.a, this.f14329b, (SQLiteDatabase) obj);
    }
}