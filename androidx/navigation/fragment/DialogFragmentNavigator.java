package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.navigation.j;
import androidx.navigation.o;
import androidx.navigation.r;
import java.util.HashSet;

@r.b("dialog")
/* loaded from: classes.dex */
public final class DialogFragmentNavigator extends r<a> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final m f1281b;

    /* renamed from: c, reason: collision with root package name */
    private int f1282c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<String> f1283d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private i f1284e = new i() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.i
        public void c(k kVar, g.b bVar) {
            if (bVar == g.b.ON_STOP) {
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) kVar;
                if (cVar.P2().isShowing()) {
                    return;
                }
                NavHostFragment.J2(cVar).q();
            }
        }
    };

    public static class a extends j implements androidx.navigation.b {
        private String n;

        public a(r<? extends a> rVar) {
            super(rVar);
        }

        public final String E() {
            String str = this.n;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a F(String str) {
            this.n = str;
            return this;
        }

        @Override // androidx.navigation.j
        public void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f1290c);
            String string = typedArrayObtainAttributes.getString(c.f1291d);
            if (string != null) {
                F(string);
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, m mVar) {
        this.a = context;
        this.f1281b = mVar;
    }

    @Override // androidx.navigation.r
    public void c(Bundle bundle) {
        if (bundle != null) {
            this.f1282c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i2 = 0; i2 < this.f1282c; i2++) {
                androidx.fragment.app.c cVar = (androidx.fragment.app.c) this.f1281b.X("androidx-nav-fragment:navigator:dialog:" + i2);
                if (cVar != null) {
                    cVar.i().a(this.f1284e);
                } else {
                    this.f1283d.add("androidx-nav-fragment:navigator:dialog:" + i2);
                }
            }
        }
    }

    @Override // androidx.navigation.r
    public Bundle d() {
        if (this.f1282c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.f1282c);
        return bundle;
    }

    @Override // androidx.navigation.r
    public boolean e() {
        if (this.f1282c == 0) {
            return false;
        }
        if (this.f1281b.t0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        m mVar = this.f1281b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i2 = this.f1282c - 1;
        this.f1282c = i2;
        sb.append(i2);
        Fragment fragmentX = mVar.X(sb.toString());
        if (fragmentX != null) {
            fragmentX.i().c(this.f1284e);
            ((androidx.fragment.app.c) fragmentX).K2();
        }
        return true;
    }

    @Override // androidx.navigation.r
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this);
    }

    @Override // androidx.navigation.r
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public j b(a aVar, Bundle bundle, o oVar, r.a aVar2) {
        if (this.f1281b.t0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String strE = aVar.E();
        if (strE.charAt(0) == '.') {
            strE = this.a.getPackageName() + strE;
        }
        Fragment fragmentA = this.f1281b.e0().a(this.a.getClassLoader(), strE);
        if (!androidx.fragment.app.c.class.isAssignableFrom(fragmentA.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + aVar.E() + " is not an instance of DialogFragment");
        }
        androidx.fragment.app.c cVar = (androidx.fragment.app.c) fragmentA;
        cVar.s2(bundle);
        cVar.i().a(this.f1284e);
        m mVar = this.f1281b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i2 = this.f1282c;
        this.f1282c = i2 + 1;
        sb.append(i2);
        cVar.S2(mVar, sb.toString());
        return aVar;
    }

    void h(Fragment fragment) {
        if (this.f1283d.remove(fragment.N0())) {
            fragment.i().a(this.f1284e);
        }
    }
}