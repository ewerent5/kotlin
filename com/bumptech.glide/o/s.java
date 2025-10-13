package com.bumptech.glide.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes.dex */
public class s extends Fragment {
    private final com.bumptech.glide.o.a b0;
    private final q c0;
    private final Set<s> d0;
    private s e0;
    private com.bumptech.glide.k f0;
    private Fragment g0;

    /* compiled from: SupportRequestManagerFragment.java */
    private class a implements q {
        a() {
        }

        @Override // com.bumptech.glide.o.q
        public Set<com.bumptech.glide.k> a() {
            Set<s> setJ2 = s.this.J2();
            HashSet hashSet = new HashSet(setJ2.size());
            for (s sVar : setJ2) {
                if (sVar.M2() != null) {
                    hashSet.add(sVar.M2());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + s.this + "}";
        }
    }

    public s() {
        this(new com.bumptech.glide.o.a());
    }

    private void I2(s sVar) {
        this.d0.add(sVar);
    }

    private Fragment L2() {
        Fragment fragmentC0 = C0();
        return fragmentC0 != null ? fragmentC0 : this.g0;
    }

    private static androidx.fragment.app.m O2(Fragment fragment) {
        while (fragment.C0() != null) {
            fragment = fragment.C0();
        }
        return fragment.v0();
    }

    private boolean P2(Fragment fragment) {
        Fragment fragmentL2 = L2();
        while (true) {
            Fragment fragmentC0 = fragment.C0();
            if (fragmentC0 == null) {
                return false;
            }
            if (fragmentC0.equals(fragmentL2)) {
                return true;
            }
            fragment = fragment.C0();
        }
    }

    private void Q2(Context context, androidx.fragment.app.m mVar) {
        U2();
        s sVarS = com.bumptech.glide.b.c(context).k().s(mVar);
        this.e0 = sVarS;
        if (equals(sVarS)) {
            return;
        }
        this.e0.I2(this);
    }

    private void R2(s sVar) {
        this.d0.remove(sVar);
    }

    private void U2() {
        s sVar = this.e0;
        if (sVar != null) {
            sVar.R2(this);
            this.e0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.b0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void J1() {
        super.J1();
        this.b0.e();
    }

    Set<s> J2() {
        s sVar = this.e0;
        if (sVar == null) {
            return Collections.emptySet();
        }
        if (equals(sVar)) {
            return Collections.unmodifiableSet(this.d0);
        }
        HashSet hashSet = new HashSet();
        for (s sVar2 : this.e0.J2()) {
            if (P2(sVar2.L2())) {
                hashSet.add(sVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    com.bumptech.glide.o.a K2() {
        return this.b0;
    }

    public com.bumptech.glide.k M2() {
        return this.f0;
    }

    public q N2() {
        return this.c0;
    }

    void S2(Fragment fragment) {
        androidx.fragment.app.m mVarO2;
        this.g0 = fragment;
        if (fragment == null || fragment.q0() == null || (mVarO2 = O2(fragment)) == null) {
            return;
        }
        Q2(fragment.q0(), mVarO2);
    }

    public void T2(com.bumptech.glide.k kVar) {
        this.f0 = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(Context context) {
        super.i1(context);
        androidx.fragment.app.m mVarO2 = O2(this);
        if (mVarO2 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                Q2(q0(), mVarO2);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        this.b0.c();
        U2();
    }

    @Override // androidx.fragment.app.Fragment
    public void t1() {
        super.t1();
        this.g0 = null;
        U2();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + L2() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public s(com.bumptech.glide.o.a aVar) {
        this.c0 = new a();
        this.d0 = new HashSet();
        this.b0 = aVar;
    }
}