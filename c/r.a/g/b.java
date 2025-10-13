package c.r.a.g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import c.r.a.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
class b implements c.r.a.c {

    /* renamed from: e, reason: collision with root package name */
    private final Context f3314e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3315f;

    /* renamed from: g, reason: collision with root package name */
    private final c.a f3316g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3317h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f3318i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private a f3319j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3320k;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    static class a extends SQLiteOpenHelper {

        /* renamed from: e, reason: collision with root package name */
        final c.r.a.g.a[] f3321e;

        /* renamed from: f, reason: collision with root package name */
        final c.a f3322f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f3323g;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: c.r.a.g.b$a$a, reason: collision with other inner class name */
        class C0070a implements DatabaseErrorHandler {
            final /* synthetic */ c.a a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.r.a.g.a[] f3324b;

            C0070a(c.a aVar, c.r.a.g.a[] aVarArr) {
                this.a = aVar;
                this.f3324b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.d(this.f3324b, sQLiteDatabase));
            }
        }

        a(Context context, String str, c.r.a.g.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.a, new C0070a(aVar, aVarArr));
            this.f3322f = aVar;
            this.f3321e = aVarArr;
        }

        static c.r.a.g.a d(c.r.a.g.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            c.r.a.g.a aVar = aVarArr[0];
            if (aVar == null || !aVar.b(sQLiteDatabase)) {
                aVarArr[0] = new c.r.a.g.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        synchronized c.r.a.b b() {
            this.f3323g = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (!this.f3323g) {
                return c(readableDatabase);
            }
            close();
            return b();
        }

        c.r.a.g.a c(SQLiteDatabase sQLiteDatabase) {
            return d(this.f3321e, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f3321e[0] = null;
        }

        synchronized c.r.a.b g() {
            this.f3323g = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f3323g) {
                return c(writableDatabase);
            }
            close();
            return g();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f3322f.b(c(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f3322f.d(c(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3323g = true;
            this.f3322f.e(c(sQLiteDatabase), i2, i3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f3323g) {
                return;
            }
            this.f3322f.f(c(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3323g = true;
            this.f3322f.g(c(sQLiteDatabase), i2, i3);
        }
    }

    b(Context context, String str, c.a aVar, boolean z) {
        this.f3314e = context;
        this.f3315f = str;
        this.f3316g = aVar;
        this.f3317h = z;
    }

    private a b() {
        a aVar;
        synchronized (this.f3318i) {
            if (this.f3319j == null) {
                c.r.a.g.a[] aVarArr = new c.r.a.g.a[1];
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 23 || this.f3315f == null || !this.f3317h) {
                    this.f3319j = new a(this.f3314e, this.f3315f, aVarArr, this.f3316g);
                } else {
                    this.f3319j = new a(this.f3314e, new File(this.f3314e.getNoBackupFilesDir(), this.f3315f).getAbsolutePath(), aVarArr, this.f3316g);
                }
                if (i2 >= 16) {
                    this.f3319j.setWriteAheadLoggingEnabled(this.f3320k);
                }
            }
            aVar = this.f3319j;
        }
        return aVar;
    }

    @Override // c.r.a.c
    public c.r.a.b V() {
        return b().b();
    }

    @Override // c.r.a.c
    public c.r.a.b c0() {
        return b().g();
    }

    @Override // c.r.a.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b().close();
    }

    @Override // c.r.a.c
    public String getDatabaseName() {
        return this.f3315f;
    }

    @Override // c.r.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f3318i) {
            a aVar = this.f3319j;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f3320k = z;
        }
    }
}