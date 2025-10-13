package f.b.f;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import f.b.b;
import f.b.e;
import f.c.f;

/* compiled from: AndroidSupportInjection.java */
/* loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    private static e a(Fragment fragment) {
        Fragment fragmentC0 = fragment;
        do {
            fragmentC0 = fragmentC0.C0();
            if (fragmentC0 == 0) {
                d dVarJ0 = fragment.j0();
                if (dVarJ0 instanceof e) {
                    return (e) dVarJ0;
                }
                if (dVarJ0.getApplication() instanceof e) {
                    return (e) dVarJ0.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
            }
        } while (!(fragmentC0 instanceof e));
        return (e) fragmentC0;
    }

    public static void b(Fragment fragment) {
        f.c(fragment, "fragment");
        e eVarA = a(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), eVarA.getClass().getCanonicalName()));
        }
        c(fragment, eVarA);
    }

    private static void c(Object obj, e eVar) {
        b<Object> bVarL = eVar.l();
        f.d(bVarL, "%s.androidInjector() returned null", eVar.getClass());
        bVarL.a(obj);
    }
}