package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public class w {
    private final l a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f1237b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private a f1238c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final l f1239e;

        /* renamed from: f, reason: collision with root package name */
        final g.b f1240f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1241g = false;

        a(l lVar, g.b bVar) {
            this.f1239e = lVar;
            this.f1240f = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1241g) {
                return;
            }
            this.f1239e.h(this.f1240f);
            this.f1241g = true;
        }
    }

    public w(k kVar) {
        this.a = new l(kVar);
    }

    private void f(g.b bVar) {
        a aVar = this.f1238c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, bVar);
        this.f1238c = aVar2;
        this.f1237b.postAtFrontOfQueue(aVar2);
    }

    public g a() {
        return this.a;
    }

    public void b() {
        f(g.b.ON_START);
    }

    public void c() {
        f(g.b.ON_CREATE);
    }

    public void d() {
        f(g.b.ON_STOP);
        f(g.b.ON_DESTROY);
    }

    public void e() {
        f(g.b.ON_START);
    }
}