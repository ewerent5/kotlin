package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
/* loaded from: classes.dex */
public class e implements s {
    private final Context a;

    /* renamed from: b */
    private final e.c.b.a.i.w.j.c f4399b;

    /* renamed from: c */
    private final g f4400c;

    public e(Context context, e.c.b.a.i.w.j.c cVar, g gVar) {
        this.a = context;
        this.f4399b = cVar;
        this.f4400c = gVar;
    }

    private boolean c(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i4 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.s
    public void a(e.c.b.a.i.m mVar, int i2) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int iB = b(mVar);
        if (c(jobScheduler, iB, i2)) {
            e.c.b.a.i.u.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long jD0 = this.f4399b.D0(mVar);
        JobInfo.Builder builderC = this.f4400c.c(new JobInfo.Builder(iB, componentName), mVar.d(), jD0, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", mVar.b());
        persistableBundle.putInt("priority", e.c.b.a.i.z.a.a(mVar.d()));
        if (mVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        e.c.b.a.i.u.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(iB), Long.valueOf(this.f4400c.g(mVar.d(), jD0, i2)), Long.valueOf(jD0), Integer.valueOf(i2));
        jobScheduler.schedule(builderC.build());
    }

    int b(e.c.b.a.i.m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(e.c.b.a.i.z.a.a(mVar.d())).array());
        if (mVar.c() != null) {
            adler32.update(mVar.c());
        }
        return (int) adler32.getValue();
    }
}