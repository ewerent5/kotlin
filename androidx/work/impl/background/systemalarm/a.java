package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.h;

/* compiled from: Alarms.java */
/* loaded from: classes.dex */
class a {
    private static final String a = h.f("Alarms");

    public static void a(Context context, androidx.work.impl.h hVar, String str) {
        androidx.work.impl.l.e eVarK = hVar.n().K();
        androidx.work.impl.l.d dVarB = eVarK.b(str);
        if (dVarB != null) {
            b(context, str, dVarB.f2293b);
            h.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            eVarK.c(str);
        }
    }

    private static void b(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        h.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i2)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, androidx.work.impl.h hVar, String str, long j2) {
        androidx.work.impl.l.e eVarK = hVar.n().K();
        androidx.work.impl.l.d dVarB = eVarK.b(str);
        if (dVarB != null) {
            b(context, str, dVarB.f2293b);
            d(context, str, dVarB.f2293b, j2);
        } else {
            int iB = new androidx.work.impl.utils.c(context).b();
            eVarK.a(new androidx.work.impl.l.d(str, iB));
            d(context, str, iB, j2);
        }
    }

    private static void d(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.b(context, str), 1073741824);
        if (alarmManager != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, j2, service);
            } else {
                alarmManager.set(0, j2, service);
            }
        }
    }
}