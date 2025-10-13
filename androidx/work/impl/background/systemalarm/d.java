package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.i;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public class d implements androidx.work.impl.k.c, androidx.work.impl.a, g.b {

    /* renamed from: e */
    private static final String f2154e = h.f("DelayMetCommandHandler");

    /* renamed from: f */
    private final Context f2155f;

    /* renamed from: g */
    private final int f2156g;

    /* renamed from: h */
    private final String f2157h;

    /* renamed from: i */
    private final e f2158i;

    /* renamed from: j */
    private final androidx.work.impl.k.d f2159j;

    /* renamed from: m */
    private PowerManager.WakeLock f2162m;
    private boolean n = false;

    /* renamed from: l */
    private int f2161l = 0;

    /* renamed from: k */
    private final Object f2160k = new Object();

    d(Context context, int i2, String str, e eVar) {
        this.f2155f = context;
        this.f2156g = i2;
        this.f2158i = eVar;
        this.f2157h = str;
        this.f2159j = new androidx.work.impl.k.d(context, eVar.f(), this);
    }

    private void d() {
        synchronized (this.f2160k) {
            this.f2159j.e();
            this.f2158i.h().c(this.f2157h);
            PowerManager.WakeLock wakeLock = this.f2162m;
            if (wakeLock != null && wakeLock.isHeld()) {
                h.c().a(f2154e, String.format("Releasing wakelock %s for WorkSpec %s", this.f2162m, this.f2157h), new Throwable[0]);
                this.f2162m.release();
            }
        }
    }

    private void g() {
        synchronized (this.f2160k) {
            if (this.f2161l < 2) {
                this.f2161l = 2;
                h hVarC = h.c();
                String str = f2154e;
                hVarC.a(str, String.format("Stopping work for WorkSpec %s", this.f2157h), new Throwable[0]);
                Intent intentG = b.g(this.f2155f, this.f2157h);
                e eVar = this.f2158i;
                eVar.k(new e.b(eVar, intentG, this.f2156g));
                if (this.f2158i.e().d(this.f2157h)) {
                    h.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f2157h), new Throwable[0]);
                    Intent intentF = b.f(this.f2155f, this.f2157h);
                    e eVar2 = this.f2158i;
                    eVar2.k(new e.b(eVar2, intentF, this.f2156g));
                } else {
                    h.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f2157h), new Throwable[0]);
                }
            } else {
                h.c().a(f2154e, String.format("Already stopped work for %s", this.f2157h), new Throwable[0]);
            }
        }
    }

    @Override // androidx.work.impl.background.systemalarm.g.b
    public void a(String str) {
        h.c().a(f2154e, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // androidx.work.impl.k.c
    public void b(List<String> list) {
        g();
    }

    @Override // androidx.work.impl.a
    public void c(String str, boolean z) {
        h.c().a(f2154e, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        d();
        if (z) {
            Intent intentF = b.f(this.f2155f, this.f2157h);
            e eVar = this.f2158i;
            eVar.k(new e.b(eVar, intentF, this.f2156g));
        }
        if (this.n) {
            Intent intentA = b.a(this.f2155f);
            e eVar2 = this.f2158i;
            eVar2.k(new e.b(eVar2, intentA, this.f2156g));
        }
    }

    @Override // androidx.work.impl.k.c
    public void e(List<String> list) {
        if (list.contains(this.f2157h)) {
            synchronized (this.f2160k) {
                if (this.f2161l == 0) {
                    this.f2161l = 1;
                    h.c().a(f2154e, String.format("onAllConstraintsMet for %s", this.f2157h), new Throwable[0]);
                    if (this.f2158i.e().f(this.f2157h)) {
                        this.f2158i.h().b(this.f2157h, 600000L, this);
                    } else {
                        d();
                    }
                } else {
                    h.c().a(f2154e, String.format("Already started work for %s", this.f2157h), new Throwable[0]);
                }
            }
        }
    }

    void f() {
        this.f2162m = i.b(this.f2155f, String.format("%s (%s)", this.f2157h, Integer.valueOf(this.f2156g)));
        h hVarC = h.c();
        String str = f2154e;
        hVarC.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f2162m, this.f2157h), new Throwable[0]);
        this.f2162m.acquire();
        j jVarM = this.f2158i.g().n().M().m(this.f2157h);
        if (jVarM == null) {
            g();
            return;
        }
        boolean zB = jVarM.b();
        this.n = zB;
        if (zB) {
            this.f2159j.d(Collections.singletonList(jVarM));
        } else {
            h.c().a(str, String.format("No constraints for %s", this.f2157h), new Throwable[0]);
            e(Collections.singletonList(this.f2157h));
        }
    }
}