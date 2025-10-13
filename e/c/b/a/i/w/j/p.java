package e.c.b.a.i.w.j;

import android.database.Cursor;
import e.c.b.a.i.w.j.b0;
import java.util.Map;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class p implements b0.b {
    private final Map a;

    private p(Map map) {
        this.a = map;
    }

    public static b0.b a(Map map) {
        return new p(map);
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return b0.j0(this.a, (Cursor) obj);
    }
}