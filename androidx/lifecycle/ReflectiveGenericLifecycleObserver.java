package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: e, reason: collision with root package name */
    private final Object f1190e;

    /* renamed from: f, reason: collision with root package name */
    private final b.a f1191f;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1190e = obj;
        this.f1191f = b.a.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f1191f.a(kVar, bVar, this.f1190e);
    }
}