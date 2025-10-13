package e.c.b.a.i.w.j;

import android.database.Cursor;
import e.c.b.a.i.w.j.b0;
import java.util.List;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
final /* synthetic */ class n implements b0.b {
    private final b0 a;

    /* renamed from: b, reason: collision with root package name */
    private final List f14331b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.m f14332c;

    private n(b0 b0Var, List list, e.c.b.a.i.m mVar) {
        this.a = b0Var;
        this.f14331b = list;
        this.f14332c = mVar;
    }

    public static b0.b a(b0 b0Var, List list, e.c.b.a.i.m mVar) {
        return new n(b0Var, list, mVar);
    }

    @Override // e.c.b.a.i.w.j.b0.b
    public Object apply(Object obj) {
        return b0.h0(this.a, this.f14331b, this.f14332c, (Cursor) obj);
    }
}