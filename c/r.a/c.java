package c.r.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } else {
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e2) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e2);
                    }
                }
            } catch (Exception e3) {
                Log.w("SupportSQLite", "delete failed: ", e3);
            }
        }

        public void b(c.r.a.b bVar) {
        }

        public void c(c.r.a.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.getPath());
            if (!bVar.isOpen()) {
                a(bVar.getPath());
                return;
            }
            List<Pair<String, String>> listN = null;
            try {
                try {
                    listN = bVar.n();
                } finally {
                    if (listN != null) {
                        Iterator<Pair<String, String>> it = listN.iterator();
                        while (it.hasNext()) {
                            a((String) it.next().second);
                        }
                    } else {
                        a(bVar.getPath());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                bVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(c.r.a.b bVar);

        public void e(c.r.a.b bVar, int i2, int i3) {
            throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3);
        }

        public void f(c.r.a.b bVar) {
        }

        public abstract void g(c.r.a.b bVar, int i2, int i3);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    public static class b {
        public final Context a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3303b;

        /* renamed from: c, reason: collision with root package name */
        public final a f3304c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3305d;

        /* compiled from: SupportSQLiteOpenHelper.java */
        public static class a {
            Context a;

            /* renamed from: b, reason: collision with root package name */
            String f3306b;

            /* renamed from: c, reason: collision with root package name */
            a f3307c;

            /* renamed from: d, reason: collision with root package name */
            boolean f3308d;

            a(Context context) {
                this.a = context;
            }

            public b a() {
                if (this.f3307c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f3308d && TextUtils.isEmpty(this.f3306b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.a, this.f3306b, this.f3307c, this.f3308d);
            }

            public a b(a aVar) {
                this.f3307c = aVar;
                return this;
            }

            public a c(String str) {
                this.f3306b = str;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.f3303b = str;
            this.f3304c = aVar;
            this.f3305d = z;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: c.r.a.c$c, reason: collision with other inner class name */
    public interface InterfaceC0068c {
        c a(b bVar);
    }

    c.r.a.b V();

    c.r.a.b c0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}