package k.c.e.m;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

/* compiled from: DatabaseFileArchive.java */
/* loaded from: classes3.dex */
public class d implements f {
    static final String[] a = {"tile"};

    /* renamed from: b, reason: collision with root package name */
    private SQLiteDatabase f16626b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16627c = false;

    @Override // k.c.e.m.f
    public void a(File file) {
        this.f16626b = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // k.c.e.m.f
    public void b(boolean z) {
        this.f16627c = z;
    }

    @Override // k.c.e.m.f
    public InputStream c(k.c.e.n.d dVar, long j2) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] bArrD = d(dVar, j2);
            byteArrayInputStream = bArrD != null ? new ByteArrayInputStream(bArrD) : null;
        } catch (Throwable th) {
            Log.w("OsmDroid", "Error getting db stream: " + k.c.f.m.h(j2), th);
        }
        if (byteArrayInputStream != null) {
            return byteArrayInputStream;
        }
        return null;
    }

    @Override // k.c.e.m.f
    public void close() {
        this.f16626b.close();
    }

    public byte[] d(k.c.e.n.d dVar, long j2) {
        Cursor cursorQuery;
        byte[] blob;
        SQLiteDatabase sQLiteDatabase = this.f16626b;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            if (k.c.b.a.a().l()) {
                Log.d("OsmDroid", "Skipping DatabaseFileArchive lookup, database is closed");
            }
            return null;
        }
        try {
            String[] strArr = {"tile"};
            long jC = k.c.f.m.c(j2);
            long jD = k.c.f.m.d(j2);
            long jE = k.c.f.m.e(j2);
            int i2 = (int) jE;
            long j3 = (((jE << i2) + jC) << i2) + jD;
            if (this.f16627c) {
                cursorQuery = this.f16626b.query("tiles", strArr, "key = " + j3, null, null, null, null);
            } else {
                cursorQuery = this.f16626b.query("tiles", strArr, "key = " + j3 + " and provider = ?", new String[]{dVar.name()}, null, null, null);
            }
            if (cursorQuery.getCount() != 0) {
                cursorQuery.moveToFirst();
                blob = cursorQuery.getBlob(0);
            } else {
                blob = null;
            }
            cursorQuery.close();
        } catch (Throwable th) {
            Log.w("OsmDroid", "Error getting db stream: " + k.c.f.m.h(j2), th);
        }
        if (blob != null) {
            return blob;
        }
        return null;
    }

    public String toString() {
        return "DatabaseFileArchive [mDatabase=" + this.f16626b.getPath() + "]";
    }
}