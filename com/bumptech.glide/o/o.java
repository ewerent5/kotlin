package com.bumptech.glide.o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: e */
    private final com.bumptech.glide.o.a f4143e;

    /* renamed from: f */
    private final q f4144f;

    /* renamed from: g */
    private final Set<o> f4145g;

    /* renamed from: h */
    private com.bumptech.glide.k f4146h;

    /* renamed from: i */
    private o f4147i;

    /* renamed from: j */
    private Fragment f4148j;

    /* compiled from: RequestManagerFragment.java */
    private class a implements q {
        a() {
        }

        @Override // com.bumptech.glide.o.q
        public Set<com.bumptech.glide.k> a() {
            Set<o> setB = o.this.b();
            HashSet hashSet = new HashSet(setB.size());
            for (o oVar : setB) {
                if (oVar.e() != null) {
                    hashSet.add(oVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new com.bumptech.glide.o.a());
    }

    private void a(o oVar) {
        this.f4145g.add(oVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f4148j;
    }

    @TargetApi(17)
    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        o oVarQ = com.bumptech.glide.b.c(activity).k().q(activity);
        this.f4147i = oVarQ;
        if (equals(oVarQ)) {
            return;
        }
        this.f4147i.a(this);
    }

    private void i(o oVar) {
        this.f4145g.remove(oVar);
    }

    private void l() {
        o oVar = this.f4147i;
        if (oVar != null) {
            oVar.i(this);
            this.f4147i = null;
        }
    }

    @TargetApi(17)
    Set<o> b() {
        if (equals(this.f4147i)) {
            return Collections.unmodifiableSet(this.f4145g);
        }
        if (this.f4147i == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (o oVar : this.f4147i.b()) {
            if (g(oVar.getParentFragment())) {
                hashSet.add(oVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    com.bumptech.glide.o.a c() {
        return this.f4143e;
    }

    public com.bumptech.glide.k e() {
        return this.f4146h;
    }

    public q f() {
        return this.f4144f;
    }

    void j(Fragment fragment) {
        this.f4148j = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        h(fragment.getActivity());
    }

    public void k(com.bumptech.glide.k kVar) {
        this.f4146h = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f4143e.c();
        l();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        l();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f4143e.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f4143e.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }

    @SuppressLint({"ValidFragment"})
    o(com.bumptech.glide.o.a aVar) {
        this.f4144f = new a();
        this.f4145g = new HashSet();
        this.f4143e = aVar;
    }
}