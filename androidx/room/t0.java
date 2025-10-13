package androidx.room;

import android.database.Cursor;
import c.r.a.c;
import java.util.Iterator;
import java.util.List;

/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public class t0 extends c.a {

    /* renamed from: b, reason: collision with root package name */
    private b0 f1957b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1958c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1959d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1960e;

    /* compiled from: RoomOpenHelper.java */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        protected abstract void a(c.r.a.b bVar);

        protected abstract void b(c.r.a.b bVar);

        protected abstract void c(c.r.a.b bVar);

        protected abstract void d(c.r.a.b bVar);

        protected abstract void e(c.r.a.b bVar);

        protected abstract void f(c.r.a.b bVar);

        protected b g(c.r.a.b bVar) {
            h(bVar);
            return new b(true, null);
        }

        @Deprecated
        protected void h(c.r.a.b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.java */
    public static class b {
        public final boolean a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1961b;

        public b(boolean z, String str) {
            this.a = z;
            this.f1961b = str;
        }
    }

    public t0(b0 b0Var, a aVar, String str, String str2) {
        super(aVar.a);
        this.f1957b = b0Var;
        this.f1958c = aVar;
        this.f1959d = str;
        this.f1960e = str2;
    }

    private void h(c.r.a.b bVar) {
        if (!k(bVar)) {
            b bVarG = this.f1958c.g(bVar);
            if (bVarG.a) {
                this.f1958c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f1961b);
            }
        }
        Cursor cursorS0 = bVar.s0(new c.r.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorS0.moveToFirst() ? cursorS0.getString(0) : null;
            cursorS0.close();
            if (!this.f1959d.equals(string) && !this.f1960e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorS0.close();
            throw th;
        }
    }

    private void i(c.r.a.b bVar) {
        bVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(c.r.a.b bVar) {
        Cursor cursorD0 = bVar.d0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorD0.moveToFirst()) {
                if (cursorD0.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorD0.close();
        }
    }

    private static boolean k(c.r.a.b bVar) {
        Cursor cursorD0 = bVar.d0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (cursorD0.moveToFirst()) {
                if (cursorD0.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorD0.close();
        }
    }

    private void l(c.r.a.b bVar) {
        i(bVar);
        bVar.p(s0.a(this.f1959d));
    }

    @Override // c.r.a.c.a
    public void b(c.r.a.b bVar) {
        super.b(bVar);
    }

    @Override // c.r.a.c.a
    public void d(c.r.a.b bVar) {
        boolean zJ = j(bVar);
        this.f1958c.a(bVar);
        if (!zJ) {
            b bVarG = this.f1958c.g(bVar);
            if (!bVarG.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f1961b);
            }
        }
        l(bVar);
        this.f1958c.c(bVar);
    }

    @Override // c.r.a.c.a
    public void e(c.r.a.b bVar, int i2, int i3) {
        g(bVar, i2, i3);
    }

    @Override // c.r.a.c.a
    public void f(c.r.a.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f1958c.d(bVar);
        this.f1957b = null;
    }

    @Override // c.r.a.c.a
    public void g(c.r.a.b bVar, int i2, int i3) {
        boolean z;
        List<androidx.room.b1.a> listC;
        b0 b0Var = this.f1957b;
        if (b0Var == null || (listC = b0Var.f1799d.c(i2, i3)) == null) {
            z = false;
        } else {
            this.f1958c.f(bVar);
            Iterator<androidx.room.b1.a> it = listC.iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
            b bVarG = this.f1958c.g(bVar);
            if (!bVarG.a) {
                throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f1961b);
            }
            this.f1958c.e(bVar);
            l(bVar);
            z = true;
        }
        if (z) {
            return;
        }
        b0 b0Var2 = this.f1957b;
        if (b0Var2 != null && !b0Var2.a(i2, i3)) {
            this.f1958c.b(bVar);
            this.f1958c.a(bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}