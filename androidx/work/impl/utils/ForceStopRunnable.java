package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.n;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    private static final String f2341e = androidx.work.h.f("ForceStopRunnable");

    /* renamed from: f */
    private static final long f2342f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: g */
    private final Context f2343g;

    /* renamed from: h */
    private final androidx.work.impl.h f2344h;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = androidx.work.h.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            androidx.work.h.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.e(context);
        }
    }

    public ForceStopRunnable(Context context, androidx.work.impl.h hVar) {
        this.f2343g = context.getApplicationContext();
        this.f2344h = hVar;
    }

    static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent c(Context context, int i2) {
        return PendingIntent.getBroadcast(context, -1, b(context), i2);
    }

    static void e(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentC = c(context, 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f2342f;
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentC);
            } else {
                alarmManager.set(0, jCurrentTimeMillis, pendingIntentC);
            }
        }
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.c(this.f2343g);
        }
        WorkDatabase workDatabaseN = this.f2344h.n();
        k kVarM = workDatabaseN.M();
        workDatabaseN.c();
        try {
            List<j> listI = kVarM.i();
            boolean z = (listI == null || listI.isEmpty()) ? false : true;
            if (z) {
                for (j jVar : listI) {
                    kVarM.a(n.a.ENQUEUED, jVar.f2302c);
                    kVarM.b(jVar.f2302c, -1L);
                }
            }
            workDatabaseN.D();
            return z;
        } finally {
            workDatabaseN.h();
        }
    }

    public boolean d() {
        if (c(this.f2343g, 536870912) != null) {
            return false;
        }
        e(this.f2343g);
        return true;
    }

    boolean f() {
        return this.f2344h.k().b();
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.work.h hVarC = androidx.work.h.c();
        String str = f2341e;
        hVarC.a(str, "Performing cleanup operations.", new Throwable[0]);
        boolean zA = a();
        if (f()) {
            androidx.work.h.c().a(str, "Rescheduling Workers.", new Throwable[0]);
            this.f2344h.r();
            this.f2344h.k().c(false);
        } else if (d()) {
            androidx.work.h.c().a(str, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f2344h.r();
        } else if (zA) {
            androidx.work.h.c().a(str, "Found unfinished work, scheduling it.", new Throwable[0]);
            androidx.work.impl.e.b(this.f2344h.h(), this.f2344h.n(), this.f2344h.m());
        }
        this.f2344h.q();
    }
}