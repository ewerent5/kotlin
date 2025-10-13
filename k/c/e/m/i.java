package k.c.e.m;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

/* compiled from: MBTilesFileArchive.java */
/* loaded from: classes3.dex */
public class i implements f {
    private SQLiteDatabase a;

    @Override // k.c.e.m.f
    public void a(File file) {
        this.a = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // k.c.e.m.f
    public void b(boolean z) {
    }

    @Override // k.c.e.m.f
    public InputStream c(k.c.e.n.d dVar, long j2) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            Cursor cursorQuery = this.a.query("tiles", new String[]{"tile_data"}, "tile_column=? and tile_row=? and zoom_level=?", new String[]{Integer.toString(k.c.f.m.c(j2)), Double.toString((Math.pow(2.0d, k.c.f.m.e(j2)) - k.c.f.m.d(j2)) - 1.0d), Integer.toString(k.c.f.m.e(j2))}, null, null, null);
            if (cursorQuery.getCount() != 0) {
                cursorQuery.moveToFirst();
                byteArrayInputStream = new ByteArrayInputStream(cursorQuery.getBlob(0));
            } else {
                byteArrayInputStream = null;
            }
            cursorQuery.close();
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
        this.a.close();
    }

    public String toString() {
        return "DatabaseFileArchive [mDatabase=" + this.a.getPath() + "]";
    }
}