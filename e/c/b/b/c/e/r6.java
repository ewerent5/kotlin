package e.c.b.b.c.e;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
@TargetApi(SyslogConstants.LOG_DAEMON)
/* loaded from: classes.dex */
public final class r6 {
    private static final Method a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f14812b = d();

    /* renamed from: c, reason: collision with root package name */
    private final JobScheduler f14813c;

    private r6(JobScheduler jobScheduler) {
        this.f14813c = jobScheduler;
    }

    private final int a(JobInfo jobInfo, String str, int i2, String str2) {
        Method method = a;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f14813c, jobInfo, str, Integer.valueOf(i2), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                Log.e(str2, "error calling scheduleAsPackage", e2);
            }
        }
        return this.f14813c.schedule(jobInfo);
    }

    public static int b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (a == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new r6(jobScheduler).a(jobInfo, str, e(), str2);
    }

    private static Method c() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static int e() {
        Method method = f14812b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e2);
                }
            }
        }
        return 0;
    }
}