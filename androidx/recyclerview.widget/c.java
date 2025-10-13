package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes.dex */
public final class c<T> {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f1643b;

    /* renamed from: c, reason: collision with root package name */
    private final h.d<T> f1644c;

    /* compiled from: AsyncDifferConfig.java */
    public static final class a<T> {
        private static final Object a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static Executor f1645b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f1646c;

        /* renamed from: d, reason: collision with root package name */
        private Executor f1647d;

        /* renamed from: e, reason: collision with root package name */
        private final h.d<T> f1648e;

        public a(h.d<T> dVar) {
            this.f1648e = dVar;
        }

        public c<T> a() {
            if (this.f1647d == null) {
                synchronized (a) {
                    if (f1645b == null) {
                        f1645b = Executors.newFixedThreadPool(2);
                    }
                }
                this.f1647d = f1645b;
            }
            return new c<>(this.f1646c, this.f1647d, this.f1648e);
        }
    }

    c(Executor executor, Executor executor2, h.d<T> dVar) {
        this.a = executor;
        this.f1643b = executor2;
        this.f1644c = dVar;
    }

    public Executor a() {
        return this.f1643b;
    }

    public h.d<T> b() {
        return this.f1644c;
    }

    public Executor c() {
        return this.a;
    }
}