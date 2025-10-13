package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.c;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler.java */
/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: e */
    private static final String f2191e = h.f("SystemJobScheduler");

    /* renamed from: f */
    private final Context f2192f;

    /* renamed from: g */
    private final JobScheduler f2193g;

    /* renamed from: h */
    private final androidx.work.impl.h f2194h;

    /* renamed from: i */
    private final c f2195i;

    /* renamed from: j */
    private final a f2196j;

    public b(Context context, androidx.work.impl.h hVar) {
        this(context, hVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void b(Context context) {
        List<JobInfo> listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = listG.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    public static void c(Context context) {
        List<JobInfo> listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : listG) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                e(jobScheduler, jobInfo.getId());
            }
        }
    }

    private static void e(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            h.c().b(f2191e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    private static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            h.c().b(f2191e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // androidx.work.impl.d
    public void a(j... jVarArr) {
        List<Integer> listF;
        WorkDatabase workDatabaseN = this.f2194h.n();
        for (j jVar : jVarArr) {
            workDatabaseN.c();
            try {
                j jVarM = workDatabaseN.M().m(jVar.f2302c);
                if (jVarM == null) {
                    h.c().h(f2191e, "Skipping scheduling " + jVar.f2302c + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseN.D();
                } else if (jVarM.f2303d != n.a.ENQUEUED) {
                    h.c().h(f2191e, "Skipping scheduling " + jVar.f2302c + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseN.D();
                } else {
                    androidx.work.impl.l.d dVarB = workDatabaseN.K().b(jVar.f2302c);
                    int iD = dVarB != null ? dVarB.f2293b : this.f2195i.d(this.f2194h.h().e(), this.f2194h.h().c());
                    if (dVarB == null) {
                        this.f2194h.n().K().a(new androidx.work.impl.l.d(jVar.f2302c, iD));
                    }
                    h(jVar, iD);
                    if (Build.VERSION.SDK_INT == 23 && (listF = f(this.f2192f, this.f2193g, jVar.f2302c)) != null) {
                        int iIndexOf = listF.indexOf(Integer.valueOf(iD));
                        if (iIndexOf >= 0) {
                            listF.remove(iIndexOf);
                        }
                        h(jVar, !listF.isEmpty() ? listF.get(0).intValue() : this.f2195i.d(this.f2194h.h().e(), this.f2194h.h().c()));
                    }
                    workDatabaseN.D();
                }
                workDatabaseN.h();
            } catch (Throwable th) {
                workDatabaseN.h();
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.d
    public void d(String str) {
        List<Integer> listF = f(this.f2192f, this.f2193g, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listF.iterator();
        while (it.hasNext()) {
            e(this.f2193g, it.next().intValue());
        }
        this.f2194h.n().K().c(str);
    }

    public void h(j jVar, int i2) {
        JobInfo jobInfoA = this.f2196j.a(jVar, i2);
        h.c().a(f2191e, String.format("Scheduling work ID %s Job ID %s", jVar.f2302c, Integer.valueOf(i2)), new Throwable[0]);
        try {
            this.f2193g.schedule(jobInfoA);
        } catch (IllegalStateException e2) {
            List<JobInfo> listG = g(this.f2192f, this.f2193g);
            String str = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f2194h.n().M().g().size()), Integer.valueOf(this.f2194h.h().d()));
            h.c().b(f2191e, str, new Throwable[0]);
            throw new IllegalStateException(str, e2);
        } catch (Throwable th) {
            h.c().b(f2191e, String.format("Unable to schedule %s", jVar), th);
        }
    }

    public b(Context context, androidx.work.impl.h hVar, JobScheduler jobScheduler, a aVar) {
        this.f2192f = context;
        this.f2194h = hVar;
        this.f2193g = jobScheduler;
        this.f2195i = new c(context);
        this.f2196j = aVar;
    }
}