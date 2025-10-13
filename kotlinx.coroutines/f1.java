package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
final class f1 extends e1 {

    /* renamed from: h, reason: collision with root package name */
    private final Executor f16943h;

    public f1(Executor executor) {
        this.f16943h = executor;
        j0();
    }

    @Override // kotlinx.coroutines.d1
    public Executor b0() {
        return this.f16943h;
    }
}