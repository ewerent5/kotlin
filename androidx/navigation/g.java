package androidx.navigation;

import androidx.lifecycle.a0;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: NavControllerViewModel.java */
/* loaded from: classes.dex */
class g extends x {

    /* renamed from: c, reason: collision with root package name */
    private static final z.a f1301c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<UUID, a0> f1302d = new HashMap<>();

    /* compiled from: NavControllerViewModel.java */
    class a implements z.a {
        a() {
        }

        @Override // androidx.lifecycle.z.a
        public <T extends x> T a(Class<T> cls) {
            return new g();
        }
    }

    g() {
    }

    static g g(a0 a0Var) {
        return (g) new z(a0Var, f1301c).a(g.class);
    }

    @Override // androidx.lifecycle.x
    protected void d() {
        Iterator<a0> it = this.f1302d.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f1302d.clear();
    }

    void f(UUID uuid) {
        a0 a0VarRemove = this.f1302d.remove(uuid);
        if (a0VarRemove != null) {
            a0VarRemove.a();
        }
    }

    a0 h(UUID uuid) {
        a0 a0Var = this.f1302d.get(uuid);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0();
        this.f1302d.put(uuid, a0Var2);
        return a0Var2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.f1302d.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}