package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import e.c.b.a.i.m;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        e.c.b.a.i.q.f(getApplicationContext());
        m.a aVarD = e.c.b.a.i.m.a().b(string).d(e.c.b.a.i.z.a.b(i2));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        e.c.b.a.i.q.c().e().g(aVarD.a(), i3, f.a(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}