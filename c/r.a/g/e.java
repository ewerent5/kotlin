package c.r.a.g;

import android.database.sqlite.SQLiteStatement;
import c.r.a.f;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
class e extends d implements f {

    /* renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f3326f;

    e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3326f = sQLiteStatement;
    }

    @Override // c.r.a.f
    public long N0() {
        return this.f3326f.executeInsert();
    }

    @Override // c.r.a.f
    public int w() {
        return this.f3326f.executeUpdateDelete();
    }
}