package e.a.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DatabaseHelper.java */
/* loaded from: classes.dex */
class h extends SQLiteOpenHelper {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14169e = h.class.getName();

    /* renamed from: f, reason: collision with root package name */
    static final Map<String, h> f14170f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private static final e f14171g = e.d();

    /* renamed from: h, reason: collision with root package name */
    File f14172h;

    /* renamed from: i, reason: collision with root package name */
    private String f14173i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14174j;

    /* renamed from: k, reason: collision with root package name */
    private i f14175k;

    protected h(Context context, String str) {
        super(context, v(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f14174j = true;
        this.f14172h = context.getDatabasePath(v(str));
        this.f14173i = m.e(str);
    }

    private synchronized long B(String str) {
        long jSimpleQueryForLong;
        SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                try {
                    sQLiteStatementCompileStatement = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM " + str);
                    jSimpleQueryForLong = sQLiteStatementCompileStatement.simpleQueryForLong();
                    sQLiteStatementCompileStatement.close();
                    close();
                } catch (StackOverflowError e2) {
                    f14171g.c(f14169e, String.format("getNumberRows for %s failed", str), e2);
                    i();
                    jSimpleQueryForLong = 0;
                    return jSimpleQueryForLong;
                }
            } catch (SQLiteException e3) {
                f14171g.c(f14169e, String.format("getNumberRows for %s failed", str), e3);
                i();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                jSimpleQueryForLong = 0;
                return jSimpleQueryForLong;
            }
        } finally {
            if (0 != 0) {
                sQLiteStatementCompileStatement.close();
            }
            close();
        }
        return jSimpleQueryForLong;
    }

    private synchronized void I0(String str, long j2) {
        try {
            try {
                getWritableDatabase().delete(str, "id = " + j2, null);
            } catch (SQLiteException e2) {
                f14171g.c(f14169e, String.format("removeEvent from %s failed", str), e2);
                i();
            } catch (StackOverflowError e3) {
                f14171g.c(f14169e, String.format("removeEvent from %s failed", str), e3);
                i();
            }
        } finally {
        }
    }

    private synchronized void S0(String str, long j2) {
        try {
            try {
                getWritableDatabase().delete(str, "id <= " + j2, null);
            } catch (SQLiteException e2) {
                f14171g.c(f14169e, String.format("removeEvents from %s failed", str), e2);
                i();
            } catch (StackOverflowError e3) {
                f14171g.c(f14169e, String.format("removeEvents from %s failed", str), e3);
                i();
            }
        } finally {
        }
    }

    private void V0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    private synchronized long Z(String str, long j2) {
        long jSimpleQueryForLong;
        jSimpleQueryForLong = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    SQLiteStatement sQLiteStatementCompileStatement = getReadableDatabase().compileStatement("SELECT id FROM " + str + " LIMIT 1 OFFSET " + (j2 - 1));
                    try {
                        jSimpleQueryForLong = sQLiteStatementCompileStatement.simpleQueryForLong();
                    } catch (SQLiteDoneException e2) {
                        f14171g.i(f14169e, e2);
                    }
                    if (sQLiteStatementCompileStatement != null) {
                        sQLiteStatementCompileStatement.close();
                    }
                } catch (SQLiteException e3) {
                    f14171g.c(f14169e, String.format("getNthEventId from %s failed", str), e3);
                    i();
                    if (0 != 0) {
                        sQLiteStatement.close();
                    }
                }
            } catch (StackOverflowError e4) {
                f14171g.c(f14169e, String.format("getNthEventId from %s failed", str), e4);
                i();
                if (0 != 0) {
                    sQLiteStatement.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
            throw th;
        }
        return jSimpleQueryForLong;
    }

    private synchronized long c(String str, String str2) {
        long jL0;
        long j2 = -1;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event", str2);
                jL0 = l0(writableDatabase, str, contentValues);
                if (jL0 == -1) {
                    try {
                        f14171g.h(f14169e, String.format("Insert into %s failed", str));
                    } catch (SQLiteException e2) {
                        e = e2;
                        j2 = jL0;
                        f14171g.c(f14169e, String.format("addEvent to %s failed", str), e);
                        i();
                        close();
                        jL0 = j2;
                        return jL0;
                    } catch (StackOverflowError e3) {
                        e = e3;
                        j2 = jL0;
                        f14171g.c(f14169e, String.format("addEvent to %s failed", str), e);
                        i();
                        close();
                        jL0 = j2;
                        return jL0;
                    }
                }
            } catch (SQLiteException e4) {
                e = e4;
            } catch (StackOverflowError e5) {
                e = e5;
            }
        } finally {
            close();
        }
        return jL0;
    }

    private static void g(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (!m.d(message) && message.startsWith("Cursor window allocation of")) {
            throw new g(message);
        }
        throw runtimeException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r0 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r0 != 0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[PHI: r0 r1 r2
  0x002a: PHI (r0v12 boolean) = (r0v17 boolean), (r0v18 boolean), (r0v19 boolean), (r0v20 boolean) binds: [B:52:0x009a, B:43:0x007f, B:22:0x0047, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r1v12 android.database.sqlite.SQLiteDatabase) = 
  (r1v1 android.database.sqlite.SQLiteDatabase)
  (r1v2 android.database.sqlite.SQLiteDatabase)
  (r1v15 android.database.sqlite.SQLiteDatabase)
  (r1v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:52:0x009a, B:43:0x007f, B:22:0x0047, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r2v6 java.lang.Object[]) = (r2v19 java.lang.Object[]), (r2v11 java.lang.Object[]), (r2v20 java.lang.Object[]), (r2v17 java.lang.Object[]) binds: [B:52:0x009a, B:43:0x007f, B:22:0x0047, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.h.i():void");
    }

    private void k0(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (m.d(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        i();
    }

    @Deprecated
    static h q(Context context) {
        return s(context, null);
    }

    static synchronized h s(Context context, String str) {
        h hVar;
        String strE = m.e(str);
        Map<String, h> map = f14170f;
        hVar = map.get(strE);
        if (hVar == null) {
            hVar = new h(context.getApplicationContext(), strE);
            map.put(strE, hVar);
        }
        return hVar;
    }

    private static String v(String str) {
        if (m.d(str) || str.equals("$default_instance")) {
            return "com.amplitude.api";
        }
        return "com.amplitude.api_" + str;
    }

    synchronized long A() {
        return B("events");
    }

    synchronized List<JSONObject> C(long j2, long j3) {
        return D("events", j2, j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x000e, B:8:0x0014, B:29:0x005f, B:31:0x0065, B:32:0x0068, B:15:0x0031, B:17:0x0037, B:22:0x0052, B:4:0x0004, B:13:0x001b, B:20:0x003c), top: B:37:0x0004, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    synchronized long C0(java.lang.String r6, java.lang.String r7, java.lang.Object r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.getWritableDatabase()     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L3b
            long r6 = r5.y0(r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L3b
            if (r2 == 0) goto L5b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L69
            if (r8 == 0) goto L5b
            r5.close()     // Catch: java.lang.Throwable -> L69
            goto L5b
        L18:
            r6 = move-exception
            goto L5d
        L1a:
            r7 = move-exception
            e.a.a.e r8 = e.a.a.h.f14171g     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = e.a.a.h.f14169e     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r6     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L18
            r8.c(r3, r6, r7)     // Catch: java.lang.Throwable -> L18
            r5.i()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L59
            boolean r6 = r2.isOpen()     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L59
        L37:
            r5.close()     // Catch: java.lang.Throwable -> L69
            goto L59
        L3b:
            r7 = move-exception
            e.a.a.e r8 = e.a.a.h.f14171g     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = e.a.a.h.f14169e     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r6     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = java.lang.String.format(r4, r1)     // Catch: java.lang.Throwable -> L18
            r8.c(r3, r6, r7)     // Catch: java.lang.Throwable -> L18
            r5.i()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L59
            boolean r6 = r2.isOpen()     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L59
            goto L37
        L59:
            r6 = -1
        L5b:
            monitor-exit(r5)
            return r6
        L5d:
            if (r2 == 0) goto L68
            boolean r7 = r2.isOpen()     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L68
            r5.close()     // Catch: java.lang.Throwable -> L69
        L68:
            throw r6     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.h.C0(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    protected synchronized List<JSONObject> D(String str, long j2, long j3) {
        LinkedList linkedList;
        String str2;
        String str3;
        linkedList = new LinkedList();
        Cursor cursorG0 = null;
        try {
            try {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        String[] strArr = {"id", "event"};
                        if (j2 >= 0) {
                            str2 = "id <= " + j2;
                        } else {
                            str2 = null;
                        }
                        if (j3 >= 0) {
                            str3 = "" + j3;
                        } else {
                            str3 = null;
                        }
                        cursorG0 = G0(readableDatabase, str, strArr, str2, null, null, null, "id ASC", str3);
                        while (cursorG0.moveToNext()) {
                            long j4 = cursorG0.getLong(0);
                            String string = cursorG0.getString(1);
                            if (!m.d(string)) {
                                JSONObject jSONObject = new JSONObject(string);
                                jSONObject.put("event_id", j4);
                                linkedList.add(jSONObject);
                            }
                        }
                        cursorG0.close();
                    } catch (RuntimeException e2) {
                        g(e2);
                        if (cursorG0 != null) {
                            cursorG0.close();
                        }
                    } catch (StackOverflowError e3) {
                        f14171g.c(f14169e, String.format("getEvents from %s failed", str), e3);
                        i();
                        if (cursorG0 != null) {
                            cursorG0.close();
                        }
                    }
                } catch (IllegalStateException e4) {
                    k0(e4);
                    if (cursorG0 != null) {
                        cursorG0.close();
                    }
                }
            } catch (SQLiteException e5) {
                f14171g.c(f14169e, String.format("getEvents from %s failed", str), e5);
                i();
                if (cursorG0 != null) {
                    cursorG0.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (0 != 0) {
                cursorG0.close();
            }
            close();
            throw th;
        }
        return linkedList;
    }

    Cursor G0(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    synchronized void H0(long j2) {
        I0("events", j2);
    }

    synchronized long K() {
        return B("identifys");
    }

    synchronized List<JSONObject> N(long j2, long j3) {
        return D("identifys", j2, j3);
    }

    synchronized void O0(long j2) {
        S0("events", j2);
    }

    synchronized Long T(String str) {
        return (Long) j0("long_store", str);
    }

    synchronized void T0(long j2) {
        I0("identifys", j2);
    }

    synchronized void U0(long j2) {
        S0("identifys", j2);
    }

    synchronized long W(long j2) {
        return Z("events", j2);
    }

    void W0(i iVar) {
        this.f14175k = iVar;
    }

    synchronized long a0(long j2) {
        return Z("identifys", j2);
    }

    synchronized long b(String str) {
        return c("events", str);
    }

    synchronized long b0() {
        return A() + K();
    }

    synchronized long d(String str) {
        return c("identifys", str);
    }

    synchronized String h0(String str) {
        return (String) j0("store", str);
    }

    synchronized long j(String str, String str2) {
        long jDelete;
        try {
            try {
                try {
                    jDelete = getWritableDatabase().delete(str, "key=?", new String[]{str2});
                } catch (SQLiteException e2) {
                    f14171g.c(f14169e, String.format("deleteKey from %s failed", str), e2);
                    i();
                    close();
                    jDelete = -1;
                    return jDelete;
                }
            } catch (StackOverflowError e3) {
                f14171g.c(f14169e, String.format("deleteKey from %s failed", str), e3);
                i();
                close();
                jDelete = -1;
                return jDelete;
            }
        } finally {
            close();
        }
        return jDelete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.database.Cursor] */
    protected synchronized Object j0(String str, String str2) {
        Cursor cursorG0;
        Object string;
        ?? r0 = 0;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        try {
            try {
                cursorG0 = G0(getReadableDatabase(), str, new String[]{Action.KEY_ATTRIBUTE, "value"}, "key = ?", new String[]{str2}, null, null, null, null);
            } catch (SQLiteException e2) {
                e = e2;
                cursorG0 = null;
            } catch (IllegalStateException e3) {
                e = e3;
                cursorG0 = null;
            } catch (RuntimeException e4) {
                e = e4;
                cursorG0 = null;
            } catch (StackOverflowError e5) {
                e = e5;
                cursorG0 = null;
            } catch (Throwable th) {
                th = th;
                if (r0 != 0) {
                    r0.close();
                }
                close();
                throw th;
            }
            try {
                if (cursorG0.moveToFirst()) {
                    string = str.equals("store") ? cursorG0.getString(1) : Long.valueOf(cursorG0.getLong(1));
                }
                cursorG0.close();
            } catch (SQLiteException e6) {
                e = e6;
                f14171g.c(f14169e, String.format("getValue from %s failed", str), e);
                i();
                if (cursorG0 != null) {
                    cursorG0.close();
                }
                close();
                return string;
            } catch (IllegalStateException e7) {
                e = e7;
                k0(e);
                if (cursorG0 != null) {
                    cursorG0.close();
                }
                close();
                return string;
            } catch (RuntimeException e8) {
                e = e8;
                g(e);
                if (cursorG0 != null) {
                    cursorG0.close();
                }
                close();
                return string;
            } catch (StackOverflowError e9) {
                e = e9;
                f14171g.c(f14169e, String.format("getValue from %s failed", str), e);
                i();
                if (cursorG0 != null) {
                    cursorG0.close();
                }
                close();
                return string;
            }
            close();
        } catch (Throwable th2) {
            th = th2;
            r0 = str2;
        }
        return string;
    }

    synchronized long l0(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        i iVar = this.f14175k;
        if (iVar == null || !this.f14174j) {
            return;
        }
        try {
            try {
                this.f14174j = false;
                iVar.a(sQLiteDatabase);
            } catch (SQLiteException e2) {
                f14171g.c(f14169e, String.format("databaseReset callback failed during onCreate", new Object[0]), e2);
            }
        } finally {
            this.f14174j = true;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) throws SQLException {
        if (i2 > i3) {
            f14171g.b(f14169e, "onUpgrade() with invalid oldVersion and newVersion");
            V0(sQLiteDatabase);
            return;
        }
        if (i3 <= 1) {
            return;
        }
        if (i2 == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
            if (i3 <= 2) {
                return;
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                f14171g.b(f14169e, "onUpgrade() with unknown oldVersion " + i2);
                V0(sQLiteDatabase);
                return;
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
    }

    synchronized long q0(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    synchronized long r0(String str, Long l2) {
        return l2 == null ? j("long_store", str) : C0("long_store", str, l2);
    }

    synchronized long v0(String str, String str2) {
        return str2 == null ? j("store", str) : C0("store", str, str2);
    }

    synchronized long y0(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) {
        long jQ0;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Action.KEY_ATTRIBUTE, str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        jQ0 = q0(sQLiteDatabase, str, contentValues);
        if (jQ0 == -1) {
            f14171g.h(f14169e, "Insert failed");
        }
        return jQ0;
    }
}