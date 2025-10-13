package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2094b;

    /* renamed from: c, reason: collision with root package name */
    private final q f2095c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2096d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2097e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2098f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2099g;

    /* compiled from: Configuration.java */
    public static final class a {
        Executor a;

        /* renamed from: b, reason: collision with root package name */
        q f2100b;

        /* renamed from: c, reason: collision with root package name */
        Executor f2101c;

        /* renamed from: d, reason: collision with root package name */
        int f2102d = 4;

        /* renamed from: e, reason: collision with root package name */
        int f2103e = 0;

        /* renamed from: f, reason: collision with root package name */
        int f2104f = Integer.MAX_VALUE;

        /* renamed from: g, reason: collision with root package name */
        int f2105g = 20;

        public b a() {
            return new b(this);
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public interface InterfaceC0033b {
        b a();
    }

    b(a aVar) {
        Executor executor = aVar.a;
        if (executor == null) {
            this.a = a();
        } else {
            this.a = executor;
        }
        Executor executor2 = aVar.f2101c;
        if (executor2 == null) {
            this.f2094b = a();
        } else {
            this.f2094b = executor2;
        }
        q qVar = aVar.f2100b;
        if (qVar == null) {
            this.f2095c = q.c();
        } else {
            this.f2095c = qVar;
        }
        this.f2096d = aVar.f2102d;
        this.f2097e = aVar.f2103e;
        this.f2098f = aVar.f2104f;
        this.f2099g = aVar.f2105g;
    }

    private Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public Executor b() {
        return this.a;
    }

    public int c() {
        return this.f2098f;
    }

    public int d() {
        return Build.VERSION.SDK_INT == 23 ? this.f2099g / 2 : this.f2099g;
    }

    public int e() {
        return this.f2097e;
    }

    public int f() {
        return this.f2096d;
    }

    public Executor g() {
        return this.f2094b;
    }

    public q h() {
        return this.f2095c;
    }
}