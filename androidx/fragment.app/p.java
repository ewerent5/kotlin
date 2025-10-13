package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
final class p extends androidx.lifecycle.x {

    /* renamed from: c, reason: collision with root package name */
    private static final z.a f1064c = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1068g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Fragment> f1065d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, p> f1066e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, a0> f1067f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f1069h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1070i = false;

    /* compiled from: FragmentManagerViewModel.java */
    static class a implements z.a {
        a() {
        }

        @Override // androidx.lifecycle.z.a
        public <T extends androidx.lifecycle.x> T a(Class<T> cls) {
            return new p(true);
        }
    }

    p(boolean z) {
        this.f1068g = z;
    }

    static p j(a0 a0Var) {
        return (p) new androidx.lifecycle.z(a0Var, f1064c).a(p.class);
    }

    @Override // androidx.lifecycle.x
    protected void d() {
        if (m.p0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1069h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f1065d.equals(pVar.f1065d) && this.f1066e.equals(pVar.f1066e) && this.f1067f.equals(pVar.f1067f);
    }

    boolean f(Fragment fragment) {
        if (this.f1065d.containsKey(fragment.f977j)) {
            return false;
        }
        this.f1065d.put(fragment.f977j, fragment);
        return true;
    }

    void g(Fragment fragment) {
        if (m.p0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        p pVar = this.f1066e.get(fragment.f977j);
        if (pVar != null) {
            pVar.d();
            this.f1066e.remove(fragment.f977j);
        }
        a0 a0Var = this.f1067f.get(fragment.f977j);
        if (a0Var != null) {
            a0Var.a();
            this.f1067f.remove(fragment.f977j);
        }
    }

    Fragment h(String str) {
        return this.f1065d.get(str);
    }

    public int hashCode() {
        return (((this.f1065d.hashCode() * 31) + this.f1066e.hashCode()) * 31) + this.f1067f.hashCode();
    }

    p i(Fragment fragment) {
        p pVar = this.f1066e.get(fragment.f977j);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this.f1068g);
        this.f1066e.put(fragment.f977j, pVar2);
        return pVar2;
    }

    Collection<Fragment> k() {
        return this.f1065d.values();
    }

    a0 l(Fragment fragment) {
        a0 a0Var = this.f1067f.get(fragment.f977j);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        this.f1067f.put(fragment.f977j, a0Var2);
        return a0Var2;
    }

    boolean m() {
        return this.f1069h;
    }

    boolean n(Fragment fragment) {
        return this.f1065d.remove(fragment.f977j) != null;
    }

    boolean o(Fragment fragment) {
        if (this.f1065d.containsKey(fragment.f977j)) {
            return this.f1068g ? this.f1069h : !this.f1070i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1065d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1066e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1067f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}