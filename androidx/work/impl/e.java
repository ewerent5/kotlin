package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public class e {
    private static final String a = androidx.work.h.f("Schedulers");

    static d a(Context context, h hVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b bVar = new androidx.work.impl.background.systemjob.b(context, hVar);
            androidx.work.impl.utils.d.a(context, SystemJobService.class, true);
            androidx.work.h.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        d dVarC = c(context);
        if (dVarC != null) {
            return dVarC;
        }
        androidx.work.impl.background.systemalarm.f fVar = new androidx.work.impl.background.systemalarm.f(context);
        androidx.work.impl.utils.d.a(context, SystemAlarmService.class, true);
        androidx.work.h.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<d> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        k kVarM = workDatabase.M();
        workDatabase.c();
        try {
            List<j> listD = kVarM.d(bVar.d());
            if (listD != null && listD.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator<j> it = listD.iterator();
                while (it.hasNext()) {
                    kVarM.b(it.next().f2302c, jCurrentTimeMillis);
                }
            }
            workDatabase.D();
            if (listD == null || listD.size() <= 0) {
                return;
            }
            j[] jVarArr = (j[]) listD.toArray(new j[0]);
            Iterator<d> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().a(jVarArr);
            }
        } finally {
            workDatabase.h();
        }
    }

    private static d c(Context context) {
        try {
            d dVar = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            androidx.work.h.c().a(a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return dVar;
        } catch (Throwable th) {
            androidx.work.h.c().a(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}