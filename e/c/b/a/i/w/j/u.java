package e.c.b.a.i.w.j;

import android.database.Cursor;
import e.c.b.a.i.w.j.b0;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class u implements b0.b {
    private static final u a = new u();

    private u() {
    }

    public static b0.b a() {
        return a;
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}