package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
final class s0 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    public final d0 f17096e;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f17096e.Z(i.v.h.f15852e, runnable);
    }

    public String toString() {
        return this.f17096e.toString();
    }
}