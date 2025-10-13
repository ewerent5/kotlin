package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import java.io.IOException;

/* compiled from: AbstractSavedStateViewModelFactory.java */
/* loaded from: classes.dex */
public abstract class a extends z.b {
    private final SavedStateRegistry a;

    /* renamed from: b, reason: collision with root package name */
    private final g f1198b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f1199c;

    public a(androidx.savedstate.b bVar, Bundle bundle) {
        this.a = bVar.I();
        this.f1198b = bVar.i();
        this.f1199c = bundle;
    }

    @Override // androidx.lifecycle.z.b, androidx.lifecycle.z.a
    public final <T extends x> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.z.c
    void b(x xVar) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController.h(xVar, this.a, this.f1198b);
    }

    @Override // androidx.lifecycle.z.b
    public final <T extends x> T c(String str, Class<T> cls) throws NoSuchMethodException, SecurityException, IOException {
        SavedStateHandleController savedStateHandleControllerJ = SavedStateHandleController.j(this.a, this.f1198b, str, this.f1199c);
        T t = (T) d(str, cls, savedStateHandleControllerJ.k());
        t.e("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerJ);
        return t;
    }

    protected abstract <T extends x> T d(String str, Class<T> cls, v vVar);
}