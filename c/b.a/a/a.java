package c.b.a.a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class a extends c {
    private static volatile a a;

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f2621b = new ExecutorC0044a();

    /* renamed from: c, reason: collision with root package name */
    private static final Executor f2622c = new b();

    /* renamed from: d, reason: collision with root package name */
    private c f2623d;

    /* renamed from: e, reason: collision with root package name */
    private c f2624e;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: c.b.a.a.a$a, reason: collision with other inner class name */
    static class ExecutorC0044a implements Executor {
        ExecutorC0044a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    private a() {
        c.b.a.a.b bVar = new c.b.a.a.b();
        this.f2624e = bVar;
        this.f2623d = bVar;
    }

    public static Executor e() {
        return f2622c;
    }

    public static a f() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    @Override // c.b.a.a.c
    public void a(Runnable runnable) {
        this.f2623d.a(runnable);
    }

    @Override // c.b.a.a.c
    public boolean c() {
        return this.f2623d.c();
    }

    @Override // c.b.a.a.c
    public void d(Runnable runnable) {
        this.f2623d.d(runnable);
    }
}