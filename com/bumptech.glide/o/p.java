package com.bumptech.glide.o;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public class p implements Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    private static final b f4149e = new a();

    /* renamed from: f, reason: collision with root package name */
    private volatile com.bumptech.glide.k f4150f;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f4153i;

    /* renamed from: j, reason: collision with root package name */
    private final b f4154j;
    private final k n;

    /* renamed from: g, reason: collision with root package name */
    final Map<FragmentManager, o> f4151g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Map<androidx.fragment.app.m, s> f4152h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    private final c.e.a<View, Fragment> f4155k = new c.e.a<>();

    /* renamed from: l, reason: collision with root package name */
    private final c.e.a<View, android.app.Fragment> f4156l = new c.e.a<>();

    /* renamed from: m, reason: collision with root package name */
    private final Bundle f4157m = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.o.p.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, q qVar, Context context) {
            return new com.bumptech.glide.k(bVar, lVar, qVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, q qVar, Context context);
    }

    public p(b bVar, com.bumptech.glide.e eVar) {
        this.f4154j = bVar == null ? f4149e : bVar;
        this.f4153i = new Handler(Looper.getMainLooper(), this);
        this.n = b(eVar);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(com.bumptech.glide.e eVar) {
        return (com.bumptech.glide.load.p.d.r.f3996b && com.bumptech.glide.load.p.d.r.a) ? eVar.a(c.d.class) ? new i() : new j() : new g();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    private void d(FragmentManager fragmentManager, c.e.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT < 26) {
            e(fragmentManager, aVar);
            return;
        }
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager(), aVar);
            }
        }
    }

    @Deprecated
    private void e(FragmentManager fragmentManager, c.e.a<View, android.app.Fragment> aVar) {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.f4157m.putInt(Action.KEY_ATTRIBUTE, i2);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f4157m, Action.KEY_ATTRIBUTE);
            } catch (Exception unused) {
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                aVar.put(fragment.getView(), fragment);
                if (Build.VERSION.SDK_INT >= 17) {
                    d(fragment.getChildFragmentManager(), aVar);
                }
            }
            i2 = i3;
        }
    }

    private static void f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.Q0() != null) {
                map.put(fragment.Q0(), fragment);
                f(fragment.p0().f0(), map);
            }
        }
    }

    @Deprecated
    private android.app.Fragment g(View view, Activity activity) {
        this.f4156l.clear();
        d(activity.getFragmentManager(), this.f4156l);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f4156l.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f4156l.clear();
        return fragment;
    }

    private Fragment h(View view, androidx.fragment.app.d dVar) {
        this.f4155k.clear();
        f(dVar.y().f0(), this.f4155k);
        View viewFindViewById = dVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.f4155k.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f4155k.clear();
        return fragment;
    }

    @Deprecated
    private com.bumptech.glide.k i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        o oVarR = r(fragmentManager, fragment);
        com.bumptech.glide.k kVarE = oVarR.e();
        if (kVarE == null) {
            kVarE = this.f4154j.a(com.bumptech.glide.b.c(context), oVarR.c(), oVarR.f(), context);
            if (z) {
                kVarE.h();
            }
            oVarR.k(kVarE);
        }
        return kVarE;
    }

    private com.bumptech.glide.k p(Context context) {
        if (this.f4150f == null) {
            synchronized (this) {
                if (this.f4150f == null) {
                    this.f4150f = this.f4154j.a(com.bumptech.glide.b.c(context.getApplicationContext()), new com.bumptech.glide.o.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f4150f;
    }

    private o r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        o oVar = (o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = this.f4151g.get(fragmentManager);
        if (oVar2 != null) {
            return oVar2;
        }
        o oVar3 = new o();
        oVar3.j(fragment);
        this.f4151g.put(fragmentManager, oVar3);
        fragmentManager.beginTransaction().add(oVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f4153i.obtainMessage(1, fragmentManager).sendToTarget();
        return oVar3;
    }

    private s t(androidx.fragment.app.m mVar, Fragment fragment) {
        s sVar = (s) mVar.X("com.bumptech.glide.manager");
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = this.f4152h.get(mVar);
        if (sVar2 != null) {
            return sVar2;
        }
        s sVar3 = new s();
        sVar3.S2(fragment);
        this.f4152h.put(mVar, sVar3);
        mVar.i().e(sVar3, "com.bumptech.glide.manager").k();
        this.f4153i.obtainMessage(2, mVar).sendToTarget();
        return sVar3;
    }

    private static boolean u(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    private com.bumptech.glide.k v(Context context, androidx.fragment.app.m mVar, Fragment fragment, boolean z) {
        s sVarT = t(mVar, fragment);
        com.bumptech.glide.k kVarM2 = sVarT.M2();
        if (kVarM2 == null) {
            kVarM2 = this.f4154j.a(com.bumptech.glide.b.c(context), sVarT.K2(), sVarT.N2(), context);
            if (z) {
                kVarM2.h();
            }
            sVarT.T2(kVarM2);
        }
        return kVarM2;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.f4151g.remove(obj);
        } else {
            if (i2 != 2) {
                z = false;
                obj2 = null;
                if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z;
            }
            obj = (androidx.fragment.app.m) message.obj;
            objRemove = this.f4152h.remove(obj);
        }
        Object obj4 = obj;
        obj3 = objRemove;
        obj2 = obj4;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    public com.bumptech.glide.k j(Activity activity) {
        if (com.bumptech.glide.t.k.p()) {
            return l(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.d) {
            return o((androidx.fragment.app.d) activity);
        }
        a(activity);
        this.n.a(activity);
        return i(activity, activity.getFragmentManager(), null, u(activity));
    }

    @TargetApi(17)
    @Deprecated
    public com.bumptech.glide.k k(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (com.bumptech.glide.t.k.p() || Build.VERSION.SDK_INT < 17) {
            return l(fragment.getActivity().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.n.a(fragment.getActivity());
        }
        return i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public com.bumptech.glide.k l(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.t.k.q() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.d) {
                return o((androidx.fragment.app.d) context);
            }
            if (context instanceof Activity) {
                return j((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return l(contextWrapper.getBaseContext());
                }
            }
        }
        return p(context);
    }

    public com.bumptech.glide.k m(View view) {
        if (com.bumptech.glide.t.k.p()) {
            return l(view.getContext().getApplicationContext());
        }
        com.bumptech.glide.t.j.d(view);
        com.bumptech.glide.t.j.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityC = c(view.getContext());
        if (activityC == null) {
            return l(view.getContext().getApplicationContext());
        }
        if (!(activityC instanceof androidx.fragment.app.d)) {
            android.app.Fragment fragmentG = g(view, activityC);
            return fragmentG == null ? j(activityC) : k(fragmentG);
        }
        androidx.fragment.app.d dVar = (androidx.fragment.app.d) activityC;
        Fragment fragmentH = h(view, dVar);
        return fragmentH != null ? n(fragmentH) : o(dVar);
    }

    public com.bumptech.glide.k n(Fragment fragment) {
        com.bumptech.glide.t.j.e(fragment.q0(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (com.bumptech.glide.t.k.p()) {
            return l(fragment.q0().getApplicationContext());
        }
        if (fragment.j0() != null) {
            this.n.a(fragment.j0());
        }
        return v(fragment.q0(), fragment.p0(), fragment, fragment.d1());
    }

    public com.bumptech.glide.k o(androidx.fragment.app.d dVar) {
        if (com.bumptech.glide.t.k.p()) {
            return l(dVar.getApplicationContext());
        }
        a(dVar);
        this.n.a(dVar);
        return v(dVar, dVar.y(), null, u(dVar));
    }

    @Deprecated
    o q(Activity activity) {
        return r(activity.getFragmentManager(), null);
    }

    s s(androidx.fragment.app.m mVar) {
        return t(mVar, null);
    }
}