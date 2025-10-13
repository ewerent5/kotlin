package c.r.a.g;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
class d implements c.r.a.d {

    /* renamed from: e, reason: collision with root package name */
    private final SQLiteProgram f3325e;

    d(SQLiteProgram sQLiteProgram) {
        this.f3325e = sQLiteProgram;
    }

    @Override // c.r.a.d
    public void E(int i2, double d2) {
        this.f3325e.bindDouble(i2, d2);
    }

    @Override // c.r.a.d
    public void R(int i2, long j2) {
        this.f3325e.bindLong(i2, j2);
    }

    @Override // c.r.a.d
    public void X(int i2, byte[] bArr) {
        this.f3325e.bindBlob(i2, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3325e.close();
    }

    @Override // c.r.a.d
    public void r(int i2, String str) {
        this.f3325e.bindString(i2, str);
    }

    @Override // c.r.a.d
    public void t0(int i2) {
        this.f3325e.bindNull(i2);
    }
}