package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SavedStateHandleController implements i {

    /* renamed from: e, reason: collision with root package name */
    private final String f1192e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1193f = false;

    /* renamed from: g, reason: collision with root package name */
    private final v f1194g;

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.b bVar) throws NoSuchMethodException, SecurityException {
            if (!(bVar instanceof b0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            a0 a0VarD = ((b0) bVar).D();
            SavedStateRegistry savedStateRegistryI = bVar.I();
            Iterator<String> it = a0VarD.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.h(a0VarD.b(it.next()), savedStateRegistryI, bVar.i());
            }
            if (a0VarD.c().isEmpty()) {
                return;
            }
            savedStateRegistryI.e(a.class);
        }
    }

    SavedStateHandleController(String str, v vVar) {
        this.f1192e = str;
        this.f1194g = vVar;
    }

    static void h(x xVar, SavedStateRegistry savedStateRegistry, g gVar) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) xVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.l()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, gVar);
        m(savedStateRegistry, gVar);
    }

    static SavedStateHandleController j(SavedStateRegistry savedStateRegistry, g gVar, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, v.a(savedStateRegistry.a(str), bundle));
        savedStateHandleController.i(savedStateRegistry, gVar);
        m(savedStateRegistry, gVar);
        return savedStateHandleController;
    }

    private static void m(final SavedStateRegistry savedStateRegistry, final g gVar) throws NoSuchMethodException, SecurityException {
        g.c cVarB = gVar.b();
        if (cVarB == g.c.INITIALIZED || cVarB.a(g.c.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            gVar.a(new i() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.i
                public void c(k kVar, g.b bVar) throws NoSuchMethodException, SecurityException {
                    if (bVar == g.b.ON_START) {
                        gVar.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            this.f1193f = false;
            kVar.i().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, g gVar) {
        if (this.f1193f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1193f = true;
        gVar.a(this);
        savedStateRegistry.d(this.f1192e, this.f1194g.b());
    }

    v k() {
        return this.f1194g;
    }

    boolean l() {
        return this.f1193f;
    }
}