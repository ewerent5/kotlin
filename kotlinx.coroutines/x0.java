package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public abstract class x0 extends d0 {

    /* renamed from: f, reason: collision with root package name */
    private long f17178f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17179g;

    /* renamed from: h, reason: collision with root package name */
    private kotlinx.coroutines.internal.a<q0<?>> f17180h;

    public static /* synthetic */ void h0(x0 x0Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        x0Var.b0(z);
    }

    private final long j0(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void r0(x0 x0Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        x0Var.q0(z);
    }

    public long C0() {
        return !G0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean G0() {
        q0<?> q0VarD;
        kotlinx.coroutines.internal.a<q0<?>> aVar = this.f17180h;
        if (aVar == null || (q0VarD = aVar.d()) == null) {
            return false;
        }
        q0VarD.run();
        return true;
    }

    public boolean H0() {
        return false;
    }

    public final void b0(boolean z) {
        long jJ0 = this.f17178f - j0(z);
        this.f17178f = jJ0;
        if (jJ0 > 0) {
            return;
        }
        if (m0.a()) {
            if (!(this.f17178f == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f17179g) {
            shutdown();
        }
    }

    public final void k0(q0<?> q0Var) {
        kotlinx.coroutines.internal.a<q0<?>> aVar = this.f17180h;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f17180h = aVar;
        }
        aVar.a(q0Var);
    }

    protected long l0() {
        kotlinx.coroutines.internal.a<q0<?>> aVar = this.f17180h;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void q0(boolean z) {
        this.f17178f += j0(z);
        if (z) {
            return;
        }
        this.f17179g = true;
    }

    protected void shutdown() {
    }

    public final boolean v0() {
        return this.f17178f >= j0(true);
    }

    public final boolean y0() {
        kotlinx.coroutines.internal.a<q0<?>> aVar = this.f17180h;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }
}