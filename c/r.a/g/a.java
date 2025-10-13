package c.r.a.g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import c.r.a.f;
import java.util.List;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
class a implements c.r.a.b {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f3309e = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f3310f = new String[0];

    /* renamed from: g, reason: collision with root package name */
    private final SQLiteDatabase f3311g;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: c.r.a.g.a$a, reason: collision with other inner class name */
    class C0069a implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ c.r.a.e a;

        C0069a(c.r.a.e eVar) {
            this.a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.java */
    class b implements SQLiteDatabase.CursorFactory {
        final /* synthetic */ c.r.a.e a;

        b(c.r.a.e eVar) {
            this.a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    a(SQLiteDatabase sQLiteDatabase) {
        this.f3311g = sQLiteDatabase;
    }

    @Override // c.r.a.b
    public boolean E0() {
        return this.f3311g.isWriteAheadLoggingEnabled();
    }

    @Override // c.r.a.b
    public Cursor J(c.r.a.e eVar, CancellationSignal cancellationSignal) {
        return this.f3311g.rawQueryWithFactory(new b(eVar), eVar.b(), f3310f, null, cancellationSignal);
    }

    @Override // c.r.a.b
    public void S() {
        this.f3311g.setTransactionSuccessful();
    }

    @Override // c.r.a.b
    public void U() {
        this.f3311g.beginTransactionNonExclusive();
    }

    boolean b(SQLiteDatabase sQLiteDatabase) {
        return this.f3311g == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3311g.close();
    }

    @Override // c.r.a.b
    public Cursor d0(String str) {
        return s0(new c.r.a.a(str));
    }

    @Override // c.r.a.b
    public String getPath() {
        return this.f3311g.getPath();
    }

    @Override // c.r.a.b
    public void i0() {
        this.f3311g.endTransaction();
    }

    @Override // c.r.a.b
    public boolean isOpen() {
        return this.f3311g.isOpen();
    }

    @Override // c.r.a.b
    public void k() {
        this.f3311g.beginTransaction();
    }

    @Override // c.r.a.b
    public List<Pair<String, String>> n() {
        return this.f3311g.getAttachedDbs();
    }

    @Override // c.r.a.b
    public void p(String str) throws SQLException {
        this.f3311g.execSQL(str);
    }

    @Override // c.r.a.b
    public Cursor s0(c.r.a.e eVar) {
        return this.f3311g.rawQueryWithFactory(new C0069a(eVar), eVar.b(), f3310f, null);
    }

    @Override // c.r.a.b
    public f x(String str) {
        return new e(this.f3311g.compileStatement(str));
    }

    @Override // c.r.a.b
    public boolean x0() {
        return this.f3311g.inTransaction();
    }
}