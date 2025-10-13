package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.u;
import androidx.navigation.j;
import androidx.navigation.o;
import androidx.navigation.r;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: FragmentNavigator.java */
@r.b("fragment")
/* loaded from: classes.dex */
public class a extends r<C0017a> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final m f1286b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1287c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayDeque<Integer> f1288d = new ArrayDeque<>();

    /* compiled from: FragmentNavigator.java */
    /* renamed from: androidx.navigation.fragment.a$a, reason: collision with other inner class name */
    public static class C0017a extends j {
        private String n;

        public C0017a(r<? extends C0017a> rVar) {
            super(rVar);
        }

        public final String E() {
            String str = this.n;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Fragment class was not set");
        }

        public final C0017a F(String str) {
            this.n = str;
            return this;
        }

        @Override // androidx.navigation.j
        public void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, c.f1296i);
            String string = typedArrayObtainAttributes.getString(c.f1297j);
            if (string != null) {
                F(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.j
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.n;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /* compiled from: FragmentNavigator.java */
    public static final class b implements r.a {
        private final LinkedHashMap<View, String> a;

        public Map<View, String> a() {
            return Collections.unmodifiableMap(this.a);
        }
    }

    public a(Context context, m mVar, int i2) {
        this.a = context;
        this.f1286b = mVar;
        this.f1287c = i2;
    }

    private String g(int i2, int i3) {
        return i2 + "-" + i3;
    }

    @Override // androidx.navigation.r
    public void c(Bundle bundle) {
        int[] intArray;
        if (bundle == null || (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) == null) {
            return;
        }
        this.f1288d.clear();
        for (int i2 : intArray) {
            this.f1288d.add(Integer.valueOf(i2));
        }
    }

    @Override // androidx.navigation.r
    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f1288d.size()];
        Iterator<Integer> it = this.f1288d.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // androidx.navigation.r
    public boolean e() {
        if (this.f1288d.isEmpty()) {
            return false;
        }
        if (this.f1286b.t0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.f1286b.E0(g(this.f1288d.size(), this.f1288d.peekLast().intValue()), 1);
        this.f1288d.removeLast();
        return true;
    }

    @Override // androidx.navigation.r
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0017a a() {
        return new C0017a(this);
    }

    @Deprecated
    public Fragment h(Context context, m mVar, String str, Bundle bundle) {
        return mVar.e0().a(context.getClassLoader(), str);
    }

    @Override // androidx.navigation.r
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public j b(C0017a c0017a, Bundle bundle, o oVar, r.a aVar) {
        if (this.f1286b.t0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return null;
        }
        String strE = c0017a.E();
        boolean z = false;
        if (strE.charAt(0) == '.') {
            strE = this.a.getPackageName() + strE;
        }
        Fragment fragmentH = h(this.a, this.f1286b, strE, bundle);
        fragmentH.s2(bundle);
        u uVarI = this.f1286b.i();
        int iA = oVar != null ? oVar.a() : -1;
        int iB = oVar != null ? oVar.b() : -1;
        int iC = oVar != null ? oVar.c() : -1;
        int iD = oVar != null ? oVar.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            if (iD == -1) {
                iD = 0;
            }
            uVarI.t(iA, iB, iC, iD);
        }
        uVarI.r(this.f1287c, fragmentH);
        uVarI.v(fragmentH);
        int iN = c0017a.n();
        boolean zIsEmpty = this.f1288d.isEmpty();
        boolean z2 = oVar != null && !zIsEmpty && oVar.g() && this.f1288d.peekLast().intValue() == iN;
        if (zIsEmpty) {
            z = true;
        } else if (!z2) {
            uVarI.h(g(this.f1288d.size() + 1, iN));
            z = true;
        } else if (this.f1288d.size() > 1) {
            this.f1286b.E0(g(this.f1288d.size(), this.f1288d.peekLast().intValue()), 1);
            uVarI.h(g(this.f1288d.size(), iN));
        }
        if (aVar instanceof b) {
            for (Map.Entry<View, String> entry : ((b) aVar).a().entrySet()) {
                uVarI.g(entry.getKey(), entry.getValue());
            }
        }
        uVarI.w(true);
        uVarI.j();
        if (!z) {
            return null;
        }
        this.f1288d.add(Integer.valueOf(iN));
        return c0017a;
    }
}