package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.h;
import androidx.work.impl.l.j;

/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public class f implements androidx.work.impl.d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2177e = h.f("SystemAlarmScheduler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f2178f;

    public f(Context context) {
        this.f2178f = context.getApplicationContext();
    }

    private void b(j jVar) {
        h.c().a(f2177e, String.format("Scheduling work with workSpecId %s", jVar.f2302c), new Throwable[0]);
        this.f2178f.startService(b.f(this.f2178f, jVar.f2302c));
    }

    @Override // androidx.work.impl.d
    public void a(j... jVarArr) {
        for (j jVar : jVarArr) {
            b(jVar);
        }
    }

    @Override // androidx.work.impl.d
    public void d(String str) {
        this.f2178f.startService(b.g(this.f2178f, str));
    }
}