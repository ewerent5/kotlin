package e.c.b.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import e.c.b.a.i.w.j.b0;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class y implements b0.b {
    private final String a;

    private y(String str) {
        this.a = str;
    }

    public static b0.b a(String str) {
        return new y(str);
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return b0.q0(this.a, (SQLiteDatabase) obj);
    }
}