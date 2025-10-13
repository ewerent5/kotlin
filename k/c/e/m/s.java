package k.c.e.m;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.graphics.drawable.Drawable;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: SqlTileWriter.java */
/* loaded from: classes3.dex */
public class s implements g {
    private static boolean a = true;

    /* renamed from: c, reason: collision with root package name */
    protected static File f16665c = null;

    /* renamed from: d, reason: collision with root package name */
    protected static SQLiteDatabase f16666d = null;

    /* renamed from: e, reason: collision with root package name */
    static boolean f16667e = false;

    /* renamed from: h, reason: collision with root package name */
    protected long f16670h = 0;

    /* renamed from: i, reason: collision with root package name */
    private final k.c.f.d f16671i;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f16664b = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f16668f = {"tile", "expires"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f16669g = {"expires"};

    /* compiled from: SqlTileWriter.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException, SQLException {
            s.this.n();
        }
    }

    public s() {
        k.c.f.d dVar = new k.c.f.d(new a());
        this.f16671i = dVar;
        e();
        if (f16667e) {
            return;
        }
        f16667e = true;
        if (a) {
            dVar.c();
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS expires_index ON tiles (expires);");
    }

    public static long f(long j2) {
        return g(k.c.f.m.c(j2), k.c.f.m.d(j2), k.c.f.m.e(j2));
    }

    public static long g(long j2, long j3, long j4) {
        int i2 = (int) j4;
        return (((j4 << i2) + j2) << i2) + j3;
    }

    public static String[] h(long j2, String str) {
        return new String[]{String.valueOf(j2), str};
    }

    public static String[] i(long j2, k.c.e.n.d dVar) {
        return h(j2, dVar.name());
    }

    public static boolean k(SQLiteException sQLiteException) {
        String simpleName = sQLiteException.getClass().getSimpleName();
        return simpleName.equals("SQLiteFullException") || simpleName.equals("SQLiteBindOrColumnIndexOutOfRangeException") || simpleName.equals("SQLiteTableLockedException") || simpleName.equals("SQLiteMisuseException") || simpleName.equals("SQLiteBlobTooBigException") || simpleName.equals("SQLiteConstraintException") || simpleName.equals("SQLiteDatatypeMismatchException");
    }

    @Override // k.c.e.m.g
    public void a() {
    }

    @Override // k.c.e.m.g
    public boolean b(k.c.e.n.d dVar, long j2, InputStream inputStream, Long l2) throws Throwable {
        SQLiteDatabase sQLiteDatabaseE = e();
        if (sQLiteDatabaseE == null || !sQLiteDatabaseE.isOpen()) {
            Log.d("OsmDroid", "Unable to store cached tile from " + dVar.name() + " " + k.c.f.m.h(j2) + ", database not available.");
            k.c.e.o.b.f16709c = k.c.e.o.b.f16709c + 1;
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ContentValues contentValues = new ContentValues();
                long jF = f(j2);
                contentValues.put("provider", dVar.name());
                byte[] bArr = new byte[AdRequest.MAX_CONTENT_URL_LENGTH];
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, i2);
                    } catch (SQLiteFullException e2) {
                        e = e2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        Log.e("OsmDroid", "SQLiteFullException while saving tile.", e);
                        this.f16671i.c();
                        c(e);
                        byteArrayOutputStream.close();
                        return false;
                    } catch (Exception e3) {
                        e = e3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        Log.e("OsmDroid", "Unable to store cached tile from " + dVar.name() + " " + k.c.f.m.h(j2) + " db is not null", e);
                        k.c.e.o.b.f16709c = k.c.e.o.b.f16709c + 1;
                        c(e);
                        byteArrayOutputStream.close();
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused) {
                        }
                        throw th;
                    }
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                contentValues.put(Action.KEY_ATTRIBUTE, Long.valueOf(jF));
                contentValues.put("tile", byteArray);
                if (l2 != null) {
                    contentValues.put("expires", l2);
                }
                sQLiteDatabaseE.replaceOrThrow("tiles", null, contentValues);
                if (k.c.b.a.a().c()) {
                    Log.d("OsmDroid", "tile inserted " + dVar.name() + k.c.f.m.h(j2));
                }
                if (System.currentTimeMillis() > this.f16670h + k.c.b.a.a().f()) {
                    this.f16670h = System.currentTimeMillis();
                    this.f16671i.c();
                }
                byteArrayOutputStream2.close();
            } catch (SQLiteFullException e4) {
                e = e4;
            } catch (Exception e5) {
                e = e5;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    protected void c(Exception exc) {
        if (!(exc instanceof SQLiteException) || k((SQLiteException) exc)) {
            return;
        }
        m();
    }

    protected SQLiteDatabase e() {
        SQLiteDatabase sQLiteDatabase = f16666d;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (f16664b) {
            k.c.b.a.a().h().mkdirs();
            File file = new File(k.c.b.a.a().h().getAbsolutePath() + File.separator + "cache.db");
            f16665c = file;
            if (f16666d == null) {
                try {
                    SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                    f16666d = sQLiteDatabaseOpenOrCreateDatabase;
                    sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, expires INTEGER, PRIMARY KEY (key, provider));");
                } catch (Exception e2) {
                    Log.e("OsmDroid", "Unable to start the sqlite tile writer. Check external storage availability.", e2);
                    c(e2);
                    return null;
                }
            }
        }
        return f16666d;
    }

    public Cursor j(String[] strArr, String[] strArr2) {
        return e().query("tiles", strArr2, "key=? and provider=?", strArr, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [k.c.e.n.d] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    public Drawable l(k.c.e.n.d dVar, long j2) throws Throwable {
        long j3;
        byte[] blob;
        Cursor cursor = null;
        try {
            try {
                Cursor cursorJ = j(i(f(j2), dVar), f16668f);
                try {
                    boolean z = true;
                    if (cursorJ.moveToFirst()) {
                        blob = cursorJ.getBlob(0);
                        j3 = cursorJ.getLong(1);
                    } else {
                        j3 = 0;
                        blob = null;
                    }
                    if (blob == null) {
                        if (k.c.b.a.a().c()) {
                            Log.d("OsmDroid", "SqlCache - Tile doesn't exist: " + dVar.name() + k.c.f.m.h(j2));
                        }
                        cursorJ.close();
                        return null;
                    }
                    cursorJ.close();
                    try {
                        ?? byteArrayInputStream = new ByteArrayInputStream(blob);
                        try {
                            Drawable drawableE = dVar.e(byteArrayInputStream);
                            if (j3 >= System.currentTimeMillis()) {
                                z = false;
                            }
                            if (z && drawableE != null) {
                                if (k.c.b.a.a().c()) {
                                    Log.d("OsmDroid", "Tile expired: " + dVar.name() + k.c.f.m.h(j2));
                                }
                                k.c.e.b.b(drawableE, -2);
                            }
                            k.c.e.o.f.a(byteArrayInputStream);
                            return drawableE;
                        } catch (Throwable th) {
                            th = th;
                            cursor = byteArrayInputStream;
                            if (cursor != null) {
                                k.c.e.o.f.a(cursor);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursor = cursorJ;
                    c(e);
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorJ;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void m() {
        synchronized (f16664b) {
            SQLiteDatabase sQLiteDatabase = f16666d;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                f16666d = null;
            }
        }
    }

    public void n() throws InterruptedException, SQLException {
        SQLiteDatabase sQLiteDatabaseE = e();
        if (sQLiteDatabaseE == null || !sQLiteDatabaseE.isOpen()) {
            if (k.c.b.a.a().c()) {
                Log.d("OsmDroid", "Finished init thread, aborted due to null database reference");
            }
        } else {
            d(sQLiteDatabaseE);
            long length = f16665c.length();
            if (length <= k.c.b.a.a().j()) {
                return;
            }
            o(length - k.c.b.a.a().H(), k.c.b.a.a().k(), k.c.b.a.a().i(), true);
        }
    }

    public void o(long j2, int i2, long j3, boolean z) throws InterruptedException {
        boolean z2;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase sQLiteDatabaseE = e();
        long j4 = j2;
        boolean z3 = true;
        while (j4 > 0) {
            if (z3) {
                z2 = false;
            } else {
                if (j3 > 0) {
                    try {
                        Thread.sleep(j3);
                    } catch (InterruptedException unused) {
                    }
                }
                z2 = z3;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT key,LENGTH(HEX(tile))/2 FROM tiles WHERE expires IS NOT NULL ");
                String str3 = "";
                if (z) {
                    str = "";
                } else {
                    str = "AND expires < " + jCurrentTimeMillis + " ";
                }
                sb2.append(str);
                sb2.append("ORDER BY ");
                sb2.append("expires");
                sb2.append(" ASC LIMIT ");
                sb2.append(i2);
                Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery(sb2.toString(), null);
                cursorRawQuery.moveToFirst();
                sb.setLength(0);
                sb.append("key in (");
                String str4 = "";
                while (true) {
                    str2 = str3;
                    if (cursorRawQuery.isAfterLast()) {
                        break;
                    }
                    long j5 = cursorRawQuery.getLong(0);
                    long j6 = cursorRawQuery.getLong(1);
                    cursorRawQuery.moveToNext();
                    sb.append(str4);
                    sb.append(j5);
                    str4 = ",";
                    j4 -= j6;
                    if (j4 <= 0) {
                        break;
                    } else {
                        str3 = str2;
                    }
                }
                cursorRawQuery.close();
                if (str2.equals(str4)) {
                    return;
                }
                sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                try {
                    sQLiteDatabaseE.delete("tiles", sb.toString(), null);
                } catch (SQLiteFullException e2) {
                    Log.e("OsmDroid", "SQLiteFullException while cleanup.", e2);
                    c(e2);
                } catch (Exception e3) {
                    c(e3);
                    return;
                }
                z3 = z2;
            } catch (Exception e4) {
                c(e4);
                return;
            }
        }
    }
}