package e.c.b.a.i.w.j;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import e.c.b.a.i.w.j.h0;

/* compiled from: SchemaManager.java */
/* loaded from: classes.dex */
final /* synthetic */ class f0 implements h0.a {
    private static final f0 a = new f0();

    private f0() {
    }

    public static h0.a b() {
        return a;
    }

    @Override // e.c.b.a.i.w.j.h0.a
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}