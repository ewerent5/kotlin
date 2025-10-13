package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements androidx.work.impl.a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2187e = h.f("SystemJobService");

    /* renamed from: f, reason: collision with root package name */
    private androidx.work.impl.h f2188f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, JobParameters> f2189g = new HashMap();

    @Override // androidx.work.impl.a
    public void c(String str, boolean z) {
        JobParameters jobParametersRemove;
        h.c().a(f2187e, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2189g) {
            jobParametersRemove = this.f2189g.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            androidx.work.impl.h hVarJ = androidx.work.impl.h.j(getApplicationContext());
            this.f2188f = hVarJ;
            hVarJ.l().a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            h.c().h(f2187e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        androidx.work.impl.h hVar = this.f2188f;
        if (hVar != null) {
            hVar.l().e(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f2188f == null) {
            h.c().a(f2187e, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            h.c().b(f2187e, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            h.c().b(f2187e, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f2189g) {
            if (this.f2189g.containsKey(string)) {
                h.c().a(f2187e, String.format("Job is already being executed by SystemJobService: %s", string), new Throwable[0]);
                return false;
            }
            h.c().a(f2187e, String.format("onStartJob for %s", string), new Throwable[0]);
            this.f2189g.put(string, jobParameters);
            WorkerParameters.a aVar = null;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f2089b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i2 >= 28) {
                    aVar.f2090c = jobParameters.getNetwork();
                }
            }
            this.f2188f.u(string, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f2188f == null) {
            h.c().a(f2187e, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            h.c().b(f2187e, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            h.c().b(f2187e, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        h.c().a(f2187e, String.format("onStopJob for %s", string), new Throwable[0]);
        synchronized (this.f2189g) {
            this.f2189g.remove(string);
        }
        this.f2188f.v(string);
        return !this.f2188f.l().b(string);
    }
}