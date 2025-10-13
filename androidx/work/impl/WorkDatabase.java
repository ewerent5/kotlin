package androidx.work.impl;

import android.content.Context;
import androidx.room.p0;
import androidx.room.q0;
import androidx.work.impl.g;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends q0 {
    private static final long n = TimeUnit.DAYS.toMillis(7);

    static class a extends q0.b {
        a() {
        }

        @Override // androidx.room.q0.b
        public void c(c.r.a.b bVar) {
            super.c(bVar);
            bVar.k();
            try {
                bVar.p(WorkDatabase.J());
                bVar.S();
            } finally {
                bVar.i0();
            }
        }
    }

    public static WorkDatabase F(Context context, Executor executor, boolean z) {
        return (WorkDatabase) (z ? p0.c(context, WorkDatabase.class).c() : p0.a(context, WorkDatabase.class, "androidx.work.workdb").f(executor)).a(H()).b(g.a).b(new g.d(context, 2, 3)).b(g.f2218b).b(g.f2219c).b(new g.d(context, 5, 6)).e().d();
    }

    static q0.b H() {
        return new a();
    }

    static long I() {
        return System.currentTimeMillis() - n;
    }

    static String J() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + I() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract androidx.work.impl.l.b G();

    public abstract androidx.work.impl.l.e K();

    public abstract androidx.work.impl.l.h L();

    public abstract k M();

    public abstract n N();
}