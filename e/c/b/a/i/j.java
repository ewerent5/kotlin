package e.c.b.a.i;

import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes.dex */
public final class j implements e.c.b.a.i.t.a.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    private static final class a {
        private static final j a = new j();
    }

    public static j a() {
        return a.a;
    }

    public static Executor b() {
        return (Executor) e.c.b.a.i.t.a.d.c(i.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}