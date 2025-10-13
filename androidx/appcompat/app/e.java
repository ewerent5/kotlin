package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: e, reason: collision with root package name */
    private static int f73e = -100;

    /* renamed from: f, reason: collision with root package name */
    private static final c.e.b<WeakReference<e>> f74f = new c.e.b<>();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f75g = new Object();

    e() {
    }

    private static void A(e eVar) {
        synchronized (f75g) {
            Iterator<WeakReference<e>> it = f74f.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void F(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f73e != i2) {
            f73e = i2;
            f();
        }
    }

    static void c(e eVar) {
        synchronized (f75g) {
            A(eVar);
            f74f.add(new WeakReference<>(eVar));
        }
    }

    private static void f() {
        synchronized (f75g) {
            Iterator<WeakReference<e>> it = f74f.iterator();
            while (it.hasNext()) {
                e eVar = it.next().get();
                if (eVar != null) {
                    eVar.e();
                }
            }
        }
    }

    public static e i(Activity activity, d dVar) {
        return new f(activity, dVar);
    }

    public static e j(Dialog dialog, d dVar) {
        return new f(dialog, dVar);
    }

    public static int l() {
        return f73e;
    }

    static void z(e eVar) {
        synchronized (f75g) {
            A(eVar);
        }
    }

    public abstract boolean B(int i2);

    public abstract void C(int i2);

    public abstract void D(View view);

    public abstract void E(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void G(Toolbar toolbar);

    public void H(int i2) {
    }

    public abstract void I(CharSequence charSequence);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    public Context h(Context context) {
        g(context);
        return context;
    }

    public abstract <T extends View> T k(int i2);

    public int m() {
        return -100;
    }

    public abstract MenuInflater n();

    public abstract a o();

    public abstract void p();

    public abstract void q();

    public abstract void r(Configuration configuration);

    public abstract void s(Bundle bundle);

    public abstract void t();

    public abstract void u(Bundle bundle);

    public abstract void v();

    public abstract void w(Bundle bundle);

    public abstract void x();

    public abstract void y();
}