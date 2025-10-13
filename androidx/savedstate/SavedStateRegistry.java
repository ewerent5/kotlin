package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.savedstate.Recreator;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f2037b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2038c;

    /* renamed from: d, reason: collision with root package name */
    private Recreator.a f2039d;
    private c.b.a.b.b<String, b> a = new c.b.a.b.b<>();

    /* renamed from: e, reason: collision with root package name */
    boolean f2040e = true;

    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (!this.f2038c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2037b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f2037b.remove(str);
        if (this.f2037b.isEmpty()) {
            this.f2037b = null;
        }
        return bundle2;
    }

    void b(g gVar, Bundle bundle) {
        if (this.f2038c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f2037b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        gVar.a(new i() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.i
            public void c(k kVar, g.b bVar) {
                if (bVar == g.b.ON_START) {
                    SavedStateRegistry.this.f2040e = true;
                } else if (bVar == g.b.ON_STOP) {
                    SavedStateRegistry.this.f2040e = false;
                }
            }
        });
        this.f2038c = true;
    }

    void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f2037b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        c.b.a.b.b<String, b>.d dVarE = this.a.e();
        while (dVarE.hasNext()) {
            Map.Entry next = dVarE.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void d(String str, b bVar) {
        if (this.a.k(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e(Class<? extends a> cls) throws NoSuchMethodException, SecurityException {
        if (!this.f2040e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2039d == null) {
            this.f2039d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f2039d.b(cls.getName());
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}