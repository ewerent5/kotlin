package f.b;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentCallbacks2;
import f.c.f;

/* compiled from: AndroidInjection.java */
/* loaded from: classes3.dex */
public final class a {
    public static void a(Activity activity) {
        f.c(activity, "activity");
        ComponentCallbacks2 application = activity.getApplication();
        if (!(application instanceof e)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), e.class.getCanonicalName()));
        }
        c(activity, (e) application);
    }

    public static void b(Service service) {
        f.c(service, "service");
        ComponentCallbacks2 application = service.getApplication();
        if (!(application instanceof e)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), e.class.getCanonicalName()));
        }
        c(service, (e) application);
    }

    private static void c(Object obj, e eVar) {
        b<Object> bVarL = eVar.l();
        f.d(bVarL, "%s.androidInjector() returned null", eVar.getClass());
        bVarL.a(obj);
    }
}