package kotlinx.coroutines;

/* compiled from: EventLoop.kt */
/* loaded from: classes3.dex */
public final class e extends y0 {

    /* renamed from: k, reason: collision with root package name */
    private final Thread f16941k;

    public e(Thread thread) {
        this.f16941k = thread;
    }

    @Override // kotlinx.coroutines.z0
    protected Thread I0() {
        return this.f16941k;
    }
}