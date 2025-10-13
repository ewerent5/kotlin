package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: InvalidationLiveDataContainer.java */
/* loaded from: classes.dex */
class h0 {
    final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final q0 f1840b;

    h0(q0 q0Var) {
        this.f1840b = q0Var;
    }

    <T> LiveData<T> a(String[] strArr, boolean z, Callable<T> callable) {
        return new v0(this.f1840b, this, z, callable, strArr);
    }

    void b(LiveData liveData) {
        this.a.add(liveData);
    }

    void c(LiveData liveData) {
        this.a.remove(liveData);
    }
}