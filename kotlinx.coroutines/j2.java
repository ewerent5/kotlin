package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: b, reason: collision with root package name */
    public static final j2 f17004b = new j2();
    private static final ThreadLocal<x0> a = new ThreadLocal<>();

    private j2() {
    }

    public final x0 a() {
        return a.get();
    }

    public final x0 b() {
        ThreadLocal<x0> threadLocal = a;
        x0 x0Var = threadLocal.get();
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0VarA = a1.a();
        threadLocal.set(x0VarA);
        return x0VarA;
    }

    public final void c() {
        a.set(null);
    }

    public final void d(x0 x0Var) {
        a.set(x0Var);
    }
}