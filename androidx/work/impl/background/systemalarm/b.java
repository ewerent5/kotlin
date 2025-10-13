package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.l.j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public class b implements androidx.work.impl.a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2146e = h.f("CommandHandler");

    /* renamed from: f, reason: collision with root package name */
    private final Context f2147f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, androidx.work.impl.a> f2148g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f2149h = new Object();

    b(Context context) {
        this.f2147f = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i2, e eVar) {
        h.c().a(f2146e, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f2147f, i2, eVar).a();
    }

    private void i(Intent intent, int i2, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f2149h) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            h hVarC = h.c();
            String str = f2146e;
            hVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (this.f2148g.containsKey(string)) {
                h.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            } else {
                d dVar = new d(this.f2147f, i2, string, eVar);
                this.f2148g.put(string, dVar);
                dVar.f();
            }
        }
    }

    private void j(Intent intent, int i2, e eVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        h.c().a(f2146e, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
        c(string, z);
    }

    private void k(Intent intent, int i2, e eVar) {
        h.c().a(f2146e, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
        eVar.g().r();
    }

    private void l(Intent intent, int i2, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h hVarC = h.c();
        String str = f2146e;
        hVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseN = eVar.g().n();
        workDatabaseN.c();
        try {
            j jVarM = workDatabaseN.M().m(string);
            if (jVarM == null) {
                h.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (jVarM.f2303d.a()) {
                h.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = jVarM.a();
            if (jVarM.b()) {
                h.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f2147f, eVar.g(), string, jA);
                eVar.k(new e.b(eVar, a(this.f2147f), i2));
            } else {
                h.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                a.c(this.f2147f, eVar.g(), string, jA);
            }
            workDatabaseN.D();
        } finally {
            workDatabaseN.h();
        }
    }

    private void m(Intent intent, int i2, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h.c().a(f2146e, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().v(string);
        a.a(this.f2147f, eVar.g(), string);
        eVar.c(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.work.impl.a
    public void c(String str, boolean z) {
        synchronized (this.f2149h) {
            androidx.work.impl.a aVarRemove = this.f2148g.remove(str);
            if (aVarRemove != null) {
                aVarRemove.c(str, z);
            }
        }
    }

    boolean o() {
        boolean z;
        synchronized (this.f2149h) {
            z = !this.f2148g.isEmpty();
        }
        return z;
    }

    void p(Intent intent, int i2, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i2, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i2, eVar);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            h.c().b(f2146e, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i2, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i2, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, i2, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i2, eVar);
        } else {
            h.c().h(f2146e, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}