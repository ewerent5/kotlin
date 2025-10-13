package e.c.b.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import e.c.b.a.i.w.j.b0;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class q implements b0.d {
    private final SQLiteDatabase a;

    private q(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public static b0.d b(SQLiteDatabase sQLiteDatabase) {
        return new q(sQLiteDatabase);
    }

    @Override // e.c.b.a.i.w.j.b0.d
    public Object a() {
        return b0.C(this.a);
    }
}