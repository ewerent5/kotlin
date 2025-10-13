package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.d;
import androidx.work.h;
import androidx.work.i;
import androidx.work.impl.l.j;
import java.util.Iterator;

/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
class a {
    private static final String a = h.f("SystemJobInfoConverter");

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f2190b;

    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: androidx.work.impl.background.systemjob.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0034a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.values().length];
            a = iArr;
            try {
                iArr[i.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[i.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[i.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[i.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[i.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    a(Context context) {
        this.f2190b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(i iVar) {
        int i2 = C0034a.a[iVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 4) {
            if (i2 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        h.c().a(a, String.format("API version too low. Cannot convert network type value %s", iVar), new Throwable[0]);
        return 1;
    }

    JobInfo a(j jVar, int i2) {
        c cVar = jVar.f2311l;
        int iC = c(cVar.b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.f2302c);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i2, this.f2190b).setRequiredNetworkType(iC).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        if (!cVar.h()) {
            extras.setBackoffCriteria(jVar.o, jVar.n == androidx.work.a.LINEAR ? 0 : 1);
        }
        extras.setMinimumLatency(Math.max(jVar.a() - System.currentTimeMillis(), 0L));
        if (Build.VERSION.SDK_INT >= 24 && cVar.e()) {
            Iterator<d.a> it = cVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        return extras.build();
    }
}